//
//  LPMDispatcherProtocol.h
//  IronSource
//
//  Created by Gal Yedidovich on 16/12/2024.
//

NS_ASSUME_NONNULL_BEGIN

typedef void (^LPMDispatcherBlock)(void);

@protocol LPMDispatcherProtocol <NSObject>

- (void)dispatch:(LPMDispatcherBlock _Nonnull)task;
@end

NS_ASSUME_NONNULL_END
