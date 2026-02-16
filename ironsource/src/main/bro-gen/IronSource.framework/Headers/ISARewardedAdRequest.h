//
//  ISARewardedAdRequest.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 Class representing a loading request for a rewarded ad.
 Use `ISARewardedAdRequestBuilder` in order to create an instance of this class.
 */
@interface ISARewardedAdRequest : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 The identifier for the network instance.
 */
@property(readonly, nonatomic, strong) NSString *instanceId;

/**
 The ad markup.
 */
@property(readonly, nonatomic, strong) NSString *adm;

/**
 Extra parameters for the ad request.
 */
@property(readonly, nonatomic, strong, nullable) NSDictionary *extraParams;

@end

NS_ASSUME_NONNULL_END
