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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISErrorPtr extends Ptr<ISError, ISErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISError.class); }/*</bind>*/
    /*<constants>*/
    public static class Consts {
        public static final String OnlyCharacterNumbers = "- should contain only english characters and numbers";
        public static final String Length5to10 = "- length should be between 5-10 characters";
        public static final String AppKey = "appKey";
        public static final String UserId = "UserId";
        public static final String ForSS = "for IronSource";
    }
    /*</constants>*/
    /*<constructors>*/
    protected ISError(Handle h, long handle) { super(h, handle); }
    protected ISError(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDomain:code:userInfo:")
    public ISError(String domain, @MachineSizedSInt long code, NSErrorUserInfo dict) { super(domain, code, dict); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "prefix")
    public native String getPrefix();
    @Property(selector = "setPrefix:")
    public native void setPrefix(String v);
    @Property(selector = "suffix")
    public native String getSuffix();
    @Property(selector = "setSuffix:")
    public native void setSuffix(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createError:")
    public static native NSError createError(ISErrorCode errorCode);
    @Method(selector = "createError:withParams:")
    public static native NSError createError(ISErrorCode errorCode, NSArray<?> params);
    @Method(selector = "createError:withMessage:")
    public static native NSError createError(ISErrorCode errorCode, String message);
    @Method(selector = "createErrorWithDomain:code:message:")
    public static native NSError createError(String domain, ISErrorCode code, String message);
    @Method(selector = "appendError:withPrefix:")
    public static native NSError appendErrorWithPrefix(NSError error, String prefix);
    @Method(selector = "appendError:withSuffix:")
    public static native NSError appendErrorWithSuffix(NSError error, String suffix);
    @Method(selector = "getCode:")
    public static native ISErrorCode getCode(ISErrorCode errorCode);
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
