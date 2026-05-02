# Firebase iOS Authentication framework

### Available RoboPods
| RoboPods Version | FirebaseAuth  |
|------------------|---------------|
| 12.12.0.0        | 12.12.0       |
| 12.10.0.0        | 12.10.0       |
| 12.9.0.0         | 12.9.0        |

### Frameworks required for this pod: 
* FirebaseAppCheckInterop.xcframework (from Firebase.zip/FirebaseAuth/FirebaseAppCheckInterop.xcframework)
* FirebaseAuth.xcframework (from Firebase.zip/FirebaseAuth/FirebaseAuth.xcframework)
* GTMSessionFetcher.xcframework (from Firebase.zip/FirebaseAuth/GTMSessionFetcher.xcframework)
* RecaptchaInterop.xcframework (from Firebase.zip/FirebaseAuth/RecaptchaInterop.xcframework)

Plus ones required for ios-core module:
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* GoogleAppMeasurement.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.xcframework)
* GoogleAppMeasurementIdentitySupport.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurementIdentitySupport.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseAuth.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-auth-ios:$altpodsVersion"
}
```