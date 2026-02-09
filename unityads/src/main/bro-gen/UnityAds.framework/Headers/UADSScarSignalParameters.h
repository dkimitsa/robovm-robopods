#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

typedef NS_ENUM (NSInteger, GADQueryInfoAdType) {
    GADQueryInfoAdTypeBanner       = 0,
    GADQueryInfoAdTypeInterstitial = 1,
    GADQueryInfoAdTypeRewarded     = 2
};

@interface UADSScarSignalParameters: NSObject
@property (nonatomic, assign) GADQueryInfoAdType adFormat;
@property (nonatomic, strong) NSString *placementId;

- (instancetype)initWithPlacementId: (NSString *)placementId
                           adFormat: (GADQueryInfoAdType)adFormat;


@end

NS_ASSUME_NONNULL_END
#endif
