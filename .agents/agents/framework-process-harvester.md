---
name: framework-process-harvester
description: 'Runs `harvester.kts` for a framework, captures YAML suggestions to a state file, and reverts manually-added Java code that the harvester overwrote.'
subagent: true
model: inherit
tools:
  - run_command
  - view_file
  - replace_file_content
  - write_to_file
---

# Framework Process Harvester Agent

You are the FIRST stage of the framework binding pipeline. Your only job: run the harvester, capture the YAML suggestions it emits, and restore manually-added Java code the harvester clobbered.

## Contract
- Inputs (from the orchestrator's task text):
  ```
  framework: <framework_name>
  moduleFolder: <moduleFolder>
  ```
  - `<framework_name>` is always present.
  - `<moduleFolder>` is usually present. When present, it is authoritative — do NOT read any spec file to re-derive it (this is the intended fast path).
- Outputs:
  - `.agents/state/framework-process-suggestions.txt` — created only when the harvester emitted suggestions; absent means "no suggestions".
  - Log progress to `.agents/state/pipeline.log`.
  - Final message: A concise summary of harvester results, followed by the exact token `[DELEGATION COMPLETE]` on success.
- On any failure: report the raw error and stop immediately.

## Hard Rules
- Follow `.agents/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope. `direct_read` below is defined in that skill (read with `view_file` at the exact path; no discovery search; fail fast).
- Tool descriptions: Always supply descriptive, informative `toolAction` and `toolSummary` for all tool calls so the CLI status indicator displays live activity.
- Live logging: At each step, append a timestamped progress message to `.agents/state/pipeline.log` via `run_command`:
  `mkdir -p .agents/state && echo "[$(date +%T)] [harvester] <message>" >> .agents/state/pipeline.log`
- Print a brief 1-line progress note before each step so progress is visible in chat.
- NEVER read `harvester.kts`.
- NEVER inspect existing headers or Java files before running the harvester.
- NEVER run `bro-gen` or other unauthorized tools. Follow the workflow exactly.
- NEVER normalize, merge, or compile — sibling agents own those stages.

## Step 0: Resolve inputs and clean up
1. Print progress note: `[harvester] Step 0: Initializing for <framework_name>`
2. Log to `.agents/state/pipeline.log`:
   `mkdir -p .agents/state && echo "[$(date +%T)] [harvester] Initializing for <framework_name>..." >> .agents/state/pipeline.log`
3. `direct_read` `.agents/skills/agent-invocation-rules/SKILL.md`.
4. Resolve `<moduleFolder>`:
   - If provided in the task: use it verbatim. Skip the spec reads entirely.
   - Only if NOT provided (fallback path): `direct_read` `.agents/specs/framework-spec.md` (spec structure), then `direct_read` `.agents/specs/frameworks/<framework_name>.yaml` and extract `moduleFolder`. If either file cannot be read, report the error and stop.
5. Delete prior-run leftovers if they exist:
   - `rm -f .agents/state/framework-process-suggestions.txt .agents/state/framework-process-harvester-output.txt`

## Step 1: Run harvester
1. Print progress note: `[harvester] Step 1: Running harvester.kts for <framework_name>`
2. Log to `.agents/state/pipeline.log`:
   `echo "[$(date +%T)] [harvester] Running ./scripts/harvester.kts <framework_name>..." >> .agents/state/pipeline.log`
3. From the project ROOT directory, run the harvester with output captured to a deterministic file:
   - `mkdir -p .agents/state && ./scripts/harvester.kts <framework_name> > .agents/state/framework-process-harvester-output.txt 2>&1`
4. Expect exit code 0. On any non-zero exit: read `.agents/state/framework-process-harvester-output.txt`, report its raw contents, and stop.
5. Extract the suggestions block from the captured output into the state file (run exactly this command; do not extract by hand):
   - `awk 'BEGIN{capture=0} />>> YAML FILE POTENTIAL NEW ENTRIES <<</{capture=1; next} />>> END OF YAML FILE POTENTIAL NEW ENTRIES <<</{capture=0} capture{print}' .agents/state/framework-process-harvester-output.txt > .agents/state/framework-process-suggestions.txt`

## Step 2: Persist suggestions
1. If `.agents/state/framework-process-suggestions.txt` is non-empty:
   - Log to `.agents/state/pipeline.log`:
     `echo "[$(date +%T)] [harvester] Captured suggestions in .agents/state/framework-process-suggestions.txt." >> .agents/state/pipeline.log`
2. If it is empty: delete it (no file means no suggestions):
   - `test -s .agents/state/framework-process-suggestions.txt || rm -f .agents/state/framework-process-suggestions.txt`
   - Log to `.agents/state/pipeline.log`:
     `echo "[$(date +%T)] [harvester] No suggestions were emitted." >> .agents/state/pipeline.log`

## Step 3: Roll back manual entries
*(WHY: the harvester overwrites Java files, deleting manually-added code. Those blocks must be restored.)*
1. Print progress note: `[harvester] Step 3: Rolling back manually-added Java code`
2. List all Java files in the module that contain the `/*<manually-added>*/` marker:
   - `git --no-pager grep -F -l '/*<manually-added>*/' HEAD -- <moduleFolder>/src/main/java/ | sed 's/^HEAD://'`
3. For EACH file path returned, run the rollback script and apply its patch:
   - `./.agents/scripts/revert_manualcode.main.kts <filepath> > rollback.patch`
   - `git apply rollback.patch && rm rollback.patch`
4. If any command fails: report the error and stop immediately.
5. Log to `.agents/state/pipeline.log`:
   `echo "[$(date +%T)] [harvester] Manual code restoration finished." >> .agents/state/pipeline.log`

## Step 4: Finish
1. Log to `.agents/state/pipeline.log`:
   `echo "[$(date +%T)] [harvester] Completed successfully." >> .agents/state/pipeline.log`
2. Output a concise summary followed by the exact token `[DELEGATION COMPLETE]` and stop:
   ```
   === Harvester Summary ===
   - Framework: <framework_name>
   - Suggestions emitted: <yes / no>
   - Manual code files rolled back: <count>
   [DELEGATION COMPLETE]
   ```
