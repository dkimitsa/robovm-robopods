# RoboPods for InMobi -- Monetization SDK for iOS

## Official website
https://www.inmobi.com/sdk

## Versions

| RoboPods Version | InMobi Version          |
|------------------|-------------------------|
| 11.2.0.0         | 11.2.0                  |
| 11.1.1.0         | 11.1.1                  |
| 1.56.0           | 11.1.0                  |
| 1.54.0           | 11.0.0                  |
| 1.52.0           | 10.8.6                  |
| 1.49.0           | 10.8.3                  |
| 1.46.0-1.48.0    | 10.8.0                  |

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where InMobiSDK.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-inmobi-sdk-ios:$altpodsVersion"
}
```