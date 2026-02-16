//
//  ISNEvent.h
//  SSASDK
//
//  Created by Tomer Ben-Rachel on 19/04/2020.
//  Copyright © 2020 SSA Ltd. All rights reserved.
//
// This class represents an IronSourceNetwork Event with an id and a name

#import <Foundation/Foundation.h>

@interface ISNEvent : NSObject

@property(nonatomic, strong) NSString* eventName;
@property(nonatomic, strong) NSNumber* eventId;

- (instancetype)initWithEventId:(NSNumber*)eventId eventName:(NSString*)eventName;

@end
