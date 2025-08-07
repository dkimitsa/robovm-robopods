# RoboPods for Firebase Google Mobile Ads 

### Frameworks required for this pod: 
* GoogleMobileAds.xcframework (from Firebase.zip/Google-Mobile-Ads-SDK/GoogleMobileAds.xcframework)
* UserMessagingPlatform.xcframework (from Firebase.zip/Google-Mobile-Ads-SDK/UserMessagingPlatform.xcframework)

Plus ones required for ios-core module:
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* GoogleAppMeasurement.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.xcframework)
* GoogleAppMeasurementIdentitySupport.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurementIdentitySupport.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleMobileAds.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-google-mobile-ads-ios:$altpodsVersion"
}
```

### Sample code 
UIApplicationDelegateAdapter:  
```java
    public static void demoBanner(UIViewController vc)
    {
        if (bannerView == null) {
            // attach banner to bottom of screen
            CGRect rect = vc.getView().getFrame();
            rect.setY(rect.getHeight() - 50);
            rect.setHeight(50);
            bannerView = new GADBannerView(rect);
            bannerView.setAdUnitID("ca-app-pub-3940256099942544/2934735716");
            bannerView.setRootViewController(vc);
            vc.getView().addSubview(bannerView);
        }
        bannerView.loadRequest(new GADRequest());
    }

    public static void demoInterstitial(UIViewController vc)
    {
        // testing interstitial ads
        String unitId = "ca-app-pub-3940256099942544/4411468910";
        GADRequest request = new GADRequest();
        GADInterstitialAd.load(unitId, request, new VoidBlock2<GADInterstitialAd, NSError>() {
            @Override
            public void invoke(GADInterstitialAd ad, NSError error) {
                if (error != null) {
                    System.out.println("Failed to load ad due  " + error);
                } else {
                    ad.setFullScreenContentDelegate(new GADFullScreenContentDelegateAdapter(){
                        @Override
                        public void didFailToPresentFullScreenContent(GADFullScreenPresentingAd ad, NSError error) {
                            System.out.println("didFailToPresentFullScreenContent  " + error);
                        }
                    });
                    ad.presentFromRootViewController(vc);
                }
            }
        });
    }
```

## Official website
https://firebase.google.com/docs/admob/ios/quick-start
https://developers.google.com/admob/ios/quick-start
https://developers.google.com/admob/ios/download
