# HelpShift iOS

## Sample app

TODO

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `libHelpshift.a` which is part of distribution package.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libHelpshift.a</lib>
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
   implementation "io.github.dkimitsa.robovm:robopods-helpshift-ios:$altpodsVersion"
}
```

## HelpShift home page

[Link](https://developers.helpshift.com)