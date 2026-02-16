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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAdapterNativeAdViewBinder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISAdapterNativeAdViewBinderProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISAdapterNativeAdViewBinderPtr extends Ptr<ISAdapterNativeAdViewBinder, ISAdapterNativeAdViewBinderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISAdapterNativeAdViewBinder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISAdapterNativeAdViewBinder() {}
    protected ISAdapterNativeAdViewBinder(Handle h, long handle) { super(h, handle); }
    protected ISAdapterNativeAdViewBinder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adViewHolder")
    public native ISNativeAdViewHolder getAdViewHolder();
    @Property(selector = "setAdViewHolder:")
    public native void setAdViewHolder(ISNativeAdViewHolder v);
    @Property(selector = "networkNativeAdView")
    public native UIView getNetworkNativeAdView();
    @Property(selector = "setNetworkNativeAdView:")
    public native void setNetworkNativeAdView(UIView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setNativeAdView:")
    public native void setNativeAdView(UIView nativeAdView);
    @Method(selector = "setIconView:")
    public native void setIconView(UIImageView iconView);
    @Method(selector = "setTitleView:")
    public native void setTitleView(UILabel titleView);
    @Method(selector = "setAdvertiserView:")
    public native void setAdvertiserView(UILabel advertiserView);
    @Method(selector = "setBodyView:")
    public native void setBodyView(UILabel bodyView);
    @Method(selector = "setMediaView:")
    public native void setMediaView(LevelPlayMediaView mediaView);
    @Method(selector = "setCallToActionView:")
    public native void setCallToActionView(UIButton callToActionView);
    /*</methods>*/
}
