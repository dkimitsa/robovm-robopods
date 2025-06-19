//
//  LevelPlayRewardedVideoManualDelegate.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#ifndef LevelPlayRewardedVideoManualDelegate_h
#define LevelPlayRewardedVideoManualDelegate_h

#import "ISAdInfo.h"

DEPRECATED_MSG_ATTRIBUTE("Use LPMRewardedAdDelegate instead.")
@protocol LevelPlayRewardedVideoManualDelegate <LevelPlayRewardedVideoBaseDelegate>

@required

/**
 Called after an rewarded video has been loaded in manual mode
 @param adInfo The info of the ad.
 */
- (void)didLoadWithAdInfo:(ISAdInfo *)adInfo
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMRewardedAdDelegate didLoadWithAdInfo:] instead.");

/**
 Called after a rewarded video has attempted to load but failed in manual mode

 @param error The reason for the error
 */
- (void)didFailToLoadWithError:(NSError *)error
    DEPRECATED_MSG_ATTRIBUTE(
        "Use [LPMRewardedAdDelegate didFailToLoadAdWithAdUnitId:error:] instead.");

@end

#endif /* LevelPlayRewardedVideoManualDelegate_h */
