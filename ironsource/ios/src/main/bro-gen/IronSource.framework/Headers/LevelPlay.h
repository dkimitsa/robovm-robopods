//
//  LevelPlay.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "LPMConfiguration.h"
#import "LPMImpressionDataDelegate.h"
#import "LPMInitRequest.h"

NS_ASSUME_NONNULL_BEGIN

@class LPMSegment;

typedef void (^LPMInitCompletionHandler)(LPMConfiguration *_Nullable config,
                                         NSError *_Nullable error);

@interface LevelPlay : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

#pragma mark - SDK Initialization

/**
 Initializes the LevelPlay SDK with the provided request parameters.

 @param request The  containing initialization parameters.
 @param completion A block called when the initialization process completes. It returns an
 `LPMConfiguration` object if successful, or an `NSError` describing the failure.
 */

+ (void)initWithRequest:(LPMInitRequest *)request completion:(LPMInitCompletionHandler)completion;

#pragma mark - SDK Properties

/**
 @abstact Retrieve a string-based representation of the SDK version.
 @discussion The returned value will be in the form of "<Major>.<Minor>.<Revision>".

 @return NSString representing the current IronSource SDK version.
 */
+ (NSString *)sdkVersion;

/**
 Adds the delegate for impression data callbacks.

 @param delegate The delegate for LevelPlay to send callbacks to.
 */

+ (void)addImpressionDataDelegate:(id<LPMImpressionDataDelegate>)delegate;

/**
 Removes the delegate from impression data callbacks.

 @param delegate The delegate for LevelPlay to send callbacks to.
 */

+ (void)removeImpressionDataDelegate:(id<LPMImpressionDataDelegate>)delegate;

/**
@abstact Sets the meta data with a key and value.
@discussion This value will be passed to the supporting ad networks.

@param key The meta data key.
@param value The meta data value

*/
+ (void)setMetaDataWithKey:(NSString *)key value:(NSString *)value;

/**
 @abstact Sets the meta data with a key and values.
 @discussion This value will be passed to the supporting ad networks.

 @param key The meta data key.
 @param values The meta data values.
 */
+ (void)setMetaDataWithKey:(NSString *)key values:(NSMutableArray *)values;

/**
@abstract Sets the network data according to the network key.

@param networkKey  Network identifier.
@param networkData a dictionary containing the information required by the network.
 */
+ (void)setNetworkDataWithNetworkKey:(NSString *)networkKey
                      andNetworkData:(NSDictionary *)networkData;

/**
 Sets a dynamic identifier for the current user.

 @param dynamicUserId Dynamic user identifier.
 @return`BOOL` that indicates if the dynamic identifier is valid.
 */
+ (BOOL)setDynamicUserId:(NSString *)dynamicUserId;

/**
 Sets if LevelPlay SDK should allow ad networks debug logs.

 @param flag  to allow ad networks debug logs,.
 */
+ (void)setAdaptersDebug:(BOOL)flag;

/**
 @abstract Sets a segment.
 @discussion This method is used to start a session with a spesific segment.

 @param segment A segment object.
 */
+ (void)setSegment:(LPMSegment *)segment;

#pragma mark - Test Suite

/**
 @abstract Launches the Test Suite. Mediation SDK must be initialized before calling this method.
 @param viewController The UIViewController to display the Test Suite within.
*/
+ (void)launchTestSuite:(UIViewController *)viewController;

#pragma mark - Validate Integration

/**
 @abstract A tool to verify a successful integration of the IronSource SDK and any additional
 adapters.
 @discussion The Integration Helper tool portray the compatibility between the SDK and adapter
 versions, and makes sure all required dependencies and frameworks were added for the various
 mediated ad networks.

 Once you have finished your integration, call the 'validateIntegration' function and confirm that
 everything in your integration is marked as VERIFIED.
 */

+ (void)validateIntegration;

/**
 @abstract Sets the consent value.
 @discussion Sets the consent, boolean value that indicates whether the user has granted consent for
 the SDK to collect and share data. Consent is used for GDPR compliance.
 @param consent value.
 */
+ (void)setConsent:(BOOL)consent;

@end

NS_ASSUME_NONNULL_END
