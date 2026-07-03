#import <UnityAds/UADSMetaData.h>

__attribute__((deprecated(
                          "Use MediationInfo (UADSMediationInfo) in InitializationConfiguration (UADSInitializationConfiguration),"
                          " LoadConfiguration (UADSLoadConfiguration), BannerLoadConfiguration (UADSBannerLoadConfiguration)"
                          " and TokenConfiguration (UADSTokenConfiguration) instead."
                          )))
@interface UADSMediationMetaData : UADSMetaData

- (void)setName: (NSString *)mediationNetworkName;
- (void)setVersion: (NSString *)mediationSdkVersion;
- (void)setOrdinal: (int)mediationOrdinal;
- (void)setMissedImpressionOrdinal: (int)missedImpressionOrdinal;

@end
