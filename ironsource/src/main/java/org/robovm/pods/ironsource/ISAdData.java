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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAdData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISAdDataPtr extends Ptr<ISAdData, ISAdDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISAdData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISAdData() {}
    protected ISAdData(Handle h, long handle) { super(h, handle); }
    protected ISAdData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServerData:configuration:adUnitData:")
    public ISAdData(String serverData, NSDictionary<?, ?> configuration, NSDictionary<?, ?> adUnitData) { super((SkipInit) null); initObject(init(serverData, configuration, adUnitData)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serverData")
    public native String getServerData();
    @Property(selector = "configuration")
    public native NSDictionary<?, ?> getConfiguration();
    @Property(selector = "adUnitData")
    public native NSDictionary<?, ?> getAdUnitData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServerData:configuration:adUnitData:")
    protected native @Pointer long init(String serverData, NSDictionary<?, ?> configuration, NSDictionary<?, ?> adUnitData);
    @Method(selector = "getString:")
    public native String getString(String key);
    @Method(selector = "getInt:")
    public native @MachineSizedSInt long getInt(String key);
    @Method(selector = "getBoolean:")
    public native boolean getBoolean(String key);
    @Method(selector = "getNumber:")
    public native NSNumber getNumber(String key);
    /*</methods>*/
}
