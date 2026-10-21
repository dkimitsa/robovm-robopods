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
package org.robovm.pods.firebase.googlesignin;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTMSessionFetcherService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GTMSessionFetcherServiceProtocol/*</implements>*/ {

    /*<ptr>*/public static class GTMSessionFetcherServicePtr extends Ptr<GTMSessionFetcherService, GTMSessionFetcherServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTMSessionFetcherService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTMSessionFetcherService() {}
    protected GTMSessionFetcherService(Handle h, long handle) { super(h, handle); }
    protected GTMSessionFetcherService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delayedFetchersByHost")
    public native NSDictionary<NSString, NSArray> getDelayedFetchersByHost();
    @Property(selector = "runningFetchersByHost")
    public native NSDictionary<NSString, NSArray> getRunningFetchersByHost();
    @Property(selector = "maxRunningFetchersPerHost")
    public native @MachineSizedUInt long getMaxRunningFetchersPerHost();
    @Property(selector = "setMaxRunningFetchersPerHost:")
    public native void setMaxRunningFetchersPerHost(@MachineSizedUInt long v);
    @Property(selector = "configuration")
    public native NSURLSessionConfiguration getConfiguration();
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(NSURLSessionConfiguration v);
    @Property(selector = "configurationBlock")
    public native @Block VoidBlock2<GTMSessionFetcher, NSURLSessionConfiguration> getConfigurationBlock();
    @Property(selector = "setConfigurationBlock:")
    public native void setConfigurationBlock(@Block VoidBlock2<GTMSessionFetcher, NSURLSessionConfiguration> v);
    @Property(selector = "cookieStorage")
    public native NSHTTPCookieStorage getCookieStorage();
    @Property(selector = "setCookieStorage:")
    public native void setCookieStorage(NSHTTPCookieStorage v);
    @Property(selector = "callbackQueue")
    public native DispatchQueue getCallbackQueue();
    @Property(selector = "setCallbackQueue:")
    public native void setCallbackQueue(DispatchQueue v);
    @Property(selector = "challengeBlock")
    public native @Block("(,,@Block)") VoidBlock3<GTMSessionFetcher, NSURLAuthenticationChallenge, VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential>> getChallengeBlock();
    @Property(selector = "setChallengeBlock:")
    public native void setChallengeBlock(@Block("(,,@Block)") VoidBlock3<GTMSessionFetcher, NSURLAuthenticationChallenge, VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential>> v);
    @Property(selector = "credential")
    public native NSURLCredential getCredential();
    @Property(selector = "setCredential:")
    public native void setCredential(NSURLCredential v);
    @Property(selector = "proxyCredential")
    public native NSURLCredential getProxyCredential();
    @Property(selector = "setProxyCredential:")
    public native void setProxyCredential(NSURLCredential v);
    @Property(selector = "allowedInsecureSchemes")
    public native NSArray<NSString> getAllowedInsecureSchemes();
    @Property(selector = "setAllowedInsecureSchemes:")
    public native void setAllowedInsecureSchemes(NSArray<NSString> v);
    @Property(selector = "allowLocalhostRequest")
    public native boolean isAllowLocalhostRequest();
    @Property(selector = "setAllowLocalhostRequest:")
    public native void setAllowLocalhostRequest(boolean v);
    @Property(selector = "allowInvalidServerCertificates")
    public native boolean isAllowInvalidServerCertificates();
    @Property(selector = "setAllowInvalidServerCertificates:")
    public native void setAllowInvalidServerCertificates(boolean v);
    @Property(selector = "isRetryEnabled")
    public native boolean isRetryEnabled();
    @Property(selector = "setRetryEnabled:")
    public native void setRetryEnabled(boolean v);
    @Property(selector = "retryBlock")
    public native @Block("(,,@Block)") VoidBlock3<Boolean, NSError, VoidBooleanBlock> getRetryBlock();
    @Property(selector = "setRetryBlock:")
    public native void setRetryBlock(@Block("(,,@Block)") VoidBlock3<Boolean, NSError, VoidBooleanBlock> v);
    @Property(selector = "maxRetryInterval")
    public native double getMaxRetryInterval();
    @Property(selector = "setMaxRetryInterval:")
    public native void setMaxRetryInterval(double v);
    @Property(selector = "minRetryInterval")
    public native double getMinRetryInterval();
    @Property(selector = "setMinRetryInterval:")
    public native void setMinRetryInterval(double v);
    @Property(selector = "properties")
    public native NSDictionary<NSString, ?> getProperties();
    @Property(selector = "setProperties:")
    public native void setProperties(NSDictionary<NSString, ?> v);
    @Property(selector = "metricsCollectionBlock")
    public native @Block VoidBlock1<NSURLSessionTaskMetrics> getMetricsCollectionBlock();
    @Property(selector = "setMetricsCollectionBlock:")
    public native void setMetricsCollectionBlock(@Block VoidBlock1<NSURLSessionTaskMetrics> v);
    @Property(selector = "stopFetchingTriggersCompletionHandler")
    public native boolean isStopFetchingTriggersCompletionHandler();
    @Property(selector = "setStopFetchingTriggersCompletionHandler:")
    public native void setStopFetchingTriggersCompletionHandler(boolean v);
    @Property(selector = "skipBackgroundTask")
    public native boolean isSkipBackgroundTask();
    @Property(selector = "setSkipBackgroundTask:")
    public native void setSkipBackgroundTask(boolean v);
    @Property(selector = "userAgentProvider")
    public native GTMUserAgentProvider getUserAgentProvider();
    @Property(selector = "setUserAgentProvider:")
    public native void setUserAgentProvider(GTMUserAgentProvider v);
    @Property(selector = "userAgent")
    public native String getUserAgent();
    @Property(selector = "setUserAgent:")
    public native void setUserAgent(String v);
    @Property(selector = "authorizer")
    public native GTMFetcherAuthorizationProtocol getAuthorizer();
    @Property(selector = "setAuthorizer:")
    public native void setAuthorizer(GTMFetcherAuthorizationProtocol v);
    @Property(selector = "delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @Property(selector = "sessionDelegateQueue")
    public native NSOperationQueue getSessionDelegateQueue();
    @Property(selector = "setSessionDelegateQueue:")
    public native void setSessionDelegateQueue(NSOperationQueue v);
    @Property(selector = "reuseSession")
    public native boolean isReuseSession();
    @Property(selector = "setReuseSession:")
    public native void setReuseSession(boolean v);
    @Property(selector = "unusedSessionTimeout")
    public native double getUnusedSessionTimeout();
    @Property(selector = "setUnusedSessionTimeout:")
    public native void setUnusedSessionTimeout(double v);
    @Property(selector = "decorators")
    public native NSArray<?> getDecorators();
    @Property(selector = "testBlock")
    public native @Block("(,@Block)") VoidBlock2<GTMSessionFetcher, VoidBlock3<NSHTTPURLResponse, NSData, NSError>> getTestBlock();
    @Property(selector = "setTestBlock:")
    public native void setTestBlock(@Block("(,@Block)") VoidBlock2<GTMSessionFetcher, VoidBlock3<NSHTTPURLResponse, NSData, NSError>> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "resetSession")
    public native void resetSession();
    @Method(selector = "setConcurrentCallbackQueue:")
    public native void setConcurrentCallbackQueue(DispatchQueue queue);
    @Method(selector = "fetcherWithRequest:")
    public native GTMSessionFetcher getFetcher(NSURLRequest request);
    @Method(selector = "fetcherWithURL:")
    public native GTMSessionFetcher getFetcher(NSURL requestURL);
    @Method(selector = "fetcherWithURLString:")
    public native GTMSessionFetcher getFetcher(String requestURLString);
    @Method(selector = "fetcherWithRequest:fetcherClass:")
    public native NSObject getFetcher(NSURLRequest request, Class<?> fetcherClass);
    @Method(selector = "isDelayingFetcher:")
    public native boolean isDelayingFetcher(GTMSessionFetcher fetcher);
    @Method(selector = "numberOfFetchers")
    public native @MachineSizedUInt long numberOfFetchers();
    @Method(selector = "numberOfRunningFetchers")
    public native @MachineSizedUInt long numberOfRunningFetchers();
    @Method(selector = "numberOfDelayedFetchers")
    public native @MachineSizedUInt long numberOfDelayedFetchers();
    @Method(selector = "issuedFetchers")
    public native NSArray<GTMSessionFetcher> issuedFetchers();
    @Method(selector = "issuedFetchersWithRequestURL:")
    public native NSArray<GTMSessionFetcher> issuedFetchers(NSURL requestURL);
    @Method(selector = "stopAllFetchers")
    public native void stopAllFetchers();
    @Method(selector = "addDecorator:")
    public native void addDecorator(GTMFetcherDecoratorProtocol decorator);
    @Method(selector = "removeDecorator:")
    public native void removeDecorator(GTMFetcherDecoratorProtocol decorator);
    @Method(selector = "fetcherShouldBeginFetching:")
    public native boolean fetcherShouldBeginFetching(GTMSessionFetcher fetcher);
    @Method(selector = "fetcherDidBeginFetching:")
    public native void fetcherDidBeginFetching(GTMSessionFetcher fetcher);
    @Method(selector = "fetcherDidStop:")
    public native void fetcherDidStop(GTMSessionFetcher fetcher);
    /**
     * @deprecated Use XCTestExpectation instead
     */
    @Deprecated
    @Method(selector = "waitForCompletionOfAllFetchersWithTimeout:")
    public native boolean waitForCompletionOfAllFetchers(double timeoutInSeconds);
    @Method(selector = "mockFetcherServiceWithFakedData:fakedError:")
    public static native GTMSessionFetcherService mockFetcherService(NSData fakedDataOrNil, NSError fakedErrorOrNil);
    @Method(selector = "mockFetcherServiceWithFakedData:fakedResponse:fakedError:")
    public static native GTMSessionFetcherService mockFetcherService(NSData fakedDataOrNil, NSHTTPURLResponse fakedResponse, NSError fakedErrorOrNil);
    /*</methods>*/
}
