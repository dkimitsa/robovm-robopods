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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalNotificationSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalNotificationSettingsPtr extends Ptr<OneSignalNotificationSettings, OneSignalNotificationSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalNotificationSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalNotificationSettings() {}
    protected OneSignalNotificationSettings(Handle h, long handle) { super(h, handle); }
    protected OneSignalNotificationSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getNotificationTypes")
    public native int getNotificationTypes();
    @Method(selector = "getNotificationPermissionState")
    public native OSPermissionStateInternal getNotificationPermissionState();
    @Method(selector = "getNotificationPermissionState:")
    public native void getNotificationPermissionState(@Block VoidBlock1<OSPermissionStateInternal> completionHandler);
    @Method(selector = "promptForNotifications:")
    public native void promptForNotifications(@Block VoidBooleanBlock block);
    @Method(selector = "registerForProvisionalAuthorization:")
    public native void registerForProvisionalAuthorization(@Block VoidBooleanBlock block);
    @Method(selector = "onNotificationPromptResponse:")
    public native void onNotificationPromptResponse(int notificationTypes);
    @Method(selector = "getQueue")
    public static native org.robovm.apple.dispatch.DispatchQueue getQueue();
    /*</methods>*/
}
