//
//  ISAAdFormat.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

/**
 Enum representing available ad formats.
 */
typedef NS_ENUM(NSUInteger, ISAAdFormatType) {
  ISAAdFormatTypeInterstitial,
  ISAAdFormatTypeRewarded,
  ISAAdFormatTypeBanner
};

/**
 Class representing an ad format.
 */
@interface ISAAdFormat : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

/**
 The ad format type.
 */
@property(readonly, nonatomic) ISAAdFormatType adFormatType;

/**
 Initializes with the given ad format type.

 @param adFormatType the ad format type to represent.
 */
- (instancetype)initWithAdFormatType:(ISAAdFormatType)adFormatType;

@end

NS_ASSUME_NONNULL_END
