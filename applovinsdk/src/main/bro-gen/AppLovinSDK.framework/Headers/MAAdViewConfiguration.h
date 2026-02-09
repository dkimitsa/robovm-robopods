//
//  MAAdViewConfiguration.h
//  AppLovinSDK
//
//  Created by Matthew Nguyen on 2/26/25.
//

@class MAAdViewConfigurationBuilder;
@class MAAdFormat;

NS_ASSUME_NONNULL_BEGIN

/**
 * Defines the type of adaptive @c MAAdView.
 */
typedef NS_ENUM(NSInteger, MAAdViewAdaptiveType)
{
    /**
     * Default type - standard banner/leader or MREC.
     */
    MAAdViewAdaptiveTypeNone,
    
    /**
     * Adaptive ad view anchored to the screen. The MAX SDK determines the height of the adaptive ad view by invoking @code -[MAAdFormat adaptiveSizeForWidth:] @endcode
     * which results in a height that ranges from 50 to 90 points but does not exceed 15% of the screen height in the current orientation.
     */
    MAAdViewAdaptiveTypeAnchored,
    
    /**
     * Adaptive ad view embedded within scrollable content. The height can extend up to the device height in the current orientation unless you restrict it by setting @c inlineMaximumHeight.
     */
    MAAdViewAdaptiveTypeInline
};

/**
 * Builder block that you invoke to create a @c MAAdViewConfiguration object.
 */
typedef void (^MAAdViewConfigurationBuilderBlock) (MAAdViewConfigurationBuilder *builder);

/**
 * This class contains configurable fields for the @c MAAdView.
 */
@interface MAAdViewConfiguration : NSObject

/**
 * The adaptive type of the @c MAAdView. Defaults to @c MAAdViewAdaptiveTypeNone.
 */
@property (nonatomic, assign, readonly) MAAdViewAdaptiveType adaptiveType;

/**
 * The custom width, in points, for the adaptive @c MAAdView. Defaults to @c -1, which indicates that the width adapts to span the application window.
 * This value is only used when you set @c adaptiveType to either @c MAAdViewAdaptiveTypeAnchored or @c MAAdViewAdaptiveTypeInline.
 */
@property (nonatomic, assign, readonly) CGFloat adaptiveWidth;

/**
 * The maximum height, in points, for an inline adaptive @c MAAdView. Defaults to @c -1, allowing the height to extend up to the device height.
 * This value is only used when you set @c adaptiveType to @c MAAdViewAdaptiveTypeInline.
 */
@property (nonatomic, assign, readonly) CGFloat inlineMaximumHeight;

#pragma mark - Initialization

/**
 * Creates a @c MAAdViewConfiguration object constructed from the @c MAAdViewConfigurationBuilder block.
 * You may modify the configuration from within the block.
 */
+ (instancetype)configurationWithBuilderBlock:(NS_NOESCAPE MAAdViewConfigurationBuilderBlock)builderBlock;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

#pragma mark - MAAdViewConfiguration Builder

/**
 * Builder class that you instantiate to create a @c MAAdViewConfiguration object before you create a @c MAAdView.
 * This class contains properties that you can set to configure the properties of the @c MAAdView that results from the configuration object this class builds.
 */
@interface MAAdViewConfigurationBuilder : NSObject

/**
 * The adaptive type of the @c MAAdView. Defaults to @c MAAdViewAdaptiveTypeNone.
 */
@property (nonatomic, assign) MAAdViewAdaptiveType adaptiveType;

/**
 * The custom width, in points, for the adaptive @c MAAdView. Must not exceed the width of the application window.
 */
@property (nonatomic, assign) CGFloat adaptiveWidth;

/**
 * The custom maximum height, in points, for the inline adaptive @c MAAdView.
 * Must be at least 32 points and no more than the device height in the current orientation. A minimum of 50 points is recommended.
 */
@property (nonatomic, assign) CGFloat inlineMaximumHeight;

#pragma mark - Build

/**
 * Builds a @c MAAdViewConfiguration object from the builder properties' values.
 *
 * @return a @c MAAdViewConfiguration object.
 */
- (MAAdViewConfiguration *)build;

+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
