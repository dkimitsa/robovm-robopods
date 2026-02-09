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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMUserDataTypes")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMUserDataTypes/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMUserDataTypesPtr extends Ptr<IMUserDataTypes, IMUserDataTypesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMUserDataTypes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMUserDataTypes() {}
    protected IMUserDataTypes(Handle h, long handle) { super(h, handle); }
    protected IMUserDataTypes(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMd5:sha1:sha256:")
    public IMUserDataTypes(String md5, String sha1, String sha256) { super((SkipInit) null); initObject(init(md5, sha1, sha256)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "md5")
    public native String getMd5();
    @Property(selector = "setMd5:")
    public native void setMd5(String v);
    @Property(selector = "sha1")
    public native String getSha1();
    @Property(selector = "setSha1:")
    public native void setSha1(String v);
    @Property(selector = "sha256")
    public native String getSha256();
    @Property(selector = "setSha256:")
    public native void setSha256(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMd5:sha1:sha256:")
    protected native @Pointer long init(String md5, String sha1, String sha256);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    /*</methods>*/
}
