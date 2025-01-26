//
//  ALUtils.h
//  AppLovinSDK
//
//  Created by Thomas So on 1/1/22.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

/**
 * Class containing utility functions for convenience of adapters development and integration.
 */
@interface ALUtils : NSObject

/**
 * @return The currently visible top view controller from the app's window(s).
 */
+ (UIViewController *)topViewControllerFromKeyWindow;

/**
 * @return The app's current @c UIInterfaceOrientationMask.
 */
+ (UIInterfaceOrientationMask)currentOrientationMask;

/**
 * @return The device display dimensions, respecting safe area.
 */
+ (CGRect)deviceSafeAreaDimensions;

/**
 * @return If the app is running in an iOS simulator.
 */
@property (class, nonatomic, readonly, getter=isSimulator) BOOL simulator;

/**
 * Determines if a given version is within a specified range, inclusive of the range boundaries.
 *
 * This method compares a version string with optional minimum and maximum version strings.
 * If the version is empty, the method returns @c YES. The method converts the version strings
 * to version codes using a utility method for comparison.
 *
 * @param version The version string to check. If @c nil or empty, the method returns @c YES.
 * @param minVersion The minimum version string (inclusive), or @c nil if no minimum version is specified.
 * @param maxVersion The maximum version string (inclusive), or @c nil if no maximum version is specified.
 *
 * @return @c YES if the version is within the specified range (inclusive), or if no minimum/maximum version is specified. @c NO if the version is outside the range.
 */
+ (BOOL)isInclusiveVersion:(NSString *)version
             forMinVersion:(nullable NSString *)minVersion
                maxVersion:(nullable NSString *)maxVersion;

- (instancetype)init NS_UNAVAILABLE;

@end

@interface NSString (ALSdk)
@property (nonatomic, assign, readonly, getter=al_isValidString) BOOL al_validString;
@property (nonatomic, assign, readonly, getter=al_isValidURL) BOOL al_validURL;
- (BOOL)al_isEqualToStringIgnoringCase:(NSString *)otherString;
@end

@interface NSDictionary (ALSdk)
- (BOOL)al_boolForKey:(NSString *)key;
- (BOOL)al_boolForKey:(NSString *)key defaultValue:(BOOL)defaultValue;
- (nullable NSNumber *)al_numberForKey:(NSString *)key;
- (nullable NSNumber *)al_numberForKey:(NSString *)key defaultValue:(nullable NSNumber *)defaultValue;
- (nullable NSString *)al_stringForKey:(NSString *)key;
- (nullable NSString *)al_stringForKey:(NSString *)key defaultValue:(nullable NSString *)defaultValue;
- (nullable NSArray<NSNumber *> *)al_numberArrayForKey:(NSString *)key;
- (nullable NSArray<NSNumber *> *)al_numberArrayForKey:(NSString *)key defaultValue:(nullable NSArray<NSNumber *> *)defaultValue;
- (nullable NSArray *)al_arrayForKey:(NSString *)key;
- (nullable NSArray *)al_arrayForKey:(NSString *)key defaultValue:(nullable NSArray *)defaultValue;
- (nullable NSDictionary *)al_dictionaryForKey:(NSString *)key;
- (nullable NSDictionary *)al_dictionaryForKey:(NSString *)key defaultValue:(nullable NSDictionary *)defaultValue;
- (BOOL)al_containsValueForKey:(id)key;
@end

@interface NSNumber (ALSdk)
@property (nonatomic, assign, readonly) NSTimeInterval al_timeIntervalValue;
@end

@interface UIView (ALSdk)
- (void)al_pinToSuperview;
@end

@interface NSDate (ALSdk)
+ (NSTimeInterval)al_timeIntervalNow;
@end

@interface UIImageView (ALSdk)
- (void)al_setImageWithURL:(NSURL *)URL;
@end

NS_ASSUME_NONNULL_END
