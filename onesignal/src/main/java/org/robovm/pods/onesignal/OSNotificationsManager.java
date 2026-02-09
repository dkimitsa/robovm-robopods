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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSNotificationsManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSNotifications/*</implements>*/ {

    /*<ptr>*/public static class OSNotificationsManagerPtr extends Ptr<OSNotificationsManager, OSNotificationsManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSNotificationsManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSNotificationsManager() {}
    protected OSNotificationsManager(Handle h, long handle) { super(h, handle); }
    protected OSNotificationsManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public static native OneSignalNotificationsDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public static native void setDelegate(OneSignalNotificationsDelegate v);
    @Property(selector = "currentPermissionState")
    public static native OSPermissionStateInternal getCurrentPermissionState();
    @Property(selector = "lastPermissionState")
    public static native OSPermissionStateInternal getLastPermissionState();
    @Property(selector = "setLastPermissionState:")
    public static native void setLastPermissionState(OSPermissionStateInternal v);
    @Property(selector = "permissionStateChangesObserver")
    public static native OSBoolObservable getPermissionStateChangesObserver();
    @Property(selector = "osNotificationSettings")
    public static native OneSignalNotificationSettings getOsNotificationSettings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "Notifications")
    public static native Class<?> Notifications();
    @Method(selector = "start")
    public static native void start();
    @Method(selector = "setColdStartFromTapOnNotification:")
    public static native void setColdStartFromTapOnNotification(boolean coldStartFromTapOnNotification);
    @Method(selector = "getColdStartFromTapOnNotification")
    public static native boolean getColdStartFromTapOnNotification();
    @Method(selector = "clearStatics")
    public static native void clearStatics();
    @Method(selector = "providesAppNotificationSettings")
    public static native boolean providesAppNotificationSettings();
    @Method(selector = "setProvidesNotificationSettingsView:")
    public static native void setProvidesNotificationSettingsView(boolean providesView);
    @Method(selector = "registerForAPNsToken")
    public static native boolean registerForAPNsToken();
    @Method(selector = "sendPushTokenToDelegate")
    public static native void sendPushTokenToDelegate();
    @Method(selector = "getNotificationTypes:")
    public static native int getNotificationTypes(boolean pushDisabled);
    @Method(selector = "updateNotificationTypes:")
    public static native void updateNotificationTypes(int notificationTypes);
    @Method(selector = "sendNotificationTypesUpdateToDelegate")
    public static native void sendNotificationTypesUpdateToDelegate();
    @Method(selector = "setPushSubscriptionId:")
    public static native void setPushSubscriptionId(String pushSubscriptionId);
    @Method(selector = "handleWillShowInForegroundForNotification:completion:")
    public static native void handleWillShowInForegroundForNotification(OSNotification notification, @Block VoidBlock1<OSNotification> completion);
    @Method(selector = "handleNotificationActionWithUrl:actionID:")
    public static native void handleNotificationAction(String url, String actionID);
    @Method(selector = "clearBadgeCount:fromClearAll:")
    public static native void clearBadgeCount(boolean fromNotifOpened, boolean fromClearAll);
    @Method(selector = "receiveRemoteNotification:UserInfo:completionHandler:")
    public static native boolean receiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    @Method(selector = "notificationReceived:wasOpened:")
    public static native void notificationReceived(NSDictionary<?, ?> messageDict, boolean opened);
    @Method(selector = "handleWillPresentNotificationInForegroundWithPayload:withCompletion:")
    public static native void handleWillPresentNotificationInForeground(NSDictionary<?, ?> payload, @Block VoidBlock1<OSNotification> completion);
    @Method(selector = "didRegisterForRemoteNotifications:deviceToken:")
    public static native void didRegisterForRemoteNotifications(UIApplication app, NSData inDeviceToken);
    @Method(selector = "handleDidFailRegisterForRemoteNotification:")
    public static native void handleDidFailRegisterForRemoteNotification(NSError err);
    @Method(selector = "checkProvisionalAuthorizationStatus")
    public static native void checkProvisionalAuthorizationStatus();
    @Method(selector = "permission")
    public static native boolean permission();
    @Method(selector = "canRequestPermission")
    public static native boolean canRequestPermission();
    @Method(selector = "permissionNative")
    public static native OSNotificationPermission permissionNative();
    @Method(selector = "addForegroundLifecycleListener:")
    public static native void addForegroundLifecycleListener(OSNotificationLifecycleListener listener);
    @Method(selector = "removeForegroundLifecycleListener:")
    public static native void removeForegroundLifecycleListener(OSNotificationLifecycleListener listener);
    @Method(selector = "addClickListener:")
    public static native void addClickListener(OSNotificationClickListener listener);
    @Method(selector = "removeClickListener:")
    public static native void removeClickListener(OSNotificationClickListener listener);
    @Method(selector = "requestPermission:")
    public static native void requestPermission(@Block VoidBooleanBlock block);
    @Method(selector = "requestPermission:fallbackToSettings:")
    public static native void requestPermission(@Block VoidBooleanBlock block, boolean fallback);
    @Method(selector = "registerForProvisionalAuthorization:")
    public static native void registerForProvisionalAuthorization(@Block VoidBooleanBlock block);
    @Method(selector = "addPermissionObserver:")
    public static native void addPermissionObserver(OSNotificationPermissionObserver observer);
    @Method(selector = "removePermissionObserver:")
    public static native void removePermissionObserver(OSNotificationPermissionObserver observer);
    @Method(selector = "clearAll")
    public static native void clearAll();
    /*</methods>*/
}
