# Firebase iOS Google User Messaging Platform framework

### Frameworks required for this pod: 
* UserMessagingPlatform.xcframework (from Firebase.zip/Google-Mobile-Ads-SDK/UserMessagingPlatform.xcframework)

### to use this pod configure your `robovm.xml`
[the official guide](https://developers.google.com/admob/ump/ios/quick-start).

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where UserMessagingPlatform.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-google-ump-ios:$altpodsVersion"
}
```

### Demo code   
```java
// Create a UMPRequestParameters object.
UMPRequestParameters parameters = new UMPRequestParameters();
// Set tag for under age of consent. Here NO means users are not under age.
parameters.setTagForUnderAgeOfConsent(false);

// Request an update to the consent information.
UMPConsentInformation.getSharedInstance().requestConsentInfoUpdate(parameters, error -> {
    if (error != null) {
        // Handle the error.
        System.out.println(error);
    } else {
        // The consent information state was updated.
        // You are now ready to check if a form is
        // available.
    }
});
```
 
