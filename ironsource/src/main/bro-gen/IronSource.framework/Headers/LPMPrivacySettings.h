//
//  LPMPrivacySettings.h
//  IronSource
//
//  Created by Amit Nahmani on 28/01/2026.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface LPMPrivacySettings : NSObject

/**
 * Sets the consent per network, a dictionary of network keys to boolean values that indicates
 * whether the user has granted consent for each network to collect and share data. Consent is used
 * for GDPR compliance.
 *
 * @param networkConsents A dictionary where keys are network identifiers (NSString) and values are
 * NSNumber objects wrapping boolean values (YES if the user has granted consent, NO otherwise).
 * @deprecated This method is deprecated. Use `+[LPMPrivacySettings.setGDPRConsent:]` instead
 for GDPR consent management.
 */
+ (void)setGDPRConsents:(NSDictionary<NSString *, NSNumber *> *_Nonnull)networkConsents
    __attribute__((
        deprecated("use +[LPMPrivacySettings.setGDPRConsent:] for GDPR consent management.")));

/**
 * Sets the GDPR consent, indicating whether the user has granted consent to collect and share
 * their data. Consent is used for GDPR compliance.
 *
 * @param consent A boolean indicating the user's GDPR consent status, true if the user has
 *   granted consent, false otherwise.
 */
+ (void)setGDPRConsent:(BOOL)consent;

/**
 * Sets the CCPA (California Consumer Privacy Act) flag. This flag indicates whether the user has
 * opted out of the sale of their personal information.
 *
 * @param value YES if the user has opted out of the sale of their personal information, NO
 * otherwise.
 */
+ (void)setCCPA:(BOOL)value;

/**
 * Sets the COPPA (Children's Online Privacy Protection Act) flag. This flag indicates whether
 * the user is a child and the app should comply with COPPA regulations.
 *
 * Must be called before SDK initialization. If the SDK is already initialized, this
 * call is ignored and an error is logged.
 *
 * @param value YES if the user is a child and COPPA compliance is required, NO otherwise.
 */
+ (void)setCOPPA:(BOOL)value;

@end

NS_ASSUME_NONNULL_END
