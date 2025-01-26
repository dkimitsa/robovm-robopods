//
//  ISRewardedVideoAdapterProtocol.h
//  IronSource
//
//  Created by Roni Parshani on 10/12/14.
//  Copyright (c) 2014 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "ISAdUnitAdapterProtocol.h"
#import "ISBiddingDataDelegate.h"
#import "ISRewardedVideoAdapterDelegate.h"

@class ISAdapterConfig;
@protocol ISRewardedVideoAdapterProtocol <ISAdUnitAdapterProtocol>

@optional

#pragma mark - for bidders, non bidders and demand only

- (BOOL)hasRewardedVideoWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

- (void)showRewardedVideoWithViewController:(UIViewController *)viewController
                              adapterConfig:(ISAdapterConfig *)adapterConfig
                                   delegate:(id<ISRewardedVideoAdapterDelegate>)delegate;

- (void)disposeRewardedVideoAdWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

#pragma mark - shared

- (void)initAndLoadRewardedVideoWithUserId:(NSString *)userId
                             adapterConfig:(ISAdapterConfig *)adapterConfig
                                    adData:(NSDictionary *)adData
                                  delegate:(id<ISRewardedVideoAdapterDelegate>)delegate;

- (void)initRewardedVideoForCallbacksWithUserId:(NSString *)userId
                                  adapterConfig:(ISAdapterConfig *)adapterConfig
                                       delegate:(id<ISRewardedVideoAdapterDelegate>)delegate;

#pragma mark - for non bidders

- (void)loadRewardedVideoWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                    adData:(NSDictionary *)adData
                                  delegate:(id<ISRewardedVideoAdapterDelegate>)delegate;

#pragma mark - for bidders

- (NSDictionary *)getRewardedVideoBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                        adData:(NSDictionary *)adData;

- (void)collectRewardedVideoBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                  adData:(NSDictionary *)adData
                                                delegate:(id<ISBiddingDataDelegate>)delegate;

- (void)loadRewardedVideoForBiddingWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                              adData:(NSDictionary *)adData
                                          serverData:(NSString *)serverData
                                            delegate:(id<ISRewardedVideoAdapterDelegate>)delegate;

#pragma mark - for demand only

- (void)initRewardedVideoForDemandOnlyWithUserId:(NSString *)userId
                                   adapterConfig:(ISAdapterConfig *)adapterConfig
                                        delegate:(id<ISRewardedVideoAdapterDelegate>)delegate;

- (void)loadRewardedVideoForDemandOnlyWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                               delegate:
                                                   (id<ISRewardedVideoAdapterDelegate>)delegate;

- (void)loadRewardedVideoForDemandOnlyForBiddingWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                       serverData:(NSString *)serverData
                                                         delegate:
                                                             (id<ISRewardedVideoAdapterDelegate>)
                                                                 delegate;

@end
