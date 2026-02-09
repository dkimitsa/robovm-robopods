//
//  ISNativeAdProperties.h
//  IronSource
//
//  Created by Hadar Pur on 06/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAdOptionsPosition.h"
#import "ISAdapterConfig.h"

@interface ISNativeAdProperties : NSObject

@property(nonatomic, assign, readonly) ISAdOptionsPosition adOptionsPosition;

- (instancetype)initWithAdapterConfig:(ISAdapterConfig *)adapterConfig;
- (instancetype)initWithServerConfig:(NSDictionary *)serverConfig;
- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@end
