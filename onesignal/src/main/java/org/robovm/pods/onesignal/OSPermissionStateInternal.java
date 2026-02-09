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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSPermissionStateInternal/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSPermissionStateInternalPtr extends Ptr<OSPermissionStateInternal, OSPermissionStateInternalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSPermissionStateInternal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSPermissionStateInternal() {}
    protected OSPermissionStateInternal(Handle h, long handle) { super(h, handle); }
    protected OSPermissionStateInternal(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initAsTo")
    public static OSPermissionStateInternal asTo() {
       OSPermissionStateInternal res = new OSPermissionStateInternal((SkipInit) null);
       res.initObject(res.initAsTo());
       return res;
    }
    @Method(selector = "initAsFrom")
    public static OSPermissionStateInternal asFrom() {
       OSPermissionStateInternal res = new OSPermissionStateInternal((SkipInit) null);
       res.initObject(res.initAsFrom());
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hasPrompted")
    public native boolean hasPrompted();
    @Property(selector = "setHasPrompted:")
    public native void setHasPrompted(boolean v);
    @Property(selector = "providesAppNotificationSettings")
    public native boolean providesAppNotificationSettings();
    @Property(selector = "setProvidesAppNotificationSettings:")
    public native void setProvidesAppNotificationSettings(boolean v);
    @Property(selector = "answeredPrompt")
    public native boolean isAnsweredPrompt();
    @Property(selector = "setAnsweredPrompt:")
    public native void setAnsweredPrompt(boolean v);
    @Property(selector = "accepted")
    public native boolean isAccepted();
    @Property(selector = "setAccepted:")
    public native void setAccepted(boolean v);
    @Property(selector = "provisional")
    public native boolean isProvisional();
    @Property(selector = "setProvisional:")
    public native void setProvisional(boolean v);
    @Property(selector = "ephemeral")
    public native boolean isEphemeral();
    @Property(selector = "setEphemeral:")
    public native void setEphemeral(boolean v);
    @Property(selector = "reachable")
    public native boolean isReachable();
    @Property(selector = "setReachable:")
    public native void setReachable(boolean v);
    @Property(selector = "status")
    public native OSNotificationPermission getStatus();
    @Property(selector = "notificationTypes")
    public native int getNotificationTypes();
    @Property(selector = "setNotificationTypes:")
    public native void setNotificationTypes(int v);
    @Property(selector = "observable")
    public native OSObservable getObservable();
    @Property(selector = "setObservable:")
    public native void setObservable(OSObservable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "persistAsFrom")
    public native void persistAsFrom();
    @Method(selector = "initAsTo")
    protected native @Pointer long initAsTo();
    @Method(selector = "initAsFrom")
    protected native @Pointer long initAsFrom();
    @Method(selector = "getExternalState")
    public native OSPermissionState getExternalState();
    @Method(selector = "jsonRepresentation")
    public native NSDictionary<?, ?> jsonRepresentation();
    /*</methods>*/
}
