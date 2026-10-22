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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTMSessionFetcher/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSURLSessionDelegate/*</implements>*/ {

    /*<ptr>*/public static class GTMSessionFetcherPtr extends Ptr<GTMSessionFetcher, GTMSessionFetcherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTMSessionFetcher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTMSessionFetcher() {}
    protected GTMSessionFetcher(Handle h, long handle) { super(h, handle); }
    protected GTMSessionFetcher(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRequest:configuration:")
    public GTMSessionFetcher(NSURLRequest request, NSURLSessionConfiguration configuration) { super((SkipInit) null); initObject(init(request, configuration)); }
    public GTMSessionFetcher(NSURLRequest request) { super((Handle) null, create(request)); retain(getHandle()); }
    public GTMSessionFetcher(NSURL requestURL) { super((Handle) null, create(requestURL)); retain(getHandle()); }
    public GTMSessionFetcher(NSData resumeData) { super((Handle) null, create(resumeData)); retain(getHandle()); }
    public GTMSessionFetcher(String sessionIdentifier) { super((Handle) null, create(sessionIdentifier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "request")
    public native NSURLRequest getRequest();
    @Property(selector = "setRequest:")
    public native void setRequest(NSURLRequest v);
    @Property(selector = "downloadResumeData")
    public native NSData getDownloadResumeData();
    @Property(selector = "configuration")
    public native NSURLSessionConfiguration getConfiguration();
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(NSURLSessionConfiguration v);
    @Property(selector = "configurationBlock")
    public native @Block VoidBlock2<GTMSessionFetcher, NSURLSessionConfiguration> getConfigurationBlock();
    @Property(selector = "setConfigurationBlock:")
    public native void setConfigurationBlock(@Block VoidBlock2<GTMSessionFetcher, NSURLSessionConfiguration> v);
    @Property(selector = "session")
    public native NSURLSession getSession();
    @Property(selector = "setSession:")
    public native void setSession(NSURLSession v);
    @Property(selector = "sessionTask")
    public native NSURLSessionTask getSessionTask();
    @Property(selector = "sessionIdentifier")
    public native String getSessionIdentifier();
    @Property(selector = "wasCreatedFromBackgroundSession")
    public native boolean isWasCreatedFromBackgroundSession();
    @Property(selector = "clientWillReconnectBackgroundSession")
    public native boolean isClientWillReconnectBackgroundSession();
    @Property(selector = "setClientWillReconnectBackgroundSession:")
    public native void setClientWillReconnectBackgroundSession(boolean v);
    @Property(selector = "sessionUserInfo")
    public native NSDictionary<NSString, NSString> getSessionUserInfo();
    @Property(selector = "setSessionUserInfo:")
    public native void setSessionUserInfo(NSDictionary<NSString, NSString> v);
    @Property(selector = "taskDescription")
    public native String getTaskDescription();
    @Property(selector = "setTaskDescription:")
    public native void setTaskDescription(String v);
    @Property(selector = "taskPriority")
    public native float getTaskPriority();
    @Property(selector = "setTaskPriority:")
    public native void setTaskPriority(float v);
    @Property(selector = "userAgentProvider")
    public native GTMUserAgentProvider getUserAgentProvider();
    @Property(selector = "setUserAgentProvider:")
    public native void setUserAgentProvider(GTMUserAgentProvider v);
    @Property(selector = "useBackgroundSession")
    public native boolean isUseBackgroundSession();
    @Property(selector = "setUseBackgroundSession:")
    public native void setUseBackgroundSession(boolean v);
    @Property(selector = "isUsingBackgroundSession")
    public native boolean isUsingBackgroundSession();
    @Property(selector = "useUploadTask")
    public native boolean isUseUploadTask();
    @Property(selector = "setUseUploadTask:")
    public native void setUseUploadTask(boolean v);
    @Property(selector = "canShareSession")
    public native boolean canShareSession();
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
    @Property(selector = "cookieStorage")
    public native NSHTTPCookieStorage getCookieStorage();
    @Property(selector = "setCookieStorage:")
    public native void setCookieStorage(NSHTTPCookieStorage v);
    @Property(selector = "credential")
    public native NSURLCredential getCredential();
    @Property(selector = "setCredential:")
    public native void setCredential(NSURLCredential v);
    @Property(selector = "proxyCredential")
    public native NSURLCredential getProxyCredential();
    @Property(selector = "setProxyCredential:")
    public native void setProxyCredential(NSURLCredential v);
    @Property(selector = "bodyData")
    public native NSData getBodyData();
    @Property(selector = "setBodyData:")
    public native void setBodyData(NSData v);
    @Property(selector = "bodyFileURL")
    public native NSURL getBodyFileURL();
    @Property(selector = "setBodyFileURL:")
    public native void setBodyFileURL(NSURL v);
    @Property(selector = "bodyLength")
    public native long getBodyLength();
    @Property(selector = "bodyStreamProvider")
    public native @Block("(@Block)") VoidBlock1<VoidBlock1<NSInputStream>> getBodyStreamProvider();
    @Property(selector = "setBodyStreamProvider:")
    public native void setBodyStreamProvider(@Block("(@Block)") VoidBlock1<VoidBlock1<NSInputStream>> v);
    @Property(selector = "authorizer")
    public native GTMFetcherAuthorizationProtocol getAuthorizer();
    @Property(selector = "setAuthorizer:")
    public native void setAuthorizer(GTMFetcherAuthorizationProtocol v);
    @Property(selector = "service")
    public native GTMSessionFetcherService getService();
    @Property(selector = "setService:")
    public native void setService(GTMSessionFetcherService v);
    @Property(selector = "serviceHost")
    public native String getServiceHost();
    @Property(selector = "setServiceHost:")
    public native void setServiceHost(String v);
    @Property(selector = "servicePriority")
    public native @MachineSizedSInt long getServicePriority();
    @Property(selector = "setServicePriority:")
    public native void setServicePriority(@MachineSizedSInt long v);
    @Property(selector = "didReceiveResponseBlock")
    public native @Block("(,@Block)") VoidBlock2<NSURLResponse, VoidBlock1<NSURLSessionResponseDisposition>> getDidReceiveResponseBlock();
    @Property(selector = "setDidReceiveResponseBlock:")
    public native void setDidReceiveResponseBlock(@Block("(,@Block)") VoidBlock2<NSURLResponse, VoidBlock1<NSURLSessionResponseDisposition>> v);
    @Property(selector = "challengeBlock")
    public native @Block("(,,@Block)") VoidBlock3<GTMSessionFetcher, NSURLAuthenticationChallenge, VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential>> getChallengeBlock();
    @Property(selector = "setChallengeBlock:")
    public native void setChallengeBlock(@Block("(,,@Block)") VoidBlock3<GTMSessionFetcher, NSURLAuthenticationChallenge, VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential>> v);
    @Property(selector = "willRedirectBlock")
    public native @Block("(,,@Block)") VoidBlock3<NSHTTPURLResponse, NSURLRequest, VoidBlock1<NSURLRequest>> getWillRedirectBlock();
    @Property(selector = "setWillRedirectBlock:")
    public native void setWillRedirectBlock(@Block("(,,@Block)") VoidBlock3<NSHTTPURLResponse, NSURLRequest, VoidBlock1<NSURLRequest>> v);
    @Property(selector = "sendProgressBlock")
    public native @Block VoidBlock3<Long, Long, Long> getSendProgressBlock();
    @Property(selector = "setSendProgressBlock:")
    public native void setSendProgressBlock(@Block VoidBlock3<Long, Long, Long> v);
    @Property(selector = "accumulateDataBlock")
    public native @Block VoidBlock1<NSData> getAccumulateDataBlock();
    @Property(selector = "setAccumulateDataBlock:")
    public native void setAccumulateDataBlock(@Block VoidBlock1<NSData> v);
    @Property(selector = "receivedProgressBlock")
    public native @Block VoidBlock2<Long, Long> getReceivedProgressBlock();
    @Property(selector = "setReceivedProgressBlock:")
    public native void setReceivedProgressBlock(@Block VoidBlock2<Long, Long> v);
    @Property(selector = "downloadProgressBlock")
    public native @Block VoidBlock3<Long, Long, Long> getDownloadProgressBlock();
    @Property(selector = "setDownloadProgressBlock:")
    public native void setDownloadProgressBlock(@Block VoidBlock3<Long, Long, Long> v);
    @Property(selector = "willCacheURLResponseBlock")
    public native @Block("(,@Block)") VoidBlock2<NSCachedURLResponse, VoidBlock1<NSCachedURLResponse>> getWillCacheURLResponseBlock();
    @Property(selector = "setWillCacheURLResponseBlock:")
    public native void setWillCacheURLResponseBlock(@Block("(,@Block)") VoidBlock2<NSCachedURLResponse, VoidBlock1<NSCachedURLResponse>> v);
    @Property(selector = "isRetryEnabled")
    public native boolean isRetryEnabled();
    @Property(selector = "setRetryEnabled:")
    public native void setRetryEnabled(boolean v);
    @Property(selector = "retryBlock")
    public native @Block("(,,@Block)") VoidBlock3<Boolean, NSError, VoidBooleanBlock> getRetryBlock();
    @Property(selector = "setRetryBlock:")
    public native void setRetryBlock(@Block("(,,@Block)") VoidBlock3<Boolean, NSError, VoidBooleanBlock> v);
    @Property(selector = "metricsCollectionBlock")
    public native @Block VoidBlock1<NSURLSessionTaskMetrics> getMetricsCollectionBlock();
    @Property(selector = "setMetricsCollectionBlock:")
    public native void setMetricsCollectionBlock(@Block VoidBlock1<NSURLSessionTaskMetrics> v);
    @Property(selector = "maxRetryInterval")
    public native double getMaxRetryInterval();
    @Property(selector = "setMaxRetryInterval:")
    public native void setMaxRetryInterval(double v);
    @Property(selector = "minRetryInterval")
    public native double getMinRetryInterval();
    @Property(selector = "setMinRetryInterval:")
    public native void setMinRetryInterval(double v);
    @Property(selector = "retryFactor")
    public native double getRetryFactor();
    @Property(selector = "setRetryFactor:")
    public native void setRetryFactor(double v);
    @Property(selector = "retryCount")
    public native @MachineSizedUInt long getRetryCount();
    @Property(selector = "nextRetryInterval")
    public native double getNextRetryInterval();
    @Property(selector = "skipBackgroundTask")
    public native boolean isSkipBackgroundTask();
    @Property(selector = "setSkipBackgroundTask:")
    public native void setSkipBackgroundTask(boolean v);
    @Property(selector = "isFetching")
    public native boolean isFetching();
    @Property(selector = "stopFetchingTriggersCompletionHandler")
    public native boolean isStopFetchingTriggersCompletionHandler();
    @Property(selector = "setStopFetchingTriggersCompletionHandler:")
    public native void setStopFetchingTriggersCompletionHandler(boolean v);
    @Property(selector = "completionHandler")
    public native @Block VoidBlock2<NSData, NSError> getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock2<NSData, NSError> v);
    @Property(selector = "resumeDataBlock")
    public native @Block VoidBlock1<NSData> getResumeDataBlock();
    @Property(selector = "setResumeDataBlock:")
    public native void setResumeDataBlock(@Block VoidBlock1<NSData> v);
    @Property(selector = "statusCode")
    public native @MachineSizedSInt long getStatusCode();
    @Property(selector = "responseHeaders")
    public native NSDictionary<NSString, NSString> getResponseHeaders();
    @Property(selector = "response")
    public native NSURLResponse getResponse();
    @Property(selector = "downloadedLength")
    public native long getDownloadedLength();
    @Property(selector = "downloadedData")
    public native NSData getDownloadedData();
    @Property(selector = "destinationFileURL")
    public native NSURL getDestinationFileURL();
    @Property(selector = "setDestinationFileURL:")
    public native void setDestinationFileURL(NSURL v);
    @Property(selector = "initialBeginFetchDate")
    public native NSDate getInitialBeginFetchDate();
    @Property(selector = "userData")
    public native NSObject getUserData();
    @Property(selector = "setUserData:")
    public native void setUserData(NSObject v);
    @Property(selector = "properties")
    public native NSDictionary<NSString, ?> getProperties();
    @Property(selector = "setProperties:")
    public native void setProperties(NSDictionary<NSString, ?> v);
    @Property(selector = "comment")
    public native String getComment();
    @Property(selector = "setComment:")
    public native void setComment(String v);
    @Property(selector = "log")
    public native String getLog();
    @Property(selector = "setLog:")
    public native void setLog(String v);
    @Property(selector = "callbackQueue")
    public native DispatchQueue getCallbackQueue();
    @Property(selector = "setCallbackQueue:")
    public native void setCallbackQueue(DispatchQueue v);
    @Property(selector = "sessionDelegateQueue")
    public native NSOperationQueue getSessionDelegateQueue();
    @Property(selector = "setSessionDelegateQueue:")
    public native void setSessionDelegateQueue(NSOperationQueue v);
    @Property(selector = "testBlock")
    public native @Block("(,@Block)") VoidBlock2<GTMSessionFetcher, VoidBlock3<NSHTTPURLResponse, NSData, NSError>> getTestBlock();
    @Property(selector = "setTestBlock:")
    public native void setTestBlock(@Block("(,@Block)") VoidBlock2<GTMSessionFetcher, VoidBlock3<NSHTTPURLResponse, NSData, NSError>> v);
    @Property(selector = "testBlockAccumulateDataChunkCount")
    public native @MachineSizedUInt long getTestBlockAccumulateDataChunkCount();
    @Property(selector = "setTestBlockAccumulateDataChunkCount:")
    public native void setTestBlockAccumulateDataChunkCount(@MachineSizedUInt long v);
    @Property(selector = "parentUploadFetcher")
    public native GTMSessionUploadFetcher getParentUploadFetcher();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Consts {
        static { Bro.bind(Consts.class); }

        @GlobalValue(symbol="kGTMSessionFetcherCompletionDataKey", optional=true)
        public static native String CompletionDataKey();
        @GlobalValue(symbol="kGTMSessionFetcherCompletionErrorKey", optional=true)
        public static native String CompletionErrorKey();
        @GlobalValue(symbol="kGTMSessionFetcherStatusDomain", optional=true)
        public static native String StatusDomain();
        @GlobalValue(symbol="kGTMSessionFetcherStatusDataKey", optional=true)
        public static native String StatusDataKey();
        @GlobalValue(symbol="kGTMSessionFetcherStatusDataContentTypeKey", optional=true)
        public static native String StatusDataContentTypeKey();
        @GlobalValue(symbol="kGTMSessionFetcherNumberOfRetriesDoneKey", optional=true)
        public static native String NumberOfRetriesDoneKey();
        @GlobalValue(symbol="kGTMSessionFetcherElapsedIntervalWithRetriesKey", optional=true)
        public static native String ElapsedIntervalWithRetriesKey();
        @GlobalValue(symbol="kGTMSessionFetcherServiceSessionKey", optional=true)
        public static native String ServiceSessionKey();
        @GlobalValue(symbol="GTMSessionFetcherVersionNumber", optional=true)
        public static native double VersionNumber();
        @GlobalValue(symbol="GTMSessionFetcherVersionNumber", optional=true)
    public static native void VersionNumber(double v);
        @GlobalValue(symbol="GTMSessionFetcherVersionString", optional=true)
        public static native BytePtr VersionString();
    }

    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="kGTMSessionFetcherStartedNotification", optional=true)
        public static native String Started();
        @GlobalValue(symbol="kGTMSessionFetcherStoppedNotification", optional=true)
        public static native String Stopped();
        @GlobalValue(symbol="kGTMSessionFetcherRetryDelayStartedNotification", optional=true)
        public static native String RetryDelayStarted();
        @GlobalValue(symbol="kGTMSessionFetcherRetryDelayStoppedNotification", optional=true)
        public static native String RetryDelayStopped();
        @GlobalValue(symbol="kGTMSessionFetcherCompletionInvokedNotification", optional=true)
        public static native String CompletionInvoked();
        @GlobalValue(symbol="kGTMSessionFetcherServiceSessionBecameInvalidNotification", optional=true)
        public static native String ServiceSessionBecameInvalid();
        @GlobalValue(symbol="kGTMSessionFetcherUploadLocationObtainedNotification", optional=true)
        public static native String UploadLocationObtained();
        @GlobalValue(symbol="kGTMSessionFetcherUploadInitialBackoffStartedNotification", optional=true)
        public static native String UploadInitialBackoffStarted();
    }
    
    @Bridge(symbol="GTMFetcherStandardUserAgentString", optional=true)
    public static native String getStandardUserAgentString(NSBundle bundle);
    @Bridge(symbol="GTMFetcherApplicationIdentifier", optional=true)
    public static native String getApplicationIdentifier(NSBundle bundle);
    @Bridge(symbol="GTMFetcherSystemVersionString", optional=true)
    public static native String getSystemVersionString();
    @Bridge(symbol="GTMFetcherCleanedUserAgentString", optional=true)
    public static native String getCleanedUserAgentString(String str);
    @Bridge(symbol="GTMDataFromInputStream", optional=true)
    public static native NSData getDataFromInputStream(NSInputStream inputStream, NSError.NSErrorPtr outError);
    
    @Method(selector = "initWithRequest:configuration:")
    protected native @Pointer long init(NSURLRequest request, NSURLSessionConfiguration configuration);
    @Method(selector = "setRequestValue:forHTTPHeaderField:")
    public native void setRequestValue(String value, String field);
    @Method(selector = "sessionIdentifierMetadata")
    public native NSDictionary<NSString, ?> sessionIdentifierMetadata();
    @Method(selector = "beginFetchWithDelegate:didFinishSelector:")
    public native void beginFetch(NSObject delegate, Selector finishedSEL);
    @Method(selector = "beginFetchWithCompletionHandler:")
    public native void beginFetch(@Block VoidBlock2<NSData, NSError> handler);
    @Method(selector = "stopFetching")
    public native void stopFetching();
    @Method(selector = "setProperty:forKey:")
    public native void setProperty(NSObject obj, String key);
    @Method(selector = "propertyForKey:")
    public native NSObject propertyForKey(String key);
    @Method(selector = "addPropertiesFromDictionary:")
    public native void addPropertiesFromDictionary(NSDictionary<NSString, ?> dict);
    /**
     * @deprecated Use XCTestExpectation instead
     */
    @Deprecated
    @Method(selector = "waitForCompletionWithTimeout:")
    public native boolean waitForCompletion(double timeoutInSeconds);
    @Method(selector = "fetcherWithRequest:")
    protected static native @Pointer long create(NSURLRequest request);
    @Method(selector = "fetcherWithURL:")
    protected static native @Pointer long create(NSURL requestURL);
    @Method(selector = "fetcherWithURLString:")
    public static native GTMSessionFetcher createFetcherUsingURLString(String requestURLString);
    @Method(selector = "fetcherWithDownloadResumeData:")
    protected static native @Pointer long create(NSData resumeData);
    @Method(selector = "fetcherWithSessionIdentifier:")
    protected static native @Pointer long create(String sessionIdentifier);
    @Method(selector = "fetchersForBackgroundSessions")
    public static native NSArray<GTMSessionFetcher> fetchersForBackgroundSessions();
    @Method(selector = "application:handleEventsForBackgroundURLSession:completionHandler:")
    public static native void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler);
    @Method(selector = "setGlobalTestBlock:")
    public static native void setGlobalTestBlock(@Block("(,@Block)") VoidBlock2<GTMSessionFetcher, VoidBlock3<NSHTTPURLResponse, NSData, NSError>> block);
    @Method(selector = "setSubstituteUIApplication:")
    public static native void setSubstituteUIApplication(GTMUIApplicationProtocol substituteUIApplication);
    @Method(selector = "substituteUIApplication")
    public static native GTMUIApplicationProtocol substituteUIApplication();
    @Method(selector = "staticCookieStorage")
    public static native GTMSessionCookieStorage staticCookieStorage();
    @Method(selector = "appAllowsInsecureRequests")
    public static native boolean appAllowsInsecureRequests();
    @Method(selector = "setLoggingEnabled:")
    public static native void setLoggingEnabled(boolean flag);
    @Method(selector = "isLoggingEnabled")
    public static native boolean isLoggingEnabled();
    @Method(selector = "URLSession:didBecomeInvalidWithError:")
    public native void didBecomeInvalid(NSURLSession session, NSError error);
    @Method(selector = "URLSession:didReceiveChallenge:completionHandler:")
    public native void didReceiveChallenge(NSURLSession session, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "URLSessionDidFinishEventsForBackgroundURLSession:")
    public native void didFinishEvents(NSURLSession session);
    /*</methods>*/
}
