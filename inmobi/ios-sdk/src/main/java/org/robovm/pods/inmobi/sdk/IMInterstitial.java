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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMInterstitial")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMInterstitial/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMInterstitialPtr extends Ptr<IMInterstitial, IMInterstitialPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMInterstitial.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMInterstitial() {}
    protected IMInterstitial(Handle h, long handle) { super(h, handle); }
    protected IMInterstitial(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementId:")
    public IMInterstitial(long placementId) { super((SkipInit) null); initObject(init(placementId)); }
    @Method(selector = "initWithPlacementId:delegate:")
    public IMInterstitial(long placementId, IMInterstitialDelegate delegate) { super((SkipInit) null); initObject(init(placementId, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementId")
    public native long getPlacementId();
    @Property(selector = "setPlacementId:")
    public native void setPlacementId(long v);
    @Property(selector = "delegate")
    public native IMInterstitialDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(IMInterstitialDelegate v);
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
    @Property(selector = "creativeId")
    public native String getCreativeId();
    @Property(selector = "preloadManager")
    public native IMInterstitialPreloadManager getPreloadManager();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementId:")
    protected native @Pointer long init(long placementId);
    @Method(selector = "initWithPlacementId:delegate:")
    protected native @Pointer long init(long placementId, IMInterstitialDelegate delegate);
    @Method(selector = "load")
    public native void load();
    @Method(selector = "load:")
    public native void load(NSData response);
    @Method(selector = "isReady")
    public native boolean isReady();
    @Method(selector = "showFrom:")
    public native void showFrom(UIViewController viewController);
    /**
     * @deprecated animationType will not be used anymore, please use show(from:)
     */
    @Deprecated
    @Method(selector = "showFrom:with:")
    public native void show(UIViewController viewController, IMInterstitialAnimationType animationType);
    @Method(selector = "getAdMetaInfo")
    public native NSDictionary<NSString, ?> getAdMetaInfo();
    @Method(selector = "setWatermarkWith:")
    public native void setWatermark(IMWatermark watermark);
    /**
     * @deprecated Deprecated with no replacement
     */
    @Deprecated
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "notifyWinWithMinBidToWin:")
    public native void notifyWin(double minBidToWin);
    @Method(selector = "notifyLossWithLossReasonCode:auctionPrice:")
    public native void notifyLoss(@MachineSizedSInt long lossReasonCode, double auctionPrice);
    /*</methods>*/
}
