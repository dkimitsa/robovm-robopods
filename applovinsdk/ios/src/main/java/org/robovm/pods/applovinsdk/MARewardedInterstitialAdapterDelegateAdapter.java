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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MARewardedInterstitialAdapterDelegateAdapter/*</name>*/ 
    extends /*<extends>*/MAAdapterDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements MARewardedInterstitialAdapterDelegate/*</implements>*/ {

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
    @NotImplemented("didLoadRewardedInterstitialAd")
    public void didLoadRewardedInterstitialAd() {}
    @NotImplemented("didLoadRewardedInterstitialAdWithExtraInfo:")
    public void didLoadRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didFailToLoadRewardedInterstitialAdWithError:")
    public void didFailToLoadRewardedInterstitialAd(MAAdapterError adapterError) {}
    @NotImplemented("didDisplayRewardedInterstitialAd")
    public void didDisplayRewardedInterstitialAd() {}
    @NotImplemented("didDisplayRewardedInterstitialAdWithExtraInfo:")
    public void didDisplayRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didFailToDisplayRewardedInterstitialAdWithError:")
    public void didFailToDisplayRewardedInterstitialAd(MAAdapterError adapterError) {}
    @NotImplemented("didFailToDisplayRewardedInterstitialAdWithError:extraInfo:")
    public void didFailToDisplayRewardedInterstitialAd(MAAdapterError adapterError, NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didClickRewardedInterstitialAd")
    public void didClickRewardedInterstitialAd() {}
    @NotImplemented("didClickRewardedInterstitialAdWithExtraInfo:")
    public void didClickRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didHideRewardedInterstitialAd")
    public void didHideRewardedInterstitialAd() {}
    @NotImplemented("didHideRewardedInterstitialAdWithExtraInfo:")
    public void didHideRewardedInterstitialAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didRewardUserWithReward:")
    public void didRewardUser(MAReward reward) {}
    @NotImplemented("didRewardUserWithReward:extraInfo:")
    public void didRewardUser(MAReward reward, NSDictionary<NSString, ?> extraInfo) {}
    /*</methods>*/
}
