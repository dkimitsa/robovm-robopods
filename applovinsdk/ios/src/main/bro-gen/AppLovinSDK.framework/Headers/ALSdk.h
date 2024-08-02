//
//  ALSdk.h
//  AppLovinSDK
//
//  Created by Basil Shikin on 2/1/12.
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

@class ALAdService;
@class ALCMPService;
@class ALEventService;
@class ALSdkConfiguration;
@class ALSdkInitializationConfiguration;
@class ALSdkSettings;
@class MAMediatedNetworkInfo;
@class MASegmentCollection;

NS_ASSUME_NONNULL_BEGIN

/**
 * This is a base class for the AppLovin iOS SDK.
 */
@interface ALSdk : NSObject


#pragma mark - High Level SDK Properties

/**
 * The current version of the SDK. The value is in the format of "<var>Major</var>.<var>Minor</var>.<var>Revision</var>".
 */
@property (class, nonatomic, copy, readonly) NSString *version;

/**
 * The current version of the SDK in numeric format.
 */
@property (class, nonatomic, assign, readonly) NSUInteger versionCode;

/**
 * This SDK’s SDK key.
 */
@property (nonatomic, copy, readonly) NSString *sdkKey;

/**
 * This SDK’s SDK settings.
 */
@property (nonatomic, strong, readonly) ALSdkSettings *settings;

/**
 * The SDK configuration object that the SDK creates when you initialize the SDK.
 */
@property (nonatomic, strong, readonly) ALSdkConfiguration *configuration;

/**
 * @deprecated This property has been moved to @c ALSdkSettings and will be removed in a future SDK version.
 */
@property (nonatomic, copy, nullable) NSString *userIdentifier __deprecated_msg("This property has been moved to @c ALSdkSettings and will be removed in a future SDK version.");

/**
 * The @c MASegmentCollection object that the SDK had been initialized with.
 */
@property (nonatomic, strong, readonly, nullable) MASegmentCollection *segmentCollection;

#pragma mark - SDK Services

/**
 * The ad service, which loads and displays ads from AppLovin servers.
 */
@property (nonatomic, strong, readonly) ALAdService *adService;

/**
 * The AppLovin event service, which tracks post-install user events.
 *
 * @return Event service. Guaranteed not to be @c NULL.
 */
@property (nonatomic, strong, readonly) ALEventService *eventService;

/**
 * The CMP service, which provides direct APIs for interfacing with the Google-certified CMP installed, if any.
 *
 * @return CMP service. Guaranteed not to be @c NULL.
 */
@property (nonatomic, strong, readonly) ALCMPService *cmpService;

#pragma mark - MAX

/**
 * The mediation provider. Set this either by using one of the provided strings in ALMediationProvider.h, or your own string if you do not find an applicable one there.
 *
 * @deprecated This property has been moved to @c ALSdkInitializationConfiguration and will be removed in a future SDK version.
 */
@property (nonatomic, copy, nullable) NSString *mediationProvider __deprecated_msg("This setter has been moved to @c ALSdkInitializationConfiguration and will be removed in a future SDK version.");

/**
 * The list of available mediation networks, as an array of @c MAMediatedNetworkInfo objects.
 */
@property (nonatomic, strong, readonly) NSArray<MAMediatedNetworkInfo *> *availableMediatedNetworks;

/**
 * Present the mediation debugger UI.
 * This debugger tool provides the status of your integration for each third-party ad network.
 *
 * @see <a href="https://developers.applovin.com/en/ios/testing-networks/mediation-debugger/">MAX Integration Guide ⇒ iOS ⇒ Testing Networks ⇒ Mediation Debugger</a>
 */
- (void)showMediationDebugger;

/**
 * Present the mediation debugger UI.
 * This debugger tool provides the status of your integration for each third-party ad network.
 *
 * @see <a href="https://developers.applovin.com/en/ios/testing-networks/mediation-debugger/">MAX Integration Guide ⇒ iOS ⇒ Testing Networks ⇒ Mediation Debugger</a>
 *
 * @param amazonAdSizes A map of the MAX Ad Unit ID to Amazon Publisher Services' @c DTBAdSize.
 */
- (void)showMediationDebuggerWithAmazonAdSize:(nullable NSDictionary<NSString *, NSArray/*DTBAdSize*/ *> *)amazonAdSizes;

/**
 * Present the Creative Debugger UI.
 * This debugger tool provides information for recently displayed ads.
 */
- (void)showCreativeDebugger;

#pragma mark - SDK Initialization

/**
 * The sort of callback that the SDK calls when it finishes initializing.
 */
typedef void (^ALSdkInitializationCompletionHandler)(ALSdkConfiguration *configuration);

/**
 * Whether the SDK has fully been initialized without errors and the completion callback called.
 */
@property (nonatomic, assign, readonly, getter=isInitialized) BOOL initialized;

/**
 * Gets a shared instance of AppLovin SDK.
 *
 * @return The shared instance of AppLovin’s SDK, or @c nil (indicating an error) if the SDK key is not set in the application’s @code Info.plist @endcode.
 */
+ (ALSdk *)shared;

/**
 * Initializes the SDK with the given initialization configuration and completion block.
 *
 * The SDK invokes the callback on the main thread.
 *
 * @param initializationConfiguration  The configuration to initialize the SDK with.
 * @param completionHandler                        The callback that the SDK will call when the SDK finishes initializing.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/integration#initialize-the-sdk">MAX Integration Guide ⇒ iOS ⇒ Overview ⇒ Integration ⇒ Initialize the SDK</a>
 */
- (void)initializeWithConfiguration:(ALSdkInitializationConfiguration *)initializationConfiguration completionHandler:(nullable ALSdkInitializationCompletionHandler)completionHandler;

- (instancetype)init __attribute__((unavailable("Use +[ALSdk shared].")));
+ (instancetype)new NS_UNAVAILABLE;

@end

@interface ALSdk (Deprecated)

- (void)setPluginVersion:(NSString *)pluginVersion __deprecated_msg("This method is deprecated and will be removed in a future SDK version. (see ALSdkInitializationConfiguration.pluginVersion)");

/**
 * Initializes the SDK.
 */
- (void)initializeSdk __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` instead.");

/**
 * Initializes the SDK with a given completion block.
 *
 * The SDK invokes the callback on the main thread.
 *
 * @param completionHandler The callback that the SDK will call when the SDK finishes initializing.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/integration#initialize-the-sdk">MAX Integration Guide ⇒ iOS ⇒ Overview ⇒ Integration ⇒ Initialize the SDK</a>
 */
- (void)initializeSdkWithCompletionHandler:(nullable ALSdkInitializationCompletionHandler)completionHandler __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` instead.");

/**
 * Initializes the default instance of AppLovin SDK.
 *
 * @warning Make sure your SDK key is set in the application’s @code Info.plist @endcode under the property @c AppLovinSdkKey.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/integration#initialize-the-sdk">MAX Integration Guide ⇒ iOS ⇒ Overview ⇒ Integration ⇒ Initialize the SDK</a>
 */
+ (void)initializeSdk __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` instead.");

/**
 * Initializes the default instance of AppLovin SDK.
 *
 * @warning Make sure your SDK key is set in the application’s @code Info.plist @endcode under the property @c AppLovinSdkKey.
 *
 * @param completionHandler The callback that the SDK will run on the main queue when the SDK finishes initializing.
 *
 * @see <a href="https://developers.applovin.com/en/ios/overview/integration#initialize-the-sdk">MAX Integration Guide ⇒ iOS ⇒ Overview ⇒ Integration ⇒ Initialize the SDK</a>
 */
+ (void)initializeSdkWithCompletionHandler:(nullable ALSdkInitializationCompletionHandler)completionHandler __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` instead.");

/**
 * Gets a shared instance of AppLovin SDK.
 *
 * @warning Make sure your SDK key is set in the application’s @code Info.plist @endcode under the property @c AppLovinSdkKey.
 *
 * @param settings An SDK settings object.
 *
 * @return The shared instance of AppLovin’s SDK, or @c nil (indicating an error) if the SDK key is not set in the application’s @code Info.plist @endcode.
 */
+ (nullable ALSdk *)sharedWithSettings:(ALSdkSettings *)settings __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `+[ALSdk shared]` and initialize with `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` as soon as possible");

/**
 * Gets an instance of AppLovin SDK by using an SDK key.
 *
 * @param key SDK key to use for the instance of the AppLovin SDK.
 *
 * @return An instance of AppLovin’s SDK, or @c nil (indicating an error) if @c key is not set.
 */
+ (nullable ALSdk *)sharedWithKey:(NSString *)key __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `+[ALSdk shared]` and initialize with `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` as soon as possible");

/**
 * Gets an instance of AppLovin SDK by using an SDK key and providing SDK settings.
 *
 * @param key       SDK key to use for the instance of the AppLovin SDK.
 * @param settings  An SDK settings object.
 *
 * @return An instance of AppLovin’s SDK, or @c nil (indicating an error) if @c key is not set.
 */
+ (nullable ALSdk *)sharedWithKey:(NSString *)key settings:(ALSdkSettings *)settings __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please use `+[ALSdk shared]` and initialize with `-[[ALSdk shared] initializeWithConfiguration:completionHandler:]` as soon as possible");
@end

NS_ASSUME_NONNULL_END
