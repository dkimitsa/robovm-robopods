---
description: Sub-agent for downloading, unpacking, renaming, and staging native iOS framework artifacts.
tools: ['read_file', 'create_file', 'run_in_terminal', 'list_dir', 'get_errors']
---

# Framework download
Perform the download, unpack, and stage steps for iOS frameworks based on spec definitions.

## Strict Rules
- You must accept either `@framework-download <framework_name>` or `@framework-download <framework_name> [--check-for-update]`.

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

### Phase2: Existing Version Check
RULE: Run this phase only when `--check-for-update` was passed. otherwise, skip to Phase 3.

1. Locate the `<moduleFolder>` from `.github/specs/frameworks/<framework_name>.yaml`.
2. Directly read the actual artifact version from `<moduleFolder>/pom.xml`. Do not attempt to search for this file, assume it exists and is readable. Fail if it does not exist or is unreadable.
3. Drop only any trailing patch/build suffix from the artifact version (for example, `1.2.3.4` becomes `1.2.3`) to derive the existing framework version.
4. Compare the derived existing framework version to the resolved upstream version from Phase 1 as exact semantic versions.
5. Treat the versions as the same only when `major.minor.patch` matches exactly after normalization; do not truncate to fewer components and do not use loose/prefix/string containment matching.
6. If the versions are the same, do not download, unpack, stage, or modify any local cache/state files.
7. Report `UP_TO_DATE` status and exit immediately.

### Phase 3: Local Cache Check
1. Check if `downloadLocation` exists.
2. If it exists, read `<downloadLocation>/.version-metadata`.
3. If the metadata matches the resolved upstream version, there is nothing to be done, report "STAGED", exit immediately.

### Phase 4: Download & Stage
1. Translate the remaining download and extraction instructions in `artifactSource` into exact shell commands.
2. Use the `run_in_terminal` tool to execute the directory creation, download, and unzip processes step-by-step.
3. Verify the resulting `.xcframework` or `.framework` exists in the exact `downloadLocation` path.

### Phase 5: Local Metadata
1. Write the resolved upstream version to a `.version-metadata` file inside the `downloadLocation`.

### Phase 6: Shared State Update
1. Ensure `.github/state/` directory exists.
2. Overwrite or create `.github/state/framework-download.yaml` as a top-level YAML mapping.
3. Write the key-value pair `framework_name: resolved_upstream_version` into the state file. 
4. STOP, report "DOWNLOADED" and exit successfully.

