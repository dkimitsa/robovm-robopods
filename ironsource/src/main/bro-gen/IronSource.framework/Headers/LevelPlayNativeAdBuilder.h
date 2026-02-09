//
//  LevelPlayNativeAdBuilder.h
//  IronSource
//
//  Created by Maoz Elbaz on 11/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "LevelPlayNativeAdDelegate.h"

@class LevelPlayNativeAd;

@interface LevelPlayNativeAdBuilder : NSObject

@property(nonatomic, strong) NSString *placementName;
@property(nonatomic, weak) id<LevelPlayNativeAdDelegate> delegate;
@property(nonatomic, weak) UIViewController *viewController;

- (LevelPlayNativeAdBuilder *)withViewController:(UIViewController *)viewController;

- (LevelPlayNativeAdBuilder *)withPlacementName:(NSString *)placementName;

- (LevelPlayNativeAdBuilder *)withDelegate:(id<LevelPlayNativeAdDelegate>)delegate;

- (LevelPlayNativeAd *)build;

@end
