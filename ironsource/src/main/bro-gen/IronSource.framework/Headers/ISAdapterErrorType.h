//
//  ISAdapterErrorType.h
//  IronSource
//
//  Created by Guy Lis on 11/08/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//

#import <Foundation/Foundation.h>

#ifndef ISAdapterErrorType_h
#define ISAdapterErrorType_h

typedef NS_ENUM(NSInteger, ISAdapterErrorType) {
  ISAdapterErrorTypeNoFill,
  ISAdapterErrorTypeAdExpired,
  ISAdapterErrorTypeInternal
};

#endif /* ISAdapterErrorType_h */
