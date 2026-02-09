//
//  ISAAdSize.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 Class representing an ad size.
 */
@interface ISAAdSize : NSObject

@property(nonatomic, readonly) CGFloat width;
@property(nonatomic, readonly) CGFloat height;
@property(nonatomic, readonly, copy) NSString *sizeDescription;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 Creates an `ISAAdSize` for a banner ad.
 */
+ (ISAAdSize *)banner;

/**
 Creates an `ISAAdSize` for a large ad.
 */
+ (ISAAdSize *)large;

/**
 Creates an `ISAAdSize` for a medium rectangle ad.
 */
+ (ISAAdSize *)mediumRectangle;

/**
 Creates an `ISAAdSize` for a leaderboard ad.
 */
+ (ISAAdSize *)leaderboard;

@end

NS_ASSUME_NONNULL_END
