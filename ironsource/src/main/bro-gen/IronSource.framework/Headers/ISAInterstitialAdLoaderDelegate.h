//
//  ISAInterstitialAdLoaderDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import "ISAInterstitialAd.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Protocol handling loading callbacks for a requested interstitial ad.
 The callbacks will be invoked on the main thread.
 */
@protocol ISAInterstitialAdLoaderDelegate <NSObject>

/**
 Called when an interstitial ad is successfully loaded.

 @param interstitialAd The interstitial ad that is loaded.
 */
- (void)interstitialAdDidLoad:(ISAInterstitialAd *)interstitialAd;

/**
 Called when an interstitial ad fails to load.

 @param error The error that occurred during loading.
 */
- (void)interstitialAdDidFailToLoadWithError:(NSError *)error;

@end

NS_ASSUME_NONNULL_END
