# Google SignIn iOS framework

Upstream repository: https://github.com/google/GoogleSignIn-iOS

### Available RoboPods
| RoboPods Version | Google SignIn  |
|------------------|----------------|
| 10.1.0.0         | 10.1.0         |
| 10.0.0.0         | 10.0.0         |
| 9.2.0.0          | 9.2.0          |
| 9.1.0.0          | 9.1.0          |

### Frameworks required for this pod:

#### 1. Picked from CocoaPods (`GoogleSignIn-iOS` repository):
* `GoogleSignIn.xcframework`
* `AppAuth.xcframework`
* `GTMAppAuth.xcframework`
* `Promises.xcframework`

#### 2. Available in Firebase package:
* `FBLPromises.xcframework` (from `FirebaseAnalytics`)
* `GoogleUtilities.xcframework` (from `FirebaseAnalytics`)
* `GTMSessionFetcher.xcframework` (from `FirebaseAuth` or `FirebaseStorage`)
* `AppCheckCore.xcframework` (from `FirebaseAppCheck`)
* `RecaptchaInterop.xcframework` (from `FirebaseAuth` or `FirebaseAppCheck`)

### To use this pod configure your `robovm.xml`

```xml
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleSignIn.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```groovy
repositories {
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-signin-ios:$altpodsVersion"
}
```