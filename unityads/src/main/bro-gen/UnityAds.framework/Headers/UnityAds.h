#import <Foundation/Foundation.h>

/**
 *  This is an umbrella header, pls modify it with caution ;)
 */

#ifndef UnityAds_h
#define UnityAds_h

FOUNDATION_EXPORT double UnityAdsModuleVersionNumber;
FOUNDATION_EXPORT const unsigned char UnityAdsModuleVersionString[];

#import <UnityAds/UnityAdsInitializationDelegate.h>
#import <UnityAds/UnityServices.h>
#import <UnityAds/UADSBannerView.h>
#import <UnityAds/UADSBannerViewDelegate.h>
#import <UnityAds/UADSBannerError.h>
#import <UnityAds/UADSPlayerMetaData.h>
#import <UnityAds/UADSMediationMetaData.h>
#import <UnityAds/UnityAdsInitializationError.h>
#import <UnityAds/UnityAdsInitializationDelegate.h>
#import <UnityAds/UnityAdsLoadDelegate.h>
#import <UnityAds/UnityAdsShowDelegate.h>
#import <UnityAds/UADSLoadOptions.h>
#import <UnityAds/UADSShowOptions.h>
#import <UnityAds/UADSBannerLoadOptions.h>
#import <UnityAds/UADSBanner.h>
#import <UnityAds/UnityAdsBannerDelegate.h>
#import <UnityAds/UADSBannerAdRefreshViewDelegate.h>

#import <UnityAds/USRVStorageManager.h>
#import <UnityAds/USRVStorage.h>
#import <UnityAds/UADSGenericError.h>
#import <UnityAds/UADSGenericCompletion.h>
#import <UnityAds/UADSDynamicFunctionInvoker.h>
#import <UnityAds/UADSWebViewEventSender.h>
#import <UnityAds/UADSOfferwallVersionBridge.h>
#import <UnityAds/UADSOfferwallAvailabilityBridge.h>
#import <UnityAds/UADSOfferwallAdsBridge.h>
#import <UnityAds/UADSProxyReflection.h>

#import <UnityAds/InternalAdFormat.h>
#endif /* UnityAds_h */
