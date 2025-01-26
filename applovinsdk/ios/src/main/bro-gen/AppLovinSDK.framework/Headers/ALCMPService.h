//
//  ALCMPService.h
//  AppLovinSDK
//
//  Created by Thomas So on 7/26/23.
//

@class ALCMPError;

NS_ASSUME_NONNULL_BEGIN

/**
 * This class provides direct APIs for interfacing with the Google-certified CMP installed, if any.
 */
@interface ALCMPService : NSObject

/**
 * @param error @c nil if the flow completed successfully. Otherwise, the error object contains more details about the reason for failure.
 */
typedef void (^ALCMPCompletionHandler) (ALCMPError *_Nullable error);

/**
 * Shows the CMP flow to an existing user.
 * Note that the user's current consent will be reset before the CMP alert is shown.
 *
 * @param completion The completion handler that will be called once the flow finishes showing.
 */
- (void)showCMPForExistingUserWithCompletion:(ALCMPCompletionHandler)completion;

/**
 * @return @c YES if a supported CMP is integrated.
 */
- (BOOL)hasSupportedCMP;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
