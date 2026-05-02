//
//  IAUserData.h
//  IASDKCore
//
//  Created by Digital Turbine on 19/03/2017.
//  Copyright © 2022 Digital Turbine. All rights reserved.
//

#import <Foundation/Foundation.h>

#import <IASDKCore/IAInterfaceBuilder.h>

typedef NS_ENUM(NSInteger, IAUserGenderType) {
    IAUserGenderTypeUnknown = 0,
    IAUserGenderTypeMale,
    IAUserGenderTypeFemale,
    IAUserGenderTypeOther,
};

@protocol IAUserDataBuilder <NSObject>

@required

@property (nonatomic) NSUInteger age DEPRECATED_MSG_ATTRIBUTE("This API is deprecated starting from 8.4.6.");
@property (nonatomic) IAUserGenderType gender;
@property (nonatomic, copy, nullable) NSString *zipCode;

@end

@interface IAUserData : NSObject <IAInterfaceBuilder, IAUserDataBuilder, NSCopying>

+ (instancetype _Nullable)build:(void(^ _Nonnull)(id<IAUserDataBuilder> _Nonnull builder))buildBlock;

@end
