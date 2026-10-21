# Google SignIn iOS framework

Upstream repository: https://github.com/google/GoogleSignIn-iOS

### Available RoboPods
| RoboPods Version | Google SignIn  |
|------------------|----------------|
| 10.0.0.0         | 10.0.0         |
| 9.2.0.0          | 9.2.0          |
| 9.1.0.0          | 9.1.0          |

### Frameworks required for this pod: 
* AppAuth.xcframework
* AppCheckCore.xcframework
* GTMAppAuth.xcframework
* GTMSessionFetcher.xcframework
* FBLPromises.xcframework
* GoogleUtilities.xcframework
* GoogleSignIn.xcframework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleSignIn.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-signin-ios:$altpodsVersion"
}
```