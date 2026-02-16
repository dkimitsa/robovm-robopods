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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.AdsAudioConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AdsAudioConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdsAudioConfigPtr extends Ptr<AdsAudioConfig, AdsAudioConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AdsAudioConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AdsAudioConfig() {}
    protected AdsAudioConfig(Handle h, long handle) { super(h, handle); }
    protected AdsAudioConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isAudioEnabled")
    public native boolean isAudioEnabled();
    @Property(selector = "setIsAudioEnabled:")
    public native void setIsAudioEnabled(boolean v);
    @Property(selector = "minDeviceVolume")
    public native @MachineSizedSInt long getMinDeviceVolume();
    @Property(selector = "setMinDeviceVolume:")
    public native void setMinDeviceVolume(@MachineSizedSInt long v);
    @Property(selector = "minRefreshInterval")
    public native @MachineSizedSInt long getMinRefreshInterval();
    @Property(selector = "setMinRefreshInterval:")
    public native void setMinRefreshInterval(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
