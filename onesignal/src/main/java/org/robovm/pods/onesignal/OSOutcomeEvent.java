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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSOutcomeEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSJSONEncodable/*</implements>*/ {

    /*<ptr>*/public static class OSOutcomeEventPtr extends Ptr<OSOutcomeEvent, OSOutcomeEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSOutcomeEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSOutcomeEvent() {}
    protected OSOutcomeEvent(Handle h, long handle) { super(h, handle); }
    protected OSOutcomeEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSession:notificationIds:name:timestamp:weight:")
    public OSOutcomeEvent(OSInfluenceType session, NSArray<?> notificationIds, String name, NSNumber timestamp, NSNumber value) { super((SkipInit) null); initObject(init(session, notificationIds, name, timestamp, value)); }
    @Method(selector = "initFromOutcomeEventParams:")
    public OSOutcomeEvent(OSOutcomeEventParams eventParams) { super((SkipInit) null); initObject(initFromOutcomeEventParams(eventParams)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "session")
    public native OSInfluenceType getSession();
    @Property(selector = "setSession:")
    public native void setSession(OSInfluenceType v);
    @Property(selector = "notificationIds")
    public native NSArray<?> getNotificationIds();
    @Property(selector = "setNotificationIds:")
    public native void setNotificationIds(NSArray<?> v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "timestamp")
    public native NSNumber getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(NSNumber v);
    @Property(selector = "weight")
    public native NSDecimalNumber getWeight();
    @Property(selector = "setWeight:")
    public native void setWeight(NSDecimalNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "jsonRepresentation")
    public native NSDictionary<?, ?> jsonRepresentation();
    @Method(selector = "initWithSession:notificationIds:name:timestamp:weight:")
    protected native @Pointer long init(OSInfluenceType session, NSArray<?> notificationIds, String name, NSNumber timestamp, NSNumber value);
    @Method(selector = "initFromOutcomeEventParams:")
    protected native @Pointer long initFromOutcomeEventParams(OSOutcomeEventParams eventParams);
    /*</methods>*/
}
