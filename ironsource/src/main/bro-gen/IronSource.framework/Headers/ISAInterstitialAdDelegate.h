//
//  ISAInterstitialAdDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

NS_ASSUME_NONNULL_BEGIN

@class ISAInterstitialAd;

/**
 Protocol handling interstitial ad show events for `ISAInterstitialAd`.
 The callbacks will be invoked on the main thread.
 */
@protocol ISAInterstitialAdDelegate <NSObject>

/**
 Called when an interstitial ad is shown.

 @param interstitialAd The interstitial ad that is shown.
 */
- (void)interstitialAdDidShow:(ISAInterstitialAd *)interstitialAd;

/**
 Called when an interstitial ad fails to show.

 @param interstitialAd The interstitial ad that fails to show.
 @param error The error that occurred.
 */
- (void)interstitialAd:(ISAInterstitialAd *)interstitialAd didFailToShowWithError:(NSError *)error;

/**
 Called when an interstitial ad is clicked.

 @param interstitialAd The interstitial ad that is clicked.
 */
- (void)interstitialAdDidClick:(ISAInterstitialAd *)interstitialAd;

/**
 Called when an interstitial ad is dismissed.

 @param interstitialAd The interstitial ad that is dismissed.
 */
- (void)interstitialAdDidDismiss:(ISAInterstitialAd *)interstitialAd;

@end

NS_ASSUME_NONNULL_END
