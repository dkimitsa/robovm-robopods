//
//  ISSegmentDelegate.h
//  IronSource
//
//  Created by Gili Ariel on 06/07/2017.
//  Copyright © 2017 Supersonic. All rights reserved.
//

#ifndef ISSegmentDelegate_h
#define ISSegmentDelegate_h

DEPRECATED_MSG_ATTRIBUTE("This protocol is deprecated and will be removed in version 9.0.0.")
@protocol ISSegmentDelegate <NSObject>

@required
/**
 Called after a segment recived successfully
 */
- (void)didReceiveSegement:(NSString *)segment;

@end
#endif /* ISSegmentDelegate_h */
