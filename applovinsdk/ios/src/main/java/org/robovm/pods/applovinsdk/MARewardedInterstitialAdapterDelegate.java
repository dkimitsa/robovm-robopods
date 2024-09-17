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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MARewardedInterstitialAdapterDelegate/*</name>*/ 
    /*<implements>*/extends MAAdapterDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didLoadRewardedInterstitialAd")
    void didLoadRewardedInterstitialAd();
    @Method(selector = "didLoadRewardedInterstitialAdWithExtraInfo:")
    void didLoadRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToLoadRewardedInterstitialAdWithError:")
    void didFailToLoadRewardedInterstitialAd(MAAdapterError adapterError);
    @Method(selector = "didDisplayRewardedInterstitialAd")
    void didDisplayRewardedInterstitialAd();
    @Method(selector = "didDisplayRewardedInterstitialAdWithExtraInfo:")
    void didDisplayRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToDisplayRewardedInterstitialAdWithError:")
    void didFailToDisplayRewardedInterstitialAd(MAAdapterError adapterError);
    @Method(selector = "didFailToDisplayRewardedInterstitialAdWithError:extraInfo:")
    void didFailToDisplayRewardedInterstitialAd(MAAdapterError adapterError, NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didClickRewardedInterstitialAd")
    void didClickRewardedInterstitialAd();
    @Method(selector = "didClickRewardedInterstitialAdWithExtraInfo:")
    void didClickRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didHideRewardedInterstitialAd")
    void didHideRewardedInterstitialAd();
    @Method(selector = "didHideRewardedInterstitialAdWithExtraInfo:")
    void didHideRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didRewardUserWithReward:")
    void didRewardUser(MAReward reward);
    @Method(selector = "didRewardUserWithReward:extraInfo:")
    void didRewardUser(MAReward reward, NSDictionary<NSString, ?> extraInfo);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
