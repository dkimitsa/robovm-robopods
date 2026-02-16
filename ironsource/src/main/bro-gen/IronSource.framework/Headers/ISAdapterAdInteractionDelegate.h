//
//  ISAdapterAdInteractionDelegate.h
//  IronSource
//
//  Created by Bar David on 21/10/2021.
//  Copyright © 2021 IronSource. All rights reserved.
//

#ifndef ISAdapterAdInteractionDelegate_h
#define ISAdapterAdInteractionDelegate_h

#import "ISAdapterAdDelegate.h"

NS_ASSUME_NONNULL_BEGIN

@protocol ISAdapterAdInteractionDelegate <ISAdapterAdDelegate>

// Mandatory callbacks

- (void)adDidClose;
- (void)adDidCloseWithExtraData:(NSDictionary<NSString *, id> *)extraData;

// Optional callbacks
- (void)adDidBecomeVisible;
- (void)adDidBecomeVisibleWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adDidStart;
- (void)adDidStartWithExtraData:(NSDictionary<NSString *, id> *)extraData;

- (void)adDidEnd;
- (void)adDidEndWithExtraData:(NSDictionary<NSString *, id> *)extraData;

@end

NS_ASSUME_NONNULL_END

#endif /* ISAdapterAdInteractionDelegate_h */
