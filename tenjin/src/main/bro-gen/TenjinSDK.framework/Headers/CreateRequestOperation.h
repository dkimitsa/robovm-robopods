//
// Created by Tenjin on 2019-12-17
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "AsyncOperation.h"
#import "TJNOperationQueue.h"

@class TenjinImpl;

@interface CreateRequestOperation : AsyncOperation

@property(nonatomic, strong) NSString *eventName;
@property(nonatomic, strong) NSMutableDictionary *params;
@property(nonatomic, strong) TenjinImpl *client;

+ (CreateRequestOperation *)operationWithParams:(NSMutableDictionary *)deviceParams;
+ (CreateRequestOperation *)operationWithClient:(TenjinImpl *)client
                                    andParams:(NSMutableDictionary *)deviceParams;
@end
