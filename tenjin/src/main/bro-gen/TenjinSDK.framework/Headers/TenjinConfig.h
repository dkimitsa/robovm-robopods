//
// Created by Tenjin on 2019-10-10.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface TenjinConfig : NSObject{

@private
    NSMutableDictionary *_store;
}


- (BOOL)boolForKey:(NSString *)key;

- (void)setValue:(id)value
          forKey:(id)key;

- (NSString *)stringForKey:(NSString *)key;
@end
