//
//  ISMetaDataUtils.h
//  IronSource
//
//  Created by Roi Eshel on 30/01/2020.
//  Copyright © 2020 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISMetaData.h"

@interface ISMetaDataUtils : NSObject

+ (ISMetaDataValueTypes)getValueTypeForKey:(NSString *)key;

+ (BOOL)isKnownKey:(NSString *)key;

+ (BOOL)isMediationOnlyKey:(NSString *)key;

+ (NSString *)formatValue:(NSString *)value forType:(ISMetaDataValueTypes)valueType;

+ (ISMetaData *)formatMetaDataKey:(NSString *)key andValues:(NSMutableArray *)values;

+ (BOOL)isMetaDataKeyValid:(NSString *)key error:(NSString **)error;

+ (BOOL)isMetaDataValuesValid:(NSMutableArray *)values error:(NSString **)error;

+ (BOOL)isValidCCPAMetaDataWithKey:(NSString *)key andValue:(NSString *)value;

+ (BOOL)isValidMetaDataWithKey:(NSString *)key flag:(NSString *)flag andValue:(NSString *)value;

+ (BOOL)getMetaDataBooleanValue:(NSString *)value;

@end
