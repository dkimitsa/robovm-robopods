//
// HelpshiftProactiveAPIConfigCollectorDelegate.h
// Created for HelpshiftX in 2022
// Copyright © 2022 Helpshift. All rights reserved.
//

#ifndef HelpshiftProactiveAPIConfigCollectorDelegate_h
#define HelpshiftProactiveAPIConfigCollectorDelegate_h

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@protocol HelpshiftProactiveAPIConfigCollectorDelegate <NSObject>

@optional
- (NSDictionary *) getAPIConfig;

@end

NS_ASSUME_NONNULL_END

#endif
