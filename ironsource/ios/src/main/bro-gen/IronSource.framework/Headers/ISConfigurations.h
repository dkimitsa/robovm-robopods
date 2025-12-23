//
//  Copyright © 2017 IronSource. All rights reserved.
//

#ifndef IRONSOURCE_CONFIGURATION_H
#define IRONSOURCE_CONFIGURATION_H

#import <Foundation/Foundation.h>

@class LPMSegment;

@interface ISConfigurations : NSObject

@property(nonatomic, strong) NSString *userId;
@property(nonatomic, strong) NSString *appKey;
@property(nonatomic, strong) NSString *segmentId;
@property(nonatomic, strong) NSDictionary *customSegmentParams;
@property(nonatomic, strong) LPMSegment *segment;
@property(nonatomic, strong) NSDictionary *rewardedVideoCustomParameters;
@property(nonatomic, strong) NSString *version;
@property(nonatomic, strong) NSNumber *adapterTimeOutInSeconds;
@property(nonatomic, strong) NSNumber *maxNumOfAdaptersToLoadOnStart;
@property(nonatomic, assign) BOOL advancedLoading;
@property(nonatomic, strong) NSString *plugin;
@property(nonatomic, strong) NSString *pluginVersion;
@property(nonatomic, strong) NSString *pluginFrameworkVersion;
@property(nonatomic, strong) NSNumber *maxVideosPerIteration;
@property(nonatomic, assign) NSInteger userAge;
@property(nonatomic, assign) BOOL trackReachability;
@property(nonatomic, strong) NSString *dynamicUserId;
@property(nonatomic, assign) BOOL adaptersDebug;
@property(nonatomic, strong) NSString *mediationType;
@property(nonatomic, strong) NSNumber *serr;
@property(nonatomic, strong) NSString *abt;
@property(nonatomic, strong) NSDictionary *rvServerParams;
@property(nonatomic, assign) NSInteger consent;
@property(nonatomic, assign) BOOL didSetConsent;
@property(nonatomic, strong) NSDictionary *batchGenericParams;
@property(nonatomic, strong) NSDictionary *eventGenericParams;
@property(nonatomic, strong) NSDictionary *eventPixelParams;

+ (ISConfigurations *)getConfigurations;

typedef NS_ENUM(NSInteger, DebugLevel) { None, Error, Info, Verbose };

@end

#endif
