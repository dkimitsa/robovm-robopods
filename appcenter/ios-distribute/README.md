# App Center Distribute
App Center Distribute lets your users install a new version of the app when you distribute it with App Center. With a new version of the app available, the SDK will present an update dialog to the users to either download or postpone the new version. Once they choose to update, the SDK will start to update your application. This feature is automatically disabled on versions of your app deployed to the Apple App Store.

### Available RoboPods
| RoboPods Version | Distribute |
|------------------|------------|
| 5.12.0.0         | 5.12.0     |

### Frameworks required for this pod:
* AppCenterDistribute.framework 

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where AppCenterDistribute.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-appcenter-distribute-ios:$altpodsVersion"
}
```