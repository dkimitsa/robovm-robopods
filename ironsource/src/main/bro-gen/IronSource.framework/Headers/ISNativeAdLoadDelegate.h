//
//  ISNativeAdLoadDelegate.h
//  IronSource
//
//  Created by Hadar Pur on 22/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdInfo.h"
#import "ISError.h"

@class LevelPlayNativeAd;

NS_ASSUME_NONNULL_BEGIN

@protocol ISNativeAdLoadDelegate <NSObject>

@required

/**
 Called after a native ad has been successfully loaded
 @param nativeAd Level Play native ad.
 @param adInfo The info of the ad.
 */
- (void)didLoad:(LevelPlayNativeAd *)nativeAd withAdInfo:(ISAdInfo *)adInfo;

/**
 Called after a native has attempted to load an ad but failed.
 @param nativeAd Level Play native ad.
 @param error The reason for the error
 */
- (void)didFailToLoad:(LevelPlayNativeAd *)nativeAd withError:(NSError *)error;

@end

NS_ASSUME_NONNULL_END
