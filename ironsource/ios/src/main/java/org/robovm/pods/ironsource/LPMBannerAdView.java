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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMBannerAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMBannerAdViewPtr extends Ptr<LPMBannerAdView, LPMBannerAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMBannerAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LPMBannerAdView() {}
    protected LPMBannerAdView(Handle h, long handle) { super(h, handle); }
    protected LPMBannerAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitId:")
    public LPMBannerAdView(String adUnitId) { super((SkipInit) null); initObject(init(adUnitId)); }
    @Method(selector = "initWithAdUnitId:config:")
    public LPMBannerAdView(String adUnitId, LPMBannerAdViewConfig config) { super((SkipInit) null); initObject(init(adUnitId, config)); }
    @Method(selector = "initWithFrame:")
    public LPMBannerAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public LPMBannerAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adId")
    public native String getAdId();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitId:")
    protected native @Pointer long init(String adUnitId);
    @Method(selector = "initWithAdUnitId:config:")
    protected native @Pointer long init(String adUnitId, LPMBannerAdViewConfig config);
    /**
     * @deprecated Use LPMBannerAdViewConfig
     */
    @Deprecated
    @Method(selector = "setPlacementName:")
    public native void setPlacementName(String placementName);
    /**
     * @deprecated Use LPMBannerAdViewConfig
     */
    @Deprecated
    @Method(selector = "setAdSize:")
    public native void setAdSize(LPMAdSize adSize);
    @Method(selector = "setDelegate:")
    public native void setDelegate(LPMBannerAdViewDelegate delegate);
    @Method(selector = "loadAdWithViewController:")
    public native void loadAd(UIViewController viewController);
    @Method(selector = "destroy")
    public native void destroy();
    @Method(selector = "pauseAutoRefresh")
    public native void pauseAutoRefresh();
    @Method(selector = "resumeAutoRefresh")
    public native void resumeAutoRefresh();
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
    /*</methods>*/
}
