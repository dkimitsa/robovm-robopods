//
//  LPMReward.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 Class representing a reward for an ad.
 */
@interface LPMReward : NSObject

/**
 The amount of the reward.
 */
@property(readonly, nonatomic) NSInteger amount;

/**
 The name of the reward.
 */
@property(readonly, strong, nonatomic) NSString *name;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;
- (instancetype)initWithName:(NSString *)name amount:(NSInteger)amount;

@end

NS_ASSUME_NONNULL_END
