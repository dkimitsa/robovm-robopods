//
//  ISAdapterAdRewardedDelegate.h
//  IronSource
//
//  Created by Bar David on 21/10/2021.
//  Copyright © 2021 IronSource. All rights reserved.
//

#ifndef ISAdapterAdRewardedDelegate_h
#define ISAdapterAdRewardedDelegate_h

#import "ISAdapterAdInteractionDelegate.h"

NS_ASSUME_NONNULL_BEGIN

@protocol ISAdapterAdRewardedDelegate <ISAdapterAdInteractionDelegate>

// mandatory callbacks

- (void)adRewarded;
- (void)adRewardedWithExtraData:(NSDictionary<NSString *, id> *)extraData;

@end

NS_ASSUME_NONNULL_END
#endif /* ISAdapterAdRewardedDelegate_h */
