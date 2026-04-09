#ifdef UNITYADS_INTERNAL_SWIFT
#import <Foundation/Foundation.h>
NS_ASSUME_NONNULL_BEGIN

/// Base class to invoke C functions dynamically using dlsym.
/// Subclasses should override functionName to provide the C function name to invoke.
/// This allows calling C functions by name without exposing dlsym in Swift code.
@interface UADSDynamicFunctionInvoker : NSObject

/// Subclasses should override this method to provide the C function name to invoke.
/// - Returns: The name of the C function to call, or nil if no function should be called
+ (nullable NSString *)functionName;

/// Invokes the C function specified by functionName.
/// - Returns: The result of the function call, or nil if the function is not found
+ (nullable id)invokeFunction;

@end

NS_ASSUME_NONNULL_END
#endif
