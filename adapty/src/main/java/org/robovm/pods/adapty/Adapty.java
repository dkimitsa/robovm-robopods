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
package org.robovm.pods.adapty;

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
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty6Adapty")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Adapty/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdaptyPtr extends Ptr<Adapty, AdaptyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Adapty.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Adapty() {}
    protected Adapty(Handle h, long handle) { super(h, handle); }
    protected Adapty(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "delegate")
    public static native AdaptyDelegate delegate();
    @Method(selector = "setDelegate:")
    public static native void setDelegate(AdaptyDelegate value);
    @Method(selector = "logLevel")
    public static native AdaptyLogLevel logLevel();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(AdaptyLogLevel value);
    @Method(selector = "idfaCollectionDisabled")
    public static native boolean idfaCollectionDisabled();
    @Method(selector = "setIdfaCollectionDisabled:")
    public static native void setIdfaCollectionDisabled(boolean value);
    @Method(selector = "activate:")
    public static native void activate(String apiKey);
    @Method(selector = "activate:observerMode:")
    public static native void activate(String apiKey, boolean observerMode);
    @Method(selector = "activate:customerUserId:")
    public static native void activate(String apiKey, String customerUserId);
    @Method(selector = "activate:observerMode:customerUserId:")
    public static native void activate(String apiKey, boolean observerMode, String customerUserId);
    @Method(selector = "activate:observerMode:customerUserId:completion:")
    public static native void activate$observerMode$customerUserId$completion$(String apiKey, boolean observerMode, String customerUserId, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "identify:completion:")
    public static native void identify(String customerUserId, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "updateProfileWithParams:completion:")
    public static native void updateProfile(ProfileParameterBuilder params, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "updateAttribution:source:networkUserId:completion:")
    public static native void updateAttribution(NSDictionary<?, ?> attribution, AttributionNetwork source, String networkUserId, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "getPaywallsWithForceUpdate::")
    public static native void getPaywalls(boolean forceUpdate, @Block VoidBlock3<NSArray<PaywallModel>, NSArray<ProductModel>, AdaptyError> completion);
    @Method(selector = "makePurchaseWithProduct:offerId:completion:")
    public static native void makePurchase(ProductModel product, String offerId, @Block VoidBlock5<PurchaserInfoModel, NSString, NSDictionary<NSString, ?>, ProductModel, AdaptyError> completion);
    @Method(selector = "restorePurchasesWithCompletion:")
    public static native void restorePurchases(@Block VoidBlock4<PurchaserInfoModel, NSString, NSDictionary<NSString, ?>, AdaptyError> completion);
    @Method(selector = "apnsToken")
    public static native NSData apnsToken();
    @Method(selector = "setApnsToken:")
    public static native void setApnsToken(NSData value);
    @Method(selector = "apnsTokenString")
    public static native String apnsTokenString();
    @Method(selector = "setApnsTokenString:")
    public static native void setApnsTokenString(String value);
    @Method(selector = "customerUserId")
    public static native String customerUserId();
    @Method(selector = "syncTransactionsHistoryWithCompletion:")
    public static native void syncTransactionsHistory(@Block VoidBlock4<NSDictionary<NSString, ?>, NSArray<PaywallModel>, NSArray<ProductModel>, AdaptyError> completion);
    @Method(selector = "getPurchaserInfoWithForceUpdate::")
    public static native void getPurchaserInfo(boolean forceUpdate, @Block VoidBlock2<PurchaserInfoModel, AdaptyError> completion);
    @Method(selector = "getPromo:")
    public static native void getPromo(@Block VoidBlock2<PromoModel, AdaptyError> completion);
    @Method(selector = "handlePushNotification:completion:")
    public static native void handlePushNotification(NSDictionary<?, ?> userInfo, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "showVisualPaywallFor:from:delegate:")
    public static native PaywallViewController showVisualPaywall(PaywallModel paywall, UIViewController viewController, AdaptyVisualPaywallDelegate delegate);
    @Method(selector = "getVisualPaywallFor:delegate:")
    public static native PaywallViewController getVisualPaywall(PaywallModel paywall, AdaptyVisualPaywallDelegate delegate);
    @Method(selector = "closeVisualPaywall:")
    public static native void closeVisualPaywall(PaywallViewController paywall);
    @Method(selector = "setFallbackPaywalls:completion:")
    public static native void setFallbackPaywalls(String paywalls, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "logShowPaywall:completion:")
    public static native void logShowPaywall(PaywallModel paywall, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "setExternalAnalyticsEnabled:completion:")
    public static native void setExternalAnalyticsEnabled(boolean enabled, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "setVariationId:forTransactionId:completion:")
    public static native void setVariationId(String variationId, String transactionId, @Block VoidBlock1<AdaptyError> completion);
    @Method(selector = "presentCodeRedemptionSheet")
    public static native void presentCodeRedemptionSheet();
    @Method(selector = "logout:")
    public static native void logout(@Block VoidBlock1<AdaptyError> completion);
    /*</methods>*/

    // FIXME: DIRTY HACK: manually added code
    static {
        // preload native classes so RoboVM will know their addresses
        // otherwise it will fail to marshal them into proper Java class (will result NSObject) due
        // these have different runtime name than specified for static linkage
        // (e.g. `Adapty.ProductModel` instead of `_TtC6Adapty12ProductModel`)
        NativeClass anno;
        if ((anno = ProductModel.class.getAnnotation(NativeClass.class)) != null)
            ObjCClass.getByName(anno.value());
        if ((anno = PaywallModel.class.getAnnotation(NativeClass.class)) != null)
            ObjCClass.getByName(anno.value());
    }
}
