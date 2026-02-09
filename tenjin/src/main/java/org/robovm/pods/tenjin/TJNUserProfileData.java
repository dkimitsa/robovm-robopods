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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.TJNUserProfileData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TJNUserProfileData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TJNUserProfileDataPtr extends Ptr<TJNUserProfileData, TJNUserProfileDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TJNUserProfileData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TJNUserProfileData() {}
    protected TJNUserProfileData(Handle h, long handle) { super(h, handle); }
    protected TJNUserProfileData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sessionCount")
    public native @MachineSizedSInt long getSessionCount();
    @Property(selector = "totalSessionTime")
    public native long getTotalSessionTime();
    @Property(selector = "lastSessionLength")
    public native long getLastSessionLength();
    @Property(selector = "currentSessionStartTime")
    public native NSDate getCurrentSessionStartTime();
    @Property(selector = "lastBackgroundTime")
    public native NSDate getLastBackgroundTime();
    @Property(selector = "currentSessionPausedTime")
    public native long getCurrentSessionPausedTime();
    @Property(selector = "firstSessionDate")
    public native NSDate getFirstSessionDate();
    @Property(selector = "lastSessionDate")
    public native NSDate getLastSessionDate();
    @Property(selector = "iapTransactionCount")
    public native @MachineSizedSInt long getIapTransactionCount();
    @Property(selector = "iapRevenueByCurrency")
    public native NSDictionary<NSString, NSNumber> getIapRevenueByCurrency();
    @Property(selector = "totalILRDRevenueUSD")
    public native double getTotalILRDRevenueUSD();
    @Property(selector = "ilrdRevenueByNetwork")
    public native NSDictionary<NSString, NSNumber> getIlrdRevenueByNetwork();
    @Property(selector = "currentSessionDuration")
    public native long getCurrentSessionDuration();
    @Property(selector = "totalSessionTimeIncludingCurrent")
    public native long getTotalSessionTimeIncludingCurrent();
    @Property(selector = "averageSessionLength")
    public native long getAverageSessionLength();
    @Property(selector = "purchasedProductIDsArray")
    public native NSArray<NSString> getPurchasedProductIDsArray();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getILRDRevenueForNetwork:")
    public native double getILRDRevenueForNetwork(TJNAdNetwork network);
    @Method(selector = "getIAPRevenueForCurrency:")
    public native double getIAPRevenueForCurrency(String currencyCode);
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    @Method(selector = "toScalarDictionary")
    public native NSDictionary<NSString, ?> toScalarDictionary();
    /*</methods>*/
}
