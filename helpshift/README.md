# RoboPods for HelpShiftX

## Official website
https://developers.helpshift.com

## Available RoboPods

| RoboPods Version | HelpShift Version |
|------------------|-------------------|
| 10.5.0.0         | 10.5.0            |
| 1.54.0           | 10.4.1            |
| 1.46.0-1.54.0    | 10.4.0            |
| 1.35.0-1.43.0    | 10.3.0-10.3.1     |
| 1.33.0           | 10.2.3            |

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