//
//  ISSetAPSDataProtocol.h
//  IronSource
//
//  Created by Sveta Itskovich on 29/11/2021.
//  Copyright © 2021 IronSource. All rights reserved.
//

#ifndef ISSetAPSDataProtocol_h
#define ISSetAPSDataProtocol_h

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@protocol ISSetAPSDataProtocol <NSObject>

- (void)setAPSDataWithAdUnit:(NSString *)adUnit apsData:(NSDictionary *)apsData;

@end

NS_ASSUME_NONNULL_END

#endif /* ISSetAPSDataProtocol_h */
