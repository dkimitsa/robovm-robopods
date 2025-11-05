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
package org.robovm.pods.singular;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Singular/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SingularPtr extends Ptr<Singular, SingularPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Singular.class); }/*</bind>*/
    /*<constants>*/
    public static class Attributes {
        public static final String FROM_DATE = "sng_attr_from_date";
        public static final String TO_DATE = "sng_attr_to_date";
        public static final String ACHIEVEMENT_ID = "sng_attr_achievement_id";
        public static final String CONTENT = "sng_attr_content";
        public static final String CONTENT_ID = "sng_attr_content_id";
        public static final String CONTENT_LIST = "sng_attr_content_list";
        public static final String CONTENT_TYPE = "sng_attr_content_type";
        public static final String COUPON_CODE = "sng_attr_coupon_code";
        public static final String DEEP_LINK = "sng_attr_deep_link";
        public static final String EVENT_END = "sng_attr_event_end";
        public static final String EVENT_START = "sng_attr_event_start";
        public static final String HOTEL_SCORE = "sng_attr_hotel_score";
        public static final String ITEM_DESCRIPTION = "sng_attr_item_description";
        public static final String ITEM_PRICE = "sng_attr_item_price";
        public static final String LEVEL = "sng_attr_level";
        public static final String COUNTRY = "sng_attr_country";
        public static final String REGION = "sng_attr_region";
        public static final String MAX = "sng_attr_max";
        public static final String NEW_VERSION = "sng_attr_new_version";
        public static final String ORIGIN = "sng_attr_origin";
        public static final String PAYMENT_INFO_AVAILABLE = "sng_attr_payment_info_available";
        public static final String QUANTITY = "sng_attr_quantity";
        public static final String RATING = "sng_attr_rating";
        public static final String REGISTRATION_METHOD = "sng_attr_registration_method";
        public static final String REVIEW_TEXT = "sng_attr_review_text";
        public static final String SCORE = "sng_attr_score";
        public static final String SEARCH_STRING = "sng_attr_search_string";
        public static final String SUBSCRIPTION_ID = "sng_attr_subscription_id";
        public static final String SUCCESS = "sng_attr_success";
        public static final String TRANSACTION_ID = "sng_attr_transaction_id";
        public static final String TUTORIAL_ID = "sng_attr_tutorial_id";
        public static final String VALID = "sng_attr_valid";
    }

    public static class Events {
        public static final String RATE = "sng_rate";
        public static final String SPENT_CREDITS = "sng_spent_credits";
        public static final String TUTORIAL_COMPLETE = "sng_tutorial_complete";
        public static final String LOGIN = "sng_login";
        public static final String START_TRIAL = "sng_start_trial";
        public static final String SUBSCRIBE = "sng_subscribe";
        public static final String BOOK = "sng_book";
        public static final String CONTENT_VIEW_LIST = "sng_content_view_list";
        public static final String INVITE = "sng_invite";
        public static final String SHARE = "sng_share";
        public static final String SUBMIT_APPLICATION = "sng_submit_application";
        public static final String UPDATE = "sng_update";
        public static final String ECOMMERCE_PURCHASE = "sng_ecommerce_purchase";
        public static final String VIEW_CART = "sng_view_cart";
        public static final String ACHIEVEMENT_UNLOCKED = "sng_achievement_unlocked";
        public static final String ADD_PAYMENT_INFO = "sng_add_payment_info";
        public static final String ADD_TO_CART = "sng_add_to_cart";
        public static final String ADD_TO_WISHLIST = "sng_add_to_wishlist";
        public static final String CHECKOUT_INITIATED = "sng_checkout_initiated";
        public static final String COMPLETE_REGISTRATION = "sng_complete_registration";
        public static final String CONTENT_VIEW = "sng_content_view";
        public static final String LEVEL_ACHIEVED = "sng_level_achieved";
        public static final String SEARCH = "sng_search";
    }
    /*</constants>*/
    /*<constructors>*/
    public Singular() {}
    protected Singular(Handle h, long handle) { super(h, handle); }
    protected Singular(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "applicationName")
    public native String getApplicationName();
    @Property(selector = "applicationIdentifier")
    public native String getApplicationIdentifier();
    @Property(selector = "minSessionDuration")
    public native int getMinSessionDuration();
    @Property(selector = "setMinSessionDuration:")
    public native void setMinSessionDuration(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "start:")
    public static native boolean start(SingularConfig config);
    @Method(selector = "startSession:withKey:")
    public static native void startSession(String apiKey, String apiSecret);
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler);
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:andShortLinkResolveTimeout:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec);
    @Deprecated
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler, NSArray<?> domains);
    @Deprecated
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:andShortLinkResolveTimeout:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec, NSArray<?> domains);
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler);
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:andShortLinkResolveTimeout:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec);
    @Deprecated
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler, NSArray<?> domains);
    @Deprecated
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:andShortLinkResolveTimeout:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec, NSArray<?> domains);
    @Method(selector = "startSession:withKey:andLaunchOptions:")
    public static native void startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions);
    @Method(selector = "startSession:withKey:andLaunchURL:")
    public static native void startSession(String apiKey, String apiSecret, NSURL url);
    @Method(selector = "reStartSession:withKey:")
    public static native void reStartSession(String apiKey, String apiSecret);
    @Method(selector = "sessionStarted")
    public static native boolean sessionStarted();
    @Method(selector = "endSession")
    public static native void endSession();
    @Method(selector = "event:")
    public static native void event(String name);
    @Method(selector = "event:withArgs:")
    public static native void event(String name, NSDictionary<?, ?> args);
    @Method(selector = "setDeviceCustomUserId:")
    public static native void setDeviceCustomUserId(String customUserId);
    @Method(selector = "registerDeviceTokenForUninstall:")
    public static native void registerDeviceTokenForUninstall(NSData deviceToken);
    @Method(selector = "registerDeferredDeepLinkHandler:")
    public static native void registerDeferredDeepLinkHandler(@Block VoidBlock1<String> handler);
    @Method(selector = "setDeferredDeepLinkTimeout:")
    public static native int setDeferredDeepLinkTimeout(int duration);
    @Method(selector = "shared")
    public static native Singular shared();
    @Method(selector = "sessionDuration")
    public static native double sessionDuration();
    @Method(selector = "sessionStartDate")
    public static native NSDate sessionStartDate();
    @Method(selector = "sessionID")
    public static native String sessionID();
    @Method(selector = "version")
    public static native String version();
    @Method(selector = "singularID")
    public static native String singularID();
    @Method(selector = "singularKeyspace")
    public static native String singularKeyspace();
    @Method(selector = "setBufferLimit:")
    public static native void setBufferLimit(int size);
    @Method(selector = "processJSRequestWK:withURL:")
    public static native boolean processJSRequestWK(WKWebView webView, NSURLRequest url);
    @Method(selector = "setMinSessionDuration:")
    public static native void setMinimalSessionDuration(int seconds);
    @Method(selector = "initializeApStore")
    public static native void initializeApStore();
    @Method(selector = "setAllowAutoIAPComplete:")
    public static native void setAllowAutoIAPComplete(boolean v);
    @Method(selector = "iapComplete:")
    public static native void iapComplete(NSObject transaction);
    @Method(selector = "iapComplete:withName:")
    public static native void iapComplete(NSObject transaction, String name);
    @Method(selector = "setGender:")
    public static native void setGender(String gender);
    @Method(selector = "setAge:")
    public static native void setAge(NSObject age);
    @Deprecated
    @Method(selector = "batchInterval")
    public static native int batchInterval();
    @Deprecated
    @Method(selector = "setBatchInterval:")
    public static native void setBatchInterval(int interval);
    @Deprecated
    @Method(selector = "batchesEvents")
    public static native boolean batchesEvents();
    @Deprecated
    @Method(selector = "setBatchesEvents:")
    public static native void setBatchesEvents(boolean v);
    @Deprecated
    @Method(selector = "sendAllBatches")
    public static native void sendAllBatches();
    @Method(selector = "revenue:")
    public static native void revenue(NSObject transaction);
    @Method(selector = "revenue:withAttributes:")
    public static native void revenue(NSObject transaction, NSDictionary<?, ?> attributes);
    @Method(selector = "revenue:amount:")
    public static native void revenue(String currency, double amount);
    @Method(selector = "revenue:amount:withAttributes:")
    public static native void revenue(String currency, double amount, NSDictionary<?, ?> attributes);
    @Method(selector = "revenue:amount:productSKU:productName:productCategory:productQuantity:productPrice:")
    public static native void revenue(String currency, double amount, String productSKU, String productName, String productCategory, int productQuantity, double productPrice);
    @Method(selector = "customRevenue:transaction:")
    public static native void customRevenue(String eventname, NSObject transaction);
    @Method(selector = "customRevenue:transaction:withAttributes:")
    public static native void customRevenue(String eventname, NSObject transaction, NSDictionary<?, ?> attributes);
    @Method(selector = "customRevenue:currency:amount:")
    public static native void customRevenue(String eventname, String currency, double amount);
    @Method(selector = "customRevenue:currency:amount:withAttributes:")
    public static native void customRevenue(String eventname, String currency, double amount, NSDictionary<?, ?> attributes);
    @Method(selector = "customRevenue:currency:amount:productSKU:productName:productCategory:productQuantity:productPrice:")
    public static native void customRevenue(String eventname, String currency, double amount, String productSKU, String productName, String productCategory, int productQuantity, double productPrice);
    @Method(selector = "customRevenue:productJsonRepresentation:")
    public static native void customRevenue(NSData transactionJsonRepresentation, NSData productJsonRepresentation);
    @Method(selector = "customRevenue:transactionJsonRepresentation:productJsonRepresentation:")
    public static native void customRevenue(String eventName, NSData transactionJsonRepresentation, NSData productJsonRepresentation);
    @Method(selector = "customRevenue:transactionJsonRepresentation:productJsonRepresentation:withAttributes:")
    public static native void customRevenue(String eventName, NSData transactionJsonRepresentation, NSData productJsonRepresentation, NSDictionary<?, ?> attributes);
    @Method(selector = "setCustomUserId:")
    public static native void setCustomUserId(String customUserId);
    @Method(selector = "unsetCustomUserId")
    public static native void unsetCustomUserId();
    @Method(selector = "setSessionTimeout:")
    public static native void setSessionTimeout(int timeout);
    @Method(selector = "getFirstSessionUnixTime")
    public static native @MachineSizedSInt long getFirstSessionUnixTime();
    @Method(selector = "setWrapperName:andVersion:")
    public static native void setWrapperName(String name, String version);
    @Method(selector = "getGlobalProperties")
    public static native NSDictionary<?, ?> getGlobalProperties();
    @Method(selector = "setGlobalProperty:andValue:overrideExisting:")
    public static native boolean setGlobalProperty(String key, String value, boolean overrideExisting);
    @Method(selector = "unsetGlobalProperty:")
    public static native void unsetGlobalProperty(String key);
    @Method(selector = "clearGlobalProperties")
    public static native void clearGlobalProperties();
    @Method(selector = "trackingOptIn")
    public static native void trackingOptIn();
    @Method(selector = "trackingUnder13")
    public static native void trackingUnder13();
    @Method(selector = "stopAllTracking")
    public static native void stopAllTracking();
    @Method(selector = "resumeAllTracking")
    public static native void resumeAllTracking();
    @Method(selector = "isAllTrackingStopped")
    public static native boolean isAllTrackingStopped();
    @Method(selector = "limitDataSharing:")
    public static native void limitDataSharing(boolean shouldLimitDataSharing);
    @Method(selector = "getLimitDataSharing")
    public static native boolean getLimitDataSharing();
    @Method(selector = "setLimitAdvertisingIdentifiers:")
    public static native void setLimitAdvertisingIdentifiers(boolean enabled);
    @Method(selector = "skanRegisterAppForAdNetworkAttribution")
    public static native void skanRegisterAppForAdNetworkAttribution();
    @Method(selector = "skanUpdateConversionValue:")
    public static native boolean skanUpdateConversionValue(@MachineSizedSInt long conversionValue);
    @Method(selector = "skanUpdateConversionValue:coarse:lock:")
    public static native void skanUpdateConversionValue(@MachineSizedSInt long conversionValue, @MachineSizedSInt long coarse, boolean lock);
    @Method(selector = "skanGetConversionValue")
    public static native NSNumber skanGetConversionValue();
    @Method(selector = "isSingularLink:")
    public static native boolean isSingularLink(NSObject linkHolder);
    @Method(selector = "handlePushNotification:")
    public static native boolean handlePushNotification(NSDictionary<?, ?> pushNotificationPayload);
    @Method(selector = "adRevenue:")
    public static native void adRevenue(SingularAdData adData);
    @Method(selector = "createReferrerShortLink:referrerName:referrerId:completionHandler:")
    public static native void createReferrerShortLink(String baseLink, String referrerName, String referrerId, @Block VoidBlock2<NSString, NSError> completionHandler);
    @Method(selector = "createReferrerShortLink:referrerName:referrerId:passthroughParams:completionHandler:")
    public static native void createReferrerShortLink(String baseLink, String referrerName, String referrerId, NSDictionary<?, ?> passthroughParams, @Block VoidBlock2<NSString, NSError> completionHandler);
    /*</methods>*/
}
