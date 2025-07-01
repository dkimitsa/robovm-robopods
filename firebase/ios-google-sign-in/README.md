# Firebase iOS Google SignIn framework

### Frameworks required for this pod: 
* AppAuth.xcframework (from Firebase.zip/GoogleSignIn/AppAuth.xcframework)
* AppCheckCore.xcframework (from Firebase.zip/GoogleSignIn/AppCheckCore.xcframework)
* GTMAppAuth.xcframework (from Firebase.zip/GoogleSignIn/GTMAppAuth.xcframework)
* GTMSessionFetcher.xcframework (from Firebase.zip/GoogleSignIn/GTMSessionFetcher.xcframework)
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* GoogleSignIn.xcframework (from Firebase.zip/GoogleSignIn/GoogleSignIn.xcframework)

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