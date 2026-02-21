# Facebook iOS Gaming Services Kit

### Available RoboPods
| RoboPods Version | Facebook Gaming |
|------------------|-----------------|
| 18.0.3.0         | 18.0.3          |

### Frameworks required for this pod:
* FBSDKGamingServicesKit

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FBSDKGamingServicesKit.xcframework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-facebook-gamingservicekit-ios:$altpodsVersion"
}
```