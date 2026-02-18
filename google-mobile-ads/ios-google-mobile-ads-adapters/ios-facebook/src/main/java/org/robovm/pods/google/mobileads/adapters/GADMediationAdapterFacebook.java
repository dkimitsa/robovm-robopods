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
import org.robovm.apple.uikit.*;
import org.robovm.pods.google.mobileads.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMediationAdapterFacebook/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADRTBAdapter/*</implements>*/ {

    /*<ptr>*/public static class GADMediationAdapterFacebookPtr extends Ptr<GADMediationAdapterFacebook, GADMediationAdapterFacebookPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADMediationAdapterFacebook.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADMediationAdapterFacebook() {}
    protected GADMediationAdapterFacebook(Handle h, long handle) { super(h, handle); }
    protected GADMediationAdapterFacebook(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getPlacementIDFromCredentials:")
    public static native String getPlacementIDFromCredentials(GADMediationCredentials credentials);
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
