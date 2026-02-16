//
//  LPMConfiguration.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface LPMConfiguration : NSObject

@property(nonatomic, assign) BOOL isAdQualityEnabled;
@property(nonatomic, strong, nullable) NSString *ab;

@end

NS_ASSUME_NONNULL_END
