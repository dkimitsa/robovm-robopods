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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMNativeDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IMNativeDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("nativeDidFinishLoading:")
    public void nativeDidFinishLoading(IMNative _native) {}
    @NotImplemented("native:didFailToLoadWithError:")
    public void didFailToLoad(IMNative _native, IMRequestStatus error) {}
    @NotImplemented("nativeWillPresentScreen:")
    public void nativeWillPresentScreen(IMNative _native) {}
    @NotImplemented("nativeDidPresentScreen:")
    public void nativeDidPresentScreen(IMNative _native) {}
    @NotImplemented("nativeWillDismissScreen:")
    public void nativeWillDismissScreen(IMNative _native) {}
    @NotImplemented("nativeDidDismissScreen:")
    public void nativeDidDismissScreen(IMNative _native) {}
    @NotImplemented("userWillLeaveApplicationFromNative:")
    public void userWillLeaveApplicationFromNative(IMNative _native) {}
    @NotImplemented("nativeAdImpressed:")
    public void nativeAdImpressed(IMNative _native) {}
    @NotImplemented("native:didInteractWithParams:")
    public void didInteract(IMNative _native, NSDictionary<NSString, ?> params) {}
    @NotImplemented("nativeDidFinishPlayingMedia:")
    public void nativeDidFinishPlayingMedia(IMNative _native) {}
    @NotImplemented("native:adAudioStateChanged:")
    public void adAudioStateChanged(IMNative _native, boolean audioStateMuted) {}
    /*</methods>*/
}
