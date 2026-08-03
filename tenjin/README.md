# RoboPods for Tenjin SDK iOS

## Official website
https://github.com/tenjin/tenjin-ios-sdk

## Available RoboPods
| RoboPods Version | Tenjin Version  |
|------------------|-----------------|
| 1.18.0.0         | 1.18.0          |
| 1.17.2.0         | 1.17.2          |
| 1.17.1.0         | 1.17.1          |
| 1.16.1.0         | 1.16.1          |
| 1.15.1.0         | 1.15.1          |
| 1.56.0           | 1.15.0          |
| 1.49.0-1.52.0    | 1.14.9-1.14.11  |
| 1.48.0           | 1.14.8          |
| 1.46.0           | 1.14.7          |
| 1.44.0-1.45.0    | 1.14.4-1.14.5   |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `libTenjinSDK.a`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libTenjinSDK.a</lib>  <!-- path to libTenjinSDK.a -->
    </libs>
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
   implementation "io.github.dkimitsa.robovm:robopods-tenjin-ios:$altpodsVersion"
}
```