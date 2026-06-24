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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeBannerAdView/*</name>*/ 
    extends /*<extends>*/FBNativeAdBaseView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeBannerAdViewPtr extends Ptr<FBNativeBannerAdView, FBNativeBannerAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeBannerAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeBannerAdView() {}
    protected FBNativeBannerAdView(Handle h, long handle) { super(h, handle); }
    protected FBNativeBannerAdView(SkipInit skipInit) { super(skipInit); }
    public FBNativeBannerAdView(FBNativeBannerAd nativeBannerAd, FBNativeBannerAdViewType type) { super((Handle) null, create(nativeBannerAd, type)); retain(getHandle()); }
    public FBNativeBannerAdView(FBNativeBannerAd nativeBannerAd, FBNativeBannerAdViewType type, FBNativeAdViewAttributes attributes) { super((Handle) null, create(nativeBannerAd, type, attributes)); retain(getHandle()); }
    @Method(selector = "initWithFrame:")
    public FBNativeBannerAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBNativeBannerAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native FBNativeBannerAdViewType getType();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nativeBannerAdViewWithNativeBannerAd:withType:")
    protected static native @Pointer long create(FBNativeBannerAd nativeBannerAd, FBNativeBannerAdViewType type);
    @Method(selector = "nativeBannerAdViewWithNativeBannerAd:withType:withAttributes:")
    protected static native @Pointer long create(FBNativeBannerAd nativeBannerAd, FBNativeBannerAdViewType type, FBNativeAdViewAttributes attributes);
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
