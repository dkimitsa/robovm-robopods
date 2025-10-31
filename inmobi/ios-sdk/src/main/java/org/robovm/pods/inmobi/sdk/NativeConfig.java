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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.NativeConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NativeConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NativeConfigPtr extends Ptr<NativeConfig, NativeConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NativeConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NativeConfig() {}
    protected NativeConfig(Handle h, long handle) { super(h, handle); }
    protected NativeConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adChoiceConfig")
    public native AdChoiceConfig getAdChoiceConfig();
    @Property(selector = "setAdChoiceConfig:")
    public native void setAdChoiceConfig(AdChoiceConfig v);
    @Property(selector = "iconConfig")
    public native IconConfig getIconConfig();
    @Property(selector = "setIconConfig:")
    public native void setIconConfig(IconConfig v);
    @Property(selector = "videoPlayerConfig")
    public native VideoPlayerConfig getVideoPlayerConfig();
    @Property(selector = "setVideoPlayerConfig:")
    public native void setVideoPlayerConfig(VideoPlayerConfig v);
    @Property(selector = "assetConfig")
    public native NativeAssetConfig getAssetConfig();
    @Property(selector = "setAssetConfig:")
    public native void setAssetConfig(NativeAssetConfig v);
    @Property(selector = "viewabilityConfig")
    public native NativeViewabilityConfig getViewabilityConfig();
    @Property(selector = "setViewabilityConfig:")
    public native void setViewabilityConfig(NativeViewabilityConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
