# Facebook iOS AEM Kit framework

### Available RoboPods
| RoboPods Version | Facebook AEM Kit |
|------------------|------------------|
| 18.1.0.0         | 18.1.0           |
| 18.0.3.0         | 18.0.3           |

### Use the dynamic version of frameworks
FBAEMKit.framework is available for a download as `FacebookSDK_Dynamic.framework.zip`.

### Frameworks required for this pod:
* FBAEMKit.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FBAEMKit.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-facebook-aem-ios:$altpodsVersion"
}
```