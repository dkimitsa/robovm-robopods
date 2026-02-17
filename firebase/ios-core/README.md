# Firebase iOS Core framework

### Available RoboPods
| RoboPods Version | FirebaseCore  |
|------------------|---------------|
| 12.9.0.0         | 12.9.0        |

### Frameworks required for this pod: 
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* GoogleAppMeasurement.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

### Identity supports is not included by purpose as its optional 
In case its required it to be added to application `robovm.xml` file:

* GoogleAppMeasurementIdentitySupport.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurementIdentitySupport.xcframework)
```
<config>
    <frameworks>
        <framework>GoogleAppMeasurementIdentitySupport</framework>
    </frameworks>
</config>```


### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCore.framework is located -->
    </frameworkPaths>
     <swiftSupport/>
</config>
```

`<swiftSupport/>` *IS IMPORTANT* as firebase is swift based framework now.  

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-firebase-core-ios:$altpodsVersion"
}
```