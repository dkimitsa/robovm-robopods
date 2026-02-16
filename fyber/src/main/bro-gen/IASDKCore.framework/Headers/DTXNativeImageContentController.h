////
//  DTXNativeImageContentController.h
//  IASDKCore
//
//  Created by DT on 31/07/2025.
//  Copyright © 2025 DT. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <IASDKCore/IAInterfaceBuilder.h>
#import <IASDKCore/IAContentController.h>

NS_ASSUME_NONNULL_BEGIN

@class DTXNativeImageContentController;

@protocol DTXNativeImageContentDelegate <NSObject>

@optional
- (void)nativeImage:(DTXNativeImageContentController * _Nullable)nativeImageContentController loadedImageFromURL:(NSURL * _Nonnull)URL;
- (void)nativeImage:(DTXNativeImageContentController * _Nullable)nativeImageContentController failedToLoadImageFromURL:(NSURL * _Nonnull)URL error:(NSError * _Nonnull)error;
@end


@protocol DTXNativeImageContentControllerBuilder <NSObject>

@required
@property (nonatomic, weak, nullable) id<DTXNativeImageContentDelegate> nativeImageContentDelegate;

@end

@interface DTXNativeImageContentController : IAContentController<IAInterfaceBuilder, DTXNativeImageContentControllerBuilder>

@property (nonatomic) CGFloat mediaAspectRatio;

+ (instancetype _Nullable)build:(void(^ _Nonnull)(id<DTXNativeImageContentControllerBuilder> _Nonnull builder))buildBlock;

@end

NS_ASSUME_NONNULL_END
