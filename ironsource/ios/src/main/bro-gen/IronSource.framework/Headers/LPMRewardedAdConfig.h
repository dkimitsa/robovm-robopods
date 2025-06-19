//
//  LPMRewardedAdConfig.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 Class representing a rewarded ad configuration.
 Use `LPMRewardedAdConfigBuilder` to create an instance of this class.
 */
@interface LPMRewardedAdConfig : NSObject

/**
 * A NSNumber bidding floor to be applied to the ad object.
 */
@property(nonatomic, strong, nullable, readonly) NSNumber *bidFloor;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
