# Firebase iOS AppCheck framework
App Check helps protect your backend resources from abuse, such as billing fraud and phishing. It works with both Firebase services and your own backends to keep your resources safe.

### Available RoboPods
| RoboPods Version | FirebaseAppCheck |
|------------------|------------------|
| 12.17.0.0        | 12.17.0          |
| 12.16.0.0        | 12.16.0          |
| 12.15.0.0        | 12.15.0          |
| 12.12.0.0        | 12.12.0          |
| 12.10.0.0        | 12.10.0          |
| 12.9.0.0         | 12.9.0           |

### Frameworks required for this pod: 
* AppCheckCore.xcframework (from Firebase.zip/FirebaseAppCheck/AppCheckCore.xcframework)
* FirebaseAppCheck.xcframework (from Firebase.zip/FirebaseAppCheck/FirebaseAppCheck.xcframework)
* FirebaseAppCheckInterop.xcframework (from Firebase.zip/FirebaseAppCheck/FirebaseAppCheckInterop.xcframework)

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
        <path>libs</path>  <!-- path where FirebaseAppCheck.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-app-check-ios:$altpodsVersion"
}
```