//
//  ALUnowned.h
//  AppLovinSDK
//
//  Created by Vedant Mehta on 5/29/24.
//

NS_ASSUME_NONNULL_BEGIN

@interface ALUnowned <ObjectType> : NSObject

typedef void (^ObjectBlock) (ObjectType object);

/**
 * Initialize an ALUnowned wrapper by passing an object that is guaranteed to exist until its use.
 *
 * @param object The object that is supposed to be unowned.
 * @param source The class where ALUnowned is being used, for reporting purposes.
 */
- (instancetype)initWithObject:(ObjectType)object source:(NSString *)source;

/**
 * This method only executes the block provided the underlying object exists.
 * If the underlying object has been deallocated, this method will report a memory leak using the @c ALHealthEventsReporter.
 */
- (void)let:(ObjectBlock)block;

- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
