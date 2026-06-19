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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdViewPtr extends Ptr<FBAdView, FBAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdView() {}
    protected FBAdView(Handle h, long handle) { super(h, handle); }
    protected FBAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementID:adSize:rootViewController:")
    public FBAdView(String placementID, @ByVal FBAdSize adSize, UIViewController rootViewController) { super((SkipInit) null); initObject(init(placementID, adSize, rootViewController)); }
    @Method(selector = "initWithPlacementID:bidPayload:rootViewController:error:")
    public FBAdView(String placementID, String bidPayload, UIViewController rootViewController, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(placementID, bidPayload, rootViewController, error)); }
    @Method(selector = "initWithFrame:")
    public FBAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementID")
    public native String getPlacementID();
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "isAdValid")
    public native boolean isAdValid();
    @Property(selector = "delegate")
    public native FBAdViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBAdViewDelegate v);
    @Property(selector = "extraHint")
    public native FBAdExtraHint getExtraHint();
    @Property(selector = "setExtraHint:")
    public native void setExtraHint(FBAdExtraHint v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementID:adSize:rootViewController:")
    protected native @Pointer long init(String placementID, @ByVal FBAdSize adSize, UIViewController rootViewController);
    @Method(selector = "initWithPlacementID:bidPayload:rootViewController:error:")
    protected native @Pointer long init(String placementID, String bidPayload, UIViewController rootViewController, NSError.NSErrorPtr error);
    /**
     * @deprecated This method will be removed in future version. Use -loadAdWithBidPayload instead.See https://www.facebook.com/audiencenetwork/resources/blog/bidding-moves-from-priority-to-imperative-for-app-monetizationfor more details.
     */
    @Deprecated
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "loadAdWithBidPayload:")
    public native void loadAd(String bidPayload);
    @Deprecated
    @Method(selector = "disableAutoRefresh")
    public native void disableAutoRefresh();
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
