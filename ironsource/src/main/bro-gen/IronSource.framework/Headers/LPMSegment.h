//
//  LPMSegment.h
//  IronSource
//
//  Copyright © 2025 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface LPMSegment : NSObject
@property(nonatomic) int level;
@property(nonatomic) double iapTotal;
@property(nonatomic) BOOL paying;
@property(nonatomic, strong) NSDate *userCreationDate;
@property(nonatomic, strong) NSString *segmentName;
@property(nonatomic, strong, readonly) NSDictionary<NSString *, NSString *> *customKeys;

- (void)setCustomValue:(NSString *)value forKey:(NSString *)key;

- (NSDictionary *)getData;

@end
