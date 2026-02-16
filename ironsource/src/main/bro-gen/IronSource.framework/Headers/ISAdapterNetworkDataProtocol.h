//
//  ISAdapterNetworkDataProtocol.h
//  IronSourceSDK
//

#import "ISAdapterNetworkData.h"

@protocol ISAdapterNetworkDataProtocol <NSObject>

@required

- (void)setNetworkData:(id<ISAdapterNetworkData>)networkData;

@end
