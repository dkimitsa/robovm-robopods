//
//  GADMediationSwipeableInterstitialAd.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC. All rights reserved.
//

#import <GoogleMobileAds/Mediation/GADMediationAd.h>
#import <GoogleMobileAds/Mediation/GADMediationAdConfiguration.h>
#import <GoogleMobileAds/Mediation/GADMediationAdEventDelegate.h>
#import <UIKit/UIKit.h>

/// Rendered swipeable interstitial ad. Provides a single subview to add to the swipeable
/// interstitial ad's view hierarchy.
NS_SWIFT_NAME(MediationSwipeableInterstitialAd)
@protocol GADMediationSwipeableInterstitialAd <GADMediationAd>

/// The swipeable interstitial ad view.
@property(nonatomic, readonly, nonnull) UIView *view;

@end

/// Swipeable interstitial ad configuration.
NS_SWIFT_NAME(MediationSwipeableInterstitialAdConfiguration)
@interface GADMediationSwipeableInterstitialAdConfiguration : GADMediationAdConfiguration

/// Swipeable interstitial ad size requested of the adapter.
@property(nonatomic, readonly) CGSize adSize;

@end
