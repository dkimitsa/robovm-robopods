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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALMediationAdapterRouter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALMediationAdapterRouterPtr extends Ptr<ALMediationAdapterRouter, ALMediationAdapterRouterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALMediationAdapterRouter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALMediationAdapterRouter() {}
    protected ALMediationAdapterRouter(Handle h, long handle) { super(h, handle); }
    protected ALMediationAdapterRouter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "completionHandler")
    public native @Block Runnable getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block Runnable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addInterstitialAdapter:delegate:forPlacementIdentifier:")
    public native void addInterstitialAdapter(MAAdapter adapter, MAInterstitialAdapterDelegate delegate, String placementIdentifier);
    @Method(selector = "addAppOpenAdapter:delegate:forPlacementIdentifier:")
    public native void addAppOpenAdapter(MAAdapter adapter, MAAppOpenAdapterDelegate delegate, String placementIdentifier);
    @Method(selector = "addRewardedAdapter:delegate:forPlacementIdentifier:")
    public native void addRewardedAdapter(MAAdapter adapter, MARewardedAdapterDelegate delegate, String placementIdentifier);
    @Method(selector = "addAdViewAdapter:delegate:forPlacementIdentifier:adView:")
    public native void addAdViewAdapter(MAAdapter adapter, MAAdViewAdapterDelegate delegate, String placementIdentifier, UIView adView);
    @Method(selector = "updateAdView:forPlacementIdentifier:")
    public native void updateAdView(UIView adView, String placementIdentifier);
    @Method(selector = "addShowingAdapter:")
    public native void addShowingAdapter(MAAdapter showingAdapter);
    @Method(selector = "removeAdapter:forPlacementIdentifier:")
    public native void removeAdapter(MAAdapter adapter, String placementIdentifier);
    @Method(selector = "didLoadAdForPlacementIdentifier:")
    public native void didLoadAdForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "didLoadAdForPlacementIdentifier:withExtraInfo:")
    public native void didLoadAdForPlacementIdentifier(String placementIdentifier, NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToLoadAdForPlacementIdentifier:error:")
    public native void didFailToLoadAdForPlacementIdentifier(String placementIdentifier, MAAdapterError error);
    @Method(selector = "didDisplayAdForPlacementIdentifier:")
    public native void didDisplayAdForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "didDisplayAdForPlacementIdentifier:withExtraInfo:")
    public native void didDisplayAdForPlacementIdentifier(String placementIdentifier, NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToDisplayAdForPlacementIdentifier:error:")
    public native void didFailToDisplayAdForPlacementIdentifier(String placementIdentifier, MAAdapterError error);
    @Method(selector = "didClickAdForPlacementIdentifier:")
    public native void didClickAdForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "didHideAdForPlacementIdentifier:")
    public native void didHideAdForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "didRewardUserForPlacementIdentifier:withReward:")
    public native void didRewardUserForPlacementIdentifier(String placementIdentifier, MAReward reward);
    @Method(selector = "didExpandAdForPlacementIdentifier:")
    public native void didExpandAdForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "didCollapseAdForPlacementIdentifier:")
    public native void didCollapseAdForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "rewardForPlacementIdentifier:")
    public native MAReward rewardForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "shouldAlwaysRewardUserForPlacementIdentifier:")
    public native boolean shouldAlwaysRewardUserForPlacementIdentifier(String placementIdentifier);
    @Method(selector = "log:becauseOf:")
    public native void log(String message, NSException exception);
    @Method(selector = "sharedInstance")
    public static native ALMediationAdapterRouter sharedInstance();
    /*</methods>*/
}
