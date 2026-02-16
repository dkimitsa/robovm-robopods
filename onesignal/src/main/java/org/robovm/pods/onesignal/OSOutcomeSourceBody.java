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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSOutcomeSourceBody/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSOutcomeSourceBodyPtr extends Ptr<OSOutcomeSourceBody, OSOutcomeSourceBodyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSOutcomeSourceBody.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSOutcomeSourceBody() {}
    protected OSOutcomeSourceBody(Handle h, long handle) { super(h, handle); }
    protected OSOutcomeSourceBody(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNotificationIds:inAppMessagesIds:")
    public OSOutcomeSourceBody(NSArray<?> notificationIds, NSArray<?> inAppMessagesIds) { super((SkipInit) null); initObject(init(notificationIds, inAppMessagesIds)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "notificationIds")
    public native NSArray<?> getNotificationIds();
    @Property(selector = "setNotificationIds:")
    public native void setNotificationIds(NSArray<?> v);
    @Property(selector = "inAppMessagesIds")
    public native NSArray<?> getInAppMessagesIds();
    @Property(selector = "setInAppMessagesIds:")
    public native void setInAppMessagesIds(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNotificationIds:inAppMessagesIds:")
    protected native @Pointer long init(NSArray<?> notificationIds, NSArray<?> inAppMessagesIds);
    @Method(selector = "toDictionaryObject")
    public native NSDictionary<?, ?> toDictionaryObject();
    /*</methods>*/
}
