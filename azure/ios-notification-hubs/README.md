# Microsoft Azure Notification Hubs SDK for Apple
https://azure.microsoft.com/en-us/documentation/services/notification-hubs

### Frameworks required for this pod:
* WindowsAzureMessaging.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where WindowsAzureMessaging.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-azure-notification-hubs-ios:$altpodsVersion"
}
```