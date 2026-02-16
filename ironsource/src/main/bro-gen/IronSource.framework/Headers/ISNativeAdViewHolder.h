//
//  ISNativeAdViewHolder.h
//  IronSource
//
//  Created by Hadar Pur on 22/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "LevelPlayMediaView.h"

@interface ISNativeAdViewHolder : NSObject

@property(weak, nonatomic, nullable) UIImageView *iconView;
@property(weak, nonatomic, nullable) UILabel *titleView;
@property(weak, nonatomic, nullable) UILabel *advertiserView;
@property(weak, nonatomic, nullable) UILabel *bodyView;
@property(weak, nonatomic, nullable) LevelPlayMediaView *mediaView;
@property(weak, nonatomic, nullable) UIButton *callToActionView;

@end
