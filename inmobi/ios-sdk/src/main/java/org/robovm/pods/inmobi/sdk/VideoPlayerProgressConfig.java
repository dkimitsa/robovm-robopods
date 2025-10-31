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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.VideoPlayerProgressConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VideoPlayerProgressConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VideoPlayerProgressConfigPtr extends Ptr<VideoPlayerProgressConfig, VideoPlayerProgressConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VideoPlayerProgressConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VideoPlayerProgressConfig() {}
    protected VideoPlayerProgressConfig(Handle h, long handle) { super(h, handle); }
    protected VideoPlayerProgressConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "showProgress")
    public native boolean isShowProgress();
    @Property(selector = "setShowProgress:")
    public native void setShowProgress(boolean v);
    @Property(selector = "foregroundColor")
    public native NSArray<NSNumber> getForegroundColor();
    @Property(selector = "setForegroundColor:")
    public native void setForegroundColor(NSArray<NSNumber> v);
    @Property(selector = "backgroundColor")
    public native NSArray<NSNumber> getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(NSArray<NSNumber> v);
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    @Property(selector = "setHeight:")
    public native void setHeight(@MachineSizedSInt long v);
    @Property(selector = "progressPolling")
    public native @MachineSizedSInt long getProgressPolling();
    @Property(selector = "setProgressPolling:")
    public native void setProgressPolling(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
