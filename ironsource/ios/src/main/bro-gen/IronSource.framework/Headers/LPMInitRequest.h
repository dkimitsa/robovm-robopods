//
//  LPMInitRequest.h
//  IronSource
//
//  Copyright © 2024 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface LPMInitRequest : NSObject

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

- (instancetype)initWithAppKey:(NSString *)appKey userId:(nullable NSString *)userId;

- (instancetype)initWithAppKey:(NSString *)appKey
               legacyAdFormats:(NSArray<NSString *> *)legacyAdFormats
                        userId:(nullable NSString *)userId
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

@property(readonly, nonatomic) NSString *appKey;
@property(readonly, nonatomic) NSArray<NSString *> *legacyAdFormats DEPRECATED_MSG_ATTRIBUTE(
    "This parameter will be removed in version 9.0.0.");
@property(readonly, nonatomic, nullable) NSString *userId;

@end

NS_ASSUME_NONNULL_END
