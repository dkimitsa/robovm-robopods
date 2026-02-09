//
// Created by Tenjin on 2016-05-20.
//  Version 88.88.8008
//  Copyright (c) 2016 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <StoreKit/StoreKit.h>

@class TJNUserProfileData;

@interface TenjinSDK : NSObject

#pragma mark Initialization

- (instancetype)init NS_UNAVAILABLE;

// initialize the Tenjin SDK
+ (TenjinSDK *)init:(NSString *)apiToken __deprecated_msg("use `initialize`");

//initialize the Tenjin SDK with shared secret
+ (TenjinSDK *)init:(NSString *)apiToken
    andSharedSecret:(NSString *)secret __deprecated_msg("use `initialize`");

//initialize the Tenjin SDK with app subversion
+ (TenjinSDK *)init:(NSString *)apiToken
   andAppSubversion:(NSNumber *)subversion __deprecated_msg("use `initialize`");

//initialize the Tenjin SDK with shared secret and app subversion
+ (TenjinSDK *)init:(NSString *)apiToken
    andSharedSecret:(NSString *)secret
   andAppSubversion:(NSNumber *)subversion __deprecated_msg("use `initialize`");

// initialize the Tenjin SDK
+ (TenjinSDK *)initialize:(NSString *)apiToken;

//initialize the Tenjin SDK with shared secret
+ (TenjinSDK *)initialize:(NSString *)apiToken
          andSharedSecret:(NSString *)secret;

//initialize the Tenjin SDK with app subversion
+ (TenjinSDK *)initialize:(NSString *)apiToken
         andAppSubversion:(NSNumber *)subversion;

//initialize the Tenjin SDK with shared secret and app subversion
+ (TenjinSDK *)initialize:(NSString *)apiToken
          andSharedSecret:(NSString *)secret
         andAppSubversion:(NSNumber *)subversion;

- (id)initWithToken:(NSString *)apiToken
    andSharedSecret:(NSString *)secret
   andAppSubversion:(NSNumber *)subversion
andDeferredDeeplink:(NSURL *)url
               ping:(BOOL)ping NS_DESIGNATED_INITIALIZER;

#pragma mark Singleton access

// initialize the Tenjin SDK
+ (TenjinSDK *)getInstance:(NSString *)apiToken;

//initialize the Tenjin SDK with shared secret
+ (TenjinSDK *)getInstance:(NSString *)apiToken
           andSharedSecret:(NSString *)secret;

//initialize the Tenjin SDK with app subversion
+ (TenjinSDK *)getInstance:(NSString *)apiToken
          andAppSubversion:(NSNumber *)subversion;

//initialize the Tenjin SDK with shared secret and app subversion
+ (TenjinSDK *)getInstance:(NSString *)apiToken
           andSharedSecret:(NSString *)secret
          andAppSubversion:(NSNumber *)subversion;

//initialize the Tenjin SDK + connect
+ (TenjinSDK *)sharedInstanceWithToken:(NSString *)apiToken __deprecated_msg("use `init` and `connect`");

//initialize the Tenjin SDK + connect with a third party deeplink
+ (TenjinSDK *)sharedInstanceWithToken:(NSString *)apiToken
                   andDeferredDeeplink:(NSURL *)url __deprecated_msg("use `init` and `connectWithDeferredDeeplink`");

//returns the shared Tenjin SDK instance
+ (TenjinSDK *)sharedInstance;

#pragma mark - Functionality

//use connect to send connect call. sharedInstanceWithToken automatically does a connect
+ (void)connect;

//use connect to send connect call. sharedInstanceWithToken automatically does a connect
+ (void)connectWithDeferredDeeplink:(NSURL *)url;

//use sendEventWithName for custom event names
+ (void)sendEventWithName:(NSString *)eventName;

//This method is deprecated in favor of [sendEventWithName: andValue:], so you can pass an integer directly
+ (void)sendEventWithName:(NSString *)eventName
            andEventValue:(NSString *)eventValue __deprecated_msg("use `sendEventWithName: andValue:` instead");

//Use this method to send custom events with values
+ (void)sendEventWithName:(NSString *)eventName
            andValue:(NSInteger)eventValue;

//This method is deprecated in favor of [transaction: andReceipt:], so Tenjin can verify your transactions
+ (void)transaction:(SKPaymentTransaction *)transaction __attribute__((deprecated));

//Use this method to submit a transaction to Tenjin, we will also attempt to verify it for our records
+ (void)transaction:(SKPaymentTransaction *)transaction
         andReceipt:(NSData *)receipt;

//use transactionWithProductName... when you don't use Apple's SKPaymentTransaction and need to pass revenue directly
+ (void)transactionWithProductName:(NSString *)productName
                   andCurrencyCode:(NSString *)currencyCode
                       andQuantity:(NSInteger)quantity
                      andUnitPrice:(NSDecimalNumber *)price;

//use transactionWithProductName...when you don't use Apple's SKPaymentTransaction and need to pass revenue directly with a NSData binary receipt
+ (void)transactionWithProductName:(NSString *)productName
                   andCurrencyCode:(NSString *)currencyCode
                       andQuantity:(NSInteger)quantity
                      andUnitPrice:(NSDecimalNumber *)price
                  andTransactionId:(NSString *)transactionId
                        andReceipt:(NSData *)receipt;

//use this method when you want to pass in a base64 receipt instead of a NSData receipt
+ (void)transactionWithProductName:(NSString *)productName
                   andCurrencyCode:(NSString *)currencyCode
                       andQuantity:(NSInteger)quantity
                      andUnitPrice:(NSDecimalNumber *)price
                  andTransactionId:(NSString *)transactionId
                  andBase64Receipt:(NSString *)receipt;

//use this method to register the attribution callback
- (void)registerDeepLinkHandler:(void (^)(NSDictionary *params, NSError *error))deeplinkHandler;

//notify Tenjin of a new subscription purchase
- (void)handleSubscriptionPurchase:(SKPaymentTransaction *)transaction;

// GDPR opt-out
+ (void)optOut;

// GDPR opt-in
+ (void)optIn;

// GDPR opt-out of list of params
+ (void)optOutParams:(NSArray *)params;

// GDPR opt-in with list of params
+ (void)optInParams:(NSArray *)params;

// GDPR opt-in/opt-out through CMP consents
+ (bool)optInOutUsingCMP;

// Opt out from Google DMA parameters (opted in by default)
+ (void)optOutGoogleDMA;

// Opt out from Google DMA parameters
+ (void)optInGoogleDMA;

// Appends app subversion to app version
+ (void)appendAppSubversion:(NSNumber *)subversion;

// deprecated
+ (void)updateSkAdNetworkConversionValue:(int)conversionValue __deprecated_msg("use `updatePostbackConversionValue:`");

//deprecated
+ (void)updateConversionValue:(int)conversionValue __deprecated_msg("use `updatePostbackConversionValue:`");

// Update conversion value
+ (void)updatePostbackConversionValue:(int)conversionValue;

// Update conversion value and coarse value (iOS 16.1+)
+ (void)updatePostbackConversionValue:(int)conversionValue
                          coarseValue:(NSString*)coarseValue;

// Update conversion value, coarse value and lock window (iOS 16.1+)
+ (void)updatePostbackConversionValue:(int)conversionValue
                          coarseValue:(NSString*)coarseValue
                           lockWindow:(BOOL)lockWindow;

// Set customer user id to send as parameter on each event request
+ (void)setCustomerUserId:(NSString *)userId;

// Get customer user id saved on the device
+ (NSString *)getCustomerUserId;

// Set the setting to enable/disable cache events and retrying, it's false by default
+ (void)setCacheEventSetting:(BOOL)isCacheEventsEnabled;

// Set the setting to enable/disable ecrypting requests, it's false by default
+ (void)setEncryptRequestsSetting:(BOOL)isEncryptRequestsEnabled;

// Get cached analytics_installation_id
+ (NSString*)getAnalyticsInstallationId;

#pragma mark User Profile

+ (TJNUserProfileData *)getUserProfile;

+ (NSDictionary *)getUserProfileAsDictionary;

+ (void)resetUserProfile;

#pragma mark Util

+ (void)verboseLogs;

+ (void)debugLogs;

+ (void)setLogHandler:(void (^)(NSString *))handler;

+ (NSString *)sdkVersion;

+ (void)setWrapperVersion:(NSString *)wrapperVersion;

+ (void)setValue:(NSString *)value
          forKey:(NSString *)key;

//deprecated
+ (void)registerAppForAdNetworkAttribution __deprecated_msg("use `updatePostbackConversionValue:`");

+ (void)requestTrackingAuthorizationWithCompletionHandler:(void (^)(NSUInteger status))completion;

- (void)getAttributionInfo:(void (^)(NSDictionary *attributionInfo, NSError *error))completionHandler;

- (void)setGoogleDMAParametersWithAdPersonalization:(BOOL)adPersonalization adUserData:(BOOL)adUserData;

@end
