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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISInterstitialAdapterProtocol/*</name>*/ 
    /*<implements>*/extends ISAdUnitAdapterProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "showInterstitialWithViewController:adapterConfig:delegate:")
    void showInterstitial(UIViewController viewController, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "hasInterstitialWithAdapterConfig:")
    boolean hasInterstitial(ISAdapterConfig adapterConfig);
    @Method(selector = "disposeInterstitialAdWithAdapterConfig:")
    void disposeInterstitialAd(ISAdapterConfig adapterConfig);
    @Method(selector = "initInterstitialWithUserId:adapterConfig:delegate:")
    void initInterstitial(String userId, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "loadInterstitialWithAdapterConfig:adData:delegate:")
    void loadInterstitial(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "getInterstitialBiddingDataWithAdapterConfig:adData:")
    NSDictionary<?, ?> getInterstitialBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectInterstitialBiddingDataWithAdapterConfig:adData:delegate:")
    void collectInterstitialBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "initInterstitialForBiddingWithUserId:adapterConfig:delegate:")
    void initInterstitialForBidding(String userId, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate);
    @Method(selector = "loadInterstitialForBiddingWithAdapterConfig:adData:serverData:delegate:")
    void loadInterstitialForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISInterstitialAdapterDelegate delegate);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
