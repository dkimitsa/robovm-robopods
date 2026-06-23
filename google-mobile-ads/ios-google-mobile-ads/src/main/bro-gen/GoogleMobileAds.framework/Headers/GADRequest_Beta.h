//
//  GADRequest_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC. All rights reserved.
//

#import <GoogleMobileAds/GADRequest.h>

@interface GADRequest (Beta)

#pragma mark Mediation Adapters

/// If YES, the SDK will not attempt to load an ad from adapters that have not been initialized.
/// This is useful for apps that have a large number of adapters that are not used in the app, and
/// that take a long time to initialize.
///
/// Defaults to NO, the SDK will attempt to initialize
/// adapters on the first request attempt if they have not been initialized before.
@property(nonatomic) BOOL shouldSkipUninitializedAdapters NS_SWIFT_NAME(skipUninitializedAdapters);

@end
