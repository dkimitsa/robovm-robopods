//
//  SingularConfig.h
//  Singular
//
//  Copyright © 2010-2024 Singular Inc. All rights reserved.
//

#import <Foundation/Foundation.h>

// avoid circular include of SingularLinkParams
#ifndef SingularLinkParams
#import "SingularLinkParams.h"
#endif

@interface SingularConfig : NSObject

// General Fields
@property NSString* apikey;
@property NSString* secret;
@property BOOL clipboardAttribution;

// Singular Links fields
@property NSDictionary *launchOptions;
@property NSUserActivity* userActivity;
@property NSURL* openUrl;
@property void(^singularLinksHandler)(SingularLinkParams*);
@property long shortLinkResolveTimeOut;
@property NSArray* supportedDomains __attribute__((deprecated));
@property NSArray* espDomains;

// Global Properties fields
@property (readonly) NSMutableDictionary* globalProperties;

// SKAN fields
@property BOOL skAdNetworkEnabled;
@property BOOL manualSkanConversionManagement;
@property void(^conversionValueUpdatedCallback)(NSInteger);
@property void(^conversionValuesUpdatedCallback)(NSNumber *, NSNumber *, BOOL);
@property NSInteger waitForTrackingAuthorizationWithTimeoutInterval;
@property void(^deviceAttributionCallback)(NSDictionary *);

// SDID - Singular Device Identifier
typedef void (^SdidAccessorHandler)(NSString* result);
@property NSString *customSdid;
@property SdidAccessorHandler didSetSdidHandler;
@property SdidAccessorHandler sdidReceivedHandler;

-(id)initWithApiKey:(NSString*)apikey andSecret:(NSString*)secret;

-(void)setGlobalProperty:(NSString*)key withValue:(NSString*)value overrideExisting:(BOOL)overrideExisiting;
-(NSString*)toJsonString;

//Test for app extension
@property BOOL supportAppExtension;
@property NSString *appGroupName;

@end
