# RoboPods for IronSource SDK iOS

## Official website
https://developers.is.com/ironsource-mobile/ios/ios-sdk/
https://github.com/ironsource-mobile/iOS-sdk/releases/

## Available RoboPods

| RoboPods Version | IronSource Version |
|------------------|--------------------|
| 9.4.1.0          | 9.4.1              |
| 9.2.0.0          | 9.2.0              |
| 1.54.0           | 9.0.0              |
| 1.53.0           | 8.11.0             |
| 1.52.0           | 8.10.0             |
| 1.50.0           | 8.9.1              |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `IronSource.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where IronSource.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-ironsource-ios:$altpodsVersion"
}
```