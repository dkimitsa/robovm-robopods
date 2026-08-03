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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("RevenueCat.StoreKit1Wrapper")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/StoreKit1Wrapper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SKPaymentQueueDelegate, PaymentQueueWrapperType, SKPaymentTransactionObserver/*</implements>*/ {

    /*<ptr>*/public static class StoreKit1WrapperPtr extends Ptr<StoreKit1Wrapper, StoreKit1WrapperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(StoreKit1Wrapper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected StoreKit1Wrapper() {}
    protected StoreKit1Wrapper(Handle h, long handle) { super(h, handle); }
    protected StoreKit1Wrapper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "paymentQueueShouldShowPriceConsent:")
    public native boolean paymentQueueShouldShowPriceConsent(SKPaymentQueue paymentQueue);
    @Method(selector = "finishTransaction:completion:")
    public native void finishTransaction(SKPaymentTransaction transaction, @Block Runnable completion);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "showPriceConsentIfNeeded")
    public native void showPriceConsentIfNeeded();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "presentCodeRedemptionSheet")
    public native void presentCodeRedemptionSheet();
    @Method(selector = "paymentQueue:updatedTransactions:")
    public native void updatedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    @Method(selector = "paymentQueue:removedTransactions:")
    public native void removedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    @Method(selector = "paymentQueue:shouldAddStorePayment:forProduct:")
    public native boolean shouldAddStorePayment(SKPaymentQueue queue, SKPayment payment, SKProduct product);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "paymentQueue:didRevokeEntitlementsForProductIdentifiers:")
    public native void didRevokeEntitlements(SKPaymentQueue queue, NSArray<NSString> productIdentifiers);
    @Method(selector = "paymentQueueDidChangeStorefront:")
    public native void paymentQueueDidChangeStorefront(SKPaymentQueue queue);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 18.0. Pass Product.PurchaseOption.onStorefrontChange(shouldContinuePurchase:) to product.purchase(options:).
     */
    @Deprecated
    @Method(selector = "paymentQueue:shouldContinueTransaction:inStorefront:")
    public native boolean shouldContinueTransaction(SKPaymentQueue paymentQueue, SKPaymentTransaction transaction, SKStorefront newStorefront);
    /**
     * @deprecated Deprecated in iOS 18.0. Use AppStore.sync().
     */
    @Deprecated
    @Method(selector = "paymentQueue:restoreCompletedTransactionsFailedWithError:")
    public native void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error);
    /**
     * @deprecated Deprecated in iOS 18.0. Use AppStore.sync().
     */
    @Deprecated
    @Method(selector = "paymentQueueRestoreCompletedTransactionsFinished:")
    public native void restoreCompletedTransactionsFinished(SKPaymentQueue queue);
    /**
     * @deprecated Deprecated in iOS 16.0. Hosted content is no longer supported.
     */
    @Deprecated
    @Method(selector = "paymentQueue:updatedDownloads:")
    public native void updatedDownloads(SKPaymentQueue queue, NSArray<SKDownload> downloads);
    /*</methods>*/
}
