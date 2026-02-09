//
//  ISNControllerMessageListener.h
//  SSASDK
//
//  Created by Gal Salti on 15/08/2023.
//  Copyright © 2023 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@class MessageToNative;

@protocol ISNControllerMessageListener <NSObject>

- (void)onReceiveWithMessage:(nullable MessageToNative *)message;

@end

NS_ASSUME_NONNULL_END
