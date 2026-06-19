// (c) Meta Platforms, Inc. and affiliates. Confidential and proprietary.

#import <objc/objc-auto.h>
#import <os/base.h>

#import <Foundation/Foundation.h>

#import <FBBaseLite/FBBaseDefines.h>
#import <PikaOptimizationsMacros/PikaOptimizationsMacros.h>
#import <lang/lang.h>

#ifdef __cplusplus
 #ifndef FB_INSIDE_EXTERN_C
template <class ClassToBlackList>
AN_OBFUSCATE_NAME int IVarMetaAutoBlackListTemplateType()
{
  return 0;
}

 #endif
#endif

#define IVBL(obj) IVarMetaAutoBlackListTemplateType<decltype(obj)>()
#define FB_STRINGIFY(X) #X
#define FB_GET_MACRO_4(_1, _2, _3, _4, NAME, ...) NAME
#define FB_GET_MACRO_6(_1, _2, _3, _4, _5, _6, NAME, ...) NAME

#define FB_STRINGIZE(x) #x

#ifndef FB_NULL_IF_NIL
 #define FB_NULL_IF_NIL(value_) \
         ({ \
  (value_) ?: (id)[NSNull null]; \
})
#endif // FB_NULL_IF_NIL

#ifndef FB_IS_NULL
 #define FB_IS_NULL(value_) ((value_) == (id)[NSNull null])
#endif // FB_IS_NULL

#ifndef FB_NIL_IF_NULL
 #define FB_NIL_IF_NULL(value_) \
         ({ \
  __typeof__(value_) tmpVal_ ## __LINE__ = (value_); \
  FB_IS_NULL(tmpVal_ ## __LINE__) ? nil : tmpVal_ ## __LINE__; \
})
#endif // FB_NIL_IF_NULL

/*
  Type _Nonnull FB_CAST_NONNULL_WITH_CHECK(Type value, CheckFn check);
  @param value the value to cast to _Nonnull, MUST NOT be a block
  @param check a function/macro that takes 2 arguments, 1) a boolean (true == check passed, false == check failed), 2) an NSString* message
  @param modifier any variable name that should be used to help make this macro unique.  E.g. `return FB_CAST_NONNULL_WITH_CHECK(someFun(), NSCAssert, __COUNTER__);`
  @return a _Nonnull object/pointer
  @note Ideally we'd have a way to use an __attribute__((warn_unused_result)) for this,
  but there's no way to do that while preserving the type in C/ObjC
  (can only do it if we can force the result type to be `id` or `const void *` which is even riskier than losing type info)...
  We'll have to live without that extra enforcement.
  @warning As a macro function, passing in another macro function, function, or method that takes variable arguments (such as string formatting)
  can lead to compilation failure.
  @note If you are casting a `Class`, there's a little weirdness due to how ARC handles `Class` as both an object and a primitive.
  Usually, it just means that you need the variable you are assigning to to be `__strong` to avoid the `-Warc-unsafe-retained-assign` false-positive error.
*/
#ifndef FB_CAST_NONNULL_WITH_CHECK

// This version works with C pointers and Objective-C objects, but not with blocks
 #define FB_CAST_NONNULL_WITH_CHECK(value, check, modifier) \
         ({ \
  __typeof(*(value)) *_Nonnull FB_MACRO_CONCAT(FB_MACRO_CONCAT(nonnull_unwrapped_value_, __LINE__), FB_MACRO_CONCAT(_, modifier)) = (__typeof(*(value)) *_Nonnull)(value);/* evaluate the value only once, to avoid repeated side-effects */ \
  check((!!FB_MACRO_CONCAT(FB_MACRO_CONCAT(nonnull_unwrapped_value_, __LINE__), FB_MACRO_CONCAT(_, modifier))), @"" #value " was unexpectedly nil/NULL"); /* perform check */ \
  FB_MACRO_CONCAT(FB_MACRO_CONCAT(nonnull_unwrapped_value_, __LINE__), FB_MACRO_CONCAT(_, modifier)); /* "return" the nonnull cast value */ \
})

#endif // FB_CAST_NONNULL_WITH_CHECK

/*
  Type _Nonnull FB_CAST_OBJC_NONNULL_WITH_CHECK(Type value, CheckFn check);
  @param value the value to cast to _Nonnull, MUST be an Objective-C object (blocks included)
  @param check a function/macro that takes 2 arguments, 1) a boolean (true == check passed, false == check failed), 2) an NSString* message
  @param modifier any variable name that should be used to help make this macro unique.  E.g. `return FB_CAST_NONNULL_WITH_CHECK(someFun(), NSCAssert, __COUNTER__);`
  @return a _Nonnull object/pointer
  @note Ideally we'd have a way to use an __attribute__((warn_unused_result)) for this,
  but there's no way to do that while preserving the type in C/ObjC
  (can only do it if we can force the result type to be `id` or `const void *` which is even riskier than losing type info)...
  We'll have to live without that extra enforcement.
  @warning As a macro function, passing in another macro function, function, or method that takes variable arguments (such as string formatting)
  can lead to compilation failure.
  @note If you are casting a `Class`, there's a little weirdness due to how ARC handles `Class` as both an object and a primitive.
  Usually, it just means that you need the variable you are assigning to to be `__strong` to avoid the `-Warc-unsafe-retained-assign` false-positive error.
*/
#if !defined(FB_CAST_OBJC_NONNULL_WITH_CHECK) && __has_feature(objc_generics)

@interface FBNonnullCaster <__covariant Type>
+ (nonnull Type)asNonnull;
@end

// This version works with Objective-C objects and blocks, but not with C pointers
 #define FB_CAST_OBJC_NONNULL_WITH_CHECK(value, check, modifier) \
         ({ \
  __typeof(value) FB_MACRO_CONCAT(FB_MACRO_CONCAT(nullable_value_, __LINE__), FB_MACRO_CONCAT(_, modifier)) = (value); /*get into a local nullable variable*/ \
  check((!!FB_MACRO_CONCAT(FB_MACRO_CONCAT(nullable_value_, __LINE__), FB_MACRO_CONCAT(_, modifier))), @"" #value " was unexpectedly nil/NULL"); /* perform check */ \
  (__typeof([FBNonnullCaster<__typeof(FB_MACRO_CONCAT(FB_MACRO_CONCAT(nullable_value_, __LINE__), FB_MACRO_CONCAT(_, modifier)))> asNonnull]))FB_MACRO_CONCAT(FB_MACRO_CONCAT(nullable_value_, __LINE__), FB_MACRO_CONCAT(_, modifier));/* "return" the nonnull cast value */ \
})

#endif // #if !defined(FB_CAST_OBJC_NONNULL_WITH_CHECK) && __has_feature(objc_generics)

//! Cast to _Nonnull, asserting with NSAssert if NULL.  Cannot be a block.
#ifndef FB_CAST_NONNULL_WITH_NSASSERT
 #define FB_CAST_NONNULL_WITH_NSASSERT(value) FB_CAST_NONNULL_WITH_CHECK(value, NSAssert, __COUNTER__)
#endif // FB_CAST_NONNULL_WITH_NSASSERT

//! Cast to _Nonnull, asserting with NSCAssert if NULL.  Cannot be a block.
#ifndef FB_CAST_NONNULL_WITH_NSCASSERT
 #define FB_CAST_NONNULL_WITH_NSCASSERT(value) FB_CAST_NONNULL_WITH_CHECK(value, NSCAssert, __COUNTER__)
#endif // FB_CAST_NONNULL_WITH_NSCASSERT

//! Cast to _Nonnull, asserting with NSAssert if NULL.  Must be an Objective-C object (includes blocks).
#ifndef FB_CAST_OBJC_NONNULL_WITH_NSASSERT
 #define FB_CAST_OBJC_NONNULL_WITH_NSASSERT(value) FB_CAST_OBJC_NONNULL_WITH_CHECK(value, NSAssert, __COUNTER__)
#endif // FB_CAST_OBJC_NONNULL_WITH_NSASSERT

//! Cast to _Nonnull, asserting with NSCAssert if NULL.  Must be an Objective-C object (includes blocks).
#ifndef FB_CAST_OBJC_NONNULL_WITH_NSCASSERT
 #define FB_CAST_OBJC_NONNULL_WITH_NSCASSERT(value) FB_CAST_OBJC_NONNULL_WITH_CHECK(value, NSCAssert, __COUNTER__)
#endif // FB_CAST_OBJC_NONNULL_WITH_NSCASSERT

// OBJC_DIRECT MACROS START =============
/**
 Pika toolchain performs compile time optimizations by removing some of objc
  dynamic functionality from methods and properties.
  If you need to keep a dynamic behavior you should mark tell it to Pika toolchain
  by using FB_DYNAMIC on properties and FB_OBJC_DYNAMIC on methods.

  Without these annotation, Pika toolchain may potentially devirtilize methods and
  properties' accessors by removing objc dynamic "target selector" calls and resolve
  them to direct c style function calls at compile time.

  Examples:
  - (void)performAction FB_OBJC_DYNAMIC;
  @property (nonatomic, strong, readonly, FB_DYNAMIC) NSString *willBeKVOed;

**/

//// Direct and Dynamic properties.
#if !defined(FB_DYNAMIC)
 #if __has_feature(objc_property_dynamic) && defined(ENABLE_PROPERTY_DIRECT)
  #define FB_DYNAMIC dynamic
 #else
  #define FB_DYNAMIC
 #endif
#endif

#if !defined(FB_DIRECT)
 #if __has_feature(objc_direct) && defined(ENABLE_PROPERTY_DIRECT)
  #define FB_DIRECT direct
 #else
  #define FB_DIRECT
 #endif
#endif

//// Direct and Dynamic methods.
#if !defined FB_OBJC_DYNAMIC
 #if __has_attribute(objc_dynamic) && defined(ENABLE_OBJC_DIRECT)
  #define FB_OBJC_DYNAMIC __attribute__((objc_dynamic))
 #else
  #define FB_OBJC_DYNAMIC
 #endif
#endif
// This has been used in graph-ql generated source code. keep it for now.
#if !defined FB_ATTRIBUTE_DYNAMIC
 #if __has_attribute(objc_dynamic) && defined(ENABLE_OBJC_DIRECT)
  #define FB_ATTRIBUTE_DYNAMIC __attribute__((objc_dynamic))
 #else
  #define FB_ATTRIBUTE_DYNAMIC
 #endif
#endif

// mark @interface class and category
#if !defined FB_OBJC_DYNAMIC_MEMBERS
 #if __has_attribute(objc_dynamic_members) && defined(ENABLE_OBJC_DIRECT)
  #define FB_OBJC_DYNAMIC_MEMBERS __attribute__((objc_dynamic_members))
 #else
  #define FB_OBJC_DYNAMIC_MEMBERS
 #endif
#endif

#ifndef FB_OBJC_DIRECT
 #if __has_feature(objc_direct) && defined(ENABLE_OBJC_DIRECT)
  #define  FB_OBJC_DIRECT __attribute((objc_direct))
 #else
  #define FB_OBJC_DIRECT
 #endif // #if __has_feature(objc_direct)
#endif // FB_OBJC_DIRECT

#ifndef FB_OBJC_DIRECT_MEMBERS
 #if __has_feature(objc_direct) && defined(ENABLE_OBJC_DIRECT)
  #define  FB_OBJC_DIRECT_MEMBERS __attribute((objc_direct_members))
 #else
  #define FB_OBJC_DIRECT_MEMBERS
 #endif // #if __has_feature(objc_direct) && defined(ENABLE_OBJC_DIRECT)
#endif // FB_OBJC_DIRECT_MEMBERS

// this is deprecated.
#ifndef FB_DIRECT_DISPATCH
 #define FB_DIRECT_DISPATCH
#endif // FB_DIRECT_DISPATCH
// OBJC_DIRECT MACROS END =============

// These macros exist to allow templates to substitute names of the class and category
#define FB_LINK_CATEGORY_INTERFACE(CLASS, CATEGORY) FB_LINK_REQUIRE_CATEGORY(CLASS ## _ ## CATEGORY)
#define FB_LINK_CATEGORY_IMPLEMENTATION(CLASS, CATEGORY) FB_LINKABLE(CLASS ## _ ## CATEGORY)

// DO NOT USE this macro directly, use FB_LINK_REQUIRE_CATEGORY.
#if defined(__swift__)
// Nothing to do in Swift, only needed in ObjC; hide to avoid swift-interface cruft
 #define FB_LINK_REQUIRE_(NAME)
#else
 #define FB_LINK_REQUIRE_(NAME) \
         extern char FBLinkable_ ## NAME; \
         extern const void *_Nonnull const OS_WEAK OS_CONCAT(FBLink_, NAME); \
         OS_USED const void *_Nonnull const OS_WEAK OS_CONCAT(FBLink_, NAME) = &FBLinkable_ ## NAME;
#endif

// Annotate category @implementation definitions with this macro.
#if defined(__swift__)
// Nothing to do in Swift, only needed in ObjC; hide to avoid swift-interface cruft
 #define FB_LINKABLE(NAME)
#elif defined(DEBUG) && DEBUG
 #define FB_LINKABLE(NAME) \
         __attribute__((used)) __attribute__((visibility("default"))) char FBLinkable_ ## NAME = 'L';
#else
 #define FB_LINKABLE(NAME) \
         __attribute__((visibility("default"))) char FBLinkable_ ## NAME = 'L';
#endif

// Annotate category @interface declarations with this macro.
#define FB_LINK_REQUIRE_CATEGORY(NAME) \
        FB_LINK_REQUIRE_(NAME)

// Annotate class @interface declarations with this macro if they are getting dropped by dead stripping due to a lack of static references.
#define FB_LINK_REQUIRE_CLASS(NAME) \
        FB_LINK_REQUIRE_(NAME) \
        FB_DONT_DEAD_STRIP_CLASS(NAME)

// Annotate class @implementations with this macro if you know they
// will have a lack of static references or even header imports and
// you have ensured that the containing implementation will be linked
// by other means (e.g., other used classes in the same file.
// You could use this macro in another compilation unit (not a header)
// to hold an explicit reference to this class symbol.
#if defined(__swift__)
// Nothing to do in Swift, only needed in ObjC; hide to avoid swift-interface cruft
 #define FB_DONT_DEAD_STRIP_CLASS(NAME)
#else
 #define FB_DONT_DEAD_STRIP_CLASS(NAME) \
         extern void *OBJC_CLASS_$_ ## NAME; \
         extern const void *const OS_WEAK OS_CONCAT(FBLinkClass_, NAME); \
         OS_USED const void *const OS_WEAK OS_CONCAT(FBLinkClass_, NAME) = (void *)&OBJC_CLASS_$_ ## NAME;
#endif

#ifndef FB_INIT_AND_NEW_UNAVAILABLE
 #define FB_INIT_AND_NEW_UNAVAILABLE \
         _Pragma("clang diagnostic push") \
         _Pragma("clang diagnostic ignored \"-Wnullability-completeness\"") \
         - (instancetype)init NS_UNAVAILABLE; \
         + (instancetype)new NS_UNAVAILABLE; \
         _Pragma("clang diagnostic pop")
#endif // FB_INIT_AND_NEW_UNAVAILABLE

#ifndef FB_INIT_AND_NEW_UNAVAILABLE_NULLABILITY
 #define FB_INIT_AND_NEW_UNAVAILABLE_NULLABILITY \
         - (nonnull instancetype)init NS_UNAVAILABLE; \
         + (nonnull instancetype)new NS_UNAVAILABLE;
#endif // FB_INIT_AND_NEW_UNAVAILABLE_NULLABILITY

#ifndef FB_INIT_AND_NEW_AVAILABLE
 #define FB_INIT_AND_NEW_AVAILABLE \
         _Pragma("clang diagnostic push") \
         _Pragma("clang diagnostic ignored \"-Wnullability-completeness\"") \
         - (instancetype)init NS_DESIGNATED_INITIALIZER; \
         + (instancetype)new OBJC_SWIFT_UNAVAILABLE("use object initializers instead"); \
         _Pragma("clang diagnostic pop")
#endif // FB_INIT_AND_NEW_AVAILABLE

/**
 If available, uses a Clang attribute `objc_subclassing_restricted` to warn when a subclass of this
 class is declared. If the attribute is unavailable on this system, does nothing.
 */
#ifndef FB_SUBCLASSING_RESTRICTED
 #if defined(__has_attribute) && __has_attribute(objc_subclassing_restricted)
  #define FB_SUBCLASSING_RESTRICTED __attribute__((objc_subclassing_restricted))
 #else
  #define FB_SUBCLASSING_RESTRICTED
 #endif // defined(__has_attribute) && __has_attribute(objc_subclassing_restricted)
#endif // FB_SUBCLASSING_RESTRICTED

#ifndef FB_WARN_UNUSED_RESULT
 #if defined(__has_attribute) && __has_attribute(warn_unused_result)
  #define FB_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
 #else
  #define FB_WARN_UNUSED_RESULT
 #endif // defined(__has_attribute) && __has_attribute(warn_unused_result)
#endif // FB_WARN_UNUSED_RESULT

/**
 Creates and returns a privately-named static variable. The first time
 this macro is called, and only the first time, it initializes said
 static variable with the passed-in value Commonly used for implementing
 "sharedInstance" factory methods. E.g.:

 +(instancetype)sharedInstance {
   return FB_INITIALIZE_AND_RETURN_STATIC([self new]);
 }
*/
#ifndef FB_INITIALIZE_AND_RETURN_STATIC
 #define FB_INITIALIZE_AND_RETURN_STATIC(...) \
         ({ \
  static __typeof__(__VA_ARGS__) static_storage__; \
  void (^initialization_block__)(void) = ^{ static_storage__ = (__VA_ARGS__); }; \
  static dispatch_once_t once_token__; \
  dispatch_once(&once_token__, initialization_block__); \
  static_storage__; \
})
#endif

/**
 Creates and returns a privately-named static variable. The first time
 this macro is called, and only the first time, it initializes said
 static variable with the result of calling the passed-in block Commonly
 used for implementing "sharedInstance" factory methods. This version is
 preferred over FB_INITIALIZE_AND_RETURN_STATIC when the initialization
 requires more than a single one-line expression. E.g.:

 +(instancetype)sharedInstance {
   return FB_INITIALIZE_WITH_BLOCK_AND_RETURN_STATIC(^{
       id calculation = ...;
       return [[self alloc] initWithResultOfCalculation: calculation];
    });
 }
*/

#ifndef FB_INITIALIZE_WITH_BLOCK_AND_RETURN_STATIC
 #define FB_INITIALIZE_WITH_BLOCK_AND_RETURN_STATIC(...) \
         ({ \
  static __typeof__((__VA_ARGS__)()) static_storage__; \
  void (^initialization_block__)(void) = ^{ static_storage__ = (__VA_ARGS__)(); }; \
  static dispatch_once_t once_token__; \
  dispatch_once(&once_token__, initialization_block__); \
  static_storage__; \
})
#endif

#ifndef FB_KVO_CONTEXT
 #if __has_feature(objc_arc)
  #define FB_KVO_CONTEXT(x) static void *x = (__bridge void *)@#x
 #else
  #define FB_KVO_CONTEXT(x) static void *x = (void *)@#x
 #endif
#endif // FB_KVO_CONTEXT

#define FB_DISPATCH_ONCE(...) \
        do { \
          static dispatch_once_t __once_token; \
          dispatch_once(&__once_token, __VA_ARGS__); \
        } while (0)

/**
  * For use with KVO keypaths. Use as
  *   NSString *path = FB_OBJ_KEYPATH(observedObject, key_p1, key_p2, ... )
  * It ensures that observedObject.key_p1.key_p2... exists at compile time.
  * Object and keypath can both be chained, but the path must be broken down:
  * Ex: If 'object.subobject.verion.identifier.suffix' exists, use:
  *   FB_OBJ_KEYPATH(object.subobject, verion, identifier, suffix)
  * which results in the keypath @"verion.identifier.suffix".
  */

#define FB_OBJ_KEYPATH(...) FB_GET_MACRO_4(__VA_ARGS__, A4_FB_OBJ_KEYPATH, A3_FB_OBJ_KEYPATH, A2_FB_OBJ_KEYPATH)(__VA_ARGS__)

#define A2_FB_OBJ_KEYPATH(OBJ, P1) \
        ((void)(NO && IVBL(OBJ.P1)), @ FB_STRINGIFY(P1))

#define A3_FB_OBJ_KEYPATH(OBJ, P1, P2) \
        ((void)(NO && IVBL(OBJ.P1) && IVBL(OBJ.P1.P2)), @ FB_STRINGIFY(P1.P2))

#define A4_FB_OBJ_KEYPATH(OBJ, P1, P2, P3) \
        ((void)(NO && IVBL(OBJ.P1) && IVBL(OBJ.P1.P2) && IVBL(OBJ.P1.P2.P3)), @ FB_STRINGIFY(P1.P2.P3))

/**
 * For use with KVO keypaths. Use as
 *   NSString *path = FBTYPEKEY(Type, key)
 * It ensures that observedObject.key exists at compile time
 * where observedObject is assumed to be of type Type. It
 * results in the keypath @"key". It can accept a chained key path.
 */
#define FB_TYPE_KEYPATH(TYPE, PATH) \
        (((void)(NO && ((void)((TYPE)(nil)).PATH, NO)), @ # PATH))

// __fb_return_false_ivar_meta is used to force clang front-end to not optimize
// out the string generated in FB_BLACKLIST_CLASS_FOR_IVAR_META.
AN_OBFUSCATE_NAME static inline bool __fb_return_false_ivar_meta(const char *_Null_unspecified p) { (void)p; return false; }

#define FB_BLACKLIST_CLASS_FOR_IVAR_META(CLASSNAME) \
        (__fb_return_false_ivar_meta("IVAR_META_BLACKLIST_CLASS:" #CLASSNAME))
// Use this macro to instruct pika compiler to not remove IVars for CLASSNAME
#define FB_TYPE_KEYPATH_KEEP_IVARS(TYPE, CLASSNAME, PATH) \
        (((void)(FB_BLACKLIST_CLASS_FOR_IVAR_META(CLASSNAME) && NO    \
  && ((void)((TYPE)(nil)).PATH, NO)), @ # PATH))

#define FB_CLASS_KEYPATH(CLASS, KEY) FB_TYPE_KEYPATH_KEEP_IVARS(CLASS *, CLASS, KEY)
#define FB_PROTOCOL_KEYPATH(PROTOCOL, KEY) FB_TYPE_KEYPATH(id<PROTOCOL>, KEY)

// The type of a literal string when stored in a struct.
// ARC doesn't like objects in structs. This will work ok
// however it is only intended for literal strings (hence
// the name).
#if __has_feature(objc_arc)
typedef __unsafe_unretained NSString *FBLiteralString;
#else
typedef NSString *FBLiteralString;
#endif
#if __has_feature(objc_arc)
typedef __unsafe_unretained NSString *const FBConstLiteralString;
#else
typedef NSString *const FBConstLiteralString;
#endif

// Use for KVO
#if __has_feature(objc_arc)
 #define FBObservationContext __bridge void *
#else
 #define FBObservationContext void *
#endif

// Keeping self retained over a block of code
#if __has_feature(objc_arc)
 #define FB_PRESERVE_SELF_ACROSS_BLOCK(x) \
         do { \
           CFTypeRef __safe_self = CFBridgingRetain(self); \
           x(); \
           CFRelease(__safe_self); \
         } while (0)
#else
 #define FB_PRESERVE_SELF_ACROSS_BLOCK(x) \
         do { \
           [self retain]; \
           x(); \
           [self release]; \
         } while (0)
#endif

/**
 * mark a queue in order to be able to check FB_IS_ON_MARKED_QUEUE
 */
#define FB_MARK_QUEUE(_q)                                         \
        dispatch_queue_set_specific( \
  (_q),                               \
  (__bridge void *)(_q),              \
  (__bridge void *)(_q),              \
  NULL \
        )

/**
 * check whether currently executing on marked queue q.
 */
#define FB_IS_ON_MARKED_QUEUE(_q)                                 \
        ((_q) != nil && dispatch_get_specific((__bridge void *)(_q)) == (__bridge void *)(_q))

/**
 * asynchronously execute the block on the marked queue, if not already running on that queue
 */
#define FB_ON_MARKED_QUEUE(_q, BLOCK) \
        (FB_IS_ON_MARKED_QUEUE(_q) ? BLOCK() : dispatch_async(_q, BLOCK))

/**
 * synchronously execute the block on the marked queue, if not already running on that queue
 */
#define FB_ON_MARKED_QUEUE_SYNC(_q, BLOCK) \
        (FB_IS_ON_MARKED_QUEUE(_q) ? BLOCK() : dispatch_sync(_q, BLOCK))

/**
 * check block for null and perform synchronous call
 */
#ifndef FB_BLOCK_CALL_SAFE
 #define FB_BLOCK_CALL_SAFE(BLOCK, ...) \
         ({ \
  __typeof(BLOCK) FB_UNIQUE_NAME(fb_safe_block) = (BLOCK); \
  if (FB_UNIQUE_NAME(fb_safe_block)) { \
    FB_UNIQUE_NAME(fb_safe_block)(__VA_ARGS__); \
  } \
})
#endif

#ifndef FB_BLOCK_CALL_SAFE_ON_QUEUE
 #define FB_BLOCK_CALL_SAFE_ON_QUEUE(QUEUE, BLOCK, ...) \
         ({ \
  if (BLOCK) { \
    dispatch_async(QUEUE, ^{ \
      __typeof(BLOCK) FB_UNIQUE_NAME(fb_safe_block) = (BLOCK); \
      if (FB_UNIQUE_NAME(fb_safe_block)) { \
        FB_UNIQUE_NAME(fb_safe_block)(__VA_ARGS__); \
      } \
    }); \
  } \
})
#endif

/**
 Converts a selector to a string, but the whole point of this method is to cause a compile error
 if called with _cmd from a block, so that we can detect incorrect calls of FBAssert and other macros
 from blocks, which can end up retaining self.
 The function name is designed to remind people what the problem might be when they get a cryptic compile error
*/
AN_OBFUSCATE_NAME static inline const char *_Nonnull _FBDontCallFromBlock(SEL _Nonnull *_Nonnull sel)
{
  return sel_getName(*sel);
}

/**
 * Annotation to mark a block passed as parameter as not escaping.
 * This annotation is only used in linting, to mark as safe the capture of
 * a cxx reference in a Objective-C block.
 *
 * The annotation is only to be seen as a contract that the developer does
 * with the user of the API, and is not enforced by the compiler in any way.
 *
 * Using `NS_NOESCAPE` correctly is very important.
 * If you attribute a block as `NS_NOESCAPE` and the block were to live beyond the lifetime of the API
 * that the block was passed to (i.e. it "escapes"), it will lead to crashing.
 * The big footgun is that the clang compiler does not help catch using a block in an "escaping" way
 * when the `NS_NOESCAPE` attribute is applied, so it's pure faith that the code is written correctly 😬.
 * Beyond that, incorrectly having a block escape when marked as `NS_NOESCAPE` leads is often masked
 * as a crasher with unoptimized code, thus only seeing the crash in production instead of local development.
 * Since it can be fraught to use `NS_NOESCAPE`, using `FB_LINT_NOESCAPE_BEHAVIOR` can be an option to avoid the risk.
 */
#define FB_LINT_NOESCAPE_BEHAVIOR  __attribute__((annotate("FBLintNoEscapeBehavior")))

/**
 * Annotation that  can be used to create overloadable C functions. This is pretty useful for math
 * stuff where you might have lots of functions with the same name but with different parameter types.
 */
#define FB_OVERLOADABLE __attribute__((__overloadable__))

#define FB_CONST_ATTRIBUTED_GLOBAL_DEFINITION(type, attribute, name) type attribute name = NULL;
#define FB_CONST_GLOBAL_INITIALIZE(name, value) \
        static void __FBConstGlobal ## name ## Initialize(void) __attribute__((constructor(200))); \
        static void __FBConstGlobal ## name ## Initialize(void) \
        { \
          (name) = value; \
        }
#define FB_CONST_NONNULL_GLOBAL(type, name, value) \
        FB_CONST_ATTRIBUTED_GLOBAL_DEFINITION(type, _Nonnull, name) \
        FB_CONST_GLOBAL_INITIALIZE(name, value)
#define FB_CONST_GLOBAL(type, name, value) \
        FB_CONST_ATTRIBUTED_GLOBAL_DEFINITION(type, _Nullable, name) \
        FB_CONST_GLOBAL_INITIALIZE(name, value)

#define FB_BOXABLE __attribute__((objc_boxable))

/************************************************************************************

        SUPPORTING SWIFT INDIRECTION

*************************************************************************************/
/*
  Some APIs are meant to have much nicer Swift interfaces than their Objective-C counterparts.
  See `METAEnvironment` for an example of this.

  To achieve this, we want to offer a clear "mapping" between the Objective-C API and the Swift API.
  That way, the Swift API is evident from the Objective-C API and you cannot use the Objective-C API
  in Swift.

  Following this pattern enables us to leverage these Swiftified APIs when Turbine is used to convert
  Objective-C code to Swift.  See https://www.internalfb.com/code/fbsource/fbobjc/Tools/Turbine/Turbine/README.md
*/

/**
 Redirects an Objective-C API to a Swift API.  Prohibits the API from being used in Swift.

 Example:
    FB_SWIFT_REDIRECT(METAEnvironment, METAEnvironment.App.Build.isSimulator)
    extern BOOL METAIsSimulatorBuild(void);

 Example:
    FB_SWIFT_REDIRECT(METAEnvironment, METAEnvironment.OS.Build.isIOSEquivalentAvailable(major: minor: patch:))
    extern BOOL METAAvailabilityIsIOSVersionEquivalentAvailable(NSInteger majorVersion, NSInteger minorVersion, NSInteger patchVersion);

 Calling the API from Swift will output an error:
    - error: 'METAIsSimulatorBuild()' is unavailable in Swift: Use `METAEnvironment.App.Build.isSimulator` in `:METAEnvironment` instead.
*/
#define FB_SWIFT_REDIRECT(theSwiftModule, theSwiftAPI) NS_SWIFT_UNAVAILABLE("Use `" #theSwiftAPI "` in `:" #theSwiftModule "` instead.")

/**
 Refines an Objective-C API to a Swift API.  the API from being used in Swift.

 Example:
    FB_SWIFT_REFINED(METAMathSwift, CGFloat.abs())
    NS_INLINE CGFloat METAAbsCGFloat(CGFloat value);
*/
#define FB_SWIFT_REFINED(theSwiftModule, theSwiftAPI) NS_REFINED_FOR_SWIFT

/*
  Macros to scope `switch` statements to be either exhaustive or non-exhaustive.
  See //xplat/common/lang/switch.h for more details.
*/

#define FB_EXHAUSTIVE_SWITCH_BEGIN EXHAUSTIVE_SWITCH_BEGIN
#define FB_EXHAUSTIVE_SWITCH_END EXHAUSTIVE_SWITCH_END
#define FB_NON_EXHAUSTIVE_SWITCH_BEGIN NON_EXHAUSTIVE_SWITCH_BEGIN
#define FB_NON_EXHAUSTIVE_SWITCH_END NON_EXHAUSTIVE_SWITCH_END

/*
  Macros for `default:` cases in `switch` statements where the `default` case should never happen. Fail fast!
  See //xplat/common/lang/switch.h for more details.

  `FB_SWITCH_UNEXPECTED_VALUE_ABORT()` - Abort the process due to an unexpected value.

  `FB_SWITCH_UNEXPECTED_VALUE_REPORT(ExpectedType, value)` - Report the unexpected value to FBReport.

  `FB_SWITCH_UNEXPECTED_VALUE_REPORT_AND_ABORT(ExpectedType, unexpectedValue)` - Report the unexpected value to FBReport and abort the process.

  `FB_SWITCH_UNEXPECTED_VALUE_LOG_AND_ABORT(ExpectedType, unexpectedValue)` - Log the unexpected value and abort the process.
*/

#define FB_SWITCH_UNEXPECTED_VALUE_ABORT() SWITCH_UNEXPECTED_VALUE_ABORT()
#define FB_SWITCH_UNEXPECTED_VALUE_LOG_AND_ABORT(value_type, unexpected_value) SWITCH_UNEXPECTED_VALUE_LOG_AND_ABORT(value_type, unexpected_value)
#define FB_SWITCH_UNEXPECTED_VALUE_REPORT_AND_ABORT(value_type, unexpected_value) \
        ({ \
  FB_SWITCH_UNEXPECTED_VALUE_REPORT(value_type, unexpected_value); \
  SWITCH_UNEXPECTED_VALUE_ABORT(); \
})
#if defined(FB_ASSERTIONS_ENABLED) && FB_ASSERTIONS_ENABLED
 #define FB_SWITCH_UNEXPECTED_VALUE_REPORT(value_type, unexpected_value) \
         ({ \
  /* requires `#import <FBReport/FBReport>` */ \
  value_type fb_macro_concat(unexpected_value__, __LINE__) = (unexpected_value); \
  FBCReportMustFix(@"Unexpected " #value_type " value: %ld", (long)fb_macro_concat(unexpected_value__, __LINE__)); \
})
#else
 #define FB_SWITCH_UNEXPECTED_VALUE_REPORT(value_type, unexpected_value) ((void)0)
#endif

/*
Macros for concatenating expandable macros into a single token.
Example:
  int fb_macro_concat(myVar, __LINE__) = 0; // expands to myVar621
*/

#define _fb_macro_concat(a, b) a ## b
#define fb_macro_concat(a, b) _fb_macro_concat(a, b)
