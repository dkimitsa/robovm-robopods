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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IceConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IceConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IceConfigPtr extends Ptr<IceConfig, IceConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IceConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IceConfig() {}
    protected IceConfig(Handle h, long handle) { super(h, handle); }
    protected IceConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "locationEnabled")
    public native boolean isLocationEnabled();
    @Property(selector = "setLocationEnabled:")
    public native void setLocationEnabled(boolean v);
    @Property(selector = "w")
    public native WConfig getW();
    @Property(selector = "setW:")
    public native void setW(WConfig v);
    @Property(selector = "sessionEnabled")
    public native boolean isSessionEnabled();
    @Property(selector = "setSessionEnabled:")
    public native void setSessionEnabled(boolean v);
    @Property(selector = "c")
    public native CConfig getC();
    @Property(selector = "setC:")
    public native void setC(CConfig v);
    @Property(selector = "stopRequestTimeout")
    public native @MachineSizedSInt long getStopRequestTimeout();
    @Property(selector = "setStopRequestTimeout:")
    public native void setStopRequestTimeout(@MachineSizedSInt long v);
    @Property(selector = "operatorInfoCollectionEnabled")
    public native boolean isOperatorInfoCollectionEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    /*</methods>*/
}
