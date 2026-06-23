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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADSwipeableInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADSwipeableInterstitialAdPtr extends Ptr<GADSwipeableInterstitialAd, GADSwipeableInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADSwipeableInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADSwipeableInterstitialAd() {}
    protected GADSwipeableInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected GADSwipeableInterstitialAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adView")
    public native UIView getAdView();
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "responseInfo")
    public native GADResponseInfo getResponseInfo();
    @Property(selector = "paidEventHandler")
    public native @Block VoidBlock1<GADAdValue> getPaidEventHandler();
    @Property(selector = "setPaidEventHandler:")
    public native void setPaidEventHandler(@Block VoidBlock1<GADAdValue> v);
    @Property(selector = "delegate")
    public native GADSwipeableInterstitialAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GADSwipeableInterstitialAdDelegate v);
    @Property(selector = "videoControllerDelegate")
    public native GADVideoControllerDelegate getVideoControllerDelegate();
    @Property(selector = "setVideoControllerDelegate:", strongRef = true)
    public native void setVideoControllerDelegate(GADVideoControllerDelegate v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "minScreenHoldDuration")
    public native double getMinScreenHoldDuration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadWithAdUnitID:request:options:completionHandler:")
    public static native void load(String adUnitID, GADRequest request, GADSwipeableInterstitialAdOptions options, @Block VoidBlock2<GADSwipeableInterstitialAd, NSError> completionHandler);
    /*</methods>*/
}
