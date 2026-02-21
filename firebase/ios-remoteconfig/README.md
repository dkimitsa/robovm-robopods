# Firebase iOS RemoteConfig framework

### Available RoboPods
| RoboPods Version | Firebase RemoteConfig |
|------------------|-----------------------|
| 12.9.0.0         | 12.9.0                |

### Frameworks required for this pod: 
* FirebaseABTesting.xcframework (from Firebase.zip/FirebaseRemoteConfig/FirebaseABTesting.xcframework)
* FirebaseRemoteConfig.xcframework (from Firebase.zip/FirebaseRemoteConfig/FirebaseRemoteConfig.xcframework)
* FirebaseSharedSwift.xcframework (from Firebase.zip/FirebaseRemoteConfig/FirebaseSharedSwift.xcframework)
* FirebaseRemoteConfigInterop.xcframework (from Firebase.zip/FirebaseRemoteConfig/FirebaseRemoteConfigInterop.xcframework)

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
        <path>libs</path>  <!-- path where FirebaseRemoteConfig.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-remote-config-ios:$altpodsVersion"
}
```