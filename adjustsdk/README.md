# RoboPods for Adjust iOS SDK

## Official website
https://www.adjust.com
https://github.com/adjust/ios_sdk/

## Available RoboPods

| RoboPods Version | AdjustSdk Version |
|------------------|-------------------|
| 5.8.0.0          | 5.8.0             |
| 5.7.0.0          | 5.7.0             |
| 5.6.2.0          | 5.6.2             |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `AdjustSdk.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where AdjustSdk.xcframework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-adjustsdk-ios:$adjustsdk_version"
}
```