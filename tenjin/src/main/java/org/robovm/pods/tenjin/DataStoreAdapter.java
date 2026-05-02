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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DataStoreAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements DataStore/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("getAll")
    public NSDictionary<?, ?> getAll() { return null; }
    @NotImplemented("getString:withDefault:")
    public String getString(String key, String defaultValue) { return null; }
    @NotImplemented("getInteger:withDefault:")
    public @MachineSizedSInt long getInteger(String key, @MachineSizedSInt long defaultValue) { return 0; }
    @NotImplemented("getLong:withDefault:")
    public @MachineSizedSInt long getLong(String key, @MachineSizedSInt long defaultValue) { return 0; }
    @NotImplemented("getFloat:withDefault:")
    public float getFloat(String key, float defaultValue) { return 0; }
    @NotImplemented("getBool:withDefault:")
    public boolean getBool(String key, boolean defaultValue) { return false; }
    @NotImplemented("contains:")
    public boolean contains(String key) { return false; }
    @NotImplemented("putString:value:")
    public void putString(String key, String defaultValue) {}
    @NotImplemented("putInteger:value:")
    public void putInteger(String key, @MachineSizedSInt long defaultValue) {}
    @NotImplemented("putLong:value:")
    public void putLong(String key, @MachineSizedSInt long defaultValue) {}
    @NotImplemented("putFloat:value:")
    public void putFloat(String key, float defaultValue) {}
    @NotImplemented("putBool:value:")
    public void putBool(String key, boolean defaultValue) {}
    @NotImplemented("remove:")
    public void remove(String key) {}
    @NotImplemented("clear")
    public void clear() {}
    /*</methods>*/
}
