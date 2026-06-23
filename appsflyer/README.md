# RoboPods for AppsFlyer iOS SDK
Mobile Attribution — Reliable, stable and always up to date with the market

## Official website
https://dev.appsflyer.com/hc/docs/ios-sdk
https://github.com/AppsFlyerSDK/AppsFlyerFramework/releases

## Available RoboPods

| RoboPods Version | CleverAds Version |
|------------------|-------------------|
| 7.0.0.0          | 7.0.0             |
| 6.18.0.0         | 6.18.0            |
| 6.17.9.0         | 6.17.9            |
| 6.17.8.0         | 6.17.8            |
| 1.53.0-1.56.0    | 6.17.4-6.17.8     |
| 1.51.0           | 6.17.2            |
| 1.49.0           | 6.17.0            |
| 1.48.0           | 6.16.2            |
| 1.47.0           | 6.16.1            |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `AppsFlyerLib.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where AppsFlyerLib.xcframework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-appsflyer-ios:$altpodsVersion"
}
```