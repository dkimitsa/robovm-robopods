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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCSubscriptionInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCSubscriptionInfoPtr extends Ptr<RCSubscriptionInfo, RCSubscriptionInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCSubscriptionInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCSubscriptionInfo() {}
    protected RCSubscriptionInfo(Handle h, long handle) { super(h, handle); }
    protected RCSubscriptionInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productIdentifier")
    public native String getProductIdentifier();
    @Property(selector = "purchaseDate")
    public native NSDate getPurchaseDate();
    @Property(selector = "originalPurchaseDate")
    public native NSDate getOriginalPurchaseDate();
    @Property(selector = "expiresDate")
    public native NSDate getExpiresDate();
    @Property(selector = "store")
    public native RCStore getStore();
    @Property(selector = "isSandbox")
    public native boolean isSandbox();
    @Property(selector = "unsubscribeDetectedAt")
    public native NSDate getUnsubscribeDetectedAt();
    @Property(selector = "billingIssuesDetectedAt")
    public native NSDate getBillingIssuesDetectedAt();
    @Property(selector = "gracePeriodExpiresDate")
    public native NSDate getGracePeriodExpiresDate();
    @Property(selector = "ownershipType")
    public native RCPurchaseOwnershipType getOwnershipType();
    @Property(selector = "periodType")
    public native RCPeriodType getPeriodType();
    @Property(selector = "refundedAt")
    public native NSDate getRefundedAt();
    @Property(selector = "storeTransactionId")
    public native String getStoreTransactionId();
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "willRenew")
    public native boolean isWillRenew();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "price")
    public native RCProductPaidPrice getPrice();
    @Property(selector = "managementURL")
    public native NSURL getManagementURL();
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
