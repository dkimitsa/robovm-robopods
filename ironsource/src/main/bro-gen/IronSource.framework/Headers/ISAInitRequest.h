//
//  ISAInitRequest.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAAdFormat.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Enum representing the different log levels in IronSourceAds.
 */
typedef NS_ENUM(NSInteger, ISALogLevel) { ISALogLevelNone, ISALogLevelError, ISALogLevelVerbose };

/**
 Class representing an initialization request for IronSourceAds.
 Use `ISAInitRequestBuilder` to create an instance of this class.
 */
@interface ISAInitRequest : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 The application key.
 */
@property(readonly, nonatomic) NSString *appKey;

/**
 Legacy ad formats for the initialization request.
 */
@property(readonly, nonatomic) NSArray<ISAAdFormat *> *legacyAdFormats;

/**
 Log level to use in IronSourceAds.
 Default value is `ISALogLevelNone`.
 */
@property(readonly, nonatomic) ISALogLevel logLevel;

@end

NS_ASSUME_NONNULL_END
