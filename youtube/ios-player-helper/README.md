# YouTube Player Helper iOS

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

## YouTubeiOSPlayerHelper home page

[Link](https://github.com/youtube/youtube-ios-player-helper)