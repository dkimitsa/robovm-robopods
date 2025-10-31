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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTMSessionUploadFetcher/*</name>*/ 
    extends /*<extends>*/GTMSessionFetcher/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTMSessionUploadFetcherPtr extends Ptr<GTMSessionUploadFetcher, GTMSessionUploadFetcherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTMSessionUploadFetcher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTMSessionUploadFetcher() {}
    protected GTMSessionUploadFetcher(Handle h, long handle) { super(h, handle); }
    protected GTMSessionUploadFetcher(SkipInit skipInit) { super(skipInit); }
    public GTMSessionUploadFetcher(NSURLRequest request, String uploadMIMEType, long chunkSize, GTMSessionFetcherService fetcherServiceOrNil) { super((Handle) null, create(request, uploadMIMEType, chunkSize, fetcherServiceOrNil)); retain(getHandle()); }
    public GTMSessionUploadFetcher(NSURL uploadLocationURL, String uploadMIMEType, long chunkSize, GTMSessionFetcherService fetcherServiceOrNil) { super((Handle) null, create(uploadLocationURL, uploadMIMEType, chunkSize, fetcherServiceOrNil)); retain(getHandle()); }
    public GTMSessionUploadFetcher(NSURL uploadLocationURL, String uploadMIMEType, long chunkSize, boolean allowsCellularAccess, GTMSessionFetcherService fetcherServiceOrNil) { super((Handle) null, create(uploadLocationURL, uploadMIMEType, chunkSize, allowsCellularAccess, fetcherServiceOrNil)); retain(getHandle()); }
    @Method(selector = "initWithRequest:configuration:")
    public GTMSessionUploadFetcher(NSURLRequest request, NSURLSessionConfiguration configuration) { super(request, configuration); }
    public GTMSessionUploadFetcher(NSURLRequest request) { super((Handle) null, create(request)); retain(getHandle()); }
    public GTMSessionUploadFetcher(NSURL requestURL) { super((Handle) null, create(requestURL)); retain(getHandle()); }
    public GTMSessionUploadFetcher(NSData resumeData) { super((Handle) null, create(resumeData)); retain(getHandle()); }
    public GTMSessionUploadFetcher(String sessionIdentifier) { super((Handle) null, create(sessionIdentifier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uploadLocationURL")
    public native NSURL getUploadLocationURL();
    @Property(selector = "setUploadLocationURL:")
    public native void setUploadLocationURL(NSURL v);
    @Property(selector = "uploadData")
    public native NSData getUploadData();
    @Property(selector = "setUploadData:")
    public native void setUploadData(NSData v);
    @Property(selector = "uploadFileURL")
    public native NSURL getUploadFileURL();
    @Property(selector = "setUploadFileURL:")
    public native void setUploadFileURL(NSURL v);
    @Property(selector = "uploadFileHandle")
    public native NSFileHandle getUploadFileHandle();
    @Property(selector = "setUploadFileHandle:")
    public native void setUploadFileHandle(NSFileHandle v);
    @Property(selector = "uploadDataProvider")
    public native @Block("(,,@Block)") VoidBlock3<Long, Long, VoidBlock3<NSData, Long, NSError>> getUploadDataProvider();
    @Property(selector = "uploadMIMEType")
    public native String getUploadMIMEType();
    @Property(selector = "setUploadMIMEType:")
    public native void setUploadMIMEType(String v);
    @Property(selector = "chunkSize")
    public native long getChunkSize();
    @Property(selector = "currentOffset")
    public native long getCurrentOffset();
    @Property(selector = "uploadRetryFactor")
    public native double getUploadRetryFactor();
    @Property(selector = "setUploadRetryFactor:")
    public native void setUploadRetryFactor(double v);
    @Property(selector = "maxUploadRetryInterval")
    public native double getMaxUploadRetryInterval();
    @Property(selector = "setMaxUploadRetryInterval:")
    public native void setMaxUploadRetryInterval(double v);
    @Property(selector = "minUploadRetryInterval")
    public native double getMinUploadRetryInterval();
    @Property(selector = "setMinUploadRetryInterval:")
    public native void setMinUploadRetryInterval(double v);
    @Property(selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Property(selector = "chunkFetcher")
    public native GTMSessionFetcher getChunkFetcher();
    @Property(selector = "setChunkFetcher:")
    public native void setChunkFetcher(GTMSessionFetcher v);
    @Property(selector = "activeFetcher")
    public native GTMSessionFetcher getActiveFetcher();
    @Property(selector = "lastChunkRequest")
    public native NSURLRequest getLastChunkRequest();
    @Property(selector = "statusCode")
    public native @MachineSizedSInt long getStatusCode();
    @Property(selector = "setStatusCode:")
    public native void setStatusCode(@MachineSizedSInt long v);
    @Property(selector = "cancellationHandler")
    public native @Block VoidBlock3<GTMSessionFetcher, NSData, NSError> getCancellationHandler();
    @Property(selector = "setCancellationHandler:")
    public native void setCancellationHandler(@Block VoidBlock3<GTMSessionFetcher, NSData, NSError> v);
    @Property(selector = "delegateCallbackQueue")
    public native DispatchQueue getDelegateCallbackQueue();
    @Property(selector = "delegateCompletionHandler")
    public native @Block VoidBlock2<NSData, NSError> getDelegateCompletionHandler();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Consts {
        static { Bro.bind(Consts.class); }

        @GlobalValue(symbol="kGTMSessionUploadFetcherUnknownFileSize", optional=true)
        public static native long UnknownFileSize();
        @GlobalValue(symbol="kGTMSessionUploadFetcherStandardChunkSize", optional=true)
        public static native long StandardChunkSize();
        @GlobalValue(symbol="kGTMSessionUploadFetcherMaximumDemandBufferSize", optional=true)
        public static native long MaximumDemandBufferSize();
    }
    
    @Method(selector = "setUploadDataLength:provider:")
    public native void setUploadDataLength(long fullLength, @Block("(,,@Block)") VoidBlock3<Long, Long, VoidBlock3<NSData, Long, NSError>> block);
    @Method(selector = "pauseFetching")
    public native void pauseFetching();
    @Method(selector = "resumeFetching")
    public native void resumeFetching();
    @Method(selector = "isPaused")
    public native boolean isPaused();
    @Method(selector = "uploadFetcherWithRequest:uploadMIMEType:chunkSize:fetcherService:")
    protected static native @Pointer long create(NSURLRequest request, String uploadMIMEType, long chunkSize, GTMSessionFetcherService fetcherServiceOrNil);
    @Method(selector = "uploadFetcherWithLocation:uploadMIMEType:chunkSize:fetcherService:")
    protected static native @Pointer long create(NSURL uploadLocationURL, String uploadMIMEType, long chunkSize, GTMSessionFetcherService fetcherServiceOrNil);
    @Method(selector = "uploadFetcherWithLocation:uploadMIMEType:chunkSize:allowsCellularAccess:fetcherService:")
    protected static native @Pointer long create(NSURL uploadLocationURL, String uploadMIMEType, long chunkSize, boolean allowsCellularAccess, GTMSessionFetcherService fetcherServiceOrNil);
    @Method(selector = "uploadFetchersForBackgroundSessions")
    public static native NSArray<?> uploadFetchersForBackgroundSessions();
    @Method(selector = "uploadFetcherForSessionIdentifier:")
    public static native GTMSessionUploadFetcher uploadFetcherForSessionIdentifier(String sessionIdentifier);
    @Method(selector = "fetcherWithRequest:")
    protected static native @Pointer long create(NSURLRequest request);
    @Method(selector = "fetcherWithURL:")
    protected static native @Pointer long create(NSURL requestURL);
    @Method(selector = "fetcherWithURLString:")
    public static native GTMSessionUploadFetcher createFetcherUsingURLString(String requestURLString);
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
    /*</methods>*/
}
