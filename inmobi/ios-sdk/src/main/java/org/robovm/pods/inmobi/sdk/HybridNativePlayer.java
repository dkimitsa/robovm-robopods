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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.HybridNativePlayer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HybridNativePlayer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HybridNativePlayerPtr extends Ptr<HybridNativePlayer, HybridNativePlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HybridNativePlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HybridNativePlayer() {}
    protected HybridNativePlayer(Handle h, long handle) { super(h, handle); }
    protected HybridNativePlayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRenderView:")
    public HybridNativePlayer(UIView renderView) { super((SkipInit) null); initObject(init(renderView)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "videoView")
    public native UIView getVideoView();
    @Property(selector = "isOMSDKEnabled")
    public native boolean isOMSDKEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRenderView:")
    protected native @Pointer long init(UIView renderView);
    @Method(selector = "processCommandWithCommand:params:")
    public native void processCommand(String command, NSDictionary<NSString, ?> params);
    @Method(selector = "attachToWindow:")
    public native void attachToWindow(UIWindow newWindow);
    @Method(selector = "isHybridPlayerViewableWithIsViewable:")
    public native void isHybridPlayerViewable(boolean isViewable);
    @Method(selector = "cleanup")
    public native void cleanup();
    @Method(selector = "fireVideoPositionChangeEvent")
    public native void fireVideoPositionChangeEvent();
    /*</methods>*/
}
