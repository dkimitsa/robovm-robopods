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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSRemoteParamController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSRemoteParamControllerPtr extends Ptr<OSRemoteParamController, OSRemoteParamControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSRemoteParamController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSRemoteParamController() {}
    protected OSRemoteParamController(Handle h, long handle) { super(h, handle); }
    protected OSRemoteParamController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "remoteParams")
    public native NSDictionary<?, ?> getRemoteParams();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "saveRemoteParams:")
    public native void saveRemoteParams(NSDictionary<?, ?> params);
    @Method(selector = "hasLocationKey")
    public native boolean hasLocationKey();
    @Method(selector = "hasPrivacyConsentKey")
    public native boolean hasPrivacyConsentKey();
    @Method(selector = "isLocationShared")
    public native boolean isLocationShared();
    @Method(selector = "saveLocationShared:")
    public native void saveLocationShared(boolean shared);
    @Method(selector = "isPrivacyConsentRequired")
    public native boolean isPrivacyConsentRequired();
    @Method(selector = "savePrivacyConsentRequired:")
    public native void savePrivacyConsentRequired(boolean shared);
    @Method(selector = "sharedController")
    public static native OSRemoteParamController sharedController();
    /*</methods>*/
}
