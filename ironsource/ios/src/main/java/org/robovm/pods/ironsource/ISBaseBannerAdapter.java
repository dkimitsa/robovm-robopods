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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseBannerAdapter/*</name>*/ 
    extends /*<extends>*/ISBaseAdUnitAdapter/*</extends>*/ 
    /*<implements>*/implements ISBannerAdapterProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISBaseBannerAdapterPtr extends Ptr<ISBaseBannerAdapter, ISBaseBannerAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseBannerAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseBannerAdapter() {}
    protected ISBaseBannerAdapter(Handle h, long handle) { super(h, handle); }
    protected ISBaseBannerAdapter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "destroyBannerWithAdapterConfig:")
    public native void destroyBanner(ISAdapterConfig adapterConfig);
    @Method(selector = "getAdaptiveHeightWithWidth:")
    public native @MachineSizedFloat double getAdaptiveHeight(@MachineSizedFloat double width);
    @Method(selector = "initBannerWithUserId:adapterConfig:delegate:")
    public native void initBanner(String userId, ISAdapterConfig adapterConfig, ISBannerAdapterDelegate delegate);
    @Method(selector = "loadBannerWithAdapterConfig:adData:viewController:size:delegate:")
    public native void loadBanner(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, UIViewController viewController, ISBannerSize size, ISBannerAdapterDelegate delegate);
    @Method(selector = "getBannerBiddingDataWithAdapterConfig:adData:")
    public native NSDictionary<?, ?> getBannerBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData);
    @Method(selector = "collectBannerBiddingDataWithAdapterConfig:adData:delegate:")
    public native void collectBannerBiddingData(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, ISBiddingDataDelegate delegate);
    @Method(selector = "initBannerForBiddingWithUserId:adapterConfig:delegate:")
    public native void initBannerForBidding(String userId, ISAdapterConfig adapterConfig, ISBannerAdapterDelegate delegate);
    @Method(selector = "loadBannerForBiddingWithAdapterConfig:adData:serverData:viewController:size:delegate:")
    public native void loadBannerForBidding(ISAdapterConfig adapterConfig, NSDictionary<?, ?> adData, String serverData, UIViewController viewController, ISBannerSize size, ISBannerAdapterDelegate delegate);
    /*</methods>*/
}
