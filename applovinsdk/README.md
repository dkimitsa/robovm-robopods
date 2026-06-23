# RoboPods for AppLovinSDK

## Official website
https://dash.applovin.com/docs/integration
https://github.com/AppLovin/AppLovin-MAX-SDK-iOS

## Available RoboPods

| RoboPods Version | AppLovinSDK Version |
|------------------|---------------------|
| 13.6.3.0         | 13.6.3              |
| 13.6.2.0         | 13.6.2              |
| 13.6.0.0         | 13.6.0              |
| 1.55.0-1.56.0    | 13.5.0-13.5.1       |
| 1.53.0           | 13.4.0              |
| 1.49.0-1.50.0    | 13.3.0-13.3.1       |
| 1.48.0           | 13.2.0              |
| 1.46.0-1.47.0    | 13.1.0              |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `AppLovinSDK.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>AppLovinSDK</framework>
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
   implementation "io.github.dkimitsa.robovm:robopods-applovinsdk-ios:$altpodsVersion"
}
```

## Sample code
```java
public class Main extends UIApplicationDelegateAdapter {
    private UIWindow window;
    private MyViewController rootViewController;

    @Override
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
        rootViewController = new MyViewController();
        window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setRootViewController(rootViewController);
        window.makeKeyAndVisible();
        
        ALSdk.InitializeSdk();

        return true;
    }
}

public class MyViewController extends UIViewController implements ALAdLoadDelegate {

    public MyViewController() {
        .... 
        ALSdk.shared().getAdService().loadNextAd(ALAdSize.sizeBanner(), this);
    }

    @Override
    public void didLoadAd(ALAdService adService, ALAd ad) {
        System.out.println("didLoadAd");
        ALInterstitialAd.shared().showAd(ad);
    }

    @Override
    public void didFailToLoadAd(ALAdService adService, int code) {
        System.out.println("didFailToLoadAd " + code);
    }
}
```