#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>

typedef NS_OPTIONS(NSInteger, InternalAdFormat) {
    InternalAdFormatUnspecified  = 0,      // Unspecified format, no bits set
    InternalAdFormatInterstitial = 1 << 0, // 1 (bit 0)
    InternalAdFormatRewarded     = 1 << 1, // 2 (bit 1)
    InternalAdFormatBanner       = 1 << 2, // 4 (bit 2)
    InternalAdFormatAll          = InternalAdFormatInterstitial | InternalAdFormatRewarded | InternalAdFormatBanner // Combination of all formats
};
#endif
