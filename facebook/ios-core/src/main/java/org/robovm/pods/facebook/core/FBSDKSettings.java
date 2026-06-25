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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSettingsLogging, FBSDKSettingsProtocol/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSettingsPtr extends Ptr<FBSDKSettings, FBSDKSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKSettings() {}
    protected FBSDKSettings(Handle h, long handle) { super(h, handle); }
    protected FBSDKSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sdkVersion")
    public native String getSdkVersion();
    @Property(selector = "defaultGraphAPIVersion")
    public native String getDefaultGraphAPIVersion();
    @Property(selector = "JPEGCompressionQuality")
    public native @MachineSizedFloat double getJPEGCompressionQuality();
    @Property(selector = "setJPEGCompressionQuality:")
    public native void setJPEGCompressionQuality(@MachineSizedFloat double v);
    @Property(selector = "isAutoLogAppEventsEnabled")
    public native boolean isAutoLogAppEventsEnabled();
    @Property(selector = "setIsAutoLogAppEventsEnabled:")
    public native void setIsAutoLogAppEventsEnabled(boolean v);
    @Property(selector = "isCodelessDebugLogEnabled")
    public native boolean isCodelessDebugLogEnabled();
    @Property(selector = "setIsCodelessDebugLogEnabled:")
    public native void setIsCodelessDebugLogEnabled(boolean v);
    @Property(selector = "isAdvertiserIDCollectionEnabled")
    public native boolean isAdvertiserIDCollectionEnabled();
    @Property(selector = "setIsAdvertiserIDCollectionEnabled:")
    public native void setIsAdvertiserIDCollectionEnabled(boolean v);
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `isSKAdNetworkReportEnabled` instead.
     */
    @Deprecated
    @Property(selector = "skAdNetworkReportEnabled")
    public native boolean isSkAdNetworkReportEnabled();
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `isSKAdNetworkReportEnabled` instead.
     */
    @Deprecated
    @Property(selector = "setSkAdNetworkReportEnabled:")
    public native void setSkAdNetworkReportEnabled(boolean v);
    @Property(selector = "isSKAdNetworkReportEnabled")
    public native boolean isSKAdNetworkReportEnabled();
    @Property(selector = "setIsSKAdNetworkReportEnabled:")
    public native void setIsSKAdNetworkReportEnabled(boolean v);
    @Property(selector = "isEventDataUsageLimited")
    public native boolean isEventDataUsageLimited();
    @Property(selector = "setIsEventDataUsageLimited:")
    public native void setIsEventDataUsageLimited(boolean v);
    @Property(selector = "shouldUseCachedValuesForExpensiveMetadata")
    public native boolean shouldUseCachedValuesForExpensiveMetadata();
    @Property(selector = "setShouldUseCachedValuesForExpensiveMetadata:")
    public native void setShouldUseCachedValuesForExpensiveMetadata(boolean v);
    @Property(selector = "isGraphErrorRecoveryEnabled")
    public native boolean isGraphErrorRecoveryEnabled();
    @Property(selector = "setIsGraphErrorRecoveryEnabled:")
    public native void setIsGraphErrorRecoveryEnabled(boolean v);
    @Property(selector = "appID")
    public native String getAppID();
    @Property(selector = "setAppID:")
    public native void setAppID(String v);
    @Property(selector = "appURLSchemeSuffix")
    public native String getAppURLSchemeSuffix();
    @Property(selector = "setAppURLSchemeSuffix:")
    public native void setAppURLSchemeSuffix(String v);
    @Property(selector = "clientToken")
    public native String getClientToken();
    @Property(selector = "setClientToken:")
    public native void setClientToken(String v);
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public native void setDisplayName(String v);
    @Property(selector = "facebookDomainPart")
    public native String getFacebookDomainPart();
    @Property(selector = "setFacebookDomainPart:")
    public native void setFacebookDomainPart(String v);
    @Property(selector = "graphAPIVersion")
    public native String getGraphAPIVersion();
    @Property(selector = "setGraphAPIVersion:")
    public native void setGraphAPIVersion(String v);
    @Property(selector = "userAgentSuffix")
    public native String getUserAgentSuffix();
    @Property(selector = "setUserAgentSuffix:")
    public native void setUserAgentSuffix(String v);
    @Property(selector = "isAdvertiserTrackingEnabled")
    public native boolean isAdvertiserTrackingEnabled();
    @Property(selector = "setIsAdvertiserTrackingEnabled:")
    public native void setIsAdvertiserTrackingEnabled(boolean v);
    @Property(selector = "isDataProcessingRestricted")
    public native boolean isDataProcessingRestricted();
    @Property(selector = "persistableDataProcessingOptions")
    public native NSDictionary<NSString, ?> getPersistableDataProcessingOptions();
    @Property(selector = "loggingBehaviors")
    public native NSSet<NSString> getLoggingBehaviors();
    @Property(selector = "setLoggingBehaviors:")
    public native void setLoggingBehaviors(NSSet<NSString> v);
    @Property(selector = "shouldUseTokenOptimizations")
    public native boolean shouldUseTokenOptimizations();
    @Property(selector = "setShouldUseTokenOptimizations:")
    public native void setShouldUseTokenOptimizations(boolean v);
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `isATETimeSufficientlyDelayed` instead.
     */
    @Deprecated
    @Property(selector = "isSetATETimeExceedsInstallTime")
    public native boolean isSetATETimeExceedsInstallTime();
    @Property(selector = "isATETimeSufficientlyDelayed")
    public native boolean isATETimeSufficientlyDelayed();
    @Property(selector = "installTimestamp")
    public native NSDate getInstallTimestamp();
    @Property(selector = "advertiserTrackingEnabledTimestamp")
    public native NSDate getAdvertiserTrackingEnabledTimestamp();
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `graphAPIDebugParameterValue` instead.
     */
    @Deprecated
    @Property(selector = "graphAPIDebugParamValue")
    public native String getGraphAPIDebugParamValue();
    @Property(selector = "graphAPIDebugParameterValue")
    public native String getGraphAPIDebugParameterValue();
    @Property(selector = "limitedLoginAutoRefreshInterval")
    public native double getLimitedLoginAutoRefreshInterval();
    @Property(selector = "setLimitedLoginAutoRefreshInterval:")
    public native void setLimitedLoginAutoRefreshInterval(double v);
    @Property(selector = "isDomainErrorEnabled")
    public native boolean isDomainErrorEnabled();
    @Property(selector = "setIsDomainErrorEnabled:")
    public native void setIsDomainErrorEnabled(boolean v);
    @Property(selector = "addToMessagingCustomerBaseForWhatsApp")
    public native NSNumber getAddToMessagingCustomerBaseForWhatsApp();
    @Property(selector = "setAddToMessagingCustomerBaseForWhatsApp:")
    public native void setAddToMessagingCustomerBaseForWhatsApp(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDataProcessingOptions:")
    public native void setDataProcessingOptions(NSArray<NSString> options);
    @Method(selector = "setDataProcessingOptions:country:state:")
    public native void setDataProcessingOptions(NSArray<NSString> options, int country, int state);
    @Method(selector = "enableLoggingBehavior:")
    public native void enableLoggingBehavior(FBSDKLoggingBehavior loggingBehavior);
    @Method(selector = "disableLoggingBehavior:")
    public native void disableLoggingBehavior(FBSDKLoggingBehavior loggingBehavior);
    @Method(selector = "isLoggingBehaviorEnabled:")
    public native boolean isLoggingBehaviorEnabled(FBSDKLoggingBehavior loggingBehavior);
    @Method(selector = "sharedSettings")
    public static native FBSDKSettings sharedSettings();
    @Method(selector = "recordInstall")
    public native void recordInstall();
    @Method(selector = "logIfSDKSettingsChanged")
    public native void logIfSDKSettingsChanged();
    /*</methods>*/
}
