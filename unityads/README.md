# RoboPods for Unity Ads iOS

## Official website
https://github.com/Unity-Technologies/unity-ads-ios


## Available RoboPods
| RoboPods Version | UnityAds Version |
|------------------|------------------|
| 4.18.1.0         | 4.18.1           |
| 4.17.0.0         | 4.17.0           |
| 4.16.6.0         | 4.16.6           |
| 1.54.0-1.56.0    | 4.16.3-4.16.5    |
| 1.50.0-1.53.0    | 4.15.0-4.16.1    |
| 1.44.0-1.49.0    | 4.12.2-4.14.2    |
| 1.40.0-1.43.0    | 4.11.1-4.12.1    |
| 1.38.0-1.39.0    | 4.9.3-4.10.0     |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `UnityAds.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>UnityAds</framework>
    </frameworks>
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
   implementation "io.github.dkimitsa.robovm:robopods-unityads-ios:$altpodsVersion"
}
```