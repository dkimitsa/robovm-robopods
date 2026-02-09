//
// Created by Tenjin
// Copyright (c) 2023 Tenjin. All rights reserved.
//

#import "TenjinSDK.h"
#import <Foundation/Foundation.h>

@interface TenjinSDK (TradPlusILRD)
+ (void)subscribeTradPlusImpressions;
+ (void)tradPlusImpressionFromJSON:(NSString *)jsonString;
+ (void)handleTradPlusILRD:(NSDictionary *)adInfo;
@end
