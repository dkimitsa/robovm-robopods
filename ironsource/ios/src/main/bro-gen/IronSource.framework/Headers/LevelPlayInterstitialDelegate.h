//
//  LevelPlayInterstitialDelegate.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#ifndef LevelPlayInterstitialDelegate_h
#define LevelPlayInterstitialDelegate_h

#import "ISAdInfo.h"

DEPRECATED_MSG_ATTRIBUTE("Use LPMInterstitialAdDelegate instead.")
@protocol LevelPlayInterstitialDelegate <NSObject>

@required
/**
 Called after an interstitial has been loaded
 @param adInfo The info of the ad.
 */
- (void)didLoadWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMInterstitialAdDelegate didLoadAdWithAdInfo:] instead.");

/**
 Called after an interstitial has attempted to load but failed.
 @param error The reason for the error
 */
- (void)didFailToLoadWithError:(NSError *)error
    DEPRECATED_MSG_ATTRIBUTE(
        "Use [LPMInterstitialAdDelegate didFailToLoadAdWithAdUnitId:error:] instead.");

/**
 Called after an interstitial has been opened.
 @param adInfo The info of the ad.
 */
- (void)didOpenWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMInterstitialAdDelegate didDisplayAdWithAdInfo:] instead.");

/**
 Called after an interstitial has been displayed on the screen.
 @param adInfo The info of the ad.
 */
- (void)didShowWithAdInfo:(ISAdInfo *)adInfo DEPRECATED_MSG_ATTRIBUTE("No replacement available.");

/**
 Called after an interstitial has attempted to show but failed.
 @param error The reason for the error
 @param adInfo The info of the ad.
 */
- (void)didFailToShowWithError:(NSError *)error
                     andAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE(
        "Use [LPMInterstitialAdDelegate didFailToDisplayAdWithAdInfo:error:] instead.");

/**
 Called after an interstitial has been clicked.
 @param adInfo The info of the ad.
 */
- (void)didClickWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMInterstitialAdDelegate didClickAdWithAdInfo:] instead.");

/**
 Called after an interstitial has been dismissed.
 @param adInfo The info of the ad.
 */
- (void)didCloseWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMInterstitialAdDelegate didCloseAdWithAdInfo:] instead.");

@end

#endif /* LevelPlayInterstitialDelegate_h */
