# Tenjin SDK iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `libTenjinSDK.a`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libTenjinSDK.a</lib>  <!-- path to libTenjinSDK.a -->
    </libs>
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
   implementation "io.github.dkimitsa.robovm:robopods-tenjin-ios:$altpodsVersion"
}
```

## Home page

https://github.com/tenjin/tenjin-ios-sdk