//
// Created by Tenjin on 2019-08-06.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>


typedef void (^LogHandler)(NSString *);

typedef NS_ENUM(NSInteger, TJNLogLevel) {
    TJNLogLevelDebug = 0, //tenjin developer logs
    TJNLogLevelLog = 1, //publisher + app developer logs
    TJNLogLevelError = 2 //errors and informational logs that everyone should know about
};

@interface TJNLogger : NSObject
+ (void)setHandler:(LogHandler)newHandler;

+ (void)setLogLevel:(TJNLogLevel)level;

+ (void)logResponse:(NSHTTPURLResponse *)response
           withData:(NSData *)data;

+ (void)logRequest:(NSURLRequest *)request;

+ (void)logTJNError:(NSString *)log;

+ (void)logTJNDebug:(NSString *)log;

+ (void)logTJNLog:(NSString *)log;
@end

void TJNError(NSString *log, ...);

void TJNDebug(NSString *log, ...);

void TJNLog(NSString *log, ...);
