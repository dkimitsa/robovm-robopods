//
//  ISAdapterMetaDataProtocol.h
//  IronSource
//
//  Created by Guy Lis on 06/07/2021.
//  Copyright © 2021 ironSource. All rights reserved.
//

#ifndef ISAdapterMetaDataProtocol_h
#define ISAdapterMetaDataProtocol_h

@protocol ISAdapterMetaDataProtocol <NSObject>

- (void)setMetaDataWithKey:(NSString *)key
                 andValues:(NSMutableArray *)values
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in SDK version 9.0.0.");

@end

#endif /* ISAdapterMetaDataProtocol_h */
