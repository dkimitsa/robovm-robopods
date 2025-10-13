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

- (void)setMetaDataWithKey:(NSString *)key andValues:(NSMutableArray *)values;

@end

#endif /* ISAdapterMetaDataProtocol_h */
