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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISInterstitialAdapterProtocol, ISRewardedVideoAdapterProtocol, ISBannerAdapterProtocol, ISAdapterNetworkDataProtocol, ISNativeAdAdapterProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISBaseAdapterPtr extends Ptr<ISBaseAdapter, ISBaseAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseAdapter() {}
    protected ISBaseAdapter(Handle h, long handle) { super(h, handle); }
    protected ISBaseAdapter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initAdapter:")
    public ISBaseAdapter(String name) { super((SkipInit) null); initObject(initAdapter(name)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adapterName")
    public native String getAdapterName();
    @Property(selector = "setAdapterName:")
    public native void setAdapterName(String v);
    @Property(selector = "providerNetworkKey")
    public native String getProviderNetworkKey();
    @Property(selector = "setProviderNetworkKey:")
    public native void setProviderNetworkKey(String v);
    @Property(selector = "pluginType")
    public native String getPluginType();
    @Property(selector = "setPluginType:")
    public native void setPluginType(String v);
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    @Property(selector = "adUnitAdapters")
    public native LPMThreadSafeDictionaryProtocol getAdUnitAdapters();
    @Property(selector = "setAdUnitAdapters:")
    public native void setAdUnitAdapters(LPMThreadSafeDictionaryProtocol v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initAdapter:")
    protected native @Pointer long initAdapter(String name);
    @Method(selector = "earlyInitWithAdapterConfig:")
    public native void earlyInit(ISAdapterConfig adapterConfig);
    @Method(selector = "sdkVersion")
    public native String sdkVersion();
    @Method(selector = "version")
    public native String version();
    @Method(selector = "dynamicUserId")
    public native String dynamicUserId();
    @Method(selector = "getLWSSupportState:")
    public native ISLoadWhileShowSupportState getLWSSupportState(ISAdapterConfig adapterConfig);
    @Method(selector = "setNetworkData:")
    public native void setNetworkData(ISAdapterNetworkData networkData);
    @Method(selector = "setRewardedVideoAdapter:")
    public native void setRewardedVideoAdapter(ISRewardedVideoAdapterProtocol rewardedVideoAdapter);
    @Method(selector = "setInterstitialAdapter:")
    public native void setInterstitialAdapter(ISInterstitialAdapterProtocol interstitialAdapter);
    @Method(selector = "setBannerAdapter:")
    public native void setBannerAdapter(ISBannerAdapterProtocol bannerAdapter);
    @Method(selector = "setNativeAdAdapter:")
    public native void setNativeAdAdapter(ISNativeAdAdapterProtocol nativeAdAdapter);
    @Method(selector = "setConsent:")
    public native void setConsent(boolean consent);
    @Method(selector = "setTestMode:")
    public native void setTestMode(boolean enabled);
    @Method(selector = "getRewardedVideoAdapter")
    public native ISRewardedVideoAdapterProtocol getRewardedVideoAdapter();
    @Method(selector = "getInterstitialAdapter")
    public native ISInterstitialAdapterProtocol getInterstitialAdapter();
    @Method(selector = "getBannerAdapter")
    public native ISBannerAdapterProtocol getBannerAdapter();
    @Method(selector = "getNativeAdAdapter")
    public native ISNativeAdAdapterProtocol getNativeAdAdapter();
    @Method(selector = "getAdaptiveHeightWithWidth:")
    public native @MachineSizedFloat double getAdaptiveHeight(@MachineSizedFloat double width);
    @Method(selector = "destroyRewardedVideoAdWithAdapterConfig:")
    public native void destroyRewardedVideoAd(ISAdapterConfig adapterConfig);
    @Method(selector = "destroyInterstitialAdWithAdapterConfig:")
    public native void destroyInterstitialAd(ISAdapterConfig adapterConfig);
    @Method(selector = "isConfigValueValid:")
    public native boolean isConfigValueValid(String value);
    @Method(selector = "errorForMissingCredentialFieldWithName:")
    public native NSError errorForMissingCredentialField(String fieldName);
    @Method(selector = "topMostController")
    public native UIViewController topMostController();
    @Method(selector = "setMetaDataWithKey:andValues:")
    public native void setMetaData(String key, NSMutableArray<?> values);
    @Method(selector = "showInterstitialWithViewController:adapterConfig:delegate:")
    public native void showInterstitial(UIViewController viewController, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "hasInterstitialWithAdapterConfig:")
    public native boolean hasInterstitial(ISAdapterConfig adapterConfig);
    @Method(selector = "initInterstitialWithUserId:adapterConfig:delegate:")
    public native void initInterstitial(String userId, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "loadInterstitialWithAdapterConfig:adData:delegate:")
    public native void loadInterstitial(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "getInterstitialBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getInterstitialBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectInterstitialBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectInterstitialBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "initInterstitialForBiddingWithUserId:adapterConfig:delegate:")
    public native void initInterstitialForBidding(String userId, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "loadInterstitialForBiddingWithAdapterConfig:adData:serverData:delegate:")
    public native void loadInterstitialForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "onNetworkInitCallbackSuccess")
    public native void onNetworkInitCallbackSuccess();
    @Method(selector = "onNetworkInitCallbackFailed:")
    public native void onNetworkInitCallbackFailed(String errorMessage);
    @Method(selector = "hasRewardedVideoWithAdapterConfig:")
    public native boolean hasRewardedVideo(ISAdapterConfig adapterConfig);
    @Method(selector = "showRewardedVideoWithViewController:adapterConfig:delegate:")
    public native void showRewardedVideo(UIViewController viewController, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initAndLoadRewardedVideoWithUserId:adapterConfig:adData:delegate:")
    public native void initAndLoadRewardedVideo(String userId, ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initRewardedVideoForCallbacksWithUserId:adapterConfig:delegate:")
    public native void initRewardedVideoForCallbacks(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoWithAdapterConfig:adData:delegate:")
    public native void loadRewardedVideo(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "getRewardedVideoBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectRewardedVideoBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "loadRewardedVideoForBiddingWithAdapterConfig:adData:serverData:delegate:")
    public native void loadRewardedVideoForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initRewardedVideoForDemandOnlyWithUserId:adapterConfig:delegate:")
    public native void initRewardedVideoForDemandOnly(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoForDemandOnlyWithAdapterConfig:delegate:")
    public native void loadRewardedVideoForDemandOnly(ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoForDemandOnlyForBiddingWithAdapterConfig:serverData:delegate:")
    public native void loadRewardedVideoForDemandOnlyForBidding(ISAdapterConfig adapterConfig, String serverData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "destroyBannerWithAdapterConfig:")
    public native void destroyBanner(ISAdapterConfig adapterConfig);
    @Method(selector = "initBannerWithUserId:adapterConfig:delegate:")
    public native void initBanner(String userId, ISAdapterConfig adapterConfig, ISBannerAdapterDelegate delegate);
    @Method(selector = "loadBannerWithAdapterConfig:adData:viewController:size:delegate:")
    public native void loadBanner(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, UIViewController viewController, ISBannerSize size, ISBannerAdapterDelegate delegate);
    @Method(selector = "getBannerBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getBannerBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectBannerBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectBannerBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "initBannerForBiddingWithUserId:adapterConfig:delegate:")
    public native void initBannerForBidding(String userId, ISAdapterConfig adapterConfig, ISBannerAdapterDelegate delegate);
    @Method(selector = "loadBannerForBiddingWithAdapterConfig:adData:serverData:viewController:size:delegate:")
    public native void loadBannerForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, UIViewController viewController, ISBannerSize size, ISBannerAdapterDelegate delegate);
    @Method(selector = "initNativeAdsWithUserId:adapterConfig:delegate:")
    public native void initNativeAds(String userId, ISAdapterConfig adapterConfig, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "initNativeAdForBiddingWithUserId:adapterConfig:delegate:")
    public native void initNativeAdForBidding(String userId, ISAdapterConfig adapterConfig, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "loadNativeAdWithAdapterConfig:adData:viewController:delegate:")
    public native void loadNativeAdWithAdapterConfig(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, UIViewController viewController, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "loadNativeAdForBiddingWithAdapterConfig:adData:serverData:viewController:delegate:")
    public native void loadNativeAdForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, UIViewController viewController, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "destroyNativeAdWithAdapterConfig:")
    public native void destroyNativeAd(ISAdapterConfig adapterConfig);
    @Method(selector = "getNativeAdBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getNativeAdBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectNativeAdBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectNativeAdBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    /*</methods>*/
}
