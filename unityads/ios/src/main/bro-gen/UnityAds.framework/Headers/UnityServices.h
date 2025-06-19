#import <UnityAds/UnityAdsInitializationDelegate.h>
#import <UnityAds/UnityAdsLoadDelegate.h>
#import <UnityAds/UnityAdsShowDelegate.h>
#import <UnityAds/UADSLoadOptions.h>
#import <UnityAds/UADSShowOptions.h>
#import <UnityAds/UADSAdFormat.h>
#import <UIKit/UIKit.h>

#ifdef UNITYADS_INTERNAL
#import <OMIDImports.h>
#endif

NS_ASSUME_NONNULL_BEGIN

@interface UnityServices : NSObject

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)initialize NS_UNAVAILABLE;
+ (void)        initialize: (NSString *)gameId
                  testMode: (BOOL)testMode
    initializationDelegate: (nullable id<UnityAdsInitializationDelegate>)initializationDelegate;
+ (BOOL)getDebugMode;
+ (void)setDebugMode: (BOOL)enableDebugMode;
+ (BOOL)isSupported;
+ (NSString *)getVersion;
+ (BOOL)isInitialized;
+ (BOOL)adsGatewayEnabled;
+ (void)load: (NSString *)placementId options: (UADSLoadOptions *)options loadDelegate: (nullable id<UnityAdsLoadDelegate>)loadDelegate;
+ (void)show: (UIViewController *)viewController placementId: (NSString *)placementId options: (UADSShowOptions *)options showDelegate: (nullable id<UnityAdsShowDelegate>)showDelegate;
+ (NSString *__nullable)getToken;
+ (void)getToken: (void (^)(NSString *_Nullable))completion;
+ (void)getToken:(UADSAdFormat)adFormat completion:(void (^)(NSString *_Nullable))completion;

@end

NS_ASSUME_NONNULL_END
