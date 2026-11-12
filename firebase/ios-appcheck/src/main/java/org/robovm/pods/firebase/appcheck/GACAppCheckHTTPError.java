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
package org.robovm.pods.firebase.appcheck;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GACAppCheckHTTPError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GACAppCheckHTTPErrorPtr extends Ptr<GACAppCheckHTTPError, GACAppCheckHTTPErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GACAppCheckHTTPError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GACAppCheckHTTPError(Handle h, long handle) { super(h, handle); }
    protected GACAppCheckHTTPError(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHTTPResponse:data:")
    public GACAppCheckHTTPError(NSHTTPURLResponse httpResponse, NSData data) { super((SkipInit) null); initObject(init(httpResponse, data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "httpResponse")
    public native NSHTTPURLResponse getHttpResponse();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHTTPResponse:data:")
    protected native @Pointer long init(NSHTTPURLResponse httpResponse, NSData data);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setUserInfoValueProviderForDomain:provider:")
    public static native void setUserInfoValueProvider(String errorDomain, @Block Block2<NSError, String, NSObject> provider);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInfoValueProviderForDomain:")
    public static native @Block Block2<NSError, String, NSObject> getUserInfoValueProvider(NSError err, String userInfoKey, String errorDomain);
    /*</methods>*/
}
