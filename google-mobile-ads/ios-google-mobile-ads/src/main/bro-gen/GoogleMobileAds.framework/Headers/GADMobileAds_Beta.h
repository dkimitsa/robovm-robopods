//
//  GADMobileAds_Beta.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC. All rights reserved.
//

#import <GoogleMobileAds/GADMobileAds.h>
#import <GoogleMobileAds/Mediation/GADMediationInitializationConfiguration_Beta.h>

/// Provides beta features for GADMobileAds.
@interface GADMobileAds (Beta)

/// Starts the Google Mobile Ads SDK with a mediation initialization configuration. Can be called
/// multiple times concurrently, each can be customized with a different mediation initialization
/// configuration. Passing `nil` triggers the initialization of all adapters.
/// @param mediationInitializationConfiguration The mediation initialization configuration to
///     register.
/// @param completionHandler The completion handler to call when initialization is complete.
- (void)startWithMediationInitializationConfiguration:
            (nullable GADMediationInitializationConfiguration *)mediationInitializationConfiguration
                                    completionHandler:(nullable GADInitializationCompletionHandler)
                                                          completionHandler;
@end
