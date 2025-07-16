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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASNativeView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements CASNativeAdAssetViews/*</implements>*/ {

    /*<ptr>*/public static class CASNativeViewPtr extends Ptr<CASNativeView, CASNativeViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASNativeView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASNativeView() {}
    protected CASNativeView(Handle h, long handle) { super(h, handle); }
    protected CASNativeView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public CASNativeView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public CASNativeView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaView")
    public native CASMediaView getMediaView();
    @Property(selector = "setMediaView:", strongRef = true)
    public native void setMediaView(CASMediaView v);
    @Property(selector = "adChoicesView")
    public native CASChoicesView getAdChoicesView();
    @Property(selector = "setAdChoicesView:", strongRef = true)
    public native void setAdChoicesView(CASChoicesView v);
    @Property(selector = "headlineView")
    public native UILabel getHeadlineView();
    @Property(selector = "setHeadlineView:", strongRef = true)
    public native void setHeadlineView(UILabel v);
    @Property(selector = "callToActionView")
    public native UIButton getCallToActionView();
    @Property(selector = "setCallToActionView:", strongRef = true)
    public native void setCallToActionView(UIButton v);
    @Property(selector = "iconView")
    public native UIImageView getIconView();
    @Property(selector = "setIconView:", strongRef = true)
    public native void setIconView(UIImageView v);
    @Property(selector = "bodyView")
    public native UILabel getBodyView();
    @Property(selector = "setBodyView:", strongRef = true)
    public native void setBodyView(UILabel v);
    @Property(selector = "priceView")
    public native UILabel getPriceView();
    @Property(selector = "setPriceView:", strongRef = true)
    public native void setPriceView(UILabel v);
    @Property(selector = "advertiserView")
    public native UILabel getAdvertiserView();
    @Property(selector = "setAdvertiserView:", strongRef = true)
    public native void setAdvertiserView(UILabel v);
    @Property(selector = "storeView")
    public native UILabel getStoreView();
    @Property(selector = "setStoreView:", strongRef = true)
    public native void setStoreView(UILabel v);
    @Property(selector = "starRatingView")
    public native UIView getStarRatingView();
    @Property(selector = "setStarRatingView:", strongRef = true)
    public native void setStarRatingView(UIView v);
    @Property(selector = "reviewCountView")
    public native UILabel getReviewCountView();
    @Property(selector = "setReviewCountView:", strongRef = true)
    public native void setReviewCountView(UILabel v);
    @Property(selector = "adLabelView")
    public native UILabel getAdLabelView();
    @Property(selector = "setAdLabelView:", strongRef = true)
    public native void setAdLabelView(UILabel v);
    @Property(selector = "clickableViews")
    public native NSArray<UIView> getClickableViews();
    @Property(selector = "intrinsicContentSize")
    public native @ByVal CGSize getIntrinsicContentSize();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "registerMediaViewWithTag:")
    public native void registerMediaView(@MachineSizedSInt long tag);
    @Method(selector = "registerAdChoicesViewWithTag:")
    public native void registerAdChoicesView(@MachineSizedSInt long tag);
    @Method(selector = "registerHeadlineViewWithTag:")
    public native void registerHeadlineView(@MachineSizedSInt long tag);
    @Method(selector = "registerCallToActionViewWithTag:")
    public native void registerCallToActionView(@MachineSizedSInt long tag);
    @Method(selector = "registerIconViewWithTag:")
    public native void registerIconView(@MachineSizedSInt long tag);
    @Method(selector = "registerBodyViewWithTag:")
    public native void registerBodyView(@MachineSizedSInt long tag);
    @Method(selector = "registerPriceViewWithTag:")
    public native void registerPriceView(@MachineSizedSInt long tag);
    @Method(selector = "registerAdvertiserViewWithTag:")
    public native void registerAdvertiserView(@MachineSizedSInt long tag);
    @Method(selector = "registerStoreViewWithTag:")
    public native void registerStoreView(@MachineSizedSInt long tag);
    @Method(selector = "registerStarRatingViewWithTag:")
    public native void registerStarRatingView(@MachineSizedSInt long tag);
    @Method(selector = "registerReviewCountViewWithTag:")
    public native void registerReviewCountView(@MachineSizedSInt long tag);
    @Method(selector = "registerAdLabelViewWithTag:")
    public native void registerAdLabelView(@MachineSizedSInt long tag);
    @Method(selector = "setNativeAd:")
    public native void setNativeAd(CASNativeAdContent content);
    @Method(selector = "setAdTemplateSize:")
    public native void setAdTemplateSize(CASSize size);
    /**
     * @deprecated To improve performance, please call setTemplateSize(_:) once to create layout and setNativeAd(_:) for each new NativeAdContent.
     */
    @Deprecated
    @Method(selector = "setNativeAd:templateSize:")
    public native void setNativeAdTemplateSize(CASNativeAdContent ad, CASSize templateSize);
    @Method(selector = "didMoveToWindow")
    public native void didMoveToWindow();
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
