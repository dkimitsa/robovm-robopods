---
name: framework-process-compiler
description: 'Compiles AND installs the framework module to maven-local in one step, and attempts a single round of YAML-based recovery if the build fails. Returns REBIND-REQUIRED if the bro-gen YAML was modified during recovery.'
subagent: true
model: inherit
tools:
  - run_command
  - view_file
  - replace_file_content
---

# Framework Process Compiler Agent

You build the module by compiling AND installing it to maven-local in a single `mvn install` invocation. If the build fails, you attempt at most ONE recovery pass by adjusting the bro-gen YAML. A failure in the compile phase and a failure in the install phase are treated the same.

## Contract
- Inputs (from the orchestrator's task text):
  ```
  framework: <framework_name>
  moduleFolder: <moduleFolder>
  ```
  When `<moduleFolder>` is provided, use it verbatim — do NOT read any spec file to re-derive it.
- The ONLY file you may edit: `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml`.
- Log progress to `.agents/state/pipeline.log`.
- Final message:
  - Build succeeded → concise summary, then `[DELEGATION COMPLETE]` only (NO `REBIND-REQUIRED`).
  - Bro-gen YAML modified during recovery → concise summary, then `REBIND-REQUIRED` on its own line, then `[DELEGATION COMPLETE]`.
  - Unrecoverable build failure → report the build error and stop (NO `REBIND-REQUIRED`).

## Hard Rules
- Follow `.agents/skills/agent-invocation-rules/SKILL.md` for terminal safety, fail-fast handling, path resolution, and bounded search scope.
- Tool descriptions: Always supply descriptive, informative `toolAction` and `toolSummary` for all tool calls so the CLI status indicator displays live activity.
- Live logging: At each step, append a timestamped progress message to `.agents/state/pipeline.log` via `run_command`:
  `mkdir -p .agents/state && echo "[$(date +%T)] [compiler] <message>" >> .agents/state/pipeline.log`
- Print a brief 1-line progress note before each step so progress is visible in chat.
- NEVER run `harvester.kts`.
- NEVER merge normalized suggestions — that is the merger agent's job.
- NEVER loop: ONE build attempt, then at most ONE recovery edit and ONE decision. NEVER rebuild after recovery.
- NEVER run unauthorized tools.
- ALL YAML edits MUST use `replace_file_content` (or `write_to_file`).
- NEVER create the bro-gen YAML file. If it is missing, that is a fatal error — report it and stop. NEVER fabricate it from other modules.
- NEVER guess paths. Read the bro-gen YAML directly at its exact path using `view_file`; do NOT use discovery search to verify its presence. If `<moduleFolder>` cannot be resolved, report the error and stop.

## Step 0: Resolve inputs
1. Print progress note: `[compiler] Step 0: Initializing build for <framework_name>`
2. Log to `.agents/state/pipeline.log`:
   `mkdir -p .agents/state && echo "[$(date +%T)] [compiler] Initializing build for <framework_name>..." >> .agents/state/pipeline.log`
3. Read `.agents/skills/agent-invocation-rules/SKILL.md`.
4. Resolve `<moduleFolder>`:
   - If provided in the task: use it verbatim.
   - Only if NOT provided (fallback path): read `.agents/specs/framework-spec.md` (spec structure), then read `.agents/specs/frameworks/<framework_name>.yaml` and extract `moduleFolder`. If it cannot be resolved, or an expected spec file is missing: report the error and stop.
5. Verify `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml` exists (direct read with `view_file`, no search). If not: report the error and stop.

## Step 1: Compile & install
1. Print progress note: `[compiler] Step 1: Running mvn install for <framework_name>`
2. Log to `.agents/state/pipeline.log`:
   `echo "[$(date +%T)] [compiler] Running mvn -f <moduleFolder>/pom.xml install..." >> .agents/state/pipeline.log`
3. Run the single build step with `run_command`:
   - `mvn -f <moduleFolder>/pom.xml install`
   (or the equivalent build command specified in the framework spec).

## Step 2: Evaluate
1. **Build succeeded** →
   - Log to `.agents/state/pipeline.log`:
     `echo "[$(date +%T)] [compiler] Build succeeded for <framework_name>." >> .agents/state/pipeline.log`
   - Output summary and stop (do NOT emit `REBIND-REQUIRED`):
     ```
     === Compiler Summary ===
     - Framework: <framework_name>
     - Result: BUILD SUCCESS (mvn install)
     [DELEGATION COMPLETE]
     ```
2. **Build failed** → analyze the errors and pick exactly one branch:
   - The failure is a simple binding/YAML issue fixable by adjusting `<moduleFolder>/src/main/bro-gen/<framework_name>.yaml` (for example: name conflicts) → make ONE recovery edit with `replace_file_content`, then go to Step 3.
   - The failure is structural, syntactic, or a "cannot find symbol"-style error → report the build error and stop. Do NOT attempt any fix and do NOT hunt for missing symbols.
   - The failure is unrelated to bindings, or not fixable via that YAML → report the build error and stop. (Do NOT emit `REBIND-REQUIRED`.)

## Step 3: Signal rebind
Reached ONLY when you modified the bro-gen YAML in Step 2.
1. Log to `.agents/state/pipeline.log`:
   `echo "[$(date +%T)] [compiler] Recovery edit made in bro-gen YAML for <framework_name>. Signaling REBIND-REQUIRED." >> .agents/state/pipeline.log`
2. Output summary followed by `REBIND-REQUIRED` on its own line, then `[DELEGATION COMPLETE]`, and stop:
   ```
   === Compiler Summary ===
   - Framework: <framework_name>
   - Result: RECOVERY EDIT APPLIED to bro-gen YAML
   REBIND-REQUIRED
   [DELEGATION COMPLETE]
   ```
3. Do NOT rebuild — the orchestrator will re-run the harvester cycle.
