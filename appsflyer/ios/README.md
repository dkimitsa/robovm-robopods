# AppsFlyer iOS SDK
Mobile Attribution — Reliable, stable and always up to date with the market

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

## AppsFlyer home page
https://dev.appsflyer.com/hc/docs/ios-sdk
https://github.com/AppsFlyerSDK/AppsFlyerFramework/releases