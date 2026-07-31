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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCPurchasesTypeAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements RCPurchasesType/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("appUserID")
    public String getAppUserID() { return null; }
    @NotImplemented("storeFrontCountryCode")
    public String getStoreFrontCountryCode() { return null; }
    @NotImplemented("isAnonymous")
    public boolean isAnonymous() { return false; }
    @NotImplemented("purchasesAreCompletedBy")
    public RCPurchasesAreCompletedBy getPurchasesAreCompletedBy() { return null; }
    @NotImplemented("setPurchasesAreCompletedBy:")
    public void setPurchasesAreCompletedBy(RCPurchasesAreCompletedBy v) {}
    @NotImplemented("delegate")
    public RCPurchasesDelegate getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(RCPurchasesDelegate v) {}
    @NotImplemented("cachedCustomerInfo")
    public RCCustomerInfo getCachedCustomerInfo() { return null; }
    @NotImplemented("cachedOfferings")
    public RCOfferings getCachedOfferings() { return null; }
    @NotImplemented("attribution")
    public RCAttribution getAttribution() { return null; }
    @NotImplemented("cachedVirtualCurrencies")
    public RCVirtualCurrencies getCachedVirtualCurrencies() { return null; }
    @Deprecated
    @NotImplemented("allowSharingAppStoreAccount")
    public boolean isAllowSharingAppStoreAccount() { return false; }
    @Deprecated
    @NotImplemented("setAllowSharingAppStoreAccount:")
    public void setAllowSharingAppStoreAccount(boolean v) {}
    /**
     * @deprecated Use purchasesAreCompletedBy instead.
     */
    @Deprecated
    @NotImplemented("finishTransactions")
    public boolean isFinishTransactions() { return false; }
    /**
     * @deprecated Use purchasesAreCompletedBy instead.
     */
    @Deprecated
    @NotImplemented("setFinishTransactions:")
    public void setFinishTransactions(boolean v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("getStorefrontWithCompletion:")
    public void getStorefront(@Block VoidBlock1<RCStorefront> completion) {}
    @NotImplemented("getStorefrontWithCompletionHandler:")
    public void getStorefrontWithCompletionHandler(@Block VoidBlock1<RCStorefront> completionHandler) {}
    @NotImplemented("logIn:completion:")
    public void logIn(String appUserID, @Block VoidBlock3<RCCustomerInfo, Boolean, NSError> completion) {}
    @NotImplemented("logIn:completionHandler:")
    public void logInWithCompletionHandler(String appUserID, @Block VoidBlock3<RCCustomerInfo, Boolean, NSError> completionHandler) {}
    @NotImplemented("logOutWithCompletion:")
    public void logOutWithCompletion$(@Block VoidBlock2<RCCustomerInfo, NSError> completion) {}
    @NotImplemented("logOutWithCompletionHandler:")
    public void logOut(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler) {}
    @NotImplemented("getCustomerInfoWithCompletion:")
    public void getCustomerInfo(@Block VoidBlock2<RCCustomerInfo, NSError> completion) {}
    @NotImplemented("getCustomerInfoWithFetchPolicy:completion:")
    public void getCustomerInfo(RCCacheFetchPolicy fetchPolicy, @Block VoidBlock2<RCCustomerInfo, NSError> completion) {}
    @NotImplemented("customerInfoWithCompletionHandler:")
    public void customerInfoWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler) {}
    @NotImplemented("customerInfoWithFetchPolicy:completionHandler:")
    public void customerInfo(RCCacheFetchPolicy fetchPolicy, @Block VoidBlock2<RCCustomerInfo, NSError> completionHandler) {}
    @NotImplemented("getOfferingsWithCompletion:")
    public void getOfferings(@Block VoidBlock2<RCOfferings, NSError> completion) {}
    @NotImplemented("offeringsWithCompletionHandler:")
    public void offeringsWithCompletionHandler(@Block VoidBlock2<RCOfferings, NSError> completionHandler) {}
    @NotImplemented("getProductsWithIdentifiers:completion:")
    public void getProducts(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<RCStoreProduct>> completion) {}
    @NotImplemented("products:completionHandler:")
    public void products(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<RCStoreProduct>> completionHandler) {}
    @NotImplemented("purchaseProduct:withCompletion:")
    public void purchaseProduct(RCStoreProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion) {}
    @NotImplemented("purchaseWithProduct:completionHandler:")
    public void purchase(RCStoreProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler) {}
    @NotImplemented("purchasePackage:withCompletion:")
    public void purchasePackage(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion) {}
    @NotImplemented("purchaseWithPackage:completionHandler:")
    public void purchase(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler) {}
    @NotImplemented("purchaseWithParams:completion:")
    public void purchaseWithParams(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion) {}
    @NotImplemented("purchase:completionHandler:")
    public void purchase(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler) {}
    @NotImplemented("invalidateCustomerInfoCache")
    public void invalidateCustomerInfoCache() {}
    @NotImplemented("restorePurchasesWithCompletion:")
    public void restorePurchases(@Block VoidBlock2<RCCustomerInfo, NSError> completion) {}
    @NotImplemented("restorePurchasesWithCompletionHandler:")
    public void restorePurchasesWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler) {}
    @NotImplemented("syncPurchasesWithCompletion:")
    public void syncPurchases(@Block VoidBlock2<RCCustomerInfo, NSError> completion) {}
    @NotImplemented("syncPurchasesWithCompletionHandler:")
    public void syncPurchasesWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler) {}
    @NotImplemented("purchaseProduct:withPromotionalOffer:completion:")
    public void purchaseProduct(RCStoreProduct product, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion) {}
    @NotImplemented("purchaseWithProduct:promotionalOffer:completionHandler:")
    public void purchase(RCStoreProduct product, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler) {}
    @NotImplemented("purchasePackage:withPromotionalOffer:completion:")
    public void purchasePackageWithPromotionalOffer(RCPackage _package, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion) {}
    @NotImplemented("purchaseWithPackage:promotionalOffer:completionHandler:")
    public void purchase(RCPackage _package, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler) {}
    @NotImplemented("checkTrialOrIntroDiscountEligibility:completion:")
    public void checkTrialOrIntroDiscountEligibility(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> receiveEligibility) {}
    @NotImplemented("checkTrialOrIntroDiscountEligibilityWithProductIdentifiers:completionHandler:")
    public void checkTrialOrIntroDiscountEligibilityWithProductIdentifiers(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> completionHandler) {}
    @NotImplemented("checkTrialOrIntroDiscountEligibilityForProduct:completion:")
    public void checkTrialOrIntroDiscountEligibilityForProduct(RCStoreProduct product, @Block VoidBlock1<RCIntroEligibilityStatus> completion) {}
    @NotImplemented("checkTrialOrIntroDiscountEligibilityWithProduct:completionHandler:")
    public void checkTrialOrIntroDiscountEligibilityWithProduct(RCStoreProduct product, @Block VoidBlock1<RCIntroEligibilityStatus> completionHandler) {}
    @NotImplemented("getPromotionalOfferForProductDiscount:withProduct:withCompletion:")
    public void getPromotionalOfferForProductDiscount(RCStoreProductDiscount discount, RCStoreProduct product, @Block VoidBlock2<RCPromotionalOffer, NSError> completion) {}
    @NotImplemented("promotionalOfferForProductDiscount:product:completionHandler:")
    public void promotionalOfferForProductDiscount(RCStoreProductDiscount discount, RCStoreProduct product, @Block VoidBlock2<RCPromotionalOffer, NSError> completionHandler) {}
    @NotImplemented("eligiblePromotionalOffersForProduct:completionHandler:")
    public void eligiblePromotionalOffersForProduct(RCStoreProduct product, @Block VoidBlock1<NSArray<RCPromotionalOffer>> completionHandler) {}
    /**
     * @since Available in iOS 18.0 and later.
     */
    @NotImplemented("eligibleWinBackOffersForProduct:completion:")
    public void eligibleWinBackOffersForProduct(RCStoreProduct product, @Block VoidBlock2<NSArray<RCWinBackOffer>, NSError> completion) {}
    /**
     * @since Available in iOS 18.0 and later.
     */
    @NotImplemented("eligibleWinBackOffersForPackage:completion:")
    public void eligibleWinBackOffersForPackage(RCPackage _package, @Block VoidBlock2<NSArray<RCWinBackOffer>, NSError> completion) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("beginRefundRequestForProduct:completion:")
    public void beginRefundRequestForProduct(String productID, @Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("beginRefundRequestForEntitlement:completion:")
    public void beginRefundRequestForEntitlement(String entitlementID, @Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("beginRefundRequestForActiveEntitlementWithCompletion:")
    public void beginRefundRequestForActiveEntitlement(@Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("presentCodeRedemptionSheet")
    public void presentCodeRedemptionSheet() {}
    /**
     * @since Available in iOS 13.4 and later.
     */
    @NotImplemented("showPriceConsentIfNeeded")
    public void showPriceConsentIfNeeded() {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("showManageSubscriptionsWithCompletion:")
    public void showManageSubscriptions(@Block VoidBlock1<NSError> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("showManageSubscriptionsWithCompletionHandler:")
    public void showManageSubscriptionsWithCompletionHandler(@Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("syncAttributesAndOfferingsIfNeededWithCompletion:")
    public void syncAttributesAndOfferingsIfNeeded(@Block VoidBlock2<RCOfferings, NSError> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("syncAttributesAndOfferingsIfNeededWithCompletionHandler:")
    public void syncAttributesAndOfferingsIfNeededWithCompletionHandler(@Block VoidBlock2<RCOfferings, NSError> completionHandler) {}
    @NotImplemented("redeemWebPurchaseWithWebPurchaseRedemption:completion:")
    public void redeemWebPurchaseWithWebPurchaseRedemption(RCWebPurchaseRedemption webPurchaseRedemption, @Block VoidBlock2<RCCustomerInfo, NSError> completion) {}
    @NotImplemented("getVirtualCurrenciesWithCompletion:")
    public void getVirtualCurrencies(@Block VoidBlock2<RCVirtualCurrencies, NSError> completion) {}
    @NotImplemented("invalidateVirtualCurrenciesCache")
    public void invalidateVirtualCurrenciesCache() {}
    @NotImplemented("setAttributes:")
    public void setAttributes(NSDictionary<NSString, NSString> attributes) {}
    @Deprecated
    @NotImplemented("setEmail:")
    public void setEmail(String email) {}
    @Deprecated
    @NotImplemented("setPhoneNumber:")
    public void setPhoneNumber(String phoneNumber) {}
    @Deprecated
    @NotImplemented("setDisplayName:")
    public void setDisplayName(String displayName) {}
    @Deprecated
    @NotImplemented("setPushToken:")
    public void setPushToken(NSData pushToken) {}
    @Deprecated
    @NotImplemented("setPushTokenString:")
    public void setPushTokenString(String pushToken) {}
    @Deprecated
    @NotImplemented("setAdjustID:")
    public void setAdjustID(String adjustID) {}
    @Deprecated
    @NotImplemented("setAppsflyerID:")
    public void setAppsflyerID(String appsflyerID) {}
    @Deprecated
    @NotImplemented("setFBAnonymousID:")
    public void setFBAnonymousID(String fbAnonymousID) {}
    @Deprecated
    @NotImplemented("setMparticleID:")
    public void setMparticleID(String mparticleID) {}
    @Deprecated
    @NotImplemented("setOnesignalID:")
    public void setOnesignalID(String onesignalID) {}
    @Deprecated
    @NotImplemented("setMediaSource:")
    public void setMediaSource(String mediaSource) {}
    @Deprecated
    @NotImplemented("setCampaign:")
    public void setCampaign(String campaign) {}
    @Deprecated
    @NotImplemented("setAdGroup:")
    public void setAdGroup(String adGroup) {}
    @Deprecated
    @NotImplemented("setAd:")
    public void setAd(String value) {}
    @Deprecated
    @NotImplemented("setKeyword:")
    public void setKeyword(String keyword) {}
    @Deprecated
    @NotImplemented("setCreative:")
    public void setCreative(String creative) {}
    @Deprecated
    @NotImplemented("setCleverTapID:")
    public void setCleverTapID(String cleverTapID) {}
    @Deprecated
    @NotImplemented("setMixpanelDistinctID:")
    public void setMixpanelDistinctID(String mixpanelDistinctID) {}
    @Deprecated
    @NotImplemented("setFirebaseAppInstanceID:")
    public void setFirebaseAppInstanceID(String firebaseAppInstanceID) {}
    @Deprecated
    @NotImplemented("collectDeviceIdentifiers")
    public void collectDeviceIdentifiers() {}
    @Deprecated
    @NotImplemented("params:withCompletion:")
    public void params(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion) {}
    /*</methods>*/
}
