//
//  ISBannerAdapterProtocol.h
//  IronSource
//
//  Created by Pnina Rapoport on 02/04/2017.
//  Copyright © 2017 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "ISAdUnitAdapterProtocol.h"
#import "ISBannerAdapterDelegate.h"
#import "ISBannerSize.h"
#import "ISBiddingDataDelegate.h"

@class ISAdapterConfig;
@protocol ISBannerAdapterProtocol <ISAdUnitAdapterProtocol>

@optional

#pragma mark - for bidders, non bidders and demand only

- (void)destroyBannerWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

- (CGFloat)getAdaptiveHeightWithWidth:(CGFloat)width;

#pragma mark - for non bidders

- (void)initBannerWithUserId:(NSString *)userId
               adapterConfig:(ISAdapterConfig *)adapterConfig
                    delegate:(id<ISBannerAdapterDelegate>)delegate;

- (void)loadBannerWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                             adData:(NSDictionary *)adData
                     viewController:(UIViewController *)viewController
                               size:(ISBannerSize *)size
                           delegate:(id<ISBannerAdapterDelegate>)delegate;

#pragma mark - for bidders and demand only

- (NSDictionary *)getBannerBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                                 adData:(NSDictionary *)adData;

- (void)collectBannerBiddingDataWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                           adData:(NSDictionary *)adData
                                         delegate:(id<ISBiddingDataDelegate>)delegate;

- (void)initBannerForBiddingWithUserId:(NSString *)userId
                         adapterConfig:(ISAdapterConfig *)adapterConfig
                              delegate:(id<ISBannerAdapterDelegate>)delegate;

// used for banner, bidders + non-bidders(one-flow) for demand only
- (void)loadBannerForBiddingWithAdapterConfig:(ISAdapterConfig *)adapterConfig
                                       adData:(NSDictionary *)adData
                                   serverData:(NSString *)serverData
                               viewController:(UIViewController *)viewController
                                         size:(ISBannerSize *)size
                                     delegate:(id<ISBannerAdapterDelegate>)delegate;

@end
