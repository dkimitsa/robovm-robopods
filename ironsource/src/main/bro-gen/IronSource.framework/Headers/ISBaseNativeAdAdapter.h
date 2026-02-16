//
//  ISBaseNativeAdAdapter.h
//  IronSource
//
//  Created by Hadar Pur on 06/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISBaseAdUnitAdapter.h"
#import "ISNativeAdAdapterProtocol.h"
#import "ISNativeAdProperties.h"

NS_ASSUME_NONNULL_BEGIN

@interface ISBaseNativeAdAdapter : ISBaseAdUnitAdapter <ISNativeAdAdapterProtocol>

- (ISNativeAdProperties *)getNativeAdPropertiesWithAdapterConfig:
    (nonnull ISAdapterConfig *)adapterConfig;

@end

NS_ASSUME_NONNULL_END
