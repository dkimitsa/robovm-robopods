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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCStoreProduct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCStoreProductPtr extends Ptr<RCStoreProduct, RCStoreProductPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCStoreProduct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCStoreProduct() {}
    protected RCStoreProduct(Handle h, long handle) { super(h, handle); }
    protected RCStoreProduct(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSk1Product:")
    public RCStoreProduct(SKProduct sk1Product) { super((SkipInit) null); initObject(init(sk1Product)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "productType")
    public native RCStoreProductType getProductType();
    @Property(selector = "productCategory")
    public native RCStoreProductCategory getProductCategory();
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "localizedPriceString")
    public native String getLocalizedPriceString();
    @Property(selector = "productIdentifier")
    public native String getProductIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isFamilyShareable")
    public native boolean isFamilyShareable();
    @Property(selector = "subscriptionGroupIdentifier")
    public native String getSubscriptionGroupIdentifier();
    @Property(selector = "priceFormatter")
    public native NSNumberFormatter getPriceFormatter();
    @Property(selector = "subscriptionPeriod")
    public native RCSubscriptionPeriod getSubscriptionPeriod();
    @Property(selector = "introductoryDiscount")
    public native RCStoreProductDiscount getIntroductoryDiscount();
    @Property(selector = "discounts")
    public native NSArray<RCStoreProductDiscount> getDiscounts();
    @Property(selector = "sk1Product")
    public native SKProduct getSk1Product();
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
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
    @Property(selector = "localizedIntroductoryPriceString")
    public native String getLocalizedIntroductoryPriceString();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "localizedPricePerDay")
    public native String getLocalizedPricePerDay();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "localizedPricePerWeek")
    public native String getLocalizedPricePerWeek();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "localizedPricePerMonth")
    public native String getLocalizedPricePerMonth();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "localizedPricePerYear")
    public native String getLocalizedPricePerYear();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "initWithSk1Product:")
    protected native @Pointer long init(SKProduct sk1Product);
    /*</methods>*/
}
