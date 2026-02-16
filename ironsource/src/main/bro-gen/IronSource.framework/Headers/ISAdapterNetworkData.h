//
//  ISAdapterNetworkData.h
//  IronSourceSDK
//

@protocol ISAdapterNetworkData <NSObject>

@required

- (NSDictionary *)allData;

- (id)dataByKeyIgnoreCase:(NSString *)desiredKey valueType:(Class)valueType;

@end
