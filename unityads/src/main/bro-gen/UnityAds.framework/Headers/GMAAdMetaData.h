#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>
#import <UnityAds/UADSScarSignalParameters.h>

NS_ASSUME_NONNULL_BEGIN

@interface GMAAdMetaData : NSObject
@property (nonatomic) GADQueryInfoAdType type;
@property (nonatomic, copy) NSString *placementID;
@property (nonatomic, copy, nullable) NSString *adString;
@property (nonatomic, copy) NSString *adUnitID;
@property (nonatomic, copy) NSString *queryID;
@property (nonatomic, strong) NSNumber *videoLength;
@property (nonatomic, strong) NSString *bannerAdId;
@property (nonatomic, assign) CGSize bannerSize;
@property (nonatomic, copy, nullable) void (^beforeLoad)(id);

- (NSTimeInterval)videoLengthInSeconds;
@end

NS_ASSUME_NONNULL_END
#endif
