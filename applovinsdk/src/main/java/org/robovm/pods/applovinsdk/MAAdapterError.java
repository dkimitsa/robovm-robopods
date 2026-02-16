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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdapterError/*</name>*/ 
    extends /*<extends>*/MAError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdapterErrorPtr extends Ptr<MAAdapterError, MAAdapterErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAdapterError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAdapterError() {}
    protected MAAdapterError(Handle h, long handle) { super(h, handle); }
    protected MAAdapterError(SkipInit skipInit) { super(skipInit); }
    public MAAdapterError(@MachineSizedSInt long code) { super((Handle) null, create(code)); retain(getHandle()); }
    public MAAdapterError(@MachineSizedSInt long code, String errorString) { super((Handle) null, create(code, errorString)); retain(getHandle()); }
    public MAAdapterError(NSError error) { super((Handle) null, create(error)); retain(getHandle()); }
    public MAAdapterError(MAAdapterError error, @MachineSizedSInt long mediatedNetworkErrorCode, String mediatedNetworkErrorMessage) { super((Handle) null, create(error, mediatedNetworkErrorCode, mediatedNetworkErrorMessage)); retain(getHandle()); }
    public MAAdapterError(@MachineSizedSInt long code, String errorString, @MachineSizedSInt long mediatedNetworkErrorCode, String mediatedNetworkErrorMessage) { super((Handle) null, create(code, errorString, mediatedNetworkErrorCode, mediatedNetworkErrorMessage)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errorCodeNoFill")
    public static native @MachineSizedSInt long getErrorCodeNoFill();
    @Property(selector = "noFill")
    public static native MAAdapterError getNoFill();
    @Property(selector = "errorCodeUnspecified")
    public static native @MachineSizedSInt long getErrorCodeUnspecified();
    @Property(selector = "unspecified")
    public static native MAAdapterError getUnspecified();
    @Property(selector = "errorCodeInvalidLoadState")
    public static native @MachineSizedSInt long getErrorCodeInvalidLoadState();
    @Property(selector = "invalidLoadState")
    public static native MAAdapterError getInvalidLoadState();
    @Property(selector = "errorCodeInvalidConfiguration")
    public static native @MachineSizedSInt long getErrorCodeInvalidConfiguration();
    @Property(selector = "invalidConfiguration")
    public static native MAAdapterError getInvalidConfiguration();
    @Property(selector = "errorCodeBadRequest")
    public static native @MachineSizedSInt long getErrorCodeBadRequest();
    @Property(selector = "badRequest")
    public static native MAAdapterError getBadRequest();
    @Property(selector = "errorCodeNotInitialized")
    public static native @MachineSizedSInt long getErrorCodeNotInitialized();
    @Property(selector = "notInitialized")
    public static native MAAdapterError getNotInitialized();
    @Property(selector = "errorCodeTimeout")
    public static native @MachineSizedSInt long getErrorCodeTimeout();
    @Property(selector = "timeout")
    public static native MAAdapterError getTimeout();
    @Property(selector = "errorCodeNoConnection")
    public static native @MachineSizedSInt long getErrorCodeNoConnection();
    @Property(selector = "noConnection")
    public static native MAAdapterError getNoConnection();
    @Property(selector = "errorCodeAdNotReady")
    public static native @MachineSizedSInt long getErrorCodeAdNotReady();
    @Property(selector = "adNotReady")
    public static native MAAdapterError getAdNotReady();
    @Property(selector = "errorCodeServerError")
    public static native @MachineSizedSInt long getErrorCodeServerError();
    @Property(selector = "serverError")
    public static native MAAdapterError getServerError();
    @Property(selector = "errorCodeInternalError")
    public static native @MachineSizedSInt long getErrorCodeInternalError();
    @Property(selector = "internalError")
    public static native MAAdapterError getInternalError();
    @Property(selector = "errorCodeSignalCollectionTimeout")
    public static native @MachineSizedSInt long getErrorCodeSignalCollectionTimeout();
    @Property(selector = "signalCollectionTimeout")
    public static native MAAdapterError getSignalCollectionTimeout();
    @Property(selector = "errorCodeSignalCollectionNotSupported")
    public static native @MachineSizedSInt long getErrorCodeSignalCollectionNotSupported();
    @Property(selector = "signalCollectionNotSupported")
    public static native MAAdapterError getSignalCollectionNotSupported();
    @Property(selector = "errorCodeWebViewError")
    public static native @MachineSizedSInt long getErrorCodeWebViewError();
    @Property(selector = "webViewError")
    public static native MAAdapterError getWebViewError();
    @Property(selector = "errorCodeAdExpired")
    public static native @MachineSizedSInt long getErrorCodeAdExpired();
    @Property(selector = "adExpiredError")
    public static native MAAdapterError getAdExpiredError();
    @Property(selector = "errorCodeAdFrequencyCapped")
    public static native @MachineSizedSInt long getErrorCodeAdFrequencyCapped();
    @Property(selector = "adFrequencyCappedError")
    public static native MAAdapterError getAdFrequencyCappedError();
    @Property(selector = "errorCodeRewardError")
    public static native @MachineSizedSInt long getErrorCodeRewardError();
    @Property(selector = "rewardError")
    public static native MAAdapterError getRewardError();
    @Property(selector = "errorCodeMissingRequiredNativeAdAssets")
    public static native @MachineSizedSInt long getErrorCodeMissingRequiredNativeAdAssets();
    @Property(selector = "missingRequiredNativeAdAssets")
    public static native MAAdapterError getMissingRequiredNativeAdAssets();
    @Property(selector = "errorCodeMissingViewController")
    public static native @MachineSizedSInt long getErrorCodeMissingViewController();
    @Property(selector = "missingViewController")
    public static native MAAdapterError getMissingViewController();
    @Property(selector = "errorCodeAdDisplayFailedError")
    public static native @MachineSizedSInt long getErrorCodeAdDisplayFailedError();
    @Property(selector = "adDisplayFailedError")
    public static native MAAdapterError getAdDisplayFailedError();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "errorWithCode:")
    protected static native @Pointer long create(@MachineSizedSInt long code);
    @Method(selector = "errorWithCode:errorString:")
    protected static native @Pointer long create(@MachineSizedSInt long code, String errorString);
    @Method(selector = "errorWithNSError:")
    protected static native @Pointer long create(NSError error);
    @Method(selector = "errorWithAdapterError:mediatedNetworkErrorCode:mediatedNetworkErrorMessage:")
    protected static native @Pointer long create(MAAdapterError error, @MachineSizedSInt long mediatedNetworkErrorCode, String mediatedNetworkErrorMessage);
    @Method(selector = "errorWithCode:errorString:mediatedNetworkErrorCode:mediatedNetworkErrorMessage:")
    protected static native @Pointer long create(@MachineSizedSInt long code, String errorString, @MachineSizedSInt long mediatedNetworkErrorCode, String mediatedNetworkErrorMessage);
    /*</methods>*/
}
