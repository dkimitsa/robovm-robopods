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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IronSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IronSourcePtr extends Ptr<IronSource, IronSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IronSource.class); }/*</bind>*/
    /*<constants>*/
    public static final String IS_REWARDED_VIDEO = "rewardedvideo";
    public static final String IS_INTERSTITIAL = "interstitial";
    public static final String IS_BANNER = "banner";
    public static final String IS_NATIVE_AD = "nativead";
    public static final String getSdkVersion = "9.4.1";
    /*</constants>*/
    /*<constructors>*/
    public IronSource() {}
    protected IronSource(Handle h, long handle) { super(h, handle); }
    protected IronSource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated For LevelPlay, use [LevelPlay sdkVersion]. For IronSourceAds, use [IronSourceAds sdkVersion].
     */
    @Deprecated
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "setMediationType:")
    public static native void setMediationType(String mediationType);
    @Method(selector = "getISDemandOnlyBiddingData")
    public static native String getISDemandOnlyBiddingData();
    @Method(selector = "setISDemandOnlyRewardedVideoDelegate:")
    public static native void setISDemandOnlyRewardedVideoDelegate(ISDemandOnlyRewardedVideoDelegate delegate);
    @Method(selector = "loadISDemandOnlyRewardedVideo:")
    public static native void loadISDemandOnlyRewardedVideo(String instanceId);
    @Method(selector = "showISDemandOnlyRewardedVideo:instanceId:")
    public static native void showISDemandOnlyRewardedVideo(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyRewardedVideo:")
    public static native boolean hasISDemandOnlyRewardedVideo(String instanceId);
    @Method(selector = "setISDemandOnlyInterstitialDelegate:")
    public static native void setISDemandOnlyInterstitialDelegate(ISDemandOnlyInterstitialDelegate delegate);
    @Method(selector = "loadISDemandOnlyInterstitial:")
    public static native void loadISDemandOnlyInterstitial(String instanceId);
    @Method(selector = "showISDemandOnlyInterstitial:instanceId:")
    public static native void showISDemandOnlyInterstitial(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyInterstitial:")
    public static native boolean hasISDemandOnlyInterstitial(String instanceId);
    @Method(selector = "setISDemandOnlyBannerDelegate:forInstanceId:")
    public static native void setISDemandOnlyBannerDelegate(ISDemandOnlyBannerDelegate delegate, String instanceId);
    @Method(selector = "loadISDemandOnlyBannerWithInstanceId:viewController:size:")
    public static native void loadISDemandOnlyBanner(String instanceId, UIViewController viewController, ISBannerSize size);
    @Method(selector = "destroyISDemandOnlyBannerWithInstanceId:")
    public static native void destroyISDemandOnlyBanner(String instanceId);
    @Method(selector = "setAdRevenueDataWithDataSource:impressionData:")
    public static native void setAdRevenueData(String dataSource, NSData impressionData);
    /*</methods>*/
}
