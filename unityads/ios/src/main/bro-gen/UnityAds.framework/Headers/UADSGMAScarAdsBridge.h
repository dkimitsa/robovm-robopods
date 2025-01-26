#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#import <UnityAds/UADSScarSignalParameters.h>
#import <UnityAds/UADSGenericCompletion.h>
#import <UnityAds/GMAAdMetaData.h>
#import <UnityAds/UADSWebViewEventSender.h>

NS_ASSUME_NONNULL_BEGIN

@interface UADSGMAScarAdsBridge : NSObject

- (instancetype)initWithSender:(id<UADSWebViewEventSender>)sender;

- (void)loadAdUsingMetaData: (GMAAdMetaData *)meta
              andCompletion: (UADSAnyCompletion *)completion;

- (void)showAdUsingMetaData: (GMAAdMetaData *)meta
           inViewController: (UIViewController *)viewController;

- (void)removeAdForPlacement:(NSString *)placementId;

@end

NS_ASSUME_NONNULL_END
#endif
