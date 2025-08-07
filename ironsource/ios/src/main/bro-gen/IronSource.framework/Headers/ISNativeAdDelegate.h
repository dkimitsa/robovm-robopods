//
//  ISNativeAdDelegate.h
//  IronSource
//
//  Created by Hadar Pur on 27/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdapterAdDelegate.h"
#import "ISAdapterNativeAdData.h"
#import "ISAdapterNativeAdViewBinder.h"

NS_ASSUME_NONNULL_BEGIN

@protocol ISNativeAdDelegate <ISAdapterAdDelegate>

/// mandatory callbacks
/// @param adapterNativeAdData the native ad data
/// @param nativeAdViewBinder the native ad view binder
- (void)adDidLoadWithAdData:(ISAdapterNativeAdData *)adapterNativeAdData
               adViewBinder:(ISAdapterNativeAdViewBinder *)nativeAdViewBinder;

@end

NS_ASSUME_NONNULL_END
