//
//  LPMImpressionData.h
//  IronSource
//
//  Copyright © 2020 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface LPMImpressionData : NSObject

@property(readonly, copy, nullable) NSString *auctionId;
@property(readonly, copy, nullable) NSString *mediationAdUnitName;
@property(readonly, copy, nullable) NSString *mediationAdUnitId;
@property(readonly, copy, nullable) NSString *adFormat;
@property(readonly, copy, nullable) NSString *adNetwork;
@property(readonly, copy, nullable) NSString *instanceName;
@property(readonly, copy, nullable) NSString *instanceId;
@property(readonly, copy, nullable) NSString *country;
@property(readonly, copy, nullable) NSString *placement;
@property(readonly, copy, nullable) NSNumber *revenue;
@property(readonly, copy, nullable) NSString *precision;
@property(readonly, copy, nullable) NSString *ab;
@property(readonly, copy, nullable) NSString *segmentName;
@property(readonly, copy, nullable) NSString *encryptedCpm;
@property(readonly, copy, nullable) NSNumber *conversionValue;
@property(readonly, copy, nullable) NSString *creativeId;

@property(readonly, copy, nullable) NSDictionary *allData;

- (instancetype)initWithDictionary:(NSDictionary *)dictionary;

- (instancetype)initWithImpressionData:(LPMImpressionData *)impressionData;

- (void)replacePlacementMacro:(NSString *)macro value:(NSString *)value;

@end

NS_ASSUME_NONNULL_END
