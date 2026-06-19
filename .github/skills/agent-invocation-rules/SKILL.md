---
name: agent-invocation-rules
description: Shared rules for safely invoking tools and shell commands from sub-agents.
---

# Agent Invocation Rules

Use this skill whenever an agent invokes terminal commands, reads repository files, or performs scoped searches.

## TOOLS AVAILABILITY
- python is not available, use python3

## Pathing and Scope
- Resolve relative paths from the repository root unless the agent explicitly narrows the root.
- Do not guess file locations. Use only the file paths named by the agent's required inputs and workflow.
- **DO NOT** use glob searches like `file_search` for deterministic file path, read that file directly using `read_file`;
- Do not search beyond the agent's explicitly allowed scope.
- Use only the exact absolute path already provided.
- Never prepend, rewrite, normalize, or “repair” a path unless explicitly instructed.
- Never infer missing path segments from context.
- Never swap one user path segment for another, even if it looks similar.
- If a required file path is not exact, stop and report the raw error.
- Do not use broad search to “find” a deterministic file.
- Do not continue after a path-read failure by guessing a replacement.
- For sub-agent runs, pass the task exactly as requested, unchanged.
- Do not construct file paths from memory. Run `pwd` to get the exact absolute path before attempting to modify or read any files.

## Failure Handling
- Prefer fail-fast behavior: if a required read, write, download, or command fails, surface the raw error and stop unless the agent explicitly defines a recovery step.
- Do not silently retry, fallback, or recover unless the agent workflow says to do so.

## Terminal Safety
- When generating `run_in_terminal` commands, do not use `set -e`, `set -euo pipefail`, or `exit`.
- Avoid piping into commands that are also consuming heredoc input.
- Prefer simple chained commands using `&&` or `;`.
- Keep shell snippets minimal and deterministic.

## Network Downloads
- use `~/Downloads/robopods-wip/tmp` as a temporary staging folder for any temporal purposes (downloads, unzips, etc.). Don't forget to clean it up after use.
- When using `curl` for downloads or redirects, always enable follow-redirect behavior (`-L` or `--location`).
- Download the zip into a temporary/empty staging folder (NOT directly into downloadLocation).

## Search Discipline
- Use bounded searches only within the directory scope explicitly allowed by the agent.
- Avoid broad workspace scans unless the agent explicitly permits them.

