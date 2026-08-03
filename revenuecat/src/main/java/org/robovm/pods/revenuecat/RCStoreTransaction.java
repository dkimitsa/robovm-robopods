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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCStoreTransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCStoreTransactionPtr extends Ptr<RCStoreTransaction, RCStoreTransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCStoreTransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCStoreTransaction() {}
    protected RCStoreTransaction(Handle h, long handle) { super(h, handle); }
    protected RCStoreTransaction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productIdentifier")
    public native String getProductIdentifier();
    @Property(selector = "purchaseDate")
    public native NSDate getPurchaseDate();
    @Property(selector = "transactionIdentifier")
    public native String getTransactionIdentifier();
    @Property(selector = "quantity")
    public native @MachineSizedSInt long getQuantity();
    @Property(selector = "storefront")
    public native RCStorefront getStorefront();
    @Property(selector = "jwsRepresentation")
    public native String getJwsRepresentation();
    @Property(selector = "revocationDate")
    public native NSDate getRevocationDate();
    @Property(selector = "revocationReason")
    public native RCRevocationReason getRevocationReason();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "productId")
    public native String getProductId();
    @Property(selector = "revenueCatId")
    public native String getRevenueCatId();
    @Property(selector = "sk1Transaction")
    public native SKPaymentTransaction getSk1Transaction();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
