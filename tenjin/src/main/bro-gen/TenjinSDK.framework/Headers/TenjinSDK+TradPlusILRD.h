//
// Created by Tenjin
// Copyright (c) 2023 Tenjin. All rights reserved.
//

#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif
#import <Foundation/Foundation.h>

@interface TenjinSDK (TradPlusILRD)
+ (void)subscribeTradPlusImpressions;
+ (void)tradPlusImpressionFromJSON:(NSString *)jsonString;
+ (void)handleTradPlusILRD:(NSDictionary *)adInfo;
@end
