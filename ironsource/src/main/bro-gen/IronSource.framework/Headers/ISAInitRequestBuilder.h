//
//  ISAInitRequestBuilder.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAAdFormat.h"
#import "ISAInitRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Builder class for `ISAInitRequest`.
 */
@interface ISAInitRequestBuilder : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Initializes the builder.

 @param appKey the application key.
 */
- (instancetype)initWithAppKey:(NSString *)appKey;

/**
 Builds the `ISAInitRequest` instance.

 @return The init request instance.
 */
- (ISAInitRequest *)build;

/**
 Sets the legacy ad formats for the initialization request.
 To enable non-bidding instances, pass the relevant legacy ad formats.
 For bidding instances, this is non-mandatory.

 @param legacyAdFormats The list of legacy ad formats.

 @return The Builder instance.
 */
- (ISAInitRequestBuilder *)withLegacyAdFormats:(NSArray<ISAAdFormat *> *)legacyAdFormats;

/**
 Sets the log level for the initialization request.
 Default value is `ISALogLevelNone`.

 @param logLevel The log level.

 @return The Builder instance.
 */
- (ISAInitRequestBuilder *)withLogLevel:(ISALogLevel)logLevel;

@end

NS_ASSUME_NONNULL_END
