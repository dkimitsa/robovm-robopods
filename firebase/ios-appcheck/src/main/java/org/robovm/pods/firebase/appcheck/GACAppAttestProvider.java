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
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GACAppAttestProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GACAppCheckProvider/*</implements>*/ {

    /*<ptr>*/public static class GACAppAttestProviderPtr extends Ptr<GACAppAttestProvider, GACAppAttestProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GACAppAttestProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GACAppAttestProvider() {}
    protected GACAppAttestProvider(Handle h, long handle) { super(h, handle); }
    protected GACAppAttestProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceName:resourceName:baseURL:APIKey:keychainAccessGroup:requestHooks:")
    public GACAppAttestProvider(String serviceName, String resourceName, String baseURL, String apiKey, String accessGroup, NSArray<?> requestHooks) { super((SkipInit) null); initObject(init(serviceName, resourceName, baseURL, apiKey, accessGroup, requestHooks)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceName:resourceName:baseURL:APIKey:keychainAccessGroup:requestHooks:")
    protected native @Pointer long init(String serviceName, String resourceName, String baseURL, String apiKey, String accessGroup, NSArray<?> requestHooks);
    @Method(selector = "getTokenWithCompletion:")
    public native void getToken(@Block VoidBlock2<GACAppCheckToken, NSError> handler);
    @Method(selector = "getLimitedUseTokenWithCompletion:")
    public native void getLimitedUseToken(@Block VoidBlock2<GACAppCheckToken, NSError> handler);
    /*</methods>*/
}
