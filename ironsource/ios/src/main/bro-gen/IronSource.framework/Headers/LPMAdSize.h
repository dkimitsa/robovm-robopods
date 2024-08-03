//
//  LPMAdSize.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

typedef NS_ENUM(NSInteger, LPMAdSizeType) {
  LPMAdSizeBanner,
  LPMAdSizeLarge,
  LPMAdSizeMediumRectangle,
  LPMAdSizeCustom,
  LPMAdSizeLeaderBoard
};

@interface LPMAdSize : NSObject <NSCopying>

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@property(nonatomic, readonly) LPMAdSizeType type;
@property(nonatomic, readonly) NSInteger width;
@property(nonatomic, readonly) NSInteger height;
@property(nonatomic, readonly, copy) NSString* sizeDescription;
@property(nonatomic, readonly) BOOL isAdaptive;

+ (instancetype)bannerSize;
+ (instancetype)largeSize;
+ (instancetype)mediumRectangleSize;
+ (instancetype)leaderBoardSize;
+ (instancetype)customSizeWithWidth:(NSInteger)width height:(NSInteger)height;

/**
 Creates and returns an adaptive ad size for a given width.

 If the provided width is invalid (less than or equal to 0), the method uses the screen width
 based on the device orientation.

 @param width The specified width for which the adaptive ad size is calculated.
 @return An instance of LPMAdSize with the calculated height for the given width, or `nil` if the
 SDK is not initialized.
 */
+ (nullable instancetype)createAdaptiveAdSizeWithWidth:(CGFloat)width;
/**
 Creates and returns an adaptive ad size using the screen width based on the device orientation.

 @return An instance of LPMAdSize with the calculated height for the screen width, or `nil` if the
 SDK is not initialized.
 */
+ (nullable instancetype)createAdaptiveAdSize;

@end

NS_ASSUME_NONNULL_END
