//
//  LogManager.h
//  IronSource
//
//  Created by Roni Parshani on 10/22/14.
//  Copyright (c) 2014 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

typedef enum LogLevelValues {
  IS_LOG_NONE = -1,
  IS_LOG_INTERNAL = 0,
  IS_LOG_INFO = 1,
  IS_LOG_WARNING = 2,
  IS_LOG_ERROR = 3,
  IS_LOG_GENERAL = 4,  // Publisher log level, always visible
  IS_LOG_CRITICAL = 5,

} ISLogLevel;

typedef enum LogTagValue {
  TAG_API,
  TAG_DELEGATE,
  TAG_ADAPTER_API,
  TAG_ADAPTER_DELEGATE,
  TAG_NETWORK,
  TAG_NATIVE,
  TAG_INTERNAL,
  TAG_EVENT
} LogTag;

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
- (void)dynamicLog:(char *)calledFrom
           message:(NSString *)message
             level:(ISLogLevel)logLevel
           withTag:(LogTag)logTag;
- (void)automationLog:(NSString *)message level:(ISLogLevel)logLevel withTag:(LogTag)logTag;

@end
