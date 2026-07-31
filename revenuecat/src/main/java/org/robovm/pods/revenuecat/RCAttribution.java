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
package org.robovm.pods.revenuecat;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCAttribution/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCAttributionPtr extends Ptr<RCAttribution, RCAttributionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCAttribution.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCAttribution() {}
    protected RCAttribution(Handle h, long handle) { super(h, handle); }
    protected RCAttribution(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enableAdServicesAttributionTokenCollection")
    public native void enableAdServicesAttributionTokenCollection();
    @Method(selector = "collectDeviceIdentifiers")
    public native void collectDeviceIdentifiers();
    @Method(selector = "setAttributes:")
    public native void setAttributes(NSDictionary<NSString, NSString> attributes);
    @Method(selector = "setEmail:")
    public native void setEmail(String email);
    @Method(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String phoneNumber);
    @Method(selector = "setDisplayName:")
    public native void setDisplayName(String displayName);
    @Method(selector = "setPushToken:")
    public native void setPushToken(NSData pushToken);
    @Method(selector = "setPushTokenString:")
    public native void setPushTokenString(String pushToken);
    @Method(selector = "setAdjustID:")
    public native void setAdjustID(String adjustID);
    @Method(selector = "setAppsflyerID:")
    public native void setAppsflyerID(String appsflyerID);
    @Method(selector = "setFBAnonymousID:")
    public native void setFBAnonymousID(String fbAnonymousID);
    @Method(selector = "setMparticleID:")
    public native void setMparticleID(String mparticleID);
    @Method(selector = "setOnesignalID:")
    public native void setOnesignalID(String onesignalID);
    @Method(selector = "setOnesignalUserID:")
    public native void setOnesignalUserID(String onesignalUserID);
    @Method(selector = "setAirshipChannelID:")
    public native void setAirshipChannelID(String airshipChannelID);
    @Method(selector = "setCleverTapID:")
    public native void setCleverTapID(String cleverTapID);
    @Method(selector = "setAirbridgeDeviceID:")
    public native void setAirbridgeDeviceID(String airbridgeDeviceID);
    @Method(selector = "setKochavaDeviceID:")
    public native void setKochavaDeviceID(String kochavaDeviceID);
    @Method(selector = "setSolarEngineDistinctId:")
    public native void setSolarEngineDistinctId(String solarEngineDistinctId);
    @Method(selector = "setSolarEngineAccountId:")
    public native void setSolarEngineAccountId(String solarEngineAccountId);
    @Method(selector = "setSolarEngineVisitorId:")
    public native void setSolarEngineVisitorId(String solarEngineVisitorId);
    @Method(selector = "setMixpanelDistinctID:")
    public native void setMixpanelDistinctID(String mixpanelDistinctID);
    @Method(selector = "setFirebaseAppInstanceID:")
    public native void setFirebaseAppInstanceID(String firebaseAppInstanceID);
    @Method(selector = "setTenjinAnalyticsInstallationID:")
    public native void setTenjinAnalyticsInstallationID(String tenjinAnalyticsInstallationID);
    @Method(selector = "setPostHogUserID:")
    public native void setPostHogUserID(String postHogUserID);
    @Method(selector = "setAmplitudeUserID:")
    public native void setAmplitudeUserID(String amplitudeUserID);
    @Method(selector = "setAmplitudeDeviceID:")
    public native void setAmplitudeDeviceID(String amplitudeDeviceID);
    @Method(selector = "setMediaSource:")
    public native void setMediaSource(String mediaSource);
    @Method(selector = "setCampaign:")
    public native void setCampaign(String campaign);
    @Method(selector = "setAdGroup:")
    public native void setAdGroup(String adGroup);
    @Method(selector = "setAd:")
    public native void setAd(String installAd);
    @Method(selector = "setKeyword:")
    public native void setKeyword(String keyword);
    @Method(selector = "setCreative:")
    public native void setCreative(String creative);
    @Method(selector = "setAppsFlyerConversionData:")
    public native void setAppsFlyerConversionData(NSDictionary<?, ?> data);
    @Method(selector = "setAppstackAttributionParams:completion:")
    public native void setAppstackAttributionParams(NSDictionary<NSString, ?> data, @Block VoidBlock2<RCOfferings, NSError> completion);
    /*</methods>*/
}
