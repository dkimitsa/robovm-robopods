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
package org.robovm.pods.adjustsdk;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Adjust/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdjustPtr extends Ptr<Adjust, AdjustPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Adjust.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Adjust() {}
    protected Adjust(Handle h, long handle) { super(h, handle); }
    protected Adjust(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Environments {
        static { Bro.bind(Environments.class); }

        @GlobalValue(symbol="ADJEnvironmentSandbox", optional=true)
        public static native String Sandbox();
        @GlobalValue(symbol="ADJEnvironmentProduction", optional=true)
        public static native String Production();
    }
    
    @Method(selector = "initSdk:")
    public static native void initSdk(ADJConfig adjustConfig);
    @Method(selector = "trackEvent:")
    public static native void trackEvent(ADJEvent event);
    @Method(selector = "enable")
    public static native void enable();
    @Method(selector = "disable")
    public static native void disable();
    @Method(selector = "isEnabledWithCompletionHandler:")
    public static native void isEnabled(@Block VoidBooleanBlock completion);
    @Method(selector = "processDeeplink:")
    public static native void processDeeplink(ADJDeeplink deeplink);
    @Method(selector = "processAndResolveDeeplink:withCompletionHandler:")
    public static native void processAndResolveDeeplink(ADJDeeplink deeplink, @Block VoidBlock1<NSString> completion);
    @Method(selector = "setPushToken:")
    public static native void setPushToken(NSData pushToken);
    @Method(selector = "setPushTokenAsString:")
    public static native void setPushTokenAsString(String pushToken);
    @Method(selector = "switchToOfflineMode")
    public static native void switchToOfflineMode();
    @Method(selector = "switchBackToOnlineMode")
    public static native void switchBackToOnlineMode();
    @Method(selector = "idfaWithCompletionHandler:")
    public static native void idfa(@Block VoidBlock1<NSString> completion);
    @Method(selector = "idfvWithCompletionHandler:")
    public static native void idfv(@Block VoidBlock1<NSString> completion);
    @Method(selector = "adidWithCompletionHandler:")
    public static native void adid(@Block VoidBlock1<NSString> completion);
    @Method(selector = "adidWithTimeout:completionHandler:")
    public static native void adid(@MachineSizedSInt long timeoutMs, @Block VoidBlock1<NSString> completion);
    @Method(selector = "attributionWithCompletionHandler:")
    public static native void attribution(@Block VoidBlock1<ADJAttribution> completion);
    @Method(selector = "attributionWithTimeout:completionHandler:")
    public static native void attribution(@MachineSizedSInt long timeoutMs, @Block VoidBlock1<ADJAttribution> completion);
    @Method(selector = "thirdPartySharingSettingsWithTimeout:completionHandler:")
    public static native void thirdPartySharingSettings(@MachineSizedSInt long timeoutMs, @Block VoidBlock1<ADJThirdPartySharingResult> completion);
    @Method(selector = "sdkVersionWithCompletionHandler:")
    public static native void sdkVersion(@Block VoidBlock1<NSString> completion);
    @Method(selector = "convertUniversalLink:withScheme:")
    public static native NSURL convertUniversalLink(NSURL url, String scheme);
    @Method(selector = "addGlobalCallbackParameter:forKey:")
    public static native void addGlobalCallbackParameter(String param, String key);
    @Method(selector = "addGlobalPartnerParameter:forKey:")
    public static native void addGlobalPartnerParameter(String param, String key);
    @Method(selector = "removeGlobalCallbackParameterForKey:")
    public static native void removeGlobalCallbackParameterForKey(String key);
    @Method(selector = "removeGlobalPartnerParameterForKey:")
    public static native void removeGlobalPartnerParameterForKey(String key);
    @Method(selector = "removeGlobalCallbackParameters")
    public static native void removeGlobalCallbackParameters();
    @Method(selector = "removeGlobalPartnerParameters")
    public static native void removeGlobalPartnerParameters();
    @Method(selector = "gdprForgetMe")
    public static native void gdprForgetMe();
    @Method(selector = "trackThirdPartySharing:")
    public static native void trackThirdPartySharing(ADJThirdPartySharing thirdPartySharing);
    @Method(selector = "trackMeasurementConsent:")
    public static native void trackMeasurementConsent(boolean enabled);
    @Method(selector = "trackAdRevenue:")
    public static native void trackAdRevenue(ADJAdRevenue adRevenue);
    @Method(selector = "trackAppStoreSubscription:")
    public static native void trackAppStoreSubscription(ADJAppStoreSubscription subscription);
    @Method(selector = "requestAppTrackingAuthorizationWithCompletionHandler:")
    public static native void requestAppTrackingAuthorization(@Block("(@MachineSizedUInt)") VoidBlock1<Long> completion);
    @Method(selector = "appTrackingAuthorizationStatus")
    public static native int appTrackingAuthorizationStatus();
    @Method(selector = "updateSkanConversionValue:coarseValue:lockWindow:withCompletionHandler:")
    public static native void updateSkanConversionValue(@MachineSizedSInt long conversionValue, String coarseValue, NSNumber lockWindow, @Block VoidBlock1<NSError> completion);
    @Method(selector = "lastDeeplinkWithCompletionHandler:")
    public static native void lastDeeplink(@Block VoidBlock1<NSURL> completion);
    @Method(selector = "enableCoppaComplianceInDelay")
    public static native void enableCoppaComplianceInDelay();
    @Method(selector = "disableCoppaComplianceInDelay")
    public static native void disableCoppaComplianceInDelay();
    @Method(selector = "setExternalDeviceIdInDelay:")
    public static native void setExternalDeviceIdInDelay(String externalDeviceId);
    @Method(selector = "verifyAppStorePurchase:withCompletionHandler:")
    public static native void verifyAppStorePurchase(ADJAppStorePurchase purchase, @Block VoidBlock1<ADJPurchaseVerificationResult> completion);
    @Method(selector = "verifyAndTrackAppStorePurchase:withCompletionHandler:")
    public static native void verifyAndTrackAppStorePurchase(ADJEvent event, @Block VoidBlock1<ADJPurchaseVerificationResult> completion);
    @Method(selector = "endFirstSessionDelay")
    public static native void endFirstSessionDelay();
    @Method(selector = "getInstance")
    public static native Adjust getInstance();
    @Method(selector = "setTestOptions:")
    public static native void setTestOptions(NSDictionary<?, ?> testOptions);
    @Method(selector = "trackSubsessionStart")
    public static native void trackSubsessionStart();
    @Method(selector = "trackSubsessionEnd")
    public static native void trackSubsessionEnd();
    /*</methods>*/
}
