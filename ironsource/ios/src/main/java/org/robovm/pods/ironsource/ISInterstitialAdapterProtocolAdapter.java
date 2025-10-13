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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISInterstitialAdapterProtocolAdapter/*</name>*/ 
    extends /*<extends>*/ISAdUnitAdapterProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements ISInterstitialAdapterProtocol/*</implements>*/ {

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
    @NotImplemented("showInterstitialWithViewController:adapterConfig:delegate:")
    public void showInterstitial(UIViewController viewController, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate) {}
    @NotImplemented("hasInterstitialWithAdapterConfig:")
    public boolean hasInterstitial(ISAdapterConfig adapterConfig) { return false; }
    @NotImplemented("destroyInterstitialAdWithAdapterConfig:")
    public void destroyInterstitialAd(ISAdapterConfig adapterConfig) {}
    @NotImplemented("initInterstitialWithUserId:adapterConfig:delegate:")
    public void initInterstitial(String userId, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate) {}
    @NotImplemented("loadInterstitialWithAdapterConfig:adData:delegate:")
    public void loadInterstitial(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISInterstitialAdapterDelegate delegate) {}
    @NotImplemented("getInterstitialBiddingDataWithAdapterConfig:adData:")
    public NSDictionary<?, ?> getInterstitialBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData) { return null; }
    @NotImplemented("collectInterstitialBiddingDataWithAdapterConfig:adData:delegate:")
    public void collectInterstitialBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate) {}
    @NotImplemented("initInterstitialForBiddingWithUserId:adapterConfig:delegate:")
    public void initInterstitialForBidding(String userId, ISAdapterConfig adapterConfig, ISInterstitialAdapterDelegate delegate) {}
    @NotImplemented("loadInterstitialForBiddingWithAdapterConfig:adData:serverData:delegate:")
    public void loadInterstitialForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISInterstitialAdapterDelegate delegate) {}
    /*</methods>*/
}
