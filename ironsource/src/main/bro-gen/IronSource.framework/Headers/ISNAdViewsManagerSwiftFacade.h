//
//  ISNAdViewManagmentProtocol.h
//  SSASDKXCFramework
//
//  Created by Ariel Barsheshet on 27/07/2023.
//  Copyright © 2023 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@class UIView;

@protocol ISNAdViewsManagerSwiftFacade

- (UIView *)getAdViewById:(NSString *)adViewId;

@end

@interface ISNAdViewsManagerSwiftFacade : NSObject <ISNAdViewsManagerSwiftFacade>
@end
