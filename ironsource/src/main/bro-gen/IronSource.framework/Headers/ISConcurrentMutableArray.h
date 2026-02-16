//
//  ISConcurrentMutableArray.h
//  IronSourceSDK
//
//  Created by Asaf Gur on 15/12/2024.
//

#import <Foundation/Foundation.h>

@interface ISConcurrentMutableArray<__covariant ObjectType> : NSObject

- (instancetype)init;
- (NSUInteger)count;
- (void)addObject:(ObjectType)object;
- (ObjectType)objectAtIndex:(NSUInteger)index;
- (void)removeObjectAtIndex:(NSUInteger)index;
- (void)addObjectsFromArray:(NSArray *)array;
- (void)removeAllObjects;
- (BOOL)containsObject:(ObjectType)object;
- (NSArray *)copy;

@end
