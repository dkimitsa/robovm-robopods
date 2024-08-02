//
//  ALSdkInitializationConfiguration.h
//  AppLovinSDK
//
//  Created by Chris Cong on 1/22/24.
//

#import <AppLovinSDK/MASegmentCollection.h>

@class ALSdkInitializationConfigurationBuilder;

NS_ASSUME_NONNULL_BEGIN

/**
 *  Builder block used to create an ALSdkInitializationConfiguration object.
 */
typedef void (^ALSdkInitializationConfigurationBuilderBlock) (ALSdkInitializationConfigurationBuilder *builder);

/**
 * This class contains configurable properties for the initialization of the AppLovin SDK.
 * It also reads any values you have already configured in the application's @c Info.plist.
 * To be used in @code [[ALSdk shared] initializeWithConfiguration:completionHandler].
 */
@interface ALSdkInitializationConfiguration : NSObject

@property (nonatomic, copy, readonly, nullable) NSString *sdkKey;
@property (nonatomic, copy, readonly, nullable) NSString *mediationProvider;
@property (nonatomic, copy, readonly, nullable) NSString *pluginVersion;

@property (nonatomic, strong, readonly, nullable) MASegmentCollection *segmentCollection;

@property (nonatomic, copy, readonly) NSArray<NSString *> *testDeviceAdvertisingIdentifiers;
@property (nonatomic, copy, readonly) NSArray<NSString *> *adUnitIdentifiers;

@property (nonatomic, assign, readonly, getter=isExceptionHandlerEnabled) BOOL exceptionHandlerEnabled;

#pragma mark - Initialization

/**
 * Creates a SDK initialization configuration object with the given SDK key.
 * Note: the properties on @c ALSdkInitializationConfiguration are immutable and must be configured on initialization in @c ALSdkInitializationConfigurationBuilder.
 */
+ (instancetype)configurationWithSdkKey:(NSString *)sdkKey;

/**
 * Creates a SDK initialization configuration object constructed from the @c ALSdkInitializationConfigurationBuilder block.
 * You may modify the configuration from within the block.
 */
+ (instancetype)configurationWithSdkKey:(NSString *)sdkKey builderBlock:(nullable NS_NOESCAPE ALSdkInitializationConfigurationBuilderBlock)builderBlock;

/**
 * Creates a builder object for @c ALSdkInitializationConfiguration.
 * Please call @c -build to create a @c ALSdkInitializationConfiguration object.
 *
 * @return a @c ALSdkInitializationConfigurationBuilder object.
 */
+ (ALSdkInitializationConfigurationBuilder *)builderWithSdkKey:(NSString *)sdkKey;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;
@end

#pragma mark - ALSdkInitializationConfiguration Builder

/**
 * Builder class used to create an ALSdkInitializationConfiguration object.
 * This class contains configurable properties for the initialization of the AppLovin SDK.
 */
@interface ALSdkInitializationConfigurationBuilder : NSObject

/**
 * @return SDK key for the AppLovin SDK.
 */
@property (nonatomic, copy, readonly) NSString *sdkKey;

/**
 * The mediation provider. Set this either by using one of the provided strings in ALMediationProvider.h, or your own string if you do not find an
 * applicable one there.
 */
@property (nonatomic, copy, nullable) NSString *mediationProvider;

/**
 * Sets the plugin version for the mediation adapter or plugin.
 */
@property (nonatomic, copy, nullable) NSString *pluginVersion;

/**
 * A readonly property of a @c MASegmentCollection, representing a collection of segments.
 */
@property (nonatomic, strong, nullable) MASegmentCollection *segmentCollection;

/**
 * Enable devices to receive test ads by passing in the advertising identifier (IDFA or IDFV) of each test device.
 * Refer to AppLovin logs for the IDFA or IDFV of your current device.
 */
@property (nonatomic, copy) NSArray<NSString *> *testDeviceAdvertisingIdentifiers;

/**
 * The MAX ad unit IDs that you will use for this instance of the SDK. This initializes third-party SDKs with the credentials configured for these ad unit IDs.
 */
@property (nonatomic, copy) NSArray<NSString *> *adUnitIdentifiers;

/**
 * Whether or not the AppLovin SDK listens to exceptions. Defaults to @c YES.
 */
@property (nonatomic, assign) BOOL exceptionHandlerEnabled;

#pragma mark - Build

/**
 * Builds a @c ALSdkInitializationConfiguration object from the builder properties' values.
 *
 * @return a @c ALSdkInitializationConfiguration object.
 */
- (ALSdkInitializationConfiguration *)build;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;
@end

NS_ASSUME_NONNULL_END
