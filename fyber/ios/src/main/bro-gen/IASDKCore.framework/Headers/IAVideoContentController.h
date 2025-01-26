//
//  IAVideoContentController.h
//  IASDKCore
//
//  Created by Digital Turbine on 15/03/2017.
//  Copyright © 2022 Digital Turbine. All rights reserved.
//

#import <Foundation/Foundation.h>

#import <IASDKCore/IAInterfaceBuilder.h>
#import <IASDKCore/IAContentController.h>

@class IAAdModel;
@protocol IAVideoContentDelegate;

@protocol IAVideoContentControllerBuilder <NSObject>

@required
@property (nonatomic, weak, nullable) id<IAVideoContentDelegate> videoContentDelegate;

@end

@interface IAVideoContentController : IAContentController <IAInterfaceBuilder, IAVideoContentControllerBuilder>

+ (instancetype _Nullable)build:(void(^ _Nonnull)(id<IAVideoContentControllerBuilder> _Nonnull builder))buildBlock;

@property (nonatomic, readwrite, getter=isMuted) BOOL muted;

/**
 *  @brief Deprecated.
 */
- (void)play DEPRECATED_MSG_ATTRIBUTE("This API is deprecated.");

/**
 *  @brief Deprecated.
 */
- (void)pause DEPRECATED_MSG_ATTRIBUTE("This API is deprecated.");

@end
