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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAdapterConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISAdapterConfigPtr extends Ptr<ISAdapterConfig, ISAdapterConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISAdapterConfig.class); }/*</bind>*/
    /*<constants>*/
    public static final int DEFAULT_CAPPING_PER_DAY = 99;
    public static final int DEFAULT_CAPPING_PER_SESSION = 99;
    public static final int DEFAULT_CAPPING_PER_ITERATION = 99;
    /*</constants>*/
    /*<constructors>*/
    public ISAdapterConfig() {}
    protected ISAdapterConfig(Handle h, long handle) { super(h, handle); }
    protected ISAdapterConfig(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProviderName:")
    public ISAdapterConfig(String providerName) { super((SkipInit) null); initObject(init(providerName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "settings")
    public native NSDictionary<?, ?> getSettings();
    @Property(selector = "setSettings:")
    public native void setSettings(NSDictionary<?, ?> v);
    @Property(selector = "providerName")
    public native String getProviderName();
    @Property(selector = "reflectionName")
    public native String getReflectionName();
    @Property(selector = "setReflectionName:")
    public native void setReflectionName(String v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "requestUrl")
    public native String getRequestUrl();
    @Property(selector = "subAdapterId")
    public native String getSubAdapterId();
    @Property(selector = "instanceId")
    public native String getInstanceId();
    @Property(selector = "maxAdsPerIteration")
    public native NSNumber getMaxAdsPerIteration();
    @Property(selector = "maxAdsPerSession")
    public native NSNumber getMaxAdsPerSession();
    @Property(selector = "instanceType")
    public native String getInstanceType();
    @Property(selector = "maxAdsPerDay")
    public native @MachineSizedSInt long getMaxAdsPerDay();
    @Property(selector = "loadTimeOutSec")
    public native double getLoadTimeOutSec();
    @Property(selector = "isMultiProviderInstance")
    public native boolean isMultiProviderInstance();
    @Property(selector = "adSourceNameForEvent")
    public native String getAdSourceNameForEvent();
    @Property(selector = "isBidder")
    public native boolean isBidder();
    @Property(selector = "shouldEarlyInit")
    public native boolean shouldEarlyInit();
    @Property(selector = "adFormat")
    public native String getAdFormat();
    @Property(selector = "setAdFormat:")
    public native void setAdFormat(String v);
    @Property(selector = "appSettings")
    public native NSDictionary<?, ?> getAppSettings();
    @Property(selector = "setAppSettings:")
    public native void setAppSettings(NSDictionary<?, ?> v);
    @Property(selector = "interstitialSettings")
    public native NSDictionary<?, ?> getInterstitialSettings();
    @Property(selector = "setInterstitialSettings:")
    public native void setInterstitialSettings(NSDictionary<?, ?> v);
    @Property(selector = "rewardedVideoSettings")
    public native NSDictionary<?, ?> getRewardedVideoSettings();
    @Property(selector = "setRewardedVideoSettings:")
    public native void setRewardedVideoSettings(NSDictionary<?, ?> v);
    @Property(selector = "bannerSettings")
    public native NSDictionary<?, ?> getBannerSettings();
    @Property(selector = "setBannerSettings:")
    public native void setBannerSettings(NSDictionary<?, ?> v);
    @Property(selector = "nativeAdSettings")
    public native NSDictionary<?, ?> getNativeAdSettings();
    @Property(selector = "setNativeAdSettings:")
    public native void setNativeAdSettings(NSDictionary<?, ?> v);
    @Property(selector = "providerDefaultInstance")
    public native String getProviderDefaultInstance();
    @Property(selector = "setProviderDefaultInstance:")
    public native void setProviderDefaultInstance(String v);
    @Property(selector = "providerNetworkKey")
    public native String getProviderNetworkKey();
    @Property(selector = "customNetwork")
    public native String getCustomNetwork();
    @Property(selector = "isCustomNetwork")
    public native boolean isCustomNetwork();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProviderName:")
    protected native @Pointer long init(String providerName);
    @Method(selector = "setLoadTimeOut:")
    public native void setLoadTimeOut(double loadTimeOut);
    @Method(selector = "isIronSource")
    public native boolean isIronSource();
    @Method(selector = "setIsOneFlow:")
    public native void setIsOneFlow(boolean isOneFlow);
    @Method(selector = "customNetworkAdapterNameForAdFormat:")
    public native String customNetworkAdapterNameForAdFormat(String adFormat);
    @Method(selector = "adUnitSettings")
    public native NSDictionary<?, ?> adUnitSettings();
    @Method(selector = "demandSourceName")
    public native String demandSourceName();
    @Method(selector = "isOneFlow")
    public native NSNumber isOneFlow();
    @Method(selector = "hasConsentCMP")
    public native boolean hasConsentCMP();
    @Method(selector = "getConsentCMP")
    public native boolean getConsentCMP();
    /*</methods>*/
}
