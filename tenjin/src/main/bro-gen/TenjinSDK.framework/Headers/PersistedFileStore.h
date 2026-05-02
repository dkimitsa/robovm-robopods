//
// Created by Tenjin on 2019-12-03.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "DataStore.h"


@interface PersistedFileStore : NSObject<DataStore>

@property(strong, nonatomic) NSMutableDictionary *persistenceDict;

+ (PersistedFileStore *)store;

- (void)setup;
@end
