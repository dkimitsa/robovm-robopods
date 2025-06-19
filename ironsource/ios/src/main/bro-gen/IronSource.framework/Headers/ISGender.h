//
//  Copyright © 2017 IronSource. All rights reserved.
//

#ifndef IRONSOURCE_GENDER_H
#define IRONSOURCE_GENDER_H

#import <Foundation/Foundation.h>

DEPRECATED_MSG_ATTRIBUTE("This enum is deprecated and will be removed in version 9.0.0.")
typedef NS_ENUM(NSInteger, ISGender) {
  IRONSOURCE_USER_UNKNOWN,
  IRONSOURCE_USER_MALE,
  IRONSOURCE_USER_FEMALE
};

#define kISGenderString(enum) [@[ @"unknown", @"male", @"female" ] objectAtIndex:enum]
#endif
