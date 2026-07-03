#import <UnityAds/UADSLoadOptions.h>
#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

__attribute__((deprecated("This class will be removed in a future release. Please use BannerLoadConfiguration (UADSBannerLoadConfiguration) instead.")))
@interface UADSBannerLoadOptions : UADSLoadOptions
@property (nonatomic, assign) CGSize size;

+(instancetype)newBannerLoadOptionsWith:(UADSLoadOptions *)loadOptions size:(CGSize)size;
@end

NS_ASSUME_NONNULL_END
