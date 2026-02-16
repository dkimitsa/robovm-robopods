//
//  ISNativeAdView.h
//  IronSource
//
//  Created by Hadar Pur on 04/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ISNativeAdViewBinderProtocol.h"
#import "LevelPlayMediaView.h"
#import "LevelPlayNativeAd.h"

NS_ASSUME_NONNULL_BEGIN

@interface ISNativeAdView : UIView

/// Weak reference to your ad view's icon asset view.
@property(weak, nonatomic) IBOutlet UIImageView *adAppIcon;
/// Weak reference to your ad view's headline asset view.
@property(weak, nonatomic) IBOutlet UILabel *adTitleView;
/// Weak reference to your ad view's advertiser asset view.
@property(weak, nonatomic) IBOutlet UILabel *adAdvertiserView;
/// Weak reference to your ad view's body asset view.
@property(weak, nonatomic) IBOutlet UILabel *adBodyView;
/// Weak reference to your ad view's media asset view.
@property(weak, nonatomic) IBOutlet LevelPlayMediaView *adMediaView;
/// Weak reference to your ad view's call to action asset view.
@property(weak, nonatomic) IBOutlet UIButton *adCallToActionView;

- (void)registerNativeAdViews:(LevelPlayNativeAd *)nativeAd;

@end

NS_ASSUME_NONNULL_END
