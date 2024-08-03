//
//  ISBaseAdapter.h
//  IronSource
//
//  Copyright (c) 2015 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "ISAdapterConfig.h"
#import "ISAdapterNetworkDataProtocol.h"
#import "ISBannerAdapterProtocol.h"
#import "ISConcurrentMutableDictionary.h"
#import "ISInterstitialAdapterProtocol.h"
#import "ISLoadWhileShowSupportState.h"
#import "ISNativeAdAdapterProtocol.h"
#import "ISRewardedVideoAdapterProtocol.h"

@interface ISBaseAdapter : NSObject <ISInterstitialAdapterProtocol,
                                     ISRewardedVideoAdapterProtocol,
                                     ISBannerAdapterProtocol,
                                     ISAdapterNetworkDataProtocol,
                                     ISNativeAdAdapterProtocol> {
 @protected
  ISLoadWhileShowSupportState LWSState;
}

@property(nonatomic, strong) NSString *adapterName;
@property(nonatomic, strong) NSString *providerNetworkKey;
@property(strong, nonatomic) NSString *pluginType;
@property(strong, nonatomic) NSString *userId;
@property(strong, nonatomic) ISConcurrentMutableDictionary *adUnitAdapters;

- (instancetype)initAdapter:(NSString *)name;
- (void)earlyInitWithAdapterConfig:(ISAdapterConfig *)adapterConfig;

- (NSString *)sdkVersion;
- (NSString *)version;
- (NSString *)dynamicUserId;

// to be used by adapters that implement each ad unit separately
- (ISLoadWhileShowSupportState)getLWSSupportState:(ISAdapterConfig *)adapterConfig;

- (void)setNetworkData:(id<ISAdapterNetworkData>)networkData;

- (void)setRewardedVideoAdapter:(id<ISRewardedVideoAdapterProtocol>)rewardedVideoAdapter;
- (void)setInterstitialAdapter:(id<ISInterstitialAdapterProtocol>)interstitialAdapter;
- (void)setBannerAdapter:(id<ISBannerAdapterProtocol>)bannerAdapter;
- (void)setNativeAdAdapter:(id<ISNativeAdAdapterProtocol>)nativeAdAdapter;
- (void)setConsent:(BOOL)consent;

- (id<ISRewardedVideoAdapterProtocol>)getRewardedVideoAdapter;
- (id<ISInterstitialAdapterProtocol>)getInterstitialAdapter;
- (id<ISBannerAdapterProtocol>)getBannerAdapter;
- (id<ISNativeAdAdapterProtocol>)getNativeAdAdapter;

- (CGFloat)getAdaptiveHeightWithWidth:(CGFloat)width;

@end
