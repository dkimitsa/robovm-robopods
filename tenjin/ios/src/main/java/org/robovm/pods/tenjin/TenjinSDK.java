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
package org.robovm.pods.tenjin;

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
import org.robovm.apple.coredata.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TenjinSDK/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TenjinSDKPtr extends Ptr<TenjinSDK, TenjinSDKPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TenjinSDK.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TenjinSDK() {}
    protected TenjinSDK(Handle h, long handle) { super(h, handle); }
    protected TenjinSDK(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithToken:andSharedSecret:andAppSubversion:andDeferredDeeplink:ping:")
    public TenjinSDK(String apiToken, String secret, NSNumber subversion, NSURL url, boolean ping) { super((SkipInit) null); initObject(init(apiToken, secret, subversion, url, ping)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithToken:andSharedSecret:andAppSubversion:andDeferredDeeplink:ping:")
    protected native @Pointer long init(String apiToken, String secret, NSNumber subversion, NSURL url, boolean ping);
    @Method(selector = "registerDeepLinkHandler:")
    public native void registerDeepLinkHandler(@Block VoidBlock2<NSDictionary<?, ?>, NSError> deeplinkHandler);
    @Method(selector = "handleSubscriptionPurchase:")
    public native void handleSubscriptionPurchase(SKPaymentTransaction transaction);
    @Method(selector = "getAttributionInfo:")
    public native void getAttributionInfo(@Block VoidBlock2<NSDictionary<?, ?>, NSError> completionHandler);
    @Method(selector = "setGoogleDMAParametersWithAdPersonalization:adUserData:")
    public native void setGoogleDMAParameters(boolean adPersonalization, boolean adUserData);
    /**
     * @deprecated use `initialize`
     */
    @Deprecated
    @Method(selector = "init:")
    public static native TenjinSDK init(String apiToken);
    /**
     * @deprecated use `initialize`
     */
    @Deprecated
    @Method(selector = "init:andSharedSecret:")
    public static native TenjinSDK init(String apiToken, String secret);
    /**
     * @deprecated use `initialize`
     */
    @Deprecated
    @Method(selector = "init:andAppSubversion:")
    public static native TenjinSDK init(String apiToken, NSNumber subversion);
    /**
     * @deprecated use `initialize`
     */
    @Deprecated
    @Method(selector = "init:andSharedSecret:andAppSubversion:")
    public static native TenjinSDK init(String apiToken, String secret, NSNumber subversion);
    @Method(selector = "initialize:")
    public static native TenjinSDK initialize(String apiToken);
    @Method(selector = "initialize:andSharedSecret:")
    public static native TenjinSDK initialize(String apiToken, String secret);
    @Method(selector = "initialize:andAppSubversion:")
    public static native TenjinSDK initialize(String apiToken, NSNumber subversion);
    @Method(selector = "initialize:andSharedSecret:andAppSubversion:")
    public static native TenjinSDK initialize(String apiToken, String secret, NSNumber subversion);
    @Method(selector = "getInstance:")
    public static native TenjinSDK getInstance(String apiToken);
    @Method(selector = "getInstance:andSharedSecret:")
    public static native TenjinSDK getInstance(String apiToken, String secret);
    @Method(selector = "getInstance:andAppSubversion:")
    public static native TenjinSDK getInstance(String apiToken, NSNumber subversion);
    @Method(selector = "getInstance:andSharedSecret:andAppSubversion:")
    public static native TenjinSDK getInstance(String apiToken, String secret, NSNumber subversion);
    /**
     * @deprecated use `init` and `connect`
     */
    @Deprecated
    @Method(selector = "sharedInstanceWithToken:")
    public static native TenjinSDK sharedInstance(String apiToken);
    /**
     * @deprecated use `init` and `connectWithDeferredDeeplink`
     */
    @Deprecated
    @Method(selector = "sharedInstanceWithToken:andDeferredDeeplink:")
    public static native TenjinSDK sharedInstance(String apiToken, NSURL url);
    @Method(selector = "sharedInstance")
    public static native TenjinSDK sharedInstance();
    @Method(selector = "connect")
    public static native void connect();
    @Method(selector = "connectWithDeferredDeeplink:")
    public static native void connect(NSURL url);
    @Method(selector = "sendEventWithName:")
    public static native void sendEvent(String eventName);
    /**
     * @deprecated use `sendEventWithName: andValue:` instead
     */
    @Deprecated
    @Method(selector = "sendEventWithName:andEventValue:")
    public static native void sendEvent(String eventName, String eventValue);
    @Method(selector = "sendEventWithName:andValue:")
    public static native void sendEvent(String eventName, @MachineSizedSInt long eventValue);
    @Deprecated
    @Method(selector = "transaction:")
    public static native void transaction(SKPaymentTransaction transaction);
    @Method(selector = "transaction:andReceipt:")
    public static native void transaction(SKPaymentTransaction transaction, NSData receipt);
    @Method(selector = "transactionWithProductName:andCurrencyCode:andQuantity:andUnitPrice:")
    public static native void transaction(String productName, String currencyCode, @MachineSizedSInt long quantity, NSDecimalNumber price);
    @Method(selector = "transactionWithProductName:andCurrencyCode:andQuantity:andUnitPrice:andTransactionId:andReceipt:")
    public static native void transaction(String productName, String currencyCode, @MachineSizedSInt long quantity, NSDecimalNumber price, String transactionId, NSData receipt);
    @Method(selector = "transactionWithProductName:andCurrencyCode:andQuantity:andUnitPrice:andTransactionId:andBase64Receipt:")
    public static native void transaction(String productName, String currencyCode, @MachineSizedSInt long quantity, NSDecimalNumber price, String transactionId, String receipt);
    @Method(selector = "optOut")
    public static native void optOut();
    @Method(selector = "optIn")
    public static native void optIn();
    @Method(selector = "optOutParams:")
    public static native void optOutParams(NSArray<?> params);
    @Method(selector = "optInParams:")
    public static native void optInParams(NSArray<?> params);
    @Method(selector = "optInOutUsingCMP")
    public static native boolean optInOutUsingCMP();
    @Method(selector = "optOutGoogleDMA")
    public static native void optOutGoogleDMA();
    @Method(selector = "optInGoogleDMA")
    public static native void optInGoogleDMA();
    @Method(selector = "appendAppSubversion:")
    public static native void appendAppSubversion(NSNumber subversion);
    /**
     * @deprecated use `updatePostbackConversionValue:`
     */
    @Deprecated
    @Method(selector = "updateSkAdNetworkConversionValue:")
    public static native void updateSkAdNetworkConversionValue(int conversionValue);
    /**
     * @deprecated use `updatePostbackConversionValue:`
     */
    @Deprecated
    @Method(selector = "updateConversionValue:")
    public static native void updateConversionValue(int conversionValue);
    @Method(selector = "updatePostbackConversionValue:")
    public static native void updatePostbackConversionValue(int conversionValue);
    @Method(selector = "updatePostbackConversionValue:coarseValue:")
    public static native void updatePostbackConversion(int conversionValue, String coarseValue);
    @Method(selector = "updatePostbackConversionValue:coarseValue:lockWindow:")
    public static native void updatePostbackConversion(int conversionValue, String coarseValue, boolean lockWindow);
    @Method(selector = "setCustomerUserId:")
    public static native void setCustomerUserId(String userId);
    @Method(selector = "getCustomerUserId")
    public static native String getCustomerUserId();
    @Method(selector = "setCacheEventSetting:")
    public static native void setCacheEventSetting(boolean isCacheEventsEnabled);
    @Method(selector = "setEncryptRequestsSetting:")
    public static native void setEncryptRequestsSetting(boolean isEncryptRequestsEnabled);
    @Method(selector = "getAnalyticsInstallationId")
    public static native String getAnalyticsInstallationId();
    @Method(selector = "verboseLogs")
    public static native void verboseLogs();
    @Method(selector = "debugLogs")
    public static native void debugLogs();
    @Method(selector = "setLogHandler:")
    public static native void setLogHandler(@Block VoidBlock1<NSString> handler);
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "setWrapperVersion:")
    public static native void setWrapperVersion(String wrapperVersion);
    @Method(selector = "setValue:forKey:")
    public static native void setValue(String value, String key);
    /**
     * @deprecated use `updatePostbackConversionValue:`
     */
    @Deprecated
    @Method(selector = "registerAppForAdNetworkAttribution")
    public static native void registerAppForAdNetworkAttribution();
    @Method(selector = "requestTrackingAuthorizationWithCompletionHandler:")
    public static native void requestTrackingAuthorization(@Block("(@MachineSizedUInt)") VoidBlock1<Long> completion);
    @Method(selector = "handleAdMobILRD::")
    public static native void handleAdMobILRD(NSObject adView, org.robovm.pods.google.mobileads.GADAdValue adValue);
    @Method(selector = "adMobImpressionFromJSON:")
    public static native void adMobImpressionFromJSON(String jsonString);
    @Method(selector = "subscribeAppLovinImpressions")
    public static native void subscribeAppLovinImpressions();
    @Method(selector = "appLovinImpressionFromJSON:")
    public static native void appLovinImpressionFromJSON(String jsonString);
    @Method(selector = "subscribeCASBannerImpressions")
    public static native void subscribeCASBannerImpressions();
    @Method(selector = "casImpressionFromJSON:")
    public static native void casImpressionFromJSON(String jsonString);
    @Method(selector = "handleCASILRD:")
    public static native void handleCASILRD(NSObject adImpression);
    @Method(selector = "hyperBidImpressionFromDict:")
    public static native void hyperBidImpressionFromDict(NSDictionary<?, ?> adImpression);
    @Method(selector = "hyperBidImpressionFromJSON:")
    public static native void hyperBidImpressionFromJSON(String jsonString);
    @Method(selector = "subscribeIronSourceImpressions")
    public static native void subscribeIronSourceImpressions();
    @Method(selector = "ironSourceImpressionFromJSON:")
    public static native void ironSourceImpressionFromJSON(String jsonString);
    @Method(selector = "topOnImpressionFromDict:")
    public static native void topOnImpressionFromDict(NSDictionary<?, ?> adImpression);
    @Method(selector = "topOnImpressionFromJSON:")
    public static native void topOnImpressionFromJSON(String jsonString);
    @Method(selector = "subscribeTradPlusImpressions")
    public static native void subscribeTradPlusImpressions();
    @Method(selector = "tradPlusImpressionFromJSON:")
    public static native void tradPlusImpressionFromJSON(String jsonString);
    @Method(selector = "handleTradPlusILRD:")
    public static native void handleTradPlusILRD(NSDictionary<?, ?> adInfo);
    /*</methods>*/
}
