# The Branch Metrics iOS SDK for deferred and contextual mobile deep linking

## Sample app
TODO

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

## The Branch Metrics iOS SDK home page

[Link](https://github.com/BranchMetrics/ios-branch-deep-linking)