//
//  ISNControllerManagerSwiftFacade.h
//  SSASDKXCFramework
//
//  Created by Ariel Barsheshet on 24/07/2023.
//  Copyright © 2023 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@class MessageToController, CallbackToNative;
@protocol ISNControllerMessageListener;

@interface ISNControllerManagerSwiftFacade : NSObject

- (void)sendMessage:(MessageToController *)message
    callbackHandler:(void (^)(CallbackToNative *))callbackHandler;

- (void)setControllerMessageListenerWithAdId:(NSString *)adId
                                    listener:(id<ISNControllerMessageListener>)listener;

- (void)removeControllerMessageListenerWithAdId:(NSString *)adId;

@end
