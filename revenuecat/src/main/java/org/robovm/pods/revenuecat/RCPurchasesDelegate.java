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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/RCPurchasesDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "shouldShowPriceConsent")
    boolean shouldShowPriceConsent();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "purchases:didReceiveUpdatedPurchaserInfo:")
    void didReceiveUpdatedPurchaserInfo(RCPurchases purchases, RCCustomerInfo purchaserInfo);
    @Method(selector = "purchases:receivedUpdatedCustomerInfo:")
    void receivedUpdatedCustomerInfo(RCPurchases purchases, RCCustomerInfo customerInfo);
    @Method(selector = "purchases:readyForPromotedProduct:purchase:")
    void readyForPromotedProduct(RCPurchases purchases, RCStoreProduct product, @Block("(@Block)") VoidBlock1<VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean>> startPurchase);
    @Method(selector = "purchases:shouldPurchasePromoProduct:defermentBlock:")
    void shouldPurchasePromoProduct(RCPurchases purchases, RCStoreProduct product, @Block("(@Block)") VoidBlock1<VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean>> makeDeferredPurchase);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
