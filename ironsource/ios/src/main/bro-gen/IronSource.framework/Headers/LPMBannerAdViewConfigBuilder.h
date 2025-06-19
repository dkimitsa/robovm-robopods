//
//  LPMBannerAdViewConfigBuilder.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@class LPMBannerAdViewConfig, LPMAdSize;

NS_ASSUME_NONNULL_BEGIN

@interface LPMBannerAdViewConfigBuilder : NSObject

/**
 Set an ad size to be applied to the ad object.

 @param adSize an ad size.
 @returns The builder that had the setter called.
 */
- (LPMBannerAdViewConfigBuilder *)setWithAdSize:(LPMAdSize *)adSize NS_SWIFT_NAME(set(adSize:));

/**
 Set a bid floor to be applied to the ad object.

 @param bidFloor bid floor value in USD.
 @returns The builder that had the setter called.
 */
- (LPMBannerAdViewConfigBuilder *)setWithBidFloor:(NSNumber *)bidFloor
    NS_SWIFT_NAME(set(bidFloor:));

/**
 Set a placement name to be applied to the ad object.

 @param placementName The placement name for the ad.
 @returns The builder that had the setter called.
 */
- (LPMBannerAdViewConfigBuilder *)setWithPlacementName:(NSString *)placementName
    NS_SWIFT_NAME(set(placementName:));

/**
 @returns a banner ad configuration from this builder
 */
- (LPMBannerAdViewConfig *)build;

@end

NS_ASSUME_NONNULL_END
