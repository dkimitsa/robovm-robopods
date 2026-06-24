---
name: framework-process-install
description: 'Compiles the framework module and installs it to maven-local.'
tools: ['run_in_terminal', 'read_file']
---

# Framework Process Install Agent
This subagent is the last stage of the framework binding pipeline.  Everything shall be valid at this point and the module should compile and install to maven-local.

## RESTRICTIONS (CRITICAL)
- Follow `.github/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- DO NOT search any file, do not create any file, do not try to fix things or recover.
- DO NOT loop. You get ONE compilation attempt.
- DO NOT spawn unauthorized tools.
- DO NOT create any missing files. Report error and stop.
- DO NOT guess paths. If `<moduleFolder>` is not present in the spec, abort with an error.

## Required Inputs
*IMPORTANT*: if stated "Read file", you must use the `read_file` tool with the exact path. Do NOT use `file_search` or any other discovery search to verify their presence.
- Resolve `<moduleFolder>` from the framework spec as described above. If it cannot be resolved, abort with an error.
- Read file `.github/specs/framework-spec.md` first to understand the expected framework spec structure.
- Read file `.github/specs/frameworks/<framework_name>.yaml`, where `<framework_name>` is the parameter passed to `@framework-process-install`.
- Read file `.github/skills/agent-invocation-rules/SKILL.md`.
- Do not continue and return an error if expected spec files are missing.

## Workflow

### Step 1: Compile
1. Resolve `<moduleFolder>` from the framework spec as described above.
2. Use `run_in_terminal` to compile the module: `mvn -f <moduleFolder>/pom.xml install`.

### Step 2: Evaluate
1. **If compilation succeeds:**
   - Output the exact string "[DELEGATION COMPLETE]" and terminate.

2. **If compilation fails:**
   - Report the compilation error and exit immediately. (Do NOT attempt to fix or recover.)
