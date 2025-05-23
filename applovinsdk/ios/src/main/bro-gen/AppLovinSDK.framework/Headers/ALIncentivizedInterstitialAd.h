//
//  ALIncentivizedInterstitialAd.h
//  AppLovinSDK
//
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import <AppLovinSDK/ALAdDisplayDelegate.h>
#import <AppLovinSDK/ALAdLoadDelegate.h>
#import <AppLovinSDK/ALAdRewardDelegate.h>
#import <AppLovinSDK/ALAdVideoPlaybackDelegate.h>

@class ALAd;
@class ALSdk;

NS_ASSUME_NONNULL_BEGIN

/**
 * Rewarded ads let you offer users in-app items—such as continued gameplay, virtual currency, or other rewards—in exchange for their engagement with ads.
 * Rewarded ads boost engagement because users receive a tangible benefit for their time.
 */
@interface ALIncentivizedInterstitialAd : NSObject

/**
 * An object that conforms to the @c ALAdDisplayDelegate protocol. If you provide a value for @c adDisplayDelegate in your instance, the SDK will
 * notify this delegate of ad show/hide events.
 */
@property (nonatomic, strong, nullable) id<ALAdDisplayDelegate> adDisplayDelegate;

/**
 * An object that conforms to the @c ALAdVideoPlaybackDelegate protocol. If you provide a value for @c adVideoPlaybackDelegate in your instance,
 * the SDK will notify this delegate of video start/stop events.
 */
@property (nonatomic, strong, nullable) id<ALAdVideoPlaybackDelegate> adVideoPlaybackDelegate;

/**
 * Sets extra info to pass to the SDK.
 *
 * @param key   Parameter key.
 * @param value Parameter value.
 */
- (void)setExtraInfoForKey:(NSString *)key value:(nullable id)value;

/**
 * The zone identifier this incentivized ad was initialized with and is loading ads for, if any.
 */
@property (nonatomic, copy, readonly, nullable) NSString *zoneIdentifier;

/**
 * Shows an incentivized interstitial, by using the most recently pre-loaded ad.
 *
 * You must have called @code +[ALIncentivizedInterstitialAd preloadAndNotify:] @endcode before you call @c showAd.
 *
 * By using the @c ALAdRewardDelegate, you can verify with AppLovin servers that the video view is legitimate, as AppLovin will confirm whether
 * the specific ad was actually served. Then AppLovin will ping your server with a URL at which you can update the user’s balance. The Reward Validation
 * Delegate will tell you whether this service was able to reach AppLovin servers or not. If you receive a successful response, you should refresh the user’s
 * balance from your server. For more info, see the documentation.
 *
 * @param ad               The ad to render into this incentivized ad.
 * @param adRewardDelegate The reward delegate to notify upon validating reward authenticity with AppLovin.
 */
- (void)showAd:(ALAd *)ad andNotify:(nullable id<ALAdRewardDelegate>)adRewardDelegate;

/**
 * Initializes an instance of @code ALIncentivizedInterstitialAd @endcode for a given zone identifier.
 *
 * @param zoneIdentifier Zone identifier to load ads for.
 */
- (instancetype)initWithZoneIdentifier:(nullable NSString *)zoneIdentifier;

@end

@interface ALIncentivizedInterstitialAd(ALDeprecated)
- (instancetype)initWithSdk:(ALSdk *)sdk
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use `-[ALIncentivizedInterstitialAd init]` instead.");
- (instancetype)initWithZoneIdentifier:(nullable NSString *)zoneIdentifier sdk:(ALSdk *)sdk
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use `-[ALIncentivizedInterstitialAd initWithZoneIdentifier:]` instead.");
+ (ALIncentivizedInterstitialAd *)shared
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use `-[ALIncentivizedInterstitialAd init]` instead.");
+ (void)preloadAndNotify:(nullable id<ALAdLoadDelegate>)adLoadDelegate
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `-[ALAdService loadNextAdForZoneIdentifier:]` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
+ (BOOL)isReadyForDisplay
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
+ (void)show
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
+ (void)showAndNotify:(nullable id<ALAdRewardDelegate>)adRewardDelegate
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
- (void)preloadAndNotify:(nullable id<ALAdLoadDelegate>)adLoadDelegate
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
@property (atomic, readonly, getter=isReadyForDisplay) BOOL readyForDisplay
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
- (void)show
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
- (void)showAndNotify:(nullable id<ALAdRewardDelegate>)adRewardDelegate
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `ALAdService` and show the loaded `ALAd` using `-[ALIncentivizedInterstitialAd showAd:andNotify:]` instead.");
@end

NS_ASSUME_NONNULL_END
