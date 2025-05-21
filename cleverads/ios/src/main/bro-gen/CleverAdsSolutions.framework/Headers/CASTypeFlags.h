//
//  CASTypeFlags.h
//  CleverAdsSolutions
//
//  Copyright © 2025 CleverAdsSolutions LTD, CAS.AI. All rights reserved.
//

#ifndef CASTypeFlags_h
#define CASTypeFlags_h
typedef NS_OPTIONS (NSUInteger, CASTypeFlags){
    CASTypeFlagsNone = 0,
    CASTypeFlagsBanner = 1 << 0,
    CASTypeFlagsInterstitial = 1 << 1,
    CASTypeFlagsRewarded = 1 << 2,
    CASTypeFlagsNative = 1 << 3,
    CASTypeFlagsOpenApp __deprecated_enum_msg("Renamed to AppOpen") = 1 << 6,
    CASTypeFlagsAppOpen = 1 << 6,
    CASTypeFlagsEverything = CASTypeFlagsBanner | CASTypeFlagsInterstitial | CASTypeFlagsRewarded
};

#endif /* CASTypeFlags_h */
