//
//  ISNativeAdDataImage.h
//  IronSource
//
//  Created by Hadar Pur on 02/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface ISNativeAdDataImage : NSObject

@property(nonatomic, strong, readonly, nullable) UIImage *image;
@property(nonatomic, strong, readonly, nullable) NSURL *url;

- (instancetype)initWithImage:(nullable UIImage *)image url:(nullable NSURL *)url;
- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
