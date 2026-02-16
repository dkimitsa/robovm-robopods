//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import "TenjinSDK.h"
#import <Foundation/Foundation.h>

@interface TenjinSDK (IronSourceILRD)
+ (void)subscribeIronSourceImpressions;
+ (void)ironSourceImpressionFromJSON:(NSString *)jsonString;
@end
