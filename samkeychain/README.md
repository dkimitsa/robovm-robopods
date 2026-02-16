# RoboPods for SAMKeychain

## Official website
https://github.com/soffes/SAMKeychain


## Available RoboPods
| RoboPods Version  | SAMKeychain Version |
|-------------------|---------------------|
| 1.5.0             | 1.5.3               |
| 1.4.0             | 1.5.3               |
| 1.3.0             | 1.5.3               |
| 1.2.0             | 1.5.3               |
| 1.1.1             | 1.5.3               |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `SAMKeychain.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage):
```
echo 'github github "soffes/SAMKeychain"' > Cartfile
carthage update
```

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where SAMKeychain.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-samkeychain-ios:$altpodsVersion"
}
```
