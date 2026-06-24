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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRStorageMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRStorageMetadataPtr extends Ptr<FIRStorageMetadata, FIRStorageMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRStorageMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRStorageMetadata() {}
    protected FIRStorageMetadata(Handle h, long handle) { super(h, handle); }
    protected FIRStorageMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDictionary:")
    public FIRStorageMetadata(NSDictionary<NSString, ?> dictionary) { super((SkipInit) null); initObject(init(dictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bucket")
    public native String getBucket();
    @Property(selector = "cacheControl")
    public native String getCacheControl();
    @Property(selector = "setCacheControl:")
    public native void setCacheControl(String v);
    @Property(selector = "contentDisposition")
    public native String getContentDisposition();
    @Property(selector = "setContentDisposition:")
    public native void setContentDisposition(String v);
    @Property(selector = "contentEncoding")
    public native String getContentEncoding();
    @Property(selector = "setContentEncoding:")
    public native void setContentEncoding(String v);
    @Property(selector = "contentLanguage")
    public native String getContentLanguage();
    @Property(selector = "setContentLanguage:")
    public native void setContentLanguage(String v);
    @Property(selector = "contentType")
    public native String getContentType();
    @Property(selector = "setContentType:")
    public native void setContentType(String v);
    @Property(selector = "md5Hash")
    public native String getMd5Hash();
    @Property(selector = "generation")
    public native long getGeneration();
    @Property(selector = "customMetadata")
    public native NSDictionary<NSString, NSString> getCustomMetadata();
    @Property(selector = "setCustomMetadata:")
    public native void setCustomMetadata(NSDictionary<NSString, NSString> v);
    @Property(selector = "metageneration")
    public native long getMetageneration();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "size")
    public native long getSize();
    @Property(selector = "timeCreated")
    public native NSDate getTimeCreated();
    @Property(selector = "updated")
    public native NSDate getUpdated();
    @Property(selector = "isFile")
    public native boolean isFile();
    @Property(selector = "isFolder")
    public native boolean isFolder();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dictionaryRepresentation")
    public native NSDictionary<NSString, ?> dictionaryRepresentation();
    @Method(selector = "initWithDictionary:")
    protected native @Pointer long init(NSDictionary<NSString, ?> dictionary);
    @Method(selector = "copy")
    public native NSObject copy();
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
