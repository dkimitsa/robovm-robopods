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
package org.robovm.pods.appsflyer;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AppsFlyerLib.AppsFlyerConsent")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppsFlyerConsent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class AppsFlyerConsentPtr extends Ptr<AppsFlyerConsent, AppsFlyerConsentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppsFlyerConsent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppsFlyerConsent() {}
    protected AppsFlyerConsent(Handle h, long handle) { super(h, handle); }
    protected AppsFlyerConsent(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Use init(isUserSubjectToGDPR:, hasConsentForDataUsage:, hasConsentForAdsPersonalization:, hasConsentForAdStorage:) instead
     */
    @Deprecated
    @Method(selector = "initWithNonGDPRUser")
    public static  AppsFlyerConsent createUsingNonGDPRUser() {
       AppsFlyerConsent res = new AppsFlyerConsent((SkipInit) null);
       res.initObject(res.initWithNonGDPRUser());
       return res;
    }
    @Method(selector = "initWithIsUserSubjectToGDPR:hasConsentForDataUsage:hasConsentForAdsPersonalization:hasConsentForAdStorage:")
    public AppsFlyerConsent(NSNumber isUserSubjectToGDPR, NSNumber hasConsentForDataUsage, NSNumber hasConsentForAdsPersonalization, NSNumber hasConsentForAdStorage) { super((SkipInit) null); initObject(init(isUserSubjectToGDPR, hasConsentForDataUsage, hasConsentForAdsPersonalization, hasConsentForAdStorage)); }
    /**
     * @deprecated Use init(isUserSubjectToGDPR:, hasConsentForDataUsage:, hasConsentForAdsPersonalization:, hasConsentForAdStorage:) instead
     */
    @Deprecated
    @Method(selector = "initForGDPRUserWithHasConsentForDataUsage:hasConsentForAdsPersonalization:")
    public AppsFlyerConsent(boolean forGDPRUserWithHasConsentForDataUsage, boolean hasConsentForAdsPersonalization) { super((SkipInit) null); initObject(init(forGDPRUserWithHasConsentForDataUsage, hasConsentForAdsPersonalization)); }
    @Method(selector = "initWithCoder:")
    public AppsFlyerConsent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isUserSubjectToGDPR")
    public native boolean isUserSubjectToGDPR();
    @Property(selector = "hasConsentForDataUsage")
    public native boolean hasConsentForDataUsage();
    @Property(selector = "hasConsentForAdsPersonalization")
    public native boolean hasConsentForAdsPersonalization();
    @Property(selector = "hasConsentForAdStorage")
    public native NSNumber getHasConsentForAdStorage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Use init(isUserSubjectToGDPR:, hasConsentForDataUsage:, hasConsentForAdsPersonalization:, hasConsentForAdStorage:) instead
     */
    @Deprecated
    @Method(selector = "initWithNonGDPRUser")
    protected native @Pointer long initWithNonGDPRUser();
    @Method(selector = "initWithIsUserSubjectToGDPR:hasConsentForDataUsage:hasConsentForAdsPersonalization:hasConsentForAdStorage:")
    protected native @Pointer long init(NSNumber isUserSubjectToGDPR, NSNumber hasConsentForDataUsage, NSNumber hasConsentForAdsPersonalization, NSNumber hasConsentForAdStorage);
    /**
     * @deprecated Use init(isUserSubjectToGDPR:, hasConsentForDataUsage:, hasConsentForAdsPersonalization:, hasConsentForAdStorage:) instead
     */
    @Deprecated
    @Method(selector = "initForGDPRUserWithHasConsentForDataUsage:hasConsentForAdsPersonalization:")
    protected native @Pointer long init(boolean forGDPRUserWithHasConsentForDataUsage, boolean hasConsentForAdsPersonalization);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
