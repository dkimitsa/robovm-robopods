/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.ironsource;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IronSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IronSourcePtr extends Ptr<IronSource, IronSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IronSource.class); }/*</bind>*/
    /*<constants>*/
    public static final String IS_REWARDED_VIDEO = "rewardedvideo";
    public static final String IS_INTERSTITIAL = "interstitial";
    public static final String IS_BANNER = "banner";
    public static final String IS_NATIVE_AD = "nativead";
    public static final String getSdkVersion = "8.10.0";
    public static final String DataSource_MOPUB = "MoPub";
    /*</constants>*/
    /*<constructors>*/
    public IronSource() {}
    protected IronSource(Handle h, long handle) { super(h, handle); }
    protected IronSource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated For LevelPlay, use [LevelPlay sdkVersion]. For IronSourceAds, use [IronSourceAds sdkVersion].
     */
    @Deprecated
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "shouldTrackReachability:")
    public static native void shouldTrackReachability(boolean flag);
    /**
     * @deprecated For LevelPlay, use [LevelPlay setAdaptersDebug:]. For IronSourceAds, use [IronSourceAds enableDebugMode:].
     */
    @Deprecated
    @Method(selector = "setAdaptersDebug:")
    public static native void setAdaptersDebug(boolean flag);
    /**
     * @deprecated Use [LevelPlay setDynamicUserId:].
     */
    @Deprecated
    @Method(selector = "setDynamicUserId:")
    public static native boolean setDynamicUserId(String dynamicUserId);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "advertiserId")
    public static native String advertiserId();
    @Method(selector = "setMediationType:")
    public static native void setMediationType(String mediationType);
    /**
     * @deprecated Use [LevelPlay setSegment:].
     */
    @Deprecated
    @Method(selector = "setSegment:")
    public static native void setSegment(ISSegment segment);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "setSegmentDelegate:")
    public static native void setSegmentDelegate(ISSegmentDelegate delegate);
    /**
     * @deprecated For LevelPlay, use [LevelPlay setMetaDataWithKey:value:]. For IronSourceAds, use [IronSourceAds setMetaDataWithKey:value:].
     */
    @Deprecated
    @Method(selector = "setMetaDataWithKey:value:")
    public static native void setMetaData(String key, String value);
    /**
     * @deprecated For LevelPlay, use [LevelPlay setMetaDataWithKey:values:]. For IronSourceAds, use [IronSourceAds setMetaDataWithKey:values:].
     */
    @Deprecated
    @Method(selector = "setMetaDataWithKey:values:")
    public static native void setMetaData(String key, NSMutableArray<?> values);
    /**
     * @deprecated Use [LevelPlay setNetworkDataWithNetworkKey:andNetworkData:].
     */
    @Deprecated
    @Method(selector = "setNetworkDataWithNetworkKey:andNetworkData:")
    public static native void setNetworkData(String networkKey, NSDictionary<?, ?> networkData);
    @Method(selector = "getISDemandOnlyBiddingData")
    public static native String getISDemandOnlyBiddingData();
    /**
     * @deprecated Use [LevelPlay initWithRequest:completion:]. In this API, userId can be specified as part of the LPMInitRequest object.
     */
    @Deprecated
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    /**
     * @deprecated Use [LevelPlay initWithRequest:completion:].
     */
    @Deprecated
    @Method(selector = "initWithAppKey:")
    public static native void init(String appKey);
    /**
     * @deprecated Use [LevelPlay initWithRequest:completion:].
     */
    @Deprecated
    @Method(selector = "initWithAppKey:delegate:")
    public static native void init(String appKey, ISInitializationDelegate delegate);
    /**
     * @deprecated Use [LevelPlay initWithRequest:completion:].
     */
    @Deprecated
    @Method(selector = "initWithAppKey:adUnits:")
    public static native void init(String appKey, NSArray<NSString> adUnits);
    /**
     * @deprecated Use [LevelPlay initWithRequest:completion:].
     */
    @Deprecated
    @Method(selector = "initWithAppKey:adUnits:delegate:")
    public static native void init(String appKey, NSArray<NSString> adUnits, ISInitializationDelegate delegate);
    /**
     * @deprecated Use [IronSourceAds initWithRequest:completion:].
     */
    @Deprecated
    @Method(selector = "initISDemandOnly:adUnits:")
    public static native void initISDemandOnly(String appKey, NSArray<NSString> adUnits);
    /**
     * @deprecated Use [LPMRewardedAd setDelegate:].
     */
    @Deprecated
    @Method(selector = "setLevelPlayRewardedVideoDelegate:")
    public static native void setLevelPlayRewardedVideoDelegate(LevelPlayRewardedVideoDelegate delegate);
    /**
     * @deprecated Use [LPMRewardedAd showAdWithViewController:placementName:].
     */
    @Deprecated
    @Method(selector = "showRewardedVideoWithViewController:")
    public static native void showRewardedVideo(UIViewController viewController);
    /**
     * @deprecated Use [LPMRewardedAd showAdWithViewController:placementName:].
     */
    @Deprecated
    @Method(selector = "showRewardedVideoWithViewController:placement:")
    public static native void showRewardedVideo(UIViewController viewController, String placementName);
    /**
     * @deprecated Use [LPMRewardedAd isAdReady].
     */
    @Deprecated
    @Method(selector = "hasRewardedVideo")
    public static native boolean hasRewardedVideo();
    /**
     * @deprecated Use [LPMRewardedAd isPlacementCapped:].
     */
    @Deprecated
    @Method(selector = "isRewardedVideoCappedForPlacement:")
    public static native boolean isRewardedVideoCappedForPlacement(String placementName);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "rewardedVideoPlacementInfo:")
    public static native ISPlacementInfo rewardedVideoPlacementInfo(String placementName);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "setRewardedVideoServerParameters:")
    public static native void setRewardedVideoServerParameters(NSDictionary<?, ?> parameters);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "clearRewardedVideoServerParameters")
    public static native void clearRewardedVideoServerParameters();
    @Method(selector = "setISDemandOnlyRewardedVideoDelegate:")
    public static native void setISDemandOnlyRewardedVideoDelegate(ISDemandOnlyRewardedVideoDelegate delegate);
    @Method(selector = "loadISDemandOnlyRewardedVideo:")
    public static native void loadISDemandOnlyRewardedVideo(String instanceId);
    /**
     * @deprecated Use [ISARewardedAdLoader loadAdWithAdRequest:delegate:].
     */
    @Deprecated
    @Method(selector = "loadISDemandOnlyRewardedVideoWithAdm:adm:")
    public static native void loadISDemandOnlyRewardedVideo(String instanceId, String adm);
    @Method(selector = "showISDemandOnlyRewardedVideo:instanceId:")
    public static native void showISDemandOnlyRewardedVideo(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyRewardedVideo:")
    public static native boolean hasISDemandOnlyRewardedVideo(String instanceId);
    /**
     * @deprecated Use [LPMRewardedAd setDelegate:].
     */
    @Deprecated
    @Method(selector = "setLevelPlayRewardedVideoManualDelegate:")
    public static native void setLevelPlayRewardedVideoManualDelegate(LevelPlayRewardedVideoManualDelegate delegate);
    /**
     * @deprecated Use [LPMRewardedAd loadAd].
     */
    @Deprecated
    @Method(selector = "loadRewardedVideo")
    public static native void loadRewardedVideo();
    /**
     * @deprecated Use [LPMInterstitialAd setDelegate:].
     */
    @Deprecated
    @Method(selector = "setLevelPlayInterstitialDelegate:")
    public static native void setLevelPlayInterstitialDelegate(LevelPlayInterstitialDelegate delegate);
    /**
     * @deprecated Use [LPMInterstitialAd loadAd].
     */
    @Deprecated
    @Method(selector = "loadInterstitial")
    public static native void loadInterstitial();
    /**
     * @deprecated Use [LPMInterstitialAd showAdWithViewController:placementName:].
     */
    @Deprecated
    @Method(selector = "showInterstitialWithViewController:")
    public static native void showInterstitial(UIViewController viewController);
    /**
     * @deprecated Use [LPMInterstitialAd showAdWithViewController:placementName:].
     */
    @Deprecated
    @Method(selector = "showInterstitialWithViewController:placement:")
    public static native void showInterstitial(UIViewController viewController, String placementName);
    /**
     * @deprecated Use [LPMInterstitialAd isAdReady].
     */
    @Deprecated
    @Method(selector = "hasInterstitial")
    public static native boolean hasInterstitial();
    /**
     * @deprecated Use [LPMInterstitialAd isPlacementCapped:].
     */
    @Deprecated
    @Method(selector = "isInterstitialCappedForPlacement:")
    public static native boolean isInterstitialCappedForPlacement(String placementName);
    @Method(selector = "setISDemandOnlyInterstitialDelegate:")
    public static native void setISDemandOnlyInterstitialDelegate(ISDemandOnlyInterstitialDelegate delegate);
    @Method(selector = "loadISDemandOnlyInterstitial:")
    public static native void loadISDemandOnlyInterstitial(String instanceId);
    /**
     * @deprecated Use [ISAInterstitialAdLoader loadAdWithAdRequest:delegate:].
     */
    @Deprecated
    @Method(selector = "loadISDemandOnlyInterstitialWithAdm:adm:")
    public static native void loadISDemandOnlyInterstitial(String instanceId, String adm);
    @Method(selector = "showISDemandOnlyInterstitial:instanceId:")
    public static native void showISDemandOnlyInterstitial(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyInterstitial:")
    public static native boolean hasISDemandOnlyInterstitial(String instanceId);
    /**
     * @deprecated Use [LPMBannerAdView setDelegate:].
     */
    @Deprecated
    @Method(selector = "setLevelPlayBannerDelegate:")
    public static native void setLevelPlayBannerDelegate(LevelPlayBannerDelegate delegate);
    /**
     * @deprecated Use [LPMBannerAdView loadAdWithViewController:].
     */
    @Deprecated
    @Method(selector = "loadBannerWithViewController:size:")
    public static native void loadBanner(UIViewController viewController, ISBannerSize size);
    /**
     * @deprecated Use [LPMBannerAdView setPlacementName:] with [LPMBannerAdView loadAdWithViewController:].
     */
    @Deprecated
    @Method(selector = "loadBannerWithViewController:size:placement:")
    public static native void loadBanner(UIViewController viewController, ISBannerSize size, String placementName);
    /**
     * @deprecated Use [LPMBannerAdView destroy].
     */
    @Deprecated
    @Method(selector = "destroyBanner:")
    public static native void destroyBanner(ISBannerView banner);
    /**
     * @deprecated Capping is no longer supported for banners.
     */
    @Deprecated
    @Method(selector = "isBannerCappedForPlacement:")
    public static native boolean isBannerCappedForPlacement(String placementName);
    @Method(selector = "setISDemandOnlyBannerDelegate:forInstanceId:")
    public static native void setISDemandOnlyBannerDelegate(ISDemandOnlyBannerDelegate delegate, String instanceId);
    @Method(selector = "loadISDemandOnlyBannerWithAdm:instanceId:viewController:size:")
    public static native void loadISDemandOnlyBanner(String adm, String instanceId, UIViewController viewController, ISBannerSize size);
    @Method(selector = "loadISDemandOnlyBannerWithInstanceId:viewController:size:")
    public static native void loadISDemandOnlyBanner(String instanceId, UIViewController viewController, ISBannerSize size);
    @Method(selector = "destroyISDemandOnlyBannerWithInstanceId:")
    public static native void destroyISDemandOnlyBanner(String instanceId);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "setLogDelegate:")
    public static native void setLogDelegate(ISLogDelegate delegate);
    /**
     * @deprecated For LevelPlay, use [LevelPlay setConsent:]. For IronSourceAds, use [IronSourceAds setConsent:].
     */
    @Deprecated
    @Method(selector = "setConsent:")
    public static native void setConsent(boolean consent);
    /**
     * @deprecated Use [LevelPlay addImpressionDataDelegate:].
     */
    @Deprecated
    @Method(selector = "addImpressionDataDelegate:")
    public static native void addImpressionDataDelegate(ISImpressionDataDelegate delegate);
    @Method(selector = "setAdRevenueDataWithDataSource:impressionData:")
    public static native void setAdRevenueData(String dataSource, NSData impressionData);
    /**
     * @deprecated Use [LevelPlay removeImpressionDataDelegate:].
     */
    @Deprecated
    @Method(selector = "removeImpressionDataDelegate:")
    public static native void removeImpressionDataDelegate(ISImpressionDataDelegate delegate);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "setConsentViewWithDelegate:")
    public static native void setConsentView(ISConsentViewDelegate delegate);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "loadConsentViewWithType:")
    public static native void loadConsentView(String consentViewType);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "showConsentViewWithViewController:andType:")
    public static native void showConsentView(UIViewController viewController, String consentViewType);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "getConversionValue")
    public static native NSNumber getConversionValue();
    /**
     * @deprecated Use [LevelPlay launchTestSuite:].
     */
    @Deprecated
    @Method(selector = "launchTestSuite:")
    public static native void launchTestSuite(UIViewController viewController);
    /**
     * @deprecated For banner, use [LPMBannerAdView initWithAdUnitId:config:]. For interstitial, use [LPMInterstitialAd initWithAdUnitId:config:]. For rewarded, use [LPMRewardedAd initWithAdUnitId:config:]. In those APIs, the bidFloor can be specified via the config.
     */
    @Deprecated
    @Method(selector = "setWaterfallConfiguration:forAdUnit:")
    public static native void setWaterfallConfiguration(ISWaterfallConfiguration waterfallConfiguration, ISAdUnit adUnit);
    /*</methods>*/
}
