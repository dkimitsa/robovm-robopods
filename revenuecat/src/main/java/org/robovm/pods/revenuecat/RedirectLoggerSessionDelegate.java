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
package org.robovm.pods.revenuecat;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("RevenueCat.RedirectLoggerSessionDelegate")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RedirectLoggerSessionDelegate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSURLSessionTaskDelegate/*</implements>*/ {

    /*<ptr>*/public static class RedirectLoggerSessionDelegatePtr extends Ptr<RedirectLoggerSessionDelegate, RedirectLoggerSessionDelegatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RedirectLoggerSessionDelegate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RedirectLoggerSessionDelegate() {}
    protected RedirectLoggerSessionDelegate(Handle h, long handle) { super(h, handle); }
    protected RedirectLoggerSessionDelegate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    public native void willPerformHTTPRedirection(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request, @Block VoidBlock1<NSURLRequest> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "URLSession:didCreateTask:")
    public native void didCreateTask(NSURLSession session, NSURLSessionTask task);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "URLSession:task:willBeginDelayedRequest:completionHandler:")
    public native void willBeginDelayedRequest(NSURLSession session, NSURLSessionTask task, NSURLRequest request, @Block VoidBlock2<NSURLSessionDelayedRequestDisposition, NSURLRequest> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "URLSession:taskIsWaitingForConnectivity:")
    public native void taskIsWaitingForConnectivity(NSURLSession session, NSURLSessionTask task);
    @Method(selector = "URLSession:task:didReceiveChallenge:completionHandler:")
    public native void didReceiveChallenge(NSURLSession session, NSURLSessionTask task, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "URLSession:task:needNewBodyStream:")
    public native void needNewBodyStream(NSURLSession session, NSURLSessionTask task, @Block VoidBlock1<NSInputStream> completionHandler);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "URLSession:task:needNewBodyStreamFromOffset:completionHandler:")
    public native void needNewBodyStream(NSURLSession session, NSURLSessionTask task, long offset, @Block VoidBlock1<NSInputStream> completionHandler);
    @Method(selector = "URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    public native void didSendBodyData(NSURLSession session, NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "URLSession:task:didReceiveInformationalResponse:")
    public native void didReceiveInformationalResponse(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "URLSession:task:didFinishCollectingMetrics:")
    public native void didFinishCollectingMetrics(NSURLSession session, NSURLSessionTask task, NSURLSessionTaskMetrics metrics);
    @Method(selector = "URLSession:task:didCompleteWithError:")
    public native void didComplete(NSURLSession session, NSURLSessionTask task, NSError error);
    @Method(selector = "URLSession:didBecomeInvalidWithError:")
    public native void didBecomeInvalid(NSURLSession session, NSError error);
    @Method(selector = "URLSession:didReceiveChallenge:completionHandler:")
    public native void didReceiveChallenge(NSURLSession session, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "URLSessionDidFinishEventsForBackgroundURLSession:")
    public native void didFinishEvents(NSURLSession session);
    /*</methods>*/
}
