//
//  CleverAdsSolutions.h
//  CleverAdsSolutions
//
//  Copyright © 2025 CleverAdsSolutions LTD, CAS.AI. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <CleverAdsSolutions/CASTypeFlags.h>
#import <CleverAdsSolutions/CASInternalUtils.h>

#define CAS_FRAMEWORK_VERSION @"4.6.2"
#define CAS_FRAMEWORK_CODE 406250

@class CASContentInfo;

/**
 * Called when the user successfully earns a reward by interacting with the ad.
 *
 * This method provides an opportunity to handle the reward event, such as updating the user's rewards balance,
 * unlocking features, or displaying a confirmation message to the user. It is triggered once the user has
 * completed the required interaction (e.g., watching the ad).
 *
 * - Parameter adContent: The ad content associated with the reward, typically the rewarded ad that the user interacted with.
 */
typedef void (^CASUserDidEarnRewardHandler)(CASContentInfo * _Nonnull info);
