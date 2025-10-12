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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.VideoPlayerConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VideoPlayerConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VideoPlayerConfigPtr extends Ptr<VideoPlayerConfig, VideoPlayerConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VideoPlayerConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VideoPlayerConfig() {}
    protected VideoPlayerConfig(Handle h, long handle) { super(h, handle); }
    protected VideoPlayerConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "loopVideoOnComplete")
    public native boolean isLoopVideoOnComplete();
    @Property(selector = "setLoopVideoOnComplete:")
    public native void setLoopVideoOnComplete(boolean v);
    @Property(selector = "progressConfig")
    public native VideoPlayerProgressConfig getProgressConfig();
    @Property(selector = "setProgressConfig:")
    public native void setProgressConfig(VideoPlayerProgressConfig v);
    @Property(selector = "audioConfig")
    public native VideoPlayerAudioConfig getAudioConfig();
    @Property(selector = "setAudioConfig:")
    public native void setAudioConfig(VideoPlayerAudioConfig v);
    @Property(selector = "viewability")
    public native VideoPlayerViewabilityConfig getViewability();
    @Property(selector = "setViewability:")
    public native void setViewability(VideoPlayerViewabilityConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
