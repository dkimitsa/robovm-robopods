//
//  IAAdRequest.h
//  IASDKCore
//
//  Created by Digital Turbine on 13/03/2017.
//  Copyright © 2022 Digital Turbine. All rights reserved.
//

#import <Foundation/Foundation.h>

#import <IASDKCore/IAInterfaceBuilder.h>
#import <IASDKCore/IARequest.h>
#import <IASDKCore/IAInterfaceAdDescription.h>

@class IAUserData;
@class IADebugger;
@class IAMediation;

@protocol IAAdRequestBuilder <NSObject>

@required

@property (nonatomic) BOOL useSecureConnections DEPRECATED_MSG_ATTRIBUTE("This API is deprecated as of version 8.3.5.");

/**
 *  @brief A mandatory parameter.
 */
@property (nonatomic, copy, nonnull) NSString *spotID;

/**
 *  @brief The request timeout in seconds before the 'ready on client' will be received.
 *
 *  @discussion The min value is 1, the max value is 180, the default is 10. In case the input param is out of bounds, the default one will be set.
 */
@property (nonatomic) NSTimeInterval timeout;

/**
 *  @brief The minimum floor price for the ad request.
 *
 *  @discussion Optional. Specifies the minimum bid floor price in US dollars ($USD).
 *  The expected input parameter is a double number.
 *
 *  Usage Examples:
 *
 *  - In Objective-C: use `@(3.14)`
 *
 *  - In Swift: use `3.14`
 *
 *  Constraints and Behavior:
 *
 *  - The minimum allowed value is 0.0, and the maximum is 400000.0.
 *
 *  - A value below the minimum will be clamped to the minimum value (0.0).
 *
 *  - A value above the maximum will be clamped to the maximum value (400000.0).
 *
 *  - An invalid/non-numeric input type (e.g., string) will be set to the minimum value (0.0).
 *
 *  Processing Note:
 *
 *  - The final value is processed to a maximum of 5 decimal places.
 *  It is trimmed to 5 fraction digits and is rounded up.
 *
 *  - Example: The number `3.141592653589793` will become `3.1416`.
 */
@property (nonatomic, copy, nullable) NSNumber *floorPrice;

@property (nonatomic, copy, nullable) IADebugger *debugger;

/**
 *  @brief Subtype expected configuration. In case a certain type of ad has extra configuration, assign it here.
 */
@property (nonatomic, copy, nullable) id<IAInterfaceAdDescription> subtypeDescription;

@end

@interface IAAdRequest : IARequest <IAInterfaceBuilder, IAAdRequestBuilder, NSCopying>

/**
 *  @brief Use in order to determine type of unit returned.
 *  @discussion Will be assigned at response parsing phase.
 */
@property (nonatomic, copy, nullable, readonly) NSString *unitID;

+ (instancetype _Nullable)build:(void(^ _Nonnull)(id<IAAdRequestBuilder> _Nonnull builder))buildBlock;

@end
