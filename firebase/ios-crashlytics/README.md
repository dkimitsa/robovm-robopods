# Firebase iOS Crashlytics framework

### Frameworks required for this pod: 
* FirebaseCoreExtension.xcframework (from Firebase.zip/FirebaseCrashlytics/FirebaseCoreExtension.xcframework)
* FirebaseCrashlytics.xcframework (from Firebase.zip/FirebaseCrashlytics/FirebaseCrashlytics.xcframework)
* FirebaseSessions.xcframework (from Firebase.zip/FirebaseCrashlytics/FirebaseSessions.xcframework)
* GoogleDataTransport.xcframework (from Firebase.zip/FirebaseCrashlytics/GoogleDataTransport.xcframework)
* Promises.xcframework (from Firebase.zip/FirebaseCrashlytics/Promises.xcframework)
* FirebaseRemoteConfigInterop.xcframework (from Firebase.zip/FirebaseCrashlytics/FirebaseRemoteConfigInterop.xcframework)

Plus ones required for ios-core module:
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* GoogleAppMeasurement.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.xcframework)
* GoogleAppMeasurementIdentitySupport.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurementIdentitySupport.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

### Way to report uncaught Java exception
Firebase provides `FIRExceptionModel` to report not native exceptions and display proper lines/function names. To use this approach register handler by invoking `FIRCrashlytics.registerDefaultJavaUncaughtExceptionHandler()`. More details in [blog post](https://dkimitsa.github.io/2020/07/08/firebase-and-java-stacktraces/).

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCrashlytics.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-crashlytics-ios:$altpodsVersion"
}
```
