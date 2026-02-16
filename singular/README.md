# RoboPods for Singular SDK iOS

## Official website
https://www.singular.net

## Available RoboPods
| RoboPods Version | Singular Version |
|------------------|------------------|
| 1.56.0           | 12.9.2           |
| 1.55.0           | 12.9.0           |
| 1.50.0           | 12.8.1           |
| 1.49.0           | 12.8.0           |
| 1.48.0           | 12.7.1           |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `Singular.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where Singular.xcframework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-singular-ios:$altpodsVersion"
}
```
