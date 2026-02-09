# RoboPods for Charts

## Official website
https://github.com/danielgindi/Charts

## Available RoboPods

| RoboPods Version | Charts Version |
|------------------|----------------|
| 1.38.0           | 5.1.0          |
| 1.32.0           | 5.0.0          |
| 1.26.0           | 4.1.0          |
| 1.23.0           | 4.0.3          |
| 1.15.0           | 4.0.0          |

## Sample app

[Link](https://github.com/dkimitsa/robovm-samples/tree/alt/robopods/charts/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Charts.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage):
```
echo 'github "danielgindi/Charts"' > Cartfile
carthage update
```

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where Charts.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-charts-ios:$altpodsVersion"
}
```
