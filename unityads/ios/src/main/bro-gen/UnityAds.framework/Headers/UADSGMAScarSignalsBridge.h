#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <UnityAds/UADSScarSignalParameters.h>
#import <UnityAds/UADSGenericCompletion.h>

NS_ASSUME_NONNULL_BEGIN

@interface UADSGMAScarSignalsBridge : NSObject

- (void)getSCARSignals: (NSArray<UADSScarSignalParameters *>*) signalParameters
            completion: (UADSGenericCompletion<NSDictionary<NSString *, NSString *> *>*) completion;

@end

NS_ASSUME_NONNULL_END
#endif
