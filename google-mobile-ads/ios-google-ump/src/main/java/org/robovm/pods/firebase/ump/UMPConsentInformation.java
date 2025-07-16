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
package org.robovm.pods.firebase.ump;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMPConsentInformation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMPConsentInformationPtr extends Ptr<UMPConsentInformation, UMPConsentInformationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMPConsentInformation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMPConsentInformation() {}
    protected UMPConsentInformation(Handle h, long handle) { super(h, handle); }
    protected UMPConsentInformation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native UMPConsentInformation getSharedInstance();
    @Property(selector = "consentStatus")
    public native UMPConsentStatus getConsentStatus();
    @Property(selector = "canRequestAds")
    public native boolean canRequestAds();
    @Property(selector = "formStatus")
    public native UMPFormStatus getFormStatus();
    @Property(selector = "privacyOptionsRequirementStatus")
    public native UMPPrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UMPVersionString", optional=true)
    public static native String getVersion();
    
    @Method(selector = "requestConsentInfoUpdateWithParameters:completionHandler:")
    public native void requestConsentInfoUpdate(UMPRequestParameters parameters, @Block VoidBlock1<NSError> handler);
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
