//
//  ISInitializationDelegate.h
//  IronSource
//
//  Copyright © 2022 IronSource. All rights reserved.
//

#ifndef ISInitializationDelegate_h
#define ISInitializationDelegate_h

DEPRECATED_MSG_ATTRIBUTE("Use LPMInitCompletionHandler instead.")
@protocol ISInitializationDelegate <NSObject>

@required

/**
 Called after init mediation completed
 */
- (void)initializationDidComplete;

@end

#endif /* ISInitializationDelegate_h */
