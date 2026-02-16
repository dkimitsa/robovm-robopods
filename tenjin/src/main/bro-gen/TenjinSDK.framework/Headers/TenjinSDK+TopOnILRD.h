//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "TenjinSDK.h"

@interface TenjinSDK (TopOnILRD)
+ (void)topOnImpressionFromDict:(NSDictionary *)adImpression;
+ (void)topOnImpressionFromJSON:(NSString *)jsonString;
@end
