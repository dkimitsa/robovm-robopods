# Facebook iOS Audience framework

### Use the dynamic version of frameworks
It is available for a download as `FacebookSDK_Dynamic.framework.zip` and allows automatic swift dependency resolution. In case static linking is required swift libs should be specified manually in `robovm.xml`:
```xml
<libs>
    <lib>libswiftCore.dylib</lib>>
    <lib>libswiftCoreFoundation.dylib</lib>>
    <lib>libswiftCoreGraphics.dylib</lib>>
    <lib>libswiftCoreImage.dylib</lib>>
    <lib>libswiftDarwin.dylib</lib>>
    <lib>libswiftDispatch.dylib</lib>>
    <lib>libswiftFoundation.dylib</lib>>
    <lib>libswiftMetal.dylib</lib>>
    <lib>libswiftObjectiveC.dylib</lib>>
    <lib>libswiftQuartzCore.dylib</lib>>
    <lib>libswiftUIKit.dylib</lib>>

    <lib>swiftCompatibility51</lib>
</libs>
```

### Frameworks required for this pod:
* FBAudienceNetwork.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FBAudienceNetwork.framework is located -->
    </frameworkPaths>
</config>
```

## Versions

| RoboPods Version | FBAudience Version |
|------------------|--------------------|
| 1.50.0           | 6.20.0             |
| 1.24.0           | 6.11.1             |
| 1.19.0           | 6.9.0              |
| 1.12.0           | 6.0.0              |
| 1.8.0            | 5.9.0              |
| 1.7.1            | 5.8.0              |
| 1.5.0            | 5.6.1              |
| 1.4.0            | 5.6.0              |
| 1.3.0            | 5.5.0              |

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-facebook-audience-ios:$altpodsVersion"
}
```
