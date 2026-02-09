//
//  ISAdapterBannerProtocol.h
//  IronSource
//
//  Created by Guy Lis on 27/03/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdData.h"
#import "ISBannerAdDelegate.h"
#import "ISBannerSize.h"

@protocol ISAdapterBannerProtocol <NSObject>

/**
 * load the ad
 *
 * @param adData data containing the configuration passed from the server and other related
 * parameters passed from the publisher like userId
 * @param viewController the application view controller
 * @param size  the banner size the ad will be presented on
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

- (BOOL)isSupportAdaptiveBanner;

@end
