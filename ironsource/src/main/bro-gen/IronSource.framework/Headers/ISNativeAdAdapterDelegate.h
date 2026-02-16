//
//  ISNativeAdAdapterDelegate.h
//  IronSource
//
//  Created by Hadar Pur on 02/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdapterNativeAdData.h"
#import "ISAdapterNativeAdViewBinder.h"
#import "ISError.h"

@protocol ISNativeAdAdapterDelegate <NSObject>

@required

- (void)adapterNativeAdInitSuccess;

- (void)adapterNativeAdInitFailedWithError:(NSError *)error;

- (void)adapterNativeAdDidLoadWithAdData:(ISAdapterNativeAdData *)adapterNativeAdData
                            adViewBinder:(ISAdapterNativeAdViewBinder *)nativeAdViewBinder;

- (void)adapterNativeAdDidFailToLoadWithError:(NSError *)error;

- (void)adapterNativeAdDidShow;

- (void)adapterNativeAdDidClick;

@end
