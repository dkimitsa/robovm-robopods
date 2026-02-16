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
package org.robovm.pods.azure.notificationhubs;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSNotificationHub/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSNotificationHubPtr extends Ptr<MSNotificationHub, MSNotificationHubPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSNotificationHub.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSNotificationHub() {}
    protected MSNotificationHub(Handle h, long handle) { super(h, handle); }
    protected MSNotificationHub(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startWithConnectionString:hubName:")
    public static native void start(String connectionString, String notificationHubName);
    @Method(selector = "startWithConnectionString:hubName:options:")
    public static native void start(String connectionString, String notificationHubName, MSNotificationHubOptions options);
    @Method(selector = "startWithInstallationManagement:")
    public static native void start(MSInstallationManagementDelegate managementDelegate);
    @Method(selector = "startWithInstallationManagement:options:")
    public static native void start(MSInstallationManagementDelegate managementDelegate, MSNotificationHubOptions options);
    @Method(selector = "didRegisterForRemoteNotificationsWithDeviceToken:")
    public static native void didRegisterForRemoteNotifications(NSData deviceToken);
    @Method(selector = "didFailToRegisterForRemoteNotificationsWithError:")
    public static native void didFailToRegisterForRemoteNotifications(NSError error);
    @Method(selector = "didReceiveRemoteNotification:")
    public static native void didReceiveRemoteNotification(NSDictionary<?, ?> userInfo);
    @Method(selector = "setDelegate:")
    public static native void setDelegate(MSNotificationHubDelegate delegate);
    @Method(selector = "isEnabled")
    public static native boolean isEnabled();
    @Method(selector = "setEnabled:")
    public static native void setEnabled(boolean isEnabled);
    @Method(selector = "willSaveInstallation")
    public static native void willSaveInstallation();
    @Method(selector = "getPushChannel")
    public static native String getPushChannel();
    @Method(selector = "getInstallationId")
    public static native String getInstallationId();
    @Method(selector = "addTag:")
    public static native boolean addTag(String tag);
    @Method(selector = "addTags:")
    public static native boolean addTags(NSArray<NSString> tags);
    @Method(selector = "removeTag:")
    public static native boolean removeTag(String tag);
    @Method(selector = "removeTags:")
    public static native boolean removeTags(NSArray<NSString> tags);
    @Method(selector = "getTags")
    public static native NSArray<NSString> getTags();
    @Method(selector = "clearTags")
    public static native void clearTags();
    @Method(selector = "setTemplate:forKey:")
    public static native boolean setTemplate(MSInstallationTemplate template, String key);
    @Method(selector = "removeTemplateForKey:")
    public static native boolean removeTemplateForKey(String key);
    @Method(selector = "getTemplateForKey:")
    public static native MSInstallationTemplate getTemplateForKey(String key);
    @Method(selector = "getTemplates")
    public static native NSDictionary<NSString, MSInstallationTemplate> getTemplates();
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "getUserId")
    public static native String getUserId();
    @Method(selector = "setEnrichmentDelegate:")
    public static native void setEnrichmentDelegate(MSInstallationEnrichmentDelegate enrichmentDelegate);
    @Method(selector = "setLifecycleDelegate:")
    public static native void setLifecycleDelegate(MSInstallationLifecycleDelegate lifecycleDelegate);
    /*</methods>*/
}
