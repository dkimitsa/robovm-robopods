//
//  ISABannerAdRequestBuilder.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAAdSize.h"
#import "ISABannerAdRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Builder class for `ISABannerAdRequest`.
 */
@interface ISABannerAdRequestBuilder : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Initializes the builder.

 @param instanceId The identifier for the network instance.
 @param adm The ad markup.
 @param size The ad size.
 */
- (instancetype)initWithInstanceId:(NSString *)instanceId
                               adm:(NSString *)adm
                              size:(ISAAdSize *)size;

/**
 Sets extra parameters for the ad request.
 Optional.

 @param extraParams The extra parameters dictionary.

 @return The Builder instance.
 */
- (ISABannerAdRequestBuilder *)withExtraParams:(NSDictionary *)extraParams;

/**
 Sets the view controller that will show the ad, if available.

 @param viewController The view controller that will show the ad, if available.

 @return The Builder instance.
 */
- (ISABannerAdRequestBuilder *)withViewController:(UIViewController *)viewController;

/**
 Builds the `ISABannerAdRequest` instance.

 @return The ad request instance.
 */
- (ISABannerAdRequest *)build;

@end

NS_ASSUME_NONNULL_END
