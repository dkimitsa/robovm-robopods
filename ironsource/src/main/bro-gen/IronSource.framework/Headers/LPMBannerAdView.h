//
//  LPMBannerAdView.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "LPMBannerAdViewDelegate.h"
#import "LPMImpressionDataDelegate.h"

@class LPMAdSize, LPMBannerAdViewConfig;

NS_ASSUME_NONNULL_BEGIN

@interface LPMBannerAdView : UIView

/**
 * A unique identifier associated with the ad object.
 */
@property(nonatomic, strong, readonly) NSString *adId;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

- (instancetype)initWithAdUnitId:(NSString *)adUnitId;

- (instancetype)initWithAdUnitId:(NSString *)adUnitId config:(LPMBannerAdViewConfig *)config;

- (void)setDelegate:(id<LPMBannerAdViewDelegate>)delegate;

/**
 Sets a delegate for impression-level revenue data. The callback will be invoked on the main
 thread when an impression occurs for this specific ad instance.

 @param delegate The delegate to set.
 */
- (void)setImpressionDataDelegate:(nullable id<LPMImpressionDataDelegate>)delegate;

- (void)loadAdWithViewController:(UIViewController *)viewController;

- (void)destroy;

- (void)pauseAutoRefresh;

- (void)resumeAutoRefresh;

@end

NS_ASSUME_NONNULL_END
