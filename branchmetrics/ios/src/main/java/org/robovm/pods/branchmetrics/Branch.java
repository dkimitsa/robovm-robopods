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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Branch/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchPtr extends Ptr<Branch, BranchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Branch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Branch() {}
    protected Branch(Handle h, long handle) { super(h, handle); }
    protected Branch(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInterface:queue:cache:preferenceHelper:key:")
    public Branch(BNCServerInterface inf, BNCServerRequestQueue queue, BNCLinkCache cache, BNCPreferenceHelper preferenceHelper, String key) { super((SkipInit) null); initObject(init(inf, queue, cache, preferenceHelper, key)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native BranchDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BranchDelegate v);
    @Deprecated
    @Property(selector = "sessionInitWithParamsCallback")
    public native @Block VoidBlock2<NSDictionary<?, ?>, NSError> getSessionInitWithParamsCallback();
    @Deprecated
    @Property(selector = "setSessionInitWithParamsCallback:")
    public native void setSessionInitWithParamsCallback(@Block VoidBlock2<NSDictionary<?, ?>, NSError> v);
    @Deprecated
    @Property(selector = "sessionInitWithBranchUniversalObjectCallback")
    public native @Block VoidBlock3<BranchUniversalObject, BranchLinkProperties, NSError> getSessionInitWithBranchUniversalObjectCallback();
    @Deprecated
    @Property(selector = "setSessionInitWithBranchUniversalObjectCallback:")
    public native void setSessionInitWithBranchUniversalObjectCallback(@Block VoidBlock3<BranchUniversalObject, BranchLinkProperties, NSError> v);
    @Property(selector = "serverInterface")
    public native BNCServerInterface getServerInterface();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BranchSDKVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="BranchSDKVersionString", optional=true)
    public static native BytePtr getVersionString();
    
    @Method(selector = "initSessionWithLaunchOptions:")
    public native void init(NSDictionary<?, ?> options);
    @Method(selector = "initSessionWithLaunchOptions:isReferrable:")
    public native void init(NSDictionary<?, ?> options, boolean isReferrable);
    @Method(selector = "initSessionWithLaunchOptions:andRegisterDeepLinkHandler:")
    public native void init(NSDictionary<?, ?> options, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:andRegisterDeepLinkHandlerUsingBranchUniversalObject:")
    public native void init(NSDictionary<?, ?> options, @Block VoidBlock3<BranchUniversalObject, BranchLinkProperties, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:automaticallyDisplayDeepLinkController:")
    public native void initWithAutomaticallyDisplayDeepLinkController(NSDictionary<?, ?> options, boolean automaticallyDisplayController);
    @Method(selector = "initSessionWithLaunchOptions:isReferrable:andRegisterDeepLinkHandler:")
    public native void init(NSDictionary<?, ?> options, boolean isReferrable, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:isReferrable:automaticallyDisplayDeepLinkController:")
    public native void init(NSDictionary<?, ?> options, boolean isReferrable, boolean automaticallyDisplayController);
    @Method(selector = "initSessionWithLaunchOptions:automaticallyDisplayDeepLinkController:deepLinkHandler:")
    public native void initWithAutomaticallyDisplayDeepLinkControllerAndHandler(NSDictionary<?, ?> options, boolean automaticallyDisplayController, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:automaticallyDisplayDeepLinkController:isReferrable:deepLinkHandler:")
    public native void init(NSDictionary<?, ?> options, boolean automaticallyDisplayController, boolean isReferrable, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSceneSessionWithLaunchOptions:isReferrable:explicitlyRequestedReferrable:automaticallyDisplayController:registerDeepLinkHandler:")
    public native void init(NSDictionary<?, ?> options, boolean isReferrable, boolean explicitlyRequestedReferrable, boolean automaticallyDisplayController, @Block VoidBlock2<BNCInitSessionResponse, NSError> callback);
    @Method(selector = "handleDeepLink:")
    public native boolean handleDeepLink(NSURL url);
    @Method(selector = "handleDeepLink:sceneIdentifier:")
    public native boolean handleDeepLink(NSURL url, String sceneIdentifier);
    @Method(selector = "handleDeepLinkWithNewSession:")
    public native boolean handleDeepLinkWithNewSession(NSURL url);
    @Method(selector = "continueUserActivity:")
    public native boolean continueUserActivity(NSUserActivity userActivity);
    @Method(selector = "continueUserActivity:sceneIdentifier:")
    public native boolean continueUserActivity(NSUserActivity userActivity, String sceneIdentifier);
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "sceneIdentifier:openURL:sourceApplication:annotation:")
    public native boolean openURL(String sceneIdentifier, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "application:openURL:options:")
    public native boolean openURL(UIApplication application, NSURL url, NSDictionary<NSString, ?> options);
    @Method(selector = "dispatchToIsolationQueue:")
    public native void dispatchToIsolationQueue(@Block Runnable initBlock);
    @Method(selector = "notifyNativeToInit")
    public native void notifyNativeToInit();
    @Method(selector = "handlePushNotification:")
    public native void handlePushNotification(NSDictionary<?, ?> userInfo);
    /**
     * @deprecated This API is deprecated. Please use registerDeepLinkController: forKey: withOption:
     */
    @Deprecated
    @Method(selector = "registerDeepLinkController:forKey:")
    public native void registerDeepLinkController(UIViewController controller, String key);
    @Method(selector = "registerDeepLinkController:forKey:withPresentation:")
    public native void registerDeepLinkController(UIViewController controller, String key, BNCViewControllerPresentationOption option);
    /**
     * @deprecated This API is deprecated. Please use the static version.
     */
    @Deprecated
    @Method(selector = "enableLoggingAtLevel:withCallback:")
    public native void enableLogging(BranchLogLevel logLevel, @Block VoidBlock3<NSString, BranchLogLevel, NSError> callback);
    @Method(selector = "useEUEndpoints")
    public native void useEUEndpoints();
    @Method(selector = "validateSDKIntegration")
    public native void validateSDKIntegration();
    @Method(selector = "setDeepLinkDebugMode:")
    public native void setDeepLinkDebugMode(NSDictionary<?, ?> debugParams);
    @Method(selector = "addAllowedScheme:")
    public native void addAllowedScheme(String scheme);
    @Method(selector = "setAllowedSchemes:")
    public native void setAllowedSchemes(NSArray<?> schemes);
    @Method(selector = "setUrlPatternsToIgnore:")
    public native void setUrlPatternsToIgnore(NSArray<NSString> urlsToIgnore);
    @Method(selector = "checkPasteboardOnInstall")
    public native void checkPasteboardOnInstall();
    @Method(selector = "willShowPasteboardToast")
    public native boolean willShowPasteboardToast();
    @Method(selector = "setAppClipAppGroup:")
    public native void setAppClipAppGroup(String appGroup);
    @Method(selector = "handleATTAuthorizationStatus:")
    public native void handleATTAuthorizationStatus(@MachineSizedUInt long status);
    /**
     * @deprecated This is no longer supported for iOS 16.1+ - SKAN4.0
     */
    @Deprecated
    @Method(selector = "setSKAdNetworkCalloutMaxTimeSinceInstall:")
    public native void setSKAdNetworkCalloutMaxTimeSinceInstall(double maxTimeInterval);
    @Method(selector = "addFacebookPartnerParameterWithName:value:")
    public native void addFacebookPartnerParameter(String name, String value);
    @Method(selector = "addSnapPartnerParameterWithName:value:")
    public native void addSnapPartnerParameter(String name, String value);
    @Method(selector = "clearPartnerParameters")
    public native void clearPartnerParameters();
    @Method(selector = "setRetryInterval:")
    public native void setRetryInterval(double retryInterval);
    @Method(selector = "setMaxRetries:")
    public native void setMaxRetries(@MachineSizedSInt long maxRetries);
    @Method(selector = "setNetworkTimeout:")
    public native void setNetworkTimeout(double timeout);
    @Method(selector = "disableAdNetworkCallouts:")
    public native void disableAdNetworkCallouts(boolean disableCallouts);
    @Method(selector = "registerPluginName:version:")
    public native void registerPlugin(String name, String version);
    @Method(selector = "setRequestMetadataKey:value:")
    public native void setRequestMetadata(String key, String value);
    @Method(selector = "getFirstReferringBranchUniversalObject")
    public native BranchUniversalObject getFirstReferringBranchUniversalObject();
    @Method(selector = "getFirstReferringBranchLinkProperties")
    public native BranchLinkProperties getFirstReferringBranchLinkProperties();
    @Method(selector = "getFirstReferringParams")
    public native NSDictionary<?, ?> getFirstReferringParams();
    @Method(selector = "getLatestReferringBranchUniversalObject")
    public native BranchUniversalObject getLatestReferringBranchUniversalObject();
    @Method(selector = "getLatestReferringBranchLinkProperties")
    public native BranchLinkProperties getLatestReferringBranchLinkProperties();
    @Method(selector = "getLatestReferringParams")
    public native NSDictionary<?, ?> getLatestReferringParams();
    @Method(selector = "getLatestReferringParamsSynchronous")
    public native NSDictionary<?, ?> getLatestReferringParamsSynchronous();
    @Method(selector = "resetUserSession")
    public native void resetUserSession();
    @Method(selector = "isUserIdentified")
    public native boolean isUserIdentified();
    @Method(selector = "setIdentity:")
    public native void setIdentity(String userId);
    @Method(selector = "setIdentity:withCallback:")
    public native void setIdentity(String userId, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "logout")
    public native void logout();
    @Method(selector = "logoutWithCallback:")
    public native void logout(@Block VoidBlock2<Boolean, NSError> callback);
    @Method(selector = "lastAttributedTouchDataWithAttributionWindow:completion:")
    public native void getLastAttributedTouchData(@MachineSizedSInt long window, @Block VoidBlock2<BranchLastAttributedTouchData, NSError> completion);
    @Method(selector = "getShortURL")
    public native String getShortURL();
    @Method(selector = "getShortURLWithParams:")
    public native String getShortURL(NSDictionary<?, ?> params);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:")
    public native String getShortURL(NSDictionary<?, ?> params, String channel, String feature);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:")
    public native String getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andAlias:")
    public native String getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, String alias);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andType:")
    public native String getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, BranchLinkType type);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andMatchDuration:")
    public native String getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, @MachineSizedUInt long duration);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:")
    public native String getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andAlias:")
    public native String getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String alias);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andAlias:ignoreUAString:")
    public native String getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String alias, String ignoreUAString);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andCampaign:andAlias:ignoreUAString:forceLinkCreation:")
    public native String getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String campaign, String alias, String ignoreUAString, boolean forceLinkCreation);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andType:")
    public native String getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, BranchLinkType type);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andMatchDuration:")
    public native String getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, @MachineSizedUInt long duration);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andChannel:andFeature:andStage:andMatchDuration:")
    public native String getShortUrl(NSDictionary<?, ?> params, NSArray<?> tags, String alias, String channel, String feature, String stage, @MachineSizedUInt long duration);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andChannel:andFeature:andStage:andCampaign:andMatchDuration:")
    public native String getShortUrl(NSDictionary<?, ?> params, NSArray<?> tags, String alias, String channel, String feature, String stage, NSObject campaign, @MachineSizedUInt long duration);
    @Method(selector = "getLongURLWithParams:")
    public native String getLongURL(NSDictionary<?, ?> params);
    @Method(selector = "getLongURLWithParams:andFeature:")
    public native String getLongURL(NSDictionary<?, ?> params, String feature);
    @Method(selector = "getLongURLWithParams:andFeature:andStage:")
    public native String getLongURL(NSDictionary<?, ?> params, String feature, String stage);
    @Method(selector = "getLongURLWithParams:andFeature:andStage:andTags:")
    public native String getLongURL(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags);
    @Method(selector = "getLongURLWithParams:andFeature:andStage:andAlias:")
    public native String getLongURL(NSDictionary<?, ?> params, String feature, String stage, String alias);
    @Method(selector = "getLongURLWithParams:andChannel:andTags:andFeature:andStage:andAlias:")
    public native String getLongURL(NSDictionary<?, ?> params, String channel, NSArray<?> tags, String feature, String stage, String alias);
    @Method(selector = "getLongAppLinkURLWithParams:andChannel:andTags:andFeature:andStage:andAlias:")
    public native String getLongAppLinkURL(NSDictionary<?, ?> params, String channel, NSArray<?> tags, String feature, String stage, String alias);
    @Method(selector = "getShortURLWithCallback:")
    public native void getShortURL(@Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, String channel, String feature, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andAlias:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, String alias, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andType:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, BranchLinkType type, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andMatchDuration:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, String channel, String feature, String stage, @MachineSizedUInt long duration, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andAlias:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String alias, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andType:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, BranchLinkType type, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andMatchDuration:andCallback:")
    public native void getShortURL(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, @MachineSizedUInt long duration, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andMatchDuration:andChannel:andFeature:andStage:andCallback:")
    public native void getShortUrl(NSDictionary<?, ?> params, NSArray<?> tags, String alias, @MachineSizedUInt long duration, String channel, String feature, String stage, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andMatchDuration:andChannel:andFeature:andStage:andCampaign:andCallback:")
    public native void getShortUrl(NSDictionary<?, ?> params, NSArray<?> tags, String alias, @MachineSizedUInt long duration, String channel, String feature, String stage, String campaign, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getSpotlightUrlWithParams:callback:")
    public native void getSpotlightUrl(NSDictionary<?, ?> params, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:")
    public native void createDiscoverableContent(String title, String description);
    @Method(selector = "createDiscoverableContentWithTitle:description:callback:")
    public native void createDiscoverableContent(String title, String description, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:publiclyIndexable:callback:")
    public native void createDiscoverableContent(String title, String description, boolean publiclyIndexable, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:type:publiclyIndexable:callback:")
    public native void createDiscoverableContent(String title, String description, String type, boolean publiclyIndexable, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:type:publiclyIndexable:callback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, String type, boolean publiclyIndexable, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:type:publiclyIndexable:keywords:callback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, String type, boolean publiclyIndexable, NSSet<?> keywords, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:publiclyIndexable:keywords:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, boolean publiclyIndexable, NSSet<?> keywords);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:type:publiclyIndexable:keywords:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, String type, boolean publiclyIndexable, NSSet<?> keywords);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:publiclyIndexable:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, boolean publiclyIndexable);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:callback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:expirationDate:callback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, NSDate expirationDate, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:canonicalId:linkParams:type:publiclyIndexable:keywords:expirationDate:callback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, String canonicalId, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, NSDate expirationDate, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:expirationDate:spotlightCallback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, NSDate expirationDate, @Block VoidBlock3<NSString, NSString, NSError> spotlightCallback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:canonicalId:linkParams:type:publiclyIndexable:keywords:expirationDate:spotlightCallback:")
    public native void createDiscoverableContent(String title, String description, NSURL thumbnailUrl, String canonicalId, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, NSDate expirationDate, @Block VoidBlock3<NSString, NSString, NSError> spotlightCallback);
    @Method(selector = "indexOnSpotlightWithBranchUniversalObject:linkProperties:completion:")
    public native void indexOnSpotlight(BranchUniversalObject universalObject, BranchLinkProperties linkProperties, @Block VoidBlock3<BranchUniversalObject, NSString, NSError> completion);
    @Method(selector = "indexOnSpotlightUsingSearchableItems:completion:")
    public native void indexOnSpotlightUsingSearchableItems(NSArray<BranchUniversalObject> universalObjects, @Block VoidBlock2<NSArray<BranchUniversalObject>, NSError> completion);
    @Method(selector = "removeSearchableItemWithBranchUniversalObject:callback:")
    public native void removeSearchableItem(BranchUniversalObject universalObject, @Block VoidBlock1<NSError> completion);
    @Method(selector = "removeSearchableItemsWithBranchUniversalObjects:callback:")
    public native void removeSearchableItems(NSArray<BranchUniversalObject> universalObjects, @Block VoidBlock1<NSError> completion);
    @Method(selector = "removeAllPrivateContentFromSpotLightWithCallback:")
    public native void removeAllPrivateContentFromSpotLight(@Block VoidBlock1<NSError> completion);
    @Method(selector = "initWithInterface:queue:cache:preferenceHelper:key:")
    protected native @Pointer long init(BNCServerInterface inf, BNCServerRequestQueue queue, BNCLinkCache cache, BNCPreferenceHelper preferenceHelper, String key);
    /**
     * @deprecated This API is deprecated. Please use BranchEvent:BranchStandardEventViewItem instead.
     */
    @Deprecated
    @Method(selector = "registerViewWithParams:andCallback:")
    public native void registerView(NSDictionary<?, ?> params, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "sendServerRequest:")
    public native void sendServerRequest(BNCServerRequest request);
    /**
     * @deprecated This API is deprecated. Please use sendServerRequest instead.
     */
    @Deprecated
    @Method(selector = "sendServerRequestWithoutSession:")
    public native void sendServerRequestWithoutSession(BNCServerRequest request);
    @Method(selector = "clearNetworkQueue")
    public native void clearNetworkQueue();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "passPasteItemProviders:")
    public native void passPasteItemProviders(NSArray<NSItemProvider> itemProviders);
    /**
     * @deprecated Use `Branch.useTestBranchKey = YES;` instead.
     */
    @Deprecated
    @Method(selector = "getTestInstance")
    public static native Branch getTestInstance();
    @Method(selector = "getInstance")
    public static native Branch getInstance();
    @Method(selector = "getInstance:")
    public static native Branch getInstance(String branchKey);
    @Method(selector = "setNetworkServiceClass:")
    public static native void setNetworkServiceClass(Class<?> networkServiceClass);
    @Method(selector = "networkServiceClass")
    public static native Class<?> networkServiceClass();
    @Method(selector = "setUseTestBranchKey:")
    public static native void setUseTestBranchKey(boolean useTestKey);
    @Method(selector = "useTestBranchKey")
    public static native boolean useTestBranchKey();
    public static void setBranch(String branchKey) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       setBranch(branchKey, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "setBranchKey:error:")
    private static native void setBranch(String branchKey, NSError.NSErrorPtr error);
    @Method(selector = "setBranchKey:")
    public static native void setBranchKey(String branchKey);
    @Method(selector = "branchKey")
    public static native String branchKey();
    @Method(selector = "branchKeyIsSet")
    public static native boolean branchKeyIsSet();
    @Method(selector = "getBranchActivityItemWithParams:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params);
    @Method(selector = "getBranchActivityItemWithParams:feature:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params, String feature);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params, String feature, String stage);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:tags:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:tags:alias:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags, String alias);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:campaign:tags:alias:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params, String feature, String stage, String campaign, NSArray<?> tags, String alias);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:tags:alias:delegate:")
    public static native BranchActivityItemProvider getBranchActivityItem(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags, String alias, BranchActivityItemProviderDelegate delegate);
    @Method(selector = "enableLogging")
    public static native void enableLogging();
    @Method(selector = "enableLoggingAtLevel:withCallback:")
    public static native void enableLoggingAtLevel(BranchLogLevel logLevel, @Block VoidBlock3<NSString, BranchLogLevel, NSError> callback);
    @Method(selector = "setAPIUrl:")
    public static native void setAPIUrl(String url);
    @Method(selector = "isBranchLink:")
    public static native boolean isBranchLink(String urlString);
    @Method(selector = "setTrackingDisabled:")
    public static native void setTrackingDisabled(boolean disabled);
    @Method(selector = "trackingDisabled")
    public static native boolean trackingDisabled();
    @Method(selector = "setReferrerGbraidValidityWindow:")
    public static native void setReferrerGbraidValidityWindow(double validityWindow);
    @Method(selector = "setDMAParamsForEEA:AdPersonalizationConsent:AdUserDataUsageConsent:")
    public static native void setDMAParamsForEEA(boolean eeaRegion, boolean adPersonalizationConsent, boolean adUserDataUsageConsent);
    /*</methods>*/
}
