//
// HelpshiftUserLoginFailureReason.h
// Created for HelpshiftX in 2024
// Copyright © 2024 Helpshift. All rights reserved.
//

#ifndef HelpshiftUserLoginFailureReason_h
#define HelpshiftUserLoginFailureReason_h

/// Possible failure reasons for user login when using loginWithIdentity: method

FOUNDATION_EXPORT NSString *const HelpshiftLoginInProgress;
FOUNDATION_EXPORT NSString *const HelpshiftLoginConfigInvalid;
FOUNDATION_EXPORT NSString *const HelpshiftIdentityTokenInvalid;
FOUNDATION_EXPORT NSString *const HelpshiftIdentitiesDataInvalid;
FOUNDATION_EXPORT NSString *const HelpshiftLoginConfigSizeLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftIdentitiesSizeLimitExceeded;
FOUNDATION_EXPORT NSString *const HelpshiftIdentityFeatureNotEnabled;
FOUNDATION_EXPORT NSString *const HelpshiftUidOrEmailIsMandatory;
FOUNDATION_EXPORT NSString *const HelpshiftIatIsMandatory;
FOUNDATION_EXPORT NSString *const HelpshiftNetworkError;
FOUNDATION_EXPORT NSString *const HelpshiftUnknownError;

#endif /* HelpshiftUserLoginFailureReason_h */
