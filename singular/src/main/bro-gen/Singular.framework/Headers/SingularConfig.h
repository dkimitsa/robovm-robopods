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

#if !defined(SINGULAR_KIDS) && __has_include("SingularUserDetails.h")
#define SINGULAR_HAS_USER_DETAILS 1
#import "SingularUserDetails.h"
#endif

@interface SingularConfig : NSObject

// General Fields
@property (strong) NSString *apikey;
@property (strong) NSString *secret;

/// @warning Setting this to @c YES will read @c UIPasteboard synchronously
/// thus block the calling thread until the read completes.
/// set it off the main thread or expect the calling thread to stall.
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
#ifndef SINGULAR_KIDS
@property (assign) BOOL limitAdvertisingIdentifiers;
#endif // !SINGULAR_KIDS

#ifdef SINGULAR_HAS_USER_DETAILS
@property (strong) SingularUserDetails *userDetails;
#endif // SINGULAR_HAS_USER_DETAILS

// Push Notifications fields
@property (strong) NSDictionary *pushNotificationPayload;
@property (strong) NSArray<NSArray<NSString*>*> *pushNotificationLinkPath;

// Google ODM fields
@property (assign) NSInteger enableOdmWithTimeoutInterval; // in Seconds

// Logging fields
@property (assign) BOOL enableLogging;
@property (assign) SingularLogLevel logLevel;

-(id)initWithApiKey:(NSString*)apikey andSecret:(NSString*)secret;

-(void)setGlobalProperty:(NSString*)key withValue:(NSString*)value overrideExisting:(BOOL)overrideExisting;
-(NSString*)toJsonString;

//Test for app extension
@property (assign) BOOL supportAppExtension;
@property (strong) NSString *appGroupName;

@end
