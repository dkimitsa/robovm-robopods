# Google AdMob Mediation Test Suite
https://developers.google.com/admob/ios/mediation-test-suite#objective-c

### Frameworks required for this pod:
* GoogleMobileAdsMediationTestSuite.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleMobileAdsMediationTestSuite.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-google-mobile-ads-mediation-testsuite:$altpodsVersion"
}
```

## Versions

| RoboPods Version  | TestSuite Version   |
|-------------------|---------------------|
| 1.19.0            | 2.0.0               |
