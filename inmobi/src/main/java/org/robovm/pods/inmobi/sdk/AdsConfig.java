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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.AdsConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AdsConfig/*</name>*/ 
    extends /*<extends>*/IMConfigBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdsConfigPtr extends Ptr<AdsConfig, AdsConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AdsConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AdsConfig() {}
    protected AdsConfig(Handle h, long handle) { super(h, handle); }
    protected AdsConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimumRefreshInterval")
    public native @MachineSizedSInt long getMinimumRefreshInterval();
    @Property(selector = "setMinimumRefreshInterval:")
    public native void setMinimumRefreshInterval(@MachineSizedSInt long v);
    @Property(selector = "defaultRefreshInterval")
    public native @MachineSizedSInt long getDefaultRefreshInterval();
    @Property(selector = "setDefaultRefreshInterval:")
    public native void setDefaultRefreshInterval(@MachineSizedSInt long v);
    @Property(selector = "contextualData")
    public native ContextualDataConfig getContextualData();
    @Property(selector = "setContextualData:")
    public native void setContextualData(ContextualDataConfig v);
    @Property(selector = "audio")
    public native AdsAudioConfig getAudio();
    @Property(selector = "setAudio:")
    public native void setAudio(AdsAudioConfig v);
    @Property(selector = "adReport")
    public native AdReportConfig getAdReport();
    @Property(selector = "setAdReport:")
    public native void setAdReport(AdReportConfig v);
    @Property(selector = "imai")
    public native ImaiConfig getImai();
    @Property(selector = "setImai:")
    public native void setImai(ImaiConfig v);
    @Property(selector = "mediaVolumeCollectionEnabled")
    public native boolean isMediaVolumeCollectionEnabled();
    @Property(selector = "setMediaVolumeCollectionEnabled:")
    public native void setMediaVolumeCollectionEnabled(boolean v);
    @Property(selector = "applyGzipReq")
    public native boolean isApplyGzipReq();
    @Property(selector = "setApplyGzipReq:")
    public native void setApplyGzipReq(boolean v);
    @Property(selector = "viewability")
    public native ViewabilityConfig getViewability();
    @Property(selector = "setViewability:")
    public native void setViewability(ViewabilityConfig v);
    @Property(selector = "adQuality")
    public native AdQualityConfig getAdQuality();
    @Property(selector = "setAdQuality:")
    public native void setAdQuality(AdQualityConfig v);
    @Property(selector = "watermarkEnabled")
    public native boolean isWatermarkEnabled();
    @Property(selector = "setWatermarkEnabled:")
    public native void setWatermarkEnabled(boolean v);
    @Property(selector = "showIntWithoutVC")
    public native boolean isShowIntWithoutVC();
    @Property(selector = "setShowIntWithoutVC:")
    public native void setShowIntWithoutVC(boolean v);
    @Property(selector = "enableOrientationReentryGuard")
    public native boolean isEnableOrientationReentryGuard();
    @Property(selector = "setEnableOrientationReentryGuard:")
    public native void setEnableOrientationReentryGuard(boolean v);
    @Property(selector = "timeouts")
    public native TimeoutsConfig getTimeouts();
    @Property(selector = "setTimeouts:")
    public native void setTimeouts(TimeoutsConfig v);
    @Property(selector = "vastVideo")
    public native VastVideoConfig getVastVideo();
    @Property(selector = "setVastVideo:")
    public native void setVastVideo(VastVideoConfig v);
    @Property(selector = "assetCache")
    public native AssetCacheConfig getAssetCache();
    @Property(selector = "setAssetCache:")
    public native void setAssetCache(AssetCacheConfig v);
    @Property(selector = "includeIds")
    public native IMIncludeIds getIncludeIds();
    @Property(selector = "setIncludeIds:")
    public native void setIncludeIds(IMIncludeIds v);
    @Property(selector = "skan")
    public native SkanConfig getSkan();
    @Property(selector = "setSkan:")
    public native void setSkan(SkanConfig v);
    @Property(selector = "rendering")
    public native RenderingConfig getRendering();
    @Property(selector = "setRendering:")
    public native void setRendering(RenderingConfig v);
    @Property(selector = "disableAppendingKeysForBeacons")
    public native NSArray<NSString> getDisableAppendingKeysForBeacons();
    @Property(selector = "setDisableAppendingKeysForBeacons:")
    public native void setDisableAppendingKeysForBeacons(NSArray<NSString> v);
    @Property(selector = "silenceDetection")
    public native SilenceDetectionConfig getSilenceDetection();
    @Property(selector = "setSilenceDetection:")
    public native void setSilenceDetection(SilenceDetectionConfig v);
    @Property(selector = "mraid")
    public native MraidConfig getMraid();
    @Property(selector = "setMraid:")
    public native void setMraid(MraidConfig v);
    @Property(selector = "native")
    public native NativeConfig getNative();
    @Property(selector = "setNative:")
    public native void setNative(NativeConfig v);
    @Property(selector = "jsDownloader")
    public native JSDownloaderConfig getJsDownloader();
    @Property(selector = "setJsDownloader:")
    public native void setJsDownloader(JSDownloaderConfig v);
    @Property(selector = "mraid3")
    public native Mraid3Config getMraid3();
    @Property(selector = "setMraid3:")
    public native void setMraid3(Mraid3Config v);
    @Property(selector = "pingV2")
    public native PingV2Config getPingV2();
    @Property(selector = "setPingV2:")
    public native void setPingV2(PingV2Config v);
    @Property(selector = "hybridNative")
    public native HybridPlayerConfig getHybridNative();
    @Property(selector = "setHybridNative:")
    public native void setHybridNative(HybridPlayerConfig v);
    @Property(selector = "customBrowser")
    public native CustomBrowserConfig getCustomBrowser();
    @Property(selector = "setCustomBrowser:")
    public native void setCustomBrowser(CustomBrowserConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getType")
    public native String getType();
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    @Method(selector = "getAdServerUrl")
    public native String getAdServerUrl();
    @Method(selector = "getWebviewConfigFor:")
    public native WebViewModeConfig getWebviewConfigFor(String type);
    /*</methods>*/
}
