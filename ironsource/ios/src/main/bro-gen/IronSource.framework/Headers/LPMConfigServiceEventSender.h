//
//  LPMCappingServiceEventSender.h
//  Pods
//
//  Created by Gal Salti on 04/08/2024.
//

#import <Foundation/Foundation.h>
#import "ISAdUnit.h"

NS_ASSUME_NONNULL_BEGIN

@protocol LPMConfigServiceEventSender

- (void)sendAdUnitCappingParseFailedEventWithAdUnitId:(NSString *)adUnitId error:(NSError *)error;

- (void)sendPlacementCappingParseFailedEventWithPlacementName:(NSString *)placementName
                                                     adFormat:(ISAdUnit *)adFormat
                                                        error:(NSError *)error;

- (void)sendConfigParseFailedEventWithError:(NSError *)error;

@end

NS_ASSUME_NONNULL_END
