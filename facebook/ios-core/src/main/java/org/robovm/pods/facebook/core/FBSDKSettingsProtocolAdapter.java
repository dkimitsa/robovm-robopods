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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSettingsProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSettingsProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("appID")
    public String getAppID() { return null; }
    @NotImplemented("setAppID:")
    public void setAppID(String v) {}
    @NotImplemented("clientToken")
    public String getClientToken() { return null; }
    @NotImplemented("setClientToken:")
    public void setClientToken(String v) {}
    @NotImplemented("sdkVersion")
    public String getSdkVersion() { return null; }
    @NotImplemented("displayName")
    public String getDisplayName() { return null; }
    @NotImplemented("setDisplayName:")
    public void setDisplayName(String v) {}
    @NotImplemented("facebookDomainPart")
    public String getFacebookDomainPart() { return null; }
    @NotImplemented("setFacebookDomainPart:")
    public void setFacebookDomainPart(String v) {}
    @NotImplemented("loggingBehaviors")
    public NSSet<NSString> getLoggingBehaviors() { return null; }
    @NotImplemented("setLoggingBehaviors:")
    public void setLoggingBehaviors(NSSet<NSString> v) {}
    @NotImplemented("appURLSchemeSuffix")
    public String getAppURLSchemeSuffix() { return null; }
    @NotImplemented("setAppURLSchemeSuffix:")
    public void setAppURLSchemeSuffix(String v) {}
    @NotImplemented("isDataProcessingRestricted")
    public boolean isDataProcessingRestricted() { return false; }
    @NotImplemented("isAutoLogAppEventsEnabled")
    public boolean isAutoLogAppEventsEnabled() { return false; }
    @NotImplemented("isCodelessDebugLogEnabled")
    public boolean isCodelessDebugLogEnabled() { return false; }
    @NotImplemented("setIsCodelessDebugLogEnabled:")
    public void setIsCodelessDebugLogEnabled(boolean v) {}
    @NotImplemented("isAdvertiserIDCollectionEnabled")
    public boolean isAdvertiserIDCollectionEnabled() { return false; }
    @NotImplemented("setIsAdvertiserIDCollectionEnabled:")
    public void setIsAdvertiserIDCollectionEnabled(boolean v) {}
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `isATETimeSufficientlyDelayed` instead.
     */
    @Deprecated
    @NotImplemented("isSetATETimeExceedsInstallTime")
    public boolean isSetATETimeExceedsInstallTime() { return false; }
    @NotImplemented("isATETimeSufficientlyDelayed")
    public boolean isATETimeSufficientlyDelayed() { return false; }
    @NotImplemented("isSKAdNetworkReportEnabled")
    public boolean isSKAdNetworkReportEnabled() { return false; }
    @NotImplemented("installTimestamp")
    public NSDate getInstallTimestamp() { return null; }
    @NotImplemented("advertiserTrackingEnabledTimestamp")
    public NSDate getAdvertiserTrackingEnabledTimestamp() { return null; }
    @NotImplemented("isEventDataUsageLimited")
    public boolean isEventDataUsageLimited() { return false; }
    @NotImplemented("setIsEventDataUsageLimited:")
    public void setIsEventDataUsageLimited(boolean v) {}
    @NotImplemented("shouldUseTokenOptimizations")
    public boolean shouldUseTokenOptimizations() { return false; }
    @NotImplemented("setShouldUseTokenOptimizations:")
    public void setShouldUseTokenOptimizations(boolean v) {}
    @NotImplemented("graphAPIVersion")
    public String getGraphAPIVersion() { return null; }
    @NotImplemented("setGraphAPIVersion:")
    public void setGraphAPIVersion(String v) {}
    @NotImplemented("isGraphErrorRecoveryEnabled")
    public boolean isGraphErrorRecoveryEnabled() { return false; }
    @NotImplemented("setIsGraphErrorRecoveryEnabled:")
    public void setIsGraphErrorRecoveryEnabled(boolean v) {}
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `graphAPIDebugParameterValue` instead.
     */
    @Deprecated
    @NotImplemented("graphAPIDebugParamValue")
    public String getGraphAPIDebugParamValue() { return null; }
    @NotImplemented("graphAPIDebugParameterValue")
    public String getGraphAPIDebugParameterValue() { return null; }
    @NotImplemented("isAdvertiserTrackingEnabled")
    public boolean isAdvertiserTrackingEnabled() { return false; }
    @NotImplemented("setIsAdvertiserTrackingEnabled:")
    public void setIsAdvertiserTrackingEnabled(boolean v) {}
    @NotImplemented("shouldUseCachedValuesForExpensiveMetadata")
    public boolean shouldUseCachedValuesForExpensiveMetadata() { return false; }
    @NotImplemented("setShouldUseCachedValuesForExpensiveMetadata:")
    public void setShouldUseCachedValuesForExpensiveMetadata(boolean v) {}
    @NotImplemented("persistableDataProcessingOptions")
    public NSDictionary<NSString, ?> getPersistableDataProcessingOptions() { return null; }
    @NotImplemented("isDomainErrorEnabled")
    public boolean isDomainErrorEnabled() { return false; }
    @NotImplemented("setIsDomainErrorEnabled:")
    public void setIsDomainErrorEnabled(boolean v) {}
    @NotImplemented("limitedLoginAutoRefreshInterval")
    public double getLimitedLoginAutoRefreshInterval() { return 0; }
    @NotImplemented("setLimitedLoginAutoRefreshInterval:")
    public void setLimitedLoginAutoRefreshInterval(double v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setDataProcessingOptions:")
    public void setDataProcessingOptions(NSArray<NSString> options) {}
    @NotImplemented("setDataProcessingOptions:country:state:")
    public void setDataProcessingOptions(NSArray<NSString> options, int country, int state) {}
    @NotImplemented("isLoggingBehaviorEnabled:")
    public boolean isLoggingBehaviorEnabled(FBSDKLoggingBehavior loggingBehavior) { return false; }
    /*</methods>*/
}
