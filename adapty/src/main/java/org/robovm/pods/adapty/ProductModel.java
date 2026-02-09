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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty12ProductModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ProductModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ProductModelPtr extends Ptr<ProductModel, ProductModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ProductModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ProductModel() {}
    protected ProductModel(Handle h, long handle) { super(h, handle); }
    protected ProductModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vendorProductId")
    public native String getVendorProductId();
    @Property(selector = "setVendorProductId:")
    public native void setVendorProductId(String v);
    @Property(selector = "introductoryOfferEligibility")
    public native boolean isIntroductoryOfferEligibility();
    @Property(selector = "setIntroductoryOfferEligibility:")
    public native void setIntroductoryOfferEligibility(boolean v);
    @Property(selector = "promotionalOfferEligibility")
    public native boolean isPromotionalOfferEligibility();
    @Property(selector = "setPromotionalOfferEligibility:")
    public native void setPromotionalOfferEligibility(boolean v);
    @Property(selector = "promotionalOfferId")
    public native String getPromotionalOfferId();
    @Property(selector = "setPromotionalOfferId:")
    public native void setPromotionalOfferId(String v);
    @Property(selector = "variationId")
    public native String getVariationId();
    @Property(selector = "setVariationId:")
    public native void setVariationId(String v);
    @Property(selector = "paywallABTestName")
    public native String getPaywallABTestName();
    @Property(selector = "setPaywallABTestName:")
    public native void setPaywallABTestName(String v);
    @Property(selector = "paywallName")
    public native String getPaywallName();
    @Property(selector = "setPaywallName:")
    public native void setPaywallName(String v);
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "setLocalizedTitle:")
    public native void setLocalizedTitle(String v);
    @Property(selector = "price")
    public native @ByVal NSDecimal getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(@ByVal NSDecimal v);
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Property(selector = "currencySymbol")
    public native String getCurrencySymbol();
    @Property(selector = "setCurrencySymbol:")
    public native void setCurrencySymbol(String v);
    @Property(selector = "regionCode")
    public native String getRegionCode();
    @Property(selector = "setRegionCode:")
    public native void setRegionCode(String v);
    @Property(selector = "isFamilyShareable")
    public native boolean isFamilyShareable();
    @Property(selector = "setIsFamilyShareable:")
    public native void setIsFamilyShareable(boolean v);
    @Property(selector = "subscriptionPeriod")
    public native ProductSubscriptionPeriodModel getSubscriptionPeriod();
    @Property(selector = "setSubscriptionPeriod:")
    public native void setSubscriptionPeriod(ProductSubscriptionPeriodModel v);
    @Property(selector = "introductoryDiscount")
    public native ProductDiscountModel getIntroductoryDiscount();
    @Property(selector = "setIntroductoryDiscount:")
    public native void setIntroductoryDiscount(ProductDiscountModel v);
    @Property(selector = "subscriptionGroupIdentifier")
    public native String getSubscriptionGroupIdentifier();
    @Property(selector = "setSubscriptionGroupIdentifier:")
    public native void setSubscriptionGroupIdentifier(String v);
    @Property(selector = "discounts")
    public native NSArray<ProductDiscountModel> getDiscounts();
    @Property(selector = "setDiscounts:")
    public native void setDiscounts(NSArray<ProductDiscountModel> v);
    @Property(selector = "localizedPrice")
    public native String getLocalizedPrice();
    @Property(selector = "setLocalizedPrice:")
    public native void setLocalizedPrice(String v);
    @Property(selector = "localizedSubscriptionPeriod")
    public native String getLocalizedSubscriptionPeriod();
    @Property(selector = "setLocalizedSubscriptionPeriod:")
    public native void setLocalizedSubscriptionPeriod(String v);
    @Property(selector = "skProduct")
    public native SKProduct getSkProduct();
    @Property(selector = "setSkProduct:")
    public native void setSkProduct(SKProduct v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
