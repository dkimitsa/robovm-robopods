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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMPPSSignalConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMPPSSignalConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMPPSSignalConfigPtr extends Ptr<IMPPSSignalConfig, IMPPSSignalConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMPPSSignalConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IMPPSSignalConfig() {}
    protected IMPPSSignalConfig(Handle h, long handle) { super(h, handle); }
    protected IMPPSSignalConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "expiry")
    public native @MachineSizedSInt long getExpiry();
    @Property(selector = "setExpiry:")
    public native void setExpiry(@MachineSizedSInt long v);
    @Property(selector = "count")
    public native @MachineSizedSInt long getCount();
    @Property(selector = "setCount:")
    public native void setCount(@MachineSizedSInt long v);
    @Property(selector = "precision")
    public native @MachineSizedSInt long getPrecision();
    @Property(selector = "setPrecision:")
    public native void setPrecision(@MachineSizedSInt long v);
    @Property(selector = "strLen")
    public native @MachineSizedSInt long getStrLen();
    @Property(selector = "setStrLen:")
    public native void setStrLen(@MachineSizedSInt long v);
    @Property(selector = "depth")
    public native IMDepthPPS getDepth();
    @Property(selector = "setDepth:")
    public native void setDepth(IMDepthPPS v);
    @Property(selector = "allowedKeys")
    public native AnyDictionary getAllowedKeys();
    @Property(selector = "setAllowedKeys:")
    public native void setAllowedKeys(AnyDictionary v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
