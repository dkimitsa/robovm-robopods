#!/usr/bin/env kotlinc -jvm-target 9 -script --

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Element
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration
import kotlin.system.exitProcess


/// get list of all pom.xml in subdirectories
println("Scanning project for modules:")
val aggregatorDir = File(".")
val artifacts = aggregatorDir.walkTopDown()
    .filter { it.isFile && it.name == "pom.xml" }
    .map { pom -> parsePom(aggregatorDir, pom)
        .also { println("  found ${it.id}") }
    }
    .sortedBy { it.moduleDir }
    .toList()


println()
println("Checking deployment status on Maven central/sonatype:")
/// check published status for artifacts and their dependencies (looking for pom at central/sonatype)
/// only local available artifacts are considered
val publishedStatus = runBlocking {
    artifacts.map { artifact ->
        async(Dispatchers.IO) {
            val status = isPublishedToRemote(artifact.id)
            val s = if (status == true) "[published]" else if (status == false) "[ missing ]" else "[ unknown ]"
            println("   $s ${artifact.id}")
            artifact.id to status
        }
    }.awaitAll().toMap()
}

println()
println("Validating...")

/// can't continue if failed to resolve artifact status
publishedStatus.entries.mapNotNull { if (it.value == null) it.key else null }.takeIf { it.isNotEmpty() }
    ?.also { unknownStatuses ->
        println("Error, can continue as following artifact deploy status is unknown:")
        unknownStatuses.forEach { println("   $it") }
        exitProcess(-1)
    }

/// make list of artifacts to include in destination pom:
/// - all snapshots (pushed always)
/// - release one that is not available yet on maven central (to be pushed there)
val artifactsToPublish = artifacts.filter { it.id.isSnapshot || publishedStatus[it.id] == false }

// can't afford to have both snapshots and unpublished release version same time
val snapshotCount = artifactsToPublish.count { it.id.isSnapshot }
if (snapshotCount > 0 && snapshotCount != artifactsToPublish.size) {
    println("Unpublished list contains both release and snapshot version ! only single type is allowed:")
    artifactsToPublish.forEach { println("    ${it.id}") }
}

// validation complete
println()
println("Artifacts to be deployed:")
artifactsToPublish.forEach { println("  ${it.id}") }

// update working pom
// read existing pom-dev.xml
var modulesStarted = false
var modulesEnded = false
var resultPom = mutableListOf<String>()
File("pom-dev.xml").forEachLine { line ->
    when {
        !modulesStarted -> {
            resultPom.add(line)
            if (line.contains("<modules>")) {
                // drop all artifact locations to be included
                artifactsToPublish.forEach { resultPom.add("        <module>${it.moduleDir}</module>") }
                modulesStarted = true
            }
        }
        !modulesEnded -> {
            // skipping old modules
            if (line.contains("</modules>")) {
                resultPom.add(line)
                modulesEnded = true
            }
        }
        else -> resultPom.add(line)
    }
}

// write back
File("pom-dev.xml").writeText(resultPom.joinToString(System.lineSeparator()))

// DONE!
println()
println("done, use following for deploy !")
println("mvn -T 10 -f pom-dev.xml install deploy")
exitProcess(0)

/// finds child element by tag and returns its text
fun Element.getChildText(tag: String): String? {
    val children = childNodes
    for (i in 0 until children.length) {
        val node = children.item(i)
        if (node is Element && node.tagName == tag) {
            return node.textContent
                ?.trim()
                ?.takeIf { it.isNotEmpty() }
        }
    }
    return null
}


data class Artifact(val id: Id, val moduleDir: String ) {
    data class Id(val groupId: String, val id: String, val version: String) {
        override fun toString(): String = "$groupId:$id:$version"
        val isSnapshot: Boolean get() = version.endsWith("-SNAPSHOT")
    }
}

fun parseId(project: Element, parent: Element?): Artifact.Id {
    val groupId = project.getChildText("groupId") ?: parent?.getChildText("groupId") ?: throw IllegalStateException("groupId missing")
    val version = project.getChildText("version") ?: parent?.getChildText("version") ?: throw IllegalStateException("version missing")
    val id = project.getChildText("artifactId") ?: throw IllegalStateException("artifactId missing")
    return Artifact.Id(groupId = groupId, id = id, version = version)
}

fun parsePom(aggregatorDir: File, pom: File): Artifact {
    val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pom)
    val project = doc.documentElement
    val parent = project.getElementsByTagName("parent").item(0) as? Element
    val artifactId = parseId(project, parent)
    val moduleDir = pom.parentFile.relativeTo(aggregatorDir).invariantSeparatorsPath

    return Artifact(artifactId, moduleDir)
}

/// checks if artifact is published at repositories, return null if unable to get status
fun isPublishedToRemote(artifactId: Artifact.Id): Boolean? {
    fun Artifact.Id.toArtifactUrl(prefix: String) = prefix + "${groupId.replace('.', '/')}/$id/$version/$id-$version.pom"
    val url = if (artifactId.isSnapshot) artifactId.toArtifactUrl("https://central.sonatype.com/repository/maven-snapshots/")
        else artifactId.toArtifactUrl("https://repo1.maven.org/maven2/")

    val httpClient: HttpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(5))
        .followRedirects(HttpClient.Redirect.NORMAL)
        .build()
    val request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .timeout(Duration.ofSeconds(5))
        .method("HEAD", HttpRequest.BodyPublishers.noBody())
        .build()

    val status = try {
        val response = httpClient.send(request, HttpResponse.BodyHandlers.discarding())
        when (response.statusCode()) {
            200 -> true
            404 -> false
            else -> {
                println("Unexpected ${response.statusCode()} for $url")
                null
            }
        }
    } catch (ex: Exception) {
        println("Request failed for: $artifactId -> ${ex.message}")
        null
    }

    return status
}