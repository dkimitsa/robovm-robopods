# Facebook iOS Audience framework
https://developers.facebook.com/docs/audience-network/guides/adding-sdk/ios

### Available RoboPods
| RoboPods Version | Facebook Audience |
|------------------|-------------------|
| 6.22.0.0         | 6.22.0            |
| 6.21.1.0         | 6.21.1            |
| 6.21.0.0         | 6.21.0            |

### Use the dynamic version of frameworks
It is available for a download as `FacebookSDK_Dynamic.framework.zip` and allows automatic swift dependency resolution.

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

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-facebook-audience-ios:$altpodsVersion"
}
```