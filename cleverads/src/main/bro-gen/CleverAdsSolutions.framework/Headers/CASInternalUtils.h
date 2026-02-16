//
//  CASInternalUtils.h
//  CleverAdsSolutions
//
//  Copyright © 2025 CleverAdsSolutions LTD, CAS.AI. All rights reserved.
//

#ifndef CASInternalUtils_h
#define CASInternalUtils_h

#import <Foundation/Foundation.h>

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

+ (id _Nullable)tryPerformSelector:(NSString *_Nonnull)selector forClass:(Class _Nonnull)clazz error:(NSError *_Nullable *_Nullable)error;
+ (id _Nullable)tryPerformSelector:(NSString *_Nonnull)selector forClass:(Class _Nonnull)clazz arg:(id _Nullable)object error:(NSError *_Nullable *_Nullable)error;

+ (BOOL)doTryBlock:(void (^_Nonnull)(void))block error:(NSError *_Nullable *_Nullable)err;
@end


#endif /* ifndef CASInternalUtils_h */
