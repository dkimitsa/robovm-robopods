//
//  ISABannerAdLoaderDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import "ISABannerAdView.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Protocol handling loading callbacks for a requested banner ad.
 The callbacks will be invoked on the main thread.
 */
@protocol ISABannerAdLoaderDelegate <NSObject>

/**
 Called when a banner ad is successfully loaded.

 @param bannerAdView The banner ad that is loaded.
 */
- (void)bannerAdDidLoad:(ISABannerAdView *)bannerAdView;

/**
 Called when a banner ad fails to load.

 @param error The error that occurred during loading.
 */
- (void)bannerAdDidFailToLoadWithError:(NSError *)error;

@end

NS_ASSUME_NONNULL_END
