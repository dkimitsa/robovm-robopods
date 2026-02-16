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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdViewPtr extends Ptr<MAAdView, MAAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAdView() {}
    protected MAAdView(Handle h, long handle) { super(h, handle); }
    protected MAAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitIdentifier:")
    public MAAdView(String adUnitIdentifier) { super((SkipInit) null); initObject(init(adUnitIdentifier)); }
    @Method(selector = "initWithAdUnitIdentifier:configuration:")
    public MAAdView(String adUnitIdentifier, MAAdViewConfiguration configuration) { super((SkipInit) null); initObject(init(adUnitIdentifier, configuration)); }
    @Method(selector = "initWithAdUnitIdentifier:adFormat:")
    public MAAdView(String adUnitIdentifier, MAAdFormat adFormat) { super((SkipInit) null); initObject(init(adUnitIdentifier, adFormat)); }
    @Method(selector = "initWithAdUnitIdentifier:adFormat:configuration:")
    public MAAdView(String adUnitIdentifier, MAAdFormat adFormat, MAAdViewConfiguration configuration) { super((SkipInit) null); initObject(init(adUnitIdentifier, adFormat, configuration)); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use one of the other initializers instead.
     */
    @Deprecated
    @Method(selector = "initWithAdUnitIdentifier:sdk:")
    public MAAdView(String adUnitIdentifier, ALSdk sdk) { super((SkipInit) null); initObject(init(adUnitIdentifier, sdk)); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use one of the other initializers instead.
     */
    @Deprecated
    @Method(selector = "initWithAdUnitIdentifier:adFormat:sdk:")
    public MAAdView(String adUnitIdentifier, MAAdFormat adFormat, ALSdk sdk) { super((SkipInit) null); initObject(init(adUnitIdentifier, adFormat, sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MAAdViewAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MAAdViewAdDelegate v);
    @Property(selector = "revenueDelegate")
    public native MAAdRevenueDelegate getRevenueDelegate();
    @Property(selector = "setRevenueDelegate:", strongRef = true)
    public native void setRevenueDelegate(MAAdRevenueDelegate v);
    @Property(selector = "requestDelegate")
    public native MAAdRequestDelegate getRequestDelegate();
    @Property(selector = "setRequestDelegate:", strongRef = true)
    public native void setRequestDelegate(MAAdRequestDelegate v);
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
    @Property(selector = "adFormat")
    public native MAAdFormat getAdFormat();
    @Property(selector = "customData")
    public native String getCustomData();
    @Property(selector = "setCustomData:")
    public native void setCustomData(String v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitIdentifier:")
    protected native @Pointer long init(String adUnitIdentifier);
    @Method(selector = "initWithAdUnitIdentifier:configuration:")
    protected native @Pointer long init(String adUnitIdentifier, MAAdViewConfiguration configuration);
    @Method(selector = "initWithAdUnitIdentifier:adFormat:")
    protected native @Pointer long init(String adUnitIdentifier, MAAdFormat adFormat);
    @Method(selector = "initWithAdUnitIdentifier:adFormat:configuration:")
    protected native @Pointer long init(String adUnitIdentifier, MAAdFormat adFormat, MAAdViewConfiguration configuration);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "startAutoRefresh")
    public native void startAutoRefresh();
    @Method(selector = "stopAutoRefresh")
    public native void stopAutoRefresh();
    @Method(selector = "setExtraParameterForKey:value:")
    public native void setExtraParameter(String key, String value);
    @Method(selector = "setLocalExtraParameterForKey:value:")
    public native void setLocalExtraParameter(String key, NSObject value);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use one of the other initializers instead.
     */
    @Deprecated
    @Method(selector = "initWithAdUnitIdentifier:sdk:")
    protected native @Pointer long init(String adUnitIdentifier, ALSdk sdk);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use one of the other initializers instead.
     */
    @Deprecated
    @Method(selector = "initWithAdUnitIdentifier:adFormat:sdk:")
    protected native @Pointer long init(String adUnitIdentifier, MAAdFormat adFormat, ALSdk sdk);
    /*</methods>*/
}
