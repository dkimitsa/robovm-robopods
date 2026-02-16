//
//  SingularLinkParams.h
//  Singular
//
//  Copyright © 2010-2024 Singular Inc. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface SingularLinkParams: NSObject

- (id) initWithDeeplink:(NSString*)deeplink passthrough:(NSString*)passthrough isDeferred:(BOOL)isDeferred url:(NSURL*)url;

- (NSString *)getDeepLink;
- (NSString *)getPassthrough;
- (BOOL)isDeferred;
 
/// Returns a lazy-initialized NSDictionary with key-value pairs of the query parameters in the evaluated URL
- (NSDictionary *)getUrlParameters;

@end
