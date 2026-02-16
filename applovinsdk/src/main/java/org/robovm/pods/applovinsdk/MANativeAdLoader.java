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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MANativeAdLoader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MANativeAdLoaderPtr extends Ptr<MANativeAdLoader, MANativeAdLoaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MANativeAdLoader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MANativeAdLoader() {}
    protected MANativeAdLoader(Handle h, long handle) { super(h, handle); }
    protected MANativeAdLoader(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitIdentifier:")
    public MANativeAdLoader(String adUnitIdentifier) { super((SkipInit) null); initObject(init(adUnitIdentifier)); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[MANativeAdLoader initWithAdUnitIdentifier:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithAdUnitIdentifier:sdk:")
    public MANativeAdLoader(String adUnitIdentifier, ALSdk sdk) { super((SkipInit) null); initObject(init(adUnitIdentifier, sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nativeAdDelegate")
    public native MANativeAdDelegate getNativeAdDelegate();
    @Property(selector = "setNativeAdDelegate:", strongRef = true)
    public native void setNativeAdDelegate(MANativeAdDelegate v);
    @Property(selector = "revenueDelegate")
    public native MAAdRevenueDelegate getRevenueDelegate();
    @Property(selector = "setRevenueDelegate:", strongRef = true)
    public native void setRevenueDelegate(MAAdRevenueDelegate v);
    @Property(selector = "adReviewDelegate")
    public native MAAdReviewDelegate getAdReviewDelegate();
    @Property(selector = "setAdReviewDelegate:", strongRef = true)
    public native void setAdReviewDelegate(MAAdReviewDelegate v);
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "setPlacement:")
    public native void setPlacement(String v);
    @Property(selector = "adUnitIdentifier")
    public native String getAdUnitIdentifier();
    @Property(selector = "customData")
    public native String getCustomData();
    @Property(selector = "setCustomData:")
    public native void setCustomData(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitIdentifier:")
    protected native @Pointer long init(String adUnitIdentifier);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "loadAdIntoAdView:")
    public native void loadAdIntoAdView(MANativeAdView adView);
    @Method(selector = "renderNativeAdView:withAd:")
    public native boolean renderNativeAdView(MANativeAdView adView, MAAd ad);
    @Method(selector = "destroyAd:")
    public native void destroyAd(MAAd nativeAd);
    @Method(selector = "setExtraParameterForKey:value:")
    public native void setExtraParameter(String key, String value);
    @Method(selector = "setLocalExtraParameterForKey:value:")
    public native void setLocalExtraParameter(String key, NSObject value);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[MANativeAdLoader initWithAdUnitIdentifier:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithAdUnitIdentifier:sdk:")
    protected native @Pointer long init(String adUnitIdentifier, ALSdk sdk);
    /*</methods>*/
}
