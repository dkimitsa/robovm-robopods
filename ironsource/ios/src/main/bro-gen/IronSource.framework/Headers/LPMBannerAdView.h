//
//  LPMBannerAdView.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "LPMBannerAdViewDelegate.h"

@class LPMAdSize;

NS_ASSUME_NONNULL_BEGIN

@interface LPMBannerAdView : UIView

/**
 * A unique identifier associated with the ad object.
 */
@property(nonatomic, strong, readonly) NSString *adId;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

- (instancetype)initWithAdUnitId:(NSString *)adUnitId;

- (void)setPlacementName:(NSString *)placementName;

- (void)setAdSize:(LPMAdSize *)adSize;

- (void)setDelegate:(id<LPMBannerAdViewDelegate>)delegate;

- (void)loadAdWithViewController:(UIViewController *)viewController;

- (void)destroy;

- (void)pauseAutoRefresh;

- (void)resumeAutoRefresh;

@end

NS_ASSUME_NONNULL_END
