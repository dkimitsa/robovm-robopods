//
// Created by Tenjin on 2019-12-12.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>


//asynchronous operation to manage startup
@interface AsyncOperation : NSOperation

//do we prevent other operations from running until this one is complete?
@property (atomic, assign) BOOL blocker;

@property(readwrite) BOOL retryable;
@property(readwrite) BOOL success;

@end
