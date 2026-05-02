# RoboPods FireBase AppLovin Mediation Adapter iOS 6.13.4.0

### Available RoboPods
| RoboPods Version | AppLovin Adapter |
|------------------|------------------|
| 13.6.2.0         | 13.6.2           |
| 13.6.0.0         | 13.6.0           |
| 13.5.1.0.0       | 13.5.1.0         |

### Frameworks required for this pod: 
* AppLovinAdapter.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where AppLovinAdapter.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-mobile-ads-applovin-adapter-ios:$altpodsVersion"
}
```

## Official website

https://developers.google.com/admob/ios/mediation/applovin
https://developers.google.com/admob/ios/mediation/applovin#applovin-ios-mediation-adapter-changelog