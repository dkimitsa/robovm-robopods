//
//  ALTermsAndPrivacyPolicyFlowSettings.h
//  AppLovinSDK
//
//  Created by Chris Cong on 1/22/24.
//

#import <AppLovinSDK/ALSdkConfiguration.h>

NS_ASSUME_NONNULL_BEGIN

/**
 * This interface contains settings that enable the MAX Terms and Privacy Policy Flow.
 */
@interface ALTermsAndPrivacyPolicyFlowSettings : NSObject

/**
 * Set this to @c YES to enable the Terms Flow. You must also provide your privacy policy and terms of service URLs in this object, and you must provide a @c NSUserTrackingUsageDescription string in your @code Info.plist @endcode file.
 *
 * This defaults to the value that you entered into your @code Info.plist @endcode file via @c AppLovinConsentFlowInfo ⇒ @c AppLovinConsentFlowEnabled.
 */
@property (nonatomic, assign, getter=isEnabled) BOOL enabled;

/**
 * URL for your company’s privacy policy. This is required in order to enable the Terms Flow.
 *
 * This defaults to the value that you entered into your @code Info.plist @endcode file via @c AppLovinConsentFlowInfo ⇒ @c AppLovinConsentFlowPrivacyPolicy.
 */
@property (nonatomic, copy, nullable) NSURL *privacyPolicyURL;

/**
 * URL for your company’s terms of service. This is optional; you can enable the Terms Flow with or without it.
 *
 * This defaults to the value that you entered into your @code Info.plist @endcode file via @c AppLovinConsentFlowInfo ⇒ @c AppLovinConsentFlowTermsOfService.
 */
@property (nonatomic, copy, nullable) NSURL *termsOfServiceURL;

/**
 * Set this to @c YES to show the Terms and Privacy Policy alert in GDPR regions prior to presenting the CMP prompt. The alert will show in non-GDPR regions regardless of this setting.
 *
 * This defaults to @c NO.
 */
@property (nonatomic, assign, getter=shouldShowTermsAndPrivacyPolicyAlertInGDPR) BOOL showTermsAndPrivacyPolicyAlertInGDPR;

/**
 * Set debug user geography. You may use this to test CMP flow by setting this to @c ALConsentFlowUserGeographyGDPR.
 *
 * The flow would only be shown to new users. If you wish to test the flow after completing the CMP prompt, you would need to delete and re-install the app.
 *
 * NOTE: The debug geography is used only when the app is in debug mode.
 */
@property (nonatomic, assign) ALConsentFlowUserGeography debugUserGeography;

@end

NS_ASSUME_NONNULL_END
