//
//  ISNativeAdViewBinderProtocol.h
//  IronSource
//
//  Created by Hadar Pur on 19/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "LevelPlayMediaView.h"

@protocol ISNativeAdViewBinderProtocol <NSObject>

@required

- (void)setIconView:(UIImageView *)iconView;
- (void)setTitleView:(UILabel *)titleView;
- (void)setAdvertiserView:(UILabel *)advertiserView;
- (void)setBodyView:(UILabel *)bodyView;
- (void)setMediaView:(LevelPlayMediaView *)mediaView;
- (void)setCallToActionView:(UIButton *)callToActionView;

@end
