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
package org.robovm.pods.adapty;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty11AdaptyError")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AdaptyError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdaptyErrorPtr extends Ptr<AdaptyError, AdaptyErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AdaptyError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AdaptyError(Handle h, long handle) { super(h, handle); }
    protected AdaptyError(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "originalError")
    public native NSError getOriginalError();
    @Property(selector = "setOriginalError:")
    public native void setOriginalError(NSError v);
    @Property(selector = "adaptyErrorCode")
    public native AdaptyErrorCode getAdaptyErrorCode();
    @Property(selector = "setAdaptyErrorCode:")
    public native void setAdaptyErrorCode(AdaptyErrorCode v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
