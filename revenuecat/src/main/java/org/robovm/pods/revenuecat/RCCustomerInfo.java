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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCCustomerInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCCustomerInfoPtr extends Ptr<RCCustomerInfo, RCCustomerInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCCustomerInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCCustomerInfo() {}
    protected RCCustomerInfo(Handle h, long handle) { super(h, handle); }
    protected RCCustomerInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entitlements")
    public native RCEntitlementInfos getEntitlements();
    @Property(selector = "activeSubscriptions")
    public native NSSet<NSString> getActiveSubscriptions();
    @Property(selector = "allPurchasedProductIdentifiers")
    public native NSSet<NSString> getAllPurchasedProductIdentifiers();
    @Property(selector = "latestExpirationDate")
    public native NSDate getLatestExpirationDate();
    @Property(selector = "nonSubscriptions")
    public native NSArray<RCNonSubscriptionTransaction> getNonSubscriptions();
    @Property(selector = "requestDate")
    public native NSDate getRequestDate();
    @Property(selector = "firstSeen")
    public native NSDate getFirstSeen();
    @Property(selector = "originalAppUserId")
    public native String getOriginalAppUserId();
    @Property(selector = "managementURL")
    public native NSURL getManagementURL();
    @Property(selector = "originalPurchaseDate")
    public native NSDate getOriginalPurchaseDate();
    @Property(selector = "originalApplicationVersion")
    public native String getOriginalApplicationVersion();
    @Property(selector = "subscriptionsByProductIdentifier")
    public native NSDictionary<NSString, RCSubscriptionInfo> getSubscriptionsByProductIdentifier();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "rawData")
    public native NSDictionary<NSString, ?> getRawData();
    /**
     * @deprecated use nonSubscriptionTransactions
     */
    @Deprecated
    @Property(selector = "nonConsumablePurchases")
    public native NSSet<NSString> getNonConsumablePurchases();
    /**
     * @deprecated Use nonSubscriptions
     */
    @Deprecated
    @Property(selector = "nonSubscriptionTransactions")
    public native NSArray<RCStoreTransaction> getNonSubscriptionTransactions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "expirationDateForProductIdentifier:")
    public native NSDate expirationDateForProductIdentifier(String productIdentifier);
    @Method(selector = "purchaseDateForProductIdentifier:")
    public native NSDate purchaseDateForProductIdentifier(String productIdentifier);
    @Method(selector = "expirationDateForEntitlement:")
    public native NSDate expirationDateForEntitlement(String entitlementIdentifier);
    @Method(selector = "purchaseDateForEntitlement:")
    public native NSDate purchaseDateForEntitlement(String entitlementIdentifier);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
