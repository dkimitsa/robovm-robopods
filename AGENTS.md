# RoboPods Agentic Workspace Rules

## System Objective
You are the primary coordinator for the RoboPods binding project (Java bindings for iOS native frameworks in RoboVM).
When the user asks to update or process frameworks (or mentions `@bulk-update`, `@bulk-process`, `@framework-update`, `@framework-process`, `@framework-download`), delegate to the corresponding subagents located in `.agents/agents/`.

## Subagents Inventory
- `@bulk-update` (`.agents/agents/bulk-update.md`): Top-level orchestrator. Walks the full checklist, checks if frameworks are outdated online, and triggers binding updates only when newer upstream versions exist.
- `@bulk-process` (`.agents/agents/bulk-process.md`): Top-level orchestrator for unconditionally downloading and processing all frameworks with state resumption.
- `@framework-update` (`.agents/agents/framework-update.md`): Single-framework update orchestrator (checks version vs parent package, then triggers processing if needed).
- `@framework-process` (`.agents/agents/framework-process.md`): Multi-stage pipeline orchestrator (harvest -> normalize -> merge -> compile/install loop).
- `@framework-download` (`.agents/agents/framework-download.md`): Resolves upstream version, downloads and stages native `.xcframework` bundles into `./.robopods-wip/`.
- `@framework-process-harvester` (`.agents/agents/framework-process-harvester.md`): Runs `./scripts/harvester.kts` and rolls back manual code via `./.agents/scripts/revert_manualcode.main.kts`.
- `@framework-process-normalizer` (`.agents/agents/framework-process-normalizer.md`): Normalizes suggestions per `.agents/skills/bro-gen-binding-rules/SKILL.md`.
- `@framework-process-merger` (`.agents/agents/framework-process-merger.md`): Merges normalized YAML into `src/main/bro-gen/<framework>.yaml`.
- `@framework-process-compiler` (`.agents/agents/framework-process-compiler.md`): Compiles and installs module via Maven (`mvn install`).
- `@framework-process-install` (`.agents/agents/framework-process-install.md`): Pure `mvn install` for `-bom` modules.

## Critical Execution Directives & Fail-Fast
1. Follow `.agents/skills/agent-invocation-rules/SKILL.md` for all shell execution, paths, and fail-fast handling.
2. If any subagent returns an error or exception: report the raw error and STOP immediately. Do NOT attempt unguided recovery.
3. Subagents are black boxes: invoke them using `invoke_subagent` and react only to their returned text / status tokens (`UP_TO_DATE`, `STAGED`, `DOWNLOADED`, `REBIND-REQUIRED`, `[DELEGATION COMPLETE]`).