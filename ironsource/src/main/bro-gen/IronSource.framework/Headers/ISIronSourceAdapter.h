//
//  ISIronSourceAdapter.h
//  IronSource
//
//  Created by Dor Alon on 07/03/2019.
//  Copyright © 2019 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISBaseAdapter+Internal.h"

@interface ISIronSourceAdapter : ISBaseAdapter

- (void)initSDK:(ISAdapterConfig *)adapterConfig;

- (NSDictionary *)createInitExtraParams;

@end
