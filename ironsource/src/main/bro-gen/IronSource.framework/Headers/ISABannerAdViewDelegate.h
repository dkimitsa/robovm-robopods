//
//  ISABannerAdViewDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

NS_ASSUME_NONNULL_BEGIN

@class ISABannerAdView;

/**
 Protocol handling banner ad show events for `ISABannerAd`.
 The callbacks will be invoked on the main thread.
 */
@protocol ISABannerAdViewDelegate <NSObject>

/**
 Called when a banner ad is shown.

 @param bannerAdView The banner ad that is shown.
 */
- (void)bannerAdViewDidShow:(ISABannerAdView *)bannerAdView;

/**
 Called when a banner ad is clicked.

 @param bannerAdView The banner ad that is clicked.
 */
- (void)bannerAdViewDidClick:(ISABannerAdView *)bannerAdView;

@end

NS_ASSUME_NONNULL_END
