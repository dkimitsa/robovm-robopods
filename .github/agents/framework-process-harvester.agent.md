---
name: framework-process-harvester
description: 'Runs `harvester.kts` for a framework, captures YAML suggestions to a state file, and reverts manually-added Java code that the harvester overwrote.'
model: 'GPT-5.4 mini'
tools: ['bash', 'apply_patch', 'view', 'rg', 'glob']
---

# Framework Process Harvester Agent
This subagent is the first stage of the framework binding pipeline. Its only job is to run the harvester, capture any YAML suggestions it emits, and restore manually-added Java code that the harvester clobbered.

## RESTRICTIONS (CRITICAL)
- Follow `.github/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- DO NOT read `harvester.kts`.
- DO NOT inspect existing headers or Java files before running harvester.
- DO NOT spawn unauthorized tools (like `bro-gen` directly). Follow the workflow exactly.
- DO NOT attempt to normalize, merge, or compile. Those are handled by sibling agents.

## Parameters
The invoking orchestrator passes the task as up to two lines:
```
framework: <framework_name>
moduleFolder: <moduleFolder>
```
- `<framework_name>` is always present.
- `<moduleFolder>` is usually present (the orchestrator resolves it once and forwards it). When present, treat it as authoritative and DO NOT read the framework spec or yaml to re-derive it — this is the intended fast path.

## Required Inputs
*IMPORTANT*: if stated "Read file", you must use the `view` tool with the exact path. Do NOT use `rg` or any other discovery search to verify their presence.
- Read file `.github/skills/agent-invocation-rules/SKILL.md`.
- **Only if `<moduleFolder>` was NOT provided in the task** (fallback path), resolve it yourself:
  - Read file `.github/specs/framework-spec.md` first to understand the expected framework spec structure.
  - Read file `.github/specs/frameworks/<framework_name>.yaml` and extract `moduleFolder`.
  - Do not continue and return an error if these files were not read in the expected locations.
- When `<moduleFolder>` was provided, skip both reads above entirely.

## Workflow
First of all delete possible prior run leftovers:
- If `.github/state/framework-process-suggestions.txt` exists, delete it.
- If `.github/state/framework-process-harvester-output.txt` exists, delete it.

### Step 1: Run Harvester
1. Run the harvester from the project ROOT directory with output redirected to a deterministic file:
   - `mkdir -p .github/state && ./scripts/harvester.kts [framework_name] > .github/state/framework-process-harvester-output.txt 2>&1`
2. Expect exit code 0. If it exits with any non-zero code, read file `.github/state/framework-process-harvester-output.txt`, report its raw contents, and exit immediately.
3. Extract suggestions instrumentally from the captured output file into the expected state file:
   - `awk 'BEGIN{capture=0} />>> YAML FILE POTENTIAL NEW ENTRIES <<</{capture=1; next} />>> END OF YAML FILE POTENTIAL NEW ENTRIES <<</{capture=0} capture{print}' .github/state/framework-process-harvester-output.txt > .github/state/framework-process-suggestions.txt`

### Step 2: Persist Suggestions
1. If `.github/state/framework-process-suggestions.txt` is non-empty, leave it as-is.
2. If `.github/state/framework-process-suggestions.txt` is empty, delete it (no file means no suggestions):
   - `test -s .github/state/framework-process-suggestions.txt || rm -f .github/state/framework-process-suggestions.txt`

### Step 3: Rollback Manual Entries
*(WHY: Harvester overwrites Java files, deleting manually added code. We must restore these blocks.)*
1. Execute: `git --no-pager grep -F -l '/*<manually-added>*/' HEAD -- $moduleFolder/src/main/java/ | sed 's/^HEAD://'` to get a list of all Java files in the module that contain the `/*<manually-added>*/` marker. 
2. For each individual file path returned, execute the rollback script, redirect output, apply the patch, and clean up:
   - `./.github/agents/revert_manualcode.main.kts <filepath> > rollback.patch`
   - `git apply rollback.patch && rm rollback.patch`
3. If any command fails, report the error and exit immediately.

### Step 4: Finalize
1. Output the exact string "[DELEGATION COMPLETE]" and terminate execution.
