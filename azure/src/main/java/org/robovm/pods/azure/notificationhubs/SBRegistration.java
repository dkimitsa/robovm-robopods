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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SBRegistration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SBRegistrationPtr extends Ptr<SBRegistration, SBRegistrationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SBRegistration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SBRegistration() {}
    protected SBRegistration(Handle h, long handle) { super(h, handle); }
    protected SBRegistration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ETag")
    public native String getETag();
    @Property(selector = "setETag:")
    public native void setETag(String v);
    @Property(selector = "expiresAt")
    public native NSDate getExpiresAt();
    @Property(selector = "setExpiresAt:")
    public native void setExpiresAt(NSDate v);
    @Property(selector = "tags")
    public native NSSet<?> getTags();
    @Property(selector = "setTags:")
    public native void setTags(NSSet<?> v);
    @Property(selector = "registrationId")
    public native String getRegistrationId();
    @Property(selector = "setRegistrationId:")
    public native void setRegistrationId(String v);
    @Property(selector = "deviceToken")
    public native String getDeviceToken();
    @Property(selector = "setDeviceToken:")
    public native void setDeviceToken(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "Name")
    public static native String Name();
    @Method(selector = "payloadWithDeviceToken:tags:")
    public static native String getPayload(String deviceToken, NSSet<?> tags);
    /*</methods>*/
}
