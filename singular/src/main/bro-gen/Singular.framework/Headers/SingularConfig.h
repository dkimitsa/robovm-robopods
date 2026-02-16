//
//  SingularConfig.h
//  Singular
//
//  Copyright © 2010-2024 Singular Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "SingularLogLevel.h"

// avoid circular include of SingularLinkParams
#ifndef SingularLinkParams
#import "SingularLinkParams.h"
#endif

@interface SingularConfig : NSObject

// General Fields
@property (strong) NSString *apikey;
@property (strong) NSString *secret;
@property (assign) BOOL clipboardAttribution;

// Singular Links fields
@property (strong) NSDictionary *launchOptions;
@property (strong) NSUserActivity *userActivity;
@property (strong) NSURL *openUrl;
@property (copy) void(^singularLinksHandler)(SingularLinkParams*);
@property (assign) long shortLinkResolveTimeOut;
@property (strong) NSArray *supportedDomains __attribute__((deprecated));
@property (strong) NSArray *espDomains;
@property (strong) NSArray *brandedDomains;

// Global Properties fields
@property (readonly) NSMutableDictionary *globalProperties;

// SKAN fields
@property (assign) BOOL skAdNetworkEnabled;
@property (assign) BOOL manualSkanConversionManagement;
@property (copy) void(^conversionValueUpdatedCallback)(NSInteger);
@property (copy) void(^conversionValuesUpdatedCallback)(NSNumber *, NSNumber *, BOOL);
@property (assign) NSInteger waitForTrackingAuthorizationWithTimeoutInterval;
@property (copy) void(^deviceAttributionCallback)(NSDictionary *);

// SDID - Singular Device Identifier
typedef void (^SdidAccessorHandler)(NSString *result);
@property (strong) NSString *customSdid;
@property (copy) SdidAccessorHandler didSetSdidHandler;
@property (copy) SdidAccessorHandler sdidReceivedHandler;

// Limit Advertising Identifiers
@property (assign) BOOL limitAdvertisingIdentifiers;

// Push Notifications fields
@property (strong) NSDictionary *pushNotificationPayload;
@property (strong) NSArray<NSArray<NSString*>*> *pushNotificationLinkPath;

// Google ODM fields
@property (assign) NSInteger enableOdmWithTimeoutInterval; // in Seconds

// Logging fields
@property (assign) BOOL enableLogging;
@property (assign) SingularLogLevel logLevel;

-(id)initWithApiKey:(NSString*)apikey andSecret:(NSString*)secret;

-(void)setGlobalProperty:(NSString*)key withValue:(NSString*)value overrideExisting:(BOOL)overrideExisiting;
-(NSString*)toJsonString;

//Test for app extension
@property (assign) BOOL supportAppExtension;
@property (strong) NSString *appGroupName;

@end
