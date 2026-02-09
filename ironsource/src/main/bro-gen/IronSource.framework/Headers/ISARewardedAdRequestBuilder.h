//
//  ISARewardedAdRequestBuilder.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISARewardedAdRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Builder class for `ISARewardedAdRequest`.
 */
@interface ISARewardedAdRequestBuilder : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Initializes the builder.

 @param instanceId The identifier for the network instance.
 @param adm The ad markup.
 */
- (instancetype)initWithInstanceId:(NSString *)instanceId adm:(NSString *)adm;

/**
 Sets extra parameters for the ad request.
 Optional.

 @param extraParams The extra parameters dictionary.

 @return The Builder instance.
 */
- (ISARewardedAdRequestBuilder *)withExtraParams:(NSDictionary *)extraParams;

/**
 Builds the `ISARewardedAdRequest` instance.

 @return The ad request instance.
 */
- (ISARewardedAdRequest *)build;

@end

NS_ASSUME_NONNULL_END
