# RoboPods for BranchMetrics
The Branch Metrics iOS SDK for deferred and contextual mobile deep linking

## Official website
https://github.com/BranchMetrics/ios-branch-deep-linking

## Available RoboPods

| RoboPods Version | BranchMetrics Version |
|------------------|-----------------------|
| 3.14.1.0         | 3.14.1                |
| 3.14.0.0         | 3.14.0                |
| 1.54.0           | 3.13.3                |
| 1.53.0           | 3.13.0                |
| 1.49.0-1.52.0    | 3.12.1-3.12.2         |
| 1.47.0           | 3.10.0                |
| 1.46.0           | 3.8.0                 |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Branch.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage):
```
echo 'github "BranchMetrics/ios-branch-deep-linking"' > Cartfile
carthage update
```

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where Branch.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-branchmetrics-ios:$altpodsVersion"
}
```