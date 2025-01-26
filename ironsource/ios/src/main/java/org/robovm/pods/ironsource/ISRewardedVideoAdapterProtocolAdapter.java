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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISRewardedVideoAdapterProtocolAdapter/*</name>*/ 
    extends /*<extends>*/ISAdUnitAdapterProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements ISRewardedVideoAdapterProtocol/*</implements>*/ {

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
    @NotImplemented("hasRewardedVideoWithAdapterConfig:")
    public boolean hasRewardedVideo(ISAdapterConfig adapterConfig) { return false; }
    @NotImplemented("showRewardedVideoWithViewController:adapterConfig:delegate:")
    public void showRewardedVideo(UIViewController viewController, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("disposeRewardedVideoAdWithAdapterConfig:")
    public void disposeRewardedVideoAd(ISAdapterConfig adapterConfig) {}
    @NotImplemented("initAndLoadRewardedVideoWithUserId:adapterConfig:adData:delegate:")
    public void initAndLoadRewardedVideo(String userId, ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("initRewardedVideoForCallbacksWithUserId:adapterConfig:delegate:")
    public void initRewardedVideoForCallbacks(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("loadRewardedVideoWithAdapterConfig:adData:delegate:")
    public void loadRewardedVideo(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("getRewardedVideoBiddingDataWithAdapterConfig:adData:")
    public NSDictionary<?, ?> getRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData) { return null; }
    @NotImplemented("collectRewardedVideoBiddingDataWithAdapterConfig:adData:delegate:")
    public void collectRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate) {}
    @NotImplemented("loadRewardedVideoForBiddingWithAdapterConfig:adData:serverData:delegate:")
    public void loadRewardedVideoForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("initRewardedVideoForDemandOnlyWithUserId:adapterConfig:delegate:")
    public void initRewardedVideoForDemandOnly(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("loadRewardedVideoForDemandOnlyWithAdapterConfig:delegate:")
    public void loadRewardedVideoForDemandOnly(ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate) {}
    @NotImplemented("loadRewardedVideoForDemandOnlyForBiddingWithAdapterConfig:serverData:delegate:")
    public void loadRewardedVideoForDemandOnlyForBidding(ISAdapterConfig adapterConfig, String serverData, ISRewardedVideoAdapterDelegate delegate) {}
    /*</methods>*/
}
