//
//  ISAdapterNativeAdProtocol.h
//  IronSource
//
//  Created by Hadar Pur on 28/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdData.h"
#import "ISNativeAdDelegate.h"

@protocol ISAdapterNativeAdProtocol <NSObject>

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

@end
