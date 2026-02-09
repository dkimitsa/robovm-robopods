//
//  ISConcurrentMutableDictionary.h
//  Environment
//
//  Copyright © 2021 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol LPMThreadSafeDictionaryProtocol <NSObject>

- (NSUInteger)count;

- (id)objectForKey:(NSString *)key;
- (void)setObject:(id)object forKey:(NSString *)key;
- (BOOL)hasObjectForKey:(NSString *)key;

- (void)removeObjectForKey:(NSString *)key;
- (void)removeAllObjects;

- (NSArray<NSString *> *)allKeys;
- (NSArray *)allValues;
- (NSDictionary<NSString *, id> *)allData;

@end

@interface ISConcurrentMutableDictionary : NSObject <LPMThreadSafeDictionaryProtocol>

+ (instancetype)dictionary;

@end
