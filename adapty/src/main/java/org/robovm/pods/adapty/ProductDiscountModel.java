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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty20ProductDiscountModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ProductDiscountModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ProductDiscountModelPtr extends Ptr<ProductDiscountModel, ProductDiscountModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ProductDiscountModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ProductDiscountModel() {}
    protected ProductDiscountModel(Handle h, long handle) { super(h, handle); }
    protected ProductDiscountModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "price")
    public native @ByVal NSDecimal getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(@ByVal NSDecimal v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "subscriptionPeriod")
    public native ProductSubscriptionPeriodModel getSubscriptionPeriod();
    @Property(selector = "setSubscriptionPeriod:")
    public native void setSubscriptionPeriod(ProductSubscriptionPeriodModel v);
    @Property(selector = "numberOfPeriods")
    public native @MachineSizedSInt long getNumberOfPeriods();
    @Property(selector = "setNumberOfPeriods:")
    public native void setNumberOfPeriods(@MachineSizedSInt long v);
    @Property(selector = "paymentMode")
    public native PaymentMode getPaymentMode();
    @Property(selector = "setPaymentMode:")
    public native void setPaymentMode(PaymentMode v);
    @Property(selector = "localizedPrice")
    public native String getLocalizedPrice();
    @Property(selector = "setLocalizedPrice:")
    public native void setLocalizedPrice(String v);
    @Property(selector = "localizedSubscriptionPeriod")
    public native String getLocalizedSubscriptionPeriod();
    @Property(selector = "setLocalizedSubscriptionPeriod:")
    public native void setLocalizedSubscriptionPeriod(String v);
    @Property(selector = "localizedNumberOfPeriods")
    public native String getLocalizedNumberOfPeriods();
    @Property(selector = "setLocalizedNumberOfPeriods:")
    public native void setLocalizedNumberOfPeriods(String v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
