//
// Created by Tenjin on 2019-05-20.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <SystemConfiguration/SystemConfiguration.h>
#import "TenjinIAPHelper.h"
#import "TenjinConfig.h"
#import "PersistedFileStore.h"
#import "DataStore.h"

@class SKPaymentTransaction;
@class TJNHTTPClient;
@class TenjinRepository;
@class RequestHelper;
@class GDPRHelper;

@protocol TJNRequestSender;
@protocol SKProductsRequestDelegate;


@interface TenjinImpl : NSObject <NSURLConnectionDelegate, SKProductsRequestDelegate>

//TODO: remove serial queue and manage attribution retries with NSOperation instances
@property(nonatomic, strong) dispatch_queue_t serialQueue;
@property(atomic, assign) BOOL hasCheckedAttribution;

//TODO:move deferredDeeplink into attribution params
@property(nonatomic, strong) NSString *deferredDeeplink;

//launch URL the app was opened with, sent up as open_deeplink_url; cleared once delivered
@property(atomic, copy) NSString *openDeeplinkUrl;

@property int productQuantity;
@property NSData *receipt;
@property NSString *transactionIdentifier;

@property(nonatomic, readonly) TenjinConfig *config;
@property(nonatomic, strong) id<DataStore> dataStore;
@property(nonatomic, strong) id <TJNRequestSender> httpClient;
@property NSString *apiToken;

@property(nonatomic, strong) NSNumber *appSubversion;

+ (void)setWrappedVersion:(NSString *)version;
+ (void)setPlugin:(NSString *)plugin version:(NSString *)version;
+ (NSString*)getPlugin;
+ (NSString*)getPluginVersion;

- (instancetype) init NS_UNAVAILABLE;

- (id)initWithToken:(NSString *)apiToken
    andSharedSecret:(NSString *)secret
   andAppSubversion:(NSNumber *)subversion
               ping:(BOOL)ping
      requestSender:(id <TJNRequestSender>)sender NS_DESIGNATED_INITIALIZER;

- (id)initWithToken:(NSString *)apiToken
    andSharedSecret:(NSString *)secret
   andAppSubversion:(NSNumber *)subversion
               ping:(BOOL)ping;

- (void)setup;

- (void)ping;

- (void)pingWithDeferredDeeplink:(NSURL *)url;

- (void)handleOpenURL:(NSURL *)url NS_SWIFT_NAME(handleOpenURL(_:));

- (void)handleOpenURLString:(NSString *)urlString NS_SWIFT_NAME(handleOpenURLString(_:));

- (NSString *)claimOpenDeeplinkUrl;

- (void)restoreOpenDeeplinkUrl:(NSString *)urlString;

- (void)pingEventWithName:(NSString *)eventName;

- (void)pingEventWithName:(NSString *)eventName
          andIntegerValue:(NSInteger)eventInteger;

- (void)transaction:(SKPaymentTransaction *)transaction __attribute__((deprecated));

- (void)transactionWithProductName:(NSString *)productName
                   andCurrencyCode:(NSString *)currencyCode
                       andQuantity:(NSInteger)quantity
                      andUnitPrice:(NSDecimalNumber *)price;

- (NSMutableDictionary *)deviceDataWithEvent:(NSString *)eventName;

- (NSMutableDictionary *)deviceDataWithEvent:(NSString *)eventName
                             openDeeplinkUrl:(NSString *)openDeeplinkUrl;

- (void)optOut;

- (void)optIn;

- (bool)optInOutUsingCMP;

- (void)optOutGoogleDMA;

- (void)optInGoogleDMA;

- (void)optOutOfParams:(NSArray *)paramKeys;

- (void)optInToParams:(NSArray *)paramKeys;


- (void)transaction:(SKPaymentTransaction *)transaction
         andReceipt:(NSData *)receipt;

- (void)transactionWithProductName:(NSString *)productName
                   andCurrencyCode:(NSString *)currencyCode
                       andQuantity:(NSInteger)quantity
                      andUnitPrice:(NSDecimalNumber *)price
                  andTransactionId:(NSString *)transactionId
                        andReceipt:(NSData *)receipt;

- (void)transactionWithProductName:(NSString *)productName
                   andCurrencyCode:(NSString *)currencyCode
                       andQuantity:(NSInteger)quantity
                      andUnitPrice:(NSDecimalNumber *)price
                  andTransactionId:(NSString *)transactionId
                  andBase64Receipt:(NSString *)receipt;

- (void)subscriptionWithParams:(NSDictionary *)subscriptionParams;

- (void)handleSubscriptionPurchase:(SKPaymentTransaction *)transaction;

- (void)trackConversionValue:(int)conversionValue
                 coarseValue:(NSString*)coarseValue
                  lockWindow:(BOOL)lockWindow
               hasLockWindow:(BOOL)hasLockWindow;

- (void)setValue:(NSString *)value
          forKey:(NSString *)key;

- (void)getAttributionInfo:(void (^)(NSDictionary *attributionInfo, NSError *error))completionHandler;

- (void)setCustomerUserId:(NSString *)userId;

- (NSString *)getCustomerUserId;

- (void)setCacheEventSetting:(BOOL)isCacheEventsEnabled;

- (void)setEncryptRequestsSetting:(BOOL)isEncryptRequestsEnable;

- (NSString*)getAnalyticsInstallationId;

+ (void)setGoogleDMAParametersWithAdPersonalization:(BOOL)adPersonalization adUserData:(BOOL)adUserData;

+ (TenjinImpl *)sharedInstance;

#ifdef DEBUG
@property(nonatomic, strong) NSString *debugIdfaString;
@property(nonatomic, strong) NSString *debugDeviceString;
@property(nonatomic, strong) NSString *debugIdfvString;
#endif

@end
