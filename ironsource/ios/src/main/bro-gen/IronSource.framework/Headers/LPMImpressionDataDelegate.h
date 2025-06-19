//
//  LPMImpressionDataDelegate.h
//  IronSource
//
//  Copyright © 2020 ironSource. All rights reserved.
//

#import "LPMImpressionData.h"

@protocol LPMImpressionDataDelegate <NSObject>

- (void)impressionDataDidSucceed:(LPMImpressionData *)impressionData;

@end
