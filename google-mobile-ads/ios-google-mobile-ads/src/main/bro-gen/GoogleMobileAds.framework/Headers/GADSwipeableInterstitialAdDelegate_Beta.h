//
//  GADSwipeableInterstitialAdDelegate_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC
//

#import <Foundation/Foundation.h>

@class GADSwipeableInterstitialAd;

/// Delegate for receiving lifecycle event messages from a GADSwipeableInterstitialAd.
NS_SWIFT_NAME(SwipeableInterstitialAdDelegate)
@protocol GADSwipeableInterstitialAdDelegate <NSObject>

@optional

#pragma mark - Ad Lifecycle Events

/// Called when an impression is recorded for an ad.
- (void)swipeableInterstitialAdDidRecordImpression:
    (nonnull GADSwipeableInterstitialAd *)swipeableInterstitialAd NS_SWIFT_UI_ACTOR;

/// Called when a click is recorded for an ad.
- (void)swipeableInterstitialAdDidRecordClick:
    (nonnull GADSwipeableInterstitialAd *)swipeableInterstitialAd NS_SWIFT_UI_ACTOR;

/// Tells the delegate that a full screen view will be presented in response to the user interacting
/// with an ad. The delegate may want to pause animations and time sensitive interactions.
- (void)swipeableInterstitialAdWillPresentScreen:
    (nonnull GADSwipeableInterstitialAd *)swipeableInterstitialAd NS_SWIFT_UI_ACTOR;

/// Tells the delegate that a full screen view will be dismissed.
- (void)swipeableInterstitialAdWillDismissScreen:
    (nonnull GADSwipeableInterstitialAd *)swipeableInterstitialAd NS_SWIFT_UI_ACTOR;

/// Tells the delegate that a full screen view has been dismissed. The delegate should restart
/// anything paused while handling swipeableInterstitialAdWillPresentScreen:.
- (void)swipeableInterstitialAdDidDismissScreen:
    (nonnull GADSwipeableInterstitialAd *)swipeableInterstitialAd NS_SWIFT_UI_ACTOR;

#pragma mark - Screen Hold Lifecycle Events

/// Called when the SDK detects that the ad is visible and stabilized on screen, marking the
/// start of the SDK's internal screen hold timer.
///
/// This is an informational callback provided for debugging and alignment purposes.
/// You are expected to manage your own screen hold timers and lifecycle monitoring to enforce
/// the ad's `minScreenHoldDuration` property. There is no corresponding "end" callback.
///
/// This delegate is not triggered if `minScreenHoldDuration` is 0.
- (void)swipeableInterstitialAdDidStartScreenHoldTimer:
    (nonnull GADSwipeableInterstitialAd *)swipeableInterstitialAd NS_SWIFT_UI_ACTOR;

@end
