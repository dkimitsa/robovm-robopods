//
//  ISBaseAdAdapter.h
//  IronSource
//
//  Created by Yonti Makmel on 27/04/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ISAdapterAdDelegate.h"
#import "ISAdapterBaseProtocol.h"
#import "ISAdapterConfig.h"
#import "LevelPlay.h"

@class ISAdData;

NS_ASSUME_NONNULL_BEGIN

@interface ISBaseAdAdapter : NSObject

@property(nonatomic) NSString *adFormat;
@property(nonatomic, readonly) ISAdapterConfig *adapterConfig;
@property(nonatomic, readonly, nullable) NSUUID *adUnitObjectId;

/// @param adFormat the ad format represented by the adapter
/// @param adapterConfig the configuration relevant for the adapter instance
- (instancetype)initWithAdFormat:(NSString *)adFormat
                   adapterConfig:(ISAdapterConfig *)adapterConfig;

/// @param adFormat the ad format represented by the adapter
/// @param adapterConfig the configuration relevant for the adapter instance
/// @param adUnitObjectId the object id for the ad loaded

- (instancetype)initWithAdFormat:(NSString *)adFormat
                   adapterConfig:(ISAdapterConfig *)adapterConfig
                  adUnitObjectId:(nullable NSUUID *)adUnitObjectId;

/// the network sdk version
- (nullable id<ISAdapterBaseProtocol>)getNetworkAdapter;

/**
 * destroy the ad
 *
 * @param adData - data containing the configuration passed from the server and other related
 * parameters passed from the publisher like userId
 */
- (void)destroyAdWithAdData:(ISAdData *)adData;

@end

NS_ASSUME_NONNULL_END
