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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MANativeAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MANativeAdViewPtr extends Ptr<MANativeAdView, MANativeAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MANativeAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MANativeAdView() {}
    protected MANativeAdView(Handle h, long handle) { super(h, handle); }
    protected MANativeAdView(SkipInit skipInit) { super(skipInit); }
    public MANativeAdView(MANativeAd ad) { super((Handle) null, create(ad)); retain(getHandle()); }
    public MANativeAdView(MANativeAd ad, String templateType) { super((Handle) null, create(ad, templateType)); retain(getHandle()); }
    @Method(selector = "initWithFrame:")
    public MANativeAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MANativeAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleLabel")
    public native UILabel getTitleLabel();
    @Property(selector = "setTitleLabel:", strongRef = true)
    public native void setTitleLabel(UILabel v);
    @Property(selector = "advertiserLabel")
    public native UILabel getAdvertiserLabel();
    @Property(selector = "setAdvertiserLabel:", strongRef = true)
    public native void setAdvertiserLabel(UILabel v);
    @Property(selector = "bodyLabel")
    public native UILabel getBodyLabel();
    @Property(selector = "setBodyLabel:", strongRef = true)
    public native void setBodyLabel(UILabel v);
    @Property(selector = "callToActionButton")
    public native UIButton getCallToActionButton();
    @Property(selector = "setCallToActionButton:", strongRef = true)
    public native void setCallToActionButton(UIButton v);
    @Property(selector = "iconImageView")
    public native UIImageView getIconImageView();
    @Property(selector = "setIconImageView:", strongRef = true)
    public native void setIconImageView(UIImageView v);
    /**
     * @deprecated iconContentView is deprecated and will be removed in the future. Use iconImageView instead.
     */
    @Deprecated
    @Property(selector = "iconContentView")
    public native UIView getIconContentView();
    /**
     * @deprecated iconContentView is deprecated and will be removed in the future. Use iconImageView instead.
     */
    @Deprecated
    @Property(selector = "setIconContentView:", strongRef = true)
    public native void setIconContentView(UIView v);
    @Property(selector = "optionsContentView")
    public native UIView getOptionsContentView();
    @Property(selector = "setOptionsContentView:", strongRef = true)
    public native void setOptionsContentView(UIView v);
    @Property(selector = "mediaContentView")
    public native UIView getMediaContentView();
    @Property(selector = "setMediaContentView:", strongRef = true)
    public native void setMediaContentView(UIView v);
    @Property(selector = "starRatingContentView")
    public native UIView getStarRatingContentView();
    @Property(selector = "setStarRatingContentView:", strongRef = true)
    public native void setStarRatingContentView(UIView v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "bindViewsWithAdViewBinder:")
    public native void bindViews(MANativeAdViewBinder adViewBinder);
    @Method(selector = "nativeAdViewFromAd:")
    protected static native @Pointer long create(MANativeAd ad);
    @Method(selector = "nativeAdViewFromAd:withTemplate:")
    protected static native @Pointer long create(MANativeAd ad, String templateType);
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
