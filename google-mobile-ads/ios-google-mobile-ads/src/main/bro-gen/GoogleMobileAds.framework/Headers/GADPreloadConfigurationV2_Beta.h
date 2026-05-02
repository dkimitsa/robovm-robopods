//
//  GADPreloadConfigurationV2_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright © 2024 Google Inc. All rights reserved.
//

#import <GoogleMobileAds/GADAdFormat.h>
#import <GoogleMobileAds/GADRequest.h>

/// Configuration for preloading ads.
NS_SWIFT_NAME(PreloadConfigurationV2)
@interface GADPreloadConfigurationV2 : NSObject <NSCopying>

/// The ad unit ID.
@property(nonatomic, nonnull, readonly) NSString *adUnitID;

/// The GADRequest object.
@property(nonatomic, nonnull, readonly) GADRequest *request;

/// The maximum amount of ads buffered for this configuration.
@property(nonatomic, readwrite) NSUInteger bufferSize;

/// Initializes a GADPreloadConfiguration with ad unit ID and request.
- (nonnull instancetype)initWithAdUnitID:(nonnull NSString *)adUnitID
                                 request:(nonnull GADRequest *)request;

/// Initializes a GADPreloadConfiguration with ad unit ID and default request object.
- (nonnull instancetype)initWithAdUnitID:(nonnull NSString *)adUnitID;

@end
