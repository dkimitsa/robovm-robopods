//
//  ISAdapterAdViewDelegate.h
//  IronSource
//
//  Created by Guy Lis on 27/03/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#ifndef ISAdapterAdViewDelegate_h
#define ISAdapterAdViewDelegate_h

#import <UIKit/UIKit.h>
#import "ISAdapterAdDelegate.h"

@protocol ISAdapterAdViewDelegate <ISAdapterAdDelegate>

// mandatory callbacks

/**
 * @param view the view that was loaded
 */
- (void)adDidLoadWithView:(UIView *)view;

/**
 * @param view the view that was loaded
 * @param extraData custom data
 */
- (void)adDidLoadWithView:(UIView *)view extraData:(NSDictionary<NSString *, id> *)extraData;

// optional callbacks (must be implemented in the adapter but can have empty implementation)

/**
 * This method should be invoked before the user is taken out of the application after a click
 */
- (void)adWillLeaveApplication;

/**
 * This method should be invoked before the user is taken out of the application after a click
 * @param extraData custom data
 */
- (void)adWillLeaveApplicationWithExtraData:(NSDictionary<NSString *, id> *)extraData;

/**
 * This method should be invoked after the ad view presents fullscreen content
 */
- (void)adWillPresentScreen;

/**
 * This method should be invoked after the ad view presents fullscreen content
 * @param extraData custom data
 */
- (void)adWillPresentScreenWithExtraData:(NSDictionary<NSString *, id> *)extraData;

/**
 * This method should be invoked after the fullscreen content is dismissed
 */
- (void)adDidDismissScreen;

/**
 * This method should be invoked after the fullscreen content is dismissed
 * @param extraData custom data
 */
- (void)adDidDismissScreenWithExtraData:(NSDictionary<NSString *, id> *)extraData;
@end

#endif /* ISAdapterAdViewDelegate_h */
