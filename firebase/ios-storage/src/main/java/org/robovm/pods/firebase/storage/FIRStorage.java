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
package org.robovm.pods.firebase.storage;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRStoragePtr extends Ptr<FIRStorage, FIRStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRStorage() {}
    protected FIRStorage(Handle h, long handle) { super(h, handle); }
    protected FIRStorage(SkipInit skipInit) { super(skipInit); }
    public FIRStorage(String url) { super((Handle) null, storage(url)); retain(getHandle()); }
    public FIRStorage(org.robovm.pods.firebase.core.FIRApp app, String url) { super((Handle) null, storageForApp(app, url)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "app")
    public native org.robovm.pods.firebase.core.FIRApp getApp();
    @Property(selector = "maxUploadRetryTime")
    public native double getMaxUploadRetryTime();
    @Property(selector = "setMaxUploadRetryTime:")
    public native void setMaxUploadRetryTime(double v);
    @Property(selector = "maxDownloadRetryTime")
    public native double getMaxDownloadRetryTime();
    @Property(selector = "setMaxDownloadRetryTime:")
    public native void setMaxDownloadRetryTime(double v);
    @Property(selector = "maxOperationRetryTime")
    public native double getMaxOperationRetryTime();
    @Property(selector = "setMaxOperationRetryTime:")
    public native void setMaxOperationRetryTime(double v);
    @Property(selector = "uploadChunkSizeBytes")
    public native long getUploadChunkSizeBytes();
    @Property(selector = "setUploadChunkSizeBytes:")
    public native void setUploadChunkSizeBytes(long v);
    @Property(selector = "callbackQueue")
    public native DispatchQueue getCallbackQueue();
    @Property(selector = "setCallbackQueue:")
    public native void setCallbackQueue(DispatchQueue v);
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FirebaseStorageVersionNumber", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) double versionNumber();
    @GlobalValue(symbol="FirebaseStorageVersionString", optional=true)
    public static native BytePtr VersionString();
    
    @Method(selector = "reference")
    public native FIRStorageReference reference();
    @Method(selector = "referenceForURL:")
    public native FIRStorageReference referenceForURL(String url);
    @Method(selector = "referenceWithPath:")
    public native FIRStorageReference reference(String path);
    @Method(selector = "useEmulatorWithHost:port:")
    public native void useEmulator(String host, @MachineSizedSInt long port);
    @Method(selector = "copy")
    public native NSObject copy();
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "storage")
    public static native FIRStorage storage();
    @Method(selector = "storageWithURL:")
    protected static native @Pointer long storage(String url);
    @Method(selector = "storageForApp:")
    public static native FIRStorage storageForApp(org.robovm.pods.firebase.core.FIRApp app);
    @Method(selector = "storageForApp:URL:")
    protected static native @Pointer long storageForApp(org.robovm.pods.firebase.core.FIRApp app, String url);
    /*</methods>*/
}
