# RoboPods for Adapty SDK iOS
Adapty SDK is an open-source framework that makes implementing in-app subscriptions in iOS fast and easy. It’s 100% open-source, native and lightweight.

## Official website
https://github.com/adaptyteam/AdaptySDK-iOS

## WARNING: AdaptySDK starting v2.0.0 cannot currently be used in projects written in Objective-C. Binding for new versions is not possible

## Available RoboPods

| RoboPods Version | AdaptySDK Version |
|------------------|-------------------|
| 1.25.0           | 1.17.7            |
| 1.24.0           | 1.17.6            |
| 1.23.0           | 1.17.3            |
| 1.22.0           | 1.16.10           |
| 1.20.0           | 1.16.9            |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Adapty.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path> 
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
   implementation "io.github.dkimitsa.robovm:robopods-adapty-ios:$altpodsVersion"
}
```
