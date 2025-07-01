# Unity Ads iOS

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

## UnityAds home page

[Link](https://unityads.unity3d.com/help/ios/integration-guide-ios)