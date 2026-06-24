# RoboPods for AirBNB Lottie

## Official website
https://github.com/airbnb/lottie-ios

## Available RoboPods

| RoboPods Version | Lottie Version |
|------------------|----------------|
| 4.6.1.0          | 4.6.1          |
| 4.6.0.0          | 4.6.0          |
| 1.50.0           | 4.5.2          |
| 1.43.0-1.47.0    | 4.5.0-4.5.1    |
| 1.34.0-1.40.0    | 4.3.3-4.4.3    |
| 1.33.0           | 4.3.1          |
| 1.31.0           | 4.2.0          |

## Sample app

[Link](https://github.com/dkimitsa/robovm-samples/tree/alt/robopods/lottie/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Lottie.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage):
```
echo 'github "airbnb/lottie-ios"' > Cartfile
carthage update
```

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where Lottie.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-lottie-ios:$altpodsVersion"
}
```