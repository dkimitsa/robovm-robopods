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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASMediationManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASMediationManagerPtr extends Ptr<CASMediationManager, CASMediationManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASMediationManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASMediationManager() {}
    protected CASMediationManager(Handle h, long handle) { super(h, handle); }
    protected CASMediationManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated If you want to receive convenient ad loading callbacks, you should switch to using the new CAS classes for each format.
     */
    @Deprecated
    @Property(selector = "adLoadDelegate")
    public native CASLoadDelegate getAdLoadDelegate();
    /**
     * @deprecated If you want to receive convenient ad loading callbacks, you should switch to using the new CAS classes for each format.
     */
    @Deprecated
    @Property(selector = "setAdLoadDelegate:", strongRef = true)
    public native void setAdLoadDelegate(CASLoadDelegate v);
    @Property(selector = "managerID")
    public native String getManagerID();
    @Property(selector = "isDemoAdMode")
    public native boolean isDemoAdMode();
    @Property(selector = "lastPageAdContent")
    public native CASLastPageAdContent getLastPageAdContent();
    @Property(selector = "setLastPageAdContent:")
    public native void setLastPageAdContent(CASLastPageAdContent v);
    @Property(selector = "isFullscreenAdVisible")
    public native boolean isFullscreenAdVisible();
    @Property(selector = "isInterstitialReady")
    public native boolean isInterstitialReady();
    @Property(selector = "isRewardedAdReady")
    public native boolean isRewardedAdReady();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadInterstitial")
    public native void loadInterstitial();
    @Method(selector = "presentInterstitialFromRootViewController:callback:")
    public native void presentInterstitial(UIViewController controller, CASCallback callback);
    @Method(selector = "loadRewardedAd")
    public native void loadRewardedAd();
    @Method(selector = "presentRewardedAdFromRootViewController:callback:")
    public native void presentRewardedAd(UIViewController controller, CASCallback callback);
    @Method(selector = "isEnabledWithType:")
    public native boolean isEnabled(CASType type);
    /**
     * @deprecated If you want more precise control over ad memory, you should switch to using the new CAS classes for each format.
     */
    @Deprecated
    @Method(selector = "setEnabled:type:")
    public native void setEnabled(boolean enabled, CASType type);
    /**
     * @deprecated Please migrate to new `CASAppOpen` or `CASInterstitial` to enable this feature with the `isAutoshowEnabled` property.
     */
    @Deprecated
    @Method(selector = "enableAppReturnAdsWith:")
    public native void enableAppReturnAds(CASAppReturnDelegate delegate);
    /**
     * @deprecated Please migrate to new `CASAppOpen` or `CASInterstitial` to enable this feature with the `isAutoshowEnabled` property.
     */
    @Deprecated
    @Method(selector = "disableAppReturnAds")
    public native void disableAppReturnAds();
    @Method(selector = "skipNextAppReturnAds")
    public native void skipNextAppReturnAds();
    /*</methods>*/
}
