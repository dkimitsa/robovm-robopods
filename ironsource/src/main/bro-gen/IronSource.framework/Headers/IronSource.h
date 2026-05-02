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
#import "ISAdInfo.h"
#import "ISAdapterAdaptiveProtocol.h"
#import "ISBannerSize.h"
#import "ISConfigurations.h"
#import "ISDemandOnlyBannerDelegate.h"
#import "ISDemandOnlyInterstitialDelegate.h"
#import "ISDemandOnlyRewardedVideoDelegate.h"
#import "ISSupersonicAdsConfiguration.h"
#import "IronSourceAds.h"
#import "LPMDispatcherProtocol.h"
#import "LPMImpressionData.h"
#import "LPMImpressionDataDelegate.h"
#import "LPMSegment.h"

// imports used for custom adapters infra
#import "ISAdapterErrors.h"
#import "ISBaseBanner.h"
#import "ISBaseInterstitial.h"
#import "ISBaseNativeAd.h"
#import "ISBaseNetworkAdapter.h"
#import "ISBaseRewardedVideo.h"
#import "ISDataKeys.h"
#import "ISSetAPSDataProtocol.h"

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
#import "LPMBannerAdViewConfig.h"
#import "LPMBannerAdViewConfigBuilder.h"
#import "LPMInitRequestBuilder.h"
#import "LPMInterstitialAd.h"
#import "LPMInterstitialAdConfig.h"
#import "LPMInterstitialAdConfigBuilder.h"
#import "LPMInterstitialAdDelegate.h"
#import "LPMPrivacySettings.h"
#import "LPMRewardedAd.h"
#import "LPMRewardedAdConfig.h"
#import "LPMRewardedAdConfigBuilder.h"
#import "LPMRewardedAdDelegate.h"
#import "LevelPlay.h"

#import "IronSourceNetworkSwiftBridge.h"

NS_ASSUME_NONNULL_BEGIN

#define IS_REWARDED_VIDEO @"rewardedvideo"
#define IS_INTERSTITIAL @"interstitial"
#define IS_BANNER @"banner"
#define IS_NATIVE_AD @"nativead"

static NSString *const MEDIATION_SDK_VERSION = @"9.4.1";
static NSString *GitHash = @"cb3504d";

@interface IronSource : NSObject

/**
 @abstact Retrieve a string-based representation of the SDK version.
 @discussion The returned value will be in the form of "<Major>.<Minor>.<Revision>".

 @return NSString representing the current IronSource SDK version.
 */
+ (NSString *)sdkVersion DEPRECATED_MSG_ATTRIBUTE("For LevelPlay, use [LevelPlay sdkVersion]. For "
                                                  "IronSourceAds, use [IronSourceAds sdkVersion].");

/**
 @abstract Sets a mediation type.
 @discussion This method is used only for IronSource's SDK, and will be passed as a custom param.

 @param mediationType a mediation type name. Should be alphanumeric and between 1-64 chars in
 length.
 */
+ (void)setMediationType:(NSString *)mediationType;

/**
@abstact used for demand only API, return the bidding data token.
*/
+ (NSString *)getISDemandOnlyBiddingData;

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

#pragma mark Demand Only Banner
/**
 @abstract Sets the delegate for demand only Banner callbacks.
 @param delegate The 'ISDemandOnlyBannerDelegate' for IronSource to send callbacks to.
 @param instanceId The instance id on which the delegate will notify.
 */
+ (void)setISDemandOnlyBannerDelegate:(id<ISDemandOnlyBannerDelegate>)delegate
                        forInstanceId:(NSString *)instanceId;

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

#pragma mark - Impression Data

/**
 @abstract Ad revenue data

 @param dataSource the external source id from which the impression data is sent.
 @param impressionData the impression data

 */
+ (void)setAdRevenueDataWithDataSource:(NSString *)dataSource
                        impressionData:(NSData *)impressionData;

@end

NS_ASSUME_NONNULL_END

#endif
