//
//  ISBiddingDataProtocol.h
//  IronSource
//
//  Created by Bar David on 07/02/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ISAdData.h"
#import "ISBiddingDataDelegate.h"

#ifndef ISBiddingDataProtocol_h
#define ISBiddingDataProtocol_h

@protocol ISBiddingDataProtocol <NSObject>

/// Collects bidding data for the network. The method supports non-MADU flow. It is duplicated on
/// `AdAdapterBridge` to support MADU flow.
- (void)collectBiddingDataWithAdData:(ISAdData *)adData
                            delegate:(id<ISBiddingDataDelegate>)delegate;

@end

#endif /* ISBiddingDataProtocol_h */
