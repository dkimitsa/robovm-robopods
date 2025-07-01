# Adapty SDK iOS
Adapty SDK is an open-source framework that makes implementing in-app subscriptions in iOS fast and easy. It’s 100% open-source, native and lightweight.

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

## Adapty home page

https://github.com/adaptyteam/AdaptySDK-iOS
