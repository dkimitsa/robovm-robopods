//
// Created by Tenjin
// Copyright (c) 2025 Tenjin. All rights reserved.
//

#if !__has_feature(modules)
#import "TenjinSDK.h"
#endif
#import <Foundation/Foundation.h>

@interface TenjinSDK (CloudXILRD)
+ (void)handleCloudXILRD:(id)adImpression;
+ (void)cloudXImpressionFromJSON:(NSString *)jsonString;
@end
