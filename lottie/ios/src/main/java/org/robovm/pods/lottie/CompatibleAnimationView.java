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
package org.robovm.pods.lottie;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("Lottie.CompatibleAnimationView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CompatibleAnimationView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CompatibleAnimationViewPtr extends Ptr<CompatibleAnimationView, CompatibleAnimationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CompatibleAnimationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CompatibleAnimationView() {}
    protected CompatibleAnimationView(Handle h, long handle) { super(h, handle); }
    protected CompatibleAnimationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompatibleAnimation:")
    public CompatibleAnimationView(CompatibleAnimation compatibleAnimation) { super((SkipInit) null); initObject(init(compatibleAnimation)); }
    @Method(selector = "initWithCompatibleAnimation:compatibleRenderingEngineOption:")
    public CompatibleAnimationView(CompatibleAnimation compatibleAnimation, CompatibleRenderingEngineOption compatibleRenderingEngineOption) { super((SkipInit) null); initObject(init(compatibleAnimation, compatibleRenderingEngineOption)); }
    @Method(selector = "initWithUrl:")
    public CompatibleAnimationView(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithUrl:compatibleRenderingEngineOption:")
    public CompatibleAnimationView(NSURL url, CompatibleRenderingEngineOption compatibleRenderingEngineOption) { super((SkipInit) null); initObject(init(url, compatibleRenderingEngineOption)); }
    @Method(selector = "initWithData:")
    public CompatibleAnimationView(NSData data) { super((SkipInit) null); initObject(init(data)); }
    @Method(selector = "initWithData:compatibleRenderingEngineOption:")
    public CompatibleAnimationView(NSData data, CompatibleRenderingEngineOption compatibleRenderingEngineOption) { super((SkipInit) null); initObject(init(data, compatibleRenderingEngineOption)); }
    @Method(selector = "initWithFrame:")
    public CompatibleAnimationView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public CompatibleAnimationView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "compatibleAnimation")
    public native CompatibleAnimation getCompatibleAnimation();
    @Property(selector = "setCompatibleAnimation:")
    public native void setCompatibleAnimation(CompatibleAnimation v);
    @Property(selector = "loopAnimationCount")
    public native @MachineSizedFloat double getLoopAnimationCount();
    @Property(selector = "setLoopAnimationCount:")
    public native void setLoopAnimationCount(@MachineSizedFloat double v);
    @Property(selector = "compatibleDictionaryTextProvider")
    public native CompatibleDictionaryTextProvider getCompatibleDictionaryTextProvider();
    @Property(selector = "setCompatibleDictionaryTextProvider:")
    public native void setCompatibleDictionaryTextProvider(CompatibleDictionaryTextProvider v);
    @Property(selector = "contentMode")
    public native UIViewContentMode getContentMode();
    @Property(selector = "setContentMode:")
    public native void setContentMode(UIViewContentMode v);
    @Property(selector = "shouldRasterizeWhenIdle")
    public native boolean shouldRasterizeWhenIdle();
    @Property(selector = "setShouldRasterizeWhenIdle:")
    public native void setShouldRasterizeWhenIdle(boolean v);
    @Property(selector = "currentProgress")
    public native @MachineSizedFloat double getCurrentProgress();
    @Property(selector = "setCurrentProgress:")
    public native void setCurrentProgress(@MachineSizedFloat double v);
    @Property(selector = "duration")
    public native @MachineSizedFloat double getDuration();
    @Property(selector = "currentTime")
    public native double getCurrentTime();
    @Property(selector = "setCurrentTime:")
    public native void setCurrentTime(double v);
    @Property(selector = "currentFrame")
    public native @MachineSizedFloat double getCurrentFrame();
    @Property(selector = "setCurrentFrame:")
    public native void setCurrentFrame(@MachineSizedFloat double v);
    @Property(selector = "realtimeAnimationFrame")
    public native @MachineSizedFloat double getRealtimeAnimationFrame();
    @Property(selector = "realtimeAnimationProgress")
    public native @MachineSizedFloat double getRealtimeAnimationProgress();
    @Property(selector = "animationSpeed")
    public native @MachineSizedFloat double getAnimationSpeed();
    @Property(selector = "setAnimationSpeed:")
    public native void setAnimationSpeed(@MachineSizedFloat double v);
    @Property(selector = "respectAnimationFrameRate")
    public native boolean isRespectAnimationFrameRate();
    @Property(selector = "setRespectAnimationFrameRate:")
    public native void setRespectAnimationFrameRate(boolean v);
    @Property(selector = "isAnimationPlaying")
    public native boolean isAnimationPlaying();
    @Property(selector = "backgroundMode")
    public native CompatibleBackgroundBehavior getBackgroundMode();
    @Property(selector = "setBackgroundMode:")
    public native void setBackgroundMode(CompatibleBackgroundBehavior v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCompatibleAnimation:")
    protected native @Pointer long init(CompatibleAnimation compatibleAnimation);
    @Method(selector = "initWithCompatibleAnimation:compatibleRenderingEngineOption:")
    protected native @Pointer long init(CompatibleAnimation compatibleAnimation, CompatibleRenderingEngineOption compatibleRenderingEngineOption);
    @Method(selector = "initWithUrl:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "initWithUrl:compatibleRenderingEngineOption:")
    protected native @Pointer long init(NSURL url, CompatibleRenderingEngineOption compatibleRenderingEngineOption);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "initWithData:compatibleRenderingEngineOption:")
    protected native @Pointer long init(NSData data, CompatibleRenderingEngineOption compatibleRenderingEngineOption);
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "play")
    public native void play();
    @Method(selector = "playWithCompletion:")
    public native void play(@Block VoidBooleanBlock completion);
    @Method(selector = "playFromProgress:toProgress:completion:")
    public native void playFromProgress(@MachineSizedFloat double fromProgress, @MachineSizedFloat double toProgress, @Block VoidBooleanBlock completion);
    @Method(selector = "playFromFrame:toFrame:completion:")
    public native void playFromFrame(@MachineSizedFloat double fromFrame, @MachineSizedFloat double toFrame, @Block VoidBooleanBlock completion);
    @Method(selector = "playFromMarker:toMarker:completion:")
    public native void playFromMarker(String fromMarker, String toMarker, @Block VoidBooleanBlock completion);
    @Method(selector = "playWithMarker:completion:")
    public native void play(String marker, @Block VoidBooleanBlock completion);
    @Method(selector = "stop")
    public native void stop();
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "reloadImages")
    public native void reloadImages();
    @Method(selector = "forceDisplayUpdate")
    public native void forceDisplayUpdate();
    @Method(selector = "getValueFor:atFrame:")
    public native NSObject getValue(CompatibleAnimationKeypath keypath, @MachineSizedFloat double atFrame);
    @Method(selector = "logHierarchyKeypaths")
    public native void logHierarchyKeypaths();
    @Method(selector = "setColorValue:forKeypath:")
    public native void setColorValue(UIColor color, CompatibleAnimationKeypath keypath);
    @Method(selector = "getColorValueFor:atFrame:")
    public native UIColor getColorValue(CompatibleAnimationKeypath keypath, @MachineSizedFloat double atFrame);
    @Method(selector = "addSubview:forLayerAt:")
    public native void addSubview(AnimationSubview subview, CompatibleAnimationKeypath keypath);
    @Method(selector = "convertWithRect:toLayerAt:")
    public native @ByVal CGRect convert(@ByVal CGRect rect, CompatibleAnimationKeypath keypath);
    @Method(selector = "convertWithPoint:toLayerAt:")
    public native @ByVal CGPoint convert(@ByVal CGPoint point, CompatibleAnimationKeypath keypath);
    @Method(selector = "progressTimeForMarker:")
    public native @MachineSizedFloat double progressTimeForMarker(String named);
    @Method(selector = "frameTimeForMarker:")
    public native @MachineSizedFloat double frameTimeForMarker(String named);
    @Method(selector = "durationFrameTimeForMarker:")
    public native @MachineSizedFloat double durationFrameTimeForMarker(String named);
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
