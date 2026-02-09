//
//  ISBaseNativeAd.h
//  IronSourceSDK
//
//  Created by Ronit Epstein on 15/06/2025.
//  Copyright © 2025 Unity. All rights reserved.
//

#import "ISAdapterNativeAdProtocol.h"
#import "ISBaseAdAdapter.h"

@protocol ISNativeAdDelegate;
@class ISNativeAdProperties;

NS_ASSUME_NONNULL_BEGIN

@interface ISBaseNativeAd : ISBaseAdAdapter <ISAdapterNativeAdProtocol>

/// @param providerConfig the configuration relevant for the adapter instance
- (instancetype)init:(ISAdapterConfig *)providerConfig;

/**
 * load the ad
 *
 * @param adData data containing the configuration passed from the server and other related
 * parameters passed from the publisher like userId
 * @param viewController the application view controller
 * @param delegate the callback listener to return
 * mandatory callbacks based on the network - load success, load failure, ad opened
 * optional callbacks - clicked, left application, presented, dismissed
 */
- (void)loadAdWithAdData:(nonnull ISAdData *)adData
          viewController:(nonnull UIViewController *)viewController
                delegate:(nonnull id<ISNativeAdDelegate>)delegate;

/**
 * destroy the ad
 *
 * @param adData - data containing the configuration passed from the server and other related
 * parameters passed from the publisher like userId
 */
- (void)destroyAdWithAdData:(nonnull ISAdData *)adData;

/**
 * Get the native ad properties from the ad data.
 *
 * @param adData The ad data containing the native ad information.
 */
- (ISNativeAdProperties *)getNativeAdPropertiesWithAdData:(nonnull ISAdData *)adData;

@end

NS_ASSUME_NONNULL_END
