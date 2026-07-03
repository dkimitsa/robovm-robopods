#import <UnityAds/UADSBaseOptions.h>

__attribute__((deprecated("This class will be removed in a future release. Please use LoadConfiguration (UADSLoadConfiguration) instead.")))
@interface UADSLoadOptions : UADSBaseOptions

@property (nonatomic, readwrite) NSString *adMarkup;

@end
