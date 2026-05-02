# RoboPods FireBase InMobi Ads Mediation Adapter iOS v9.0.7.2

### Available RoboPods
| RoboPods Version | Inmobi Adapter |
|------------------|----------------|
| 11.2.0.0         | 11.2.0         |
| 11.1.1.0         | 11.1.1         |
| 11.1.1.1.0       | 11.1.1.1       |

### Frameworks required for this pod: 
* InMobiAdapter.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where InMobiAdapter.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-mobile-ads-inmobi-adapter-ios:$altpodsVersion"
}
```

## Official website

https://developers.google.com/admob/ios/mediation/inmobi
https://developers.google.com/admob/ios/mediation/inmobi#inmobi-ios-mediation-adapter-changelog