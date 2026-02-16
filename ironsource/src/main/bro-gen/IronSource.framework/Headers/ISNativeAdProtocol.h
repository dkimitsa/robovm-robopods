//
//  ISNativeAdProtocol.h
//  IronSource
//
//  Created by Maoz Elbaz on 11/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

@protocol ISNativeAdProtocol <NSObject>

@required

- (void)loadAd;

- (void)destroyAd;

@end
