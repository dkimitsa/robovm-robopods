//
//  GADSwipeableInterstitialAd_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#import <GoogleMobileAds/GADAdValue.h>
#import <GoogleMobileAds/GADRequest.h>
#import <GoogleMobileAds/GADResponseInfo.h>
#import <GoogleMobileAds/GADSwipeableInterstitialAdDelegate_Beta.h>
#import <GoogleMobileAds/GADSwipeableInterstitialAdOptions_Beta.h>
#import <GoogleMobileAds/GADVideoControllerDelegate.h>

@class GADSwipeableInterstitialAd;

/// A block that executes when the ad request operation completes. On success,
/// ad is non-nil and |error| is nil. On failure, ad is nil and |error| is non-nil.
typedef void (^GADSwipeableInterstitialAdLoadCompletionHandler)(
    GADSwipeableInterstitialAd *_Nullable ad, NSError *_Nullable error);

/// A swipeable interstitial ad. This format is large similar to an interstitial ad but is presented
/// like a banner ad. When displayed, it is intended to occupy the full screen. Use this ad format
/// if you require strict control over the ad's presentation and closing behavior, including custom
/// gestures such as swipes to dismiss the interstitial. Similar to interstitial ads, swipeable
/// interstitials have a minimum required screen hold time you must implement before allowing an ad
/// to close.
NS_SWIFT_NAME(SwipeableInterstitialAd)
@interface GADSwipeableInterstitialAd : NSObject

/// The view associated with the swipeable interstitial ad.
@property(nonatomic, readonly, nonnull) UIView *adView;

/// The unique identifier assigned to a specific ad placement in your app, created on the AdMob or
/// Ad Manager UI. Ad units are important for targeting and statistics.
///
/// Example AdMob ad unit ID: @"ca-app-pub-0123456789012345/0123456789"
/// Example Ad Manager ad unit ID: @"/21775744923/example/swipeable-interstitial"
@property(nonatomic, readonly, nonnull) NSString *adUnitID;

#pragma mark Response

/// Information about the ad response that returned the ad.
@property(nonatomic, readonly, nonnull) GADResponseInfo *responseInfo;

/// Called when the ad is estimated to have earned money.
@property(nonatomic, nullable, copy) GADPaidEventHandler paidEventHandler;

#pragma mark Ad Life Cycle

/// Optional delegate to receive state change notifications.
@property(nonatomic, weak, nullable) id<GADSwipeableInterstitialAdDelegate> delegate;

/// Delegate for receiving video lifecycle notifications.
@property(nonatomic, weak, nullable) id<GADVideoControllerDelegate> videoControllerDelegate;

/// The root view controller used by the swipeable interstitial ad to present content after the user
/// interacts with the ad. If this is nil, the view controller containing the swipeable interstitial
/// ad view is used.
@property(nonatomic, weak, nullable) UIViewController *rootViewController;

/// The minimum duration in seconds required by the loaded creative to be held on screen.
/// 0 if no minimum is required.
@property(nonatomic, readonly, assign) NSTimeInterval minScreenHoldDuration;

#pragma mark Making an Ad Request

/// Loads a swipeable interstitial ad.
///
/// @param adUnitID An ad unit ID created in the AdMob or Ad Manager UI.
/// @param request An ad request object. If nil, a default ad request object is used.
/// @param options The options object containing format-specific configuration
///                (e.g., screen hold duration, ad size). If nil, defaults to requesting a
///                fullscreen ad with no maximum screen hold duration preference.
/// @param completionHandler A handler to execute when the load operation finishes or times out.
+ (void)loadWithAdUnitID:(nonnull NSString *)adUnitID
                 request:(nullable GADRequest *)request
                 options:(nullable GADSwipeableInterstitialAdOptions *)options
       completionHandler:(nonnull GADSwipeableInterstitialAdLoadCompletionHandler)completionHandler
    NS_SWIFT_NAME(load(with:request:options:completionHandler:));

@end
