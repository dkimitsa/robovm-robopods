//
//  ALSdkSettings.h
//  AppLovinSDK
//
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import <AppLovinSDK/ALTermsAndPrivacyPolicyFlowSettings.h>

NS_ASSUME_NONNULL_BEGIN

/**
 * This class contains mutable settings for the AppLovin SDK.
 */
@interface ALSdkSettings : NSObject

/**
 * Settings relating to the MAX Terms and Privacy Policy Flow.
 */
@property (nonatomic, strong, readonly) ALTermsAndPrivacyPolicyFlowSettings *termsAndPrivacyPolicyFlowSettings;

/**
 * A toggle for verbose logging for the SDK. This is set to @c NO by default. Set it to @c NO if you want the SDK to be silent (this is recommended for App Store
 * submissions).
 *
 * If set to @c YES AppLovin messages will appear in the standard application log which is accessible via the console. All AppLovin log messages are prefixed
 * with the @code /AppLovinSdk: [AppLovinSdk] @endcode tag.
 *
 * Verbose logging is <em>disabled</em> (@c NO) by default.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/advanced-settings#enable-verbose-logging">MAX Integration Guide ⇒ iOS ⇒ Advanced Settings ⇒ Enable Verbose Logging</a>
 */
@property (nonatomic, assign, getter=isVerboseLoggingEnabled) BOOL verboseLoggingEnabled;

/**
 * Whether to begin video ads in a muted state or not. Defaults to @c NO unless you change this in the dashboard.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/advanced-settings#mute-audio">MAX Integration Guide ⇒ iOS ⇒ Advanced Settings ⇒ Mute Audio</a>
 */
@property (nonatomic, assign, getter=isMuted) BOOL muted;

/**
 * Whether the Creative Debugger will be displayed after flipping the device screen down twice. Defaults to @c YES.
 *
 * @see <a href="https://developers.applovin.com/en/ios/testing-networks/creative-debugger">MAX Integration Guide ⇒ iOS ⇒ Testing Networks ⇒ Creative Debugger</a>
 */
@property (nonatomic, assign, getter=isCreativeDebuggerEnabled) BOOL creativeDebuggerEnabled;

/**
 * An identifier for the current user. This identifier will be tied to SDK events and AppLovin’s optional S2S postbacks.
 *
 * If you use reward validation, you can optionally set an identifier that AppLovin will include with its currency validation postbacks (for example, a username
 * or email address). AppLovin will include this in the postback when AppLovin pings your currency endpoint from our server.
 *
 * @see <a href="https://developers.applovin.com/en/advanced-features/s2s-rewarded-callback-api#setting-an-internal-user-id">MAX Integration Guide ⇒ S2S Rewarded Callback API ⇒ Setting an Internal User ID</a>
 */
@property (nonatomic, copy, nullable) NSString *userIdentifier;

/**
 * A copy of the extra parameters that are currently set.
 */
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> *extraParameters;

/**
 * Set an extra parameter to pass to the AppLovin server.
 *
 * @param key   Parameter key. Must not be nil.
 * @param value Parameter value. May be nil.
 */
- (void)setExtraParameterForKey:(NSString *)key value:(nullable NSString *)value;

@property (nonatomic, copy) NSArray<NSString *> *testDeviceAdvertisingIdentifiers __deprecated_msg("This property is deprecated and will be removed in a future SDK version. Please use the new ALSdkInitializationConfiguration (see ALSdkInitializationConfiguration.testDeviceAdvertisingIdentifiers)");
@property (nonatomic, copy) NSArray<NSString *> *initializationAdUnitIdentifiers __deprecated_msg("This property is deprecated and will be removed in a future SDK version. version. Please use the new ALSdkInitializationConfiguration (see ALSdkInitializationConfiguration.initializationAdUnitIdentifiers");
@property (nonatomic, assign, getter=isExceptionHandlerEnabled) BOOL exceptionHandlerEnabled __deprecated_msg("This property is deprecated and will be removed in a future SDK version. Please use the new ALSdkInitializationConfiguration (see ALSdkInitializationConfiguration.exceptionHandlerEnabled)");
@end

@interface ALSdkSettings (ALDeprecated)
@property (nonatomic, strong, readonly) ALConsentFlowSettings *consentFlowSettings __deprecated_msg("This property is deprecated and will be removed in a future SDK version. Please use the new MAX Terms and Privacy Policy Flow instead (see ALSdkSettings.termsAndPrivacyPolicyFlowSettings)");

- (instancetype)init __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `ALSdk.shared.settings` instead");
+ (instancetype)new __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use ` ALSdk.shared.settings` instead");
@end

NS_ASSUME_NONNULL_END
