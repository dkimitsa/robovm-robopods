//
//  ISBannerAdapterDelegate.h
//  IronSource
//
//  Created by Pnina Rapoport on 02/04/2017.
//  Copyright © 2017 Supersonic. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@protocol ISBannerAdapterDelegate <NSObject>

@required

- (void)adapterBannerInitSuccess;
- (void)adapterBannerInitSuccessWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerInitFailedWithError:(NSError *)error;
- (void)adapterBannerInitFailedWithError:(NSError *)error
                               extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerDidLoad:(UIView *)bannerView;
- (void)adapterBannerDidLoad:(UIView *)bannerView
                   extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerDidFailToLoadWithError:(NSError *)error;
- (void)adapterBannerDidFailToLoadWithError:(NSError *)error
                                  extraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerDidClick;
- (void)adapterBannerDidClickWithExtraData:(NSDictionary<NSString *, id> *)extraData;

#pragma mark - optional - when supported by network

- (void)adapterBannerWillPresentScreen;
- (void)adapterBannerWillPresentScreenWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerDidDismissScreen;
- (void)adapterBannerDidDismissScreenWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerWillLeaveApplication;
- (void)adapterBannerWillLeaveApplicationWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerDidShow;
- (void)adapterBannerDidShowWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adapterBannerDidFailToShowWithError:(NSError *)error;
- (void)adapterBannerDidFailToShowWithError:(NSError *)error
                                  extraData:(NSDictionary<NSString *, id> *)extraData;

@end
