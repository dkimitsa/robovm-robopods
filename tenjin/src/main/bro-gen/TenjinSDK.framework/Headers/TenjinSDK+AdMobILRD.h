//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif

@class GADAdValue;

@interface TenjinSDK (AdMobILRD)
+ (void)handleAdMobILRD:(NSObject *)adView :(GADAdValue *)adValue;
+ (void)adMobImpressionFromJSON:(NSString *)jsonString;
@end
