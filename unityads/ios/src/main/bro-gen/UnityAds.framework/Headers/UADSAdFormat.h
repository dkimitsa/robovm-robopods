#import <Foundation/Foundation.h>

typedef NS_OPTIONS(NSInteger, UADSAdFormat) {
    UADSAdFormatUndefined    = 0,       // Undefined format, no bits set
    UADSAdFormatInterstitial = 1 << 0, // 1 (bit 0)
    UADSAdFormatRewarded     = 1 << 1, // 2 (bit 1)
    UADSAdFormatBanner       = 1 << 2, // 4 (bit 2)
    UADSAdFormatAll          = UADSAdFormatInterstitial | UADSAdFormatRewarded | UADSAdFormatBanner // Combination of all formats
};
