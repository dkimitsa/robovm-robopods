//
//  ISRewardedVideoAdapterDelegate.h
//  IronSource
//
//  Created by Roni Parshani on 10/12/14.
//  Copyright (c) 2014 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol ISRewardedVideoAdapterDelegate <NSObject>

- (void)adapterRewardedVideoHasChangedAvailability:(BOOL)available;
- (void)adapterRewardedVideoHasChangedAvailability:(BOOL)available
                                         extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidFailToLoadWithError:(NSError *)error;
- (void)adapterRewardedVideoDidFailToLoadWithError:(NSError *)error
                                         extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidReceiveReward;
- (void)adapterRewardedVideoDidReceiveRewardWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidFailToShowWithError:(NSError *)error;
- (void)adapterRewardedVideoDidFailToShowWithError:(NSError *)error
                                         extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidOpen;
- (void)adapterRewardedVideoDidOpenWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidClose;
- (void)adapterRewardedVideoDidCloseWithExtraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark - demand only

- (void)adapterRewardedVideoDidLoad;
- (void)adapterRewardedVideoDidLoadWithExtraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark - optional - when supported by network

- (void)adapterRewardedVideoDidClick;
- (void)adapterRewardedVideoDidClickWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidStart;
- (void)adapterRewardedVideoDidStartWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoDidEnd;
- (void)adapterRewardedVideoDidEndWithExtraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark -  relevant only for bidding

- (void)adapterRewardedVideoInitSuccess;
- (void)adapterRewardedVideoInitSuccessWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterRewardedVideoInitFailed:(NSError *)error;
- (void)adapterRewardedVideoInitFailed:(NSError *)error
                             extraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark -  relevant only for ironSource adapter

- (void)adapterRewardedVideoDidBecomeVisible;
- (void)adapterRewardedVideoDidBecomeVisibleWithExtraData:(NSDictionary<NSString *, id> *)extraData;

@end
