
//
//  ALUserData.h
//  AppLovin MAX SDK
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 * Contains user identity data to attach to Axon events and ad requests.
 *
 * Set plaintext values when available — the SDK normalizes and hashes PII fields internally before transmission.
 * Email and phone are SHA-256 hashed; pre-hashed normalized SHA-256 hex values are also accepted.
 * userId is sent as plaintext — do not include PII.
 */
@interface ALUserData : NSObject

/**
 * The user's email address in plaintext (e.g. "User@Example.com").
 * The SDK trims whitespace, lowercases, and SHA-256 hashes the value before sending.
 * Plaintext is preferred; normalized SHA-256 hex is also accepted.
 */
@property (nonatomic, copy, nullable) NSString *email;

/**
 * The user's phone number. E.164 format is preferred (e.g. "+12345678900").
 * The SDK strips non-digit characters, removes leading zeros, and SHA-256 hashes the value before sending.
 * If provided in E.164 format (starting with +), the country code is also extracted.
 * Plaintext is preferred; normalized SHA-256 hex is also accepted.
 */
@property (nonatomic, copy, nullable) NSString *phone;

/**
 * An internal user ID that identifies the user within the advertiser's system.
 * Sent as plaintext — do not include PII.
 */
@property (nonatomic, copy, nullable) NSString *userId;

@end

NS_ASSUME_NONNULL_END
