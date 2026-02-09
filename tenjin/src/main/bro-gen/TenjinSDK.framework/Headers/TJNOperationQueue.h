//
// Created by Tenjin on 2019-12-12.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>

typedef void (^TJNOperationCompletion)(id sendingOperation);
typedef void (^TJNBlock)(void);

@interface TJNOperationQueue : NSOperationQueue


- (void)addBlock:(TJNBlock)block
  withCompletion:(TJNOperationCompletion)completionBlock;

- (void)addBlock:(TJNBlock)block;

- (void)addOperation:(NSOperation *)op
      withCompletion:(TJNOperationCompletion)completionBlock;
@end
