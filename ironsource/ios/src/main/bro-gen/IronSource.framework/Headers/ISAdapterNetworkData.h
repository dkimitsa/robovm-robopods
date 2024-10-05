//
//  ISAdapterNetworkData.h
//  IronSourceSDK
//

#import "ISAdUnit.h"

@protocol ISAdapterNetworkData <NSObject>

@required

- (NSDictionary *)networkDataByAdUnit:(ISAdUnit *)adUnit;

- (NSDictionary *)allData;

- (id)dataByKeyIgnoreCase:(NSString *)desiredKey valueType:(Class)valueType;

@end
