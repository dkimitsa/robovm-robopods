//
//  ISNBannerAdView.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "ISABannerAdInfo.h"
#import "ISABannerAdViewDelegate.h"

NS_ASSUME_NONNULL_BEGIN

@interface ISABannerAdView : UIView

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@property(nonatomic, weak, nullable) id<ISABannerAdViewDelegate> delegate;
@property(nonatomic, strong, readonly) ISABannerAdInfo* adInfo;
@property(nonatomic, weak, nullable) UIViewController* viewController;

NS_ASSUME_NONNULL_END

@end
