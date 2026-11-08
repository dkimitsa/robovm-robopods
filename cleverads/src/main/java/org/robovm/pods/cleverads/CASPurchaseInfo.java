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
package org.robovm.pods.cleverads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASPurchaseInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASPurchaseInfoPtr extends Ptr<CASPurchaseInfo, CASPurchaseInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASPurchaseInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASPurchaseInfo() {}
    protected CASPurchaseInfo(Handle h, long handle) { super(h, handle); }
    protected CASPurchaseInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProductID:price:currency:quantity:")
    public CASPurchaseInfo(String productID, NSDecimalNumber price, String currency, @MachineSizedSInt long quantity) { super((SkipInit) null); initObject(init(productID, price, currency, quantity)); }
    @Method(selector = "initWithCopying:")
    public CASPurchaseInfo(CASPurchaseInfo other) { super((SkipInit) null); initObject(init(other)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productID")
    public native String getProductID();
    @Property(selector = "quantity")
    public native @MachineSizedSInt long getQuantity();
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "receiptBase64")
    public native String getReceiptBase64();
    @Property(selector = "jwsRepresentation")
    public native String getJwsRepresentation();
    @Property(selector = "jsonRepresentation")
    public native String getJsonRepresentation();
    @Property(selector = "transactionID")
    public native String getTransactionID();
    @Property(selector = "originalTransactionID")
    public native String getOriginalTransactionID();
    @Property(selector = "originalPurchaseDate")
    public native long getOriginalPurchaseDate();
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "provider")
    public native String getProvider();
    @Property(selector = "setProvider:")
    public native void setProvider(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProductID:price:currency:quantity:")
    protected native @Pointer long init(String productID, NSDecimalNumber price, String currency, @MachineSizedSInt long quantity);
    @Method(selector = "setValidationWithTransactionID:jwsRepresentation:")
    public native CASPurchaseInfo setValidation(long transactionID, String jwsRepresentation);
    @Method(selector = "setValidationWithTransactionID:receiptData:")
    public native CASPurchaseInfo setValidation(String transactionID, NSData receiptData);
    @Method(selector = "setSubsValidationWithTransactionID:originalID:originalPurchaseDate:jwsRepresentation:jsonRepresentation:")
    public native CASPurchaseInfo setSubsValidation(long transactionID, long originalID, NSDate originalPurchaseDate, String jwsRepresentation, NSData jsonRepresentation);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "setSubsValidationFromStoreKit")
    public native CASPurchaseInfo setSubsValidationFromStoreKit();
    @Method(selector = "setXsollaValidationWithOrderID:userID:")
    public native void setXsollaValidation(String orderID, String userID);
    @Method(selector = "initWithCopying:")
    protected native @Pointer long init(CASPurchaseInfo other);
    @Method(selector = "providerAppleAppStore")
    public static native String providerAppleAppStore();
    @Method(selector = "providerXsolla")
    public static native String providerXsolla();
    /*</methods>*/
}
