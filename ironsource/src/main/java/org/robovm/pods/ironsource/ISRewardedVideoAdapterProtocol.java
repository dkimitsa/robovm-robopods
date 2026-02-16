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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISRewardedVideoAdapterProtocol/*</name>*/ 
    /*<implements>*/extends ISAdUnitAdapterProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "hasRewardedVideoWithAdapterConfig:")
    boolean hasRewardedVideo(ISAdapterConfig adapterConfig);
    @Method(selector = "showRewardedVideoWithViewController:adapterConfig:delegate:")
    void showRewardedVideo(UIViewController viewController, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "destroyRewardedVideoAdWithAdapterConfig:")
    void destroyRewardedVideoAd(ISAdapterConfig adapterConfig);
    @Method(selector = "initAndLoadRewardedVideoWithUserId:adapterConfig:adData:delegate:")
    void initAndLoadRewardedVideo(String userId, ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initRewardedVideoForCallbacksWithUserId:adapterConfig:delegate:")
    void initRewardedVideoForCallbacks(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoWithAdapterConfig:adData:delegate:")
    void loadRewardedVideo(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "getRewardedVideoBiddingDataWithAdapterConfig:adData:")
    NSDictionary<?, ?> getRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectRewardedVideoBiddingDataWithAdapterConfig:adData:delegate:")
    void collectRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "loadRewardedVideoForBiddingWithAdapterConfig:adData:serverData:delegate:")
    void loadRewardedVideoForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initRewardedVideoForDemandOnlyWithUserId:adapterConfig:delegate:")
    void initRewardedVideoForDemandOnly(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoForDemandOnlyWithAdapterConfig:delegate:")
    void loadRewardedVideoForDemandOnly(ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoForDemandOnlyForBiddingWithAdapterConfig:serverData:delegate:")
    void loadRewardedVideoForDemandOnlyForBidding(ISAdapterConfig adapterConfig, String serverData, ISRewardedVideoAdapterDelegate delegate);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
