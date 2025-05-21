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
package org.robovm.pods.clearads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASNativeAdContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASNativeAdContentPtr extends Ptr<CASNativeAdContent, CASNativeAdContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASNativeAdContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASNativeAdContent() {}
    protected CASNativeAdContent(Handle h, long handle) { super(h, handle); }
    protected CASNativeAdContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "headline")
    public native String getHeadline();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "icon")
    public native UIImage getIcon();
    @Property(selector = "iconURL")
    public native NSURL getIconURL();
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "store")
    public native String getStore();
    @Property(selector = "price")
    public native String getPrice();
    @Property(selector = "starRating")
    public native NSNumber getStarRating();
    @Property(selector = "reviewCount")
    public native String getReviewCount();
    @Property(selector = "adLabel")
    public native String getAdLabel();
    @Property(selector = "hasVideoContent")
    public native boolean hasVideoContent();
    @Property(selector = "mediaContentAspectRatio")
    public native @MachineSizedFloat double getMediaContentAspectRatio();
    @Property(selector = "mediaImage")
    public native UIImage getMediaImage();
    @Property(selector = "mediaImageURL")
    public native NSURL getMediaImageURL();
    @Property(selector = "isExpired")
    public native boolean isExpired();
    @Property(selector = "contentInfo")
    public native CASContentInfo getContentInfo();
    @Property(selector = "delegate")
    public native CASNativeAdContentDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CASNativeAdContentDelegate v);
    @Property(selector = "impressionDelegate")
    public native CASImpressionDelegate getImpressionDelegate();
    @Property(selector = "setImpressionDelegate:", strongRef = true)
    public native void setImpressionDelegate(CASImpressionDelegate v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "destroy")
    public native void destroy();
    /*</methods>*/
}
