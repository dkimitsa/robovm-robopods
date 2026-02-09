//
// Created by Tenjin on 2019-12-09.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "AsyncOperation.h"
#import "TJNOperationQueue.h"


@interface TenjinUtil : NSObject
+ (void)setSecret:(NSString *)secret;

+ (BOOL)hasSecret;

+ (NSString *)getSignature:(NSMutableDictionary *)params;

+ (NSString *)signDictionary:(NSMutableDictionary *)params
                  withSecret:(NSString *)sharedSecret;

+ (NSString *)timestampString;

+ (void)addOperation:(AsyncOperation *)op
 withCompletionBlock:(TJNOperationCompletion)block;

+ (void)addBlock:(TJNBlock)block;

+ (NSTimeInterval)backoffTimeForRetry:(int)retry;
@end
