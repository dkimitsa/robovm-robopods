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
package org.robovm.pods.firebase.auth;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAuthTokenResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FIRAuthTokenResultPtr extends Ptr<FIRAuthTokenResult, FIRAuthTokenResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAuthTokenResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAuthTokenResult() {}
    protected FIRAuthTokenResult(Handle h, long handle) { super(h, handle); }
    protected FIRAuthTokenResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FIRAuthTokenResult(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "token")
    public native String getToken();
    @Property(selector = "setToken:")
    public native void setToken(String v);
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "setExpirationDate:")
    public native void setExpirationDate(NSDate v);
    @Property(selector = "authDate")
    public native NSDate getAuthDate();
    @Property(selector = "setAuthDate:")
    public native void setAuthDate(NSDate v);
    @Property(selector = "issuedAtDate")
    public native NSDate getIssuedAtDate();
    @Property(selector = "setIssuedAtDate:")
    public native void setIssuedAtDate(NSDate v);
    @Property(selector = "signInProvider")
    public native String getSignInProvider();
    @Property(selector = "setSignInProvider:")
    public native void setSignInProvider(String v);
    @Property(selector = "signInSecondFactor")
    public native String getSignInSecondFactor();
    @Property(selector = "setSignInSecondFactor:")
    public native void setSignInSecondFactor(String v);
    @Property(selector = "claims")
    public native NSDictionary<NSString, ?> getClaims();
    @Property(selector = "setClaims:")
    public native void setClaims(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</methods>*/
}
