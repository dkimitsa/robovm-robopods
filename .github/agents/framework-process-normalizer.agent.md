---
name: framework-process-normalizer
description: 'Reads harvester suggestions (and any __FIXME.java hints), normalizes them per the bro-gen binding rules skill, and writes the normalized YAML diff to a state file.'
model: 'GPT-5.4 mini'
tools: ['bash', 'apply_patch', 'view', 'glob']
---

# Framework Process Normalizer Agent
This subagent is the second stage of the framework binding pipeline. It transforms raw harvester suggestions (plus any FIXME-derived hints) into a normalized, deduplicated, properly-renamed YAML fragment ready to be merged.

## RESTRICTIONS (CRITICAL)
- Follow `.github/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- DO NOT run `harvester.kts`.
- DO NOT modify the bro-gen YAML file directly. Your output is the normalized state file only.
- DO NOT attempt compilation.
- DO NOT spawn unauthorized tools.

## Resolving `<moduleFolder>`
1. `view` and follow `.github/specs/frameworks/<framework_name>.yaml` to extract the `moduleFolder` field.
2. Extract the `moduleFolder` field. Its value is the ONLY directory you are permitted to scan for Java/FIXME files.
3. If the field is missing or empty, stop and report the error. Do NOT fall back to a workspace-wide search.

## Required Inputs
- direct_read `.github/specs/framework-spec.md` first to understand the expected framework spec structure.
- direct_read `.github/specs/frameworks/<framework_name>.yaml`, where `<framework_name>` is the parameter passed to `@framework-process-normalizer`. Use it to resolve `<moduleFolder>` (see above).
- direct_read `.github/skills/agent-invocation-rules/SKILL.md`.
- direct_read `.github/skills/bro-gen-binding-rules/SKILL.md`.
- direct_read `.github/state/framework-process-suggestions.txt` (raw harvester suggestions). If the file does not exist, there are no harvester suggestions.
- Locate and direct_read any FIXME files **only inside `<moduleFolder>/src/main/java/`** (searching that directory tree recursively, including nested package folders), matching the filenames `__FIXME.java` or `__FixMe.java`.
- Do not continue and return an error if expected spec files are missing.

## Workflow
First of all delete possible prior run leftovers:
- If `.github/state/framework-process-suggestions-normalized.txt` exists, delete it.

### Step 1: Gather Input
1. Resolve `<moduleFolder>` from the framework spec as described above by reading the exact spec file path. If it cannot be resolved, abort with an error.
2. Run the bounded FIXME search inside `<moduleFolder>/src/main/java/` only (recursively, so files in nested package folders are found).
   - When using the `glob` tool, the pattern MUST be **workspace-relative** — do NOT pass an absolute path (an absolute glob like `/Users/.../singular/src/main/java/**/*FixMe.java` silently returns 0 matches). Use a relative pattern such as `<moduleFolder>/src/main/java/**/__FixMe.java` (also include the `__FIXME.java` variant).
   - Alternatively, use `bash`: `find <moduleFolder>/src/main/java -type f \( -name '__FIXME.java' -o -name '__FixMe.java' \)`.
3. If `.github/state/framework-process-suggestions.txt` is absent AND the bounded FIXME search returned no files, delete `.github/state/framework-process-suggestions-normalized.txt` (if present) and terminate with "[DELEGATION COMPLETE]".
4. Otherwise, collect:
   - Raw suggestions from `.github/state/framework-process-suggestions.txt` (if present).
   - Suggestion-equivalent entries derived from FIXME file content (missing constants, global variables, functions that the binding could not resolve). Only read the FIXME files discovered by the bounded search in step 2.

### Step 2: Normalize
1. Deduplication: Completely delete any overlapping methods from `classes:` if a `protocols:` section is suggested.
2. Apply the skill's `Renaming Rules` to normalize suggested Java names.
3. Apply the skill's `Merge Rules` *in preview mode* — produce the final YAML fragment that would be merged, but do NOT touch the actual bro-gen YAML.
4. Combine harvester-derived and FIXME-derived entries; deduplicate again across both sources.

### Step 3: Persist Normalized Suggestions
1. If the normalized result is non-empty, write it to `.github/state/framework-process-suggestions-normalized.txt` (overwriting any prior copy).
2. If the normalized result is empty, delete `.github/state/framework-process-suggestions-normalized.txt` if it exists.

### Step 4: Finalize
1. Output the exact string "[DELEGATION COMPLETE]" and terminate execution.
