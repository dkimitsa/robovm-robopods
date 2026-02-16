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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtCC13OneSignalUser24OneSignalUserManagerImpl22OSPushSubscriptionImpl")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSPushSubscriptionImpl/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSPushSubscription/*</implements>*/ {

    /*<ptr>*/public static class OSPushSubscriptionImplPtr extends Ptr<OSPushSubscriptionImpl, OSPushSubscriptionImplPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSPushSubscriptionImpl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected OSPushSubscriptionImpl() {}
    protected OSPushSubscriptionImpl(Handle h, long handle) { super(h, handle); }
    protected OSPushSubscriptionImpl(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native String getId();
    @Property(selector = "token")
    public native String getToken();
    @Property(selector = "optedIn")
    public native boolean isOptedIn();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addObserver:")
    public native void addObserver(OSPushSubscriptionObserver observer);
    @Method(selector = "removeObserver:")
    public native void removeObserver(OSPushSubscriptionObserver observer);
    @Method(selector = "optIn")
    public native void optIn();
    @Method(selector = "optOut")
    public native void optOut();
    /*</methods>*/
}
