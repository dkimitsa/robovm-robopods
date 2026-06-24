# RoboPods for Clever Ads Solutions iOS SDK

## Official website
https://github.com/cleveradssolutions/CAS-iOS

## Available RoboPods
| RoboPods Version | CleverAds Version |
|------------------|-------------------|
| 4.7.4.0          | 4.7.4             |
| 4.6.6.0          | 4.6.6             |
| 4.6.3.0          | 4.6.3             |
| 4.6.2.0          | 4.6.2             |
| 1.56.0           | 4.5.4             |
| 1.55.0           | 4.4.2             |
| 1.51.0-1.52.0    | 4.1.2-4.3.0       |
| 1.50.0           | 4.1.0             |
| 1.49.0           | 4.0.2.1           |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `CleverAdsSolutions.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where CleverAdsSolutions.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-cleverads-ios:$altpodsVersion"
}
```