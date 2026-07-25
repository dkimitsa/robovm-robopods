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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.LPAppOwnershipConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPAppOwnershipConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPAppOwnershipConfigPtr extends Ptr<LPAppOwnershipConfig, LPAppOwnershipConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPAppOwnershipConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LPAppOwnershipConfig() {}
    protected LPAppOwnershipConfig(Handle h, long handle) { super(h, handle); }
    protected LPAppOwnershipConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "banner")
    public native LPAppOwnershipFormatConfig getBanner();
    @Property(selector = "setBanner:")
    public native void setBanner(LPAppOwnershipFormatConfig v);
    @Property(selector = "inter")
    public native LPAppOwnershipFormatConfig getInter();
    @Property(selector = "setInter:")
    public native void setInter(LPAppOwnershipFormatConfig v);
    @Property(selector = "native")
    public native LPAppOwnershipFormatConfig getNative();
    @Property(selector = "setNative:")
    public native void setNative(LPAppOwnershipFormatConfig v);
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "ttl")
    public native @MachineSizedSInt long getTtl();
    @Property(selector = "setTtl:")
    public native void setTtl(@MachineSizedSInt long v);
    @Property(selector = "popupDetection")
    public native @MachineSizedSInt long getPopupDetection();
    @Property(selector = "setPopupDetection:")
    public native void setPopupDetection(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
