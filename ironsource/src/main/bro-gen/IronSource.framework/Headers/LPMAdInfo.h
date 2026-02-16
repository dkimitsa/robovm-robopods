//
//  LPMAdInfo.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LPMAdSize.h"

NS_ASSUME_NONNULL_BEGIN

@interface LPMAdInfo : NSObject

@property(readonly, copy, nonnull) NSString *adId;
@property(readonly, copy) NSString *adUnitId;
@property(readonly, copy) NSString *adUnitName;
@property(readonly, copy, nullable) NSString *placementName;
@property(readonly, copy, nullable) LPMAdSize *adSize;
@property(readonly, copy) NSString *adFormat;
@property(readonly, copy) NSString *auctionId;
@property(readonly, copy) NSString *country;
@property(readonly, copy) NSString *ab;
@property(readonly, copy) NSString *segmentName;
@property(readonly, copy) NSString *adNetwork;
@property(readonly, copy) NSString *instanceName;
@property(readonly, copy) NSString *instanceId;
@property(readonly, copy) NSNumber *revenue;
@property(readonly, copy) NSString *precision;
@property(readonly, copy) NSString *encryptedCPM;
@property(readonly, copy) NSNumber *conversionValue;
@property(readonly, copy) NSString *creativeId;

@end

NS_ASSUME_NONNULL_END
