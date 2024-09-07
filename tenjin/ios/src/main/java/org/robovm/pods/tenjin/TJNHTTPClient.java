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
package org.robovm.pods.tenjin;

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
import org.robovm.apple.coredata.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.TJNHTTPClient")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TJNHTTPClient/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSURLSessionDelegate, TJNRequestSender/*</implements>*/ {

    /*<ptr>*/public static class TJNHTTPClientPtr extends Ptr<TJNHTTPClient, TJNHTTPClientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TJNHTTPClient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TJNHTTPClient() {}
    protected TJNHTTPClient(Handle h, long handle) { super(h, handle); }
    protected TJNHTTPClient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithApiKey:")
    public TJNHTTPClient(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultPostCompletionBlock")
    public native @Block VoidBlock4<NSData, NSURLResponse, NSError, Boolean> getDefaultPostCompletionBlock();
    @Property(selector = "setDefaultPostCompletionBlock:")
    public native void setDefaultPostCompletionBlock(@Block VoidBlock4<NSData, NSURLResponse, NSError, Boolean> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithApiKey:")
    protected native @Pointer long init(String apiKey);
    @Method(selector = "postWithUrl:body:headers:")
    public native void post(String url, String body, NSDictionary<?, ?> headers);
    @Method(selector = "method:url:body:")
    public native void method(String method, String url, NSMutableString body);
    @Method(selector = "method:url:body:headers:")
    public native void method(String method, String url, String body, NSDictionary<?, ?> headers);
    @Method(selector = "method:url:body:headers:completionBlock:")
    public native void method(String method, String url, String body, NSDictionary<?, ?> headers, @Block VoidBlock4<NSData, NSURLResponse, NSError, Boolean> block);
    @Method(selector = "URLSession:didReceiveChallenge:completionHandler:")
    public native void didReceiveChallenge(NSURLSession session, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "URLSession:didBecomeInvalidWithError:")
    public native void didBecomeInvalid(NSURLSession session, NSError error);
    @Method(selector = "URLSessionDidFinishEventsForBackgroundURLSession:")
    public native void didFinishEvents(NSURLSession session);
    /*</methods>*/
}
