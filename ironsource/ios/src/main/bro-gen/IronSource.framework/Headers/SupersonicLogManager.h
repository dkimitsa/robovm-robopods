//
//  SupersonicLogManager.h
//  SSASDK
//
//  Created by Roee Kremer on 11/12/14.
//  Copyright (c) 2014 SSA Ltd. All rights reserved.
//

#import <Foundation/Foundation.h>

#define SSLog(level, tag, fmt, ...)                                                      \
  [[SupersonicLogManager sharedManager] log:[NSString stringWithFormat:fmt, __VA_ARGS__] \
                                  withLevel:level                                        \
                                    withTag:tag];

#define SSLogError(error, str)                                      \
  do {                                                              \
    SSLog(ISNLogError, ISN_TAG_CONTROLLER_DELEGATE, @"%@: %@", str, \
          [SSAHelperMethods decodeFromPercentEscapeString:error]);  \
  } while (0)
//

typedef NS_ENUM(NSUInteger, ISNLogLevel) { ISNLogVerbose = 0, ISNLogInfo, ISNLogError };

typedef NS_ENUM(NSUInteger, ISNLogTag)

{ ISN_TAG_NATIVE,
  ISN_TAG_INTERNAL,
  ISN_TAG_CONTROLLER_INTERNAL,
  ISN_TAG_CONTROLLER_API,
  ISN_TAG_CONTROLLER_DELEGATE,
  ISN_TAG_NATIVE_AD };

DEPRECATED_MSG_ATTRIBUTE("This class will be made private in version 9.0.0.")
@interface SupersonicLogManager : NSObject

@property(assign) NSInteger requiredDebugMode;

+ (SupersonicLogManager *)sharedManager;
- (void)log:(NSString *)str withLevel:(ISNLogLevel)level withTag:(ISNLogTag)tag;
- (void)logWithNetworkPrefix:(NSString *)logMessage
                   withLevel:(ISNLogLevel)logLevel
                     withTag:(ISNLogTag)logTag;
@end
