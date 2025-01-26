//
//  IADebugger.h
//  IASDKCore
//
//  Created by Digital Turbine on 15/03/2017.
//  Copyright © 2022 Digital Turbine. All rights reserved.
//

#import <Foundation/Foundation.h>

#import <IASDKCore/IAInterfaceBuilder.h>

@protocol IADebuggerBuilder <NSObject>

@required

@property (nonatomic, copy, nullable) NSString *server;
@property (nonatomic, copy, nullable) NSString *database;
@property (nonatomic, copy, nullable) NSString *mockResponsePath;

@property (class, nonatomic) BOOL adReportingEnabled DEPRECATED_MSG_ATTRIBUTE("Deprecated, starting from 8.3.2");

@end

@interface IADebugger : NSObject <IAInterfaceBuilder, IADebuggerBuilder, NSCopying>

+ (instancetype _Nullable)build:(void(^ _Nonnull)(id<IADebuggerBuilder> _Nonnull builder))buildBlock;

@end
