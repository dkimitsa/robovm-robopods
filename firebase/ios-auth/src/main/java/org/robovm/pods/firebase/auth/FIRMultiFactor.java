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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRMultiFactor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FIRMultiFactorPtr extends Ptr<FIRMultiFactor, FIRMultiFactorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRMultiFactor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRMultiFactor() {}
    protected FIRMultiFactor(Handle h, long handle) { super(h, handle); }
    protected FIRMultiFactor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FIRMultiFactor(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enrolledFactors")
    public native NSArray<FIRMultiFactorInfo> getEnrolledFactors();
    @Property(selector = "setEnrolledFactors:")
    public native void setEnrolledFactors(NSArray<FIRMultiFactorInfo> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FIRPhoneMultiFactorID", optional=true)
    public static native String getPhoneFactorID();
    @GlobalValue(symbol="FIRTOTPMultiFactorID", optional=true)
    public static native String getTOTPFactorID();
    
    @Method(selector = "getSessionWithCompletion:")
    public native void getSession(@Block VoidBlock2<FIRMultiFactorSession, NSError> completion);
    @Method(selector = "enrollWithAssertion:displayName:completion:")
    public native void enroll(FIRMultiFactorAssertion assertion, String displayName, @Block VoidBlock1<NSError> completion);
    @Method(selector = "unenrollWithInfo:completion:")
    public native void unenroll(FIRMultiFactorInfo factorInfo, @Block VoidBlock1<NSError> completion);
    @Method(selector = "unenrollWithFactorUID:completion:")
    public native void unenroll(String factorUID, @Block VoidBlock1<NSError> completion);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</methods>*/
}
