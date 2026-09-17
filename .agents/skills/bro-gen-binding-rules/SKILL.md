---
name: bro-gen-binding-rules
description: Rules for evaluating bro-gen or harvester suggestions and safely merging them into RoboVM framework binding YAML files.
---

# bro-gen binding rules

Use this skill whenever an agent session needs to interpret suggested binding entries and modify a framework binding YAML.

## Suggestion Handling Rules
Suggestions are captured from `harvester.kts` output and represent YAML sections that may contain new entries to be merged into existing bro-gen YAML files. These suggestions are drafts and MUST be reviewed and renamed before writing into the final bro-gen YAML.

Bro-gen prints suggestions when:
- An entity (class/protocol/enum) is missing in the bro-gen YAML.
- A method or property is missing in the bro-gen YAML.
- A method or property name cannot be generated automatically from an Obj-C selector, resulting in `$` chars in the suggested Java name.

## Renaming Rules (Algorithmic)
You must apply the following transformations to the `name:` field of suggested entries to remove placeholders.

1. **Constructors:** Any method starting with `-init` MUST be renamed to exactly `init`.
    - *Example:* `name: initWithDevKey$appleAppId$` → `name: init`

2. **Special Characters ($):** If the suggested name contains a `$`, truncate the string at the very first `$`.
    - *Example:* `name: setHost$hostName$` → `name: setHost`

    2a. **Protocol/Delegate Methods (target as first parameter):** In protocol (delegate) methods the delegating target is conventionally passed as the *first* parameter, so the first token before `$` is just the target name, not the event. In this case do NOT keep the first token — use the token after the first `$` (the actual event) as the method name, then apply the remaining rules.
    - *Example:* `name: messaging$didReceiveRegistration$` → `name: didReceiveRegistration`
    - *Rationale:* Many methods share the same first parameter (e.g. `messaging`); the distinguishing, meaningful name is the event (`didReceiveRegistration`).

3. **Keyword Truncation (With):** If the remaining name contains the word `With`, truncate the string immediately before `With`.
    - *Example:* `name: setPartnerDataWithPartnerId` → `name: setPartnerData`

4. **Collision Safety:** If applying Rules 2 or 3 results in duplicate method names within the same class/protocol (which causes Java signature conflicts if parameter types are identical), you MUST retain the distinguishing suffix for the conflicting methods.
    - *Example:* Retain `setPartnerDataWithId` if `setPartnerData` already exists and shares the same parameter types.

## Grouping & Resolution Rules
When handling global constants, values, or functions, apply the following structural grouping:
1. **Values & Constants:** Group them by their return type. If a value or constant evaluates to a specific framework class (e.g., `SomeType valueA`), move it into the `SomeType` class configuration.
2. **Functions:** Group them by their primary target. If the first argument of a function is an instance of an available class (e.g., `foo(SomeClass inst)`), move that function into `SomeClass`.
3. **Swift Exclusions:** Exclude any Swift-specific constants, macros, or artifacts (e.g., `SWIFT_TYPEDEFS`). Do not generate bindings for them. Instead of listing each symbol individually, add a regex exclusion rule that matches the whole `SWIFT_` family:
    ```yaml
    SWIFT_.*:
        exclude: true
    ```
4. **No FixMe Sink Bindings:** Never preserve or introduce `__FixMe`, `__FIXME`, `*FixMe`, or similar placeholder classes as the final destination for a suggestion. If an entity is only known from a FixMe hint, resolve it to the actual owning class/protocol/enum using the header or symbol context.
5. **Unresolved Entities / User Consultation:** If the correct class belonging or mapping for a constant, value, function, or FIXME hint cannot be definitively resolved using the rules above:
   - NEVER silently drop or ignore the entity (silent dropping leaves `__FixMe.java` or unresolved bindings behind).
   - The agent MUST ask the user using `ask_question` how to proceed:
     - **Exclude:** Exclude the symbol from bindings (`exclude: true`) if it is unused, internal, or already bound elsewhere.
     - **Map to Class:** Place the symbol into a specific target class/utility (e.g. `class: TargetClass`, `name: CustomName`).
     - **Skip:** Drop the entity from the current normalization pass without generating YAML entries.
   - Do NOT guess or invent class associations without user confirmation.

## Name Cleanup Rules
When normalizing generated Java names, remove tool-added prefixes before applying the rest of the merge rules:
1. Strip leading `Value_`, `function_`, and `Constant__` prefixes from suggested `name:` values.
2. After prefix stripping, apply the renaming rules above (`init`, `$`, and `With` cleanup) as needed.

## Merge Rules
- DO NOT copy suggestion blocks into the bro-gen YAML verbatim if they still contain `$` or unoptimized `With` placeholders.
- Merge only the safe, normalized entries into the existing YAML structure.
- Preserve all unrelated manual YAML customization, comments, ordering, and formatting.
- Post-merge validation: Ensure no new `name:` value still contains `$`, unnecessary `initWith...`, or untrimmed `...With...` naming when a clearer Java name can be derived.