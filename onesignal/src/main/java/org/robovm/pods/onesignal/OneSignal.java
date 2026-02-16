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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignal/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalPtr extends Ptr<OneSignal, OneSignalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignal() {}
    protected OneSignal(Handle h, long handle) { super(h, handle); }
    protected OneSignal(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="OneSignalUserVersionNumber", optional=true)
    public static native double UserVersionNumber();
    @GlobalValue(symbol="OneSignalUserVersionNumber", optional=true)
    public static native void UserVersionNumber(double v);
    @GlobalValue(symbol="OneSignalUserVersionString", optional=true)
    public static native BytePtr UserVersionString();
    @GlobalValue(symbol="OneSignalOSCoreVersionNumber", optional=true)
    public static native double OSCoreVersionNumber();
    @GlobalValue(symbol="OneSignalOSCoreVersionNumber", optional=true)
    public static native void OSCoreVersionNumber(double v);
    @GlobalValue(symbol="OneSignalOSCoreVersionString", optional=true)
    public static native BytePtr OSCoreVersionString();
    
    @Method(selector = "sdkVersionRaw")
    public static native String sdkVersionRaw();
    @Method(selector = "sdkSemanticVersion")
    public static native String sdkSemanticVersion();
    @Method(selector = "User")
    public static native OSUser User();
    @Method(selector = "login:")
    public static native void login(String externalId);
    @Method(selector = "login:withToken:")
    public static native void login(String externalId, String token);
    @Method(selector = "logout")
    public static native void logout();
    @Method(selector = "Notifications")
    public static native Class<?> Notifications();
    @Method(selector = "initialize:withLaunchOptions:")
    public static native void initialize(String newAppId, NSDictionary<?, ?> launchOptions);
    @Method(selector = "setProvidesNotificationSettingsView:")
    public static native void setProvidesNotificationSettingsView(boolean providesView);
    @Method(selector = "LiveActivities")
    public static native Class<?> LiveActivities();
    @Method(selector = "Debug")
    public static native Class<?> Debug();
    @Method(selector = "setConsentRequired:")
    public static native void setConsentRequired(boolean required);
    @Method(selector = "setConsentGiven:")
    public static native void setConsentGiven(boolean granted);
    @Method(selector = "InAppMessages")
    public static native Class<?> InAppMessages();
    @Method(selector = "Location")
    public static native Class<?> Location();
    @Method(selector = "Session")
    public static native Class<?> Session();
    /**
     * @deprecated Please use didReceiveNotificationExtensionRequest:withMutableNotificationContent:withContentHandler: instead.
     */
    @Deprecated
    @Method(selector = "didReceiveNotificationExtensionRequest:withMutableNotificationContent:")
    public static native UNMutableNotificationContent didReceiveNotification(UNNotificationRequest request, UNMutableNotificationContent replacementContent);
    @Method(selector = "didReceiveNotificationExtensionRequest:withMutableNotificationContent:withContentHandler:")
    public static native UNMutableNotificationContent didReceiveNotification(UNNotificationRequest request, UNMutableNotificationContent replacementContent, @Block VoidBlock1<UNNotificationContent> contentHandler);
    @Method(selector = "serviceExtensionTimeWillExpireRequest:withMutableNotificationContent:")
    public static native UNMutableNotificationContent serviceExtensionTimeWillExpire(UNNotificationRequest request, UNMutableNotificationContent replacementContent);
    /*</methods>*/
}
