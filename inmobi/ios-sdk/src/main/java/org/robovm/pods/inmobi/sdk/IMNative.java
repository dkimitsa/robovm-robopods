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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMNative")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMNative/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMNativePtr extends Ptr<IMNative, IMNativePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMNative.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMNative() {}
    protected IMNative(Handle h, long handle) { super(h, handle); }
    protected IMNative(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementId:")
    public IMNative(long placementId) { super((SkipInit) null); initObject(init(placementId)); }
    @Method(selector = "initWithPlacementId:delegate:")
    public IMNative(long placementId, IMNativeDelegate delegate) { super((SkipInit) null); initObject(init(placementId, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementId")
    public native long getPlacementId();
    @Property(selector = "setPlacementId:")
    public native void setPlacementId(long v);
    @Property(selector = "delegate")
    public native IMNativeDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(IMNativeDelegate v);
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "extras")
    public native NSDictionary<NSString, ?> getExtras();
    @Property(selector = "setExtras:")
    public native void setExtras(NSDictionary<NSString, ?> v);
    @Property(selector = "contentUrl")
    public native String getContentUrl();
    @Property(selector = "setContentUrl:")
    public native void setContentUrl(String v);
    @Property(selector = "adTitle")
    public native String getAdTitle();
    @Property(selector = "adDescription")
    public native String getAdDescription();
    @Property(selector = "adIcon")
    public native IMNativeImage getAdIcon();
    @Property(selector = "adCtaText")
    public native String getAdCtaText();
    @Property(selector = "adRating")
    public native String getAdRating();
    @Property(selector = "advertiserName")
    public native String getAdvertiserName();
    @Property(selector = "adChoice")
    public native UIImageView getAdChoice();
    @Property(selector = "creativeId")
    public native String getCreativeId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementId:")
    protected native @Pointer long init(long placementId);
    @Method(selector = "initWithPlacementId:delegate:")
    protected native @Pointer long init(long placementId, IMNativeDelegate delegate);
    @Method(selector = "load")
    public native void load();
    @Method(selector = "load:")
    public native void load(NSData response);
    @Method(selector = "registerViewForTracking:")
    public native void registerViewForTracking(IMNativeViewData view);
    @Method(selector = "isReady")
    public native boolean isReady();
    @Method(selector = "getCustomAdContent")
    public native NSDictionary<NSString, ?> getCustomAdContent();
    @Method(selector = "getMediaView")
    public native UIView getMediaView();
    @Method(selector = "isVideoAd")
    public native boolean isVideoAd();
    @Method(selector = "getAdMetaInfo")
    public native NSDictionary<NSString, ?> getAdMetaInfo();
    /*</methods>*/
}
