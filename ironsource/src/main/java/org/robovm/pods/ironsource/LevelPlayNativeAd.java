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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LevelPlayNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISNativeAdDataProtocol/*</implements>*/ {

    /*<ptr>*/public static class LevelPlayNativeAdPtr extends Ptr<LevelPlayNativeAd, LevelPlayNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LevelPlayNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LevelPlayNativeAd() {}
    protected LevelPlayNativeAd(Handle h, long handle) { super(h, handle); }
    protected LevelPlayNativeAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBuilder:")
    public LevelPlayNativeAd(LevelPlayNativeAdBuilder builder) { super((SkipInit) null); initObject(init(builder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nativeAdViewBinder")
    public native ISAdapterNativeAdViewBinder getNativeAdViewBinder();
    @Property(selector = "setNativeAdViewBinder:")
    public native void setNativeAdViewBinder(ISAdapterNativeAdViewBinder v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "setAdvertiser:")
    public native void setAdvertiser(String v);
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "setCallToAction:")
    public native void setCallToAction(String v);
    @Property(selector = "icon")
    public native ISNativeAdDataImage getIcon();
    @Property(selector = "setIcon:")
    public native void setIcon(ISNativeAdDataImage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBuilder:")
    protected native @Pointer long init(LevelPlayNativeAdBuilder builder);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "destroyAd")
    public native void destroyAd();
    @Method(selector = "setDelegate:")
    public native void setDelegate(LevelPlayNativeAdDelegate delegate);
    @Method(selector = "getObjectId")
    public native String getObjectId();
    /*</methods>*/
}
