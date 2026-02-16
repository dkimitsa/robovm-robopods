//
// Created by Tenjin
// Copyright (c) 2022 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "TenjinSDK.h"

@class GADAdValue;

@interface TenjinSDK (AdMobILRD)
+ (void)handleAdMobILRD:(NSObject *)adView :(GADAdValue *)adValue;
+ (void)adMobImpressionFromJSON:(NSString *)jsonString;
@end
