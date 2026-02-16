//
//  ALAtomicReference.h
//  AppLovinSDK
//
//  Created by Alan Cao on 1/5/24.
//

NS_ASSUME_NONNULL_BEGIN

/**
 * An object reference that may be updated atomically.
 */
@interface ALAtomicReference <ObjectType> : NSObject

/**
 * Returns the current value.
 */
- (nullable ObjectType)get;

/**
 * Unconditionally sets to the given value.
 */
- (void)set:(nullable ObjectType)newValue;

/**
 * Atomically sets to the given value and returns the previous value.
 */
- (nullable ObjectType)getAndSet:(nullable ObjectType)newValue;

/**
 * Atomically sets the value to the given updated value if the current value == the expected value.
 *
 * @param expect The expected value.
 * @param update The new value.
 *
 * @return @c YES if successful. @c NO return indicates that the actual value was not equal to the expected value.
 */
- (BOOL)compareAndSet:(nullable ObjectType)expect update:(nullable ObjectType)update;

/**
 * Creates an instance with the given initial value.
 */
- (instancetype)initWithValue:(nullable ObjectType)initialValue;

@end

NS_ASSUME_NONNULL_END
