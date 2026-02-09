//
//  ISInterstitialAdapterDelegate.h
//  IronSource
//
//  Created by Roni Parshani on 10/12/14.
//  Copyright (c) 2014 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol ISInterstitialAdapterDelegate <NSObject>

- (void)adapterInterstitialInitSuccess;
- (void)adapterInterstitialInitSuccessWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialInitFailedWithError:(NSError *)error;
- (void)adapterInterstitialInitFailedWithError:(NSError *)error
                                     extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialDidLoad;
- (void)adapterInterstitialDidLoadWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialDidFailToLoadWithError:(NSError *)error;
- (void)adapterInterstitialDidFailToLoadWithError:(NSError *)error
                                        extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialDidOpen;
- (void)adapterInterstitialDidOpenWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialDidClose;
- (void)adapterInterstitialDidCloseWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialDidShow;
- (void)adapterInterstitialDidShowWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterInterstitialDidFailToShowWithError:(NSError *)error;
- (void)adapterInterstitialDidFailToShowWithError:(NSError *)error
                                        extraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark - optional - when supported by network

- (void)adapterInterstitialDidClick;
- (void)adapterInterstitialDidClickWithExtraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark - relevant only for ironSource adapter

- (void)adapterInterstitialDidBecomeVisible;
- (void)adapterInterstitialDidBecomeVisibleWithExtraData:(NSDictionary<NSString *, id> *)extraData;

@end
