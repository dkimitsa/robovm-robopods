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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBMediaViewVideoRenderer/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBMediaViewVideoRendererPtr extends Ptr<FBMediaViewVideoRenderer, FBMediaViewVideoRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBMediaViewVideoRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBMediaViewVideoRenderer() {}
    protected FBMediaViewVideoRenderer(Handle h, long handle) { super(h, handle); }
    protected FBMediaViewVideoRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public FBMediaViewVideoRenderer(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public FBMediaViewVideoRenderer(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "aspectRatio")
    public native @MachineSizedFloat double getAspectRatio();
    @Property(selector = "currentTime")
    public native @ByVal CMTime getCurrentTime();
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    @Property(selector = "isPlaying")
    public native boolean isPlaying();
    @Property(selector = "volume")
    public native float getVolume();
    @Property(selector = "setVolume:")
    public native void setVolume(float v);
    @Property(selector = "videoLoopTimes")
    public native @MachineSizedUInt long getVideoLoopTimes();
    @Property(selector = "setVideoLoopTimes:")
    public native void setVideoLoopTimes(@MachineSizedUInt long v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "playVideo")
    public native void playVideo();
    @Method(selector = "replayOrStopVideo")
    public native void replayOrStopVideo();
    @Method(selector = "pauseVideo")
    public native void pauseVideo();
    @Method(selector = "engageVideoSeek")
    public native void engageVideoSeek();
    @Method(selector = "disengageVideoSeek")
    public native void disengageVideoSeek();
    @Method(selector = "seekVideoToTime:")
    public native void seekVideoToTime(@ByVal CMTime time);
    @Method(selector = "addPeriodicTimeObserverForInterval:queue:usingBlock:")
    public native NSObject addPeriodicTimeObserver(@ByVal CMTime interval, DispatchQueue queue, @Block("(@ByVal)") VoidBlock1<CMTime> block);
    @Method(selector = "removeTimeObserver:")
    public native void removeTimeObserver(NSObject observer);
    @Method(selector = "videoDidChangeVolume")
    public native void videoDidChangeVolume();
    @Method(selector = "videoDidLoad")
    public native void videoDidLoad();
    @Method(selector = "videoDidPause")
    public native void videoDidPause();
    @Method(selector = "videoDidPlay")
    public native void videoDidPlay();
    @Method(selector = "videoDidEngageSeek")
    public native void videoDidEngageSeek();
    @Method(selector = "videoDidSeek")
    public native void videoDidSeek();
    @Method(selector = "videoDidDisengageSeek")
    public native void videoDidDisengageSeek();
    @Method(selector = "videoDidEnd")
    public native void videoDidEnd();
    @Method(selector = "videoDidFailWithError:")
    public native void videoDidFail(NSError error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
