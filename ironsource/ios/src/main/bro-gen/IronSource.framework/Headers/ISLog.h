//
//  ISLog.h
//  IronSource
//
//  Created by Yonti Makmel on 09/06/2020.
//  Copyright © 2020 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISLoggerManager.h"

NS_ASSUME_NONNULL_BEGIN

@interface ISLog : NSObject

// new dynamic logs
#define logGeneric(logLevel, tag, format, ...)                                                   \
  [[ISLoggerManager sharedInstance] dynamicLog:(char *)__PRETTY_FUNCTION__                       \
                                       message:[NSString stringWithFormat:format, ##__VA_ARGS__] \
                                         level:logLevel                                          \
                                       withTag:tag]

// TAG_API
#define LogApi_Internal(format, ...) logGeneric(IS_LOG_INTERNAL, TAG_API, format, ##__VA_ARGS__)
#define LogApi_Info(format, ...) logGeneric(IS_LOG_INFO, TAG_API, format, ##__VA_ARGS__)
#define LogApi_Warning(format, ...) logGeneric(IS_LOG_WARNING, TAG_API, format, ##__VA_ARGS__)
#define LogApi_Error(format, ...) logGeneric(IS_LOG_ERROR, TAG_API, format, ##__VA_ARGS__)
#define LogApi_General(format, ...) logGeneric(IS_LOG_GENERAL, TAG_API, format, ##__VA_ARGS__)

// TAG_DELEGATE
#define LogDelegate_Internal(format, ...) \
  logGeneric(IS_LOG_INTERNAL, TAG_DELEGATE, format, ##__VA_ARGS__)
#define LogDelegate_Info(format, ...) logGeneric(IS_LOG_INFO, TAG_DELEGATE, format, ##__VA_ARGS__)
#define LogDelegate_Warning(format, ...) \
  logGeneric(IS_LOG_WARNING, TAG_DELEGATE, format, ##__VA_ARGS__)
#define LogDelegate_Error(format, ...) logGeneric(IS_LOG_ERROR, TAG_DELEGATE, format, ##__VA_ARGS__)
#define LogDelegate_General(format, ...) \
  logGeneric(IS_LOG_GENERAL, TAG_DELEGATE, format, ##__VA_ARGS__)

// TAG_ADAPTER_API
#define LogAdapterApi_Internal(format, ...) \
  logGeneric(IS_LOG_INTERNAL, TAG_ADAPTER_API, format, ##__VA_ARGS__)
#define LogAdapterApi_Info(format, ...) \
  logGeneric(IS_LOG_INFO, TAG_ADAPTER_API, format, ##__VA_ARGS__)
#define LogAdapterApi_Warning(format, ...) \
  logGeneric(IS_LOG_WARNING, TAG_ADAPTER_API, format, ##__VA_ARGS__)
#define LogAdapterApi_Error(format, ...) \
  logGeneric(IS_LOG_ERROR, TAG_ADAPTER_API, format, ##__VA_ARGS__)
#define LogAdapterApi_General(format, ...) \
  logGeneric(IS_LOG_GENERAL, TAG_ADAPTER_API, format, ##__VA_ARGS__)

// TAG_ADAPTER_DELEGATE
#define LogAdapterDelegate_Internal(format, ...) \
  logGeneric(IS_LOG_INTERNAL, TAG_ADAPTER_DELEGATE, format, ##__VA_ARGS__)
#define LogAdapterDelegate_Info(format, ...) \
  logGeneric(IS_LOG_INFO, TAG_ADAPTER_DELEGATE, format, ##__VA_ARGS__)
#define LogAdapterDelegate_Warning(format, ...) \
  logGeneric(IS_LOG_WARNING, TAG_ADAPTER_DELEGATE, format, ##__VA_ARGS__)
#define LogAdapterDelegate_Error(format, ...) \
  logGeneric(IS_LOG_ERROR, TAG_ADAPTER_DELEGATE, format, ##__VA_ARGS__)
#define LogAdapterDelegate_General(format, ...) \
  logGeneric(IS_LOG_GENERAL, TAG_ADAPTER_DELEGATE, format, ##__VA_ARGS__)

// TAG_NETWORK
#define LogNetwork_Internal(format, ...) \
  logGeneric(IS_LOG_INTERNAL, TAG_NETWORK, format, ##__VA_ARGS__)
#define LogNetwork_Info(format, ...) logGeneric(IS_LOG_INFO, TAG_NETWORK, format, ##__VA_ARGS__)
#define LogNetwork_Warning(format, ...) \
  logGeneric(IS_LOG_WARNING, TAG_NETWORK, format, ##__VA_ARGS__)
#define LogNetwork_Error(format, ...) logGeneric(IS_LOG_ERROR, TAG_NETWORK, format, ##__VA_ARGS__)
#define LogNetwork_General(format, ...) \
  logGeneric(IS_LOG_GENERAL, TAG_NETWORK, format, ##__VA_ARGS__)

// TAG_NATIVE
#define LogNative_Internal(format, ...) \
  logGeneric(IS_LOG_INTERNAL, TAG_NATIVE, format, ##__VA_ARGS__)
#define LogNative_Info(format, ...) logGeneric(IS_LOG_INFO, TAG_NATIVE, format, ##__VA_ARGS__)
#define LogNative_Warning(format, ...) logGeneric(IS_LOG_WARNING, TAG_NATIVE, format, ##__VA_ARGS__)
#define LogNative_Error(format, ...) logGeneric(IS_LOG_ERROR, TAG_NATIVE, format, ##__VA_ARGS__)
#define LogNative_General(format, ...) logGeneric(IS_LOG_GENERAL, TAG_NATIVE, format, ##__VA_ARGS__)

// TAG_INTERNAL
#define LogInternal_Internal(format, ...) \
  logGeneric(IS_LOG_INTERNAL, TAG_INTERNAL, format, ##__VA_ARGS__)
#define LogInternal_Info(format, ...) logGeneric(IS_LOG_INFO, TAG_INTERNAL, format, ##__VA_ARGS__)
#define LogInternal_Warning(format, ...) \
  logGeneric(IS_LOG_WARNING, TAG_INTERNAL, format, ##__VA_ARGS__)
#define LogInternal_Error(format, ...) logGeneric(IS_LOG_ERROR, TAG_INTERNAL, format, ##__VA_ARGS__)
#define LogInternal_General(format, ...) \
  logGeneric(IS_LOG_GENERAL, TAG_INTERNAL, format, ##__VA_ARGS__)

// TAG_EVENT
#define LogEvent_Internal(format, ...) logGeneric(IS_LOG_INTERNAL, TAG_EVENT, format, ##__VA_ARGS__)
#define LogEvent_Info(format, ...) logGeneric(IS_LOG_INFO, TAG_EVENT, format, ##__VA_ARGS__)
#define LogEvent_Warning(format, ...) logGeneric(IS_LOG_WARNING, TAG_EVENT, format, ##__VA_ARGS__)
#define LogEvent_Error(format, ...) logGeneric(IS_LOG_ERROR, TAG_EVENT, format, ##__VA_ARGS__)
#define LogEvent_General(format, ...) logGeneric(IS_LOG_GENERAL, TAG_EVENT, format, ##__VA_ARGS__)

// AUTOMATION
#define LogAutomation(format, ...)                                    \
  [[ISLoggerManager sharedInstance]                                   \
      automationLog:[NSString stringWithFormat:format, ##__VA_ARGS__] \
              level:IS_LOG_INTERNAL                                   \
            withTag:TAG_INTERNAL]

@end

NS_ASSUME_NONNULL_END
