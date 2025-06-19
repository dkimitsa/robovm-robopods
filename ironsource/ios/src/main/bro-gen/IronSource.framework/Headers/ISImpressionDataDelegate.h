//
//  ISImpressionDataDelegate.h
//  IronSource
//
//  Created by Guy Lis on 09/09/2020.
//  Copyright © 2020 ironSource. All rights reserved.
//

#ifndef ISImpressionDataDelegate_h
#define ISImpressionDataDelegate_h

#import "ISImpressionData.h"

DEPRECATED_MSG_ATTRIBUTE("Use LPMImpressionDataDelegate instead.")
@protocol ISImpressionDataDelegate <NSObject>

@required

- (void)impressionDataDidSucceed:(ISImpressionData *)impressionData
    DEPRECATED_MSG_ATTRIBUTE("Use [LPMImpressionDataDelegate impressionDataDidSucceed:] instead.");

@end

#endif /* ISImpressionDataDelegate_h */
