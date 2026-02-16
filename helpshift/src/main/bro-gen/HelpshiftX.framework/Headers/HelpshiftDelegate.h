//
//  HelpshiftDelegate.h
//  HelpshiftX
//
//  Copyright © 2019 Helpshift. All rights reserved.
//

#ifndef HelpshiftDelegate_h
#define HelpshiftDelegate_h

#import <Foundation/Foundation.h>

#pragma mark Helpshift Events Names and respective data keys

NS_ASSUME_NONNULL_BEGIN

FOUNDATION_EXPORT NSString *const HelpshiftEventNameWidgetToggle;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataVisible;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameConversationStart;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessage;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameConversationStatus;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataLatestIssueId;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataLatestIssuePublishId;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataIsIssueOpen;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameMessageAdd;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessageType;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessageTypeText;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessageTypeAttachment;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessageBody;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameCSATSubmit;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataRating;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataAdditionalFeedback;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameConversationEnd;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameConversationRejected;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameConversationResolved;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameConversationReopened;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameReceivedUnreadMessageCount;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataUnreadMessageCount;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataUnreadMessageCountIsFromCache;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameSessionStarted;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameSessionEnded;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameUserClickOnAction;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataActionType;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataActionTypeCall;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataActionTypeLink;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataActionData;

FOUNDATION_EXPORT NSString *const HelpshiftEventNameAgentMessageReceived;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataPublishID;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataCreatedTime;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataAttachments;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataURL;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataContentType;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataFileName;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataSize;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessageTypeAppReviewRequest;
FOUNDATION_EXPORT NSString *const HelpshiftEventDataMessageTypeScreenshotRequest;

FOUNDATION_EXPORT NSString *const HelpshiftEventAttributesDataInvalid;
FOUNDATION_EXPORT NSString *const HelpshiftEventUpdateMasterAttributesValidationFailed;
FOUNDATION_EXPORT NSString *const HelpshiftEventUpdateMasterAttributesSyncFailed;
FOUNDATION_EXPORT NSString *const HelpshiftEventAppAttributesLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftEventUpdateAppAttributesValidationFailed;
FOUNDATION_EXPORT NSString *const HelpshiftEventMasterAttributesLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftEventUpdateAppAttributesSyncFailed;
FOUNDATION_EXPORT NSString *const HelpshiftEventAddUserIdentitiesSyncFailed;
FOUNDATION_EXPORT NSString *const HelpshiftEventUserSessionExpired;
FOUNDATION_EXPORT NSString *const HelpshiftEventUserIdentityNotEnabled;
FOUNDATION_EXPORT NSString *const HelpshiftEventRefreshUserCredentials;

/// Constants used for errors in user login failure and other identity related events
FOUNDATION_EXPORT NSString *const HelpshiftInvalidValueType;
FOUNDATION_EXPORT NSString *const HelpshiftInvalidData;
FOUNDATION_EXPORT NSString *const HelpshiftKeyLengthLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftMetadataKeyLengthLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftValueLengthLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftMetadataValueLengthLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftEmptyData;
FOUNDATION_EXPORT NSString *const HelpshiftMetadataEmptyKeyOrValue;
FOUNDATION_EXPORT NSString *const HelpshiftCountLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftMetadataCountLimitExceeded;

#pragma mark Authentication Failure Reasons

/**
 * Possible reasons for authentication failure received in [HelpshiftDelegate authenticationFailedForUserWithReason:] method
 */
typedef NS_ENUM (NSUInteger, HelpshiftAuthenticationFailureReason)
{
    /// Authentication failed as the auth token was not provided
    HelpshiftAuthenticationFailureReasonAuthTokenNotProvided = 0,

    /// Authentication failed as invalid auth token was provided
    HelpshiftAuthenticationFailureReasonInvalidAuthToken,
};

/// Delegate protocol to be implemented for receiving Helpshift events
@protocol HelpshiftDelegate <NSObject>

/**
 * Delegate method that gets called when Helpshift sends events. For possible events,
 * refer : https://developers.helpshift.com/sdkx_ios/delegates/
 *
 * @param eventName The name of the event
 * @param data The data received from the event if any.
 */
- (void) handleHelpshiftEvent:(NSString *)eventName withData:(nullable NSDictionary *)data;

/**
 * Delegate method that gets called when the user authentication fails.
 * Whenever you receive this call, You should be calling the [Helpshift loginUser:] API with valid authToken.
 *
 * @param reason The reason for authentication failure
 *
 */
- (void) authenticationFailedForUserWithReason:(HelpshiftAuthenticationFailureReason)reason;

@end

NS_ASSUME_NONNULL_END

#endif /* HelpshiftWebchatDelegate_h */
