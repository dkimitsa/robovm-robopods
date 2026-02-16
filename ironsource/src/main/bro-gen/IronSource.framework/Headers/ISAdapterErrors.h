//
//  AdapterErrors.h
//  IronSource
//
//  Created by Guy Lis on 05/07/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//

#ifndef AdapterErrors_h
#define AdapterErrors_h

typedef NS_ENUM(NSInteger, ISAdapterErrors) {
  ISAdapterErrorInternal = 1000,      // internal error
  ISAdapterErrorAdExpired = 1001,     // expired ad error
  ISAdapterErrorMissingParams = 1002  // missing parameters error

};

#endif /* AdapterErrors_h */
