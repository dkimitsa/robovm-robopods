#import <UnityAds/UnityAdsInitializationDelegate.h>
#import <UnityAds/UnityAdsLoadDelegate.h>
#import <UnityAds/UnityAdsShowDelegate.h>
#import <UnityAds/UADSLoadOptions.h>
#import <UnityAds/UADSShowOptions.h>
#import <UIKit/UIKit.h>

#ifdef UNITYADS_INTERNAL
#import <OMIDImports.h>
#endif

NS_ASSUME_NONNULL_BEGIN

@interface UnityServices : NSObject

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)initialize NS_UNAVAILABLE;
/**
 *  Initializes UnityAds. UnityAds should be initialized when app starts.
 *
 *  @param gameId   Unique identifier for a game, given by Unity Ads admin tools or Unity editor.
 *  @param testMode Set this flag to `YES` to indicate test mode and show only test ads.
 *  @param initializationDelegate Delegate for UnityAdsInitializationDelegate callbacks
 */
+ (void)        initialize: (NSString *)gameId
                  testMode: (BOOL)testMode
    initializationDelegate: (nullable id<UnityAdsInitializationDelegate>)initializationDelegate;

/**
 *  Get the current debug status of `UnityAds`.
 *
 *  @return If `YES`, `UnityAds` will provide verbose logs.
 */
+ (BOOL)      getDebugMode;

/**
 *  Set the logging verbosity of `UnityAds`. Debug mode indicates verbose logging.
 *  @warning Does not relate to test mode for ad content.
 *  @param enableDebugMode `YES` for verbose logging.
 */
+ (void)setDebugMode: (BOOL)enableDebugMode;

/**
 *  Check to see if the current device supports using Unity Ads.
 *
 *  @return If `NO`, the current device cannot initialize `UnityAds` or show ads.
 */
+ (BOOL)      isSupported;

/**
 *  Check the version of this `UnityAds` SDK
 *
 *  @return String representing the current version name.
 */
+ (NSString *)getVersion;

/**
 *  Check that `UnityAds` has been initialized. This might be useful for debugging initialization problems.
 *
 *  @return If `YES`, Unity Ads has been successfully initialized.
 */
+ (BOOL)      isInitialized;

+ (void)load: (NSString *)placementId options: (UADSLoadOptions *)options loadDelegate: (nullable id<UnityAdsLoadDelegate>)loadDelegate;

+ (void)show: (UIViewController *)viewController placementId: (NSString *)placementId options: (UADSShowOptions *)options showDelegate: (nullable id<UnityAdsShowDelegate>)showDelegate;

+ (NSString *__nullable)getToken;
+ (void)getToken: (void (^)(NSString *_Nullable))completion;

@end

NS_ASSUME_NONNULL_END
