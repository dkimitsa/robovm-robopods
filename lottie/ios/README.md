# Lottie iOS

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

## Lottie home page

[Link](https://github.com/airbnb/lottie-ios)