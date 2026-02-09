#ifdef UNITYADS_INTERNAL_SWIFT

#import <Foundation/Foundation.h>
#import <UnityAds/UADSWebViewEventSender.h>
#import <UnityAds/UADSGenericCompletion.h>

NS_ASSUME_NONNULL_BEGIN

@interface UADSOfferwallAdsBridge : NSObject
- (instancetype)initWithSender:(id<UADSWebViewEventSender>)sender;

- (void)loadPlacementWithName:(NSString *)placementName
                   completion:(UADSGenericCompletion *)completion;

- (void)showPlacementWithName:(NSString *)placementName
                   completion:(UADSGenericCompletion *)completion;
@end

NS_ASSUME_NONNULL_END
#endif // UNITYADS_INTERNAL_SWIFT
