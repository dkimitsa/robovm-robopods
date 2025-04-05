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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAdViewPtr extends Ptr<ALAdView, ALAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALAdView() {}
    protected ALAdView(Handle h, long handle) { super(h, handle); }
    protected ALAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSize:")
    public ALAdView(ALAdSize size) { super((SkipInit) null); initObject(init(size)); }
    @Method(selector = "initWithSize:zoneIdentifier:")
    public ALAdView(ALAdSize size, String zoneIdentifier) { super((SkipInit) null); initObject(init(size, zoneIdentifier)); }
    @Method(selector = "initWithFrame:")
    public ALAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public ALAdView(NSCoder coder) { super(coder); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALAdView initWithSize:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithSdk:size:")
    public ALAdView(ALSdk sdk, ALAdSize size) { super((SkipInit) null); initObject(init(sdk, size)); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALAdView initWithSize:zoneIdentifier:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithSdk:size:zoneIdentifier:")
    public ALAdView(ALSdk sdk, ALAdSize size, String zoneIdentifier) { super((SkipInit) null); initObject(init(sdk, size, zoneIdentifier)); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALAdView initWithSize:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithFrame:size:sdk:")
    public ALAdView(@ByVal CGRect frame, ALAdSize size, ALSdk sdk) { super((SkipInit) null); initObject(init(frame, size, sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adLoadDelegate")
    public native ALAdLoadDelegate getAdLoadDelegate();
    @Property(selector = "setAdLoadDelegate:")
    public native void setAdLoadDelegate(ALAdLoadDelegate v);
    @Property(selector = "adDisplayDelegate")
    public native ALAdDisplayDelegate getAdDisplayDelegate();
    @Property(selector = "setAdDisplayDelegate:")
    public native void setAdDisplayDelegate(ALAdDisplayDelegate v);
    @Property(selector = "adEventDelegate")
    public native ALAdViewEventDelegate getAdEventDelegate();
    @Property(selector = "setAdEventDelegate:")
    public native void setAdEventDelegate(ALAdViewEventDelegate v);
    @Property(selector = "adSize")
    public native ALAdSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(ALAdSize v);
    @Property(selector = "zoneIdentifier")
    public native String getZoneIdentifier();
    @Property(selector = "isAutoloadEnabled")
    public native boolean isAutoload();
    @Property(selector = "setAutoloadEnabled:")
    public native void setAutoload(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setExtraInfoForKey:value:")
    public native void setExtraInfo(String key, NSObject value);
    @Method(selector = "loadNextAd")
    public native void loadNextAd();
    @Method(selector = "render:")
    public native void render(ALAd ad);
    @Method(selector = "initWithSize:")
    protected native @Pointer long init(ALAdSize size);
    @Method(selector = "initWithSize:zoneIdentifier:")
    protected native @Pointer long init(ALAdSize size, String zoneIdentifier);
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
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALAdView initWithSize:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithSdk:size:")
    protected native @Pointer long init(ALSdk sdk, ALAdSize size);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALAdView initWithSize:zoneIdentifier:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithSdk:size:zoneIdentifier:")
    protected native @Pointer long init(ALSdk sdk, ALAdSize size, String zoneIdentifier);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALAdView initWithSize:]` instead.
     */
    @Deprecated
    @Method(selector = "initWithFrame:size:sdk:")
    protected native @Pointer long init(@ByVal CGRect frame, ALAdSize size, ALSdk sdk);
    /*</methods>*/
}
