//
//  ISBaseInterstitial.h
//  IronSource
//
//  Created by Bar David on 24/10/2021.
//  Copyright © 2021 IronSource. All rights reserved.
//

#import "ISBaseAdInteractionAdapter.h"

NS_ASSUME_NONNULL_BEGIN

@protocol ISInterstitialAdDelegate <ISAdapterAdInteractionDelegate>

@end

@interface ISBaseInterstitial : ISBaseAdInteractionAdapter

/// @param providerConfig the configuration relevant for the adapter instance
- (instancetype)init:(ISAdapterConfig *)providerConfig;

/// load the ad
/// @param adData data containing the configuration passed from the server and other related
/// parameters passed from the publisher like userId
/// @param delegate the delegate to return mandatory callbacks based on the network - load success,
/// load failure
- (void)loadAdWithAdData:(ISAdData *)adData delegate:(id<ISInterstitialAdDelegate>)delegate;

/// show the ad
/// @param viewController  current viewController for showing the ad
/// @param adData data containing the configuration passed from the server and other related
/// parameters passed from the publisher like userId
/// @param delegate the delegate to return mandatory callbacks based on the network - ad opened, ad
/// closed, show failed optional callbacks - show success, ad clicked
- (void)showAdWithViewController:(UIViewController *)viewController
                          adData:(ISAdData *)adData
                        delegate:(id<ISInterstitialAdDelegate>)delegate;

@end

NS_ASSUME_NONNULL_END
