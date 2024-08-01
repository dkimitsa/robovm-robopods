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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRPhoneAuthProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRPhoneAuthProviderPtr extends Ptr<FIRPhoneAuthProvider, FIRPhoneAuthProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRPhoneAuthProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRPhoneAuthProvider() {}
    protected FIRPhoneAuthProvider(Handle h, long handle) { super(h, handle); }
    protected FIRPhoneAuthProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FIRPhoneAuthProviderID", optional=true)
    public static native NSString getProviderID();
    
    @Method(selector = "verifyPhoneNumber:UIDelegate:completion:")
    public native void verifyPhoneNumber(String phoneNumber, FIRAuthUIDelegate uiDelegate, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "verifyPhoneNumber:UIDelegate:multiFactorSession:completion:")
    public native void verifyPhoneNumber(String phoneNumber, FIRAuthUIDelegate uiDelegate, FIRMultiFactorSession multiFactorSession, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "verifyPhoneNumberWithMultiFactorInfo:UIDelegate:multiFactorSession:completion:")
    public native void verifyPhoneNumber(FIRPhoneMultiFactorInfo multiFactorInfo, FIRAuthUIDelegate uiDelegate, FIRMultiFactorSession multiFactorSession, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "credentialWithVerificationID:verificationCode:")
    public native FIRPhoneAuthCredential getCredential(String verificationID, String verificationCode);
    @Method(selector = "id")
    public static native String id();
    @Method(selector = "provider")
    public static native FIRPhoneAuthProvider create();
    @Method(selector = "providerWithAuth:")
    public static native FIRPhoneAuthProvider create(FIRAuth auth);
    /*</methods>*/
}
