//
//  GADRewardedInterstitialAdPreloader_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright © 2025 Google Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <GoogleMobileAds/GADMobileAds.h>
#import <GoogleMobileAds/GADPreloadDelegate_Beta.h>
#import <GoogleMobileAds/GADRewardedInterstitialAd.h>

@class GADRewardedInterstitialAd;
@class GADPreloadConfigurationV2;

NS_SWIFT_NAME(RewardedInterstitialAdPreloader)
@interface GADRewardedInterstitialAdPreloader : NSObject

/// Returns the shared GADRewardedInterstitialAdPreloader instance.
@property(class, nonatomic, readonly, nonnull)
    GADRewardedInterstitialAdPreloader *sharedInstance NS_SWIFT_NAME(shared);

/// Starts preloading rewarded interstitial ads from the configuration for the given preload ID.
/// If a delegate is provided, ad events will be forwarded to the delegate.
/// Returns false if preload failed to start. Check console for error log.
///
/// @param preloadID A string that refers to a set of preloaded ads.
/// @param configuration A GADPreloadConfigurationV2 instance.
/// @param delegate An optional delegate to receive ad event callbacks.
- (BOOL)preloadForPreloadID:(nonnull NSString *)preloadID
              configuration:(nonnull GADPreloadConfigurationV2 *)configuration
                   delegate:(nullable id<GADPreloadDelegate>)delegate
    NS_SWIFT_NAME(preload(for:configuration:delegate:));

/// Returns whether a rewarded interstitial ad is preloaded for the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (BOOL)isAdAvailableWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(isAdAvailable(with:));

/// Returns a preloaded rewarded interstitial ad for the given preload ID. Returns nil if an ad is
/// not available.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (nullable GADRewardedInterstitialAd *)adWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(ad(with:));

/// Returns the number of preloaded rewarded interstitial ads available for the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (NSUInteger)numberOfAdsAvailableWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(numberOfAdsAvailable(with:));

/// Stops preloading rewarded interstitial ads and removes preloaded rewarded interstitial ads for
/// the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (void)stopPreloadingAndRemoveAdsForPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(stopPreloadingAndRemoveAds(for:));

/// Stops preloading all rewarded interstitial ads and removes all preloaded rewarded interstitial
/// ads.
- (void)stopPreloadingAndRemoveAllAds;

/// Returns the corresponding configuration for the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (nullable GADPreloadConfigurationV2 *)configurationWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(configuration(with:));

/// Returns a map of preload IDs to their corresponding configurations.
- (nonnull NSDictionary<NSString *, GADPreloadConfigurationV2 *> *)configurations;

@end
