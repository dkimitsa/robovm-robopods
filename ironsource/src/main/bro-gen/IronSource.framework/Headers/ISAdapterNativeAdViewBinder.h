//
//  ISAdapterNativeAdViewBinder.h
//  IronSource
//
//  Created by Hadar Pur on 19/06/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISAdapterNativeAdViewBinderProtocol.h"
#import "ISNativeAdViewHolder.h"

@interface ISAdapterNativeAdViewBinder : NSObject <ISAdapterNativeAdViewBinderProtocol>

@property(nonatomic, strong, nullable) ISNativeAdViewHolder *adViewHolder;

@end
