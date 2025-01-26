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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseRewardedVideoAdapter/*</name>*/ 
    extends /*<extends>*/ISBaseAdUnitAdapter/*</extends>*/ 
    /*<implements>*/implements ISRewardedVideoAdapterProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISBaseRewardedVideoAdapterPtr extends Ptr<ISBaseRewardedVideoAdapter, ISBaseRewardedVideoAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseRewardedVideoAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseRewardedVideoAdapter() {}
    protected ISBaseRewardedVideoAdapter(Handle h, long handle) { super(h, handle); }
    protected ISBaseRewardedVideoAdapter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "hasRewardedVideoWithAdapterConfig:")
    public native boolean hasRewardedVideo(ISAdapterConfig adapterConfig);
    @Method(selector = "showRewardedVideoWithViewController:adapterConfig:delegate:")
    public native void showRewardedVideo(UIViewController viewController, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "disposeRewardedVideoAdWithAdapterConfig:")
    public native void disposeRewardedVideoAd(ISAdapterConfig adapterConfig);
    @Method(selector = "initAndLoadRewardedVideoWithUserId:adapterConfig:adData:delegate:")
    public native void initAndLoadRewardedVideo(String userId, ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initRewardedVideoForCallbacksWithUserId:adapterConfig:delegate:")
    public native void initRewardedVideoForCallbacks(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoWithAdapterConfig:adData:delegate:")
    public native void loadRewardedVideo(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "getRewardedVideoBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectRewardedVideoBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectRewardedVideoBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "loadRewardedVideoForBiddingWithAdapterConfig:adData:serverData:delegate:")
    public native void loadRewardedVideoForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "initRewardedVideoForDemandOnlyWithUserId:adapterConfig:delegate:")
    public native void initRewardedVideoForDemandOnly(String userId, ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoForDemandOnlyWithAdapterConfig:delegate:")
    public native void loadRewardedVideoForDemandOnly(ISAdapterConfig adapterConfig, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "loadRewardedVideoForDemandOnlyForBiddingWithAdapterConfig:serverData:delegate:")
    public native void loadRewardedVideoForDemandOnlyForBidding(ISAdapterConfig adapterConfig, String serverData, ISRewardedVideoAdapterDelegate delegate);
    @Method(selector = "releaseMemoryWithAdapterConfig:")
    public native void releaseMemory(ISAdapterConfig adapterConfig);
    /*</methods>*/
}
