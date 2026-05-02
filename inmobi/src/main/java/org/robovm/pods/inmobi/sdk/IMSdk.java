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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMSdk")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMSdk/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMSdkPtr extends Ptr<IMSdk, IMSdkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMSdk.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMSdk() {}
    protected IMSdk(Handle h, long handle) { super(h, handle); }
    protected IMSdk(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccountID:andCompletionHandler:")
    public static native void init(String accountID, @Block VoidBlock1<NSError> completionBlock);
    @Method(selector = "initWithAccountID:consentDictionary:andCompletionHandler:")
    public static native void init(String accountID, NSDictionary<NSString, ?> consentDictionary, @Block VoidBlock1<NSError> completionBlock);
    /**
     * @deprecated Please use new API initWithAccountID:consentDictionary:andCompletionHandler: as this API can be removed in future
     */
    @Deprecated
    @Method(selector = "initWithAccountID:consentDictionary:")
    public static native void init(String accountID, NSDictionary<NSString, ?> consentDictionary);
    /**
     * @deprecated Please use new API initWithAccountID:andCompletionHandler: as this API can be removed in future
     */
    @Deprecated
    @Method(selector = "initWithAccountID:")
    public static native void init(String accountID);
    @Method(selector = "updateGDPRConsent:")
    public static native void updateGDPRConsent(NSDictionary<NSString, ?> consentDictionary);
    @Method(selector = "setPartnerGDPRConsent:")
    public static native void setPartnerGDPRConsent(NSDictionary<NSString, ?> consentDictionary);
    @Method(selector = "setIsAgeRestricted:")
    public static native void setIsAgeRestricted(boolean isRestricted);
    @Method(selector = "getVersion")
    public static native String getVersion();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(IMSDKLogLevel desiredLogLevel);
    @Method(selector = "getToken")
    public static native String getToken();
    @Method(selector = "getTokenWithExtras:andKeywords:")
    public static native String getToken(NSDictionary<NSString, ?> extras, String keywords);
    @Method(selector = "putPublisherSignals:")
    public static native void putPublisherSignals(NSDictionary<NSString, ?> signals);
    @Method(selector = "getPublisherSignals")
    public static native NSDictionary<NSString, ?> getPublisherSignals();
    @Method(selector = "resetPublisherSignals")
    public static native void resetPublisherSignals();
    @Method(selector = "shouldAutoManageAVAudioSession:")
    public static native void shouldAutoManageAVAudioSession(boolean value);
    @Method(selector = "setMute:")
    public static native void setMute(boolean shouldMute);
    @Method(selector = "setPublisherProvidedUnifiedId:")
    public static native void setPublisherProvidedUnifiedId(NSDictionary<NSString, ?> ids);
    @Method(selector = "setAge:")
    public static native void setAge(@MachineSizedSInt long age);
    @Method(selector = "setAreaCode:")
    public static native void setAreaCode(String areaCode);
    @Method(selector = "setAgeGroup:")
    public static native void setAgeGroup(IMSDKAgeGroup ageGroup);
    @Method(selector = "setYearOfBirth:")
    public static native void setYearOfBirth(@MachineSizedSInt long yearOfBirth);
    @Method(selector = "setEducation:")
    public static native void setEducation(IMSDKEducation education);
    @Method(selector = "setGender:")
    public static native void setGender(IMSDKGender gender);
    @Method(selector = "setInterests:")
    public static native void setInterests(String interests);
    @Method(selector = "setLanguage:")
    public static native void setLanguage(String language);
    @Method(selector = "setLocationWithCity:state:country:")
    public static native void setLocation(String city, String state, String country);
    @Method(selector = "setLocation:")
    public static native void setLocation(CLLocation location);
    @Method(selector = "setPostalCode:")
    public static native void setPostalCode(String postalcode);
    /*</methods>*/
}
