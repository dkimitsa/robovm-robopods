//
//  ISAdData.h
//  IronSource
//
//  Created by Yonti Makmel on 22/04/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//
#import <Foundation/Foundation.h>
#import "ISAdapterConfig.h"
#import "ISBannerSize.h"

NS_ASSUME_NONNULL_BEGIN

@interface ISAdData : NSObject

// The server data containing the adm
@property(nonatomic, strong, readonly, nullable) NSString *serverData;

// The server configuration
@property(nonatomic, strong, readonly) NSDictionary *configuration;

// The configuration holding userId, banner size, ad unit data from auction response and adapter
// config
@property(nonatomic, strong, readonly, nullable) NSDictionary *adUnitData;

- (instancetype)initWithServerData:(nullable NSString *)serverData
                     configuration:(NSDictionary *)configuration
                        adUnitData:(nullable NSDictionary *)adUnitData;

- (nullable NSString *)getString:(NSString *)key;

- (NSInteger)getInt:(NSString *)key;

- (BOOL)getBoolean:(NSString *)key;

- (nullable NSNumber *)getNumber:(NSString *)key;

- (nullable NSDictionary *)getAdUnitData;

@end

NS_ASSUME_NONNULL_END
