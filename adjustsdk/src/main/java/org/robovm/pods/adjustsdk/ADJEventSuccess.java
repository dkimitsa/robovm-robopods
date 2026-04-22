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
package org.robovm.pods.adjustsdk;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJEventSuccess/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADJEventSuccessPtr extends Ptr<ADJEventSuccess, ADJEventSuccessPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJEventSuccess.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJEventSuccess() {}
    protected ADJEventSuccess(Handle h, long handle) { super(h, handle); }
    protected ADJEventSuccess(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "timestamp")
    public native String getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(String v);
    @Property(selector = "adid")
    public native String getAdid();
    @Property(selector = "setAdid:")
    public native void setAdid(String v);
    @Property(selector = "eventToken")
    public native String getEventToken();
    @Property(selector = "setEventToken:")
    public native void setEventToken(String v);
    @Property(selector = "callbackId")
    public native String getCallbackId();
    @Property(selector = "setCallbackId:")
    public native void setCallbackId(String v);
    @Property(selector = "jsonResponse")
    public native NSDictionary<?, ?> getJsonResponse();
    @Property(selector = "setJsonResponse:")
    public native void setJsonResponse(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
