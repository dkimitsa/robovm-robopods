//
//  ISBaseBanner.h
//  IronSource
//
//  Created by Guy Lis on 27/03/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdapterAdViewDelegate.h"
#import "ISAdapterBannerProtocol.h"
#import "ISBannerAdDelegate.h"
#import "ISBaseAdAdapter.h"
NS_ASSUME_NONNULL_BEGIN

@interface ISBaseBanner : ISBaseAdAdapter <ISAdapterBannerProtocol>

/// @param providerConfig the configuration relevant for the adapter instance
- (instancetype)init:(ISAdapterConfig *)providerConfig;

/**
 * load the ad
 *
 * @param adData data containing the configuration passed from the server and other related
 * parameters passed from the publisher like userId
 * @param viewController the application view controller
 * @param size the banner size the ad will be presented on
 * @param delegate the callback listener to return
 * mandatory callbacks based on the network - load success, load failure, ad opened
 * optional callbacks - clicked, left application, presented, dismissed
 */
- (void)loadAdWithAdData:(nonnull ISAdData *)adData
          viewController:(nonnull UIViewController *)viewController
                    size:(nonnull ISBannerSize *)size
                delegate:(nonnull id<ISBannerAdDelegate>)delegate;

/**
 * destroy the ad
 *
 * @param adData - data containing the configuration passed from the server and other related
 * parameters passed from the publisher like userId
 */
- (void)destroyAdWithAdData:(nonnull ISAdData *)adData;

@end

NS_ASSUME_NONNULL_END
