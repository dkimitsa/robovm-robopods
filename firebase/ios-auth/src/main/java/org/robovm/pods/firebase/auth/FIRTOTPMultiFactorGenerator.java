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

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRTOTPMultiFactorGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRTOTPMultiFactorGeneratorPtr extends Ptr<FIRTOTPMultiFactorGenerator, FIRTOTPMultiFactorGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRTOTPMultiFactorGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRTOTPMultiFactorGenerator() {}
    protected FIRTOTPMultiFactorGenerator(Handle h, long handle) { super(h, handle); }
    protected FIRTOTPMultiFactorGenerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "generateSecretWithMultiFactorSession:completion:")
    public static native void generateSecret(FIRMultiFactorSession session, @Block VoidBlock2<FIRTOTPSecret, NSError> completion);
    @Method(selector = "assertionForEnrollmentWithSecret:oneTimePassword:")
    public static native FIRTOTPMultiFactorAssertion assertionForEnrollment(FIRTOTPSecret secret, String oneTimePassword);
    @Method(selector = "assertionForSignInWithEnrollmentID:oneTimePassword:")
    public static native FIRTOTPMultiFactorAssertion assertionForSignIn(String enrollmentID, String oneTimePassword);
    /*</methods>*/
}
