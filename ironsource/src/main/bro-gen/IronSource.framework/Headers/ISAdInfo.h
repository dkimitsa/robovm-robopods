//
//  ISAdInfo.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface ISAdInfo : NSObject

@property(readonly, copy) NSString* auction_id;
@property(readonly, copy) NSString* ad_network;
@property(readonly, copy) NSString* instance_name;
@property(readonly, copy) NSString* instance_id;
@property(readonly, copy) NSString* country;
@property(readonly, copy) NSNumber* revenue;
@property(readonly, copy) NSString* precision;
@property(readonly, copy) NSString* ab;
@property(readonly, copy) NSString* segment_name;
@property(readonly, copy) NSString* encrypted_cpm;
@property(readonly, copy) NSNumber* conversion_value;

- (instancetype)init;

@end

NS_ASSUME_NONNULL_END
