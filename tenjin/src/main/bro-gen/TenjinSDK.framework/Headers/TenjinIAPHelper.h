//
// Created by Tenjin on 2019-10-02.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <StoreKit/StoreKit.h>


typedef void (^ProductCompletion)(SKProduct *product);

@interface TenjinIAPHelper : NSObject <SKProductsRequestDelegate>

+ (void)extractPropertiesFromProduct:(SKProduct *)product
                                  to:(NSMutableDictionary *)props;

- (void)getProductFor:(NSString *)productIdentifier
       withCompletion:(ProductCompletion)completion;
@end
