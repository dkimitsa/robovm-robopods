# RoboPods for Fyber Marketplace

## Official website
https://github.com/inner-active/InneractiveAdSDK-iOS

## Versions
| RoboPods Version | Fyber Marketplace Version |
|------------------|---------------------------|
| 8.4.5.0          | 8.4.5                     |
| 1.56.0           | 8.4.2                     |
| 1.54.0-1.55.0    | 8.4.0-8.4.1               |
| 1.48.0-1.53.0    | 8.3.6-8.3.8               |
| 1.46.0           | 8.3.4                     |
| 1.42.0           | 8.3.1                     |

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where IASDKCore.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-fyber-core-ios:$altpodsVersion"
}
```