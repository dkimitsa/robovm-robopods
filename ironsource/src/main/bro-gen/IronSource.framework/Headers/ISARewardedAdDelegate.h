//
//  ISARewardedAdDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

NS_ASSUME_NONNULL_BEGIN

@class ISARewardedAd;

/**
 Protocol handling rewarded ad show events for `ISARewardedAd`.
 The callbacks will be invoked on the main thread.
 */
@protocol ISARewardedAdDelegate <NSObject>

/**
 Called when a rewarded ad is shown.

 @param rewardedAd The rewarded ad that is shown.
 */
- (void)rewardedAdDidShow:(ISARewardedAd *)rewardedAd;

/**
 Called when a rewarded ad fails to show.

 @param rewardedAd The rewarded ad that fails to show.
 @param error The error that occurred.
 */
- (void)rewardedAd:(ISARewardedAd *)rewardedAd didFailToShowWithError:(NSError *)error;

/**
 Called when the user earns a reward.

 @param rewardedAd The rewarded ad that the user earns a reward from.
 */
- (void)rewardedAdDidUserEarnReward:(ISARewardedAd *)rewardedAd;

/**
 Called when a rewarded ad is clicked.

 @param rewardedAd The rewarded ad that is clicked.
 */
- (void)rewardedAdDidClick:(ISARewardedAd *)rewardedAd;

/**
 Called when a rewarded ad is dismissed.

 @param rewardedAd The rewarded ad that is dismissed.
 */
- (void)rewardedAdDidDismiss:(ISARewardedAd *)rewardedAd;

@end

NS_ASSUME_NONNULL_END
