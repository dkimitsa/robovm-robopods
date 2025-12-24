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
package org.robovm.pods.tenjin;

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
import org.robovm.apple.coredata.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.TJNUserProfileManager")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TJNUserProfileManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TJNUserProfileManagerPtr extends Ptr<TJNUserProfileManager, TJNUserProfileManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TJNUserProfileManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TJNUserProfileManager() {}
    protected TJNUserProfileManager(Handle h, long handle) { super(h, handle); }
    protected TJNUserProfileManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "recordIAPTransactionWithRevenue:currencyCode:")
    public native void recordIAPTransaction(double revenue, String currencyCode);
    @Method(selector = "recordIAPTransactionWithRevenue:currencyCode:productID:")
    public native void recordIAPTransaction(double revenue, String currencyCode, String productID);
    @Method(selector = "recordILRDRevenueWithRevenueUSD:network:")
    public native void recordILRDRevenue(double revenueUSD, TJNAdNetwork network);
    @Method(selector = "getProfileData")
    public native TJNUserProfileData getProfileData();
    @Method(selector = "getProfileDictionary")
    public native NSDictionary<NSString, ?> getProfileDictionary();
    @Method(selector = "getScalarProfileDictionary")
    public native NSDictionary<NSString, ?> getScalarProfileDictionary();
    @Method(selector = "resetProfile")
    public native void resetProfile();
    @Method(selector = "shared")
    public static native TJNUserProfileManager shared();
    @Method(selector = "sessionTimeoutInterval")
    public static native double sessionTimeoutInterval();
    @Method(selector = "setSessionTimeoutInterval:")
    public static native void setSessionTimeoutInterval(double value);
    /*</methods>*/
}
