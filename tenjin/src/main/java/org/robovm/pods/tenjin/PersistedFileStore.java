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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PersistedFileStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements DataStore/*</implements>*/ {

    /*<ptr>*/public static class PersistedFileStorePtr extends Ptr<PersistedFileStore, PersistedFileStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PersistedFileStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PersistedFileStore() {}
    protected PersistedFileStore(Handle h, long handle) { super(h, handle); }
    protected PersistedFileStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "persistenceDict")
    public native NSMutableDictionary<?, ?> getPersistenceDict();
    @Property(selector = "setPersistenceDict:")
    public native void setPersistenceDict(NSMutableDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setup")
    public native void setup();
    @Method(selector = "store")
    public static native PersistedFileStore store();
    @Method(selector = "getAll")
    public native NSDictionary<?, ?> getAll();
    @Method(selector = "getString:withDefault:")
    public native String getString(String key, String defaultValue);
    @Method(selector = "getInteger:withDefault:")
    public native @MachineSizedSInt long getInteger(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "getLong:withDefault:")
    public native @MachineSizedSInt long getLong(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "getFloat:withDefault:")
    public native float getFloat(String key, float defaultValue);
    @Method(selector = "getBool:withDefault:")
    public native boolean getBool(String key, boolean defaultValue);
    @Method(selector = "contains:")
    public native boolean contains(String key);
    @Method(selector = "putString:value:")
    public native void putString(String key, String defaultValue);
    @Method(selector = "putInteger:value:")
    public native void putInteger(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "putLong:value:")
    public native void putLong(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "putFloat:value:")
    public native void putFloat(String key, float defaultValue);
    @Method(selector = "putBool:value:")
    public native void putBool(String key, boolean defaultValue);
    @Method(selector = "remove:")
    public native void remove(String key);
    @Method(selector = "clear")
    public native void clear();
    /*</methods>*/
}
