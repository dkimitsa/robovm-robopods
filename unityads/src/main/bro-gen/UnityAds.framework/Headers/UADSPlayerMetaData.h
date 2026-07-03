#import <UnityAds/UADSMetaData.h>

__attribute__((deprecated("Use customRewardString in ShowConfiguration (UADSShowConfiguration) instead.")))
@interface UADSPlayerMetaData : UADSMetaData

- (void)setServerId: (NSString *)serverId;

@end
