#import <UnityAds/UADSDictionaryConvertible.h>

__attribute__((deprecated(
                          "This class will be removed in a future release." 
                          " Please use LoadConfiguration (UADSLoadConfiguration) or BannerLoadConfiguration (UADSBannerLoadConfiguration) instead."
                          )))
@interface UADSBaseOptions : NSObject<UADSDictionaryConvertible>

@property (nonatomic, strong, readonly) NSDictionary *dictionary;
@property (nonatomic, readwrite) NSString *objectId;

- (instancetype)init;

@end
