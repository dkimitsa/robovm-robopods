//
//  MAAdView.h
//  AppLovinSDK
//
//  Created by Thomas So on 8/9/18.
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <AppLovinSDK/MAAdViewAdDelegate.h>
#import <AppLovinSDK/MAAdRequestDelegate.h>
#import <AppLovinSDK/MAAdRevenueDelegate.h>
#import <AppLovinSDK/MAAdReviewDelegate.h>

@class ALSdk;
@class MAAdFormat;
@class MAAdViewConfiguration;

NS_ASSUME_NONNULL_BEGIN

/**
 * This class represents a view-based ad — i.e. banner/leader or MREC.
 *
 * @see <a href="https://developers.applovin.com/en/ios/ad-formats/banner-and-mrec-ads">MAX Integration Guide ⇒ iOS ⇒ Ad Formats ⇒ Banner & MREC Ads</a>
 */
@interface MAAdView : UIView

/**
 * Creates a new ad view for a given ad unit ID.
 *
 * @param adUnitIdentifier Ad unit ID to load ads for.
 */
- (instancetype)initWithAdUnitIdentifier:(NSString *)adUnitIdentifier;

/**
 * Creates a new ad view for a given ad unit ID and configuration.
 *
 * @param adUnitIdentifier Ad unit ID to load ads for.
 * @param configuration    Configuration object for customizing the ad view's properties.
 */
- (instancetype)initWithAdUnitIdentifier:(NSString *)adUnitIdentifier configuration:(nullable MAAdViewConfiguration *)configuration;

/**
 * Creates a new ad view for a given ad unit ID and ad format.
 *
 * @param adUnitIdentifier Ad unit ID to load ads for.
 * @param adFormat         Ad format to load ads for.
 */
- (instancetype)initWithAdUnitIdentifier:(NSString *)adUnitIdentifier adFormat:(MAAdFormat *)adFormat;

/**
 * Creates a new ad view for a given ad unit ID, ad format, and configuration.
 *
 * @param adUnitIdentifier Ad unit ID to load ads for.
 * @param adFormat         Ad format to load ads for.
 * @param configuration    Configuration object for customizing the ad view's properties.
 */
- (instancetype)initWithAdUnitIdentifier:(NSString *)adUnitIdentifier adFormat:(MAAdFormat *)adFormat configuration:(nullable MAAdViewConfiguration *)configuration;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)initWithFrame:(CGRect)frame NS_UNAVAILABLE;
- (instancetype)initWithCoder:(NSCoder *)decoder NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

/**
 * A delegate that will be notified about ad events.
 */
@property (nonatomic, weak, nullable) IBOutlet id<MAAdViewAdDelegate> delegate;

/**
 * A delegate that will be notified about ad revenue events.
 */
@property (nonatomic, weak, nullable) IBOutlet id<MAAdRevenueDelegate> revenueDelegate;

/**
 * A delegate that will be notified about ad request events.
 */
@property (nonatomic, weak, nullable) IBOutlet id<MAAdRequestDelegate> requestDelegate;

/**
 * A delegate that will be notified about Ad Review events.
 */
@property (nonatomic, weak, nullable) IBOutlet id<MAAdReviewDelegate> adReviewDelegate;

/**
 * Loads the ad for the current ad view. Set @code -[MAAdView delegate] @endcode to assign a delegate that should be notified about ad load state.
 *
 * @see <a href="https://developers.applovin.com/en/ios/ad-formats/banner-and-mrec-ads">MAX Integration Guide ⇒ iOS ⇒ Ad Formats ⇒ Banner & MREC Ads ⇒ Loading a Banner or MREC</a>
 */
- (void)loadAd;

/**
 * Starts or resumes auto-refreshing of the banner.
 *
 * @see <a href="https://developers.applovin.com/en/ios/ad-formats/banner-and-mrec-ads#stopping-and-starting-auto-refresh">MAX Integration Guide ⇒ iOS ⇒ Ad Formats ⇒ Banner & MREC Ads ⇒ Stopping and Starting Auto-Refresh</a>
 */
- (void)startAutoRefresh;

/**
 * Pauses auto-refreshing of the banner.
 *
 * @see <a href="https://developers.applovin.com/en/ios/ad-formats/banner-and-mrec-ads#stopping-and-starting-auto-refresh">MAX Integration Guide ⇒ iOS ⇒ Ad Formats ⇒ Banner & MREC Ads ⇒ Stopping and Starting Auto-Refresh</a>
 */
- (void)stopAutoRefresh;

/**
 * The placement name that you assign when you integrate each ad format, for granular reporting in ad events (e.g. "Rewarded_Store", "Rewarded_LevelEnd").
 */
@property (nonatomic, copy, nullable) NSString *placement;

/**
 * The ad unit identifier this @c MAAdView was initialized with and is loading ads for.
 */
@property (nonatomic, copy, readonly) NSString *adUnitIdentifier;

/**
 * The format of the ad view.
 */
@property (nonatomic, weak, readonly) MAAdFormat *adFormat;

/**
 * Sets an extra parameter key/value pair for the ad.
 *
 * @param key   Parameter key.
 * @param value Parameter value.
 */
- (void)setExtraParameterForKey:(NSString *)key value:(nullable NSString *)value;

/**
 * Set a local extra parameter to pass to the adapter instances. Will not be available in the @code -[MAAdapter initializeWithParameters:withCompletionHandler:] @endcode method.
 *
 * @param key   Parameter key. Must not be null.
 * @param value Parameter value. May be null.
 */
- (void)setLocalExtraParameterForKey:(NSString *)key value:(nullable id)value;

/**
 * The custom data to tie the showing ad to, for ILRD and rewarded postbacks via the @c {CUSTOM_DATA}  macro. Maximum size is 8KB.
 */
@property (nonatomic, copy, nullable) NSString *customData;

@end

@interface MAAdView(ALDeprecated)
- (instancetype)initWithAdUnitIdentifier:(NSString *)adUnitIdentifier sdk:(ALSdk *)sdk
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use one of the other initializers instead.");
- (instancetype)initWithAdUnitIdentifier:(NSString *)adUnitIdentifier adFormat:(MAAdFormat *)adFormat sdk:(ALSdk *)sdk
__deprecated_msg("This API is deprecated and will be removed in a future SDK version. Please use one of the other initializers instead.");
@end

NS_ASSUME_NONNULL_END
