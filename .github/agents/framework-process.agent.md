---
name: framework-process
description: 'Orchestrates the framework binding pipeline by delegating to harvester, normalizer, merger, and compiler sub-agents in a bounded loop (max 5 tries).'
tools: ['run_in_terminal', 'read_file', 'create_file', 'run_subagent']
---

# Framework Process Orchestrator
This agent processes a specific framework end-to-end by delegating each stage of the binding pipeline to a dedicated sub-agent. It performs NO binding, normalization, merging, or compilation work itself.

## RESTRICTIONS (CRITICAL)
- `read_file` and follow `.github/skills/agent-invocation-rules/SKILL.md` for any shell, file, or path-handling behavior used during orchestration.
- DO NOT run `harvester.kts` directly.
- DO NOT read, normalize, or merge YAML suggestions yourself.
- DO NOT attempt module compilation yourself.
- DO NOT attempt any recovery if a sub-agent fails. Break the loop, report the error, and exit.
- DO NOT exceed 5 iterations of the orchestration loop.
- **DO NOT read any sub-agent's `.agent.md` file.** Sub-agents are opaque executables. Their behavior, inputs, and outputs are fully described in this orchestrator spec. Treat each one as a black box.
- DO NOT read framework specs, YAML files, skills, or state files. Those are the sub-agents' concerns, not yours.
- DO NOT try to "understand" or "verify" what a sub-agent does before/after calling it. Just invoke it and react to its return value per the rules below.

## Delegation Protocol (MANDATORY)
- Every "delegate to `@<agent-name>`" instruction in this spec MUST be executed by invoking the `run_subagent` tool with:
  - `agentName` = the exact sub-agent name (e.g. `framework-process-harvester`).
  - `task` = a short prompt containing the `<framework_name>` parameter and nothing else of substance (e.g. `"Process framework: <framework_name>"`).
- Before each delegation, print a brief step notification so the orchestration is visible to the user.
- The sub-agent's returned message is the ONLY signal you act on:
  - Search its text for the literal token `REBIND-REQUIRED` to decide whether to restart the loop.
  - Treat any sub-agent error/exception/non-completion as a hard failure — stop, surface the error verbatim to the user, and exit.
- You MUST NOT inspect files the sub-agent wrote, MUST NOT re-run any of its steps, and MUST NOT second-guess its result.

## Required Inputs
- `<framework_name>`: the parameter passed to `@framework-process`. It is forwarded verbatim to every sub-agent.

## Workflow

### Phase 1: Preparation
1. Initialize an internal counter: `attempt = 0`.

### Phase 2: Orchestration Loop (MAX 5 TRIES)
Repeat the following sequence:

**Step 1 — Loop Guard**
1. If `attempt >= 5`, stop, report "Framework process exceeded 5 attempts without stabilizing" and exit.
2. Otherwise, increment `attempt` by 1.

**Step 2 — Harvest**
1. Delegate to `@framework-process-harvester <framework_name>` via `run_subagent`.
2. If the sub-agent reports failure, stop, report its error, and exit. Do NOT attempt recovery.

**Step 3 — Normalize**
Optional: if '<framework_name>' ends with '-bom' there is no compilation/recovery step, so skip to Step 6.

1. Delegate to `@framework-process-normalizer <framework_name>` via `run_subagent`.
2. If the sub-agent reports failure, stop, report its error, and exit. Do NOT attempt recovery.

**Step 4 — Merge**
1. Delegate to `@framework-process-merger <framework_name>` via `run_subagent`.
2. If the sub-agent reports failure, stop, report its error, and exit.
3. If the sub-agent's returned text contains `REBIND-REQUIRED`, return to **Step 1** (re-run harvester with the updated YAML).
4. Otherwise, proceed to Step 5.

**Step 5 — Compile**
1. Delegate to `@framework-process-compiler <framework_name>` via `run_subagent`.
2. If the sub-agent reports failure, stop, report its error, and exit. Do NOT attempt recovery.
3. If the sub-agent's returned text contains `REBIND-REQUIRED`, return to **Step 1** (re-run harvester with the updated YAML).
4. Otherwise, proceed to Step 6.

**Step 6 — Install**
1. Delegate to `@framework-process-install <framework_name>` via `run_subagent`.
2. If the sub-agent reports failure, stop, report its error, and exit. Do NOT attempt recovery.
3. Otherwise, proceed to Phase 3.

### Phase 3: Finalization
1. Output the exact string "[DELEGATION COMPLETE]" and terminate execution.
