//
//  ISNativeAdDataProtocol.h
//  IronSource
//
//  Created by Hadar Pur on 02/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

#import "ISNativeAdDataImage.h"

@protocol ISNativeAdDataProtocol <NSObject>

@required

@property(nonatomic, strong, nullable) NSString *title;
@property(nonatomic, strong, nullable) NSString *advertiser;
@property(nonatomic, strong, nullable) NSString *body;
@property(nonatomic, strong, nullable) NSString *callToAction;
@property(nonatomic, strong, nullable) ISNativeAdDataImage *icon;

@end
