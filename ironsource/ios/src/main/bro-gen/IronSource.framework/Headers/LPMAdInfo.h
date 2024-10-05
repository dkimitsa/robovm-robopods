//
//  LPMAdInfo.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISImpressionData.h"
#import "LPMAdSize.h"

NS_ASSUME_NONNULL_BEGIN

@interface LPMAdInfo : NSObject

@property(readonly, copy) NSString *adUnitId;
@property(readonly, copy) NSString *adUnitName;
@property(readonly, copy, nullable) NSString *placementName;
@property(readonly, copy, nullable) LPMAdSize *adSize;
@property(readonly, copy) NSString *adFormat;
@property(readonly, copy) NSString *auction_id DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use auctionId parameter instead.");
@property(readonly, copy) NSString *auctionId;
@property(readonly, copy) NSString *country;
@property(readonly, copy) NSString *ab;
@property(readonly, copy) NSString *segment_name DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use segmentName parameter instead.");
@property(readonly, copy) NSString *segmentName;
@property(readonly, copy) NSString *ad_network DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use adNetwork parameter instead.");
@property(readonly, copy) NSString *adNetwork;
@property(readonly, copy) NSString *instance_name DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use instanceName parameter instead.");
@property(readonly, copy) NSString *instanceName;
@property(readonly, copy) NSString *instance_id DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use instanceId parameter instead.");
@property(readonly, copy) NSString *instanceId;
@property(readonly, copy) NSNumber *revenue;
@property(readonly, copy) NSString *precision;
@property(readonly, copy) NSString *encrypted_cpm DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use encryptedCPM parameter instead.");
@property(readonly, copy) NSString *encryptedCPM;
@property(readonly, copy) NSNumber *conversion_value DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0. Please use conversionValue parameter "
    "instead.");
@property(readonly, copy) NSNumber *conversionValue;

@end

NS_ASSUME_NONNULL_END
