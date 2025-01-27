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
package org.robovm.pods.google.mobileads.adapters;

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
import org.robovm.pods.google.mobileads.*;
import org.robovm.pods.applovinsdk.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMediationAdapterAppLovin/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADRTBAdapter/*</implements>*/ {

    /*<ptr>*/public static class GADMediationAdapterAppLovinPtr extends Ptr<GADMediationAdapterAppLovin, GADMediationAdapterAppLovinPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADMediationAdapterAppLovin.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADMediationAdapterAppLovin() {}
    protected GADMediationAdapterAppLovin(Handle h, long handle) { super(h, handle); }
    protected GADMediationAdapterAppLovin(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "SDKSettings")
    public static native ALSdkSettings getSDKSettings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "collectSignalsForRequestParameters:completionHandler:")
    public native void collectSignals(GADRTBRequestParameters params, @Block VoidBlock2<NSString, NSError> completionHandler);
    @Method(selector = "loadBannerForAdConfiguration:completionHandler:")
    public native void loadBanner(GADMediationBannerAdConfiguration adConfiguration, @Block Block2<GADMediationBannerAd, NSError, GADMediationBannerAdEventDelegate> completionHandler);
    @Method(selector = "loadInterstitialForAdConfiguration:completionHandler:")
    public native void loadInterstitial(GADMediationInterstitialAdConfiguration adConfiguration, @Block Block2<GADMediationInterstitialAd, NSError, GADMediationInterstitialAdEventDelegate> completionHandler);
    @Method(selector = "loadNativeAdForAdConfiguration:completionHandler:")
    public native void loadNativeAd(GADMediationNativeAdConfiguration adConfiguration, @Block Block2<GADMediationNativeAd, NSError, GADMediationNativeAdEventDelegate> completionHandler);
    @Method(selector = "loadRewardedAdForAdConfiguration:completionHandler:")
    public native void loadRewardedAd(GADMediationRewardedAdConfiguration adConfiguration, @Block Block2<GADMediationRewardedAd, NSError, GADMediationRewardedAdEventDelegate> completionHandler);
    @Method(selector = "loadRewardedInterstitialAdForAdConfiguration:completionHandler:")
    public native void loadRewardedInterstitialAd(GADMediationRewardedAdConfiguration adConfiguration, @Block Block2<GADMediationRewardedAd, NSError, GADMediationRewardedAdEventDelegate> completionHandler);
    @Method(selector = "loadAppOpenAdForAdConfiguration:completionHandler:")
    public native void loadAppOpenAd(GADMediationAppOpenAdConfiguration adConfiguration, @Block Block2<GADMediationAppOpenAd, NSError, GADMediationAppOpenAdEventDelegate> completionHandler);
    /**
     * @deprecated Interscroller mediation is no longer supported. This API will be removed in a future release.
     */
    @Deprecated
    @Method(selector = "loadInterscrollerAdForAdConfiguration:completionHandler:")
    public native void loadInterscrollerAd(GADMediationBannerAdConfiguration adConfiguration, @Block Block2<GADMediationInterscrollerAd, NSError, GADMediationBannerAdEventDelegate> completionHandler);
    @Method(selector = "adapterVersion")
    public static native @ByVal GADVersionNumber adapterVersion();
    @Method(selector = "adSDKVersion")
    public static native @ByVal GADVersionNumber adSDKVersion();
    @Method(selector = "networkExtrasClass")
    public static native Class<?> networkExtrasClass();
    @Method(selector = "setUpWithConfiguration:completionHandler:")
    public static native void setUp(GADMediationServerConfiguration configuration, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
