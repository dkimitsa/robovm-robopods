//
//  Singular.h
//  Singular SDK for iOS public API
//
//  Copyright © 2010-2023 Singular Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <WebKit/WebKit.h>
#import "Attributes.h"
#import "Events.h"
#import "SingularAdData.h"

// avoid circular include of SingularLinkParams
#ifndef SingularLinkParams
#import "SingularLinkParams.h"
#endif

// avoid circular include of SingularConfig
#ifndef SingularConfig
#import "SingularConfig.h"
#endif

@interface Singular : NSObject

#pragma mark - Session lifecycle

+ (BOOL)start:(SingularConfig *)config;

+ (void)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret;
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andLaunchOptions:(NSDictionary *)launchOptions withSingularLinkHandler:(void (^)(SingularLinkParams *))handler;
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret
    andLaunchOptions:(NSDictionary *)launchOptions withSingularLinkHandler:(void (^)(SingularLinkParams *))handler andShortLinkResolveTimeout:(long)timeoutSec;
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andLaunchOptions:(NSDictionary *)launchOptions withSingularLinkHandler:(void (^)(SingularLinkParams *))handler andSupportedDomains:(NSArray *)domains __attribute__((deprecated));
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andLaunchOptions:(NSDictionary *)launchOptions withSingularLinkHandler:(void (^)(SingularLinkParams *))handler andShortLinkResolveTimeout:(long)timeoutSec andSupportedDomains:(NSArray *)domains __attribute__((deprecated));
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andUserActivity:(NSUserActivity *)userActivity withSingularLinkHandler:(void (^)(SingularLinkParams *))handler;
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andUserActivity:(NSUserActivity *)userActivity withSingularLinkHandler:(void (^)(SingularLinkParams *))handler andShortLinkResolveTimeout:(long)timeoutSec;
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andUserActivity:(NSUserActivity *)userActivity withSingularLinkHandler:(void (^)(SingularLinkParams *))handler andSupportedDomains:(NSArray *)domains __attribute__((deprecated));
+ (BOOL)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andUserActivity:(NSUserActivity *)userActivity withSingularLinkHandler:(void (^)(SingularLinkParams *))handler andShortLinkResolveTimeout:(long)timeoutSec andSupportedDomains:(NSArray *)domains __attribute__((deprecated));
+ (void)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andLaunchOptions:(NSDictionary *)launchOptions;
+ (void)startSession:(NSString *)apiKey withKey:(NSString *)apiSecret andLaunchURL:(NSURL *)url;
+ (void)reStartSession:(NSString *)apiKey withKey:(NSString *)apiSecret;
+ (BOOL)sessionStarted;
+ (void)endSession;

+ (void)event:(NSString *)name;
+ (void)event:(NSString *)name withArgs:(NSDictionary *)args;
+ (void)eventWithArgs:(NSString *)name, ...; // use only subclasses of
                                             // NSObject, not primitive types
                                             // like int
+ (void)setDeviceCustomUserId:(NSString *)customUserId;

+ (void)registerDeviceTokenForUninstall:(NSData *)deviceToken;
+ (void)registerDeferredDeepLinkHandler:(void (^)(NSString *deeplink))handler;
+ (int)setDeferredDeepLinkTimeout:(int)duration;

+ (Singular *)shared;
+ (NSTimeInterval)sessionDuration;
+ (NSDate *)sessionStartDate;
+ (NSString *)sessionID;
+ (NSString *)version;
+ (NSString *)singularID;
+ (NSString *)singularKeyspace;
+ (void)setBufferLimit:(int)size;
@property (strong, nonatomic, readonly) NSString *applicationName;
@property (strong, nonatomic, readonly) NSString *applicationIdentifier;
+ (BOOL)processJSRequestWK:(WKWebView *)webView withURL:(NSURLRequest *)url;
@property (nonatomic) int minSessionDuration;  // Default: 5
+ (void)setMinSessionDuration:(int)seconds;

#pragma mark - IAP
+ (void)initializeApStore;
+ (void)setAllowAutoIAPComplete:(BOOL)boolean;
+ (void)iapComplete:(id)transaction;
+ (void)iapComplete:(id)transaction withName:(NSString *)name;
+ (void)iapComplete:(id)transaction withAttributes:(id)value, ...;
+ (void)iapComplete:(id)transaction withName:(NSString *)name withAttributes:(id)value, ...;

#pragma mark - DEMO
+ (void)setGender:(NSString *)gender;
+ (void)setAge:(id)age;

#pragma mark - BATCHING
+ (int)batchInterval __attribute__((deprecated));
+ (void)setBatchInterval:(int)interval __attribute__((deprecated));
+ (BOOL)batchesEvents __attribute__((deprecated));
+ (void)setBatchesEvents:(BOOL)boolean __attribute__((deprecated));
+ (void)sendAllBatches __attribute__((deprecated));

#pragma mark - ANIMESH UPDATE / REVENUE
+ (void)revenue:(id)transaction;
+ (void)revenue:(id)transaction withAttributes:(NSDictionary *)attributes;
+ (void)revenue:(NSString *)currency amount:(double)amount;
+ (void)revenue:(NSString *)currency amount:(double)amount withAttributes:(NSDictionary *)attributes;
+ (void)revenue:(NSString *)currency amount:(double)amount productSKU:(NSString *)productSKU productName:(NSString *)productName productCategory:(NSString *)productCategory productQuantity:(int)productQuantity productPrice:(double)productPrice;

+ (void)customRevenue:(NSString *)eventname transaction:(id)transaction;
+ (void)customRevenue:(NSString *)eventname transaction:(id)transaction withAttributes:(NSDictionary *)attributes;
+ (void)customRevenue:(NSString *)eventname currency:(NSString *)currency amount:(double)amount;
+ (void)customRevenue:(NSString *)eventname currency:(NSString *)currency amount:(double)amount withAttributes:(NSDictionary *)attributes;
+ (void)customRevenue:(NSString *)eventname currency:(NSString *)currency amount:(double)amount productSKU:(NSString *)productSKU productName:(NSString *)productName productCategory:(NSString *)productCategory productQuantity:(int)productQuantity productPrice:(double)productPrice;

+ (void)customRevenue:(NSData *)transactionJsonRepresentation productJsonRepresentation:(NSData *)productJsonRepresentation;
+ (void)customRevenue:(NSString *)eventName transactionJsonRepresentation:(NSData *)transactionJsonRepresentation productJsonRepresentation:(NSData *)productJsonRepresentation;

+ (void)setCustomUserId:(NSString *)customUserId;
+ (void)unsetCustomUserId;

+ (void)setSessionTimeout:(int)timeout;
+ (NSInteger)getFirstSessionUnixTime;

+ (void)setWrapperName:(NSString *)name andVersion:(NSString *)version;

#pragma mark - Global Properties

+ (NSDictionary *)getGlobalProperties;
+ (BOOL)setGlobalProperty:(NSString *)key andValue:(NSString *)value overrideExisting:(BOOL)overrideExisting;
+ (void)unsetGlobalProperty:(NSString *)key;
+ (void)clearGlobalProperties;

#pragma mark - GDPR helpers

+ (void)trackingOptIn;
+ (void)trackingUnder13;
+ (void)stopAllTracking;
+ (void)resumeAllTracking;
+ (BOOL)isAllTrackingStopped;
+ (void)limitDataSharing:(BOOL)shouldLimitDataSharing;
+ (BOOL)getLimitDataSharing;

#pragma mark - SKAN Methods

+ (void)skanRegisterAppForAdNetworkAttribution;
+ (BOOL)skanUpdateConversionValue:(NSInteger)conversionValue;
+ (void)skanUpdateConversionValue:(NSInteger)conversionValue coarse:(NSInteger)coarse lock:(BOOL)lock;
+ (NSNumber *)skanGetConversionValue;

#pragma mark - Singular Links

+ (BOOL)isSingularLink:(id)linkHolder;

#pragma mark - Admon Methods

+ (void)adRevenue:(SingularAdData *)adData;

#pragma mark - Referrer Links

+ (void)createReferrerShortLink:(NSString *)baseLink
                   referrerName:(NSString *)referrerName
                     referrerId:(NSString *)referrerId
              completionHandler:(void (^)(NSString *, NSError *))completionHandler;

+ (void)createReferrerShortLink:(NSString *)baseLink
                   referrerName:(NSString *)referrerName
                     referrerId:(NSString *)referrerId
              passthroughParams:(NSDictionary *)passthroughParams
              completionHandler:(void (^)(NSString *, NSError *))completionHandler;


@end
