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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SingularConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SingularConfigPtr extends Ptr<SingularConfig, SingularConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SingularConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SingularConfig() {}
    protected SingularConfig(Handle h, long handle) { super(h, handle); }
    protected SingularConfig(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithApiKey:andSecret:")
    public SingularConfig(String apikey, String secret) { super((SkipInit) null); initObject(init(apikey, secret)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "apikey")
    public native String getApikey();
    @Property(selector = "setApikey:")
    public native void setApikey(String v);
    @Property(selector = "secret")
    public native String getSecret();
    @Property(selector = "setSecret:")
    public native void setSecret(String v);
    @Property(selector = "clipboardAttribution")
    public native boolean isClipboardAttribution();
    @Property(selector = "setClipboardAttribution:")
    public native void setClipboardAttribution(boolean v);
    @Property(selector = "launchOptions")
    public native NSDictionary<?, ?> getLaunchOptions();
    @Property(selector = "setLaunchOptions:")
    public native void setLaunchOptions(NSDictionary<?, ?> v);
    @Property(selector = "userActivity")
    public native NSUserActivity getUserActivity();
    @Property(selector = "setUserActivity:")
    public native void setUserActivity(NSUserActivity v);
    @Property(selector = "openUrl")
    public native NSURL getOpenUrl();
    @Property(selector = "setOpenUrl:")
    public native void setOpenUrl(NSURL v);
    @Property(selector = "singularLinksHandler")
    public native @Block VoidBlock1<SingularLinkParams> getSingularLinksHandler();
    @Property(selector = "setSingularLinksHandler:")
    public native void setSingularLinksHandler(@Block VoidBlock1<SingularLinkParams> v);
    @Property(selector = "shortLinkResolveTimeOut")
    public native @MachineSizedSInt long getShortLinkResolveTimeOut();
    @Property(selector = "setShortLinkResolveTimeOut:")
    public native void setShortLinkResolveTimeOut(@MachineSizedSInt long v);
    @Deprecated
    @Property(selector = "supportedDomains")
    public native NSArray<?> getSupportedDomains();
    @Deprecated
    @Property(selector = "setSupportedDomains:")
    public native void setSupportedDomains(NSArray<?> v);
    @Property(selector = "espDomains")
    public native NSArray<?> getEspDomains();
    @Property(selector = "setEspDomains:")
    public native void setEspDomains(NSArray<?> v);
    @Property(selector = "brandedDomains")
    public native NSArray<?> getBrandedDomains();
    @Property(selector = "setBrandedDomains:")
    public native void setBrandedDomains(NSArray<?> v);
    @Property(selector = "globalProperties")
    public native NSMutableDictionary<?, ?> getGlobalProperties();
    @Property(selector = "skAdNetworkEnabled")
    public native boolean isSkAdNetworkEnabled();
    @Property(selector = "setSkAdNetworkEnabled:")
    public native void setSkAdNetworkEnabled(boolean v);
    @Property(selector = "manualSkanConversionManagement")
    public native boolean isManualSkanConversionManagement();
    @Property(selector = "setManualSkanConversionManagement:")
    public native void setManualSkanConversionManagement(boolean v);
    @Property(selector = "conversionValueUpdatedCallback")
    public native @Block("(@MachineSizedSInt)") VoidBlock1<Long> getConversionValueUpdatedCallback();
    @Property(selector = "setConversionValueUpdatedCallback:")
    public native void setConversionValueUpdatedCallback(@Block("(@MachineSizedSInt)") VoidBlock1<Long> v);
    @Property(selector = "conversionValuesUpdatedCallback")
    public native @Block VoidBlock3<NSNumber, NSNumber, Boolean> getConversionValuesUpdatedCallback();
    @Property(selector = "setConversionValuesUpdatedCallback:")
    public native void setConversionValuesUpdatedCallback(@Block VoidBlock3<NSNumber, NSNumber, Boolean> v);
    @Property(selector = "waitForTrackingAuthorizationWithTimeoutInterval")
    public native @MachineSizedSInt long getWaitForTrackingAuthorizationWithTimeoutInterval();
    @Property(selector = "setWaitForTrackingAuthorizationWithTimeoutInterval:")
    public native void setWaitForTrackingAuthorizationWithTimeoutInterval(@MachineSizedSInt long v);
    @Property(selector = "deviceAttributionCallback")
    public native @Block VoidBlock1<NSDictionary<?, ?>> getDeviceAttributionCallback();
    @Property(selector = "setDeviceAttributionCallback:")
    public native void setDeviceAttributionCallback(@Block VoidBlock1<NSDictionary<?, ?>> v);
    @Property(selector = "customSdid")
    public native String getCustomSdid();
    @Property(selector = "setCustomSdid:")
    public native void setCustomSdid(String v);
    @Property(selector = "didSetSdidHandler")
    public native @Block VoidBlock1<String> getDidSetSdidHandler();
    @Property(selector = "setDidSetSdidHandler:")
    public native void setDidSetSdidHandler(@Block VoidBlock1<String> v);
    @Property(selector = "sdidReceivedHandler")
    public native @Block VoidBlock1<String> getSdidReceivedHandler();
    @Property(selector = "setSdidReceivedHandler:")
    public native void setSdidReceivedHandler(@Block VoidBlock1<String> v);
    @Property(selector = "limitAdvertisingIdentifiers")
    public native boolean isLimitAdvertisingIdentifiers();
    @Property(selector = "setLimitAdvertisingIdentifiers:")
    public native void setLimitAdvertisingIdentifiers(boolean v);
    @Property(selector = "pushNotificationPayload")
    public native NSDictionary<?, ?> getPushNotificationPayload();
    @Property(selector = "setPushNotificationPayload:")
    public native void setPushNotificationPayload(NSDictionary<?, ?> v);
    @Property(selector = "pushNotificationLinkPath")
    public native NSArray<?> getPushNotificationLinkPath();
    @Property(selector = "setPushNotificationLinkPath:")
    public native void setPushNotificationLinkPath(NSArray<?> v);
    @Property(selector = "supportAppExtension")
    public native boolean isSupportAppExtension();
    @Property(selector = "setSupportAppExtension:")
    public native void setSupportAppExtension(boolean v);
    @Property(selector = "appGroupName")
    public native String getAppGroupName();
    @Property(selector = "setAppGroupName:")
    public native void setAppGroupName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithApiKey:andSecret:")
    protected native @Pointer long init(String apikey, String secret);
    @Method(selector = "setGlobalProperty:withValue:overrideExisting:")
    public native void setGlobalProperty(String key, String value, boolean overrideExisiting);
    @Method(selector = "toJsonString")
    public native String toJsonString();
    /*</methods>*/
}
