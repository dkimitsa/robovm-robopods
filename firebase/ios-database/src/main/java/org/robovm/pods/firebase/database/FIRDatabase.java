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
package org.robovm.pods.firebase.database;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDatabase/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDatabasePtr extends Ptr<FIRDatabase, FIRDatabasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDatabase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRDatabase() {}
    protected FIRDatabase(Handle h, long handle) { super(h, handle); }
    protected FIRDatabase(SkipInit skipInit) { super(skipInit); }
    public FIRDatabase(String url) { super((Handle) null, create(url)); retain(getHandle()); }
    public FIRDatabase(org.robovm.pods.firebase.core.FIRApp app, String url) { super((Handle) null, create(app, url)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "app")
    public native org.robovm.pods.firebase.core.FIRApp getApp();
    @Property(selector = "persistenceEnabled")
    public native boolean isPersistenceEnabled();
    @Property(selector = "setPersistenceEnabled:")
    public native void setPersistenceEnabled(boolean v);
    @Property(selector = "persistenceCacheSizeBytes")
    public native @MachineSizedUInt long getPersistenceCacheSizeBytes();
    @Property(selector = "setPersistenceCacheSizeBytes:")
    public native void setPersistenceCacheSizeBytes(@MachineSizedUInt long v);
    @Property(selector = "callbackQueue")
    public native DispatchQueue getCallbackQueue();
    @Property(selector = "setCallbackQueue:")
    public native void setCallbackQueue(DispatchQueue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reference")
    public native FIRDatabaseReference reference();
    @Method(selector = "referenceWithPath:")
    public native FIRDatabaseReference reference(String path);
    @Method(selector = "referenceFromURL:")
    public native FIRDatabaseReference referenceFromURL(String databaseUrl);
    @Method(selector = "purgeOutstandingWrites")
    public native void purgeOutstandingWrites();
    @Method(selector = "goOffline")
    public native void goOffline();
    @Method(selector = "goOnline")
    public native void goOnline();
    @Method(selector = "useEmulatorWithHost:port:")
    public native void useEmulator(String host, @MachineSizedSInt long port);
    @Method(selector = "database")
    public static native FIRDatabase database();
    @Method(selector = "databaseWithURL:")
    protected static native @Pointer long create(String url);
    @Method(selector = "databaseForApp:URL:")
    protected static native @Pointer long create(org.robovm.pods.firebase.core.FIRApp app, String url);
    @Method(selector = "databaseForApp:")
    public static native FIRDatabase databaseForApp(org.robovm.pods.firebase.core.FIRApp app);
    @Method(selector = "setLoggingEnabled:")
    public static native void setLoggingEnabled(boolean enabled);
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    /*</methods>*/
}
