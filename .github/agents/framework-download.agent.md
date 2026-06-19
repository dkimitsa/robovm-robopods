---
description: Sub-agent for downloading, unpacking, renaming, and staging native iOS framework artifacts.
tools: ['read_file', 'create_file', 'run_in_terminal', 'list_dir', 'get_errors']
---

# Framework download
Perform the download, unpack, and stage steps for iOS frameworks based on spec definitions.

## Strict Rules
- You must accept either `@framework-download <framework_name>` or `@framework-download <framework_name> <existing_version>`.

## Shared Invocation Rules
Follow `.github/skills/agent-invocation-rules/SKILL.md` for repository pathing, fail-fast behavior, terminal safety, curl redirects, and bounded command scope.


## Required Context Files
1. `.github/specs/framework-spec.md` (Defines structure)
2. `.github/specs/frameworks/<framework_name>.yaml` (Target spec)
3. `.github/skills/agent-invocation-rules/SKILL.md` (Shared command and pathing rules)

## Execution Workflow

### Phase 1: Context & Resolution
1. Read `.github/specs/frameworks/<framework_name>.yaml`.
2. Locate the `artifactSource` field.
3. You are permitted to use reasoning here: Translate the natural language instructions in `artifactSource` into the necessary terminal commands (e.g., using `curl`, `grep`, or a browser tool) to determine the latest `X.Y.Z` version.
4. Extract ONLY the resolved version number.

### Phase 2: Local Cache Check
5. Check if `downloadLocation` exists.
6. If it exists, read `<downloadLocation>/.version-metadata`.
7. If the metadata matches the resolved upstream version, skip to Phase 5.

### Phase 3: Download & Stage
8. Translate the remaining download and extraction instructions in `artifactSource` into exact shell commands.
9. Use the `run_in_terminal` tool to execute the directory creation, download, and unzip processes step-by-step.
10. Verify the resulting `.xcframework` or `.framework` exists in the exact `downloadLocation` path.

### Phase 4: Local Metadata
11. Write the resolved upstream version to a `.version-metadata` file inside the `downloadLocation`.

### Phase 5: Shared State Update
12. Ensure `.github/state/` directory exists.
13. Overwrite or create `.github/state/framework-download.yaml` as a top-level YAML mapping.
14. Write the key-value pair `framework_name: resolved_upstream_version` into the state file.
15. STOP and exit successfully.