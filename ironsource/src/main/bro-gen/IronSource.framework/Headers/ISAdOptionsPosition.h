//
//  ISAdOptionsPosition.h
//  IronSource
//
//  Created by Hadar Pur on 06/07/2023.
//  Copyright © 2023 IronSource. All rights reserved.
//

// ISAdOptionsPosition
typedef NS_ENUM(NSInteger, ISAdOptionsPosition) {
  ISAdOptionsPositionTopLeft,
  ISAdOptionsPositionTopRight,
  ISAdOptionsPositionBottomLeft,
  ISAdOptionsPositionBottomRight
};

static NSString* const kAdOptionsPosKey = @"adOptionsPos";
