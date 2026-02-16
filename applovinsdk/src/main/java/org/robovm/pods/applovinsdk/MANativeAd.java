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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MANativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MANativeAdPtr extends Ptr<MANativeAd, MANativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MANativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MANativeAd() {}
    protected MANativeAd(Handle h, long handle) { super(h, handle); }
    protected MANativeAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormat:builderBlock:")
    public MANativeAd(MAAdFormat format, @Block VoidBlock1<MANativeAdBuilder> builderBlock) { super((SkipInit) null); initObject(init(format, builderBlock)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "format")
    public native MAAdFormat getFormat();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "icon")
    public native MANativeAdImage getIcon();
    @Property(selector = "iconView")
    public native UIView getIconView();
    @Property(selector = "optionsView")
    public native UIView getOptionsView();
    @Property(selector = "mediaView")
    public native UIView getMediaView();
    @Property(selector = "mainImage")
    public native MANativeAdImage getMainImage();
    @Property(selector = "mediaContentAspectRatio")
    public native @MachineSizedFloat double getMediaContentAspectRatio();
    @Property(selector = "starRating")
    public native NSNumber getStarRating();
    @Property(selector = "isExpired")
    public native boolean isExpired();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated This method has been deprecated and will be removed in a future SDK version. Please use -[MANativeAd prepareForInteractionClickableViews:withContainer:] instead.
     */
    @Deprecated
    @Method(selector = "prepareViewForInteraction:")
    public native void prepareViewForInteraction(MANativeAdView nativeAdView);
    @Method(selector = "prepareForInteractionClickableViews:withContainer:")
    public native boolean prepareForInteractionClickableViews(NSArray<UIView> clickableViews, UIView container);
    @Method(selector = "shouldPrepareViewForInteractionOnMainThread")
    public native boolean shouldPrepareViewForInteractionOnMainThread();
    @Method(selector = "isContainerClickable")
    public native boolean isContainerClickable();
    @Method(selector = "performClick")
    public native void performClick();
    @Method(selector = "initWithFormat:builderBlock:")
    protected native @Pointer long init(MAAdFormat format, @Block VoidBlock1<MANativeAdBuilder> builderBlock);
    /*</methods>*/
}
