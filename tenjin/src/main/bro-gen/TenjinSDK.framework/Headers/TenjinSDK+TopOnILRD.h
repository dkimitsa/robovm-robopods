//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif

@interface TenjinSDK (TopOnILRD)
+ (void)topOnImpressionFromDict:(NSDictionary *)adImpression;
+ (void)topOnImpressionFromJSON:(NSString *)jsonString;
@end
