# RoboPods for Youtube Player Helper iOS
Lightweight helper library that allows iOS developers to add inline playback of YouTube videos through a WebView

## Official website
https://github.com/youtube/youtube-ios-player-helper

## Available RoboPods
| RoboPods Version | AppLovinSDK Version |
|------------------|---------------------|
| 1.19.0           | 1.0.4               |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `YouTubeiOSPlayerHelper.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>YouTubeiOSPlayerHelper</framework>
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
   implementation "io.github.dkimitsa.robovm:robopods-youtube-player-helper-ios:$altpodsVersion"
}
```
