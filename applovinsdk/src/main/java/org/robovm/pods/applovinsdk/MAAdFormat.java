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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdFormat/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdFormatPtr extends Ptr<MAAdFormat, MAAdFormatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAdFormat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAdFormat() {}
    protected MAAdFormat(Handle h, long handle) { super(h, handle); }
    protected MAAdFormat(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "banner")
    public static native MAAdFormat getBanner();
    @Property(selector = "mrec")
    public static native MAAdFormat getMrec();
    @Property(selector = "leader")
    public static native MAAdFormat getLeader();
    @Property(selector = "interstitial")
    public static native MAAdFormat getInterstitial();
    @Property(selector = "appOpen")
    public static native MAAdFormat getAppOpen();
    @Property(selector = "rewarded")
    public static native MAAdFormat getRewarded();
    @Property(selector = "native")
    public static native MAAdFormat getNative();
    /**
     * @deprecated Rewarded interstitial ads have been removed and this property will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "rewardedInterstitial")
    public static native MAAdFormat getRewardedInterstitial();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "adaptiveSize")
    public native @ByVal CGSize getAdaptiveSize();
    @Property(selector = "isFullscreenAd")
    public native boolean isFullscreenAd();
    @Property(selector = "isAdViewAd")
    public native boolean isAdViewAd();
    @Property(selector = "isBannerOrLeaderAd")
    public native boolean isBannerOrLeaderAd();
    @Property(selector = "displayName")
    public native String getDisplayName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "adaptiveSizeForWidth:")
    public native @ByVal CGSize adaptiveSizeForWidth(@MachineSizedFloat double width);
    /*</methods>*/
}
