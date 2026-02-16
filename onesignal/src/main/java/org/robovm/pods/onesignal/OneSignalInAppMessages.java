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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalInAppMessages/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSInAppMessages/*</implements>*/ {

    /*<ptr>*/public static class OneSignalInAppMessagesPtr extends Ptr<OneSignalInAppMessages, OneSignalInAppMessagesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalInAppMessages.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalInAppMessages() {}
    protected OneSignalInAppMessages(Handle h, long handle) { super(h, handle); }
    protected OneSignalInAppMessages(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "InAppMessages")
    public static native Class<?> InAppMessages();
    @Method(selector = "start")
    public static native void start();
    @Method(selector = "getInAppMessagesFromServer:")
    public static native void getInAppMessagesFromServer(String subscriptionId);
    @Method(selector = "onApplicationDidBecomeActive")
    public static native void onApplicationDidBecomeActive();
    @Method(selector = "migrate")
    public static native void migrate();
    @Method(selector = "addTrigger:withValue:")
    public static native void addTrigger(String key, String value);
    @Method(selector = "addTriggers:")
    public static native void addTriggers(NSDictionary<NSString, NSString> triggers);
    @Method(selector = "removeTrigger:")
    public static native void removeTrigger(String key);
    @Method(selector = "removeTriggers:")
    public static native void removeTriggers(NSArray<NSString> keys);
    @Method(selector = "clearTriggers")
    public static native void clearTriggers();
    @Method(selector = "paused")
    public static native boolean paused();
    @Method(selector = "paused:")
    public static native void paused(boolean pause);
    @Method(selector = "addClickListener:")
    public static native void addClickListener(OSInAppMessageClickListener listener);
    @Method(selector = "removeClickListener:")
    public static native void removeClickListener(OSInAppMessageClickListener listener);
    @Method(selector = "addLifecycleListener:")
    public static native void addLifecycleListener(OSInAppMessageLifecycleListener listener);
    @Method(selector = "removeLifecycleListener:")
    public static native void removeLifecycleListener(OSInAppMessageLifecycleListener listener);
    /*</methods>*/
}
