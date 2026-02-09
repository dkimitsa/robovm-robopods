//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "TenjinSDK.h"

@interface TenjinSDK (HyperBidILRD)
+ (void)hyperBidImpressionFromDict:(NSDictionary *)adImpression;
+ (void)hyperBidImpressionFromJSON:(NSString *)jsonString;
@end
