//
//  GADRewardedSignalRequest.h
//  Google Mobile Ads SDK
//
//  Copyright 2024 Google LLC. All rights reserved.
//

#import <GoogleMobileAds/Request/GADSignalRequest.h>

@interface GADRewardedSignalRequest : GADSignalRequest

/// Returns an initialized rewarded signal request.
/// @param signalType The type of signal to request.
- (nonnull instancetype)initWithSignalType:(nonnull NSString *)signalType;

@end
