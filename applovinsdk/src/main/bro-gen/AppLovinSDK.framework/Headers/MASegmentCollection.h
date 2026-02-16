//
//  MASegmentCollection.h
//  AppLovinSDK
//

#import <AppLovinSDK/MASegment.h>

NS_ASSUME_NONNULL_BEGIN

@class MASegmentCollectionBuilder;

/**
 * The @c MASegmentCollection class contains a collection of @c MASegment objects.
 */
@interface MASegmentCollection : NSObject

/**
 * Builder block used to create an @c MASegmentCollection object.
 */
typedef void (^MASegmentCollectionBuilderBlock) (MASegmentCollectionBuilder *builder);

/**
 * An array of @c MASegment objects.
 */
@property (nonatomic, copy, readonly) NSArray<MASegment *> *segments;

/**
 * Creates a @c MASegmentCollection object from the builder in the builderBlock.
 *
 * @return a @c MASegmentCollection object.
 */
+ (instancetype)segmentCollectionWithBuilderBlock:(NS_NOESCAPE MASegmentCollectionBuilderBlock)builderBlock;

/**
 * Creates a builder object for @c MASegmentCollection.
 * Please call @c -build to create a @c MASegmentCollection object.
 *
 * @return a @c MASegmentCollectionBuilder object.
 */
+ (MASegmentCollectionBuilder *)builder;

@end

/**
 * Builder class used to create an @c MASegmentCollection object.
 */
@interface MASegmentCollectionBuilder : NSObject

/**
 * Adds a @c MASegment to the collection.
 *
 * @param segment The @c MASegment to add.
 */
- (void)addSegment:(MASegment *)segment;

/**
 * Builds a @c MASegmentCollection object from the builder properties' values.
 *
 * @return a @c MASegmentCollection object.
 */
- (MASegmentCollection *)build;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
