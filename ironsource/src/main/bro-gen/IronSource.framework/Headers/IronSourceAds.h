//
//  IronSourceAds.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAAdFormat.h"
#import "ISAInitRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Defines the completion callback for IronSourceAds SDK initialization.
 */
typedef void (^ISAInitCompletionHandler)(BOOL success, NSError *_Nullable error);

/**
 Object used to initialize IronSourceAds network.
 */
@interface IronSourceAds : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

#pragma mark - SDK Initialization

/**
 Initializes IronSourceAds SDK.

 @param request The initialization request containing the necessary configurations for
 initialization.
 @param completion The completion for initialization. The completion will be invoked on the main
 thread.
 */
+ (void)initWithRequest:(ISAInitRequest *)request completion:(ISAInitCompletionHandler)completion;

#pragma mark - SDK Properties

/**
 @abstact Retrieve a string-based representation of the SDK version.
 @discussion The returned value will be in the form of "<Major>.<Minor>.<Revision>".

 @return NSString representing the current IronSource SDK version.
 */
+ (NSString *)sdkVersion;

/**
 @abstract Sets if IAds should allow debug logs.
 @discussion This value will be passed to the IAds Network.

 Default is NO.

 @param enable YES to allow IAds Network debug logs, NO otherwise.
 */
+ (void)enableDebugMode:(BOOL)enable;

/**
@abstact Sets the meta data with a key and value.
@discussion This value will be passed to the IronSourceAds network.

@param key The meta data key.
@param value The meta data value

*/
+ (void)setMetaDataWithKey:(NSString *)key value:(NSString *)value;

/**
 @abstact Sets the meta data with a key and values.
 @discussion This value will be passed to the IronSourceAds network.

 @param key The meta data key.
 @param values The meta data values

 */
+ (void)setMetaDataWithKey:(NSString *)key values:(NSMutableArray *)values;

/**
 @abstract Sets the consent value.
 @discussion Sets the consent, boolean value that indicates whether the user has granted consent for
 the SDK to collect and share data. Consent is used for GDPR compliance.
 @param consent value.
 */
+ (void)setConsent:(BOOL)consent;

@end

NS_ASSUME_NONNULL_END
