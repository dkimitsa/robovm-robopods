//
//  ISNEventTrackerInterface.h
//  SSASDKXCFramework
//
//  Created by Ariel Barsheshet on 23/07/2023.
//  Copyright © 2023 ironSource. All rights reserved.
//

#import "ISNEvent.h"

@protocol ISNEventTrackerInterface <NSObject>

- (void)logEvent:(ISNEvent*)event data:(NSDictionary*)data;

@end
