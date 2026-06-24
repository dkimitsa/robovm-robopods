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
package org.robovm.pods.adjustsdk;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADJConfigPtr extends Ptr<ADJConfig, ADJConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJConfig() {}
    protected ADJConfig(Handle h, long handle) { super(h, handle); }
    protected ADJConfig(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAppToken:environment:")
    public ADJConfig(String appToken, String environment) { super((SkipInit) null); initObject(init(appToken, environment)); }
    @Method(selector = "initWithAppToken:environment:suppressLogLevel:")
    public ADJConfig(String appToken, String environment, boolean allowSuppressLogLevel) { super((SkipInit) null); initObject(init(appToken, environment, allowSuppressLogLevel)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appToken")
    public native String getAppToken();
    @Property(selector = "environment")
    public native String getEnvironment();
    @Property(selector = "isSendingInBackgroundEnabled")
    public native boolean isSendingInBackgroundEnabled();
    @Property(selector = "isAdServicesEnabled")
    public native boolean isAdServicesEnabled();
    @Property(selector = "isIdfaReadingEnabled")
    public native boolean isIdfaReadingEnabled();
    @Property(selector = "isIdfvReadingEnabled")
    public native boolean isIdfvReadingEnabled();
    @Property(selector = "isFbIdReadingEnabled")
    public native boolean isFbIdReadingEnabled();
    @Property(selector = "isSkanAttributionEnabled")
    public native boolean isSkanAttributionEnabled();
    @Property(selector = "isCostDataInAttributionEnabled")
    public native boolean isCostDataInAttributionEnabled();
    @Property(selector = "isLinkMeEnabled")
    public native boolean isLinkMeEnabled();
    @Property(selector = "isDeviceIdsReadingOnceEnabled")
    public native boolean isDeviceIdsReadingOnceEnabled();
    @Property(selector = "urlStrategyDomains")
    public native NSArray<?> getUrlStrategyDomains();
    @Property(selector = "useSubdomains")
    public native boolean isUseSubdomains();
    @Property(selector = "isDataResidency")
    public native boolean isDataResidency();
    @Property(selector = "isCoppaComplianceEnabled")
    public native boolean isCoppaComplianceEnabled();
    @Property(selector = "setIsCoppaComplianceEnabled:")
    public native void setIsCoppaComplianceEnabled(boolean v);
    @Property(selector = "isAppTrackingTransparencyUsageEnabled")
    public native boolean isAppTrackingTransparencyUsageEnabled();
    @Property(selector = "isFirstSessionDelayEnabled")
    public native boolean isFirstSessionDelayEnabled();
    @Property(selector = "delegate")
    public native AdjustDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AdjustDelegate v);
    @Property(selector = "sdkPrefix")
    public native String getSdkPrefix();
    @Property(selector = "setSdkPrefix:")
    public native void setSdkPrefix(String v);
    @Property(selector = "logLevel")
    public native ADJLogLevel getLogLevel();
    @Property(selector = "setLogLevel:")
    public native void setLogLevel(ADJLogLevel v);
    @Property(selector = "defaultTracker")
    public native String getDefaultTracker();
    @Property(selector = "setDefaultTracker:")
    public native void setDefaultTracker(String v);
    @Property(selector = "externalDeviceId")
    public native String getExternalDeviceId();
    @Property(selector = "setExternalDeviceId:")
    public native void setExternalDeviceId(String v);
    @Property(selector = "attConsentWaitingInterval")
    public native @MachineSizedUInt long getAttConsentWaitingInterval();
    @Property(selector = "setAttConsentWaitingInterval:")
    public native void setAttConsentWaitingInterval(@MachineSizedUInt long v);
    @Property(selector = "eventDeduplicationIdsMaxSize")
    public native @MachineSizedSInt long getEventDeduplicationIdsMaxSize();
    @Property(selector = "setEventDeduplicationIdsMaxSize:")
    public native void setEventDeduplicationIdsMaxSize(@MachineSizedSInt long v);
    @Property(selector = "storeInfo")
    public native ADJStoreInfo getStoreInfo();
    @Property(selector = "setStoreInfo:")
    public native void setStoreInfo(ADJStoreInfo v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppToken:environment:")
    protected native @Pointer long init(String appToken, String environment);
    @Method(selector = "initWithAppToken:environment:suppressLogLevel:")
    protected native @Pointer long init(String appToken, String environment, boolean allowSuppressLogLevel);
    @Method(selector = "isValid")
    public native boolean isValid();
    @Method(selector = "disableAdServices")
    public native void disableAdServices();
    @Method(selector = "disableIdfaReading")
    public native void disableIdfaReading();
    @Method(selector = "disableIdfvReading")
    public native void disableIdfvReading();
    @Method(selector = "disableFbIdReading")
    public native void disableFbIdReading();
    @Method(selector = "disableSkanAttribution")
    public native void disableSkanAttribution();
    @Method(selector = "enableSendingInBackground")
    public native void enableSendingInBackground();
    @Method(selector = "enableLinkMe")
    public native void enableLinkMe();
    @Method(selector = "enableDeviceIdsReadingOnce")
    public native void enableDeviceIdsReadingOnce();
    @Method(selector = "enableCostDataInAttribution")
    public native void enableCostDataInAttribution();
    @Method(selector = "enableCoppaCompliance")
    public native void enableCoppaCompliance();
    @Method(selector = "enableFirstSessionDelay")
    public native void enableFirstSessionDelay();
    @Method(selector = "disableAppTrackingTransparencyUsage")
    public native void disableAppTrackingTransparencyUsage();
    @Method(selector = "setUrlStrategy:useSubdomains:isDataResidency:")
    public native void setUrlStrategy(NSArray<?> urlStrategyDomains, boolean useSubdomains, boolean isDataResidency);
    /*</methods>*/
}
