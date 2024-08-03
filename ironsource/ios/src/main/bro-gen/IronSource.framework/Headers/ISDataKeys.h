//
//  ISDataKeys.h
//  IronSource
//
//  Created by Yonti Makmel on 18/04/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//
#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface ISDataKeys : NSObject

// Keys used in AdData of the configuration

+ (NSString *)USER_ID;

+ (NSString *)AD_UNIT;

+ (NSString *)AD_DATA_IS_MULTIPLE_AD_UNITS_FLOW;

@end

NS_ASSUME_NONNULL_END
