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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMRewardedAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMRewardedAdPtr extends Ptr<LPMRewardedAd, LPMRewardedAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMRewardedAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LPMRewardedAd() {}
    protected LPMRewardedAd(Handle h, long handle) { super(h, handle); }
    protected LPMRewardedAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitId:")
    public LPMRewardedAd(String adUnitId) { super((SkipInit) null); initObject(init(adUnitId)); }
    @Method(selector = "initWithAdUnitId:config:")
    public LPMRewardedAd(String adUnitId, LPMRewardedAdConfig config) { super((SkipInit) null); initObject(init(adUnitId, config)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adId")
    public native String getAdId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitId:")
    protected native @Pointer long init(String adUnitId);
    @Method(selector = "initWithAdUnitId:config:")
    protected native @Pointer long init(String adUnitId, LPMRewardedAdConfig config);
    @Method(selector = "setDelegate:")
    public native void setDelegate(LPMRewardedAdDelegate delegate);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "showAdWithViewController:placementName:")
    public native void showAd(UIViewController viewController, String placementName);
    @Method(selector = "isAdReady")
    public native boolean isAdReady();
    @Method(selector = "isPlacementCapped:")
    public static native boolean isPlacementCapped(String placementName);
    /*</methods>*/
}
