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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TenjinImpl/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSURLConnectionDelegate, SKProductsRequestDelegate/*</implements>*/ {

    /*<ptr>*/public static class TenjinImplPtr extends Ptr<TenjinImpl, TenjinImplPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TenjinImpl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TenjinImpl() {}
    protected TenjinImpl(Handle h, long handle) { super(h, handle); }
    protected TenjinImpl(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithToken:andSharedSecret:andAppSubversion:ping:requestSender:")
    public TenjinImpl(String apiToken, String secret, NSNumber subversion, boolean ping, TJNRequestSender sender) { super((SkipInit) null); initObject(init(apiToken, secret, subversion, ping, sender)); }
    @Method(selector = "initWithToken:andSharedSecret:andAppSubversion:ping:")
    public TenjinImpl(String apiToken, String secret, NSNumber subversion, boolean ping) { super((SkipInit) null); initObject(init(apiToken, secret, subversion, ping)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serialQueue")
    public native DispatchQueue getSerialQueue();
    @Property(selector = "setSerialQueue:")
    public native void setSerialQueue(DispatchQueue v);
    @Property(selector = "hasCheckedAttribution")
    public native boolean hasCheckedAttribution();
    @Property(selector = "setHasCheckedAttribution:")
    public native void setHasCheckedAttribution(boolean v);
    @Property(selector = "deferredDeeplink")
    public native String getDeferredDeeplink();
    @Property(selector = "setDeferredDeeplink:")
    public native void setDeferredDeeplink(String v);
    @Property(selector = "openDeeplinkUrl")
    public native String getOpenDeeplinkUrl();
    @Property(selector = "setOpenDeeplinkUrl:")
    public native void setOpenDeeplinkUrl(String v);
    @Property(selector = "productQuantity")
    public native int getProductQuantity();
    @Property(selector = "setProductQuantity:")
    public native void setProductQuantity(int v);
    @Property(selector = "receipt")
    public native NSData getReceipt();
    @Property(selector = "setReceipt:")
    public native void setReceipt(NSData v);
    @Property(selector = "transactionIdentifier")
    public native String getTransactionIdentifier();
    @Property(selector = "setTransactionIdentifier:")
    public native void setTransactionIdentifier(String v);
    @Property(selector = "config")
    public native TenjinConfig getConfig();
    @Property(selector = "dataStore")
    public native DataStore getDataStore();
    @Property(selector = "setDataStore:")
    public native void setDataStore(DataStore v);
    @Property(selector = "httpClient")
    public native TJNRequestSender getHttpClient();
    @Property(selector = "setHttpClient:")
    public native void setHttpClient(TJNRequestSender v);
    @Property(selector = "apiToken")
    public native String getApiToken();
    @Property(selector = "setApiToken:")
    public native void setApiToken(String v);
    @Property(selector = "appSubversion")
    public native NSNumber getAppSubversion();
    @Property(selector = "setAppSubversion:")
    public native void setAppSubversion(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithToken:andSharedSecret:andAppSubversion:ping:requestSender:")
    protected native @Pointer long init(String apiToken, String secret, NSNumber subversion, boolean ping, TJNRequestSender sender);
    @Method(selector = "initWithToken:andSharedSecret:andAppSubversion:ping:")
    protected native @Pointer long init(String apiToken, String secret, NSNumber subversion, boolean ping);
    @Method(selector = "setup")
    public native void setup();
    @Method(selector = "ping")
    public native void ping();
    @Method(selector = "pingWithDeferredDeeplink:")
    public native void ping(NSURL url);
    @Method(selector = "handleOpenURL:")
    public native void handleOpenURL(NSURL url);
    @Method(selector = "handleOpenURLString:")
    public native void handleOpenURLString(String urlString);
    @Method(selector = "claimOpenDeeplinkUrl")
    public native String claimOpenDeeplinkUrl();
    @Method(selector = "restoreOpenDeeplinkUrl:")
    public native void restoreOpenDeeplinkUrl(String urlString);
    @Method(selector = "pingEventWithName:")
    public native void pingEvent(String eventName);
    @Method(selector = "pingEventWithName:andIntegerValue:")
    public native void pingEvent(String eventName, @MachineSizedSInt long eventInteger);
    @Deprecated
    @Method(selector = "transaction:")
    public native void transaction(SKPaymentTransaction transaction);
    @Method(selector = "transactionWithProductName:andCurrencyCode:andQuantity:andUnitPrice:")
    public native void transaction(String productName, String currencyCode, @MachineSizedSInt long quantity, NSDecimalNumber price);
    @Method(selector = "deviceDataWithEvent:")
    public native NSMutableDictionary<?, ?> deviceData(String eventName);
    @Method(selector = "deviceDataWithEvent:openDeeplinkUrl:")
    public native NSMutableDictionary<?, ?> deviceData(String eventName, String openDeeplinkUrl);
    @Method(selector = "optOut")
    public native void optOut();
    @Method(selector = "optIn")
    public native void optIn();
    @Method(selector = "optInOutUsingCMP")
    public native boolean optInOutUsingCMP();
    @Method(selector = "optOutGoogleDMA")
    public native void optOutGoogleDMA();
    @Method(selector = "optInGoogleDMA")
    public native void optInGoogleDMA();
    @Method(selector = "optOutOfParams:")
    public native void optOutOfParams(NSArray<?> paramKeys);
    @Method(selector = "optInToParams:")
    public native void optInToParams(NSArray<?> paramKeys);
    @Method(selector = "transaction:andReceipt:")
    public native void transaction(SKPaymentTransaction transaction, NSData receipt);
    @Method(selector = "transactionWithProductName:andCurrencyCode:andQuantity:andUnitPrice:andTransactionId:andReceipt:")
    public native void transaction(String productName, String currencyCode, @MachineSizedSInt long quantity, NSDecimalNumber price, String transactionId, NSData receipt);
    @Method(selector = "transactionWithProductName:andCurrencyCode:andQuantity:andUnitPrice:andTransactionId:andBase64Receipt:")
    public native void transaction(String productName, String currencyCode, @MachineSizedSInt long quantity, NSDecimalNumber price, String transactionId, String receipt);
    @Method(selector = "subscriptionWithParams:")
    public native void subscription(NSDictionary<?, ?> subscriptionParams);
    @Method(selector = "handleSubscriptionPurchase:")
    public native void handleSubscriptionPurchase(SKPaymentTransaction transaction);
    @Method(selector = "trackConversionValue:coarseValue:lockWindow:hasLockWindow:")
    public native void trackConversionValue(int conversionValue, String coarseValue, boolean lockWindow, boolean hasLockWindow);
    @Method(selector = "setValue:forKey:")
    public native void setValue(String value, String key);
    @Method(selector = "getAttributionInfo:")
    public native void getAttributionInfo(@Block VoidBlock2<NSDictionary<?, ?>, NSError> completionHandler);
    @Method(selector = "setCustomerUserId:")
    public native void setCustomerUserId(String userId);
    @Method(selector = "getCustomerUserId")
    public native String getCustomerUserId();
    @Method(selector = "setCacheEventSetting:")
    public native void setCacheEventSetting(boolean isCacheEventsEnabled);
    @Method(selector = "setEncryptRequestsSetting:")
    public native void setEncryptRequestsSetting(boolean isEncryptRequestsEnable);
    @Method(selector = "getAnalyticsInstallationId")
    public native String getAnalyticsInstallationId();
    @Method(selector = "setWrappedVersion:")
    public static native void setWrappedVersion(String version);
    @Method(selector = "setPlugin:version:")
    public static native void setPlugin(String plugin, String version);
    @Method(selector = "getPlugin")
    public static native String getPlugin();
    @Method(selector = "getPluginVersion")
    public static native String getPluginVersion();
    @Method(selector = "setGoogleDMAParametersWithAdPersonalization:adUserData:")
    public static native void setGoogleDMAParameters(boolean adPersonalization, boolean adUserData);
    @Method(selector = "sharedInstance")
    public static native TenjinImpl sharedInstance();
    @Method(selector = "connection:didFailWithError:")
    public native void didFail(NSURLConnection connection, NSError error);
    @Method(selector = "connectionShouldUseCredentialStorage:")
    public native boolean shouldUseCredentialStorage(NSURLConnection connection);
    @Method(selector = "connection:willSendRequestForAuthenticationChallenge:")
    public native void willSendRequestForAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @deprecated Deprecated in iOS 8.0. Use -connection:willSendRequestForAuthenticationChallenge: instead.
     */
    @Deprecated
    @Method(selector = "connection:canAuthenticateAgainstProtectionSpace:")
    public native boolean canAuthenticateAgainstProtectionSpace(NSURLConnection connection, NSURLProtectionSpace protectionSpace);
    /**
     * @deprecated Deprecated in iOS 8.0. Use -connection:willSendRequestForAuthenticationChallenge: instead.
     */
    @Deprecated
    @Method(selector = "connection:didReceiveAuthenticationChallenge:")
    public native void didReceiveAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @deprecated Deprecated in iOS 8.0. Use -connection:willSendRequestForAuthenticationChallenge: instead.
     */
    @Deprecated
    @Method(selector = "connection:didCancelAuthenticationChallenge:")
    public native void didCancelAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    @Method(selector = "productsRequest:didReceiveResponse:")
    public native void didReceiveResponse(SKProductsRequest request, SKProductsResponse response);
    @Method(selector = "requestDidFinish:")
    public native void didFinish(SKRequest request);
    @Method(selector = "request:didFailWithError:")
    public native void didFail(SKRequest request, NSError error);
    /*</methods>*/
}
