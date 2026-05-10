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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCStoreProductDiscount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCStoreProductDiscountPtr extends Ptr<RCStoreProductDiscount, RCStoreProductDiscountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCStoreProductDiscount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCStoreProductDiscount() {}
    protected RCStoreProductDiscount(Handle h, long handle) { super(h, handle); }
    protected RCStoreProductDiscount(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "offerIdentifier")
    public native String getOfferIdentifier();
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "localizedPriceString")
    public native String getLocalizedPriceString();
    @Property(selector = "paymentMode")
    public native RCPaymentMode getPaymentMode();
    @Property(selector = "subscriptionPeriod")
    public native RCSubscriptionPeriod getSubscriptionPeriod();
    @Property(selector = "numberOfPeriods")
    public native @MachineSizedSInt long getNumberOfPeriods();
    @Property(selector = "type")
    public native RCDiscountType getType();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "sk1Discount")
    public native SKProductDiscount getSk1Discount();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "pricePerDay")
    public native NSDecimalNumber getPricePerDay();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "pricePerWeek")
    public native NSDecimalNumber getPricePerWeek();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "pricePerMonth")
    public native NSDecimalNumber getPricePerMonth();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "pricePerYear")
    public native NSDecimalNumber getPricePerYear();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
