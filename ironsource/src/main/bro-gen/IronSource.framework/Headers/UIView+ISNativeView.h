//
//  UIView+ISNativeView.h
//  IronSourceSDK
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface UIView (ISNativeView)

- (void)addSubviewAndAdjust:(UIView *)view;

@end

NS_ASSUME_NONNULL_END
