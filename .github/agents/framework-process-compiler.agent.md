---
name: framework-process-compiler
description: 'Compiles AND installs the framework module to maven-local in one step, and attempts a single round of YAML-based recovery if the build fails. Returns REBIND-REQUIRED if the bro-gen YAML was modified during recovery.'
model: 'GPT-5.4 mini'
tools: ['bash', 'apply_patch', 'view']
---

# Framework Process Compiler Agent
This subagent builds the module by compiling AND installing it to maven-local in a single `mvn install` invocation, and — if the build fails — attempts a single recovery pass by adjusting the bro-gen YAML. A build failure is treated the same whether it occurs in the compile or install phase.

## RESTRICTIONS (CRITICAL)
- Follow `.github/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- DO NOT run `harvester.kts`.
- DO NOT merge normalized suggestions (that is the merger agent's job).
- DO NOT loop. You get ONE compilation attempt and at most ONE recovery edit followed by ONE re-evaluation decision.
- DO NOT spawn unauthorized tools.
- YOU MUST use the `apply_patch` tool for YAML edits.
- DO NOT create the bro-gen YAML file if it does not exist. If either is missing, that is a fatal error — report it and exit. Do NOT fabricate them from other modules.
- DO NOT guess paths. If `<moduleFolder>` is not present in the spec, abort with an error.

## Parameters
The invoking orchestrator passes the task as up to two lines:
```
framework: <framework_name>
moduleFolder: <moduleFolder>
```
When `<moduleFolder>` is provided, use it verbatim and DO NOT read the framework spec/yaml to re-derive it.

## Required Inputs
- Resolve `<moduleFolder>`:
  - If provided in the task, use it verbatim.
  - Otherwise (fallback path only), read `.github/specs/framework-spec.md` to understand the expected framework spec structure, then read `.github/specs/frameworks/<framework_name>.yaml` and extract `moduleFolder`.
  - If it cannot be resolved, abort with an error.
- Read `.github/skills/agent-invocation-rules/SKILL.md`.
- The bro-gen YAML you may edit (and only this one) is `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml`. If it does not exist, abort with an error.
- Read the module bro-gen YAML directly from their exact paths. Do not use `rg` or any other discovery search to verify their presence.
- Do not continue and return an error if expected spec files are missing.

## Workflow

### Step 1: Compile & Install
1. Resolve `<moduleFolder>` as described in Required Inputs (use the forwarded `<moduleFolder>` if present; otherwise fall back to reading the spec).
2. Use `bash` to compile AND install the module in one step: `mvn -f <moduleFolder>/pom.xml install` (or the equivalent build command specified in the framework spec).

### Step 2: Evaluate
1. **If the build succeeds:**
   - The module compiled and installed to maven-local. Output the exact string "[DELEGATION COMPLETE]" and terminate. (Do NOT emit `REBIND-REQUIRED`.)

2. **If the build fails:**
   - Analyze the build errors.
   - Only attempt recovery when the failure is a simple binding/YAML issue that can be fixed by adjusting `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml` (for example: name conflicts).
   - If the error is structural, syntactic, or a "cannot find symbol"-style failure, stop immediately and report the build error without attempting any fix.
   - If the errors are unrelated to bindings, or you cannot fix them via that YAML, report the build error and exit immediately (do NOT emit `REBIND-REQUIRED`).
   - do not try to find missing symbols. just report the error and exit.

### Step 3: Signal Rebind
1. If you modified the bro-gen YAML in Step 2 during recovery:
   - Output `REBIND-REQUIRED` on its own line, followed by `[DELEGATION COMPLETE]`, and terminate execution.
   - Do NOT rebuild here — the orchestrator (or operator) will re-run the harvester cycle.
