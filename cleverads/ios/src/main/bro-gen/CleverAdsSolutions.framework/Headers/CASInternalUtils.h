//
//  CASInternalUtils.h
//  CleverAdsSolutions
//
//  Copyright © 2024 CleverAdsSolutions LTD, CAS.AI. All rights reserved.
//

#ifndef CASInternalUtils_h
#define CASInternalUtils_h

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface CASInternalUtils : NSObject
@property (class, readonly, nullable) NSString *adId;
@property (class, readonly) BOOL isAdTrackingEnabled;
@property (class, readonly) BOOL isAdTrackingNotDetermined;
/// Ad tracking status codes
/// - 0 - notDetermined
/// - 1 - restricted
/// - 2 - denied
/// - 3 - authorized
/// - 4 - notRequired
/// - 5 - Tracking Usage Description not defined
/// - 6 - AppTrackingTransparency framework not included
/// Use `getATTStatusDescription(adTrackingStatus)` to get string
@property (class, readonly) NSUInteger adTrackingStatus;
+ (void)trackingAuthorizationRequest:(nullable void (^)(NSUInteger))completion;

+ (void)configureFirebaseAppIfNeededWithCompletion:(void (^)(void))handler;
+ (BOOL)tryFirebaseLogEvent:(NSString *)eventName map:(NSDictionary<NSString *, id> *)map;
+ (BOOL)tryTenjinLogEvent:(NSString *)eventName json:(NSString *)eventJson;
+ (BOOL)tryTenjinLogImpressionEvent:(NSString *)eventJson;
@end

NS_ASSUME_NONNULL_END

#endif /* ifndef CASInternalUtils_h */
