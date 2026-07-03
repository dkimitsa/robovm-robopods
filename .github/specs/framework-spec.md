All framework configuration files in `/.github/specs/frameworks/*.yaml`. must strictly adhere to the structure described in this spec.

A framework spec tells an agent:
- which module folder the framework belongs to;
- where the upstream artifact comes from;
- where the downloaded framework should be staged locally;
- whether version suffix cleanup is required (e.x. removing latest component from x.y.z).

## Current structure
The current framework specs use a flat YAML object with scalar fields:
- `name`: Canonical framework name used by agents and matching the spec filename.
- `moduleFolder`: Repository module folder for the framework.
- `artifactSource`: Human-readable description of where the framework artifact should be downloaded from.
- `downloadLocation`: Local staging location for the downloaded and/or unpacked framework artifact.

## Example
```yaml
name: appsflyer
moduleFolder: appsflyer
artifactSource: latest release https://github.com/AppsFlyerSDK/AppsFlyerFramework, AppsFlyerLib.xcframework.zip from assets
downloadLocation: ./.robopods-wip/AppsFlyerLib.xcframework
```

## Agent expectations
Agents consuming these specs should assume:

- the file format is YAML;
- the top-level structure is a single mapping;
- unknown fields may exist and should be preserved unless an explicit workflow says otherwise;
- the documented fields above are the stable baseline currently in use.
