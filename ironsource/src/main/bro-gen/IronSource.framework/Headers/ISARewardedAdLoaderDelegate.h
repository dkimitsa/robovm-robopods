//
//  ISARewardedAdLoaderDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import "ISARewardedAd.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Protocol handling loading callbacks for a requested rewarded ad.
 The callbacks will be invoked on the main thread.
 */
@protocol ISARewardedAdLoaderDelegate <NSObject>

/**
 Called when a rewarded ad is successfully loaded.

 @param rewardedAd The rewarded ad that is loaded.
 */
- (void)rewardedAdDidLoad:(ISARewardedAd *)rewardedAd;

/**
 Called when a rewarded ad fails to load.

 @param error The error that occurred during loading.
 */
- (void)rewardedAdDidFailToLoadWithError:(NSError *)error;

@end

NS_ASSUME_NONNULL_END
