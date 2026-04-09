//
//  GoogleMobileAdsDefines.h
//  Google Mobile Ads SDK
//
//  Copyright 2021 Google LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

#define GAD_DEPRECATED_MSG_ATTRIBUTE(s) __attribute__((deprecated(s)))
#define GAD_DEPRECATED_MSG_REPLACEMENT_ATTRIBUTE(message, replacement) \
  __attribute__((deprecated(message, #replacement)))
#define GAD_BOXABLE __attribute__((objc_boxable))
