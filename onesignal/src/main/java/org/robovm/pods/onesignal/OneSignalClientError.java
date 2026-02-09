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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalClientError/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalClientErrorPtr extends Ptr<OneSignalClientError, OneSignalClientErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalClientError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalClientError() {}
    protected OneSignalClientError(Handle h, long handle) { super(h, handle); }
    protected OneSignalClientError(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCode:message:responseHeaders:response:underlyingError:")
    public OneSignalClientError(@MachineSizedSInt long code, String message, NSDictionary<?, ?> headers, NSDictionary<?, ?> response, NSError error) { super((SkipInit) null); initObject(init(code, message, headers, response, error)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native @MachineSizedSInt long getCode();
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "underlyingError")
    public native NSError getUnderlyingError();
    @Property(selector = "responseHeaders")
    public native NSDictionary<?, ?> getResponseHeaders();
    @Property(selector = "response")
    public native NSDictionary<?, ?> getResponse();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCode:message:responseHeaders:response:underlyingError:")
    protected native @Pointer long init(@MachineSizedSInt long code, String message, NSDictionary<?, ?> headers, NSDictionary<?, ?> response, NSError error);
    /*</methods>*/
}
