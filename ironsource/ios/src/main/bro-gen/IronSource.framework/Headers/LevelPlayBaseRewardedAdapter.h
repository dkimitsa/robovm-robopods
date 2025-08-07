//
//  LevelPlayBaseRewardedAdapter.h
//  Pods
//
//  Created by Maoz Elbaz on 09/05/2025.
//

#ifndef LevelPlayBaseRewardedAdapter_h
#define LevelPlayBaseRewardedAdapter_h

#import "ISBaseRewardedVideo.h"
#import "ISBiddingDataProtocol.h"
NS_ASSUME_NONNULL_BEGIN

@interface LevelPlayBaseRewardedAdapter : ISBaseRewardedVideo <ISBiddingDataProtocol>

- (NSString *)dynamicUserId;

@end

NS_ASSUME_NONNULL_END

#endif /* LevelPlayBaseRewardedAdapter_h */
