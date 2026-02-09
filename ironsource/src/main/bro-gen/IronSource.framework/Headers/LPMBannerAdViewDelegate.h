//
//  LPMBannerAdViewDelegate.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

@class LPMAdInfo;

NS_ASSUME_NONNULL_BEGIN

@protocol LPMBannerAdViewDelegate <NSObject>

@required

- (void)didLoadAdWithAdInfo:(LPMAdInfo *)adInfo;

- (void)didFailToLoadAdWithAdUnitId:(NSString *)adUnitId error:(NSError *)error;

@optional

- (void)didClickAdWithAdInfo:(LPMAdInfo *)adInfo;

- (void)didDisplayAdWithAdInfo:(LPMAdInfo *)adInfo;

- (void)didFailToDisplayAdWithAdInfo:(LPMAdInfo *)adInfo error:(NSError *)error;

- (void)didLeaveAppWithAdInfo:(LPMAdInfo *)adInfo;

- (void)didExpandAdWithAdInfo:(LPMAdInfo *)adInfo;

- (void)didCollapseAdWithAdInfo:(LPMAdInfo *)adInfo;

@end

NS_ASSUME_NONNULL_END
