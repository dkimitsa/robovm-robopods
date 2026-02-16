//
//  ISNLoaderInterstitial.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAInterstitialAdLoaderDelegate.h"
#import "ISAInterstitialAdRequest.h"

NS_ASSUME_NONNULL_BEGIN

/**
 Class responsible for loading interstitial ads.
 */
@interface ISAInterstitialAdLoader : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Loads an interstitial ad.
 The delegate will send a `interstitialAdDidLoad:` or
 `interstitialAdDidFailToLoadWithError:` callback.

 @param adRequest The request configuration for the ad to be loaded.
 @param delegate The delegate to be notified of ad loading callbacks. The callbacks will be invoked
 on the main thread. The delegate is held weakly.
 */
+ (void)loadAdWithAdRequest:(ISAInterstitialAdRequest *)adRequest
                   delegate:(id<ISAInterstitialAdLoaderDelegate>)delegate;

@end

NS_ASSUME_NONNULL_END
