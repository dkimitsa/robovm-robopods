//
//  LPMRewardedAdDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import "LPMAdInfo.h"
#import "LPMReward.h"

NS_ASSUME_NONNULL_BEGIN

@class LPMRewardedAd;

/**
 Protocol handling rewarded ad events for `LPMRewardedAd`.
 The callbacks will be invoked on the main thread.
 */
@protocol LPMRewardedAdDelegate <NSObject>

/**
 Triggered when a rewarded ad is successfully loaded.

 @param adInfo Ad info of the loaded rewarded ad.
 */
- (void)didLoadAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when a rewarded ad fails to load.

 @param adUnitId The ad unit id of the rewarded ad that fails to load.
 @param error The error that occurred during loading.
 */
- (void)didFailToLoadAdWithAdUnitId:(NSString *)adUnitId error:(NSError *)error;

/**
 Triggered when a rewarded ad is displayed.

 @param adInfo Ad info of the displayed rewarded ad.
 */
- (void)didDisplayAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when the ad reward is granted.

 @param adInfo Ad info of the displayed rewarded ad.
 @param reward Reward of the displayed ad.
 */
- (void)didRewardAdWithAdInfo:(LPMAdInfo *)adInfo reward:(LPMReward *)reward;

@optional

/**
 Triggered when a rewarded ad fails to show.

 @param adInfo Ad info of the rewarded ad that failed to display.
 @param error The error that occurred.
 */
- (void)didFailToDisplayAdWithAdInfo:(LPMAdInfo *)adInfo error:(NSError *)error;

/**
 Triggered when a rewarded ad is clicked.

 @param adInfo Ad info of the clicked rewarded ad.
 */
- (void)didClickAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when a rewarded ad is closed.

 @param adInfo Ad info of the closed rewarded ad.
 */
- (void)didCloseAdWithAdInfo:(LPMAdInfo *)adInfo;

/**
 Triggered when ad was reloaded and ad info updated.

 @param adInfo The updated rewarded ad info after the reloading.
 */
- (void)didChangeAdInfo:(LPMAdInfo *)adInfo NS_SWIFT_NAME(didChangeAdInfo(_:));

@end

NS_ASSUME_NONNULL_END
