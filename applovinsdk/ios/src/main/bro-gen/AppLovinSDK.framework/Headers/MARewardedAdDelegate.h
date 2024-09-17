//
//  MARewardedAdDelegate.h
//  AppLovinSDK
//
//  Created by Thomas So on 8/10/18.
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import <AppLovinSDK/MAAdDelegate.h>

@class MAAd;
@class MAReward;

NS_ASSUME_NONNULL_BEGIN

/**
 * This delegate is notified when a user watches a rewarded video and of whether a reward was granted or rejected.
 *
 * @see <a href="https://developers.applovin.com/en/ios/ad-formats/rewarded-ads">MAX Integration Guide ⇒ iOS ⇒ Ad Foramts ⇒ Rewarded Ads</a>
 */
@protocol MARewardedAdDelegate <MAAdDelegate>

/**
 * The SDK invokes this method when a user should be granted a reward.
 *
 * @param ad     Ad for which the reward ad was rewarded.
 * @param reward The reward to be granted to the user.
 */
- (void)didRewardUserForAd:(MAAd *)ad withReward:(MAReward *)reward;

@end

NS_ASSUME_NONNULL_END
