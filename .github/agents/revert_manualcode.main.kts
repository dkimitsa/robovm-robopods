#!/usr/bin/env kotlin

import kotlin.system.exitProcess

fun main() {
    val input = readInput()
    if (input.isBlank()) return

    val normalized = input.replace("\r\n", "\n")
    val lines = normalized.split('\n').dropLastWhile { it.isEmpty() }
    val output = processDiff(lines)

    if (output.isNotEmpty()) {
        print(output.joinToString("\n") + "\n")
    }
}

fun readInput(): String {
    if (args.isNotEmpty()) return runGitDiff(args[0])
    return generateSequence(::readLine).joinToString("\n")
}

fun runGitDiff(filePath: String): String {
    val process = ProcessBuilder("git", "--no-pager", "diff", "-R", "HEAD", "--", filePath)
        .redirectErrorStream(true)
        .start()
    val output = process.inputStream.bufferedReader().readText()
    val exitCode = process.waitFor()
    if (exitCode != 0) {
        System.err.print(output)
        System.err.println("git diff exited with code $exitCode")
        exitProcess(exitCode)
    }
    return output
}

fun processDiff(lines: List<String>): List<String> {
    val result = mutableListOf<String>()
    var currentHeaders = mutableListOf<String>()
    var currentHunks = mutableListOf<List<String>>()
    var currentOffsetDelta = 0 // Renamed for clarity: tracks the cumulative line drift
    var index = 0

    fun flushSection() {
        // Emit a file section only when at least one rewritten hunk survives.
        if (currentHunks.isNotEmpty()) {
            result.addAll(currentHeaders)
            currentHunks.forEach { hunk -> result.addAll(hunk) }
        }
        currentHeaders = mutableListOf()
        currentHunks = mutableListOf()
        currentOffsetDelta = 0 // Reset drift per-file
    }

    while (index < lines.size) {
        val line = lines[index]

        when {
            line.startsWith("diff --git ") -> {
                flushSection()
                currentHeaders.add(line)
                index++
            }

            line.startsWith("@@ ") -> {
                val hunkHeader = line
                val body = mutableListOf<String>()
                index++
                while (index < lines.size && !lines[index].startsWith("@@ ") && !lines[index].startsWith("diff --git ")) {
                    body.add(lines[index])
                    index++
                }

                // Pass current cumulative offset drift into the hunk processor
                val (hunkLines, nextOffsetDelta) = processHunk(hunkHeader, body, currentOffsetDelta)
                currentOffsetDelta = nextOffsetDelta

                if (hunkLines != null) {
                    currentHunks.add(hunkLines)
                }
            }

            else -> {
                currentHeaders.add(line)
                index++
            }
        }
    }

    flushSection()
    return result
}

fun processHunk(headerLine: String, body: List<String>, offsetDelta: Int): Pair<List<String>?, Int> {
    data class HunkHeader(val oldStart: Int, val oldCount: Int, val newStart: Int, val newCount: Int, val suffix: String)
    val header = run {
        val REGEX = Regex("^@@ -(\\d+)(?:,(\\d+))? \\+(\\d+)(?:,(\\d+))? @@(.*)$")
        val match = REGEX.matchEntire(headerLine)
            ?: throw IllegalArgumentException("Invalid hunk header: $headerLine")
        HunkHeader(
            oldStart = match.groupValues[1].toInt(),
            oldCount = match.groupValues[2].takeIf { it.isNotEmpty() }?.toInt() ?: 1,
            newStart = match.groupValues[3].toInt(),
            newCount = match.groupValues[4].takeIf { it.isNotEmpty() }?.toInt() ?: 1,
            suffix = match.groupValues[5],
        )
    }

    val manualBlocks = mutableListOf<IntRange>()
    var openIndex: Int? = null

    fun String.diffOp(): Char = this[0]
    fun String.diffText(): String = this.drop(1)

    // Detect manual block boundaries
    body.forEachIndexed { idx, line ->
        if (line.isEmpty()) error("Empty diff line in hunk body at index $idx")

        // Handle special git lines like "\ No newline at end of file"
        if (line.startsWith('\\')) return@forEachIndexed

        val diffOp = line.diffOp()
        val diffText = line.diffText().trimStart()

        when {
            diffOp != '+' -> {} // smart trap for anything that is not +
            diffText.startsWith("/*<manually-added>*/") -> {
                if (openIndex != null) error("Rollback patch has nested opening tag before closing tag")
                openIndex = idx
            }
            diffText.startsWith("/*</manually-added>*/") -> {
                val start = openIndex ?: error("Rollback patch has closing tag before opening tag")
                var blockStart = start
                var blockEnd = idx

                // extends with trailing and leading whitespaces that might be part of manual code block
                while (blockStart > 0 && body[blockStart - 1].diffOp() == '+' && body[blockStart - 1].diffText().isBlank()) {
                    blockStart--
                }

                while (blockEnd + 1 < body.size && body[blockEnd + 1].diffOp() == '+' && body[blockEnd + 1].diffText().isBlank()) {
                    blockEnd++
                }

                manualBlocks += blockStart..blockEnd
                openIndex = null
            }
        }
    }

    if (openIndex != null) error("Rollback patch has opening tag without matching closing tag")

    // If no manual entries found, skip the whole hunk.
    if (manualBlocks.isEmpty()) {
        // To drop a hunk, we must reverse the line delta that git expected this hunk to apply.
        val nextOffsetDelta = offsetDelta + (header.oldCount - header.newCount)
        return null to nextOffsetDelta
    }

    // Reconstruct back leaving only manual blocks
    val outputLines = mutableListOf<String>()

    body.forEachIndexed { idx, line ->
        if (line.startsWith('\\')) {
            outputLines.add(line)
            return@forEachIndexed
        }

        val op = line.diffOp()
        val insideManualBlock = manualBlocks.any { idx in it }

        val outLine = when {
            insideManualBlock && op != '+' -> error("Manual block lines must be additions only, but found '$op' for '$line'")
            insideManualBlock -> line                  // keep rollback entries
            op == ' ' -> line                          // anchors stay anchors
            op == '-' -> ' ' + line.diffText()         // turn old deletions into anchors
            op == '+' -> null                          // remove anything else other than manual section
            else -> error("Unsupported diff operation '$op'")
        }

        if (outLine != null) outputLines.add(outLine)
    }

    if (outputLines.isEmpty()) error("Illegal state: no output lines generated for hunk with manual blocks")

    // Calculate exact lengths of the newly generated block
    val newOldCount = outputLines.count { it.startsWith(" ") || it.startsWith("-") }
    val newNewCount = outputLines.count { it.startsWith(" ") || it.startsWith("+") }

    // Shift the new starting line by our cumulative delta, then update the delta for the next hunk
    val newNewStart = header.newStart + offsetDelta
    val nextOffsetDelta = offsetDelta + (newNewCount - header.newCount)

    fun HunkHeader.format(oldStart: Int, oldCount: Int, newStart: Int, newCount: Int): String {
        fun formatRange(prefix: Char, start: Int, count: Int) = if (count == 1) "$prefix$start" else "$prefix$start,$count"
        return "@@ ${formatRange('-', oldStart, oldCount)} ${formatRange('+', newStart, newCount)} @@$suffix"
    }

    val newHeader = header.format(header.oldStart, newOldCount, newNewStart, newNewCount)
    return (listOf(newHeader) + outputLines) to nextOffsetDelta
}

main()