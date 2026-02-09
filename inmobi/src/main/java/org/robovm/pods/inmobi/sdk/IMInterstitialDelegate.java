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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/IMInterstitialDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "interstitial:didReceiveWithMetaInfo:")
    void didReceive(IMInterstitial interstitial, IMAdMetaInfo metaInfo);
    @Method(selector = "interstitial:didFailToReceiveWithError:")
    void didFailToReceive(IMInterstitial interstitial, NSError error);
    @Method(selector = "interstitialDidReceiveAd:")
    void interstitialDidReceiveAd(IMInterstitial interstitial);
    @Method(selector = "interstitialDidFinishLoading:")
    void interstitialDidFinishLoading(IMInterstitial interstitial);
    @Method(selector = "interstitial:didFailToLoadWithError:")
    void didFailToLoad(IMInterstitial interstitial, IMRequestStatus error);
    @Method(selector = "interstitialAdImpressed:")
    void interstitialAdImpressed(IMInterstitial interstitial);
    @Method(selector = "interstitialWillPresent:")
    void interstitialWillPresent(IMInterstitial interstitial);
    @Method(selector = "interstitialDidPresent:")
    void interstitialDidPresent(IMInterstitial interstitial);
    @Method(selector = "interstitial:didFailToPresentWithError:")
    void didFailToPresent(IMInterstitial interstitial, IMRequestStatus error);
    @Method(selector = "interstitialWillDismiss:")
    void interstitialWillDismiss(IMInterstitial interstitial);
    @Method(selector = "interstitialDidDismiss:")
    void interstitialDidDismiss(IMInterstitial interstitial);
    @Method(selector = "interstitial:didInteractWithParams:")
    void didInteract(IMInterstitial interstitial, NSDictionary<NSString, ?> params);
    @Method(selector = "interstitial:rewardActionCompletedWithRewards:")
    void rewardActionCompleted(IMInterstitial interstitial, NSDictionary<NSString, ?> rewards);
    @Method(selector = "userWillLeaveApplicationFromInterstitial:")
    void userWillLeaveApplicationFromInterstitial(IMInterstitial interstitial);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
