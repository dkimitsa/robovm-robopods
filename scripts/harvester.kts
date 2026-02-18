#!/usr/bin/env kotlinc -jvm-target 9 -script --
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import java.io.InputStream
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.concurrent.thread
import kotlin.system.exitProcess

/**
 * Script to automate steps required to bind libraries:
 * - deletes old header files
 * - deletes old java bindings
 * - fetches version information and updates maven pom.xml files
 * - automatically performs bindings

 * important: to be run in robovm-robopods folder
 *
 * @author dkimitsa
 */

// single point for logs
val log = Log()

// readme file (also used as lock)
val readmeFile: File = Path.of("README.md").toFile().also {
    it.requiresIsFile { "Failed to locate ${it.canonicalPath}" }
}

// robovm-bro-gen project expected next to robovm-robopods
val broGenScript: File = Path.of("../robovm-bro-gen/bro-gen.rb").toFile().also {
    it.requiresCanExecute { "Failed to locate bro-gen script at ${it.canonicalPath}" }
    log.i("bro-gen found at ${it.canonicalPath}")
}

// Download root folder
val downloadFolder: File = Path.of(System.getProperty("user.home"), "Downloads").toFile().also {
    it.requiresIsDirectory { "Failed to locate Download directory ${it.canonicalPath}" }
}

// maps group to list of frameworks
val knownGroups = mutableMapOf<String, MutableList<String>>()

// list of known frameworks and ways to process it
val knownFrameworks = mutableMapOf<String, (String) -> Unit>(
    "AppLovinSDK" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = Path.of("applovinsdk/cocoapods/AppLovinSDK.xcframework/ios-arm64/AppLovinSDK.framework").toFile()
        processFramework(
            artifact = artifact,
            moduleFolder = "applovinsdk",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "applovinsdk.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                0. run applovinsdk/cocoatouch/fetch.sh to fetch and build from cocotouch 
                1. expected location $artifactLocation 
            """.trimIndent()
        )
    },
    "WindowsAzureMessaging" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("WindowsAzureMessaging-SDK-Apple/iOS/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "azure/ios-notification-hubs",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "azure-windows-messaging.yaml",
            version = { azureVersionFromReadme(downloadFolder.extend("WindowsAzureMessaging-SDK-Apple/README.md")) },
            instruction = """
                1. Download recent version of WindowsAzureMessaging-SDK-Apple-X.Y.Z.zip from https://github.com/Azure/azure-notificationhubs-ios/releases
                2. unpack 
                3. expected location ${downloadFolder.extend("WindowsAzureMessaging-SDK-Apple")} 
            """.trimIndent()
        )
    },
    "BranchSDK" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("BranchSDK.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "branchmetrics/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "branchmetrics.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. Download recent Branch.zip from https://github.com/BranchMetrics/ios-branch-deep-linking-attribution/releases
                2. Unpack
                3. expected location ${downloadFolder.extend("BranchSDK.xcframework")} 
            """.trimIndent()
        )
    },
    "DGCharts" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = Path.of("charts/carthage/DGCharts.xcframework/ios-arm64/$artifact").toFile()
        processFramework(
            artifact = artifact,
            moduleFolder = "charts/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "charts.yaml",
            version = {
                Path.of("charts/carthage/Cartfile.resolved").toFile().readLines()
                    .find { it.startsWith("github") }
                    ?.substringAfterLast("\"danielgindi/Charts\"")
                    ?.replace("v", "")?.replace("\"", "")?.trim()
                    ?: error("Failed to find out Charts version!")
            },
            instruction = """
                0. run charts/carthage/fetch.sh to fetch and build from carthage 
                1. expected location $artifactLocation 
            """.trimIndent()
        )
    },
    "HelpshiftX" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("helpshiftx-sdk-ios/HelpshiftX.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "helpshift/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "helpshift.yaml",
            version = {
                downloadFolder.extend("helpshiftx-sdk-ios").list()
                    ?.find { it.startsWith("Release") && it.endsWith(".txt") }
                    ?.let { it.substringAfter('-').substringBeforeLast('.') }
                    ?: error("Failed to find out Helpshift version!")
            },
            instruction = """
                1. download iOS SDK from https://developers.helpshift.com/sdkx_ios/getting-started/#getting-sdk
                2. unpack helpshift-sdk-ios-vX.Y.Z.zip
                3. Rename to ${downloadFolder.extend("helpshift-sdk-ios")} 
            """.trimIndent()
        )
    },
    "InMobiSDK" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("InMobi-iOS-SDK/InMobiSDK.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "inmobi",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "inmobi-sdk.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. Download iOS sdk (for manual integration) from https://www.inmobi.com/sdk
                2. Unpack
                3. expected location ${downloadFolder.extend("InMobi-iOS-SDK/")}
            """.trimIndent()
        )
    },
    "Lottie" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("Lottie.xcframework/ios-arm64//$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "lottie/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "lottie.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. goto https://github.com/airbnb/lottie-ios/releases and download latest Lottie.xcframework.zip
                2. unpack 
                3. expected location ${downloadFolder.extend("Lottie.xcframework/ios-arm64/")}
            """.trimIndent()
        )
    },
    "OneSignal" to { framework ->
        val artifact = "$framework.framework"
        val versionFile: String by lazy {
            downloadFolder.extend("OneSignalFramework.xcframework/version").readText()
        }
        val internalFrameworks = arrayOf("OneSignalFramework", "OneSignalCore", "OneSignalOSCore",
            "OneSignalExtension", "OneSignalLocation", "OneSignalNotifications", "OneSignalInAppMessages",
            "OneSignalOutcomes", "OneSignalUser" )
        processFramework(
            artifact = artifact,
            moduleFolder = "onesignal/ios",
            sourceHeadersDir = downloadFolder,
            destinationHeadersDir = Path.of("onesignal", "ios", "src", "main", "bro-gen").toFile(),
            yaml = "onesignal.yaml",
            headerFolderCleaner = { frm, dst ->
                internalFrameworks.forEach {
                    cleanUpHeaders(frm, dst.extend("$it.framework"))
                }
            },
            headersCopier = { _, src, dst ->
                internalFrameworks.forEach {
                    copyHeaders("$it.framework",
                        src.extend("$it.xcframework/ios-arm64/$it.framework/Headers"),
                        dst.extend("$it.framework/Headers"))
                }
            } ,
            interactiveValidateHeaderFolder = { _, src, instruction, optional ->
                internalFrameworks.forEach {
                    interactiveValidateHeaderFolder("$it.framework",
                        src.extend("$it.xcframework/ios-arm64/$it.framework/Headers"),
                        instruction, optional)
                }
            },
            version = { versionFile },
            instruction = run {
                """
                - Download frameworks:
                
                """.trimIndent() +
                internalFrameworks.map {
                    """
                    - Download $it.xcframework.zip from https://github.com/OneSignal/OneSignal-iOS-SDK/releases
                    - Unpack, expected location  ${downloadFolder.extend("$it.xcframework")}                        
                    """.trimIndent()
                }.joinToString("\n")+
                """
                
                - create a file ${downloadFolder.extend("OneSignalFramework.xcframework/version")} and put verions there, e.g. 4.0.0
                """.trimIndent()
            }
        )
    },
    "Pollfish" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("Pollfish-iOS-SDK/Pollfish.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "pollfish/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "pollfish.yaml",
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeaders(frm, sourceHeadersDir, destinationHeadersDir)
                // after copied include Pollfish/Pollfish-Swift.h to Pollfish.h
                File(
                    destinationHeadersDir,
                    "Pollfish.h"
                ).appendText("\n#include <TargetConditionals.h>\n#import <UIKit/UIKit.h>\n#import <Pollfish/Pollfish-Swift.h>")
            },
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. download iOS sdk from https://www.pollfish.com/docs/ios
                2. unpack and rename to ${downloadFolder.extend("Pollfish-iOS-SDK")}
            """.trimIndent()
        )
    },
    "IASDKCore" to { framework ->
        val artifactLocation = downloadFolder.extend("InneractiveAdSDK-iOS-master/$framework/$framework.xcframework/ios-arm64/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "fyber/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "iasdk-core.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. download and unpack https://github.com/inner-active/InneractiveAdSDK-iOS/archive/refs/heads/master.zip
                2. unpack, expected location ${downloadFolder.extend("InneractiveAdSDK-iOS-master")}
            """.trimIndent()
        )
    },
    "UnityAds" to { framework ->
        val unityVersion: String by lazy {
            downloadFolder.extend("UnityAds/version/").readText()
        }
        val artifactLocation = downloadFolder.extend("UnityAds/$framework.xcframework/ios-arm64/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "unityads/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "unityads.yaml",
            version = { unityVersion },
            instruction = """
                1. download and unpack UnityAds.zip from https://github.com/Unity-Technologies/unity-ads-ios/releases
                2. unpack, expected location ${downloadFolder.extend("UnityAds")}
                3. create a file ${downloadFolder.extend("UnityAds/version")} and put verions there, e.g. 4.0.0 
            """.trimIndent()
        )
    },
    "YouTubeiOSPlayerHelper" to { framework ->
        val artifactLocation = downloadFolder.extend("$framework/Carthage/Build/$framework.xcframework/ios-arm64_armv7/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "youtube/ios-player-helper",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "youtube-player-helper.yaml",
            version = {
                downloadFolder.extend("$framework/Cartfile").readLines()
                    .find { it.startsWith("github") }
                    ?.let { it.substringAfterLast("==").trim() }
                    ?: error("Failed to find out version!")
            },
            instruction = """
                0. check latest version number at https://github.com/youtube/youtube-ios-player-helper
                1. get binaries using Carthage, (put proper version instead of X.Y.Z) run in ~/Downloads/YouTubeiOSPlayerHelper
                  > echo 'github "youtube/youtube-ios-player-helper" == X.Y.Z' > Cartfile
                  > carthage update --platform ios --use-xcframeworks
            """.trimIndent()
        )
    },
    "Singular" to { framework ->
        val artifactLocation = downloadFolder.extend("Singular.xcframework/ios-arm64/Singular.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "singular/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "singular.yaml",
            version = { artifactLocation.infoPlist.extractVersion(versionKey = "CFBundleVersion") },
            instruction = """
                0. download latest version from https://support.singular.net/hc/en-us/articles/12054824479387
                1. unpack, expected location ${downloadFolder.extend("Singular.xcframework")}
            """.trimIndent()
        )
    },
    "IronSource" to { framework ->
        val artifactLocation = downloadFolder.extend("IronSource/IronSource.xcframework/ios-arm64/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "ironsource/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "ironsource.yaml",
            version = {
                artifactLocation.headers.extend("IronSource.h").readLines()
                .find{ it.contains("MEDIATION_SDK_VERSION") }
                ?.substringAfterLast("@\"")?.substringBefore("\"")
                ?: error("Filed to evaluate $framework version")
            },
            instruction = """
                0. download latest version from https://developers.is.com/ironsource-mobile/ios/ios-sdk/#step-1
                1. unpack
                2. expected location $artifactLocation
            """.trimIndent(),
        )
    },
    "Adapty" to { framework ->
        val artifactLocation = Path.of("adapty/cocoapods/Adapty.framework").toFile()
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "adapty/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "adapty.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeaders(frm, sourceHeadersDir, destinationHeadersDir)
                File(destinationHeadersDir, "Adapty.h").appendText(
                    """
                    #import <Foundation/Foundation.h>
                    #include <TargetConditionals.h>
                    #import <UIKit/UIKit.h>
                    #import <AppTrackingTransparency/AppTrackingTransparency.h>
                    #import <WebKit/WebKit.h>
                    #import <Adapty/Adapty-Swift.h>
                """.trimIndent()
                )
            },
            instruction = """
                0. run adapty/cocoatouch/fetch.sh to fetch and build from cocotouch 
                1. expected location $artifactLocation
            """.trimIndent(),
        )
    },
    "TenjinSDK" to { framework ->
        val artifactLocation = downloadFolder.extend("TenjinSDK.xcframework/ios-arm64_armv7/$framework.framework")
        val tenjinvVersion: String by lazy {
            artifactLocation.extend("PrivateHeaders/TenjinConst.h").readLines()
                .find{ it.contains(" kTenjinTenjinSDKVersion ") }
                ?.substringAfterLast("@\"")?.substringBefore("\"")
                ?: error("Filed to evaluate $framework version")
        }
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "tenjin/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "tenjin.yaml",
            version = { tenjinvVersion },
            headersCopier = { _, _, dst ->
                copyHeaders("$framework.framework",
                    artifactLocation.extend("Headers"),
                    dst)
                copyHeaders("$framework.framework",
                    artifactLocation.extend("PrivateHeaders"),
                    dst,
                    intoExisting = true)
            } ,
            instruction = """
                0. download latest version from https://github.com/tenjin/tenjin-ios-sdk/releases
                1. unpack and rename to ${downloadFolder.extend("tenjin-ios-sdk")}
                1. expected location $artifactLocation
            """.trimIndent()
        )
    },
    "CleverAdsSolutions" to { framework ->
        val artifactLocation = downloadFolder.extend("CleverAdsSolutions/CleverAdsSolutions.xcframework/ios-arm64/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "cleverads/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "cleverads.yaml",
            version = {
                artifactLocation.headers.extend("CleverAdsSolutions.h").readLines()
                    .find{ it.contains("CAS_FRAMEWORK_VERSION") }
                    ?.substringAfterLast("@\"")?.substringBefore("\"")
                    ?: error("Filed to evaluate $framework version")
            },
            instruction = """
                0. download latest CleverAdsSolutions-x.x.x.x.zip from https://github.com/cleveradssolutions/CAS-iOS/releases/
                1. unpack
                2. rename to CleverAdsSolutions
                2. expected location $artifactLocation
            """.trimIndent(),
        )
    },
    "AppsFlyerLib" to { framework ->
        val artifactLocation = downloadFolder.extend("AppsFlyerLib.xcframework/ios-arm64/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "appsflyer/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "appsflyer.yaml",
            version = { artifactLocation.infoPlist.extractVersion(versionKey = "CFBundleVersion") },
            instruction = """
                0. download latest AppsFlyerLib.xcframework.zip from  https://github.com/AppsFlyerSDK/AppsFlyerFramework/releases
                1. unpack
                2. expected location $artifactLocation
            """.trimIndent(),
        )
    },
).also {
    registerAppCenter(it, knownGroups)
    registerFirebase(it, knownGroups)
    registerFacebook(it, knownGroups)
    registerMobileAds(it, knownGroups)
}


// parse arguments
var parallelBuild = false
var interactive = false
var downloadInstructions = false
val frameworkToProcess = mutableListOf<String>()
args.forEach { arg ->
    if (arg.startsWith("-")) {
        when (arg) {
            "-v" -> log.verbose = true
            "-p" -> parallelBuild = true
            "-i" -> interactive = true
            "-d" -> {
                downloadInstructions = true; interactive = true
            }
            "-h" -> printHelpAndExit(0)
            "--help" -> printHelpAndExit(0)
            else -> {
                println("Error: unknown argument $arg")
                printHelpAndExit(-1)
            }
        }
    } else {
        if (knownFrameworks.keys.contains(arg)) {
            frameworkToProcess.add(arg)
        } else knownGroups[arg]?.let {
            frameworkToProcess.addAll(it)
        } ?: run {
            println("Error: unknown framework or group $arg")
            printHelpAndExit(-1)
        }
    }
}

if (frameworkToProcess.isEmpty()) {
    if (downloadInstructions) {
        frameworkToProcess.addAll(knownFrameworks.keys)
    } else {
        println("Error: not specified framework to process !")
        printHelpAndExit(-1)
    }
}

if (interactive && parallelBuild) {
    println("Error: interactive can't be used with parallel build!")
    printHelpAndExit(-1)
}

frameworkToProcess.run { if (parallelBuild && size > 1) parallelStream() else stream() }
    .forEach { framework -> knownFrameworks[framework]?.invoke(framework) }

println("bye-bye")

fun printHelpAndExit(code: Int) {
    println("usage:")
    println("scripts/harvester.kts [--help] [-v] [-p] [framework1 framework2 ...]")
    println("   --help, -h : prints this help and exits")
    println("           -v : enables verbose output")
    println("           -p : enables parallel processing")
    println("           -i : interactive mode, will check for existing folder and wait for it")
    println("           -d : interactive mode, will print download instructions and wait for frameworks")
    println("   frameworkX : list of frameworks to process. if not specified all frameworks will be processed")
    println("Known frameworks:")
    knownFrameworks.keys.sorted().forEach { println("    $it") }
    println("Known groups:")
    knownGroups.keys.sorted().forEach { group ->
        println("    $group:")
        knownGroups[group]?.forEach { println("        $it") }
    }
    exitProcess(code)
}


fun processInternal(
    framework: String,
    versionProvider: () -> String,
    moduleFolder: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File,
    javaFolder: File,
    yamlFile: File,
    pomFile: File,
    instruction: String?,
    interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit,
    headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit,
    headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit,
    javaFolderCleaner: (framework: String, destinationJavaDir: File) -> Unit,
    broGenExecutor: (framework: String, javaFolder: File, yamlFile: File) -> Unit,
    pomVersionStringUpdater: (framework: String, pomFile: File, version: String, pomVersion: String) -> Unit,
    readmeFileVersionUpdater: (framework: String, moduleFolder: String, version: String) -> Unit
) {
    if (interactive) {
        if (downloadInstructions) {
            // extract version from the pom file
            val version = getPomVersionString(framework, pomFile)
            println("$framework: current version $version")
        }
        interactiveValidateHeaderFolder(framework, sourceHeadersDir, instruction, downloadInstructions)
        if (downloadInstructions)
            return
    }

    val version = versionProvider()
    val pomVersion = version + ".0"
    log.d("$framework: version $version")
    headerFolderCleaner(framework, destinationHeadersDir)
    headersCopier(framework, sourceHeadersDir, destinationHeadersDir)
    javaFolderCleaner(framework, javaFolder)
    broGenExecutor(framework, javaFolder, yamlFile)
    pomVersionStringUpdater(framework, pomFile, version, pomVersion)
    readmeFileVersionUpdater(framework, moduleFolder, version)
}


fun cleanUpHeaders(framework: String, destinationHeadersDir: File) {
    // remove destination headers folder
    if (destinationHeadersDir.exists()) {
        log.i("$framework:  Removing existing headers @${destinationHeadersDir.canonicalPath}")
        destinationHeadersDir.requiresDeleteRecursively()
    }
}

fun cleanUpJava(framework: String, destinationJavaDir: File) {
    // remove destination headers folder
    if (destinationJavaDir.exists()) {
        log.i("$framework:  Removing existing Java folder @${destinationJavaDir.canonicalPath}")
        destinationJavaDir.requiresDeleteRecursively()
    }
}

fun interactiveValidateHeaderFolder(framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean = true) {
    val text = instruction
        ?: "There is no instruction configured for $framework.\nPlease provide missing framework at path specified."
    while (!sourceHeadersDir.isDirectory) {
        println("\n\nMissing source header for $framework at location:\n${sourceHeadersDir.canonicalPath}")
        println("")
        println(text)
        if (optional) {
            println("\n\nEnter Y to retry, ENTER to skip")
            val line = readLine()?.uppercase()
            if (line != "Y")
                break
        } else {
            println("\n\nPress ENTER key once solved")
            readLine()
        }
    }
}

fun copyHeaders(framework: String, sourceHeadersDir: File, destinationHeadersDir: File) {
    copyHeaders(framework, sourceHeadersDir, destinationHeadersDir, false)
}

fun copyHeaders(framework: String, sourceHeadersDir: File, destinationHeadersDir: File, intoExisting: Boolean) {
    // check if source folder exists
    sourceHeadersDir.requiresIsDirectory { "Missing header folder for $framework at ${sourceHeadersDir.canonicalPath}" }

    // copy new headers
    destinationHeadersDir.requireMkdirs(skipIfExist = intoExisting)
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destinationHeadersDir.canonicalPath}")
    sourceHeadersDir.copyRecursively(destinationHeadersDir)
}


fun copyHeadersFiltered(
    framework: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File,
    flatten: Boolean = false,
    filter: (Path) -> Boolean = { true }
) {
    // check if source folder exists
    sourceHeadersDir.requiresIsDirectory { "Missing header folder for $framework at ${sourceHeadersDir.canonicalPath}" }

    // copy new headers
    destinationHeadersDir.requireMkdirs()
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destinationHeadersDir.canonicalPath}")

    val sourcePath = sourceHeadersDir.toPath()
    val destinationPath = destinationHeadersDir.toPath()
    Files.walk(sourcePath).forEach { source ->
        if (filter(source)) {
            val dest = destinationPath.resolve(if (flatten) source.fileName else sourcePath.relativize(source))
            dest.toFile().requireMkdirs()
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING)
        }
    }
}


fun execBroGen(framework: String, javaFolder: File, yamlFile: File) {
    // check if yaml file exists
    yamlFile.requiresIsFile { "$framework is missing yaml-file ${yamlFile.canonicalPath}" }

    // generating binding
    val broGenCmd = "${broGenScript.canonicalPath} ${javaFolder.canonicalPath} ${yamlFile.canonicalPath}"
    log.i("$framework:  Invoking bro-gen with command: $broGenCmd")
    exec("$framework:    ", broGenCmd)
}

fun getPomVersionString(framework: String, pomFile: File): String? {
    pomFile.requiresIsFile { "$framework is missing pom.xml ${pomFile.canonicalPath}" }
    val artifactTitleWithVersion = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
        .getElementByTagName("name")?.getTextValue()
        ?: error("Failed to get <name> from ${pomFile.canonicalPath}")
    return artifactTitleWithVersion.indexOf("iOS v").takeIf { it > 0 }
        ?.let { artifactTitleWithVersion.substring(it + 5).trim() }
        ?: error("'iOS v' is missing in artifact <name> in ${pomFile.canonicalPath}")
}

fun updatePomVersionString(framework: String, pomFile: File, version: String, pomVersion: String) {
    // updating version string in pom file
    pomFile.requiresIsFile { "$framework is missing pom.xml ${pomFile.canonicalPath}" }
    val document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
    val artifactTitleWithVersion = document.getElementByTagName("name")?.getTextValue()
        ?: error("Failed to get <name> from ${pomFile.canonicalPath}")
    val artifactVersion = document.getElementByTagName("version")?.getTextValue()
        ?: error("Failed to get <version> from ${pomFile.canonicalPath}")
    val artifactTitle =
        artifactTitleWithVersion.indexOf("iOS v").takeIf { it > 0 }
            ?.let { artifactTitleWithVersion.substring(0, it).trim() }
            ?: error("'iOS v' is missing in artifact <name> in ${pomFile.canonicalPath}")

    // updating the version in module POM file
    val newTitle = "$artifactTitle iOS v${version}"
    log.i("$framework:  Replacing <name> from: $artifactTitleWithVersion")
    log.i("$framework:                   with: $newTitle")
    log.i("$framework:  Updating <version> to: $pomVersion")
    pomFile.readText()
        .replaceFirst(artifactTitleWithVersion, newTitle)
        .replaceFirst("<version>$artifactVersion</version>", "<version>$pomVersion</version>")
        .run { pomFile.writeText(this) }
}


fun updateRootAndModuleReadmeFileVersionString(framework: String, moduleFolder: String, version: String) {
    updateRootReadmeFileVersionString(framework, moduleFolder, version)
    updateModuleReadmeFileVersionString(framework, File("$moduleFolder/README.md"), version, "$version.0")
}

/// updates README.md in root of repo (contains list of all pods)
fun updateRootReadmeFileVersionString(framework: String, moduleFolder: String, version: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        var versionLineFound = false
        val readmeModuleName = moduleFolder.substringBefore('/')
        readmeFile.readLines().map { line ->
            if (!versionLineFound)
                versionLineFound = line.startsWith("## Version of AltPods")
            if (versionLineFound && replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 4 && cols[1].contains("($readmeModuleName/)")) {
                    cols[2] = " $version".padEnd(cols[2].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement!!
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($readmeModuleName/) is not found in ${readmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            readmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }
}

/// updates aggregated readme file, table that contain module link, updates its version
/// looks for table and looks for `(ios-analytics/)` substring and replaces version there (used for firebase aggregated readme file for ex)
/// example:
/// | [ios-analytics](ios-analytics/) | Firebase iOS Analytics  | 12.9.0  |
fun updateAggregatedReadmeFileVersionString(framework: String, moduleReadmeFile: File, moduleFolder: String, version: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        val readmeModuleName = File(moduleFolder).name
        moduleReadmeFile.requiresIsFile { "$framework is missing ${moduleReadmeFile.canonicalPath}" }
        moduleReadmeFile.readLines().map { line ->
            if (replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 5 && cols[1].contains("($readmeModuleName/)")) {
                    cols[3] = " $version".padEnd(cols[3].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($readmeModuleName/) is not found in ${moduleReadmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            moduleReadmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }
}

/// updates aggregated readme file, table that contain module link, updates its version in table,
/// looks for following table:
/// | RoboPods Version | Google SignIn  |
/// |------------------|----------------|
/// | 9.1.0.0          | 9.1.0          |
///
/// and updates first line: if framework version is same, replace robopod version, otherwise inserts new line on top of table
fun updateModuleReadmeFileVersionString(framework: String, moduleReadmeFile: File, version: String, podVersion: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        moduleReadmeFile.requiresIsFile { "$framework is missing ${moduleReadmeFile.canonicalPath}" }
        var versionLineDetected = 0
        val resultLines = mutableListOf<String>()
        moduleReadmeFile.readLines().map { line ->
            when {
                line.contains("RoboPods Version") -> {
                    versionLineDetected = 1
                    resultLines.add(line)
                }
                versionLineDetected == 1 -> {
                    versionLineDetected = if (line.contains("---")) 2 else 0
                    resultLines.add(line)
                }
                versionLineDetected == 2 -> {
                    versionLineDetected = 3 // end of story
                    val cols = line.split("|").toMutableList()
                    if (cols.size == 4) {
                        // first version line, insert new or update existing
                        original = cols[1].trim()
                        replacement = podVersion
                        val sdkVersion = cols[2].trim()

                        cols[1] = " $podVersion".padEnd(cols[1].length)
                        cols[2] = " $version".padEnd(cols[2].length)
                        resultLines.add(cols.joinToString("|"))
                        if (sdkVersion != version) {
                            // version changed, adding on top
                            resultLines.add(line)
                        }
                    } else resultLines.add(line)
                }
                else -> resultLines.add(line)
            }
        }

        if (replacement == null || original == null)
            error("$framework version entry is not found in ${moduleReadmeFile.canonicalPath}")
        log.i("$framework:  Replacing README.md version from: $original")
        log.i("$framework:                                to: $replacement")
        moduleReadmeFile.writeText(resultLines.joinToString(System.lineSeparator()))
    }
}

// common framework processing code
fun processFramework(
    artifact: String,
    moduleFolder: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File? = null,
    yaml: String,
    version: () -> String,
    instruction: String? = null,
    interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit = ::interactiveValidateHeaderFolder,
    headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit = ::cleanUpHeaders,
    headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit = ::copyHeaders,
    broGenExecutor: (framework: String, javaFolder: File, yamlFile: File) -> Unit = ::execBroGen,
    javaFolderCleaner: (framework: String, destinationJavaDir: File) -> Unit = ::cleanUpJava,
    pomVersionStringUpdater: (framework: String, pomFile: File, version: String, pomVersion: String) -> Unit = ::updatePomVersionString,
    readmeFileVersionUpdater: (framework: String, moduleFolder: String, version: String) -> Unit = ::updateRootAndModuleReadmeFileVersionString,
) {
    log.d("$artifact:  <<<< starting processing")

    // check if source folder exists
    val resolvedDestinationHeadersDir =
        destinationHeadersDir ?: Path.of(moduleFolder, "src", "main", "bro-gen", artifact, "Headers").toFile()
    val javaFolder = Path.of(moduleFolder, "src", "main", "java").toFile()
    val yamlFile = Path.of(moduleFolder, "src", "main", "bro-gen", yaml).toFile()
    val pomFile = Path.of(moduleFolder, "pom.xml").toFile()

    // default processing
    processInternal(
        artifact, version, moduleFolder, sourceHeadersDir, resolvedDestinationHeadersDir, javaFolder, yamlFile, pomFile,
        instruction = instruction,
        interactiveValidateHeaderFolder = interactiveValidateHeaderFolder,
        headerFolderCleaner = headerFolderCleaner,
        headersCopier = headersCopier,
        javaFolderCleaner = javaFolderCleaner,
        broGenExecutor = broGenExecutor,
        pomVersionStringUpdater = pomVersionStringUpdater,
        readmeFileVersionUpdater = readmeFileVersionUpdater
    )

    log.d("$artifact:  <<<< finished processing")
}

fun extractVersionFromPlist(infoPlist: File, versionKey: String = "CFBundleShortVersionString"): String {
    return execAndGetString(
        arrayOf(
            "/usr/libexec/PlistBuddy",
            "-c",
            "Print :$versionKey",
            infoPlist.canonicalPath
        )
    )[0]
}

fun azureVersionFromReadme(readmeFile: File): String {
    return readmeFile.readLines().find { it.startsWith("github \"Azure/azure-notificationhubs-ios\" ~> ") }
        ?.substringAfter("~> ")
        ?: error("Version not found in ${readmeFile.canonicalPath}")
}

fun File.requiresCanExecute(msgProvider: () -> String) {
    if (!this.canExecute())
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsDirectory(msgProvider: () -> String) {
    if (!this.isDirectory)
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsFile(msgProvider: () -> String) {
    if (!this.isFile)
        throw IllegalStateException(msgProvider())
}

fun File.requiresDeleteRecursively() {
    if (!this.deleteRecursively())
        throw IllegalStateException("Failed to delete ${this.canonicalPath}")
}

fun File.requireMkdirs(skipIfExist: Boolean = false): File {
    if (this.exists() && this.isDirectory && skipIfExist)
        return this
    if (!this.mkdirs())
        throw IllegalStateException("Failed to mkdirs ${this.canonicalPath}")
    return this
}

val File.headers: File
    get() = File(this, "Headers")

val File.infoPlist: File
    get() = File(this, "Info.plist")

fun File.extractVersion(versionKey: String = "CFBundleShortVersionString"): String {
    return extractVersionFromPlist(this, versionKey)
}

fun File.extend(path: String): File = File(this, path)
fun String.extend(path: String): File = File(this, path)

fun exec(prefix: String, command: String) {
    val p = Runtime.getRuntime().exec(command)
    thread { p.errorStream.pipeTo(System.err, prefix) }
    thread { p.inputStream.pipeTo(System.out, prefix) }
    p.waitFor().also { code ->
        if (code != 0)
            error("non zero exit code $code when executing $command")
    }
}

fun execAndGetString(command: Array<String>): List<String> {
    val p = Runtime.getRuntime().exec(command)
    return p.inputStream.bufferedReader().readLines().also {
        val code = p.waitFor()
        if (code != 0)
            error("non zero exit code $code when executing ${command.joinToString(" ")}\noutput:${it.joinToString("\n")}")
    }
}

fun InputStream.pipeTo(out: PrintStream, prefix: String) = thread {
    this@pipeTo.bufferedReader().apply {
        try {
            var line: String?
            while (run { line = readLine(); line } != null) {
                out.println(prefix + line)
            }
        } catch (ignore: Throwable) {
        }
    }
}

class Log {
    var verbose = false

    val allowedI: Boolean
        get() = verbose

    fun i(msg: String) {
        if (allowedI)
            println(msg)
    }

    val allowedD = true
    fun d(msg: String) {
        if (allowedD)
            println(msg)
    }
}

fun Document.getElementByTagName(tagName: String): Element? {
    return this.documentElement.getElementByTagName(tagName)
}

fun Element.getElementByTagName(tagName: String): Element? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.ELEMENT_NODE && (item as? Element)?.tagName == tagName)
            return item
    }
    return null
}

fun Element.getTextValue(): String? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.TEXT_NODE)
            return item.nodeValue
    }
    return null
}

fun oneTimeReadmeUpdater(versionOverride: String? = null): (String, String, String) -> Unit {
    val provider: (() -> String)? = versionOverride?.let { { it } }
    return oneTimeReadmeUpdater(provider)
}

fun oneTimeReadmeUpdater(versionOverrideProvider: (() -> String)? = null): (String, String, String) -> Unit {
    val updater = object {
        var readmeUpdated = false
        fun readmeUpdater(framework: String, moduleFolder: String, version: String) {
            if (!readmeUpdated) {
                updateRootReadmeFileVersionString(framework, moduleFolder, versionOverrideProvider?.invoke() ?: version)
                readmeUpdated = true
            }
        }
    }
    return updater::readmeUpdater
}


/// pom.xml related manipulations
data class ArtifactId(val groupId: String, val id: String, val version: String, val moduleDir: String)
class PomUtils{
    fun Element.getChildText(tag: String): String? = getElementByTagName(tag)?.textContent

    fun parsePom(aggregatorDir: File, pom: File): ArtifactId {
        val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pom)
        val project = doc.documentElement
        val parent = project.getElementsByTagName("parent").item(0) as? Element

        val groupId = project.getChildText("groupId") ?: parent?.getChildText("groupId") ?: throw IllegalStateException("groupId missing")
        val version = project.getChildText("version") ?: parent?.getChildText("version") ?: throw IllegalStateException("version missing")
        val id = project.getChildText("artifactId") ?: throw IllegalStateException("artifactId missing")
        val moduleDir = pom.parentFile.relativeTo(aggregatorDir).invariantSeparatorsPath
        return ArtifactId(groupId = groupId, id = id, version = version, moduleDir = moduleDir)
    }

    fun listSubmodules(dir: File): List<ArtifactId> {
        return dir.listFiles { it.isDirectory }
            ?.mapNotNull { File(it, "pom.xml").takeIf { it.isFile } }
            ?.map { parsePom(aggregatorDir = dir, it) }
            ?.sortedBy { it.moduleDir }
            ?: emptyList()
    }

    fun updateAggregatedPom(pom: File, modules: List<ArtifactId>) {
        var progress = 0
        val resultPom = mutableListOf<String>()
        pom.forEachLine { line ->
            when {
                progress == 0 && line.contains("<dependencyManagement>") -> {
                    resultPom.add(line)
                    progress = 1
                }
                progress == 1 && line.contains("<dependencies>") -> {
                    resultPom.add(line)
                    progress = 2

                    // drop all modules
                    modules.forEach {
                        resultPom.add("            <dependency>")
                        resultPom.add("                <groupId>${it.groupId}</groupId>")
                        resultPom.add("                <artifactId>${it.id}</artifactId>")
                        resultPom.add("                <version>${it.version}</version>")
                        resultPom.add("            </dependency>")
                    }
                }
                progress == 2 && line.contains("</dependencies>") -> {
                    resultPom.add(line)
                    progress = -1 // end of story
                }
                progress == 2 -> {} // just skip line while inside dep
                else -> {
                    // default case
                    if (progress > 0) progress = -1
                    resultPom.add(line)
                }
            }
        }
        pom.writeText(resultPom.joinToString(System.lineSeparator()))
    }
}


class GroupFrameworkRegister(
    private val groupName: String,
    private val frameworkRegistry: MutableMap<String, (String) -> Unit>,
    private val groupRegistry: MutableMap<String, MutableList<String>>
) {
    operator fun set(framework: String, action: (String) -> Unit) {
        frameworkRegistry[framework] = action
        groupRegistry.computeIfAbsent(groupName) { mutableListOf() }.add(framework)
    }
}

fun registerAppCenter(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("AppCenter", frameworkRegistry, groupRegistry)
    val appCenterRoot = "AppCenter-SDK-Apple/iOS"
    val appCenterVersion: String by lazy {
        downloadFolder.extend("AppCenter-SDK-Apple/CHANGELOG.md")
            .readLines()
            .find { it.startsWith("## Version ") }
            ?.replace("## Version ", "")?.trim()
            ?: error("Failed to extract SDK version from CHANGLOG.md")
    }

    val appCenterInstallInstruction = """
        1. Download latest AppCenter-SDK-Apple-x.y.z.zip from https://github.com/microsoft/appcenter-sdk-apple/releases
        2. Unpack
        3. Rename ${downloadFolder.extend("AppCenter-SDK-Apple-x.y.z")} to ${downloadFolder.extend("AppCenter-SDK-Apple")} 
    """.trimIndent()

    val readmeUpdater = oneTimeReadmeUpdater { appCenterVersion }
    fun action(
        framework: String, moduleFolder: String, yaml: String,
        artifact: String = "$framework.framework",
        frameworkLocation: String = "$appCenterRoot/$artifact",
    ) {
        val artifactLocation = downloadFolder.extend(frameworkLocation)
        processFramework(
            artifact = artifact,
            moduleFolder = moduleFolder,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = { appCenterVersion },
            readmeFileVersionUpdater = readmeUpdater,
            instruction = appCenterInstallInstruction
        )
    }
    registry["AppCenterCore"] = { framework -> action(framework, "appcenter/ios-core", "appcenter.yaml", artifact = "AppCenter.framework") }
    registry["AppCenterAnalytics"] = { framework -> action(framework, "appcenter/ios-analytics", "appcenter-analytics.yaml") }
    registry["AppCenterCrashes"] = { framework -> action(framework, "appcenter/ios-crashes", "appcenter-crashes.yaml") }
    registry["AppCenterDistribute"] = { framework -> action(framework, "appcenter/ios-distribute", "appcenter-distribute.yaml") }
}

fun registerFirebase(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("Firebase", frameworkRegistry, groupRegistry)
    val versionProvider = object {
        val versions: Map<String, String> by lazy {
            // read versions from README.md
            downloadFolder.extend("Firebase/METADATA.md")
                .readLines()
                .filter { it.contains(" | ") }
                .mapNotNull {
                    it.split(" | ")
                        .takeIf { tokens -> tokens.size == 2 && tokens[0].isNotBlank() && tokens[1].isNotBlank() }
                        ?.let { tokens -> tokens[0].trim() to tokens[1].trim() }
                }.toMap()
                .also {
                    if (log.allowedI) {
                        log.i("Firebase version map:")
                        it.forEach { (k, v) -> log.i("  $k: $v") }
                    }
                }
        }

        operator fun get(key: String) = versions[key] ?: error("Failed to resolve version for $key")
    }

    val firebaseInstallInstruction = """
        Download latest Firebase.zip from https://github.com/firebase/firebase-ios-sdk/releases
        Unpack it, expected location ${downloadFolder.extend("Firebase")}
    """.trimIndent()
    val moduleReadmeFile = Path.of("Firebase/README.md").toFile()
    val readmeUpdater = oneTimeReadmeUpdater { versionProvider["Firebase"] }
    // some ios-arm64_armv7 other ios-arm64
    fun pickLocation(framework: String, prefix: String = framework) : File {
        return downloadFolder.extend("Firebase/$prefix/$framework.xcframework/ios-arm64/$framework.framework")
    }
    fun action(
        framework: String, moduleFolder: String, yaml: String, versionKey: String = framework,
        frameworkLocation: File = pickLocation(framework),
        destinationHeadersDir: File? = null,
        interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit = ::interactiveValidateHeaderFolder,
        headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit = ::cleanUpHeaders,
        headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit = ::copyHeaders
    ) {
        val artifactLocation = frameworkLocation
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = moduleFolder,
            destinationHeadersDir = destinationHeadersDir,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = { versionProvider[versionKey] },
            readmeFileVersionUpdater = { frm, modFolder, version ->
                readmeUpdater(frm, modFolder, version)
                updateModuleReadmeFileVersionString(frm, File("$modFolder/README.md"), version, "$version.0")
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
            instruction = firebaseInstallInstruction,
            interactiveValidateHeaderFolder = interactiveValidateHeaderFolder,
            headerFolderCleaner = headerFolderCleaner,
            headersCopier = headersCopier
        )
    }

    registry["FirebaseCore"] = { framework ->
        action(framework, "firebase/ios-core", "firebase-core.yaml",
            frameworkLocation = pickLocation("FirebaseCore", "FirebaseAnalytics"))
    }
    registry["FirebaseAnalytics"] = { framework -> action(framework, "firebase/ios-analytics", "firebase-analytics.yaml") }
    registry["FirebaseAuth"] = { framework ->
        action(framework,
            moduleFolder = "firebase/ios-auth",
            yaml = "firebaseauth.yaml",
            destinationHeadersDir = Path.of("firebase", "ios-auth", "src", "main", "bro-gen").toFile(),
            headerFolderCleaner = { _, dst ->
                cleanUpHeaders("FirebaseAuth", dst.extend("FirebaseAuth.framework"))
                cleanUpHeaders("FirebaseAuthInterop", dst.extend("FirebaseAuthInterop.framework"))
            },
            headersCopier = { _, _, dst ->
                copyHeaders("FirebaseAuth.framework",
                    pickLocation("FirebaseAuth", "FirebaseAuth").extend("Headers"),
                    dst.extend("FirebaseAuth.framework/Headers"))
                copyHeaders("FirebaseAuthInterop.framework",
                    pickLocation("FirebaseAuthInterop", "FirebaseAuth").extend("Headers"),
                    dst.extend("FirebaseAuthInterop.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, _, instruction, optional ->
                interactiveValidateHeaderFolder("FirebaseAuth.framework",
                    pickLocation("FirebaseAuth").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("FirebaseAuthInterop.framework",
                    pickLocation("FirebaseAuthInterop", "FirebaseAuth").extend("Headers"), instruction, optional)
            }
        )
    }
    registry["FirebaseCrashlytics"] = { framework ->
        action(framework,
            moduleFolder = "firebase/ios-crashlytics",
            yaml = "firebase-crashlytics.yaml",
            destinationHeadersDir = Path.of("firebase", "ios-crashlytics", "src", "main", "bro-gen").toFile(),
            headerFolderCleaner = { _, dst ->
                cleanUpHeaders("FirebaseCrashlytics", dst.extend("FirebaseCrashlytics.framework"))
                cleanUpHeaders("FirebaseRemoteConfigInterop", dst.extend("FirebaseRemoteConfigInterop.framework"))
            },
            headersCopier = { _, _, dst ->
                copyHeaders("FirebaseCrashlytics.framework",
                    pickLocation("FirebaseCrashlytics").extend("Headers"),
                    dst.extend("FirebaseCrashlytics.framework/Headers"))
                copyHeaders("FirebaseRemoteConfigInterop.framework",
                    pickLocation("FirebaseRemoteConfigInterop", "FirebaseCrashlytics").extend("Headers"),
                    dst.extend("FirebaseRemoteConfigInterop.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, _, instruction, optional ->
                interactiveValidateHeaderFolder("FirebaseCrashlytics.framework",
                    pickLocation("FirebaseCrashlytics").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("FirebaseRemoteConfigInterop.framework",
                    pickLocation("FirebaseRemoteConfigInterop", "FirebaseCrashlytics").extend("Headers"), instruction, optional)
            }
        )
    }
    registry["FirebaseDatabase"] = { framework -> action(framework, "firebase/ios-database", "firebasedatabase.yaml") }
    registry["FirebaseFirestore"] = { framework ->
        action(framework,
            moduleFolder = "firebase/ios-firestore",
            yaml = "firebasefirestore.yaml",
            destinationHeadersDir = Path.of("firebase", "ios-firestore", "src", "main", "bro-gen").toFile(),
            headerFolderCleaner = { _, dst ->
                cleanUpHeaders("FirebaseFirestore", dst.extend("FirebaseFirestore.framework"))
                cleanUpHeaders("FirebaseFirestoreInternal", dst.extend("FirebaseFirestoreInternal.framework"))
            },
            headersCopier = { _, _, dst ->
                copyHeaders("FirebaseFirestore.framework",
                    pickLocation("FirebaseFirestore").extend("Headers"),
                    dst.extend("FirebaseFirestore.framework/Headers"))
                copyHeaders("FirebaseFirestoreInternal.framework",
                    pickLocation("FirebaseFirestoreInternal", "FirebaseFirestore").extend("Headers"),
                    dst.extend("FirebaseFirestoreInternal.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, _, instruction, optional ->
                interactiveValidateHeaderFolder("FirebaseFirestore.framework",
                    pickLocation("FirebaseFirestore").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("FirebaseFirestoreInternal.framework",
                    pickLocation("FirebaseFirestoreInternal", "FirebaseFirestore").extend("Headers"), instruction, optional)
            },
        )
    }
    registry["FirebaseMessaging"] = { framework -> action(framework, "firebase/ios-messaging", "firebase-messaging.yaml") }
    registry["FirebaseRemoteConfig"] = { framework -> action(framework, "firebase/ios-remoteconfig", "firebase-remoteconfig.yaml") }
    registry["FirebaseStorage"] = { framework -> action(framework, "firebase/ios-storage", "firebasestorage.yaml") }
    registry["GoogleSignIn"] = { framework ->
        action(framework,
            moduleFolder = "firebase/ios-google-sign-in", "firebase-google-sign-in.yaml",
            frameworkLocation =  pickLocation("GoogleSignIn"),
            destinationHeadersDir = Path.of("firebase", "ios-google-sign-in", "src", "main", "bro-gen").toFile(),
            headerFolderCleaner = { _, dst ->
                cleanUpHeaders("GoogleSignIn", dst.extend("GoogleSignIn.framework"))
                cleanUpHeaders("GTMSessionFetcher", dst.extend("GTMSessionFetcher.framework"))
            },
            headersCopier = { _, _, dst ->
                copyHeaders("GoogleSignIn.framework",
                    pickLocation("GoogleSignIn").extend("Headers"),
                    dst.extend("GoogleSignIn.framework/Headers"))
                copyHeaders("GTMSessionFetcher.framework",
                    pickLocation("GTMSessionFetcher", "GoogleSignIn").extend("Headers"),
                    dst.extend("GTMSessionFetcher.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, _, instruction, optional ->
                interactiveValidateHeaderFolder("GoogleSignIn.framework",
                    pickLocation("GoogleSignIn").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("GTMSessionFetcher.framework",
                    pickLocation("GTMSessionFetcher", "GoogleSignIn").extend("Headers"), instruction, optional)
            },
        )
    }
    registry["FirebaseAppCheck"] = { framework ->
        action(framework, "firebase/ios-appcheck", "firebase-appcheck.yaml",
            destinationHeadersDir = Path.of("firebase", "ios-appcheck", "src", "main", "bro-gen").toFile(),
            headerFolderCleaner = { _, dst ->
                cleanUpHeaders("FirebaseAppCheck", dst.extend("FirebaseAppCheck.framework"))
                cleanUpHeaders("FirebaseAppCheckInterop", dst.extend("FirebaseAppCheckInterop.framework"))
                cleanUpHeaders("AppCheckCore", dst.extend("AppCheckCore.framework"))
            },
            headersCopier = { _, _, dst ->
                copyHeaders("FirebaseAppCheck.framework",
                    pickLocation("FirebaseAppCheck").extend("Headers"),
                    dst.extend("FirebaseAppCheck.framework/Headers"))
                // patch @import in header
                val h = dst.extend("FirebaseAppCheck.framework/Headers/FIRAppCheck.h")
                h.readText().replaceFirst("@import FirebaseAppCheckInterop;",
                    "#import <FirebaseAppCheckInterop/FirebaseAppCheckInterop-umbrella.h>"
                ).run { h.writeText(this) }
                copyHeaders("FirebaseAppCheckInterop.framework",
                    pickLocation("FirebaseAppCheckInterop", "FirebaseAppCheck").extend("Headers"),
                    dst.extend("FirebaseAppCheckInterop.framework/Headers"))
                copyHeaders("AppCheckCore.framework",
                    pickLocation("AppCheckCore", "FirebaseAppCheck").extend("Headers"),
                    dst.extend("AppCheckCore.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, _, instruction, optional ->
                interactiveValidateHeaderFolder("FirebaseAppCheck.framework",
                    pickLocation("FirebaseAppCheck").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("FirebaseAppCheckInterop.framework",
                    pickLocation("FirebaseAppCheckInterop", "FirebaseAppCheck").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("AppCheckCore.framework",
                    pickLocation("AppCheckCore", "FirebaseAppCheck").extend("Headers"), instruction, optional)
            },
        )
    }
    registry["FirebaseInstallations"] = { framework -> action(framework, "firebase/ios-installations", "firebase-installations.yaml",
        frameworkLocation = pickLocation("FirebaseInstallations", "FirebaseAnalytics"))
    }
    registry["FirebaseBOM"] = { framework ->
        val version = versionProvider["Firebase"]
        updatePomVersionString(framework, File("firebase/ios-bom/pom.xml"), version, pomVersion = "$version.0")
        // update artifacts list in bom
        with (PomUtils()) {
            listSubmodules(File("firebase/"))
                .filter { it.moduleDir != "ios-bom" }
                .let { updateAggregatedPom(File("firebase/ios-bom/pom.xml"), it) }
        }
    }
}

fun registerMobileAds(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val adsRegistry = GroupFrameworkRegister("GAD", frameworkRegistry, groupRegistry)
    fun instructions(location: String) = """
                1. download iOS sdk from https://developers.google.com/admob/ios/download
                2. unpack 
                3. rename to GoogleMobileAdsSdkiOS
                3. expected location $location}
            """.trimIndent()
    adsRegistry["GoogleMobileAds"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("GoogleMobileAdsSdkiOS/GoogleMobileAds.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "google-mobile-ads/ios-google-mobile-ads",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "gad.yaml",
            version = { artifactLocation.infoPlist.extractVersion(versionKey = "CFBundleShortVersionString") },
            instruction = instructions(artifactLocation.toString()),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                val moduleReadmeFile = Path.of("google-mobile-ads/README.md").toFile()
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
                updateModuleReadmeFileVersionString(frm, File("$modFolder/README.md"), version, "$version.0")
                updateRootReadmeFileVersionString(frm, "google-mobile-ads", version)
            }
        )
    }
    adsRegistry["UserMessagingPlatform"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("GoogleMobileAdsSdkiOS/UserMessagingPlatform.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "google-mobile-ads/ios-google-ump",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "firebase-ump.yaml",
            version = { artifactLocation.infoPlist.extractVersion(versionKey = "CFBundleShortVersionString") },
            instruction = instructions(artifactLocation.toString()),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                val moduleReadmeFile = Path.of("google-mobile-ads/README.md").toFile()
                updateModuleReadmeFileVersionString(frm, File("$modFolder/README.md"), version, "$version.0")
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            }
        )
    }

    ///
    /// Register adapters as separate group
    ///
    val adaptersRegistry = GroupFrameworkRegister("GoogleAdsAdapters", frameworkRegistry, groupRegistry)
    val moduleReadmeFile = Path.of("google-mobile-ads/ios-google-mobile-ads-adapters/README.md").toFile()
    adaptersRegistry["AppLovinAdapter"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("AppLovinAdapter/AppLovinAdapter.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "google-mobile-ads/ios-google-mobile-ads-adapters/ios-applovin",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "applovin-adapter.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. download AppLovinAdapter-X.X.X.X.zip from https://developers.google.com/admob/ios/mediation/applovin#applovin-ios-mediation-adapter-changelog
                2. extract and rename folder to AppLovinAdapter
                3. expected location ${downloadFolder.extend("AppLovinAdapter/AppLovinAdapter.xcframework/ios-arm64_armv7/")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            }
        )
    }
    adaptersRegistry["MetaAdapter"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("MetaAdapter/MetaAdapter.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "google-mobile-ads/ios-google-mobile-ads-adapters/ios-facebook",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "facebook-adapter.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. download MetaAdapter-X.X.X.X.zip from https://developers.google.com/admob/ios/mediation/meta#meta-audience-network-ios-mediation-adapter-changelog
                2. extract and rename folder to MetaAdapter 
                3. expected location ${downloadFolder.extend("MetaAdapter/MetaAdapter.xcframework/ios-arm64/")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
        )
    }
    adaptersRegistry["InMobiAdapter"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("InMobiAdapter/InMobiAdapter.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "google-mobile-ads/ios-google-mobile-ads-adapters/ios-inmobi",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "inmobi-adapter.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. download InMobiAdapter-X.X.X.X.zip from https://developers.google.com/admob/ios/mediation/inmobi#inmobi-ios-mediation-adapter-changelog
                2. extract and rename folder to InMobiAdapter 
                3. expected location ${downloadFolder.extend("InMobiAdapter/InMobiAdapter.xcframework/ios-arm64_armv7/")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
        )
    }
}

fun registerFacebook(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("Facebook", frameworkRegistry, groupRegistry)
    val facebookRoot = "Facebook"
    fun extractVersionFromHeader(frameworkName: String, header: File, versionTag: String): String {
        return header.readLines()
            .find { it.startsWith("#define $versionTag @\"") && it.endsWith("\"") }
            ?.substringAfter('\"')?.substringBefore('\"')?.substringBefore(".master")
            ?: error("Filed to evaluate $frameworkName version")
    }

    val facebookVersion: String by lazy {
        extractVersionFromHeader("Facebook",
            downloadFolder.extend("$facebookRoot/FBSDKCoreKit.xcframework/ios-arm64/FBSDKCoreKit.framework/Headers/FBSDKCoreKitVersions.h"),
            "FBSDK_VERSION_STRING")
    }

    val facebookInstallInstruction = """
        1. Download latest FacebookSDK_Dynamic.xcframework.zip from https://github.com/facebook/facebook-ios-sdk/releases
        2. Unpack it, it will be unpacked to ${downloadFolder.extend("XCFrameworks")}
        3. Rename ${downloadFolder.extend("XCFrameworks")} to ${downloadFolder.extend("Facebook")}
    """.trimIndent()
    val facebookAudienceInstallInstruction = """
        1. Download latest FBAudienceNetwork-X.Y.Z.zip from https://developers.facebook.com/docs/audience-network/guides/adding-sdk/ios
        2. Unpack it, it will be unpacked to ${downloadFolder.extend("FBAudienceNetwork-X.Y.Z")}
        3. Rename ${downloadFolder.extend("FBAudienceNetwork-X.Y.Z")} to ${downloadFolder.extend("FBAudienceNetwork")}
    """.trimIndent()

    val readmeUpdater = oneTimeReadmeUpdater { facebookVersion }
    val moduleReadmeFile = Path.of("facebook/README.md").toFile()
    fun action(
        framework: String, moduleFolder: String, yaml: String,
        frameworkLocation: String = "${facebookRoot}/$framework.xcframework/ios-arm64/$framework.framework",
        readmeFileVersionUpdater: (String, String, String) -> Unit = readmeUpdater,
        instruction: String = facebookInstallInstruction,
        versionProvider: () -> String = { facebookVersion }
    ) {
        val artifactLocation = downloadFolder.extend(frameworkLocation)
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = moduleFolder,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = versionProvider,
            readmeFileVersionUpdater = { frm, modFolder, version ->
                readmeFileVersionUpdater(frm, modFolder, version)
                updateAggregatedReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
                updateModuleReadmeFileVersionString(frm, File("$modFolder/README.md"), version, "$version.0")
            },
            instruction = instruction
        )
    }

    registry["FBSDKCoreKit_Basics"] = { framework -> action(framework, "facebook/ios-core-basics", "facebook-core-basics.yaml") }
    registry["FBSDKCoreKit"] = { framework -> action(framework, "facebook/ios-core", "facebook-core.yaml") }
    registry["FBSDKLoginKit"] = { framework -> action(framework, "facebook/ios-login", "facebook-login.yaml") }
    registry["FBSDKShareKit"] = { framework -> action(framework, "facebook/ios-share", "facebook-share.yaml") }
    registry["FBAEMKit"] = { framework -> action(framework, "facebook/ios-aem", "facebook-aemkit.yaml") }
    registry["FBSDKGamingServicesKit"] = { framework -> action(framework, "facebook/ios-gaming-services-kit", "facebook-gaming-serv-kit.yaml") }
    registry["FBAudienceNetwork"] = { framework ->
        action(framework, "facebook/ios-audience", "facebook-audience.yaml",
            frameworkLocation = "FBAudienceNetwork/Dynamic/FBAudienceNetwork.xcframework/ios-arm64/FBAudienceNetwork.framework",
            instruction = facebookAudienceInstallInstruction,
            readmeFileVersionUpdater = { _, _, _ -> },
            versionProvider = {
                extractVersionFromHeader("FBAudienceNetwork",
                    downloadFolder.extend("FBAudienceNetwork/Dynamic/FBAudienceNetwork.xcframework/ios-arm64/FBAudienceNetwork.framework/Headers/FBAudienceNetwork.h"),
                    "FB_AD_SDK_VERSION")
            })
    }
    registry["FacebookBOM"] = { framework ->
        val version = facebookVersion
        updatePomVersionString(framework, File("facebook/ios-bom/pom.xml"), version, pomVersion = "$version.0")
        // update artifacts list in bom
        with (PomUtils()) {
            listSubmodules(File("facebook/"))
                .filter { it.moduleDir != "ios-bom" && it.moduleDir != "ios-audience"}
                .let { updateAggregatedPom(File("facebook/ios-bom/pom.xml"), it) }
        }
    }

}
