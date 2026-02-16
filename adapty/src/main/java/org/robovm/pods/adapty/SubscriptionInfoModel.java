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
package org.robovm.pods.adapty;

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
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty21SubscriptionInfoModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SubscriptionInfoModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SubscriptionInfoModelPtr extends Ptr<SubscriptionInfoModel, SubscriptionInfoModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SubscriptionInfoModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SubscriptionInfoModel() {}
    protected SubscriptionInfoModel(Handle h, long handle) { super(h, handle); }
    protected SubscriptionInfoModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "setIsActive:")
    public native void setIsActive(boolean v);
    @Property(selector = "vendorProductId")
    public native String getVendorProductId();
    @Property(selector = "setVendorProductId:")
    public native void setVendorProductId(String v);
    @Property(selector = "store")
    public native String getStore();
    @Property(selector = "setStore:")
    public native void setStore(String v);
    @Property(selector = "activatedAt")
    public native NSDate getActivatedAt();
    @Property(selector = "setActivatedAt:")
    public native void setActivatedAt(NSDate v);
    @Property(selector = "renewedAt")
    public native NSDate getRenewedAt();
    @Property(selector = "setRenewedAt:")
    public native void setRenewedAt(NSDate v);
    @Property(selector = "expiresAt")
    public native NSDate getExpiresAt();
    @Property(selector = "setExpiresAt:")
    public native void setExpiresAt(NSDate v);
    @Property(selector = "startsAt")
    public native NSDate getStartsAt();
    @Property(selector = "setStartsAt:")
    public native void setStartsAt(NSDate v);
    @Property(selector = "isLifetime")
    public native boolean isLifetime();
    @Property(selector = "setIsLifetime:")
    public native void setIsLifetime(boolean v);
    @Property(selector = "activeIntroductoryOfferType")
    public native String getActiveIntroductoryOfferType();
    @Property(selector = "setActiveIntroductoryOfferType:")
    public native void setActiveIntroductoryOfferType(String v);
    @Property(selector = "activePromotionalOfferType")
    public native String getActivePromotionalOfferType();
    @Property(selector = "setActivePromotionalOfferType:")
    public native void setActivePromotionalOfferType(String v);
    @Property(selector = "willRenew")
    public native boolean isWillRenew();
    @Property(selector = "setWillRenew:")
    public native void setWillRenew(boolean v);
    @Property(selector = "isInGracePeriod")
    public native boolean isInGracePeriod();
    @Property(selector = "setIsInGracePeriod:")
    public native void setIsInGracePeriod(boolean v);
    @Property(selector = "unsubscribedAt")
    public native NSDate getUnsubscribedAt();
    @Property(selector = "setUnsubscribedAt:")
    public native void setUnsubscribedAt(NSDate v);
    @Property(selector = "billingIssueDetectedAt")
    public native NSDate getBillingIssueDetectedAt();
    @Property(selector = "setBillingIssueDetectedAt:")
    public native void setBillingIssueDetectedAt(NSDate v);
    @Property(selector = "isSandbox")
    public native boolean isSandbox();
    @Property(selector = "setIsSandbox:")
    public native void setIsSandbox(boolean v);
    @Property(selector = "vendorTransactionId")
    public native String getVendorTransactionId();
    @Property(selector = "setVendorTransactionId:")
    public native void setVendorTransactionId(String v);
    @Property(selector = "vendorOriginalTransactionId")
    public native String getVendorOriginalTransactionId();
    @Property(selector = "setVendorOriginalTransactionId:")
    public native void setVendorOriginalTransactionId(String v);
    @Property(selector = "cancellationReason")
    public native String getCancellationReason();
    @Property(selector = "setCancellationReason:")
    public native void setCancellationReason(String v);
    @Property(selector = "isRefund")
    public native boolean isRefund();
    @Property(selector = "setIsRefund:")
    public native void setIsRefund(boolean v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
