//
//  LPMBannerAdViewConfig.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@class LPMAdSize;

NS_ASSUME_NONNULL_BEGIN

/**
 Class representing a banner ad configuration.
 Use `LPMBannerAdViewConfigBuilder` to create an instance of this class.
 */
@interface LPMBannerAdViewConfig : NSObject

/**
 * An ad size to be applied to the ad object.
 */
@property(nonatomic, strong, nullable, readonly) LPMAdSize *adSize;

/**
 * A bidding floor to be applied to the ad object.
 */
@property(nonatomic, strong, nullable, readonly) NSNumber *bidFloor;

/**
 * A placement name to be applied to the ad object.
 */
@property(nonatomic, strong, nullable, readonly) NSString *placementName;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
