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
package org.robovm.pods.firebase.remoteconfig;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRRemoteConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class FIRRemoteConfigPtr extends Ptr<FIRRemoteConfig, FIRRemoteConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRRemoteConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRRemoteConfig() {}
    protected FIRRemoteConfig(Handle h, long handle) { super(h, handle); }
    protected FIRRemoteConfig(SkipInit skipInit) { super(skipInit); }
    public FIRRemoteConfig(org.robovm.pods.firebase.core.FIRApp app) { super((Handle) null, create(app)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lastFetchTime")
    public native NSDate getLastFetchTime();
    @Property(selector = "lastFetchStatus")
    public native FIRRemoteConfigFetchStatus getLastFetchStatus();
    @Property(selector = "configSettings")
    public native FIRRemoteConfigSettings getConfigSettings();
    @Property(selector = "setConfigSettings:")
    public native void setConfigSettings(FIRRemoteConfigSettings v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Namespace {
        static { Bro.bind(Namespace.class); }

        @GlobalValue(symbol="FIRNamespaceGoogleMobilePlatform", optional=true)
        public static native String GoogleMobilePlatform();
    }
    
    @Method(selector = "ensureInitializedWithCompletionHandler:")
    public native void ensureInitialized(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "fetchWithCompletionHandler:")
    public native void fetch(@Block VoidBlock2<FIRRemoteConfigFetchStatus, NSError> completionHandler);
    @Method(selector = "fetchWithExpirationDuration:completionHandler:")
    public native void fetch(double expirationDuration, @Block VoidBlock2<FIRRemoteConfigFetchStatus, NSError> completionHandler);
    @Method(selector = "fetchAndActivateWithCompletionHandler:")
    public native void fetchAndActivate(@Block VoidBlock2<FIRRemoteConfigFetchAndActivateStatus, NSError> completionHandler);
    @Method(selector = "activateWithCompletion:")
    public native void activate(@Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "objectForKeyedSubscript:")
    public native FIRRemoteConfigValue objectForKeyedSubscript(String key);
    @Method(selector = "configValueForKey:")
    public native FIRRemoteConfigValue configValueForKey(String key);
    @Method(selector = "configValueForKey:source:")
    public native FIRRemoteConfigValue getConfigValue(String key, FIRRemoteConfigSource source);
    @Method(selector = "allKeysFromSource:")
    public native NSArray<NSString> allKeysFromSource(FIRRemoteConfigSource source);
    @Method(selector = "keysWithPrefix:")
    public native NSSet<NSString> getKeys(String prefix);
    @Method(selector = "setDefaults:")
    public native void setDefaults(NSDictionary<NSString, ?> defaults);
    @Method(selector = "setDefaultsFromPlistFileName:")
    public native void setDefaultsFromPlistFileName(String fileName);
    @Method(selector = "defaultValueForKey:")
    public native FIRRemoteConfigValue defaultValueForKey(String key);
    @Method(selector = "addOnConfigUpdateListener:")
    public native FIRConfigUpdateListenerRegistration addOnConfigUpdateListener(@Block VoidBlock2<FIRRemoteConfigUpdate, NSError> listener);
    @Method(selector = "setCustomSignals:withCompletion:")
    public native void setCustomSignals(NSDictionary<NSString, ?> customSignals, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "remoteConfig")
    public static native FIRRemoteConfig remoteConfig();
    @Method(selector = "remoteConfigWithApp:")
    protected static native @Pointer long create(org.robovm.pods.firebase.core.FIRApp app);
    /*</methods>*/
}
