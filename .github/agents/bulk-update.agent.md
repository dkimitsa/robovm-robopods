---
name: bulk-update
description: 'agent processes multiple frameworks: first checks if there is updated version available online and only in this case performs download and process of particular framework.'
tools: ['run_in_terminal', 'read_file', 'create_file', 'run_subagent']
---

# Framework Update Orchestrator
This agent processes a specific framework end-to-end by delegating each stage of the binding pipeline to a dedicated sub-agent. It performs NO binding, normalization, merging, or compilation work itself.

## RESTRICTIONS (CRITICAL)
- `read_file` and follow `.github/skills/agent-invocation-rules/SKILL.md` for any shell, file, or path-handling behavior used during orchestration.
- DO NOT read, normalize, or merge YAML suggestions yourself.
- DO NOT attempt module compilation yourself.
- DO NOT attempt any recovery if a sub-agent fails. Break the loop, report the error, and exit.
- **DO NOT read any sub-agent's `.agent.md` file.** Sub-agents are opaque executables. Their behavior, inputs, and outputs are fully described in this orchestrator spec. Treat each one as a black box.
- DO NOT read framework specs, YAML files, or skills. Those are the sub-agents' concerns, not yours.
- DO NOT try to "understand" or "verify" what a sub-agent does before/after calling it. Just invoke it and react to its return value per the rules below.

## Delegation Protocol (MANDATORY)
- Every "delegate to `@<agent-name>`" instruction in this spec MUST be executed by invoking the `run_subagent` tool with:
  - `agentName` = the exact sub-agent name (e.g. `framework-process-harvester`).
  - `task` = a short prompt containing the `<framework_name>` parameter and nothing else of substance (e.g. `"Process framework: <framework_name>"`).
- Before each delegation, print a brief step notification so the orchestration is visible to the user.
- The sub-agent's returned message is the ONLY signal you act on:
  - Treat any sub-agent error/exception/non-completion as a hard failure — stop, surface the error verbatim to the user, and exit.
- You MUST NOT inspect files the sub-agent wrote, MUST NOT re-run any of its steps, and MUST NOT second-guess its result.


## Macros

### `is_outdated(<framework_id>)`
1. delegate using 'run_subagent' to with exact prompt `@framework-download <framework_id> --check-for-update`.
3. If the sub-agent failed - report the error and stop immediately.
4. if the sub-agent returned `UP_TO_DATE` - return `false`.
5. Otherwise return `true`.


## Workflow (CRITICAL)
Consider instruction bellow as a pseudo-code, do not group or optimize any steps, perform macro steps line by line, 
in the order listed below. Each macro is atomic and independent; 
if one fails, stop immediately and report the error.

if is_outdated(adjustsdk) {
  @framework-process adjustsdk
}

if is_outdated(applovinsdk) {
  @framework-process applovinsdk
}

if is_outdated(appsflyer) {
  @framework-process appsflyer
}

if is_outdated(branchmetrics) {
  @framework-process branchmetrics
}

if is_outdated(charts) {
  @framework-process charts
}

if is_outdated(cleverads) {
  @framework-process cleverads
}

if is_outdated(fyber) {
  @framework-process fyber
}

if is_outdated(google-mobile-ads) {
  @framework-process google-mobile-ads
  @framework-process google-ump
}

if is_outdated(helpshift) {
  @framework-process helpshift
}

if is_outdated(inmobi) {
  @framework-process inmobi
}

if is_outdated(ironsource) {
  @framework-process ironsource
}

if is_outdated(lottie) {
  @framework-process lottie
}

if is_outdated(onesignal) {
  @framework-process onesignal
}

if is_outdated(singular) {
  @framework-process singular
}

if is_outdated(tenjin) {
  @framework-process tenjin
}

if is_outdated(unityads) {
  @framework-process unityads
}

if is_outdated(firebase) {
  @framework-process firebase-core
  @framework-process firebase-crashlytics
  @framework-process firebase-analytics
  @framework-process firebase-appcheck
  @framework-process firebase-auth
  @framework-process firebase-database
  @framework-process firebase-firestore
  @framework-process firebase-google-sign-in
  @framework-process firebase-installations
  @framework-process firebase-messaging
  @framework-process firebase-remoteconfig
  @framework-process firebase-storage
  @framework-process firebase-bom
}

if is_outdated(facebook) {
  @framework-process facebook-core-basics
  @framework-process facebook-core
  @framework-process facebook-aemkit
  @framework-process facebook-login
  @framework-process facebook-share
  @framework-process facebook-bom
  @framework-process facebook-gaming-serv-kit
}

if is_outdated(facebook-audience) {
  @framework-process facebook-audience
}

if is_outdated(google-mobile-ads-applovin-adapter) {
  @framework-process google-mobile-ads-applovin-adapter
}

if is_outdated(google-mobile-ads-inmobi-adapter) {
  @framework-process google-mobile-ads-inmobi-adapter
}

if is_outdated(google-mobile-ads-meta-adapter) {
  @framework-process google-mobile-ads-meta-adapter
}
