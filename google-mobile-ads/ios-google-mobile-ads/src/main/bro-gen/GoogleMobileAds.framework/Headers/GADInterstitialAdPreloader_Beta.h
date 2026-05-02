//
//  GADInterstitialAdPreloader_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright © 2025 Google Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <GoogleMobileAds/GADInterstitialAd.h>
#import <GoogleMobileAds/GADMobileAds.h>
#import <GoogleMobileAds/GADPreloadDelegate_Beta.h>

@class GADInterstitialAd;
@class GADPreloadConfigurationV2;

NS_SWIFT_NAME(InterstitialAdPreloader)
@interface GADInterstitialAdPreloader : NSObject

/// Returns the shared GADInterstitialAdPreloader instance.
@property(class, nonatomic, readonly, nonnull)
    GADInterstitialAdPreloader *sharedInstance NS_SWIFT_NAME(shared);

/// Starts preloading interstitial ads from the configuration for the given preload ID.
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

/// Returns whether an interstitial ad is preloaded for the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (BOOL)isAdAvailableWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(isAdAvailable(with:));

/// Returns a preloaded interstitial ad for the given preload ID. Returns nil if an ad is not
/// available.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (nullable GADInterstitialAd *)adWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(ad(with:));

/// Returns the number of preloaded interstitial ads available for the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (NSUInteger)numberOfAdsAvailableWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(numberOfAdsAvailable(with:));

/// Stops preloading interstitial ads and removes preloaded interstitial ads for the given preload
/// ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (void)stopPreloadingAndRemoveAdsForPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(stopPreloadingAndRemoveAds(for:));

/// Stops preloading all interstitial ads and removes all preloaded interstitial ads.
- (void)stopPreloadingAndRemoveAllAds;

/// Returns the corresponding configuration for the given preload ID.
///
/// @param preloadID A string that refers to a set of preloaded ads.
- (nullable GADPreloadConfigurationV2 *)configurationWithPreloadID:(nonnull NSString *)preloadID
    NS_SWIFT_NAME(configuration(with:));

/// Returns a map of preload IDs to their corresponding configurations.
- (nonnull NSDictionary<NSString *, GADPreloadConfigurationV2 *> *)configurations;

@end
