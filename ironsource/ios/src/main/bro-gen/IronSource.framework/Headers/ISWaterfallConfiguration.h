#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@class ISWaterfallConfiguration;

/**
 * Builder for creating an ISWaterfallConfiguration object.
 */
DEPRECATED_MSG_ATTRIBUTE("This class is deprecated and will be removed in version 9.0.0.")
@interface ISWaterfallConfigurationBuilder : NSObject

/**
 * Set a ceiling value to be applied to the AdUnit's waterfall.
 *
 * @param ceiling NSNumber ceiling value in USD.
 * @return ISWaterfallConfigurationBuilder Returns the builder that had the setter called. This is
 * to better chain calls together in swift.
 */
- (ISWaterfallConfigurationBuilder *)setCeiling:(NSNumber *)ceiling;

/**
 * Set a floor value to be applied to the AdUnit's waterfall.
 *
 * @param floor NSNumber floor value in USD.
 * @return ISWaterfallConfigurationBuilder Returns the builder that had the setter called. This is
 * to better chain calls together in swift.
 */
- (ISWaterfallConfigurationBuilder *)setFloor:(NSNumber *)floor;

/**
 * After calling all desired setters use this build method generate an immutable
 * ISWaterfallConfiguration object to passed to the IronSource.SetWaterfallConfiguration api.
 */
- (ISWaterfallConfiguration *)build;

@end

/**
 * Object for waterfall configuration per AdUnit.
 *
 * Example
 * <pre>
 *   ISWaterfallConfigurationBuilder *builder = [ISWaterfallConfiguration builder];
 *   [builder setCeiling:@10.05];
 *   [builder setFloor:@1.10];
 *   ISWaterfallConfiguration *configuration = [builder build];
 * </pre>
 */

DEPRECATED_MSG_ATTRIBUTE("This class is deprecated and will be removed in version 9.0.0.")
@interface ISWaterfallConfiguration : NSObject

/**
 * A NSNumber ceiling to be applied to an AdUnit's waterfall.
 */
@property(nonatomic, strong, readonly) NSNumber *_Nullable ceiling;

/**
 * A NSNumber floor to be applied to an AdUnit's waterfall.
 */
@property(nonatomic, strong, readonly) NSNumber *_Nullable floor;

/**
 * A helper method to get a builder for the ISWaterfallConfiguration class.
 *
 * @return ISWaterfallConfigurationBuilder A builder that can be mutated and used to generate an
 * instance of ISWaterfallConfiguration.
 */
+ (ISWaterfallConfigurationBuilder *)builder;

/**
 * A helper method to get a clear instance of the ISWaterfallConfiguration class. This should be
 * used to clear previously set settings if you no longer want the settings applied.
 *
 * @return ISWaterfallConfiguration An empty instance of ISWaterfallConfiguration class that can be
 * used to clear previously set settings.
 */
+ (ISWaterfallConfiguration *)clear;

@end

NS_ASSUME_NONNULL_END
