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
package org.robovm.pods.cleverads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("CleverAdsSolutions.CASBannerView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASBannerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASBannerViewPtr extends Ptr<CASBannerView, CASBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASBannerView() {}
    protected CASBannerView(Handle h, long handle) { super(h, handle); }
    protected CASBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCasID:size:origin:")
    public CASBannerView(String casID, CASSize size, @ByVal CGPoint origin) { super((SkipInit) null); initObject(init(casID, size, origin)); }
    @Method(selector = "initWithFrame:")
    public CASBannerView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public CASBannerView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /**
     * @deprecated Use constructor with CAS identifier parameter instead.
     */
    @Deprecated
    @Method(selector = "initWithAdSize:manager:")
    public CASBannerView(CASSize adSize, CASMediationManager manager) { super((SkipInit) null); initObject(init(adSize, manager)); }
    /**
     * @deprecated Use constructor with CAS identifier parameter instead.
     */
    @Deprecated
    @Method(selector = "initWithAdSize:origin:manager:")
    public CASBannerView(CASSize adSize, @ByVal CGPoint origin, CASMediationManager manager) { super((SkipInit) null); initObject(init(adSize, origin, manager)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "casID")
    public native String getCasID();
    @Property(selector = "setCasID:")
    public native void setCasID(String v);
    /**
     * @deprecated Please use just casID instead.
     */
    @Deprecated
    @Property(selector = "manager")
    public native CASMediationManager getManager();
    /**
     * @deprecated Please use just casID instead.
     */
    @Deprecated
    @Property(selector = "setManager:")
    public native void setManager(CASMediationManager v);
    @Property(selector = "adSize")
    public native CASSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(CASSize v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "delegate")
    public native CASBannerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CASBannerDelegate v);
    @Property(selector = "impressionDelegate")
    public native CASImpressionDelegate getImpressionDelegate();
    @Property(selector = "setImpressionDelegate:", strongRef = true)
    public native void setImpressionDelegate(CASImpressionDelegate v);
    @Property(selector = "isAdLoaded")
    public native boolean isAdLoaded();
    @Property(selector = "contentInfo")
    public native CASContentInfo getContentInfo();
    @Property(selector = "isAutoloadEnabled")
    public native boolean isAutoloadEnabled();
    @Property(selector = "setIsAutoloadEnabled:")
    public native void setIsAutoloadEnabled(boolean v);
    @Property(selector = "refreshInterval")
    public native @MachineSizedSInt long getRefreshInterval();
    @Property(selector = "setRefreshInterval:")
    public native void setRefreshInterval(@MachineSizedSInt long v);
    /**
     * @deprecated Renamed to `delegate`. Use delegate
     */
    @Deprecated
    @Property(selector = "adDelegate")
    public native CASBannerDelegate getAdDelegate();
    /**
     * @deprecated Renamed to `delegate`. Use delegate
     */
    @Deprecated
    @Property(selector = "setAdDelegate:", strongRef = true)
    public native void setAdDelegate(CASBannerDelegate v);
    /**
     * @deprecated Renamed to isAdLoaded. Use isAdLoaded
     */
    @Deprecated
    @Property(selector = "isAdReady")
    public native boolean isAdReady();
    @Property(selector = "intrinsicContentSize")
    public native @ByVal CGSize getIntrinsicContentSize();
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCasID:size:origin:")
    protected native @Pointer long init(String casID, CASSize size, @ByVal CGPoint origin);
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "disableAdRefresh")
    public native void disableAdRefresh();
    @Method(selector = "destroy")
    public native void destroy();
    /**
     * @deprecated Use constructor with CAS identifier parameter instead.
     */
    @Deprecated
    @Method(selector = "initWithAdSize:manager:")
    protected native @Pointer long init(CASSize adSize, CASMediationManager manager);
    /**
     * @deprecated Use constructor with CAS identifier parameter instead.
     */
    @Deprecated
    @Method(selector = "initWithAdSize:origin:manager:")
    protected native @Pointer long init(CASSize adSize, @ByVal CGPoint origin, CASMediationManager manager);
    /**
     * @deprecated Renamed to loadAd(). Use loadAd
     */
    @Deprecated
    @Method(selector = "loadNextAd")
    public native void loadNextAd();
    @Method(selector = "didMoveToWindow")
    public native void didMoveToWindow();
    @Method(selector = "didMoveToSuperview")
    public native void didMoveToSuperview();
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
