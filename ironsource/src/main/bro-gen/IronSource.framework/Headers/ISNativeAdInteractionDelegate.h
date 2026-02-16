//
//  ISNativeAdInteractionDelegate.h
//  IronSource
//
//  Created by Hadar Pur on 22/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdInfo.h"

NS_ASSUME_NONNULL_BEGIN

@class LevelPlayNativeAd;

@protocol ISNativeAdInteractionDelegate <NSObject>

@required

/**
 Called after a native ad impression has been recorded.
 @param nativeAd Level Play native ad.
 @param adInfo The info of the ad.
 */
- (void)didRecordImpression:(LevelPlayNativeAd *)nativeAd withAdInfo:(ISAdInfo *)adInfo;

/**
 Called after a native ad has been clicked.
 @param nativeAd Level Play native ad.
 @param adInfo The info of the ad.
 */
- (void)didClick:(LevelPlayNativeAd *)nativeAd withAdInfo:(ISAdInfo *)adInfo;

@end

NS_ASSUME_NONNULL_END
