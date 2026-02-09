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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MARewardedAdapterDelegate/*</name>*/ 
    /*<implements>*/extends MAAdapterDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didLoadRewardedAd")
    void didLoadRewardedAd();
    @Method(selector = "didLoadRewardedAdWithExtraInfo:")
    void didLoadRewardedAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToLoadRewardedAdWithError:")
    void didFailToLoadRewardedAd(MAAdapterError adapterError);
    @Method(selector = "didDisplayRewardedAd")
    void didDisplayRewardedAd();
    @Method(selector = "didDisplayRewardedAdWithExtraInfo:")
    void didDisplayRewardedAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToDisplayRewardedAdWithError:")
    void didFailToDisplayRewardedAd(MAAdapterError adapterError);
    @Method(selector = "didFailToDisplayRewardedAdWithError:extraInfo:")
    void didFailToDisplayRewardedAd(MAAdapterError adapterError, NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didClickRewardedAd")
    void didClickRewardedAd();
    @Method(selector = "didClickRewardedAdWithExtraInfo:")
    void didClickRewardedAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didHideRewardedAd")
    void didHideRewardedAd();
    @Method(selector = "didHideRewardedAdWithExtraInfo:")
    void didHideRewardedAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didRewardUserWithReward:")
    void didRewardUser(MAReward reward);
    @Method(selector = "didRewardUserWithReward:extraInfo:")
    void didRewardUser(MAReward reward, NSDictionary<NSString, ?> extraInfo);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
