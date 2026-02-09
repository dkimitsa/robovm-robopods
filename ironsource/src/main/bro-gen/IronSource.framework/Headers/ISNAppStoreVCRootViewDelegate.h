//
//  ISNAppStoreVCRootViewDelegate.h
//  IronSourceSDK
//
//  Created by Gal Salti on 27/09/2023.
//

NS_ASSUME_NONNULL_BEGIN

@protocol ISNAppStoreVCRootViewDelegate <NSObject>

- (void)didReceiveOutOfAppStoreTouchWithType:(NSString *)type;

@end

NS_ASSUME_NONNULL_END
