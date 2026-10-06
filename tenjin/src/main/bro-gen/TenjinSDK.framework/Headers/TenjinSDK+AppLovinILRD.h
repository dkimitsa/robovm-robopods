//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif
#import <Foundation/Foundation.h>

@interface TenjinSDK (AppLovinILRD)
+ (void)subscribeAppLovinImpressions;
+ (void)appLovinImpressionFromJSON:(NSString *)jsonString;
@end
