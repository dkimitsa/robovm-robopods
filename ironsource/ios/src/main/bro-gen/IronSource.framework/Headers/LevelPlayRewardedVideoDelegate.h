//
//  LevelPlayRewardedVideoDelegate.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//
#import "ISAdInfo.h"
#import "LevelPlayRewardedVideoBaseDelegate.h"

#ifndef LevelPlayRewardedVideoDelegate_h
#define LevelPlayRewardedVideoDelegate_h

DEPRECATED_MSG_ATTRIBUTE("Use LPMRewardedAdDelegate instead.")
@protocol LevelPlayRewardedVideoDelegate <LevelPlayRewardedVideoBaseDelegate>

@required

/**
 Called after a rewarded video has changed its availability to true.
 @param adInfo The info of the ad.
 */
- (void)hasAvailableAdWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("No replacement available.");

/**
 Called after a rewarded video has changed its availability to false.
 */
- (void)hasNoAvailableAd DEPRECATED_MSG_ATTRIBUTE("No replacement available.");

@end

#endif /* LevelPlayRewardedVideoDelegate_h */
