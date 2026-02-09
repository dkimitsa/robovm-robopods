//
//  LPMInterstitialAdDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import "LPMAdInfo.h"

NS_ASSUME_NONNULL_BEGIN

@class LPMInterstitialAd;

/**
 Protocol handling interstitial ad events for `LPMInterstitialAd`.
 The callbacks will be invoked on the main thread.
 */
@protocol LPMInterstitialAdDelegate <NSObject>

/**
 Triggered when an interstitial ad is successfully loaded.

 @param adInfo Ad info of the loaded interstitial ad.
 */
- (void)didLoadAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when an interstitial ad fails to load.

 @param adUnitId The ad unit id of the interstitial ad that fails to load.
 @param error The error that occurred during loading.
 */
- (void)didFailToLoadAdWithAdUnitId:(NSString *)adUnitId error:(NSError *)error;

/**
 Triggered when an interstitial ad is displayed.

 @param adInfo Ad info of the displayed interstitial ad.
 */
- (void)didDisplayAdWithAdInfo:(LPMAdInfo *)adInfo;

@optional

/**
 Triggered when an interstitial ad fails to show.

 @param adInfo Ad info of the interstitial ad that failed to display.
 @param error The error that occurred.
 */
- (void)didFailToDisplayAdWithAdInfo:(LPMAdInfo *)adInfo error:(NSError *)error;

/**
 Triggered when an interstitial ad is clicked.

 @param adInfo Ad info of the clicked interstitial ad.
 */
- (void)didClickAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when an interstitial ad is closed.

 @param adInfo Ad info of the closed interstitial ad.
 */
- (void)didCloseAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when ad was reloaded and ad info updated.

 @param adInfo The updated interstitial ad info after the reloading.
 */
- (void)didChangeAdInfo:(LPMAdInfo *)adInfo NS_SWIFT_NAME(didChangeAdInfo(_:));

@end

NS_ASSUME_NONNULL_END
