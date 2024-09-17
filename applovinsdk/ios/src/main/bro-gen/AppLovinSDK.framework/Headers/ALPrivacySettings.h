//
//  ALPrivacySettings.h
//  AppLovinSDK
//
//  Created by Basil Shikin on 3/26/18.
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

NS_ASSUME_NONNULL_BEGIN

/**
 * This class contains privacy settings for AppLovin.
 */
@interface ALPrivacySettings : NSObject

/**
 * Sets whether or not the user has provided consent for information-sharing with AppLovin.
 *
 * @param hasUserConsent @c YES if the user provided consent for information-sharing with AppLovin. @c NO by default.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/privacy#consent-and-age-related-flags-in-gdpr-and-other-regions">MAX Integration Guide ⇒ iOS ⇒ Privacy ⇒ Consent and Age-Related Flags in GDPR and Other Regions</a>
 */
+ (void)setHasUserConsent:(BOOL)hasUserConsent;

/**
 * Checks if the user has provided consent for information-sharing with AppLovin.
 *
 * @return @c YES if the user provided consent for information sharing. @c NO if the user declined to share information or the consent value has not been set (see @c isUserConsentSet).
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/privacy#consent-and-age-related-flags-in-gdpr-and-other-regions">MAX Integration Guide ⇒ iOS ⇒ Privacy ⇒ Consent and Age-Related Flags in GDPR and Other Regions</a>
 */
+ (BOOL)hasUserConsent;

/**
 * Checks if user has set consent for information sharing.
 *
 * @return @c YES if user has set a value of consent for information sharing.
 */
+ (BOOL)isUserConsentSet;

/**
 * Sets whether or not the user has opted out of the sale of their personal information.
 *
 * @param doNotSell @c YES if the user opted out of the sale of their personal information.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/privacy#multi-state-consumer-privacy-laws">MAX Integration Guide ⇒ iOS ⇒ Privacy ⇒ Multi-State Consumer Privacy Laws</a>
 */
+ (void)setDoNotSell:(BOOL)doNotSell;

/**
 * Checks if the user has opted out of the sale of their personal information.
 *
 * @return @c YES if the user opted out of the sale of their personal information. @c NO if the user opted in to the sale of their personal information or the value has not been set (see @c isDoNotSellSet).
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/privacy#multi-state-consumer-privacy-laws">MAX Integration Guide ⇒ iOS ⇒ Privacy ⇒ Multi-State Consumer Privacy Laws</a>
 */
+ (BOOL)isDoNotSell;

/**
 * Checks if the user has set the option to sell their personal information.
 *
 * @return @c YES if user has chosen an option to sell their personal information.
 */
+ (BOOL)isDoNotSellSet;

/**
 * Parses the IABTCF_VendorConsents string to determine the consent status of the IAB vendor with the provided ID.
 *
 * NOTE: Must be called after AppLovin MAX SDK has been initialized.
 *
 * @param vendorIdentifier Vendor ID as defined in the Global Vendor List.
 *
 * @return @c 1 if the vendor has consent, @c 0 if not, or @c nil if TC data is not available on disk.
 *
 * @see <a href="https://vendor-list.consensu.org/v3/vendor-list.json">Current Version of Global Vendor List</a>
 */
+ (nullable NSNumber *)tcfVendorConsentStatusForIdentifier:(NSInteger)vendorIdentifier;

/**
 * Parses the IABTCF_AddtlConsent string to determine the consent status of the advertising entity with the provided Ad Technology Provider (ATP) ID.
 *
 * NOTE: Must be called after AppLovin MAX SDK has been initialized.
 *
 * @param atpIdentifier ATP ID of the advertising entity (e.g. 89 for Meta Audience Network).
 *
 * @return @c 1 if the advertising entity has consent, @c 0 if not, or @c nil if no AC string is available on disk or the ATP network was not listed in the CMP flow.
 *
 * @see <a href="https://support.google.com/admanager/answer/9681920">Google’s Additional Consent Mode technical specification</a>
 * @see <a href="https://storage.googleapis.com/tcfac/additional-consent-providers.csv">List of Google ATPs and their IDs</a>
 */
+ (nullable NSNumber *)additionalConsentStatusForIdentifier:(NSInteger)atpIdentifier;

/**
 * Parses the IABTCF_PurposeConsents String to determine the consent status of the IAB defined data processing purpose.
 *
 * NOTE: Must be called after AppLovin MAX SDK has been initialized.
 *
 * @param purposeIdentifier Purpose ID.
 *
 * @return @c 1 if the purpose has consent, @c 0 if not, or @c nil if TC data is not available on disk.
 *
 * @see <a href="https://iabeurope.eu/iab-europe-transparency-consent-framework-policies">IAB Europe Transparency & Consent Framework Policies (Appendix A)</a> for purpose definitions.
 */
+ (nullable NSNumber *)purposeConsentStatusForIdentifier:(NSInteger)purposeIdentifier;

/**
 * Parses the IABTCF_SpecialFeaturesOptIns String to determine the opt-in status of the IAB defined special feature.
 *
 * NOTE: Must be called after AppLovin MAX SDK has been initialized.
 *
 * @param specialFeatureIdentifier Special feature ID.
 *
 * @return @c 1 if the user opted in for the special feature, @c 0 if not, or @c nil if TC data is not available on disk.
 *
 * @see <a href="https://iabeurope.eu/iab-europe-transparency-consent-framework-policies">IAB Europe Transparency & Consent Framework Policies (Appendix A)</a> for special features definitions.
 */
+ (nullable NSNumber *)specialFeatureOptInStatusForIdentifier:(NSInteger)specialFeatureIdentifier;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
