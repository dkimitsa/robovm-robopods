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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCPurchaseParamsBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCPurchaseParamsBuilderPtr extends Ptr<RCPurchaseParamsBuilder, RCPurchaseParamsBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCPurchaseParamsBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCPurchaseParamsBuilder() {}
    protected RCPurchaseParamsBuilder(Handle h, long handle) { super(h, handle); }
    protected RCPurchaseParamsBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPackage:")
    public RCPurchaseParamsBuilder(RCPackage _static) { super((SkipInit) null); initObject(init(_static)); }
    @Method(selector = "initWithProduct:")
    public RCPurchaseParamsBuilder(RCStoreProduct product) { super((SkipInit) null); initObject(init(product)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPackage:")
    protected native @Pointer long init(RCPackage _static);
    @Method(selector = "initWithProduct:")
    protected native @Pointer long init(RCStoreProduct product);
    @Method(selector = "withPromotionalOffer:")
    public native RCPurchaseParamsBuilder withPromotionalOffer(RCPromotionalOffer promotionalOffer);
    @Method(selector = "withQuantity:")
    public native RCPurchaseParamsBuilder withQuantity(@MachineSizedSInt long quantity);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "withWinBackOffer:")
    public native RCPurchaseParamsBuilder withWinBackOffer(RCWinBackOffer winBackOffer);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "withIntroductoryOfferEligibilityJWS:")
    public native RCPurchaseParamsBuilder withIntroductoryOfferEligibilityJWS(String introductoryOfferEligibilityJWS);
    @Method(selector = "build")
    public native RCPurchaseParams build();
    /*</methods>*/
}
