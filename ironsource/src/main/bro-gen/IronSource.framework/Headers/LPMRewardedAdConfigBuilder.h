//
//  LPMRewardedAdConfigBuilder.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@class LPMRewardedAdConfig;

NS_ASSUME_NONNULL_BEGIN

@interface LPMRewardedAdConfigBuilder : NSObject

/**
 Set a bid floor to be applied to the ad object.

 @param bidFloor bid floor value in USD.
 @returns The builder that had the setter called.
 */
- (LPMRewardedAdConfigBuilder *)setWithBidFloor:(NSNumber *)bidFloor NS_SWIFT_NAME(set(bidFloor:));

/**
 @returns a rewarded ad configuration from this builder
 */
- (LPMRewardedAdConfig *)build;

@end

NS_ASSUME_NONNULL_END
