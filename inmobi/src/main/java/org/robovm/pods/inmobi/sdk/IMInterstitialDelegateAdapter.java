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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMInterstitialDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IMInterstitialDelegate/*</implements>*/ {

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
    @NotImplemented("interstitial:didReceiveWithMetaInfo:")
    public void didReceive(IMInterstitial interstitial, IMAdMetaInfo metaInfo) {}
    @NotImplemented("interstitial:didFailToReceiveWithError:")
    public void didFailToReceive(IMInterstitial interstitial, NSError error) {}
    @NotImplemented("interstitialDidReceiveAd:")
    public void interstitialDidReceiveAd(IMInterstitial interstitial) {}
    @NotImplemented("interstitialDidFinishLoading:")
    public void interstitialDidFinishLoading(IMInterstitial interstitial) {}
    @NotImplemented("interstitial:didFailToLoadWithError:")
    public void didFailToLoad(IMInterstitial interstitial, IMRequestStatus error) {}
    @NotImplemented("interstitialAdImpressed:")
    public void interstitialAdImpressed(IMInterstitial interstitial) {}
    @NotImplemented("interstitialWillPresent:")
    public void interstitialWillPresent(IMInterstitial interstitial) {}
    @NotImplemented("interstitialDidPresent:")
    public void interstitialDidPresent(IMInterstitial interstitial) {}
    @NotImplemented("interstitial:didFailToPresentWithError:")
    public void didFailToPresent(IMInterstitial interstitial, IMRequestStatus error) {}
    @NotImplemented("interstitialWillDismiss:")
    public void interstitialWillDismiss(IMInterstitial interstitial) {}
    @NotImplemented("interstitialDidDismiss:")
    public void interstitialDidDismiss(IMInterstitial interstitial) {}
    @NotImplemented("interstitial:didInteractWithParams:")
    public void didInteract(IMInterstitial interstitial, NSDictionary<NSString, ?> params) {}
    @NotImplemented("interstitial:rewardActionCompletedWithRewards:")
    public void rewardActionCompleted(IMInterstitial interstitial, NSDictionary<NSString, ?> rewards) {}
    @NotImplemented("userWillLeaveApplicationFromInterstitial:")
    public void userWillLeaveApplicationFromInterstitial(IMInterstitial interstitial) {}
    /*</methods>*/
}
