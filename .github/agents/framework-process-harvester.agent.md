---
name: framework-process-harvester
description: 'Runs `harvester.kts` for a framework, captures YAML suggestions to a state file, and reverts manually-added Java code that the harvester overwrote.'
tools: ['run_in_terminal', 'apply_patch', 'read_file', 'file_search', 'create_file']
---

# Framework Process Harvester Agent
This subagent is the first stage of the framework binding pipeline. Its only job is to run the harvester, capture any YAML suggestions it emits, and restore manually-added Java code that the harvester clobbered.

## RESTRICTIONS (CRITICAL)
- `read_file` and follow `.github/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- DO NOT read `harvester.kts`.
- DO NOT inspect existing headers or Java files before running harvester.
- DO NOT spawn unauthorized tools (like `bro-gen` directly). Follow the workflow exactly.
- DO NOT attempt to normalize, merge, or compile. Those are handled by sibling agents.

## Required Inputs
- direct_read `.github/specs/framework-spec.md` first to understand the expected framework spec structure.
- direct_read `.github/specs/frameworks/<framework_name>.yaml`, where `<framework_name>` is the parameter passed to `@framework-process-harvester`.
- direct_read `.github/skills/agent-invocation-rules/SKILL.md`.
- Do not continue and return an error if files were not read in expected locations.

## Workflow
First of all delete possible prior run leftovers:
- If `.github/state/framework-process-suggestions.txt` exists, delete it.

### Step 1: Run Harvester
1. Run `./scripts/harvester.kts [framework_name]` from the project ROOT directory.
2. Expect exit code 0. If it exits with any non-zero code, report the error output and exit immediately.
3. Capture the full output and extract suggestion text between `>>> YAML FILE POTENTIAL NEW ENTRIES <<<` and `>>> END OF YAML FILE POTENTIAL NEW ENTRIES <<<`.

### Step 2: Persist Suggestions
1. If the extracted suggestion block is non-empty, write its raw content to `.github/state/framework-process-suggestions.txt` (create the file, overwriting any prior copy).
2. If the extracted suggestion block is empty, delete `.github/state/framework-process-suggestions.txt` if it exists (no file means no suggestions).

### Step 3: Rollback Manual Entries
*(WHY: Harvester overwrites Java files, deleting manually added code. We must restore these blocks.)*
1. Execute: `git --no-pager grep -F -l '/*<manually-added>*/' HEAD -- $moduleFolder/src/main/java/ | sed 's/^HEAD://'` to get a list of all Java files in the module that contain the `/*<manually-added>*/` marker. 
2. For each individual file path returned, execute the rollback script, redirect output, apply the patch, and clean up:
   - `./.github/agents/revert_manualcode.main.kts <filepath> > rollback.patch`
   - `git apply rollback.patch && rm rollback.patch`
3. If any command fails, report the error and exit immediately.

### Step 4: Finalize
1. Output the exact string "[DELEGATION COMPLETE]" and terminate execution.

