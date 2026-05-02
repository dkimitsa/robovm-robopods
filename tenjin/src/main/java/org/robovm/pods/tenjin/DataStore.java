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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/DataStore/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "getAll")
    NSDictionary<?, ?> getAll();
    @Method(selector = "getString:withDefault:")
    String getString(String key, String defaultValue);
    @Method(selector = "getInteger:withDefault:")
    @MachineSizedSInt long getInteger(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "getLong:withDefault:")
    @MachineSizedSInt long getLong(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "getFloat:withDefault:")
    float getFloat(String key, float defaultValue);
    @Method(selector = "getBool:withDefault:")
    boolean getBool(String key, boolean defaultValue);
    @Method(selector = "contains:")
    boolean contains(String key);
    @Method(selector = "putString:value:")
    void putString(String key, String defaultValue);
    @Method(selector = "putInteger:value:")
    void putInteger(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "putLong:value:")
    void putLong(String key, @MachineSizedSInt long defaultValue);
    @Method(selector = "putFloat:value:")
    void putFloat(String key, float defaultValue);
    @Method(selector = "putBool:value:")
    void putBool(String key, boolean defaultValue);
    @Method(selector = "remove:")
    void remove(String key);
    @Method(selector = "clear")
    void clear();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
