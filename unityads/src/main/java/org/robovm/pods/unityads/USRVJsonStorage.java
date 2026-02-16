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
package org.robovm.pods.unityads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/USRVJsonStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UADSJsonStorageContentsReader, UADSJsonStorageReader/*</implements>*/ {

    /*<ptr>*/public static class USRVJsonStoragePtr extends Ptr<USRVJsonStorage, USRVJsonStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(USRVJsonStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public USRVJsonStorage() {}
    protected USRVJsonStorage(Handle h, long handle) { super(h, handle); }
    protected USRVJsonStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "storageContents")
    public native NSMutableDictionary<?, ?> getStorageContents();
    @Property(selector = "setStorageContents:")
    public native void setStorageContents(NSMutableDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "set:value:")
    public native boolean set(String key, NSObject value);
    @Method(selector = "getValueForKey:")
    public native NSObject getValueForKey(String key);
    @Method(selector = "deleteKey:")
    public native boolean deleteKey(String key);
    @Method(selector = "getKeys:recursive:")
    public native NSArray<?> getKeys(String key, boolean recursive);
    @Method(selector = "clearData")
    public native void clearData();
    @Method(selector = "initData")
    public native boolean initData();
    @Method(selector = "hasData")
    public native boolean hasData();
    @Method(selector = "setContents:")
    public native void setContents(NSDictionary<?, ?> contents);
    @Method(selector = "getContents")
    public native NSDictionary<?, ?> getContents();
    /*</methods>*/
}
