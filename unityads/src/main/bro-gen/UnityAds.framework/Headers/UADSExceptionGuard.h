#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>
NS_ASSUME_NONNULL_BEGIN

FOUNDATION_EXPORT NSErrorDomain const UADSExceptionGuardErrorDomain;
FOUNDATION_EXPORT NSErrorUserInfoKey const UADSExceptionGuardExceptionNameKey;

@interface UADSExceptionGuard : NSObject

+ (BOOL)perform:(void (NS_NOESCAPE ^)(void))block error:(NSError **)error;

@end

NS_ASSUME_NONNULL_END
#endif
