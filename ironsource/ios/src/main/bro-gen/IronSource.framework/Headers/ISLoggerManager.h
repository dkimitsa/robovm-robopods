//
//  LogManager.h
//  IronSource
//
//  Created by Roni Parshani on 10/22/14.
//  Copyright (c) 2014 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "ISLogDelegate.h"

#define ISLogInternal(tag2, format, ...)                                                    \
  [[ISLoggerManager sharedInstance] log:[NSString stringWithFormat:(format), ##__VA_ARGS__] \
                                  level:IS_LOG_INTERNAL                                     \
                                    tag:tag2]
#define ISLogInfo(tag2, format, ...)                                                        \
  [[ISLoggerManager sharedInstance] log:[NSString stringWithFormat:(format), ##__VA_ARGS__] \
                                  level:IS_LOG_INFO                                         \
                                    tag:tag2]
#define ISLogError(tag2, format, ...)                                                       \
  [[ISLoggerManager sharedInstance] log:[NSString stringWithFormat:(format), ##__VA_ARGS__] \
                                  level:IS_LOG_ERROR                                        \
                                    tag:tag2]

@class ISLogger;

@interface ISLoggerManager : NSObject

+ (ISLoggerManager *)sharedInstance;

- (void)setLoggingLevels:(NSInteger)server
               publisher:(NSInteger)publisher
                 console:(NSInteger)console;
- (void)log:(NSString *)message level:(ISLogLevel)logLevel tag:(LogTag)logTag;
- (void)logFromError:(NSError *)error level:(ISLogLevel)logLevel tag:(LogTag)logTag;
- (void)logFromException:(NSException *)exception level:(ISLogLevel)logLevel tag:(LogTag)logTag;
- (void)logFromException:(NSException *)exception
                 message:(NSString *)message
                   level:(ISLogLevel)logLevel
                     tag:(LogTag)logTag;
- (void)addPublisherLogger:(id<ISLogDelegate>)delegate;
- (void)dynamicLog:(char *)calledFrom
           message:(NSString *)message
             level:(ISLogLevel)logLevel
           withTag:(LogTag)logTag;
- (void)automationLog:(NSString *)message level:(ISLogLevel)logLevel withTag:(LogTag)logTag;

@end
