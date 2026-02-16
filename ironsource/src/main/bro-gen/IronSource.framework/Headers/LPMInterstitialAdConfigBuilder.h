//
//  LPMInterstitialAdConfigBuilder.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@class LPMInterstitialAdConfig;

NS_ASSUME_NONNULL_BEGIN

@interface LPMInterstitialAdConfigBuilder : NSObject

/**
 Set a bid floor to be applied to the ad object.

 @param bidFloor bid floor value in USD.
 @returns The builder that had the setter called.
 */
- (LPMInterstitialAdConfigBuilder *)setWithBidFloor:(NSNumber *)bidFloor
    NS_SWIFT_NAME(set(bidFloor:));

/**
 @returns an interstitial ad configuration from this builder
 */
- (LPMInterstitialAdConfig *)build;

@end

NS_ASSUME_NONNULL_END
