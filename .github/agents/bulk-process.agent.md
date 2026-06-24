---
name: bulk-process
description: 'TODO: fixme !'
tools: ['run_in_terminal', 'read_file', 'create_file', 'run_subagent']
---

# Framework Process Orchestrator
This agent processes a specific framework end-to-end by delegating each stage of the binding pipeline to a dedicated sub-agent. It performs NO binding, normalization, merging, or compilation work itself.

## RESTRICTIONS (CRITICAL)
- Follow `.github/skills/agent-invocation-rules/SKILL.md` for any shell, file, or path-handling behavior used during orchestration.
- DO NOT run `harvester.kts` directly.
- DO NOT read, normalize, or merge YAML suggestions yourself.
- DO NOT attempt module compilation yourself.
- DO NOT attempt any recovery if a sub-agent fails. Break the loop, report the error, and exit.
- DO NOT exceed 5 iterations of the orchestration loop.
- **DO NOT read any sub-agent's `.agent.md` file.** Sub-agents are opaque executables. Their behavior, inputs, and outputs are fully described in this orchestrator spec. Treat each one as a black box.
- DO NOT read framework specs, YAML files, or skills. Those are the sub-agents' concerns, not yours.
- You MAY read `.github/state/bulk_download` and `.github/state/bulk_process` because the state-tracking rules below require checking them before dispatching a macro.
- DO NOT try to "understand" or "verify" what a sub-agent does before/after calling it. Just invoke it and react to its return value per the rules below.

## Delegation Protocol (MANDATORY)
- Every "delegate to `@<agent-name>`" instruction in this spec MUST be executed by invoking the `run_subagent` tool with:
  - `agentName` = the exact sub-agent name (e.g. `framework-process-harvester`).
  - `task` = a short prompt containing the `<framework_name>` parameter and nothing else of substance (e.g. `"Process framework: <framework_name>"`).
- Before each delegation, print a brief step notification so the orchestration is visible to the user.
- The sub-agent's returned message is the ONLY signal you act on:
  - Treat any sub-agent error/exception/non-completion as a hard failure — stop, surface the error verbatim to the user, and exit.
- You MUST NOT inspect files the sub-agent wrote, MUST NOT re-run any of its steps, and MUST NOT second-guess its result.

## State Tracking
- `.github/state/bulk_download` tracks frameworks that were downloaded and staged successfully.
- `.github/state/bulk_process` tracks frameworks that were processed successfully.
- If a framework id is already present in the matching state file, the corresponding macro MUST be skipped entirely and the state file MUST remain unchanged.

## Macros

### `perform_download(<framework_id>)`
1. run in terminal `grep -qx '<framework_id>' '.github/state/bulk_download' && echo PRESENT`, if PRESENT, skip the macro and leave `.github/state/bulk_download` unchanged.
2. Otherwise delegate to `@framework-download <framework_id>`.
3. If the sub-agent succeeds, append `<framework_id>` to `.github/state/bulk_download`; if it fails, report the error and stop immediately.
4. Done

### `perform_process(<framework_id>)`
1. run in terminal `grep -qx '<framework_id>' '.github/state/bulk_process' && echo PRESENT`, if PRESENT, skip the macro and leave `.github/state/bulk_process` unchanged.
2. Otherwise delegate to `@framework-process <framework_id>`.
3. If the sub-agent succeeds, append `<framework_id>` to `.github/state/bulk_process`; if it fails, report the error and stop immediately.
4. Done

## Workflow (CRITICAL)
do not group or optimize any steps, perform macro steps line by line, in the order listed below. Each macro is atomic and independent; if one fails, stop immediately and report the error.

- perform_download(adjustsdk)
- perform_process(adjustsdk)

- perform_download(applovinsdk)
- perform_process(applovinsdk)

- perform_download(appsflyer)
- perform_process(appsflyer)

- perform_download(branchmetrics)
- perform_process(branchmetrics)

- perform_download(charts)
- perform_process(charts)

- perform_download(cleverads)
- perform_process(cleverads)

- perform_download(fyber)
- perform_process(fyber)

- perform_download(google-mobile-ads)
- perform_process(google-mobile-ads)
- perform_process(google-ump)

- perform_download(helpshift)
- perform_process(helpshift)

- perform_download(inmobi)
- perform_process(inmobi)

- perform_download(ironsource)
- perform_process(ironsource)

- perform_download(lottie)
- perform_process(lottie)

- perform_download(onesignal)
- perform_process(onesignal)

- perform_download(singular)
- perform_process(singular)

- perform_download(tenjin)
- perform_process(tenjin)

- perform_download(unityads)
- perform_process(unityads)

- perform_download(firebase)
- perform_process(firebase-core)
- perform_process(firebase-crashlytics)
- perform_process(firebase-analytics)
- perform_process(firebase-appcheck)
- perform_process(firebase-auth)
- perform_process(firebase-database)
- perform_process(firebase-firestore)
- perform_process(firebase-google-sign-in)
- perform_process(firebase-installations)
- perform_process(firebase-messaging)
- perform_process(firebase-remoteconfig)
- perform_process(firebase-storage)
- perform_process(firebase-bom)

- perform_download(facebook)
- perform_process(facebook-core-basics)
- perform_process(facebook-core)
- perform_process(facebook-aemkit)
- perform_process(facebook-gaming-serv-kit)
- perform_process(facebook-login)
- perform_process(facebook-share)
- perform_process(facebook-bom)

- perform_download(facebook-audience)
- perform_process(facebook-audience)

- perform_download(google-mobile-ads-applovin-adapter)
- perform_process(google-mobile-ads-applovin-adapter)

- perform_download(google-mobile-ads-inmobi-adapter)
- perform_process(google-mobile-ads-inmobi-adapter)

- perform_download(google-mobile-ads-meta-adapter)
- perform_process(google-mobile-ads-meta-adapter)
