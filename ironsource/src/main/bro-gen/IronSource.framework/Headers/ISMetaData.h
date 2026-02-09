//
//  ISMetaData.h
//  IronSource
//
//  Created by Roi Eshel on 30/01/2020.
//  Copyright © 2020 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface ISMetaData : NSObject

typedef NS_ENUM(NSUInteger, ISMetaDataValueTypes) {
  META_DATA_VALUE_STRING,
  META_DATA_VALUE_BOOL,
  META_DATA_VALUE_INT,
  META_DATA_VALUE_LONG,
  META_DATA_VALUE_DOUBLE,
  META_DATA_VALUE_FLOAT
};

- (instancetype)initWithKey:(NSString *)key andValues:(NSMutableArray *)values;
- (instancetype)initWithKey:(NSString *)key
                     values:(NSMutableArray *)values
              andValuesType:(NSMutableArray *)valuesType;

@property NSString *key;
@property NSMutableArray *values;
@property NSMutableArray *valuesType;

@end
