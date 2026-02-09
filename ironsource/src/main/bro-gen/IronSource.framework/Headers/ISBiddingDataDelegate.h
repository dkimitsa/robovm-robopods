//
//  ISBiddingDataDelegate.h
//  IronSource
//
//  Created by Liron Matityahu on 26/12/2022.
//  Copyright © 2022 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol ISBiddingDataDelegate <NSObject>

@required

- (void)successWithBiddingData:(NSDictionary *)biddingData;
- (void)failureWithError:(NSString *)error;

@end
