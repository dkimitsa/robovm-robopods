//
//  ISAdapterBaseInterface.h
//  IronSource
//
//  Created by Yonti Makmel on 27/04/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//
#import "ISAdData.h"
#import "ISNetworkInitializationDelegate.h"

#ifndef ISAdapterBaseProtocol_h
#define ISAdapterBaseProtocol_h

@protocol ISAdapterBaseProtocol <NSObject>

/// initializes the network
/// @param adData data containing the configuration passed from the server and other related
/// parameters passed from the publisher like userId
/// @param delegate the delegate to return whether the initialization was a success or failure
- (void)init:(ISAdData*)adData delegate:(id<ISNetworkInitializationDelegate>)delegate;

/// returns the network SDK version
- (NSString*)networkSDKVersion;

/// returns the adapter version
- (NSString*)adapterVersion;

@end

#endif /* ISAdapterBaseInterface_h */
