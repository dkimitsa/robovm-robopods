//
// Created by Tenjin
// Copyright (c) 2026 Tenjin. All rights reserved.
//

#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif
#import <Foundation/Foundation.h>

@interface TenjinSDK (CustomILRD)

+ (void)customImpressionFromJSON:(NSString *)jsonString;

@end
