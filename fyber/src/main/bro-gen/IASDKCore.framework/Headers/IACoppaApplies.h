////
//  IACoppaApplies.h
//  IASDKCore
//
//  Created by DT on 03/01/2023.
//  Copyright © 2023 DT. All rights reserved.
//

#import <Foundation/Foundation.h>

typedef NS_ENUM(NSInteger, IACoppaAppliesType) {
    /// Provides no indication whether ad requests should be treated as child-directed for purposes of the Children’s Online Privacy Protection Act (COPPA).
    IACoppaAppliesTypeUnknown = -1,
    
    /// Indicates that ad requests should NOT be treated as child-directed for purposes of the Children’s Online Privacy Protection Act (COPPA).
    IACoppaAppliesTypeFalse = 0,
    /// Indicates that ad requests SHOULD be treated as child-directed for purposes of the Children’s Online Privacy Protection Act (COPPA).
    IACoppaAppliesTypeTrue = 1,

    /// Backward compatibility aliases.
    IACoppaAppliesTypeDenied DEPRECATED_MSG_ATTRIBUTE("Use IACoppaAppliesTypeFalse instead") = IACoppaAppliesTypeFalse,
    IACoppaAppliesTypeGiven DEPRECATED_MSG_ATTRIBUTE("Use IACoppaAppliesTypeTrue instead") = IACoppaAppliesTypeTrue
};
