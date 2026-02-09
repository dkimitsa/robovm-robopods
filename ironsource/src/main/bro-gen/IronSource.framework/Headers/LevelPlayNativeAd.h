//
//  LevelPlayNativeAd.h
//  IronSource
//
//  Created by Hadar Pur on 04/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAdapterNativeAdViewBinder.h"
#import "ISNativeAdDataProtocol.h"
#import "LevelPlayNativeAdBuilder.h"
#import "LevelPlayNativeAdDelegate.h"

NS_ASSUME_NONNULL_BEGIN

@interface LevelPlayNativeAd : NSObject <ISNativeAdDataProtocol>

@property(nonatomic, strong, nullable) ISAdapterNativeAdViewBinder *nativeAdViewBinder;

- (instancetype)initWithBuilder:(LevelPlayNativeAdBuilder *)builder;

- (void)loadAd;
- (void)destroyAd;
- (void)setDelegate:(id<LevelPlayNativeAdDelegate>)delegate;
- (NSString *)getObjectId;

@end

NS_ASSUME_NONNULL_END
