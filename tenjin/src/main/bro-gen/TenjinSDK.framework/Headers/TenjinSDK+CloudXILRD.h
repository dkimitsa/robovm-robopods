//
// Created by Tenjin
// Copyright (c) 2025 Tenjin. All rights reserved.
//

#import "TenjinSDK.h"
#import <Foundation/Foundation.h>

@interface TenjinSDK (CloudXILRD)
+ (void)handleCloudXILRD:(id)adImpression;
+ (void)cloudXImpressionFromJSON:(NSString *)jsonString;
@end
