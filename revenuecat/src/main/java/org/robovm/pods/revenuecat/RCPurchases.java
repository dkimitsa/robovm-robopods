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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCPurchases/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements RCPurchasesType, PurchasesOrchestratorDelegate/*</implements>*/ {

    /*<ptr>*/public static class RCPurchasesPtr extends Ptr<RCPurchases, RCPurchasesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCPurchases.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCPurchases() {}
    protected RCPurchases(Handle h, long handle) { super(h, handle); }
    protected RCPurchases(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native RCPurchasesDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(RCPurchasesDelegate v);
    @Property(selector = "attribution")
    public native RCAttribution getAttribution();
    @Property(selector = "purchasesAreCompletedBy")
    public native RCPurchasesAreCompletedBy getPurchasesAreCompletedBy();
    @Property(selector = "setPurchasesAreCompletedBy:")
    public native void setPurchasesAreCompletedBy(RCPurchasesAreCompletedBy v);
    @Property(selector = "storeFrontCountryCode")
    public native String getStoreFrontCountryCode();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "storeFrontLocale")
    public native NSLocale getStoreFrontLocale();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "adTracker")
    public native RCAdTracker getAdTracker();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "shouldShowPriceConsent")
    public native boolean shouldShowPriceConsent();
    @Property(selector = "cachedVirtualCurrencies")
    public native RCVirtualCurrencies getCachedVirtualCurrencies();
    /**
     * @deprecated Configure behavior through the RevenueCat dashboard instead. If you have configured the "Legacy" restore
    behavior in the [RevenueCat Dashboard](app.revenuecat.com) and are currently setting this to `true`, keep
    this setting active.
     */
    @Deprecated
    @Property(selector = "allowSharingAppStoreAccount")
    public native boolean isAllowSharingAppStoreAccount();
    /**
     * @deprecated Configure behavior through the RevenueCat dashboard instead. If you have configured the "Legacy" restore
    behavior in the [RevenueCat Dashboard](app.revenuecat.com) and are currently setting this to `true`, keep
    this setting active.
     */
    @Deprecated
    @Property(selector = "setAllowSharingAppStoreAccount:")
    public native void setAllowSharingAppStoreAccount(boolean v);
    /**
     * @deprecated Use ``purchasesAreCompletedBy`` instead.
     */
    @Deprecated
    @Property(selector = "finishTransactions")
    public native boolean isFinishTransactions();
    /**
     * @deprecated Use ``purchasesAreCompletedBy`` instead.
     */
    @Deprecated
    @Property(selector = "setFinishTransactions:")
    public native void setFinishTransactions(boolean v);
    @Property(selector = "appUserID")
    public native String getAppUserID();
    @Property(selector = "isAnonymous")
    public native boolean isAnonymous();
    @Property(selector = "isSandbox")
    public native boolean isSandbox();
    @Property(selector = "cachedOfferings")
    public native RCOfferings getCachedOfferings();
    @Property(selector = "cachedCustomerInfo")
    public native RCCustomerInfo getCachedCustomerInfo();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sharedPurchases")
    public static native RCPurchases sharedPurchases();
    @Method(selector = "isConfigured")
    public static native boolean isConfigured();
    @Method(selector = "logLevel")
    public static native RCLogLevel logLevel();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(RCLogLevel newValue);
    @Method(selector = "proxyURL")
    public static native NSURL proxyURL();
    @Method(selector = "setProxyURL:")
    public static native void setProxyURL(NSURL newValue);
    @Method(selector = "forceUniversalAppStore")
    public static native boolean forceUniversalAppStore();
    @Method(selector = "setForceUniversalAppStore:")
    public static native void setForceUniversalAppStore(boolean newValue);
    @Method(selector = "simulatesAskToBuyInSandbox")
    public static native boolean simulatesAskToBuyInSandbox();
    @Method(selector = "setSimulatesAskToBuyInSandbox:")
    public static native void setSimulatesAskToBuyInSandbox(boolean newValue);
    @Method(selector = "canMakePayments")
    public static native boolean canMakePayments();
    @Method(selector = "logHandler")
    public static native @Block VoidBlock2<RCLogLevel, NSString> logHandler(RCLogLevel p0, String p1);
    @Method(selector = "setLogHandler:")
    public static native void setLogHandler(@Block VoidBlock2<RCLogLevel, NSString> newValue);
    @Method(selector = "verboseLogHandler")
    public static native @Block("(,,,,@MachineSizedUInt)") VoidBlock5<RCLogLevel, NSString, NSString, NSString, Long> verboseLogHandler(RCLogLevel p0, String p1, String p2, String p3, @MachineSizedUInt long p4);
    @Method(selector = "setVerboseLogHandler:")
    public static native void setVerboseLogHandler(@Block("(,,,,@MachineSizedUInt)") VoidBlock5<RCLogLevel, NSString, NSString, NSString, Long> newValue);
    @Method(selector = "verboseLogs")
    public static native boolean verboseLogs();
    @Method(selector = "setVerboseLogs:")
    public static native void setVerboseLogs(boolean newValue);
    @Method(selector = "frameworkVersion")
    public static native String frameworkVersion();
    @Method(selector = "overridePreferredUILocale:")
    public native void overridePreferredUILocale(String locale);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "trackCustomPaywallImpression:")
    public native void trackCustomPaywallImpression(RCCustomPaywallImpressionParams params);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "trackCustomPaywallImpression")
    public native void trackCustomPaywallImpression();
    @Method(selector = "platformInfo")
    public static native RCPlatformInfo platformInfo();
    @Method(selector = "setPlatformInfo:")
    public static native void setPlatformInfo(RCPlatformInfo value);
    @Method(selector = "readyForPromotedProduct:purchase:")
    public native void readyForPromotedProduct(RCStoreProduct product, @Block("(@Block)") VoidBlock1<VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean>> startPurchase);
    @Method(selector = "eligibleWinBackOffersForProduct:completion:")
    public native void eligibleWinBackOffersForProduct(RCStoreProduct product, @Block VoidBlock2<NSArray<RCWinBackOffer>, NSError> completion);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "eligibleWinBackOffersForPackage:completion:")
    public native void eligibleWinBackOffersForPackage(RCPackage _package, @Block VoidBlock2<NSArray<RCWinBackOffer>, NSError> completion);
    @Method(selector = "getVirtualCurrenciesWithCompletion:")
    public native void getVirtualCurrencies(@Block VoidBlock2<RCVirtualCurrencies, NSError> completion);
    @Method(selector = "invalidateVirtualCurrenciesCache")
    public native void invalidateVirtualCurrenciesCache();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "showStoreMessagesWithCompletion:")
    public native void showStoreMessages(@Block Runnable completion);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "showStoreMessagesForTypes:completion:")
    public native void showStoreMessages(NSSet<?> types, @Block Runnable completion);
    @Method(selector = "configureWithConfiguration:")
    public static native RCPurchases configure(RCConfiguration configuration);
    @Method(selector = "configureWithConfigurationBuilder:")
    public static native RCPurchases configure(RCConfigurationBuilder builder);
    @Method(selector = "configureWithAPIKey:")
    public static native RCPurchases configure(String apiKey);
    @Method(selector = "configureWithAPIKey:appUserID:")
    public static native RCPurchases configure(String apiKey, String appUserID);
    @Method(selector = "configureWithAPIKey:appUserID:purchasesAreCompletedBy:storeKitVersion:")
    public static native RCPurchases configure(String apiKey, String appUserID, RCPurchasesAreCompletedBy purchasesAreCompletedBy, RCStoreKitVersion storeKitVersion);
    @Method(selector = "debugLogsEnabled")
    public static native boolean debugLogsEnabled();
    @Method(selector = "setDebugLogsEnabled:")
    public static native void setDebugLogsEnabled(boolean newValue);
    /**
     * @deprecated Use the set<NetworkId> functions instead
     */
    @Deprecated
    @Method(selector = "addAttributionData:fromNetwork:")
    public static native void addAttributionData(NSDictionary<NSString, ?> data, RCAttributionNetwork network);
    /**
     * @deprecated Use the set<NetworkId> functions instead
     */
    @Deprecated
    @Method(selector = "addAttributionData:fromNetwork:forNetworkUserId:")
    public static native void addAttributionData(NSDictionary<NSString, ?> data, RCAttributionNetwork network, String networkUserId);
    @Method(selector = "logIn:completion:")
    public native void logIn(String appUserID, @Block VoidBlock3<RCCustomerInfo, Boolean, NSError> completion);
    @Method(selector = "logIn:completionHandler:")
    public native void logInWithCompletionHandler(String appUserID, @Block VoidBlock3<RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "logOutWithCompletion:")
    public native void logOutWithCompletion$(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "logOutWithCompletionHandler:")
    public native void logOut(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "syncAttributesAndOfferingsIfNeededWithCompletion:")
    public native void syncAttributesAndOfferingsIfNeeded(@Block VoidBlock2<RCOfferings, NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "syncAttributesAndOfferingsIfNeededWithCompletionHandler:")
    public native void syncAttributesAndOfferingsIfNeededWithCompletionHandler(@Block VoidBlock2<RCOfferings, NSError> completionHandler);
    @Method(selector = "getStorefrontWithCompletion:")
    public native void getStorefront(@Block VoidBlock1<RCStorefront> completion);
    @Method(selector = "getStorefrontWithCompletionHandler:")
    public native void getStorefrontWithCompletionHandler(@Block VoidBlock1<RCStorefront> completionHandler);
    @Method(selector = "getOfferingsWithCompletion:")
    public native void getOfferings(@Block VoidBlock2<RCOfferings, NSError> completion);
    @Method(selector = "offeringsWithCompletionHandler:")
    public native void offeringsWithCompletionHandler(@Block VoidBlock2<RCOfferings, NSError> completionHandler);
    @Method(selector = "parseAsWebPurchaseRedemption:")
    public static native RCWebPurchaseRedemption parseAsWebPurchaseRedemption(NSURL url);
    @Method(selector = "collectDeviceIdentifiers")
    public native void collectDeviceIdentifiers();
    @Method(selector = "setAttributes:")
    public native void setAttributes(NSDictionary<NSString, NSString> attributes);
    @Method(selector = "setEmail:")
    public native void setEmail(String email);
    @Method(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String phoneNumber);
    @Method(selector = "setDisplayName:")
    public native void setDisplayName(String displayName);
    @Method(selector = "setPushToken:")
    public native void setPushToken(NSData pushToken);
    @Method(selector = "setPushTokenString:")
    public native void setPushTokenString(String pushToken);
    @Method(selector = "setAdjustID:")
    public native void setAdjustID(String adjustID);
    @Method(selector = "setAppsflyerID:")
    public native void setAppsflyerID(String appsflyerID);
    @Method(selector = "setFBAnonymousID:")
    public native void setFBAnonymousID(String fbAnonymousID);
    @Method(selector = "setMparticleID:")
    public native void setMparticleID(String mparticleID);
    @Method(selector = "setOnesignalID:")
    public native void setOnesignalID(String onesignalID);
    @Method(selector = "setAirshipChannelID:")
    public native void setAirshipChannelID(String airshipChannelID);
    @Method(selector = "setCleverTapID:")
    public native void setCleverTapID(String cleverTapID);
    @Method(selector = "setMixpanelDistinctID:")
    public native void setMixpanelDistinctID(String mixpanelDistinctID);
    @Method(selector = "setFirebaseAppInstanceID:")
    public native void setFirebaseAppInstanceID(String firebaseAppInstanceID);
    @Method(selector = "setMediaSource:")
    public native void setMediaSource(String mediaSource);
    @Method(selector = "setCampaign:")
    public native void setCampaign(String campaign);
    @Method(selector = "setAdGroup:")
    public native void setAdGroup(String adGroup);
    @Method(selector = "setAd:")
    public native void setAd(String installAd);
    @Method(selector = "setKeyword:")
    public native void setKeyword(String keyword);
    @Method(selector = "setCreative:")
    public native void setCreative(String creative);
    @Method(selector = "params:withCompletion:")
    public native void params(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "restoreTransactionsWithCompletionBlock:")
    public native void restoreTransactions(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "customerInfoWithCompletion:")
    public native void customerInfo(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "purchaserInfoWithCompletionBlock:")
    public native void purchaserInfo(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "productsWithIdentifiers:completionBlock:")
    public native void productsWithIdentifiers(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<SKProduct>> completion);
    @Method(selector = "offeringsWithCompletionBlock:")
    public native void offerings(@Block VoidBlock2<RCOfferings, NSError> completion);
    @Method(selector = "purchasePackage:withCompletionBlock:")
    public native void purchasePackageWithCompletionBlock(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseProduct:withCompletionBlock:")
    public native void purchaseProduct(SKProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "invalidatePurchaserInfoCache")
    public native void invalidatePurchaserInfoCache();
    @Method(selector = "checkTrialOrIntroductoryPriceEligibility:completion:")
    public native void checkTrialOrIntroductoryPriceEligibility(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> completion);
    @Method(selector = "shouldPurchasePromoProduct:defermentBlock:")
    public native void shouldPurchasePromoProduct(RCStoreProduct product, @Block("(@Block)") VoidBlock1<VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean>> defermentBlock);
    @Method(selector = "createAlias:completionBlock:")
    public native void createAlias(String alias, @Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "identify:completionBlock:")
    public native void identify(String appUserID, @Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "resetWithCompletionBlock:")
    public native void reset(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "configureWithAPIKey:appUserID:observerMode:")
    public static native RCPurchases configure(String apiKey, String appUserID, boolean observerMode);
    @Method(selector = "configureWithAPIKey:appUserID:observerMode:userDefaults:")
    public static native RCPurchases configure(String apiKey, String appUserID, boolean observerMode, NSUserDefaults userDefaults);
    @Method(selector = "configureWithAPIKey:appUserID:observerMode:userDefaults:useStoreKit2IfAvailable:")
    public static native RCPurchases configure(String apiKey, String appUserID, boolean observerMode, NSUserDefaults userDefaults, boolean useStoreKit2IfAvailable);
    @Method(selector = "configureWithAPIKey:appUserID:observerMode:userDefaults:useStoreKit2IfAvailable:dangerousSettings:")
    public static native RCPurchases configure(String apiKey, String appUserID, boolean observerMode, NSUserDefaults userDefaults, boolean useStoreKit2IfAvailable, RCDangerousSettings dangerousSettings);
    @Method(selector = "automaticAppleSearchAdsAttributionCollection")
    public static native boolean automaticAppleSearchAdsAttributionCollection();
    @Method(selector = "setAutomaticAppleSearchAdsAttributionCollection:")
    public static native void setAutomaticAppleSearchAdsAttributionCollection(boolean newValue);
    @Method(selector = "getCustomerInfoWithCompletion:")
    public native void getCustomerInfo(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "getCustomerInfoWithFetchPolicy:completion:")
    public native void getCustomerInfo(RCCacheFetchPolicy fetchPolicy, @Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "customerInfoWithCompletionHandler:")
    public native void customerInfoWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "customerInfoWithFetchPolicy:completionHandler:")
    public native void customerInfo(RCCacheFetchPolicy fetchPolicy, @Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "getProductsWithIdentifiers:completion:")
    public native void getProducts(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<RCStoreProduct>> completion);
    @Method(selector = "products:completionHandler:")
    public native void products(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSArray<RCStoreProduct>> completionHandler);
    @Method(selector = "purchaseProduct:withCompletion:")
    public native void purchaseProduct(RCStoreProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithProduct:completionHandler:")
    public native void purchase(RCStoreProduct product, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "purchasePackage:withCompletion:")
    public native void purchasePackage(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithPackage:completionHandler:")
    public native void purchase(RCPackage _package, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "restorePurchasesWithCompletion:")
    public native void restorePurchases(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "restorePurchasesWithCompletionHandler:")
    public native void restorePurchasesWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "purchaseWithParams:completion:")
    public native void purchaseWithParams(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchase:completionHandler:")
    public native void purchase(RCPurchaseParams params, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "purchaseProduct:withPromotionalOffer:completion:")
    public native void purchaseProduct(RCStoreProduct product, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithProduct:promotionalOffer:completionHandler:")
    public native void purchase(RCStoreProduct product, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "purchasePackage:withPromotionalOffer:completion:")
    public native void purchasePackageWithPromotionalOffer(RCPackage _package, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, NSError, Boolean> completion);
    @Method(selector = "purchaseWithPackage:promotionalOffer:completionHandler:")
    public native void purchase(RCPackage _package, RCPromotionalOffer promotionalOffer, @Block VoidBlock4<RCStoreTransaction, RCCustomerInfo, Boolean, NSError> completionHandler);
    @Method(selector = "invalidateCustomerInfoCache")
    public native void invalidateCustomerInfoCache();
    @Method(selector = "syncPurchasesWithCompletion:")
    public native void syncPurchases(@Block VoidBlock2<RCCustomerInfo, NSError> completion);
    @Method(selector = "syncPurchasesWithCompletionHandler:")
    public native void syncPurchasesWithCompletionHandler(@Block VoidBlock2<RCCustomerInfo, NSError> completionHandler);
    @Method(selector = "checkTrialOrIntroDiscountEligibility:completion:")
    public native void checkTrialOrIntroDiscountEligibility(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> completion);
    @Method(selector = "checkTrialOrIntroDiscountEligibilityWithProductIdentifiers:completionHandler:")
    public native void checkTrialOrIntroDiscountEligibilityWithProductIdentifiers(NSArray<NSString> productIdentifiers, @Block VoidBlock1<NSDictionary<NSString, RCIntroEligibility>> completionHandler);
    @Method(selector = "checkTrialOrIntroDiscountEligibilityForProduct:completion:")
    public native void checkTrialOrIntroDiscountEligibilityForProduct(RCStoreProduct product, @Block VoidBlock1<RCIntroEligibilityStatus> completion);
    @Method(selector = "checkTrialOrIntroDiscountEligibilityWithProduct:completionHandler:")
    public native void checkTrialOrIntroDiscountEligibilityWithProduct(RCStoreProduct product, @Block VoidBlock1<RCIntroEligibilityStatus> completionHandler);
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
    @Method(selector = "getPromotionalOfferForProductDiscount:withProduct:withCompletion:")
    public native void getPromotionalOfferForProductDiscount(RCStoreProductDiscount discount, RCStoreProduct product, @Block VoidBlock2<RCPromotionalOffer, NSError> completion);
    @Method(selector = "promotionalOfferForProductDiscount:product:completionHandler:")
    public native void promotionalOfferForProductDiscount(RCStoreProductDiscount discount, RCStoreProduct product, @Block VoidBlock2<RCPromotionalOffer, NSError> completionHandler);
    @Method(selector = "eligiblePromotionalOffersForProduct:completionHandler:")
    public native void eligiblePromotionalOffersForProduct(RCStoreProduct product, @Block VoidBlock1<NSArray<RCPromotionalOffer>> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "showManageSubscriptionsWithCompletion:")
    public native void showManageSubscriptions(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "showManageSubscriptionsWithCompletionHandler:")
    public native void showManageSubscriptionsWithCompletionHandler(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "beginRefundRequestForProduct:completion:")
    public native void beginRefundRequestForProduct(String productID, @Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "beginRefundRequestForEntitlement:completion:")
    public native void beginRefundRequestForEntitlement(String entitlementID, @Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "beginRefundRequestForActiveEntitlementWithCompletion:")
    public native void beginRefundRequestForActiveEntitlement(@Block VoidBlock2<RCRefundRequestStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "recordPurchaseForProductID:completion:")
    public native void recordPurchase(String productID, @Block VoidBlock2<RCStoreTransaction, NSError> completion);
    @Method(selector = "redeemWebPurchaseWithWebPurchaseRedemption:completion:")
    public native void redeemWebPurchaseWithWebPurchaseRedemption(RCWebPurchaseRedemption webPurchaseRedemption, @Block VoidBlock2<RCCustomerInfo, NSError> completion);
    /*</methods>*/
}
