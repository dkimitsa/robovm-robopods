//
//  LevelPlayRewardedVideoBaseDelegate.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#ifndef LevelPlayRewardedVideoBaseDelegate_h
#define LevelPlayRewardedVideoBaseDelegate_h

#import "ISAdInfo.h"

@class ISPlacementInfo;

DEPRECATED_MSG_ATTRIBUTE("This protocol is deprecated and will be removed in version 9.0.0.")
@protocol LevelPlayRewardedVideoBaseDelegate <NSObject>

@required

/**
 Called after a rewarded video has been viewed completely and the user is eligible for a reward.
 @param placementInfo An object that contains the placement's reward name and amount.
 @param adInfo The info of the ad.
 */
- (void)didReceiveRewardForPlacement:(ISPlacementInfo *)placementInfo
                          withAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMRewardedAdDelegate didRewardAdWithAdInfo:reward:] instead.");

/**
 Called after a rewarded video has attempted to show but failed.
 @param error The reason for the error
 @param adInfo The info of the ad.
 */
- (void)didFailToShowWithError:(NSError *)error
                     andAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE(
        "Use [LPMRewardedAdDelegate didFailToDisplayAdWithAdInfo:error:] instead.");

/**
 Called after a rewarded video has been opened.
 @param adInfo The info of the ad.
 */
- (void)didOpenWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMRewardedAdDelegate didDisplayAdWithAdInfo:] instead.");

/**
 Called after a rewarded video has been clicked.
 @param placementInfo An object that contains the placement's reward name and amount.
 @param adInfo The info of the ad.
 */
- (void)didClick:(ISPlacementInfo *)placementInfo
      withAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMRewardedAdDelegate didClickAdWithAdInfo:] instead.");

/**
 Called after a rewarded video has been dismissed.
 @param adInfo The info of the ad.
 */
- (void)didCloseWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMRewardedAdDelegate didCloseAdWithAdInfo:] instead.");

@end

#endif /* LevelPlayRewardedVideoBaseDelegate_h */
