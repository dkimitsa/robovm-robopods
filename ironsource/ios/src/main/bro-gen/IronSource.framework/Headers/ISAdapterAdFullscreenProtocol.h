//
//  ISAdapterAdFullscreenProtocol.h
//  IronSource
//
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ISAdData.h"
#import "ISAdapterAdInteractionDelegate.h"

@protocol ISAdapterAdFullscreenProtocol <NSObject>

/// load the ad
/// @param adData data containing the configuration passed from the server and other related
/// parameters passed from the publisher like userId
/// @param delegate the delegate to return mandatory callbacks based on the network - load success,
/// load failure, ad opened, ad closed, show failed optional callbacks - show success, clicked
- (void)loadAdWithAdData:(ISAdData *)adData delegate:(id<ISAdapterAdDelegate>)delegate;

/// show the ad
/// @param viewController  current viewController for showing the ad
/// @param adData data containing the configuration passed from the server and other related
/// parameters passed from the publisher like userId
/// @param delegate the callback listener
- (void)showAdWithViewController:(UIViewController *)viewController
                          adData:(ISAdData *)adData
                        delegate:(id<ISAdapterAdInteractionDelegate>)delegate;

/// returning whether the ad is available or not
/// @param adData data containing the configuration passed from the server and other related
/// parameters passed from the publisher like userId
- (BOOL)isAdAvailableWithAdData:(ISAdData *)adData;

/// dispose the ad
- (void)disposeAd;

@end
