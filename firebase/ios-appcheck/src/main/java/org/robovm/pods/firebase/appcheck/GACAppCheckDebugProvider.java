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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GACAppCheckDebugProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GACAppCheckProvider/*</implements>*/ {

    /*<ptr>*/public static class GACAppCheckDebugProviderPtr extends Ptr<GACAppCheckDebugProvider, GACAppCheckDebugProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GACAppCheckDebugProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GACAppCheckDebugProvider() {}
    protected GACAppCheckDebugProvider(Handle h, long handle) { super(h, handle); }
    protected GACAppCheckDebugProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceName:resourceName:baseURL:APIKey:requestHooks:")
    public GACAppCheckDebugProvider(String serviceName, String resourceName, String baseURL, String apiKey, NSArray<?> requestHooks) { super((SkipInit) null); initObject(init(serviceName, resourceName, baseURL, apiKey, requestHooks)); }
    @Method(selector = "initWithServiceName:resourceName:baseURL:APIKey:requestHooks:debugToken:")
    public GACAppCheckDebugProvider(String serviceName, String resourceName, String baseURL, String apiKey, NSArray<?> requestHooks, String debugToken) { super((SkipInit) null); initObject(init(serviceName, resourceName, baseURL, apiKey, requestHooks, debugToken)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "debugTokenSource")
    public native GACAppCheckDebugTokenSource getDebugTokenSource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceName:resourceName:baseURL:APIKey:requestHooks:")
    protected native @Pointer long init(String serviceName, String resourceName, String baseURL, String apiKey, NSArray<?> requestHooks);
    @Method(selector = "initWithServiceName:resourceName:baseURL:APIKey:requestHooks:debugToken:")
    protected native @Pointer long init(String serviceName, String resourceName, String baseURL, String apiKey, NSArray<?> requestHooks, String debugToken);
    @Method(selector = "localDebugToken")
    public native String localDebugToken();
    @Method(selector = "currentDebugToken")
    public native String currentDebugToken();
    @Method(selector = "getTokenWithCompletion:")
    public native void getToken(@Block VoidBlock2<GACAppCheckToken, NSError> handler);
    @Method(selector = "getLimitedUseTokenWithCompletion:")
    public native void getLimitedUseToken(@Block VoidBlock2<GACAppCheckToken, NSError> handler);
    /*</methods>*/
}
