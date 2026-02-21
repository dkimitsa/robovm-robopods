# Firebase iOS Cloud Firestore framework

### Available RoboPods
| RoboPods Version | Firebase Firestore |
|------------------|--------------------|
| 12.9.0.0         | 12.9.0             |

### Frameworks required for this pod: 
* FirebaseAppCheckInterop.xcframework (from Firebase.zip/FirebaseFirestore/FirebaseAppCheckInterop.xcframework)
* FirebaseCoreExtension.xcframework (from Firebase.zip/FirebaseFirestore/FirebaseCoreExtension.xcframework)
* FirebaseFirestore.xcframework (from Firebase.zip/FirebaseFirestore/FirebaseFirestore.xcframework)
* FirebaseFirestoreInternal.xcframework (from Firebase.zip/FirebaseFirestore/FirebaseFirestoreInternal.xcframework)
* FirebaseSharedSwift.xcframework (from Firebase.zip/FirebaseFirestore/FirebaseSharedSwift.xcframework)
* absl.xcframework (from Firebase.zip/FirebaseFirestore/absl.xcframework)
* grpc.xcframework (from Firebase.zip/FirebaseFirestore/grpc.xcframework)
* grpcpp.xcframework (from Firebase.zipFirebaseFirestore/grpcpp.xcframework)
* leveldb.xcframework (from Firebase.zip/FirebaseFirestore/leveldb.xcframework)
* openssl_grpc.xcframework (from Firebase.zip/FirebaseFirestore/openssl_grpc.xcframework)

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
        <path>libs</path>  <!-- path where FirebaseFirestore.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-firestore-ios:$altpodsVersion"
}
```