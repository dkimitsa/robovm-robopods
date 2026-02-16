//
//  ISNBannerLoader.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import "ISABannerAdLoaderDelegate.h"
#import "ISABannerAdRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Class responsible for loading banner ads.
 */
@interface ISABannerAdLoader : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Loads a banner ad.
 The delegate will send a `bannerAdDidLoad:` or
 `bannerAdDidFailToLoadWithError:` callback.

 @param adRequest The request configuration for the ad to be loaded.
 @param delegate The delegate to be notified of ad loading callbacks. The callbacks will be invoked
 on the main thread. The delegate is held weakly.
 */
+ (void)loadAdWithAdRequest:(ISABannerAdRequest *)adRequest
                   delegate:(id<ISABannerAdLoaderDelegate>)delegate;

@end

NS_ASSUME_NONNULL_END
