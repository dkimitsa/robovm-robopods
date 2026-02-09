# Microsoft Azure Notification Hubs SDK for Apple

## Official website
https://github.com/Azure/azure-notificationhubs-ios
https://azure.microsoft.com/en-us/documentation/services/notification-hubs

## Versions

| RoboPods Version  | Facebook Version    |
|-------------------|---------------------|
| 1.19.0            | 3.1.4               |
| 1.15.0            | 3.1.3               |
| 1.14.0            | 3.1.2               |


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
