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
package org.robovm.pods.unityads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSBannerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSBannerViewPtr extends Ptr<UADSBannerView, UADSBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UADSBannerView() {}
    protected UADSBannerView(Handle h, long handle) { super(h, handle); }
    protected UADSBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementId:size:")
    public UADSBannerView(String placementId, @ByVal CGSize size) { super((SkipInit) null); initObject(init(placementId, size)); }
    @Method(selector = "initWithFrame:")
    public UADSBannerView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UADSBannerView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "delegate")
    public native UADSBannerViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UADSBannerViewDelegate v);
    @Property(selector = "placementId")
    public native String getPlacementId();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementId:size:")
    protected native @Pointer long init(String placementId, @ByVal CGSize size);
    @Method(selector = "load")
    public native void load();
    @Method(selector = "loadWithOptions:")
    public native void load(UADSLoadOptions options);
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
