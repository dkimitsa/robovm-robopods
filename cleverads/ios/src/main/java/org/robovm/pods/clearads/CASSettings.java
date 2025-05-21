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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASSettingsPtr extends Ptr<CASSettings, CASSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASSettings() {}
    protected CASSettings(Handle h, long handle) { super(h, handle); }
    protected CASSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "taggedAudience")
    public native CASAudience getTaggedAudience();
    @Property(selector = "setTaggedAudience:")
    public native void setTaggedAudience(CASAudience v);
    @Property(selector = "userConsent")
    public native CASConsentStatus getUserConsent();
    @Property(selector = "setUserConsent:")
    public native void setUserConsent(CASConsentStatus v);
    @Property(selector = "userCCPAStatus")
    public native CASCCPAStatus getUserCCPAStatus();
    @Property(selector = "setUserCCPAStatus:")
    public native void setUserCCPAStatus(CASCCPAStatus v);
    @Property(selector = "trialAdFreeInterval")
    public native long getTrialAdFreeInterval();
    @Property(selector = "setTrialAdFreeInterval:")
    public native void setTrialAdFreeInterval(long v);
    @Property(selector = "bannerRefreshInterval")
    public native @MachineSizedSInt long getBannerRefreshInterval();
    @Property(selector = "setBannerRefreshInterval:")
    public native void setBannerRefreshInterval(@MachineSizedSInt long v);
    @Property(selector = "interstitialInterval")
    public native @MachineSizedSInt long getInterstitialInterval();
    @Property(selector = "setInterstitialInterval:")
    public native void setInterstitialInterval(@MachineSizedSInt long v);
    @Property(selector = "audioSessionIsApplicationManaged")
    public native boolean isAudioSessionIsApplicationManaged();
    @Property(selector = "setAudioSessionIsApplicationManaged:")
    public native void setAudioSessionIsApplicationManaged(boolean v);
    @Property(selector = "mutedAdSounds")
    public native boolean isMutedAdSounds();
    @Property(selector = "setMutedAdSounds:")
    public native void setMutedAdSounds(boolean v);
    @Property(selector = "debugMode")
    public native boolean isDebugMode();
    @Property(selector = "setDebugMode:")
    public native void setDebugMode(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getVendorConsentWithVendorId:")
    public native CASConsentStatus getVendorConsent(@MachineSizedSInt long vendorId);
    @Method(selector = "getAdditionalConsentWithProviderId:")
    public native CASConsentStatus getAdditionalConsent(@MachineSizedSInt long providerId);
    @Method(selector = "restartInterstitialInterval")
    public native void restartInterstitialInterval();
    @Method(selector = "setTestDeviceWithIds:")
    public native void setTestDevice(NSArray<NSString> ids);
    @Method(selector = "setInterstitialAdsWhenVideoCostAreLowerWithAllow:")
    public native void setInterstitialAdsWhenVideoCostAreLower(boolean allow);
    @Method(selector = "isInterstitialAdsWhenVideoCostAreLowerAllowed")
    public native boolean isInterstitialAdsWhenVideoCostAreLowerAllowed();
    /**
     * @deprecated Use CAS.targetingOptions.locationCollectionEnabled instead.
     */
    @Deprecated
    @Method(selector = "isTrackLocationEnabled")
    public native boolean isTrackLocationEnabled();
    /**
     * @deprecated Use CAS.targetingOptions.locationCollectionEnabled instead.
     */
    @Deprecated
    @Method(selector = "setTrackLocationWithEnabled:")
    public native void setTrackLocation(boolean enabled);
    @Method(selector = "getLoadingMode")
    public native CASLoadingManagerMode getLoadingMode();
    @Method(selector = "setLoadingWithMode:")
    public native void setLoading(CASLoadingManagerMode mode);
    /*</methods>*/
}
