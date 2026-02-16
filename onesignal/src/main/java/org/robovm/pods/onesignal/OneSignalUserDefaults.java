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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalUserDefaults/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalUserDefaultsPtr extends Ptr<OneSignalUserDefaults, OneSignalUserDefaultsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalUserDefaults.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalUserDefaults() {}
    protected OneSignalUserDefaults(Handle h, long handle) { super(h, handle); }
    protected OneSignalUserDefaults(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userDefaults")
    public native NSUserDefaults getUserDefaults();
    @Property(selector = "setUserDefaults:")
    public native void setUserDefaults(NSUserDefaults v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "keyExists:")
    public native boolean keyExists(String key);
    @Method(selector = "removeValueForKey:")
    public native void removeValueForKey(String key);
    @Method(selector = "getSavedBoolForKey:defaultValue:")
    public native boolean getSavedBool(String key, boolean value);
    @Method(selector = "saveBoolForKey:withValue:")
    public native void saveBool(String key, boolean value);
    @Method(selector = "getSavedStringForKey:defaultValue:")
    public native String getSavedString(String key, String value);
    @Method(selector = "saveStringForKey:withValue:")
    public native void saveString(String key, String value);
    @Method(selector = "getSavedIntegerForKey:defaultValue:")
    public native @MachineSizedSInt long getSavedInteger(String key, @MachineSizedSInt long value);
    @Method(selector = "saveIntegerForKey:withValue:")
    public native void saveInteger(String key, @MachineSizedSInt long value);
    @Method(selector = "getSavedDoubleForKey:defaultValue:")
    public native double getSavedDouble(String key, double value);
    @Method(selector = "saveDoubleForKey:withValue:")
    public native void saveDouble(String key, double value);
    @Method(selector = "getSavedSetForKey:defaultValue:")
    public native NSSet<?> getSavedSet(String key, NSSet<?> value);
    @Method(selector = "saveSetForKey:withValue:")
    public native void saveSet(String key, NSSet<?> value);
    @Method(selector = "getSavedDictionaryForKey:defaultValue:")
    public native NSDictionary<?, ?> getSavedDictionary(String key, NSDictionary<?, ?> value);
    @Method(selector = "saveDictionaryForKey:withValue:")
    public native void saveDictionary(String key, NSDictionary<?, ?> value);
    @Method(selector = "getSavedObjectForKey:defaultValue:")
    public native NSObject getSavedObject(String key, NSObject value);
    @Method(selector = "saveObjectForKey:withValue:")
    public native void saveObject(String key, NSObject value);
    @Method(selector = "getSavedCodeableDataForKey:defaultValue:")
    public native NSObject getSavedCodeableData(String key, NSObject value);
    @Method(selector = "saveCodeableDataForKey:withValue:")
    public native void saveCodeableData(String key, NSObject value);
    @Method(selector = "initStandard")
    public static native OneSignalUserDefaults initStandard();
    @Method(selector = "initShared")
    public static native OneSignalUserDefaults initShared();
    @Method(selector = "appGroupName")
    public static native String appGroupName();
    /*</methods>*/
}
