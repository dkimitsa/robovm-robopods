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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBSDKSettingsProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "appID")
    String getAppID();
    @Property(selector = "setAppID:")
    void setAppID(String v);
    @Property(selector = "clientToken")
    String getClientToken();
    @Property(selector = "setClientToken:")
    void setClientToken(String v);
    @Property(selector = "sdkVersion")
    String getSdkVersion();
    @Property(selector = "displayName")
    String getDisplayName();
    @Property(selector = "setDisplayName:")
    void setDisplayName(String v);
    @Property(selector = "facebookDomainPart")
    String getFacebookDomainPart();
    @Property(selector = "setFacebookDomainPart:")
    void setFacebookDomainPart(String v);
    @Property(selector = "loggingBehaviors")
    NSSet<NSString> getLoggingBehaviors();
    @Property(selector = "setLoggingBehaviors:")
    void setLoggingBehaviors(NSSet<NSString> v);
    @Property(selector = "appURLSchemeSuffix")
    String getAppURLSchemeSuffix();
    @Property(selector = "setAppURLSchemeSuffix:")
    void setAppURLSchemeSuffix(String v);
    @Property(selector = "isDataProcessingRestricted")
    boolean isDataProcessingRestricted();
    @Property(selector = "isAutoLogAppEventsEnabled")
    boolean isAutoLogAppEventsEnabled();
    @Property(selector = "isCodelessDebugLogEnabled")
    boolean isCodelessDebugLogEnabled();
    @Property(selector = "setIsCodelessDebugLogEnabled:")
    void setIsCodelessDebugLogEnabled(boolean v);
    @Property(selector = "isAdvertiserIDCollectionEnabled")
    boolean isAdvertiserIDCollectionEnabled();
    @Property(selector = "setIsAdvertiserIDCollectionEnabled:")
    void setIsAdvertiserIDCollectionEnabled(boolean v);
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `isATETimeSufficientlyDelayed` instead.
     */
    @Deprecated
    @Property(selector = "isSetATETimeExceedsInstallTime")
    boolean isSetATETimeExceedsInstallTime();
    @Property(selector = "isATETimeSufficientlyDelayed")
    boolean isATETimeSufficientlyDelayed();
    @Property(selector = "isSKAdNetworkReportEnabled")
    boolean isSKAdNetworkReportEnabled();
    @Property(selector = "installTimestamp")
    NSDate getInstallTimestamp();
    @Property(selector = "advertiserTrackingEnabledTimestamp")
    NSDate getAdvertiserTrackingEnabledTimestamp();
    @Property(selector = "isEventDataUsageLimited")
    boolean isEventDataUsageLimited();
    @Property(selector = "setIsEventDataUsageLimited:")
    void setIsEventDataUsageLimited(boolean v);
    @Property(selector = "shouldUseTokenOptimizations")
    boolean shouldUseTokenOptimizations();
    @Property(selector = "setShouldUseTokenOptimizations:")
    void setShouldUseTokenOptimizations(boolean v);
    @Property(selector = "graphAPIVersion")
    String getGraphAPIVersion();
    @Property(selector = "setGraphAPIVersion:")
    void setGraphAPIVersion(String v);
    @Property(selector = "isGraphErrorRecoveryEnabled")
    boolean isGraphErrorRecoveryEnabled();
    @Property(selector = "setIsGraphErrorRecoveryEnabled:")
    void setIsGraphErrorRecoveryEnabled(boolean v);
    /**
     * @deprecated This property is deprecated and will be removed in the next major release.       Use `graphAPIDebugParameterValue` instead.
     */
    @Deprecated
    @Property(selector = "graphAPIDebugParamValue")
    String getGraphAPIDebugParamValue();
    @Property(selector = "graphAPIDebugParameterValue")
    String getGraphAPIDebugParameterValue();
    @Property(selector = "isAdvertiserTrackingEnabled")
    boolean isAdvertiserTrackingEnabled();
    @Property(selector = "setIsAdvertiserTrackingEnabled:")
    void setIsAdvertiserTrackingEnabled(boolean v);
    @Property(selector = "shouldUseCachedValuesForExpensiveMetadata")
    boolean shouldUseCachedValuesForExpensiveMetadata();
    @Property(selector = "setShouldUseCachedValuesForExpensiveMetadata:")
    void setShouldUseCachedValuesForExpensiveMetadata(boolean v);
    @Property(selector = "persistableDataProcessingOptions")
    NSDictionary<NSString, ?> getPersistableDataProcessingOptions();
    @Property(selector = "isDomainErrorEnabled")
    boolean isDomainErrorEnabled();
    @Property(selector = "setIsDomainErrorEnabled:")
    void setIsDomainErrorEnabled(boolean v);
    @Property(selector = "limitedLoginAutoRefreshInterval")
    double getLimitedLoginAutoRefreshInterval();
    @Property(selector = "setLimitedLoginAutoRefreshInterval:")
    void setLimitedLoginAutoRefreshInterval(double v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setDataProcessingOptions:")
    void setDataProcessingOptions(NSArray<NSString> options);
    @Method(selector = "setDataProcessingOptions:country:state:")
    void setDataProcessingOptions(NSArray<NSString> options, int country, int state);
    @Method(selector = "isLoggingBehaviorEnabled:")
    boolean isLoggingBehaviorEnabled(FBSDKLoggingBehavior loggingBehavior);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
