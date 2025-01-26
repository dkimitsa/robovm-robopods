//
//  ISInterstitialAdapterProtocol.h
//  IronSource
//
//  Created by Roni Parshani on 10/12/14.
//  Copyright (c) 2014 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "ISAdUnitAdapterProtocol.h"
#import "ISBiddingDataDelegate.h"
#import "ISInterstitialAdapterDelegate.h"

@class ISAdapterConfig;
@protocol ISInterstitialAdapterProtocol <ISAdUnitAdapterProtocol>

@optional

#pragma mark - for bidders, non bidders and demand only

- (void)showInterstitialWithViewController:(UIViewController *)viewController
                             adapterConfig:(ISAdapterConfig *)adapterConfig
                                  delegate:(id<ISInterstitialAdapterDelegate>)delegate;

- (BOOL)hasInterstitialWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

- (void)disposeInterstitialAdWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

#pragma mark - for non bidders and demand only

- (void)initInterstitialWithUserId:(NSString *)userId
                     adapterConfig:(ISAdapterConfig *)adapterConfig
                          delegate:(id<ISInterstitialAdapterDelegate>)delegate;

- (void)loadInterstitialWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                   adData:(NSDictionary *)adData
                                 delegate:(id<ISInterstitialAdapterDelegate>)delegate;

#pragma mark - for bidders and demand only

- (NSDictionary *)getInterstitialBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                       adData:(NSDictionary *)adData;

- (void)collectInterstitialBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                 adData:(NSDictionary *)adData
                                               delegate:(id<ISBiddingDataDelegate>)delegate;

- (void)initInterstitialForBiddingWithUserId:(NSString *)userId
                               adapterConfig:(ISAdapterConfig *)adapterConfig
                                    delegate:(id<ISInterstitialAdapterDelegate>)delegate;

- (void)loadInterstitialForBiddingWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                             adData:(NSDictionary *)adData
                                         serverData:(NSString *)serverData
                                           delegate:(id<ISInterstitialAdapterDelegate>)delegate;

@end
