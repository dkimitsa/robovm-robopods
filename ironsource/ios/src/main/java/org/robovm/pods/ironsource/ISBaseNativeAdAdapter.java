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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseNativeAdAdapter/*</name>*/ 
    extends /*<extends>*/ISBaseAdUnitAdapter/*</extends>*/ 
    /*<implements>*/implements ISNativeAdAdapterProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISBaseNativeAdAdapterPtr extends Ptr<ISBaseNativeAdAdapter, ISBaseNativeAdAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseNativeAdAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseNativeAdAdapter() {}
    protected ISBaseNativeAdAdapter(Handle h, long handle) { super(h, handle); }
    protected ISBaseNativeAdAdapter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getNativeAdPropertiesWithAdapterConfig:")
    public native ISNativeAdProperties getNativeAdProperties(ISAdapterConfig adapterConfig);
    @Method(selector = "initNativeAdsWithUserId:adapterConfig:delegate:")
    public native void initNativeAds(String userId, ISAdapterConfig adapterConfig, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "initNativeAdForBiddingWithUserId:adapterConfig:delegate:")
    public native void initNativeAdForBidding(String userId, ISAdapterConfig adapterConfig, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "loadNativeAdWithAdapterConfig:adData:viewController:delegate:")
    public native void loadNativeAdWithAdapterConfig(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, UIViewController viewController, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "loadNativeAdForBiddingWithAdapterConfig:adData:serverData:viewController:delegate:")
    public native void loadNativeAdForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, UIViewController viewController, ISNativeAdAdapterDelegate delegate);
    @Method(selector = "destroyNativeAdWithAdapterConfig:")
    public native void destroyNativeAd(ISAdapterConfig adapterConfig);
    @Method(selector = "getNativeAdBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getNativeAdBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectNativeAdBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectNativeAdBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    /*</methods>*/
}
