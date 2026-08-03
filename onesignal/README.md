# RoboPods for OneSignal

## Official website
https://github.com/OneSignal/OneSignal-iOS-SDK

## Available RoboPods
| RoboPods Version | OneSignal Version |
|------------------|-------------------|
| 5.5.6.0          | 5.5.6             |
| 5.5.5.0          | 5.5.5             |
| 5.5.3.0          | 5.5.3             |
| 5.5.1.0          | 5.5.1             |
| 5.5.0.0          | 5.5.0             |
| 5.4.2.0          | 5.4.2             |
| 5.4.1.0          | 5.4.1             |
| 1.55.0           | 5.2.15            |
| 1.50.0           | 5.2.14            |
| 1.47.0           | 5.2.10            |
| 1.46.0           | 5.2.9             |
| 1.44.0-1.45.0    | 5.2.4-5.2.5       |

## Sample app

[Link](https://github.com/dkimitsa/robovm-samples/tree/alt/robopods/- `OneSignal/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the following native frameworks:
- OneSignalFramework
- OneSignalCore
- OneSignalOSCore
- OneSignalNotifications
- OneSignalOutcomes
- OneSignalUser

Optional frameworks:
- OneSignalExtension
- OneSignalInAppMessages
- OneSignalLocation
  These frameworks are not included into pod's `robovm.xml` and has to be added to application one if required:
```
<config>
    ...
    <frameworks>
        <framework>OneSignalExtension</framework>
        <framework>OneSignalInAppMessages</framework>
        <framework>OneSignalLocation</framework>
    </frameworks>
</config>
```

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where - `OneSignal.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-- `OneSignal-ios:$altpodsVersion"
}
```