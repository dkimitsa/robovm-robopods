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
package org.robovm.pods.appcenter.push;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSPush/*</name>*/ 
    extends /*<extends>*/MSServiceAbstract/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSPushPtr extends Ptr<MSPush, MSPushPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSPush.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSPush() {}
    protected MSPush(Handle h, long handle) { super(h, handle); }
    protected MSPush(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "didRegisterForRemoteNotificationsWithDeviceToken:")
    public static native void didRegisterForRemoteNotifications(NSData deviceToken);
    @Method(selector = "didFailToRegisterForRemoteNotificationsWithError:")
    public static native void didFailToRegisterForRemoteNotifications(NSError error);
    @Method(selector = "didReceiveRemoteNotification:")
    public static native boolean didReceiveRemoteNotification(NSDictionary<?, ?> userInfo);
    @Method(selector = "setDelegate:")
    public static native void setDelegate(MSPushDelegate delegate);
    /*</methods>*/
}