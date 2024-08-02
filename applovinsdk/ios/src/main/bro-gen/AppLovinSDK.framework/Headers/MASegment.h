//
//  MASegment.h
//  AppLovinSDK
//


NS_ASSUME_NONNULL_BEGIN

/**
 * The @c MASegment class encapsulates a key-value pair, where the key is a @c NSNumber
 * and the value is an array of @c NSNumbers.
 */
@interface MASegment : NSObject

/**
 * The key of the segment. Must be a non-negative number in the range of [0, 32000].
 */
@property (nonatomic, strong, readonly) NSNumber *key;

/**
 * The value(s) associated with the key. Each value must be a non-negative number in the range of [0, 32000].
 */
@property (nonatomic, copy, readonly) NSArray<NSNumber *> *values;

/**
 * Initializes a new @c MASegment with the specified key and value(s).
 *
 * @param key    The key of the segment. Must be a non-negative number in the range of [0, 32000].
 * @param values The value(s) associated with the key. Each value must be a non-negative number in the range of [0, 32000].
 *
 * @return An instance of @c MASegment.
 */
- (instancetype)initWithKey:(NSNumber *)key values:(NSArray<NSNumber *> *)values;
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
