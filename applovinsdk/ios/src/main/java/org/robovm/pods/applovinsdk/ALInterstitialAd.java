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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALInterstitialAdPtr extends Ptr<ALInterstitialAd, ALInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALInterstitialAd() {}
    protected ALInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected ALInterstitialAd(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALInterstitialAd init]` instead.
     */
    @Deprecated
    @Method(selector = "initWithSdk:")
    public ALInterstitialAd(ALSdk sdk) { super((SkipInit) null); initObject(init(sdk)); }
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
    @Property(selector = "adVideoPlaybackDelegate")
    public native ALAdVideoPlaybackDelegate getAdVideoPlaybackDelegate();
    @Property(selector = "setAdVideoPlaybackDelegate:")
    public native void setAdVideoPlaybackDelegate(ALAdVideoPlaybackDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setExtraInfoForKey:value:")
    public native void setExtraInfo(String key, NSObject value);
    @Method(selector = "showAd:")
    public native void showAd(ALAd ad);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALInterstitialAd init]` instead.
     */
    @Deprecated
    @Method(selector = "initWithSdk:")
    protected native @Pointer long init(ALSdk sdk);
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please load an ad using `-[ALAdService loadNextAdForZoneIdentifier:]` and show the loaded `ALAd` using `-[ALInterstitialAd showAd:]` instead.
     */
    @Deprecated
    @Method(selector = "show")
    public native void show();
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please load an ad using `-[ALAdService loadNextAdForZoneIdentifier:]` and show the loaded `ALAd` using `-[ALInterstitialAd showAd:]` instead.
     */
    @Deprecated
    @Method(selector = "show")
    public static native ALInterstitialAd Show();
    /**
     * @deprecated This API is deprecated and will be removed in a future SDK version. Please use `-[ALInterstitialAd init]` instead.
     */
    @Deprecated
    @Method(selector = "shared")
    public static native ALInterstitialAd shared();
    /*</methods>*/
}
