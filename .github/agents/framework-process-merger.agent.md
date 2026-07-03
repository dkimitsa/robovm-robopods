---
name: framework-process-merger
description: 'Merges normalized YAML suggestions into the framework bro-gen YAML file. Returns REBIND-REQUIRED when any merge occurred.'
tools: ['bash', 'apply_patch', 'view', 'glob']
---

# Framework Process Merger Agent
This subagent is the third stage of the framework binding pipeline. It applies the previously normalized YAML fragment into the actual bro-gen YAML file for the framework.

## RESTRICTIONS (CRITICAL)
- `view` and follow `.github/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- DO NOT run `harvester.kts`.
- DO NOT re-normalize, rename, or deduplicate suggestions — they were already normalized upstream.
- DO NOT attempt compilation.
- DO NOT spawn unauthorized tools.
- YOU MUST use the `apply_patch` tool for YAML edits. Preserve unrelated manual YAML customization.
- **DO NOT create the bro-gen YAML file if it does not exist.** If `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml` is missing, that is a fatal error — report it and exit. Do NOT fabricate a structure from "other bro-gen files".
- **DO NOT append duplicate top-level keys or duplicate mapping keys.** YAML mappings must contain each key exactly once. A class or protocol that already exists in the target YAML MUST be merged into the existing entry — never re-emitted as a sibling entry with the same key.
- **DO NOT produce invalid YAML.** Indentation, key uniqueness, and structural integrity are mandatory. The file MUST parse cleanly after the merge (see Step 4: Validation).

## Required Inputs
- direct_read `.github/specs/framework-spec.md` first to understand the expected framework spec structure.
- direct_read `.github/specs/frameworks/<framework_name>.yaml`, where `<framework_name>` is the parameter passed to `@framework-process-merger`. Use it to resolve `<moduleFolder>` (see above).
- direct_read `.github/skills/agent-invocation-rules/SKILL.md`.
- direct_read `.github/skills/bro-gen-binding-rules/SKILL.md` (for `Merge Rules` reference only).
- direct_read `.github/state/framework-process-suggestions-normalized.txt`. If the file does not exist, there is nothing to merge.

## Workflow

### Step 1: Detect Work
1. If `.github/state/framework-process-suggestions-normalized.txt` is absent or empty:
   - Output the exact string "[DELEGATION COMPLETE]" and terminate. (Do NOT emit `REBIND-REQUIRED`.)

### Step 2: Locate Target YAML
1. Resolve `<moduleFolder>` from the framework spec as described above.
2. The target file is exactly `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml`.
3. If this file does not exist, abort with an error. Do NOT create it, do NOT search elsewhere, do NOT use a different framework's YAML as a template.

### Step 3: Merge (key-aware, no duplicates)
*(MANDATORY procedure for every entry in the normalized fragment — do NOT shortcut with a blind append.)*

1. **View the full target YAML first.** You must have its current structure in context before editing. Identify each top-level section that exists (`classes:`, `protocols:`, `enums:`, `categories:`, `functions:`, `constants:`, etc.).
2. **For each top-level section in the normalized fragment:**
   - If the section already exists in the target, merge under it. Do NOT create a second sibling section with the same name.
   - If the section does not exist, add it once, in a sensible location (preferably grouped with related sections).
3. **For each entry inside a section (e.g. a class name, protocol name, enum name, function name, constant name):**
   - Look up that exact key under the existing section in the target YAML.
   - **If the key already exists:** merge the new sub-fields *into* the existing entry. Specifically:
     - Add missing sub-keys (e.g. `methods:`, `properties:`, `name:`, `extends:`) only if absent.
     - For list-valued sub-keys (`methods:`, `properties:`, etc.), append only the items that are not already present (compare by selector/name).
     - For scalar sub-keys, do NOT overwrite an existing manually-set value; skip and keep the existing one.
   - **If the key does not exist:** insert the entire normalized entry as a new child of the section.
   - **Never** emit two entries with the same key under the same mapping. If you find yourself about to write a key that already exists at the same indentation level, stop and merge instead.
4. **Preserve manual customizations.** Comments, ordering of unrelated entries, and any sub-keys not mentioned by the normalized fragment must remain untouched.
5. Use `apply_patch` for all YAML edits. Make minimal, targeted patches anchored to the existing entry — not bulk appends at the end of the file.
6. If the merge fails for any reason, report the error and exit immediately.

### Step 4: Validate
1. After all patches are applied, re-read the target YAML and verify:
   - The file parses as valid YAML. Run a parse check, using command `yamllint -d '{rules: {key-duplicates: enable}}' <path-to-yaml>`.
2. **If validation finds duplicate keys (sections or entries) introduced by your merge — you MUST fix them, not abort.** This is a self-recovery step:
   - For every duplicated top-level section, fold all child entries into the FIRST occurrence and delete the later occurrence(s) of the section header.
   - For every duplicated entry key inside a section, fold the sub-fields of the later occurrence(s) into the FIRST one, applying the same per-entry merge rules as in Step 3.3 (add missing sub-keys; for list-valued sub-keys append only missing items by selector/name; never overwrite existing scalar values). Then delete the later duplicate occurrence(s).
   - Use `apply_patch` for these deduplication edits. Make minimal, targeted patches.
   - Re-run the validation checks. Repeat the dedup pass at most ONCE more if any duplicates remain.
   - Only after the YAML parses cleanly AND has zero duplicate keys, proceed to Step 5.
3. If validation fails for any reason other than duplicate keys (e.g. YAML parse error, broken indentation, malformed structure):
   - Attempt a single targeted fix with `apply_patch` if the cause is obvious.
   - If it still does not parse after one fix attempt, report the exact validation error and exit immediately. Do NOT emit `REBIND-REQUIRED`. Do NOT delete the normalized state file (so the issue can be re-attempted).

### Step 5: Cleanup & Signal
1. On successful merge AND successful validation, delete `.github/state/framework-process-suggestions-normalized.txt` so the same fragment is not re-applied.
2. Output `REBIND-REQUIRED` on its own line, followed by `[DELEGATION COMPLETE]`, and terminate execution.
