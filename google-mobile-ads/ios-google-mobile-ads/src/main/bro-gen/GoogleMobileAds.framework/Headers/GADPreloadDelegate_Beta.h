//
//  GADPreloadDelegate_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright © 2024 Google Inc. All rights reserved.
//

#import <GoogleMobileAds/GADPreloadConfigurationV2_Beta.h>
#import <GoogleMobileAds/GADResponseInfo.h>

/// Delegate for preloading events.
NS_SWIFT_NAME(PreloadDelegate)
@protocol GADPreloadDelegate <NSObject>

/// Called when an ad becomes available for the preload ID.
- (void)adAvailableForPreloadID:(nonnull NSString *)preloadID
                   responseInfo:(nonnull GADResponseInfo *)responseInfo;

/// Called when the last available ad is exhausted for the preload ID.
- (void)adsExhaustedForPreloadID:(nonnull NSString *)preloadID;

/// Called when an ad failed to preload for the preload ID.
- (void)adFailedToPreloadForPreloadID:(nonnull NSString *)preloadID error:(nonnull NSError *)error;

@end
