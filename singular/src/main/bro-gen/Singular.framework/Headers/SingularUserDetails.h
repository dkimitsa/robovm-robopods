//
//  SingularUserDetails.h
//  Singular
//
//  Copyright © 2010-2024 Singular Inc. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface SingularUserDetails : NSObject

// provide cleartext values - the Singular SDK normalizes and hashes it.
- (void)setEmail:(NSString *)email;
- (void)setPhoneNumber:(NSString *)phoneNumber;

- (NSString *)getEmail;
- (NSString *)getPhoneNumber;

// Pre-hashed email/phone. Stored as-is.
- (void)setEmailSTD:(NSString *)hashedEmail;
- (void)setEmailNoDots:(NSString *)hashedEmail;
- (void)setPhoneE164:(NSString *)hashedPhone;
- (void)setPhoneDigits:(NSString *)hashedPhone;

- (NSString *)getEmailSTD;
- (NSString *)getEmailNoDots;
- (NSString *)getPhoneE164;
- (NSString *)getPhoneDigits;

@end
