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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALPrivacySettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALPrivacySettingsPtr extends Ptr<ALPrivacySettings, ALPrivacySettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALPrivacySettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALPrivacySettings() {}
    protected ALPrivacySettings(Handle h, long handle) { super(h, handle); }
    protected ALPrivacySettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setHasUserConsent:")
    public static native void setHasUserConsent(boolean hasUserConsent);
    @Method(selector = "hasUserConsent")
    public static native boolean hasUserConsent();
    @Method(selector = "isUserConsentSet")
    public static native boolean isUserConsentSet();
    @Method(selector = "setDoNotSell:")
    public static native void setDoNotSell(boolean doNotSell);
    @Method(selector = "isDoNotSell")
    public static native boolean isDoNotSell();
    @Method(selector = "isDoNotSellSet")
    public static native boolean isDoNotSellSet();
    @Method(selector = "tcfVendorConsentStatusForIdentifier:")
    public static native NSNumber tcfVendorConsentStatusForIdentifier(@MachineSizedSInt long vendorIdentifier);
    @Method(selector = "additionalConsentStatusForIdentifier:")
    public static native NSNumber additionalConsentStatusForIdentifier(@MachineSizedSInt long atpIdentifier);
    @Method(selector = "purposeConsentStatusForIdentifier:")
    public static native NSNumber purposeConsentStatusForIdentifier(@MachineSizedSInt long purposeIdentifier);
    @Method(selector = "specialFeatureOptInStatusForIdentifier:")
    public static native NSNumber specialFeatureOptInStatusForIdentifier(@MachineSizedSInt long specialFeatureIdentifier);
    /*</methods>*/
}
