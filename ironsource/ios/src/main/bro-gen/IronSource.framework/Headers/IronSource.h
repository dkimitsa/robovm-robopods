//
//  Copyright © 2017 IronSource. All rights reserved.
//

#ifndef IRONSOURCE_H
#define IRONSOURCE_H

// import core classes
#import <AVFoundation/AVFoundation.h>
#import <AdSupport/AdSupport.h>
#import <AudioToolbox/AudioToolbox.h>
#import <CFNetwork/CFNetwork.h>
#import <CoreGraphics/CoreGraphics.h>
#import <CoreMedia/CoreMedia.h>
#import <CoreTelephony/CTCarrier.h>
#import <CoreVideo/CoreVideo.h>
#import <Foundation/Foundation.h>
#import <MediaPlayer/MediaPlayer.h>
#import <MessageUI/MessageUI.h>
#import <MobileCoreServices/MobileCoreServices.h>
#import <QuartzCore/QuartzCore.h>
#import <Security/Security.h>
#import <StoreKit/StoreKit.h>
#import <SystemConfiguration/SystemConfiguration.h>
#import <UIKit/UIKit.h>
#import <WebKit/WebKit.h>
#import <libxml2/libxml/parser.h>
#import <libxml2/libxml/tree.h>
#import <zlib.h>

#import "ISABannerAdLoader.h"
#import "ISABannerAdRequestBuilder.h"
#import "ISAInitRequestBuilder.h"
#import "ISAInterstitialAdLoader.h"
#import "ISAInterstitialAdRequestBuilder.h"
#import "ISARewardedAdLoader.h"
#import "ISARewardedAdRequestBuilder.h"
#import "ISBannerSize.h"
#import "ISConfigurations.h"
#import "ISConsentViewDelegate.h"
#import "ISDemandOnlyBannerDelegate.h"
#import "ISDemandOnlyInterstitialDelegate.h"
#import "ISDemandOnlyRewardedVideoDelegate.h"
#import "ISEventsReporting.h"
#import "ISGender.h"
#import "ISImpressionData.h"
#import "ISImpressionDataDelegate.h"
#import "ISInitializationDelegate.h"
#import "ISIntegrationHelper.h"
#import "ISLogDelegate.h"
#import "ISPlacementInfo.h"
#import "ISSegment.h"
#import "ISSegmentDelegate.h"
#import "ISSupersonicAdsConfiguration.h"
#import "ISWaterfallConfiguration.h"
#import "IronSourceAds.h"
#import "LPMConfigServiceEventSender.h"

// imports used for custom adapters infra
#import "ISAdapterErrors.h"
#import "ISBaseBanner.h"
#import "ISBaseInterstitial.h"
#import "ISBaseNetworkAdapter.h"
#import "ISBaseRewardedVideo.h"
#import "ISDataKeys.h"
#import "ISSetAPSDataProtocol.h"

// imports used for the new delegates with ad info
#import "ISAdInfo.h"
#import "LevelPlayBannerDelegate.h"
#import "LevelPlayInterstitialDelegate.h"
#import "LevelPlayRewardedVideoBaseDelegate.h"
#import "LevelPlayRewardedVideoDelegate.h"
#import "LevelPlayRewardedVideoManualDelegate.h"

// Native Ads
#import "ISNativeAdProtocol.h"
#import "ISNativeAdView.h"
#import "LevelPlayMediaView.h"
#import "LevelPlayNativeAd.h"
#import "LevelPlayNativeAdDelegate.h"

// LevelPlay imports
#import "LPMAdInfo.h"
#import "LPMAdSize.h"
#import "LPMBannerAdView.h"
#import "LPMInitRequestBuilder.h"
#import "LPMInterstitialAd.h"
#import "LPMInterstitialAdDelegate.h"
#import "LevelPlay.h"

#import "IronSourceNetworkSwiftBridge.h"

NS_ASSUME_NONNULL_BEGIN

#define IS_REWARDED_VIDEO @"rewardedvideo"
#define IS_INTERSTITIAL @"interstitial"
#define IS_BANNER @"banner"
#define IS_NATIVE_AD @"nativead"

static NSString *const MEDIATION_SDK_VERSION = @"8.4.0";
static NSString *GitHash = @"917cac0";

/*
    This constant is for sending an external impression data from mopub
*/
static NSString *const DataSource_MOPUB = @"MoPub";

@interface IronSource : NSObject

/**
 @abstact Retrieve a string-based representation of the SDK version.
 @discussion The returned value will be in the form of "<Major>.<Minor>.<Revision>".

 @return NSString representing the current IronSource SDK version.
 */
+ (NSString *)sdkVersion;

/**
 @abstract Sets if IronSource SDK should track network changes.
 @discussion Enables the SDK to change the availability according to network modifications, i.e. in
 the case of no network connection, the availability will turn to FALSE.

 Default is NO.

 @param flag YES if allowed to track network changes, NO otherwise.
 */
+ (void)shouldTrackReachability:(BOOL)flag;

/**
 @abstract Sets if IronSource SDK should allow ad networks debug logs.
 @discussion This value will be passed to the supporting ad networks.

 Default is NO.

 @param flag YES to allow ad networks debug logs, NO otherwise.
 */
+ (void)setAdaptersDebug:(BOOL)flag;

/**
 @abstract Sets a dynamic identifier for the current user.
 @discussion This parameter can be changed throughout the session and will be received in the
 server-to-server ad rewarded callbacks.

 It helps verify AdRewarded transactions and must be set before calling showRewardedVideo.

 @param dynamicUserId Dynamic user identifier. Should be between 1-128 chars in length.
 @return BOOL that indicates if the dynamic identifier is valid.
 */
+ (BOOL)setDynamicUserId:(NSString *)dynamicUserId;

/**
 @abstract Retrieves the device's current advertising identifier.
 @discussion Will first try to retrieve IDFA, if impossible, will try to retrieve IDFV.

 @return The device's current advertising identifier.
 */
+ (NSString *)advertiserId;

/**
 @abstract Sets a mediation type.
 @discussion This method is used only for IronSource's SDK, and will be passed as a custom param.

 @param mediationType a mediation type name. Should be alphanumeric and between 1-64 chars in
 length.
 */
+ (void)setMediationType:(NSString *)mediationType;

/**
 @abstract Sets a segment.
 @discussion This method is used to start a session with a spesific segment.

 @param segment A segment object.
 */
+ (void)setSegment:(ISSegment *)segment;

/**
 @abstract Sets the delegate for segment callback.

 @param delegate The 'ISSegmentDelegate' for IronSource to send callbacks to.
 */
+ (void)setSegmentDelegate:(id<ISSegmentDelegate>)delegate;

/**
@abstact Sets the meta data with a key and value.
@discussion This value will be passed to the supporting ad networks.

@param key The meta data key.
@param value The meta data value

*/
+ (void)setMetaDataWithKey:(NSString *)key value:(NSString *)value;

/**
 @abstact Sets the meta data with a key and values.
 @discussion This value will be passed to the supporting ad networks.

 @param key The meta data key.
 @param values The meta data values

 */
+ (void)setMetaDataWithKey:(NSString *)key values:(NSMutableArray *)values;

/**
@abstract Sets the network data according to the network key.

@param networkKey  Network identifier.
@param networkData a dictionary containing the information required by the network.

 */
+ (void)setNetworkDataWithNetworkKey:(NSString *)networkKey
                      andNetworkData:(NSDictionary *)networkData;

/**
@abstact used for demand only API, return the bidding data token.
*/
+ (NSString *)getISDemandOnlyBiddingData;

#pragma mark - SDK Initialization

/**
 @abstract Sets an identifier for the current user.

 @param userId User identifier. Should be between 1-64 chars in length.
 */
+ (void)setUserId:(NSString *)userId;

/**
 @abstract Initializes IronSource's SDK with all the ad units that are defined in the platform.

 @param appKey Application key.
 */
+ (void)initWithAppKey:(NSString *)appKey;

/**
 @abstract Initializes IronSource's SDK with all the ad units that are defined in the platform.

 @param appKey Application key.
 @param delegate Init delegate.
 */
+ (void)initWithAppKey:(NSString *)appKey delegate:(nullable id<ISInitializationDelegate>)delegate;

/**
 @abstract Initializes IronSource's SDK with the requested ad units.
 @discussion This method checks if the requested ad units are defined in the platform, and
 initializes them.

 The adUnits array should contain string values that represent the ad units.

 It is recommended to use predefined constansts:

 IS_REWARDED_VIDEO, IS_INTERSTITIAL, IS_BANNER, IS_NATIVE_AD

 e.g: [IronSource initWithAppKey:appKey adUnits:@[IS_REWARDED_VIDEO, IS_INTERSTITIAL, IS_BANNER,
 IS_NATIVE_AD]];

 @param appKey Application key.
 @param adUnits An array of ad units to initialize.
 */
+ (void)initWithAppKey:(NSString *)appKey adUnits:(NSArray<NSString *> *)adUnits;

/**
 @abstract Initializes IronSource's SDK with the requested ad units.
 @discussion This method checks if the requested ad units are defined in the platform, and
 initializes them.

 The adUnits array should contain string values that represent the ad units.

 It is recommended to use predefined constansts:

 IS_REWARDED_VIDEO, IS_INTERSTITIAL, IS_BANNER, IS_NATIVE_AD

 e.g: [IronSource initWithAppKey:appKey adUnits:@[IS_REWARDED_VIDEO, IS_INTERSTITIAL, IS_BANNER,
 IS_NATIVE_AD]];

 @param appKey Application key.
 @param adUnits An array of ad units to initialize.
 @param delegate Init delegate.
 */
+ (void)initWithAppKey:(NSString *)appKey
               adUnits:(NSArray<NSString *> *)adUnits
              delegate:(nullable id<ISInitializationDelegate>)delegate;

/**
 @abstract Initializes ironSource SDK in demand only mode.
 @discussion This method initializes IS_REWARDED_VIDEO and/or IS_INTERSTITIAL ad units.
 @param appKey Application key.
 @param adUnits An array containing IS_REWARDED_VIDEO and/or IS_INTERSTITIAL.
 */
+ (void)initISDemandOnly:(NSString *)appKey
                 adUnits:(NSArray<NSString *> *)adUnits
    DEPRECATED_MSG_ATTRIBUTE("Use [IronSourceAds initWithRequest:completion:] instead.");

#pragma mark - Rewarded Video

/**
 @abstract Sets the delegate for LevelPlay rewarded video callbacks.

 @param delegate The 'LevelPlayRewardedVideoDelegate' for IronSource to send callbacks to.
 */
+ (void)setLevelPlayRewardedVideoDelegate:(nullable id<LevelPlayRewardedVideoDelegate>)delegate;

/**
 @abstract Shows a rewarded video using the default placement.

 @param viewController The UIViewController to display the rewarded video within.
 */
+ (void)showRewardedVideoWithViewController:(UIViewController *)viewController;

/**
 @abstract Shows a rewarded video using the provided placement name.

 @param viewController The UIViewController to display the rewarded video within.
 @param placementName The placement name as was defined in the platform. If nil is passed, a default
 placement will be used.
 */
+ (void)showRewardedVideoWithViewController:(UIViewController *)viewController
                                  placement:(nullable NSString *)placementName;

/**
 @abstract Determine if a locally cached rewarded video exists on the mediation level.
 @discussion A return value of YES here indicates that there is a cached rewarded video for one of
 the ad networks.

 @return YES if rewarded video is ready to be played, NO otherwise.
 */
+ (BOOL)hasRewardedVideo;

/**
 @abstract Verify if a certain placement has reached its ad limit.
 @discussion This is to ensure you don’t portray the Rewarded Video button when the placement has
 been capped or paced and thus will not serve the video ad.

 @param placementName The placement name as was defined in the platform.
 @return YES if capped or paced, NO otherwise.
 */
+ (BOOL)isRewardedVideoCappedForPlacement:(NSString *)placementName;

/**
 @abstract Retrieve an object containing the placement's reward name and amount.

 @param placementName The placement name as was defined in the platform.
 @return ISPlacementInfo representing the placement's information.
 */
+ (ISPlacementInfo *)rewardedVideoPlacementInfo:(NSString *)placementName;

/**
 @abstract Enables sending server side parameters on successful rewarded video

 @param parameters A dictionary containing the parameters.
 */
+ (void)setRewardedVideoServerParameters:(NSDictionary *)parameters;

/**
 @abstract Disables sending server side parameters on successful rewarded video
  */
+ (void)clearRewardedVideoServerParameters;

#pragma mark - Demand Only Rewarded Video
/**
 @abstract Sets the delegate for demand only rewarded video callbacks.
 @param delegate The 'ISDemandOnlyRewardedVideoDelegate' for IronSource to send callbacks to.
 */
+ (void)setISDemandOnlyRewardedVideoDelegate:(id<ISDemandOnlyRewardedVideoDelegate>)delegate;

/**
 @abstract Loads a demand only rewarded video for a non bidder instance.
 @discussion This method will load a demand only rewarded video ad for a non bidder instance.
 @param instanceId The demand only instance id to be used to display the rewarded video.
 */
+ (void)loadISDemandOnlyRewardedVideo:(NSString *)instanceId;

/**
 @abstract Loads a demand only rewarded video for a bidder instance.
 @discussion This method will load a demand only rewarded video ad for a bidder instance.
 @param instanceId The demand only instance id to be used to display the rewarded video.
 */
+ (void)loadISDemandOnlyRewardedVideoWithAdm:(NSString *)instanceId
                                         adm:(NSString *)adm
    DEPRECATED_MSG_ATTRIBUTE("Use [ISARewardedAdLoader loadAdWithAdRequest:delegate:] instead.");

/**
 @abstract Shows a demand only rewarded video using the default placement.
 @param viewController The UIViewController to display the rewarded video within.
 @param instanceId The demand only instance id to be used to display the rewarded video.
 */
+ (void)showISDemandOnlyRewardedVideo:(UIViewController *)viewController
                           instanceId:(NSString *)instanceId;

/**
 @abstract Determine if a locally cached demand only rewarded video exists for an instance id.
 @discussion A return value of YES here indicates that there is a cached rewarded video for the
 instance id.
 @param instanceId The demand only instance id to be used to display the rewarded video.
 @return YES if rewarded video is ready to be played, NO otherwise.
 */
+ (BOOL)hasISDemandOnlyRewardedVideo:(NSString *)instanceId;

/**
 @abstract Sets Rewarded Video flow for LevelPlay manual load.
 @discussion The ironSource SDK fires several events to inform you of ad availability.
 @discussion By implementing the LevelPlayRewardedVideoManualDelegate you will receive the LevelPlay
 Rewarded Video events.
 @discussion Pass this object within the LevelPlayRewardedVideoManualDelegate(…) method.
 @discussion The SDK will notify your delegate of all possible events.
 @param delegate The 'LevelPlayRewardedVideoManualDelegate' for IronSource to send callbacks to.
 */
+ (void)setLevelPlayRewardedVideoManualDelegate:
    (nullable id<LevelPlayRewardedVideoManualDelegate>)delegate;

/**
 @abstract Loads a Rewarded Video.
 @discussion This method will load Rewarded Video ads from the underlying ad networks according to
 their priority when in manual Rewarded Video mode.
 */
+ (void)loadRewardedVideo;

#pragma mark - Interstitial

/**
 @abstract Sets the delegate for LevelPlay interstitial callbacks.

 @param delegate The 'LevelPlayInterstitialDelegate' for IronSource to send callbacks to.
 */
+ (void)setLevelPlayInterstitialDelegate:(nullable id<LevelPlayInterstitialDelegate>)delegate;

/**
 @abstract Loads an interstitial.
 @discussion This method will load interstitial ads from the underlying ad networks according to
 their priority.
 */
+ (void)loadInterstitial;

/**
 @abstract Show a rewarded video using the default placement.

 @param viewController The UIViewController to display the interstitial within.
 */
+ (void)showInterstitialWithViewController:(UIViewController *)viewController;

/**
 @abstract Show a rewarded video using the provided placement name.

 @param viewController The UIViewController to display the interstitial within.
 @param placementName The placement name as was defined in the platform. If nil is passed, a default
 placement will be used.
 */
+ (void)showInterstitialWithViewController:(UIViewController *)viewController
                                 placement:(nullable NSString *)placementName;

/**
 @abstract Determine if a locally cached interstitial exists on the mediation level.
 @discussion A return value of YES here indicates that there is a cached interstitial for one of the
 ad networks.

 @return YES if there is a locally cached interstitial, NO otherwise.
 */
+ (BOOL)hasInterstitial;

/**
 @abstract Verify if a certain placement has reached its ad limit.
 @discussion This is to ensure you don’t try to show interstitial when the placement has been capped
 or paced and thus will not serve the interstitial ad.

 @param placementName The placement name as was defined in the platform.
 @return YES if capped or paced, NO otherwise.
 */
+ (BOOL)isInterstitialCappedForPlacement:(NSString *)placementName;

#pragma mark - Demand Only Interstitial

/**
 @abstract Sets the delegate for demand only interstitial callbacks.
 @param delegate The 'ISDemandOnlyInterstitialDelegate' for IronSource to send callbacks to.
 */
+ (void)setISDemandOnlyInterstitialDelegate:(id<ISDemandOnlyInterstitialDelegate>)delegate;

/**
 @abstract Loads a demand only interstitial.
 @discussion This method will load a demand only interstitial ad.
 @param instanceId The demand only instance id to be used to display the interstitial.
 */
+ (void)loadISDemandOnlyInterstitial:(NSString *)instanceId;

/**
 @abstract Loads a demand only interstitial bidder instance.
 @discussion This method will load a demand only interstitial ad bidder instance.
 @param instanceId The demand only instance id to be used to display the interstitial.
 */
+ (void)loadISDemandOnlyInterstitialWithAdm:(NSString *)instanceId
                                        adm:(NSString *)adm
    DEPRECATED_MSG_ATTRIBUTE(
        "Use [ISAInterstitialAdLoader loadAdWithAdRequest:delegate:] instead.");

/**
 @abstract Show a demand only interstitial using the default placement.
 @param viewController The UIViewController to display the interstitial within.
 @param instanceId The demand only instance id to be used to display the interstitial.
 */
+ (void)showISDemandOnlyInterstitial:(UIViewController *)viewController
                          instanceId:(NSString *)instanceId;

/**
 @abstract Determine if a locally cached interstitial exists for a demand only instance id.
 @discussion A return value of YES here indicates that there is a cached interstitial for the
 instance id.
 @param instanceId The demand only instance id to be used to display the interstitial.
 @return YES if there is a locally cached interstitial, NO otherwise.
 */
+ (BOOL)hasISDemandOnlyInterstitial:(NSString *)instanceId;

#pragma mark - Banner

/**
 @abstract Sets the delegate for LevelPlay banner callbacks.

 @param delegate The 'LevelPlayBannerDelegate' for IronSource to send callbacks to.
 */
+ (void)setLevelPlayBannerDelegate:(nullable id<LevelPlayBannerDelegate>)delegate
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdView setDelegate:] instead.");

/**
 @abstract Loads a banner using the default placement.
 @discussion This method will load banner ads of the requested size from the underlying ad networks
 according to their priority.

 The size should contain ISBannerSize value that represent the required banner ad size.
 e.g. [IronSource loadBannerWithViewController:self size:ISBannerSize_BANNER];

 Custom banner size:
 ISBannerSize* bannerSize = [[ISBannerSize alloc] initWithWidth:320 andHeight:50];
 [IronSource loadBannerWithViewController:self size:bannerSize];

 @param viewController The UIViewController to display the banner within.
 @param size The required banner ad size
 */
+ (void)loadBannerWithViewController:(UIViewController *)viewController
                                size:(ISBannerSize *)size
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdView loadAdWithViewController:] instead.");

/**
 @abstract Loads a banner using the provided placement name.
 @discussion This method will load banner ads of the requested size from the underlying ad networks
 according to their priority.

 The size should contain ISBannerSize value that represent the required banner ad size.
 e.g. [IronSource loadBannerWithViewController:self size:ISBannerSize_BANNER
 placement:@"your_placement_name"];

 Custom banner size:
 ISBannerSize* bannerSize = [[ISBannerSize alloc] initWithWidth:320 andHeight:50];
 [IronSource loadBannerWithViewController:self size:bannerSize placement:@"your_placement_name"];

 @param viewController The UIViewController to display the banner within.
 @param size The required banner ad size
 @param placementName The placement name as was defined in the platform. If nil is passed, the
 default placement will be used.
 */
+ (void)loadBannerWithViewController:(UIViewController *)viewController
                                size:(ISBannerSize *)size
                           placement:(nullable NSString *)placementName
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdView setPlacementName:] with "
                             "[LPMBannerAdView loadAdWithViewController:] instead.");

/**
 @abstract Removes the banner from memory.
 @param banner The ISBannerView to remove.
 */
+ (void)destroyBanner:(ISBannerView *)banner
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdView destroy] instead.");
;

/**
 @abstract Verify if a certain placement has reached its ad limit.
 @discussion This is to ensure you don’t try to load a banner when the placement has been capped or
 paced and thus will not serve the banner ad.

 @param placementName The placement name as was defined in the platform.
 @return YES if capped or paced, NO otherwise.
 */
+ (BOOL)isBannerCappedForPlacement:(NSString *)placementName
    DEPRECATED_MSG_ATTRIBUTE("Capping is no longer supported for banners.");

#pragma mark Demand Only Banner
/**
 @abstract Sets the delegate for demand only Banner callbacks.
 @param delegate The 'ISDemandOnlyBannerDelegate' for IronSource to send callbacks to.
 @param instanceId The instance id on which the delegate will notify.
 */
+ (void)setISDemandOnlyBannerDelegate:(id<ISDemandOnlyBannerDelegate>)delegate
                        forInstanceId:(NSString *)instanceId;

/**
 @abstract Loads a demand only Banner for a bidder instance.
 @discussion This method will load a demand only Banner ad for a bidder instance.
 @param adm The ad markup
 @param instanceId The demand only instance id to be used to display the Banner.
 @param viewController The view controller on which the banner should be presented
 @param size The required banner ad size
 */
+ (void)loadISDemandOnlyBannerWithAdm:(NSString *)adm
                           instanceId:(NSString *)instanceId
                       viewController:(UIViewController *)viewController
                                 size:(ISBannerSize *)size;

/**
 @abstract Loads a demand only Banner for a non bidder instance.
 @discussion This method will load a demand only Banner ad for a non bidder instance.
 @param instanceId The demand only instance id to be used to display the Banner.
 @param viewController The view controller on which the banner should be presented
 @param size The required banner ad size
 */
+ (void)loadISDemandOnlyBannerWithInstanceId:(NSString *)instanceId
                              viewController:(UIViewController *)viewController
                                        size:(ISBannerSize *)size;

/**
 @abstract Removes the banner from memory.
 @param instanceId The demand only instance id of the Banner that should be destroyed.
 */
+ (void)destroyISDemandOnlyBannerWithInstanceId:(NSString *)instanceId;

#pragma mark - Logging

/**
 @abstract Sets the delegate for log callbacks.

 @param delegate The 'ISLogDelegate' for IronSource to send callbacks to.
 */
+ (void)setLogDelegate:(id<ISLogDelegate>)delegate;

+ (void)setConsent:(BOOL)consent;

#pragma mark - Impression Data

/**
 @abstract Adds the delegate for impression data callbacks.

 @param delegate The 'ISImpressionDataDelegate' for IronSource to send callbacks to.
 */

+ (void)addImpressionDataDelegate:(id<ISImpressionDataDelegate>)delegate;

/**
 @abstract Ad revenue data

 @param dataSource the external source id from which the impression data is sent.
 @param impressionData the impression data

 */
+ (void)setAdRevenueDataWithDataSource:(NSString *)dataSource
                        impressionData:(NSData *)impressionData;

/**
 @abstract Removes  the delegate from impression data callbacks.

 @param delegate The 'ISImpressionDataDelegate' for IronSource to send callbacks to.
 */

+ (void)removeImpressionDataDelegate:(id<ISImpressionDataDelegate>)delegate;

#pragma mark - Consent View

/**
 @abstract Sets the delegate for consent view callbacks.

 @param delegate The 'ISConsentViewDelegate' for IronSource to send callbacks to.
 */
+ (void)setConsentViewWithDelegate:(id<ISConsentViewDelegate>)delegate;

/**
 @abstract Load consent view.

 @param consentViewType The type of the view (pre/post).
 */
+ (void)loadConsentViewWithType:(NSString *)consentViewType;

/**
 @abstract Show consent view after load.

 @param consentViewType The type of the view (pre/post).
 */
+ (void)showConsentViewWithViewController:(UIViewController *)viewController
                                  andType:(NSString *)consentViewType;

#pragma mark - Conversion Value (CV)

/**
 @abstract get current conversion value
*/
+ (NSNumber *)getConversionValue;

#pragma mark - Test Suite

/**
 @abstract Launch the Test suite
 @param viewController The UIViewController to display the Test Suite within.
*/
+ (void)launchTestSuite:(UIViewController *)viewController;

#pragma mark - Waterfall Configuration

/**
 * Objc Example
 * <pre>
 *   ISWaterfallConfigurationBuilder *builder = [ISWaterfallConfiguration builder];
 *   [builder setCeiling:@10.05];
 *   [builder setFloor:@1.10];
 *   ISWaterfallConfiguration *configuration = [builder build];
 *   [IronSource setWaterfallConfiguration:configuration forAdUnit:[ISAdUnit
 * IS_AD_UNIT_REWARDED_VIDEO]];
 * </pre>
 *
 * Swift Example
 * <pre>
 *   let configuration = ISWaterfallConfiguration
 *     .builder()
 *     .setCeiling(10.05)
 *     .setFloor(1.01)
 *     .build()
 *   IronSource.setWaterfallConfiguration(configuration, for: ISAdUnit.is_AD_UNIT_REWARDED_VIDEO())
 * </pre>
 *
 * @abstract Allow the publisher to set custom configuration per ad unit.
 * @param waterfallConfiguration ISWaterfallConfiguration object with custom fields configured by
 * the publisher.
 * @param adUnit ISAdUnit that the ISWaterfallConfiguration should apply to.
 */
+ (void)setWaterfallConfiguration:(ISWaterfallConfiguration *)waterfallConfiguration
                        forAdUnit:(ISAdUnit *)adUnit;

@end

NS_ASSUME_NONNULL_END

#endif
