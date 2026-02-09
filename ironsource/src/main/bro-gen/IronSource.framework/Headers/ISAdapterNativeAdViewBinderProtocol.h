//
//  ISAdapterNativeAdViewBinderProtocol.h
//  IronSource
//
//  Created by Hadar Pur on 02/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ISNativeAdViewBinderProtocol.h"

NS_ASSUME_NONNULL_BEGIN

@protocol ISAdapterNativeAdViewBinderProtocol <ISNativeAdViewBinderProtocol>

@required

@property(nonatomic, strong, nullable) UIView *networkNativeAdView;

- (void)setNativeAdView:(UIView *_Nullable)nativeAdView;

@end

NS_ASSUME_NONNULL_END
