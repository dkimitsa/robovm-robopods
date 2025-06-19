//
//  ISContainerParams.h
//  IronSourceSDK
//
//  Created by Maoz Elbaz on 10/01/2024.
//

#ifndef ISContainerParams_h
#define ISContainerParams_h

#import <Foundation/Foundation.h>

DEPRECATED_MSG_ATTRIBUTE("This class will be made private in version 9.0.0.")
@interface ISContainerParams : NSObject

@property(nonatomic, assign) CGFloat width;
@property(nonatomic, assign) CGFloat height;

- (instancetype)initWithWidth:(CGFloat)width height:(CGFloat)height;

@end

#endif /* ISContainerParams_h */
