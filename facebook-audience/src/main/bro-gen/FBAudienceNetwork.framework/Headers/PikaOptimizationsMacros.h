// (c) Meta Platforms, Inc. and affiliates. Confidential and proprietary.

/*
 * This file defines macros that affect Pika, Facebook's in-house clang variant
 * that adds additional opportunity for optimization. Macros for upstream clang
 * features can go in FBBaseLite/FBBaseDefines.h.
 */

#ifndef PIKA_OPTIMIZATIONS_MACROS
#define PIKA_OPTIMIZATIONS_MACROS
#ifndef PIKA_LAZY_INIT
#define PIKA_LAZY_INIT
#endif

/* WIKI: https://fburl.com/ivar-metadata-removal */
#ifndef NO_DYNAMIC_IVARS
#if defined(__has_attribute) && __has_attribute(objc_no_dynamic_ivar_use) && \
    defined(ENABLE_ANNOTATION_NO_DYNAMIC_IVARS)
#define NO_DYNAMIC_IVARS __attribute__((objc_no_dynamic_ivar_use))
#else
#define NO_DYNAMIC_IVARS
#endif
#endif

#ifndef FB_KEEP_DESCRIPTOR_ENCODING
#if defined(__has_attribute) && __has_attribute(keep_descriptor)
#define FB_KEEP_DESCRIPTOR_ENCODING __attribute__((keep_descriptor))
#else
#define FB_KEEP_DESCRIPTOR_ENCODING
#endif
#endif

// OBJC_DIRECT MACROS START =============
/**
 Pika toolchain performs compile time optimizations by removing some of objc
  dynamic functionality from methods and properties.
  If you need to keep a dynamic behavior you should mark tell it to Pika
toolchain by using FB_DYNAMIC on properties and FB_OBJC_DYNAMIC on methods.

  Without these annotation, Pika toolchain may potentially devirtilize methods
and properties' accessors by removing objc dynamic "target selector" calls and
resolve them to direct c style function calls at compile time.

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

/* WIKI: https://fburl.com/fb_direct */
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

// mark @interface class and category
#if !defined FB_OBJC_DYNAMIC_MEMBERS
#if __has_attribute(objc_dynamic_members) && defined(ENABLE_OBJC_DIRECT)
#define FB_OBJC_DYNAMIC_MEMBERS __attribute__((objc_dynamic_members))
#else
#define FB_OBJC_DYNAMIC_MEMBERS
#endif
#endif

/* WIKI: https://fburl.com/fb_objc_direct */
#ifndef FB_OBJC_DIRECT
#if __has_feature(objc_direct) && defined(ENABLE_OBJC_DIRECT)
#define FB_OBJC_DIRECT __attribute((objc_direct))
#else
#define FB_OBJC_DIRECT
#endif // #if __has_feature(objc_direct)
#endif // FB_OBJC_DIRECT

/* WIKI: https://fburl.com/fb_objc_direct */
#ifndef FB_OBJC_DIRECT_MEMBERS
#if __has_feature(objc_direct) && defined(ENABLE_OBJC_DIRECT)
#define FB_OBJC_DIRECT_MEMBERS __attribute((objc_direct_members))
#else
#define FB_OBJC_DIRECT_MEMBERS
#endif // #if __has_feature(objc_direct) && defined(ENABLE_OBJC_DIRECT)
#endif // FB_OBJC_DIRECT_MEMBERS

// OBJC_DIRECT MACROS END =============

/* WIKI: https://fburl.com/pika-non-runtime-protocol */
#ifndef NON_RUNTIME_PROTOCOL
#if defined(__has_attribute) && __has_attribute(objc_non_runtime_protocol) && \
    defined(ENABLE_NON_RUNTIME_PROTOCOL)
#define NON_RUNTIME_PROTOCOL __attribute__((objc_non_runtime_protocol))
#else
#define NON_RUNTIME_PROTOCOL
#endif
#endif

// mark a protocol that'll be used dynamically at runtime, e.g. via
// objc_getProtocol and prevent the codemod from considering it as a candidate
// of non_runtime_protocol
#ifndef FB_RUNTIME_PROTOCOL
#if defined(__has_attribute) && __has_attribute(objc_runtime_protocol) && \
    defined(ENABLE_NON_RUNTIME_PROTOCOL)
#define FB_RUNTIME_PROTOCOL __attribute__((objc_runtime_protocol))
#else
#define FB_RUNTIME_PROTOCOL
#endif
#endif

#ifndef AN_OBFUSCATE_CLASS_NAME
#if defined(__has_attribute) && __has_attribute(hash_rename) && \
    defined(ENABLE_AN_OBFUSCATE_CLASS_NAME)
#define AN_OBFUSCATE_CLASS_NAME __attribute__((hash_rename))
#else
#define AN_OBFUSCATE_CLASS_NAME
#endif
#endif

#ifndef AN_OBFUSCATE_NAME
#if defined(__has_attribute) && __has_attribute(hash_rename) && \
    defined(ENABLE_AN_OBFUSCATE_NAME)
#define AN_OBFUSCATE_NAME __attribute__((hash_rename))
#else
#define AN_OBFUSCATE_NAME
#endif
#endif

// Some identifiers share the same name with API Functions.
// These identifiers are still annotated with the hash_rename attribute,
// but separately denoted with AN_OBFUSCATE_DUPNAME to denote they
// may share name with other identifiers.
#ifndef AN_OBFUSCATE_DUPNAME
#if defined(__has_attribute) && __has_attribute(hash_rename) && \
    defined(ENABLE_AN_OBFUSCATE_NAME)
#define AN_OBFUSCATE_DUPNAME __attribute__((hash_rename))
#else
#define AN_OBFUSCATE_DUPNAME
#endif
#endif

//   This macro is used to denote those methods / properties that are
// called by @selector expresssions, but otherwise can be hash-renamed.
// For now all methods called by @selector() expressions are not hash-renamed.
// This is because developers may forget adding the AN_OBFUSCATE_SEL macro
// in expression & result in unexpected run time error.
//   In future, Pika can generate correct warnings for undeclared hash-renamed
// selector (which are raised to errors for the AN SDK). The misses by
// developers will result in compilation errors instead of runtime errors (would
// not be ignored). Then we can expand this macro into
// __attribute__((hash_rename)).
#define AN_OBFUSCATE_SELCALL

//   AN_OBFUSCATE_SEL should evaluate to ```,hash_rename``` inside a
// @selector() expression. This allows @selector() to match correct method
// when the corresponding method is hash-renamed. For now, this is expanded
// to empty: no method called by the @selector() expression is hash-renamed.
// This is because it is easy for developer to miss AN_OBFUSCATE_SEL when
// writing a @selector() expression.
//   In future, if Pika can properly handle undeclared selector error for
// for hash-renamed @selector() expressions, then we can expand this macro,
// as such issues would cause a compile time errror & will not be neglected.
#define AN_OBFUSCATE_SEL

#ifndef AN_HIDE_STR
#if defined(ENABLE_AN_HIDE_VAL)
#define AN_HIDE_STR(STR_VAL) "PLACEHOLDER"
#else
#define AN_HIDE_STR(STR_VAL) STR_VAL
#endif
#endif

#ifndef AN_HIDE_INT
#if defined(ENABLE_AN_HIDE_VAL)
#define AN_HIDE_INT(INT_VAL) 0
#else
#define AN_HIDE_INT(INT_VAL) INT_VAL
#endif
#endif

#endif /* PIKA_OPTIMIZATIONS_MACROS */
