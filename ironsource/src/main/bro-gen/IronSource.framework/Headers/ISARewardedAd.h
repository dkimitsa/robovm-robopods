//
//  ISARewardedAd.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "ISARewardedAdDelegate.h"
#import "ISARewardedAdInfo.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Class responsible for handling the operations and callbacks of a rewarded ad.
 */
@interface ISARewardedAd : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 The delegate for the ad callbacks.
 Set this delegate in order to receive callbacks from the ad.
 The callbacks will be invoked on the main thread.
 */
@property(nonatomic, weak, nullable) id<ISARewardedAdDelegate> delegate;

/**
 Contains information associated with the ad.
 */
@property(nonatomic, strong, readonly) ISARewardedAdInfo *adInfo;

/**
 Check if the ad is ready to show.
 Showing an ad that is not ready will result in a show failure.

 @return Whether the ad is ready to show.
 */
- (BOOL)isReadyToShow;

/**
 Show the ad.
 The delegate will send a `rewardedAdDidShow:` or
 `rewardedAd:didFailToShowWithError:` callback.

 @param viewController The view controller where the ad will be shown.
 */
- (void)showFromViewController:(UIViewController *)viewController;

@end

NS_ASSUME_NONNULL_END
