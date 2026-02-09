//
//  ISARewardedAdInfo.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 Class containing information on the associated rewarded ad.
 */
@interface ISARewardedAdInfo : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 The identifier of the network instance.
 */
@property(nonatomic, strong, readonly) NSString *instanceId;

/**
 The unique identifier of the ad.
 */
@property(nonatomic, strong, readonly) NSString *adId;

@end

NS_ASSUME_NONNULL_END
