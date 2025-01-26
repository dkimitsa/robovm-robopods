//
//  MAMediatedNetworkInfo.h
//  AppLovinSDK
//
//  Created by Ritam Sarmah on 2/8/21.
//

#import <AppLovinSDK/MAAdapter.h>

NS_ASSUME_NONNULL_BEGIN

/**
 * An enum describing the adapter's initialization status.
 */
typedef NS_ENUM(NSInteger, MAMediatedNetworkInfoInitializationStatus)
{
    /**
     * The adapter is not initialized. Note: networks need to be enabled for an ad unit id to be initialized.
     */
    MAMediatedNetworkInfoInitializationStatusAdapterNotInitialized = -4,
    
    /**
     * The 3rd-party SDK does not have an initialization callback with status.
     */
    MAMediatedNetworkInfoInitializationStatusDoesNotApply = -3,
    
    /**
     * The 3rd-party SDK is currently initializing.
     */
    MAMediatedNetworkInfoInitializationStatusInitializing = -2,
    
    /**
     * The 3rd-party SDK explicitly initialized, but without a status.
     */
    MAMediatedNetworkInfoInitializationStatusInitializedUnknown = -1,
    
    /**
     * The 3rd-party SDK initialization failed.
     */
    MAMediatedNetworkInfoInitializationStatusInitializedFailure = 0,
    
    /**
     * The 3rd-party SDK initialization was successful.
     */
    MAMediatedNetworkInfoInitializationStatusInitializedSuccess = 1
};

/**
 * This class represents information for a mediated network.
 */
@interface MAMediatedNetworkInfo : NSObject

/**
 * The name of the mediated network.
 */
@property (nonatomic, copy, readonly) NSString *name;

/**
 * The class name of the adapter for the mediated network.
 */
@property (nonatomic, copy, readonly) NSString *adapterClassName;

/**
 * The version of the adapter for the mediated network.
 */
@property (nonatomic, copy, readonly) NSString *adapterVersion;

/**
 * The version of the mediated network’s SDK.
 */
@property (nonatomic, copy, readonly) NSString *sdkVersion;

/**
 * The initialization status of the mediated network's SDK.
 */
@property (nonatomic, assign, readonly) MAMediatedNetworkInfoInitializationStatus initializationStatus;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
