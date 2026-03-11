# RoboPods Facebook Mediation Adapter for Google Mobile Ads SDK for iOS

### Available RoboPods
| RoboPods Version | Facebook Adapter |
|------------------|------------------|
| 6.21.1.0         | 6.21.1           |
| 6.21.0.2.0       | 6.21.0.2         |

### Frameworks required for this pod: 
* FacebookAdapter.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FacebookAdapter.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-mobile-ads-facebook-adapter-ios:$altpodsVersion"
}
```

## Official website

https://developers.google.com/admob/ios/mediation/facebook
https://developers.google.com/admob/ios/mediation/facebook#facebook-ios-mediation-adapter-changelog