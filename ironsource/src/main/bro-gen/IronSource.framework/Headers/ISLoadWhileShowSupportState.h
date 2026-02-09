//
//  ISLoadWhileShowSupportState.h
//  IronSource
//
//  Created by Yonti Makmel on 11/10/2021.
//  Copyright © 2021 IronSource. All rights reserved.
//

#ifndef ISLoadWhileShowSupportState_h
#define ISLoadWhileShowSupportState_h

/*
The various support states for load while show - currently used for rewarded videos
by instance - a network can load an instance while showing the same once
by network  - a network can load an instance while showing a different instance
none        - a network can't load an instance while showing any of its instances
 */

typedef NS_ENUM(NSInteger, ISLoadWhileShowSupportState) {
  LOAD_WHILE_SHOW_NONE = 0,
  LOAD_WHILE_SHOW_BY_INSTANCE = 1,
  LOAD_WHILE_SHOW_BY_NETWORK = 2
};

#endif /* ISLoadWhileShowSupportState_h */
