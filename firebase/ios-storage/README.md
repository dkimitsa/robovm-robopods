# Firebase iOS Cloud Storage framework
Cloud Storage is built for app developers who need to store and serve user-generated content, such as photos or videos.

### Available RoboPods
| RoboPods Version | Firebase Storage |
|------------------|------------------|
| 12.18.0.0        | 12.18.0          |
| 12.17.0.0        | 12.17.0          |
| 12.16.0.0        | 12.16.0          |
| 12.15.0.0        | 12.15.0          |
| 12.12.0.0        | 12.12.0          |
| 12.10.0.0        | 12.10.0          |
| 12.9.0.0         | 12.9.0           |

### Frameworks required for this pod:
* FirebaseAppCheckInterop.xcframework (from Firebase.zip/FirebaseStorage/FirebaseAppCheckInterop.xcframework)
* FirebaseAuthInterop.xcframework (from Firebase.zip/FirebaseStorage/FirebaseAuthInterop.xcframework)
* FirebaseCoreExtension.xcframework (from Firebase.zip/FirebaseStorage/FirebaseCoreExtension.xcframework)
* FirebaseStorage.framework (from Firebase.zip/FirebaseStorage/FirebaseStorage.xcframework)
* GTMSessionFetcher.framework (from Firebase.zip/FirebaseStorage/GTMSessionFetcher.xcframework)

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
        <path>libs</path>  <!-- path where FirebaseStorage.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-storage-ios:$altpodsVersion"
}
```