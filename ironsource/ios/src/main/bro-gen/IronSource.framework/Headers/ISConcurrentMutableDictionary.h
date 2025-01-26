//
//  ISConcurrentMutableDictionary.h
//  Environment
//
//  Copyright © 2021 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface ISConcurrentMutableDictionary : NSObject

+ (instancetype)dictionary;

- (NSUInteger)count;
- (id)objectForKey:(id)key;

- (void)setObject:(id)object forKey:(id<NSCopying>)key;

- (void)removeObjectForKey:(id)key;
- (void)removeAllObjects;

- (NSArray *)allKeys;
- (NSArray *)allValues;
- (NSDictionary *)allData;

- (BOOL)hasObjectForKey:(id)key;

@end
