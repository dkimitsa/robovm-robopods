//
//  ADJThirdPartySharingResult.h
//  Adjust
//
//  Created by Aditi Agrawal on 10.04.26.
//  Copyright © 2026 Adjust GmbH. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface ADJThirdPartySharingResult : NSObject<NSCopying>

/**
 * @brief Third party sharing settings returned by the backend.
 */
@property (nonatomic, copy, nonnull) NSString *thirdPartySharingSettingsJson;

/**
 * @brief Create third party sharing result object.
 *
 * @param thirdPartySharingSettingsJson JSON string holding third party sharing settings.
 *
 * @return Adjust third party sharing result object.
 */
- (nonnull instancetype)initWithThirdPartySharingSettings:(nonnull NSString *)thirdPartySharingSettingsJson;

/**
 * @brief Check if given third party sharing result equals current one.
 *
 * @param thirdPartySharingResult Third party sharing result object to be compared with current one.
 *
 * @return Boolean indicating whether two third party sharing result objects are equal.
 */
- (BOOL)isEqualToThirdPartySharingResult:(nonnull ADJThirdPartySharingResult *)thirdPartySharingResult;

/**
 * @brief Get third party sharing result value as dictionary.
 *
 * @return Dictionary containing third party sharing result as key-value pairs.
 */
- (nullable NSDictionary *)dictionary;

@end
