//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif

@interface TenjinSDK (HyperBidILRD)
+ (void)hyperBidImpressionFromDict:(NSDictionary *)adImpression;
+ (void)hyperBidImpressionFromJSON:(NSString *)jsonString;
@end
