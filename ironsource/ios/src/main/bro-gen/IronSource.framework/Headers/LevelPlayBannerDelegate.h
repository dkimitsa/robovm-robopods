//
//  LevelPlayBannerDelegate.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#ifndef LevelPlayBannerDelegate_h
#define LevelPlayBannerDelegate_h

#import "ISAdInfo.h"
#import "ISBannerView.h"

@protocol LevelPlayBannerDelegate <NSObject>

@required
/**
 Called after a banner ad has been successfully loaded
 @param adInfo The info of the ad.
 */
- (void)didLoad:(ISBannerView *)bannerView
     withAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdViewDelegate didLoadAdWithAdInfo:] instead.");

/**
 Called after a banner has attempted to load an ad but failed.
 @param error The reason for the error
 */
- (void)didFailToLoadWithError:(NSError *)error
    DEPRECATED_MSG_ATTRIBUTE(
        "Use [LPMBannerAdViewDelegate didFailToLoadAdWithAdUnitId:errorId:] instead.");

/**
 Called after a banner has been clicked.
 @param adInfo The info of the ad.
 */
- (void)didClickWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdViewDelegate didClickAdWithAdInfo:] instead.");

/**
 Called when a user was taken out of the application context.
 @param adInfo The info of the ad.
 */
- (void)didLeaveApplicationWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdViewDelegate didLeaveAppWithAdInfo:] instead.");

/**
 Called when a banner presented a full screen content.
 @param adInfo The info of the ad.
 */
- (void)didPresentScreenWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdViewDelegate didExpandAdWithAdInfo:] instead.");

/**
 Called after a full screen content has been dismissed.
 @param adInfo The info of the ad.
 */
- (void)didDismissScreenWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMBannerAdViewDelegate didCollapseAdWithAdInfo:] instead.");

@end

#endif /* LevelPlayBannerDelegate_h */
