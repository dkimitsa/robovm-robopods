//
// Created by Tenjin
// Copyright (c) 2023 Tenjin. All rights reserved.
//

#import "TenjinSDK.h"
#import <Foundation/Foundation.h>

@interface TenjinSDK (CASILRD)
+ (void)subscribeCASBannerImpressions;
+ (void)casImpressionFromJSON:(NSString *)jsonString;
+ (void)handleCASILRD:(id)adImpression;
@end
