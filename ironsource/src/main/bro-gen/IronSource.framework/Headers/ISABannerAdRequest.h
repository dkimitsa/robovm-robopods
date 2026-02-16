//
//  ISNBannerAdRequest.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ISAAdSize.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Class representing a loading request for a banner ad.
 Use `ISABannerAdRequestBuilder` in order to create an instance of this class.
 */
@interface ISABannerAdRequest : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 The identifier for the network instance.
 */
@property(nonatomic, strong, readonly) NSString *instanceId;

/**
 The ad markup.
 */
@property(nonatomic, strong, readonly) NSString *adm;

/**
 The ad size.
 */
@property(nonatomic, strong, readonly) ISAAdSize *size;

/**
 The view controller to show the ad on, if available.
 */
@property(nonatomic, weak, readonly, nullable) UIViewController *viewController;

/**
 Extra parameters for the ad request.
 */
@property(nonatomic, strong, readonly, nullable) NSDictionary *extraParams;

@end

NS_ASSUME_NONNULL_END
