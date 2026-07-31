# RoboPods for RevenuCat iOS SDK
RevenueCat is a powerful, reliable, and free to use in-app purchase server with cross-platform support.

## Official website
https://www.revenuecat.com/docs/getting-started/installation/ios
https://github.com/RevenueCat/purchases-ios

## Available RoboPods

| RoboPods Version | AdjustSdk Version |
|------------------|-------------------|
| 5.83.0.0         | 5.83.0            |
| 5.72.0.0         | 5.72.0            |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `RevenueCat.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where RevenueCat.xcframework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-revenuecat-ios:$adjustsdk_version"
}
```