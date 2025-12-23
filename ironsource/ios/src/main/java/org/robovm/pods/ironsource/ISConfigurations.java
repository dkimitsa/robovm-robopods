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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISConfigurations/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISConfigurationsPtr extends Ptr<ISConfigurations, ISConfigurationsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISConfigurations.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISConfigurations() {}
    protected ISConfigurations(Handle h, long handle) { super(h, handle); }
    protected ISConfigurations(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    @Property(selector = "appKey")
    public native String getAppKey();
    @Property(selector = "setAppKey:")
    public native void setAppKey(String v);
    @Property(selector = "segmentId")
    public native String getSegmentId();
    @Property(selector = "setSegmentId:")
    public native void setSegmentId(String v);
    @Property(selector = "customSegmentParams")
    public native NSDictionary<?, ?> getCustomSegmentParams();
    @Property(selector = "setCustomSegmentParams:")
    public native void setCustomSegmentParams(NSDictionary<?, ?> v);
    @Property(selector = "segment")
    public native LPMSegment getSegment();
    @Property(selector = "setSegment:")
    public native void setSegment(LPMSegment v);
    @Property(selector = "rewardedVideoCustomParameters")
    public native NSDictionary<?, ?> getRewardedVideoCustomParameters();
    @Property(selector = "setRewardedVideoCustomParameters:")
    public native void setRewardedVideoCustomParameters(NSDictionary<?, ?> v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    @Property(selector = "adapterTimeOutInSeconds")
    public native NSNumber getAdapterTimeOutInSeconds();
    @Property(selector = "setAdapterTimeOutInSeconds:")
    public native void setAdapterTimeOutInSeconds(NSNumber v);
    @Property(selector = "maxNumOfAdaptersToLoadOnStart")
    public native NSNumber getMaxNumOfAdaptersToLoadOnStart();
    @Property(selector = "setMaxNumOfAdaptersToLoadOnStart:")
    public native void setMaxNumOfAdaptersToLoadOnStart(NSNumber v);
    @Property(selector = "advancedLoading")
    public native boolean isAdvancedLoading();
    @Property(selector = "setAdvancedLoading:")
    public native void setAdvancedLoading(boolean v);
    @Property(selector = "plugin")
    public native String getPlugin();
    @Property(selector = "setPlugin:")
    public native void setPlugin(String v);
    @Property(selector = "pluginVersion")
    public native String getPluginVersion();
    @Property(selector = "setPluginVersion:")
    public native void setPluginVersion(String v);
    @Property(selector = "pluginFrameworkVersion")
    public native String getPluginFrameworkVersion();
    @Property(selector = "setPluginFrameworkVersion:")
    public native void setPluginFrameworkVersion(String v);
    @Property(selector = "maxVideosPerIteration")
    public native NSNumber getMaxVideosPerIteration();
    @Property(selector = "setMaxVideosPerIteration:")
    public native void setMaxVideosPerIteration(NSNumber v);
    @Property(selector = "userAge")
    public native @MachineSizedSInt long getUserAge();
    @Property(selector = "setUserAge:")
    public native void setUserAge(@MachineSizedSInt long v);
    @Property(selector = "trackReachability")
    public native boolean isTrackReachability();
    @Property(selector = "setTrackReachability:")
    public native void setTrackReachability(boolean v);
    @Property(selector = "dynamicUserId")
    public native String getDynamicUserId();
    @Property(selector = "setDynamicUserId:")
    public native void setDynamicUserId(String v);
    @Property(selector = "adaptersDebug")
    public native boolean isAdaptersDebug();
    @Property(selector = "setAdaptersDebug:")
    public native void setAdaptersDebug(boolean v);
    @Property(selector = "mediationType")
    public native String getMediationType();
    @Property(selector = "setMediationType:")
    public native void setMediationType(String v);
    @Property(selector = "serr")
    public native NSNumber getSerr();
    @Property(selector = "setSerr:")
    public native void setSerr(NSNumber v);
    @Property(selector = "abt")
    public native String getAbt();
    @Property(selector = "setAbt:")
    public native void setAbt(String v);
    @Property(selector = "rvServerParams")
    public native NSDictionary<?, ?> getRvServerParams();
    @Property(selector = "setRvServerParams:")
    public native void setRvServerParams(NSDictionary<?, ?> v);
    @Property(selector = "consent")
    public native @MachineSizedSInt long getConsent();
    @Property(selector = "setConsent:")
    public native void setConsent(@MachineSizedSInt long v);
    @Property(selector = "didSetConsent")
    public native boolean didSetConsent();
    @Property(selector = "setDidSetConsent:")
    public native void setDidSetConsent(boolean v);
    @Property(selector = "batchGenericParams")
    public native NSDictionary<?, ?> getBatchGenericParams();
    @Property(selector = "setBatchGenericParams:")
    public native void setBatchGenericParams(NSDictionary<?, ?> v);
    @Property(selector = "eventGenericParams")
    public native NSDictionary<?, ?> getEventGenericParams();
    @Property(selector = "setEventGenericParams:")
    public native void setEventGenericParams(NSDictionary<?, ?> v);
    @Property(selector = "eventPixelParams")
    public native NSDictionary<?, ?> getEventPixelParams();
    @Property(selector = "setEventPixelParams:")
    public native void setEventPixelParams(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getConfigurations")
    public static native ISConfigurations getConfigurations();
    /*</methods>*/
}
