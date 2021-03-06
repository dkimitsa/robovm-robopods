// Copyright 2004-present Facebook. All Rights Reserved.
//
// You are hereby granted a non-exclusive, worldwide, royalty-free license to use,
// copy, modify, and distribute this software in source code or binary form for use
// in connection with the web services and APIs provided by Facebook.
//
// As with any software that integrates with the Facebook platform, your use of
// this software is subject to the Facebook Developer Principles and Policies
// [http://developers.facebook.com/policy/]. This copyright notice shall be
// included in all copies or substantial portions of the software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

/***
 * This is a bridge file for Audience Network Unity SDK.
 *
 * Please refer to FBAdSettings.h for full documentation of the API.
 *
 * This file may be used to build your own Audience Network iOS SDK wrapper,
 * but note that we don't support customisations of the Audience Network codebase.
 *
 ***/

#import <FBAudienceNetwork/FBAdBridgeCommon.h>

NS_ASSUME_NONNULL_BEGIN

FB_EXTERN_C_BEGIN

FB_EXPORT void FBAdSettingsBridgeAddTestDevice(char const *deviceID);
FB_EXPORT void FBAdSettingsBridgeSetURLPrefix(char const *urlPrefix);
FB_EXPORT void FBAdSettingsBridgeSetIsChildDirected(bool isChildDirected);
FB_EXPORT void FBAdSettingsBridgeSetMixedAudience(bool mixedAudience);
FB_EXPORT void FBAdSettingsBridgeSetAdvertiserTrackingEnabled(bool advertiserTrackingEnabled);
FB_EXPORT void FBAdSettingsBridgeSetDataProcessingOptions(char const *_Nonnull options[_Nonnull], int length);
FB_EXPORT void FBAdSettingsBridgeSetDetailedDataProcessingOptions(char const *_Nonnull options[_Nonnull],
                                                                  int length,
                                                                  int country,
                                                                  int state);
FB_EXPORT char const *__nullable FBAdSettingsBridgeGetBidderToken(void);

FB_EXTERN_C_END

NS_ASSUME_NONNULL_END
