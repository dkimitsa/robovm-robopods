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
package org.robovm.pods.ironsource;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseRewardedVideo/*</name>*/ 
    extends /*<extends>*/ISBaseAdInteractionAdapter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISBaseRewardedVideoPtr extends Ptr<ISBaseRewardedVideo, ISBaseRewardedVideoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseRewardedVideo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseRewardedVideo() {}
    protected ISBaseRewardedVideo(Handle h, long handle) { super(h, handle); }
    protected ISBaseRewardedVideo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "init:")
    public ISBaseRewardedVideo(ISAdapterConfig providerConfig) { super((SkipInit) null); initObject(init(providerConfig)); }
    @Method(selector = "initWithAdFormat:adapterConfig:")
    public ISBaseRewardedVideo(String adFormat, ISAdapterConfig adapterConfig) { super(adFormat, adapterConfig); }
    @Method(selector = "initWithAdFormat:adapterConfig:adUnitObjectId:")
    public ISBaseRewardedVideo(String adFormat, ISAdapterConfig adapterConfig, NSUUID adUnitObjectId) { super(adFormat, adapterConfig, adUnitObjectId); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "init:")
    protected native @Pointer long init(ISAdapterConfig providerConfig);
    @Method(selector = "loadAdWithAdData:delegate:")
    public native void loadAd(ISAdData adData, ISRewardedVideoAdDelegate delegate);
    @Method(selector = "showAdWithViewController:adData:delegate:")
    public native void showAd(UIViewController viewController, ISAdData adData, ISRewardedVideoAdDelegate delegate);
    /*</methods>*/
}
