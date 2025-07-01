# - `OneSignal iOS

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

## - `OneSignal home page

[Link](https://github.com/OneSignal/OneSignal-iOS-SDK)