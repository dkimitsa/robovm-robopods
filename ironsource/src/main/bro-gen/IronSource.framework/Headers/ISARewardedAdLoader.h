//
//  ISNLoaderRewardedVideo.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISARewardedAdLoaderDelegate.h"
#import "ISARewardedAdRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Class responsible for loading rewarded ads.
 */
@interface ISARewardedAdLoader : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Loads a rewarded ad.
 The delegate will send a `rewardedAdDidLoad:` or
 `rewardedAdDidFailToLoadWithError:` callback.

 @param adRequest The request configuration for the ad to be loaded.
 @param delegate The delegate to be notified of ad loading callbacks. The callbacks will be invoked
 on the main thread. The delegate is held weakly.
 */
+ (void)loadAdWithAdRequest:(ISARewardedAdRequest *)adRequest
                   delegate:(id<ISARewardedAdLoaderDelegate>)delegate;

@end

NS_ASSUME_NONNULL_END
