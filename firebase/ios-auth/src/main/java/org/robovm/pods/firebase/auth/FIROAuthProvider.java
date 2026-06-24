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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIROAuthProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FIRFederatedAuthProvider/*</implements>*/ {

    /*<ptr>*/public static class FIROAuthProviderPtr extends Ptr<FIROAuthProvider, FIROAuthProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIROAuthProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIROAuthProvider() {}
    protected FIROAuthProvider(Handle h, long handle) { super(h, handle); }
    protected FIROAuthProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scopes")
    public native NSArray<NSString> getScopes();
    @Property(selector = "setScopes:")
    public native void setScopes(NSArray<NSString> v);
    @Property(selector = "customParameters")
    public native NSDictionary<NSString, NSString> getCustomParameters();
    @Property(selector = "setCustomParameters:")
    public native void setCustomParameters(NSDictionary<NSString, NSString> v);
    @Property(selector = "providerID")
    public native String getProviderID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "getCredentialWithUIDelegate:completion:")
    public native void getCredential(FIRAuthUIDelegate uiDelegate, @Block VoidBlock2<FIRAuthCredential, NSError> completionHandler);
    @Method(selector = "id")
    public static native String id();
    @Method(selector = "providerWithProviderID:")
    public static native FIROAuthProvider create(String providerID);
    @Method(selector = "providerWithProviderID:auth:")
    public static native FIROAuthProvider create(String providerID, FIRAuth auth);
    @Method(selector = "credentialWithProviderID:IDToken:accessToken:")
    public static native FIROAuthCredential createUsingIDTokenAccessToken(String providerID, String idToken, String accessToken);
    @Method(selector = "credentialWithProviderID:accessToken:")
    public static native FIROAuthCredential createUsingAccessToken(String providerID, String accessToken);
    @Method(selector = "credentialWithProviderID:IDToken:rawNonce:accessToken:")
    public static native FIROAuthCredential createUsingIDToken(String providerID, String idToken, String rawNonce, String accessToken);
    @Method(selector = "credentialWithProviderID:IDToken:rawNonce:")
    public static native FIROAuthCredential createUsingIDToken(String providerID, String idToken, String rawNonce);
    @Method(selector = "appleCredentialWithIDToken:rawNonce:fullName:")
    public static native FIROAuthCredential appleCredential(String idToken, String rawNonce, NSPersonNameComponents fullName);
    /*</methods>*/
}
