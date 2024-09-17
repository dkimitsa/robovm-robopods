//
//  ALAdService.h
//  AppLovinSDK
//
//  Created by Basil on 2/27/12.
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import <AppLovinSDK/ALAdDisplayDelegate.h>
#import <AppLovinSDK/ALAdLoadDelegate.h>
#import <AppLovinSDK/ALAdVideoPlaybackDelegate.h>

@class ALAd;
@class ALAdSize;

NS_ASSUME_NONNULL_BEGIN

/**
 * This class provides and displays ads.
 */
@interface ALAdService : NSObject

/**
 * @param bidToken The bid token that was collected.
 * @param errorMessage The reason for failure to collect the bid token.
 */
typedef void (^ALBidTokenCollectionCompletionHandler)(NSString *_Nullable bidToken, NSString *_Nullable errorMessage);

/**
 * Fetches a new ad, of a given size, and notifies a supplied delegate on completion.
 *
 * @param adSize    Size of an ad to load.
 * @param delegate  A callback that @c loadNextAd calls to notify of the fact that the ad is loaded.
 */
- (void)loadNextAd:(ALAdSize *)adSize andNotify:(id<ALAdLoadDelegate>)delegate;

/**
 * Fetches a new ad, for a given zone, and notifies a supplied delegate on completion.
 *
 * @param zoneIdentifier  The identifier of the zone to load an ad for.
 * @param delegate        A callback that @c loadNextAdForZoneIdentifier calls to notify of the fact that the ad is loaded.
 */
- (void)loadNextAdForZoneIdentifier:(NSString *)zoneIdentifier andNotify:(id<ALAdLoadDelegate>)delegate;

/**
 * Asynchronously generates a token used for advanced header bidding.
 *
 * @param completion A completion handler to notify whether or not the bid token collection was successful.
 *                  This will be called on the main thread. Must not be null.
 */
- (void)collectBidTokenWithCompletion:(ALBidTokenCollectionCompletionHandler)completion;

/**
 * Fetches a new ad for the given ad token. The provided ad token must be one that was received from AppLovin S2S API.
 *
 * @warning This method is designed to be called by SDK mediation providers. Use @code -[ALAdService loadNextAdForZoneIdentifier:andNotify:] @endcode for
 *          regular integrations.
 *
 * @param adToken   Ad token returned from AppLovin S2S API.
 * @param delegate  A callback that @c loadNextAdForAdToken calls to notify that the ad has been loaded.
 */
- (void)loadNextAdForAdToken:(NSString *)adToken andNotify:(id<ALAdLoadDelegate>)delegate;

- (instancetype)init __attribute__((unavailable("Access ALAdService through ALSdk's adService property.")));
+ (instancetype)new NS_UNAVAILABLE;

@end

@interface ALAdService(ALDeprecated)
@property (nonatomic, copy, readonly) NSString *bidToken __deprecated_msg("This API has been deprecated and will be removed in a future release. Please use collectBidTokenWithCompletion: instead.");
@end

NS_ASSUME_NONNULL_END
