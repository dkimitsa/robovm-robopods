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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/RCPurchasesType/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "appUserID")
    String getAppUserID();
    @Property(selector = "storeFrontCountryCode")
    String getStoreFrontCountryCode();
    @Property(selector = "isAnonymous")
    boolean isAnonymous();
    @Property(selector = "purchasesAreCompletedBy")
    RCPurchasesAreCompletedBy getPurchasesAreCompletedBy();
    @Property(selector = "setPurchasesAreCompletedBy:")
    void setPurchasesAreCompletedBy(RCPurchasesAreCompletedBy v);
    @Property(selector = "delegate")
    RCPurchasesDelegate getDelegate();
    @Property(selector = "setDelegate:")
    void setDelegate(RCPurchasesDelegate v);
    @Property(selector = "cachedCustomerInfo")
    RCCustomerInfo getCachedCustomerInfo();
    @Property(selector = "cachedOfferings")
    RCOfferings getCachedOfferings();
    @Property(selector = "attribution")
    RCAttribution getAttribution();
    @Property(selector = "cachedVirtualCurrencies")
    RCVirtualCurrencies getCachedVirtualCurrencies();
    @Deprecated
    @Property(selector = "allowSharingAppStoreAccount")
    boolean isAllowSharingAppStoreAccount();
    @Deprecated
    @Property(selector = "setAllowSharingAppStoreAccount:")
    void setAllowSharingAppStoreAccount(boolean v);
    /**
     * @deprecated Use purchasesAreCompletedBy instead.
     */
    @Deprecated
    @Property(selector = "finishTransactions")
    boolean isFinishTransactions();
    /**
     * @deprecated Use purchasesAreCompletedBy instead.
     */
    @Deprecated
    @Property(selector = "setFinishTransactions:")
    void setFinishTransactions(boolean v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "getStorefrontWithCompletion:")
    void getStorefront(@Block VoidBlock1<RCStorefront> completion);
    @Method(selector = "getStorefrontWithCompletionHandler:")
    void getStorefrontWithCompletionHandler(@Block VoidBlock1<RCStorefront> completionHandler);
    @Method(selector = "logIn:completion:")
    void logIn(String appUserID, @Block VoidBlock3<RCCustomerInfo, Boolean, NSError> completion);
    @Method(selector = "logIn:completionHandler:")
    void logInWithCompletionHandler(String appUserID, @Block VoidBlock3<RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "logOutWithCompletion:")
    void logOutWithCompletion$(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "logOutWithCompletionHandler:")
    void logOut(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "getCustomerInfoWithCompletion:")
    void getCustomerInfo(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "getCustomerInfoWithFetchPolicy:completion:")
    void getCustomerInfo(RCCacheFetchPolicy fetchPolicy, @Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "customerInfoWithCompletionHandler:")
    void customerInfoWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "customerInfoWithFetchPolicy:completionHandler:")
    void customerInfo(RCCacheFetchPolicy fetchPolicy, @Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "getOfferingsWithCompletion:")
    void getOfferings(@Block VoidBlock2<RCOfferings, NSError> completion);
    @Method(selector = "offeringsWithCompletionHandler:")
    void offeringsWithCompletionHandler(@Block VoidBlock2<RCOfferings, NSError> completionHandler);
    @Method(selector = "getProductsWithIdentifiers:completion:")
    void getProducts(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<RCStoreProduct>> completion);
    @Method(selector = "products:completionHandler:")
    void products(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<RCStoreProduct>> completionHandler);
    @Method(selector = "purchaseProduct:withCompletion:")
    void purchaseProduct(RCStoreProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithProduct:completionHandler:")
    void purchase(RCStoreProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "purchasePackage:withCompletion:")
    void purchasePackage(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithPackage:completionHandler:")
    void purchase(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "purchaseWithParams:completion:")
    void purchaseWithParams(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchase:completionHandler:")
    void purchase(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "invalidateCustomerInfoCache")
    void invalidateCustomerInfoCache();
    @Method(selector = "restorePurchasesWithCompletion:")
    void restorePurchases(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "restorePurchasesWithCompletionHandler:")
    void restorePurchasesWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "syncPurchasesWithCompletion:")
    void syncPurchases(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "syncPurchasesWithCompletionHandler:")
    void syncPurchasesWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "purchaseProduct:withPromotionalOffer:completion:")
    void purchaseProduct(RCStoreProduct product, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithProduct:promotionalOffer:completionHandler:")
    void purchase(RCStoreProduct product, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "purchasePackage:withPromotionalOffer:completion:")
    void purchasePackageWithPromotionalOffer(RCPackage _package, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithPackage:promotionalOffer:completionHandler:")
    void purchase(RCPackage _package, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "checkTrialOrIntroDiscountEligibility:completion:")
    void checkTrialOrIntroDiscountEligibility(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> receiveEligibility);
    @Method(selector = "checkTrialOrIntroDiscountEligibilityWithProductIdentifiers:completionHandler:")
    void checkTrialOrIntroDiscountEligibilityWithProductIdentifiers(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> completionHandler);
    @Method(selector = "checkTrialOrIntroDiscountEligibilityForProduct:completion:")
    void checkTrialOrIntroDiscountEligibilityForProduct(RCStoreProduct product, @Block VoidBlock1<RCIntroEligibilityStatus> completion);
    @Method(selector = "checkTrialOrIntroDiscountEligibilityWithProduct:completionHandler:")
    void checkTrialOrIntroDiscountEligibilityWithProduct(RCStoreProduct product, @Block VoidBlock1<RCIntroEligibilityStatus> completionHandler);
    @Method(selector = "getPromotionalOfferForProductDiscount:withProduct:withCompletion:")
    void getPromotionalOfferForProductDiscount(RCStoreProductDiscount discount, RCStoreProduct product, @Block VoidBlock2<RCPromotionalOffer, NSError> completion);
    @Method(selector = "promotionalOfferForProductDiscount:product:completionHandler:")
    void promotionalOfferForProductDiscount(RCStoreProductDiscount discount, RCStoreProduct product, @Block VoidBlock2<RCPromotionalOffer, NSError> completionHandler);
    @Method(selector = "eligiblePromotionalOffersForProduct:completionHandler:")
    void eligiblePromotionalOffersForProduct(RCStoreProduct product, @Block VoidBlock1<NSArray<RCPromotionalOffer>> completionHandler);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "eligibleWinBackOffersForProduct:completion:")
    void eligibleWinBackOffersForProduct(RCStoreProduct product, @Block VoidBlock2<NSArray<RCWinBackOffer>, NSError> completion);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "eligibleWinBackOffersForPackage:completion:")
    void eligibleWinBackOffersForPackage(RCPackage _package, @Block VoidBlock2<NSArray<RCWinBackOffer>, NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "beginRefundRequestForProduct:completion:")
    void beginRefundRequestForProduct(String productID, @Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "beginRefundRequestForEntitlement:completion:")
    void beginRefundRequestForEntitlement(String entitlementID, @Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "beginRefundRequestForActiveEntitlementWithCompletion:")
    void beginRefundRequestForActiveEntitlement(@Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "presentCodeRedemptionSheet")
    void presentCodeRedemptionSheet();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "showPriceConsentIfNeeded")
    void showPriceConsentIfNeeded();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "showManageSubscriptionsWithCompletion:")
    void showManageSubscriptions(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "showManageSubscriptionsWithCompletionHandler:")
    void showManageSubscriptionsWithCompletionHandler(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "syncAttributesAndOfferingsIfNeededWithCompletion:")
    void syncAttributesAndOfferingsIfNeeded(@Block VoidBlock2<RCOfferings, NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "syncAttributesAndOfferingsIfNeededWithCompletionHandler:")
    void syncAttributesAndOfferingsIfNeededWithCompletionHandler(@Block VoidBlock2<RCOfferings, NSError> completionHandler);
    @Method(selector = "redeemWebPurchaseWithWebPurchaseRedemption:completion:")
    void redeemWebPurchaseWithWebPurchaseRedemption(RCWebPurchaseRedemption webPurchaseRedemption, @Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "getVirtualCurrenciesWithCompletion:")
    void getVirtualCurrencies(@Block VoidBlock2<RCVirtualCurrencies, NSError> completion);
    @Method(selector = "invalidateVirtualCurrenciesCache")
    void invalidateVirtualCurrenciesCache();
    @Method(selector = "setAttributes:")
    void setAttributes(NSDictionary<NSString, NSString> attributes);
    @Deprecated
    @Method(selector = "setEmail:")
    void setEmail(String email);
    @Deprecated
    @Method(selector = "setPhoneNumber:")
    void setPhoneNumber(String phoneNumber);
    @Deprecated
    @Method(selector = "setDisplayName:")
    void setDisplayName(String displayName);
    @Deprecated
    @Method(selector = "setPushToken:")
    void setPushToken(NSData pushToken);
    @Deprecated
    @Method(selector = "setPushTokenString:")
    void setPushTokenString(String pushToken);
    @Deprecated
    @Method(selector = "setAdjustID:")
    void setAdjustID(String adjustID);
    @Deprecated
    @Method(selector = "setAppsflyerID:")
    void setAppsflyerID(String appsflyerID);
    @Deprecated
    @Method(selector = "setFBAnonymousID:")
    void setFBAnonymousID(String fbAnonymousID);
    @Deprecated
    @Method(selector = "setMparticleID:")
    void setMparticleID(String mparticleID);
    @Deprecated
    @Method(selector = "setOnesignalID:")
    void setOnesignalID(String onesignalID);
    @Deprecated
    @Method(selector = "setMediaSource:")
    void setMediaSource(String mediaSource);
    @Deprecated
    @Method(selector = "setCampaign:")
    void setCampaign(String campaign);
    @Deprecated
    @Method(selector = "setAdGroup:")
    void setAdGroup(String adGroup);
    @Deprecated
    @Method(selector = "setAd:")
    void setAd(String value);
    @Deprecated
    @Method(selector = "setKeyword:")
    void setKeyword(String keyword);
    @Deprecated
    @Method(selector = "setCreative:")
    void setCreative(String creative);
    @Deprecated
    @Method(selector = "setCleverTapID:")
    void setCleverTapID(String cleverTapID);
    @Deprecated
    @Method(selector = "setMixpanelDistinctID:")
    void setMixpanelDistinctID(String mixpanelDistinctID);
    @Deprecated
    @Method(selector = "setFirebaseAppInstanceID:")
    void setFirebaseAppInstanceID(String firebaseAppInstanceID);
    @Deprecated
    @Method(selector = "collectDeviceIdentifiers")
    void collectDeviceIdentifiers();
    @Deprecated
    @Method(selector = "params:withCompletion:")
    void params(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
