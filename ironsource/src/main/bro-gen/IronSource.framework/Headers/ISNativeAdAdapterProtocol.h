//
//  ISNativeAdAdapterProtocol.h
//  IronSource
//
//  Created by Hadar Pur on 06/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdUnitAdapterProtocol.h"
#import "ISBiddingDataDelegate.h"
#import "ISNativeAdAdapterDelegate.h"

@protocol ISNativeAdAdapterProtocol <ISAdUnitAdapterProtocol>

@optional

- (void)initNativeAdsWithUserId:(NSString *)userId
                  adapterConfig:(ISAdapterConfig *)adapterConfig
                       delegate:(id<ISNativeAdAdapterDelegate>)delegate;

- (void)initNativeAdForBiddingWithUserId:(NSString *)userId
                           adapterConfig:(ISAdapterConfig *)adapterConfig
                                delegate:(id<ISNativeAdAdapterDelegate>)delegate;

- (void)loadNativeAdWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                               adData:(NSDictionary *)adData
                       viewController:(UIViewController *)viewController
                             delegate:(id<ISNativeAdAdapterDelegate>)delegate;

- (void)loadNativeAdForBiddingWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                         adData:(NSDictionary *)adData
                                     serverData:(NSString *)serverData
                                 viewController:(UIViewController *)viewController
                                       delegate:(id<ISNativeAdAdapterDelegate>)delegate;

- (void)destroyNativeAdWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

- (NSDictionary *)getNativeAdBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                   adData:(NSDictionary *)adData;

- (void)collectNativeAdBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                             adData:(NSDictionary *)adData
                                           delegate:(id<ISBiddingDataDelegate>)delegate;

@end
