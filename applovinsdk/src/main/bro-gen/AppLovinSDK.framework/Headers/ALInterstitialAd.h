//
//  ALInterstitialAd.h
//
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import <AppLovinSDK/ALAdDisplayDelegate.h>
#import <AppLovinSDK/ALAdLoadDelegate.h>
#import <AppLovinSDK/ALAdVideoPlaybackDelegate.h>

@class ALAd;
@class ALSdk;

NS_ASSUME_NONNULL_BEGIN

/**
 * Interstitial ads are full-screen or full-page ads that temporarily cover an app’s interface.
 * They’re typically shown at natural pauses or transition points—such as after completing a level in a game or when navigating between major views.
 */
@interface ALInterstitialAd : NSObject

/**
 * An object that conforms to the @c ALAdLoadDelegate protocol. If you provide a value for @c adLoadDelegate in your instance, the SDK will notify
 * this delegate of ad load events.
 */
@property (nonatomic, strong, nullable) id<ALAdLoadDelegate> adLoadDelegate;

/**
 * An object that conforms to the @c ALAdDisplayDelegate protocol. If you provide a value for @c adDisplayDelegate in your instance, the SDK will
 * notify this delegate of ad show/hide events.
 */
@property (nonatomic, strong, nullable) id<ALAdDisplayDelegate> adDisplayDelegate;

/**
 * An object that conforms to the @c ALAdVideoPlaybackDelegate protocol. If you provide a value for @c adVideoPlaybackDelegate in your instance,
 * the SDK will notify this delegate of video start/finish events.
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
 * Shows the current interstitial over a given window and renders a specified ad loaded by @c ALAdService.
 *
 * @param ad The ad to render into this interstitial.
 */
- (void)showAd:(ALAd *)ad;

@end

@interface ALInterstitialAd(ALDeprecated)
- (instancetype)initWithSdk:(ALSdk *)sdk
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use `-[ALInterstitialAd init]` instead.");
+ (instancetype)show
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `-[ALAdService loadNextAdForZoneIdentifier:]` and show the loaded `ALAd` using `-[ALInterstitialAd showAd:]` instead.");
+ (instancetype)shared
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use `-[ALInterstitialAd init]` instead.");
- (void)show
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please load an ad using `-[ALAdService loadNextAdForZoneIdentifier:]` and show the loaded `ALAd` using `-[ALInterstitialAd showAd:]` instead.");
@end

NS_ASSUME_NONNULL_END
