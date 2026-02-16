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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCPreferenceHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCPreferenceHelperPtr extends Ptr<BNCPreferenceHelper, BNCPreferenceHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCPreferenceHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCPreferenceHelper() {}
    protected BNCPreferenceHelper(Handle h, long handle) { super(h, handle); }
    protected BNCPreferenceHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lastRunBranchKey")
    public native String getLastRunBranchKey();
    @Property(selector = "setLastRunBranchKey:")
    public native void setLastRunBranchKey(String v);
    @Property(selector = "lastStrongMatchDate")
    public native NSDate getLastStrongMatchDate();
    @Property(selector = "setLastStrongMatchDate:")
    public native void setLastStrongMatchDate(NSDate v);
    @Property(selector = "appVersion")
    public native String getAppVersion();
    @Property(selector = "setAppVersion:")
    public native void setAppVersion(String v);
    @Property(selector = "randomizedDeviceToken")
    public native String getRandomizedDeviceToken();
    @Property(selector = "setRandomizedDeviceToken:")
    public native void setRandomizedDeviceToken(String v);
    @Property(selector = "randomizedBundleToken")
    public native String getRandomizedBundleToken();
    @Property(selector = "setRandomizedBundleToken:")
    public native void setRandomizedBundleToken(String v);
    @Property(selector = "anonID")
    public native String getAnonID();
    @Property(selector = "setAnonID:")
    public native void setAnonID(String v);
    @Property(selector = "sessionID")
    public native String getSessionID();
    @Property(selector = "setSessionID:")
    public native void setSessionID(String v);
    @Property(selector = "linkClickIdentifier")
    public native String getLinkClickIdentifier();
    @Property(selector = "setLinkClickIdentifier:")
    public native void setLinkClickIdentifier(String v);
    @Property(selector = "spotlightIdentifier")
    public native String getSpotlightIdentifier();
    @Property(selector = "setSpotlightIdentifier:")
    public native void setSpotlightIdentifier(String v);
    @Property(selector = "universalLinkUrl")
    public native String getUniversalLinkUrl();
    @Property(selector = "setUniversalLinkUrl:")
    public native void setUniversalLinkUrl(String v);
    @Property(selector = "initialReferrer")
    public native String getInitialReferrer();
    @Property(selector = "setInitialReferrer:")
    public native void setInitialReferrer(String v);
    @Property(selector = "userUrl")
    public native String getUserUrl();
    @Property(selector = "setUserUrl:")
    public native void setUserUrl(String v);
    @Property(selector = "localUrl")
    public native String getLocalUrl();
    @Property(selector = "setLocalUrl:")
    public native void setLocalUrl(String v);
    @Property(selector = "userIdentity")
    public native String getUserIdentity();
    @Property(selector = "setUserIdentity:")
    public native void setUserIdentity(String v);
    @Property(selector = "sessionParams")
    public native String getSessionParams();
    @Property(selector = "setSessionParams:")
    public native void setSessionParams(String v);
    @Property(selector = "installParams")
    public native String getInstallParams();
    @Property(selector = "setInstallParams:")
    public native void setInstallParams(String v);
    @Property(selector = "isDebug")
    public native boolean isDebug();
    @Property(selector = "setIsDebug:")
    public native void setIsDebug(boolean v);
    @Property(selector = "appleAttributionTokenChecked")
    public native boolean isAppleAttributionTokenChecked();
    @Property(selector = "setAppleAttributionTokenChecked:")
    public native void setAppleAttributionTokenChecked(boolean v);
    @Property(selector = "hasOptedInBefore")
    public native boolean hasOptedInBefore();
    @Property(selector = "setHasOptedInBefore:")
    public native void setHasOptedInBefore(boolean v);
    @Property(selector = "hasCalledHandleATTAuthorizationStatus")
    public native boolean hasCalledHandleATTAuthorizationStatus();
    @Property(selector = "setHasCalledHandleATTAuthorizationStatus:")
    public native void setHasCalledHandleATTAuthorizationStatus(boolean v);
    @Property(selector = "retryCount")
    public native @MachineSizedSInt long getRetryCount();
    @Property(selector = "setRetryCount:")
    public native void setRetryCount(@MachineSizedSInt long v);
    @Property(selector = "retryInterval")
    public native double getRetryInterval();
    @Property(selector = "setRetryInterval:")
    public native void setRetryInterval(double v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    @Property(selector = "thirdPartyAPIsWaitTime")
    public native double getThirdPartyAPIsWaitTime();
    @Property(selector = "setThirdPartyAPIsWaitTime:")
    public native void setThirdPartyAPIsWaitTime(double v);
    @Property(selector = "externalIntentURI")
    public native String getExternalIntentURI();
    @Property(selector = "setExternalIntentURI:")
    public native void setExternalIntentURI(String v);
    @Property(selector = "savedAnalyticsData")
    public native NSMutableDictionary<?, ?> getSavedAnalyticsData();
    @Property(selector = "setSavedAnalyticsData:")
    public native void setSavedAnalyticsData(NSMutableDictionary<?, ?> v);
    @Property(selector = "lastSystemBuildVersion")
    public native String getLastSystemBuildVersion();
    @Property(selector = "setLastSystemBuildVersion:")
    public native void setLastSystemBuildVersion(String v);
    @Property(selector = "browserUserAgentString")
    public native String getBrowserUserAgentString();
    @Property(selector = "setBrowserUserAgentString:")
    public native void setBrowserUserAgentString(String v);
    @Property(selector = "referringURL")
    public native String getReferringURL();
    @Property(selector = "setReferringURL:")
    public native void setReferringURL(String v);
    @Property(selector = "limitFacebookTracking")
    public native boolean isLimitFacebookTracking();
    @Property(selector = "setLimitFacebookTracking:")
    public native void setLimitFacebookTracking(boolean v);
    @Property(selector = "previousAppBuildDate")
    public native NSDate getPreviousAppBuildDate();
    @Property(selector = "setPreviousAppBuildDate:")
    public native void setPreviousAppBuildDate(NSDate v);
    @Property(selector = "disableAdNetworkCallouts")
    public native boolean isDisableAdNetworkCallouts();
    @Property(selector = "setDisableAdNetworkCallouts:")
    public native void setDisableAdNetworkCallouts(boolean v);
    @Property(selector = "patternListURL")
    public native String getPatternListURL();
    @Property(selector = "setPatternListURL:")
    public native void setPatternListURL(String v);
    @Property(selector = "savedURLPatternList")
    public native NSArray<NSString> getSavedURLPatternList();
    @Property(selector = "setSavedURLPatternList:")
    public native void setSavedURLPatternList(NSArray<NSString> v);
    @Property(selector = "savedURLPatternListVersion")
    public native @MachineSizedSInt long getSavedURLPatternListVersion();
    @Property(selector = "setSavedURLPatternListVersion:")
    public native void setSavedURLPatternListVersion(@MachineSizedSInt long v);
    @Property(selector = "dropURLOpen")
    public native boolean isDropURLOpen();
    @Property(selector = "setDropURLOpen:")
    public native void setDropURLOpen(boolean v);
    @Property(selector = "trackingDisabled")
    public native boolean isTrackingDisabled();
    @Property(selector = "setTrackingDisabled:")
    public native void setTrackingDisabled(boolean v);
    @Property(selector = "referrerGBRAID")
    public native String getReferrerGBRAID();
    @Property(selector = "setReferrerGBRAID:")
    public native void setReferrerGBRAID(String v);
    @Property(selector = "referrerGBRAIDValidityWindow")
    public native double getReferrerGBRAIDValidityWindow();
    @Property(selector = "setReferrerGBRAIDValidityWindow:")
    public native void setReferrerGBRAIDValidityWindow(double v);
    @Property(selector = "referrerGBRAIDInitDate")
    public native NSDate getReferrerGBRAIDInitDate();
    @Property(selector = "setReferrerGBRAIDInitDate:")
    public native void setReferrerGBRAIDInitDate(NSDate v);
    @Property(selector = "referringURLQueryParameters")
    public native NSMutableDictionary<?, ?> getReferringURLQueryParameters();
    @Property(selector = "setReferringURLQueryParameters:")
    public native void setReferringURLQueryParameters(NSMutableDictionary<?, ?> v);
    @Property(selector = "odmInfo")
    public native String getOdmInfo();
    @Property(selector = "setOdmInfo:")
    public native void setOdmInfo(String v);
    @Property(selector = "odmInfoValidityWindow")
    public native double getOdmInfoValidityWindow();
    @Property(selector = "setOdmInfoValidityWindow:")
    public native void setOdmInfoValidityWindow(double v);
    @Property(selector = "odmInfoInitDate")
    public native NSDate getOdmInfoInitDate();
    @Property(selector = "setOdmInfoInitDate:")
    public native void setOdmInfoInitDate(NSDate v);
    @Property(selector = "skanCurrentWindow")
    public native @MachineSizedSInt long getSkanCurrentWindow();
    @Property(selector = "setSkanCurrentWindow:")
    public native void setSkanCurrentWindow(@MachineSizedSInt long v);
    @Property(selector = "highestConversionValueSent")
    public native @MachineSizedSInt long getHighestConversionValueSent();
    @Property(selector = "setHighestConversionValueSent:")
    public native void setHighestConversionValueSent(@MachineSizedSInt long v);
    @Property(selector = "firstAppLaunchTime")
    public native NSDate getFirstAppLaunchTime();
    @Property(selector = "setFirstAppLaunchTime:")
    public native void setFirstAppLaunchTime(NSDate v);
    @Property(selector = "invokeRegisterApp")
    public native boolean isInvokeRegisterApp();
    @Property(selector = "setInvokeRegisterApp:")
    public native void setInvokeRegisterApp(boolean v);
    @Property(selector = "eeaRegion")
    public native boolean isEeaRegion();
    @Property(selector = "setEeaRegion:")
    public native void setEeaRegion(boolean v);
    @Property(selector = "adPersonalizationConsent")
    public native boolean isAdPersonalizationConsent();
    @Property(selector = "setAdPersonalizationConsent:")
    public native void setAdPersonalizationConsent(boolean v);
    @Property(selector = "adUserDataUsageConsent")
    public native boolean isAdUserDataUsageConsent();
    @Property(selector = "setAdUserDataUsageConsent:")
    public native void setAdUserDataUsageConsent(boolean v);
    @Property(selector = "attributionLevel")
    public native String getAttributionLevel();
    @Property(selector = "setAttributionLevel:", strongRef = true)
    public native void setAttributionLevel(String v);
    @Property(selector = "uxType")
    public native String getUxType();
    @Property(selector = "setUxType:")
    public native void setUxType(String v);
    @Property(selector = "urlLoadMs")
    public native NSDate getUrlLoadMs();
    @Property(selector = "setUrlLoadMs:")
    public native void setUrlLoadMs(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "clearTrackingInformation")
    public native void clearTrackingInformation();
    @Method(selector = "setRequestMetadataKey:value:")
    public native void setRequestMetadata(String key, NSObject value);
    @Method(selector = "requestMetadataDictionary")
    public native NSMutableDictionary<?, ?> requestMetadataDictionary();
    @Method(selector = "addInstrumentationDictionaryKey:value:")
    public native void addInstrumentationDictionary(String key, String value);
    @Method(selector = "instrumentationDictionary")
    public native NSMutableDictionary<?, ?> instrumentationDictionary();
    @Method(selector = "instrumentationParameters")
    public native NSDictionary<?, ?> instrumentationParameters();
    @Method(selector = "clearInstrumentationDictionary")
    public native void clearInstrumentationDictionary();
    @Method(selector = "saveBranchAnalyticsData:")
    public native void saveBranchAnalyticsData(NSDictionary<?, ?> analyticsData);
    @Method(selector = "clearBranchAnalyticsData")
    public native void clearBranchAnalyticsData();
    @Method(selector = "getBranchAnalyticsData")
    public native NSMutableDictionary<?, ?> getBranchAnalyticsData();
    @Method(selector = "getContentAnalyticsManifest")
    public native NSDictionary<?, ?> getContentAnalyticsManifest();
    @Method(selector = "saveContentAnalyticsManifest:")
    public native void saveContentAnalyticsManifest(NSDictionary<?, ?> cdManifest);
    @Method(selector = "sanitizedMutableBaseURL:")
    public native NSMutableString sanitizedMutableBaseURL(String baseUrl);
    @Method(selector = "synchronize")
    public native void synchronize();
    @Method(selector = "eeaRegionInitialized")
    public native boolean eeaRegionInitialized();
    @Method(selector = "attributionLevelInitialized")
    public native boolean attributionLevelInitialized();
    @Method(selector = "sharedInstance")
    public static native BNCPreferenceHelper sharedInstance();
    @Method(selector = "clearAll")
    public static native void clearAll();
    /*</methods>*/
}
