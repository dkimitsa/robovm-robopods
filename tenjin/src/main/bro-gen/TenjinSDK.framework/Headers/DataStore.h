//
// Created by Tenjin on 2019-11-26.
// Copyright (c) 2019 Tenjin. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol DataStore <NSObject>

-(NSDictionary*) getAll;

-(NSString*) getString:(NSString*)key withDefault:(NSString*)defaultValue;
-(NSInteger) getInteger:(NSString*)key withDefault:(NSInteger)defaultValue;
-(long) getLong:(NSString*)key withDefault:(long)defaultValue;
-(float) getFloat:(NSString*)key withDefault:(float)defaultValue;
-(bool) getBool:(NSString*)key withDefault:(bool)defaultValue;
-(bool) contains:(NSString*)key;

-(void) putString:(NSString*)key value:(NSString*)defaultValue;
-(void) putInteger:(NSString*)key value:(NSInteger)defaultValue;
-(void) putLong:(NSString*)key value:(long)defaultValue;
-(void) putFloat:(NSString*)key value:(float)defaultValue;
-(void) putBool:(NSString*)key value:(bool)defaultValue;

-(void) remove:(NSString*)key;
-(void) clear;
@end
