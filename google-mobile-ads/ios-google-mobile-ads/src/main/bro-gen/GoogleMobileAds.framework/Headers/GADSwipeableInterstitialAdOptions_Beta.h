//
//  GADSwipeableInterstitialAdOptions_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC
//

#import <UIKit/UIKit.h>

#import <GoogleMobileAds/GADAdSize.h>
#import <GoogleMobileAds/GoogleMobileAdsDefines.h>

/// Options for configuring Swipeable Interstitial ad behavior.
NS_SWIFT_NAME(SwipeableInterstitialAdOptions)
@interface GADSwipeableInterstitialAdOptions : NSObject <NSCopying>

/// Specifies the maximum duration (in seconds) the app commits to holding the ad on screen before
/// it is eligible for dismissal. The SDK only returns ads with a hold requirement that is less than
/// or equal to this value. Defaults to 0.
///
/// Only set this property if your app implements logic to hold swipeable interstitial ads on
/// screen.
@property(nonatomic, assign) NSTimeInterval maxScreenHoldDuration;

/// An optional ad size to request.
/// If not set, defaults to the device's full screen size.
/// If the requested ad size is determined to be too small for an interstitial experience, the ad
/// request will fail.
@property(nonatomic, assign) CGSize adSize;

/// The direction in which swipe gestures should be detected as custom click gestures for swipeable
/// interstitial ads.
@property(nonatomic, assign, readonly)
    UISwipeGestureRecognizerDirection customClickSwipeGestureDirection;

/// Determines whether the creative handles standard tap clicks when custom click swipe gestures are
/// enabled. Defaults to YES.
@property(nonatomic, assign, readonly, getter=areCustomClickSwipeGestureTapsAllowed)
    BOOL customClickSwipeGestureTapsAllowed NS_SWIFT_NAME(areCustomClickSwipeGestureTapsAllowed);

/// Enables custom click gestures for swipeable interstitial ads by specifying the swipe direction
/// for detecting custom click gestures, and whether tap gestures are treated as clicks on the ad.
- (void)enableCustomClickSwipeGestureWithDirection:(UISwipeGestureRecognizerDirection)direction
                                       tapsAllowed:(BOOL)tapsAllowed
    NS_SWIFT_NAME(enableCustomClickSwipeGesture(direction:tapsAllowed:));

@end
