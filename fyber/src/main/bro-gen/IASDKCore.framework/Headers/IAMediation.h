//
//  IAMediation.h
//  IASDKCore
//
//  Created by Digital Turbine on 20/03/2017.
//  Copyright © 2022 Digital Turbine. All rights reserved.
//

#import <Foundation/Foundation.h>

/**
 Thread-safety contract: conformers are queried from arbitrary SDK threads.
 If `name` / `version` (or any property later added to this protocol or its
 subclasses) is backed by storage, that storage MUST be synchronized — e.g.
 `atomic` accessors, a lock, or an immutable ivar set before publication.
 A `nonatomic` getter or lazily-initialized ivar can tear or race and crash
 the host app.
 */
@protocol IAMediationInterface <NSObject>

@required
- (NSString * _Nonnull)name;
- (NSString * _Nonnull)version;

@end

@interface IAMediation : NSObject<IAMediationInterface>

@end
