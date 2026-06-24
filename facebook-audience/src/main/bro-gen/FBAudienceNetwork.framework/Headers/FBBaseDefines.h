// (c) Meta Platforms, Inc. and affiliates. Confidential and proprietary.

#ifndef FBBASELITE_DEFINES_H
#define FBBASELITE_DEFINES_H

// The C++ compiler mangles names. extern "C" { /* your declarations */ }
// prevents this mangling. You should wrap all variables and functions declared
// in headers with FB_EXTERN_C_BEGIN/END, even if they are included only from
// non-cpp files. It's common for these files to start using C++ features.
// Always wrapping the prototypes with FB_EXTERN_C_BEGIN/END will save someone a
// headache once they need to do this. See StackOverflow for more details:
// Additionally, marking each variable and function with FB_EXPORT is required
// to prevent the compiler from erroring on undefined symbols.
// http://stackoverflow.com/questions/1041866/in-c-source-what-is-the-effect-of-extern-c
#ifdef __cplusplus
#define FB_EXTERN_C_BEGIN extern "C" {
#define FB_EXTERN_C_END }
#define FB_EXTERN_C extern "C"
#else
#define FB_EXTERN_C_BEGIN
#define FB_EXTERN_C_END
#define FB_EXTERN_C extern
#endif

#ifdef __GNUC__
#define FB_GNUC(major, minor) \
  (__GNUC__ > (major) || (__GNUC__ == (major) && __GNUC_MINOR__ >= (minor)))
#else
#define FB_GNUC(major, minor) 0
#endif

// Use FB_INLINE for inline non-class functions in header files or non-cpp
// files.  If you need an inline function in a .cpp file, define it in the
// unnamed namespace and use use `inline` directly.
#ifndef FB_INLINE
#if defined(__STDC_VERSION__) && __STDC_VERSION__ >= 199901L
#define FB_INLINE static inline
#elif defined(__MWERKS__) || defined(__cplusplus)
#define FB_INLINE static inline
#elif FB_GNUC(3, 0)
#define FB_INLINE static __inline__ __attribute__((always_inline))
#else
#define FB_INLINE static
#endif
#endif

#ifndef FB_HIDDEN
#if FB_GNUC(4, 0)
#define FB_HIDDEN __attribute__((visibility("hidden")))
#else
#define FB_HIDDEN /* no hidden */
#endif
#endif

// To help with binary size some projects are configured to hide symbols by
// default when compiling their definitions. This means that a symbol will not
// be visible to the linker unless it is explicitly exported.
// See https://fburl.com/wiki/7k7ujy20
#ifndef FB_EXPORT
#if FB_GNUC(4, 0)
#define FB_EXPORT __attribute__((visibility("default")))
#else
#define FB_EXPORT /* no visibility default */
#endif
#endif

#ifndef FB_PURE
#if FB_GNUC(3, 0)
#define FB_PURE __attribute__((pure))
#else
#define FB_PURE /* no pure */
#endif
#endif

#ifndef FB_CONST
#if FB_GNUC(3, 0)
#define FB_CONST __attribute__((const))
#else
#define FB_CONST /* no const */
#endif
#endif

#ifndef FB_WARN_UNUSED
#if FB_GNUC(3, 4)
#define FB_WARN_UNUSED __attribute__((warn_unused_result))
#else
#define FB_WARN_UNUSED /* no warn_unused */
#endif
#endif

// For deprecated macros, the preprocessor symbol FB_WARN_DEPRECATED
// can be defined to disable all internal deprecations.
// Pass -DFB_WARN_DEPRECATED=0 to the
// compiler frontend to disable internal deprecations using these macros.
#ifndef FB_WARN_DEPRECATED
#define FB_WARN_DEPRECATED 1
#endif

/*

  We support 3 levels of deprecation:

    * soft: a warning by default with Pika
    * firm: a warning with Pika, but an error in CI for new code
    * hard: a build failure with Pika

*/

#ifndef FB_DEPRECATED_SOFT
#if FB_WARN_DEPRECATED
// Mark an internal API as deprecated.
// Will be "soft" deprecated ("meta-deprecated-soft: msg"), or a warning by
// default.
#define FB_DEPRECATED_SOFT(msg) \
  __attribute__((deprecated("meta-deprecated-soft: " msg "")))
#else
#define FB_DEPRECATED_SOFT(msg)
#endif
#endif

#ifndef FB_DEPRECATED_FIRM
#if FB_WARN_DEPRECATED
// Mark an internal API as deprecated.
// Will be "firm" deprecated ("meta-deprecated-firm: msg"), or an error by
// default.
#define FB_DEPRECATED_FIRM(msg) \
  __attribute__((deprecated("meta-deprecated-firm: " msg "")))
#else
#define FB_DEPRECATED_FIRM(msg)
#endif
#endif

#ifndef FB_DEPRECATED_HARD
#if FB_WARN_DEPRECATED
// Mark an internal API as deprecated.
// Will be "hard" deprecated ("meta-deprecated-hard: msg"), or an error by
// default.
#define FB_DEPRECATED_HARD(msg) \
  __attribute__((deprecated("meta-deprecated-hard: " msg "")))
#else
#define FB_DEPRECATED_HARD(msg)
#endif
#endif

#ifndef FB_DEPRECATED
#if FB_GNUC(3, 0) && FB_WARN_DEPRECATED
// Mark an internal API as deprecated.
// Will be "soft" deprecated ("meta-deprecated-soft"), see `FB_DEPRECATED_SOFT`.
#define FB_DEPRECATED __attribute__((deprecated("meta-deprecated-soft")))
#else
#define FB_DEPRECATED
#endif
#endif

#if defined(__cplusplus) && defined(__GNUC__)
#define FB_NOTHROW __attribute__((nothrow))
#elif !defined(FB_NOTHROW)
#define FB_NOTHROW
#endif

#define ARRAY_COUNT(x) sizeof(x) / sizeof(x[0])

#ifndef __has_feature // Optional.
#define __has_feature(x) 0 // Compatibility with non-clang compilers.
#endif

// As of January 2022, FB_DYLIB_EXPORT is *not* required to use FBDynamicCall.
//
// FBDynamicCall is powered via XPlugins, which holds a reference to every
// function in the `dynamic_calls` field of a buck target, making it impossible
// to strip.
//
// Thus:
//  - functions used in FBDynamicCall don't need `__attribute((used))`, XPlugins
//  keeps them alive.
//  - functions used in FBDynamicCall don't need default visiblity, their
//  pointer is obtained
//    via the XPlugins pointer table.
#ifndef FB_DYLIB_EXPORT
#if FB_GNUC(4, 0)
#define FB_DYLIB_EXPORT \
  __attribute__((visibility("default"))) __attribute__((used))
#else
#define FB_DYLIB_EXPORT /* no dylib export */
#endif
#endif

// Clang / GCC (as of v10.0) have `__has_builtin`, otherwise define it to off
#ifndef __has_builtin
#define __has_builtin(x) 0
#endif

// `likely(...)` and `unlikely(...)` are the common definitions for the built in
// expect check. This helps the compiler organize the output assembly w/ branch
// predictions for better optimizations making the `likely` case effectively
// free. define `likely` and `unlikely` if not already defined...
// ... if we have `__builtin_expect`, use that; otherwise don't apply the built
// in and leave the expression as-is
#if __has_builtin(__builtin_expect)
#ifndef likely
#define likely(expr) __builtin_expect(!!(expr), 1)
#endif
#ifndef unlikely
#define unlikely(expr) __builtin_expect(!!(expr), 0)
#endif
#else
#ifndef likely
#define likely(expr) (expr)
#endif
#ifndef unlikely
#define unlikely(expr) (expr)
#endif
#endif

#ifndef FB_MACRO_CONCAT
// Helpful macros for creating unique named variables that could end up used
// multiple times in the same scope. Only downside, won't be unique for
// expansions on the same line of code...
#define _FB_MACRO_CONCAT(a, b) a##b
#define FB_MACRO_CONCAT(a, b) _FB_MACRO_CONCAT(a, b)
#define FB_UNIQUE_NAME(name) FB_MACRO_CONCAT(name, __LINE__)
#endif

#ifndef FB_COUNT_VA_ARGS
#define _FB_COUNT_VA_ARGS_N( \
    _1,                      \
    _2,                      \
    _3,                      \
    _4,                      \
    _5,                      \
    _6,                      \
    _7,                      \
    _8,                      \
    _9,                      \
    _10,                     \
    _11,                     \
    _12,                     \
    _13,                     \
    _14,                     \
    _15,                     \
    _16,                     \
    _17,                     \
    _18,                     \
    _19,                     \
    _20,                     \
    _21,                     \
    _22,                     \
    _23,                     \
    _24,                     \
    _25,                     \
    _26,                     \
    _27,                     \
    _28,                     \
    _29,                     \
    _30,                     \
    _31,                     \
    _32,                     \
    _33,                     \
    _34,                     \
    _35,                     \
    _36,                     \
    _37,                     \
    _38,                     \
    _39,                     \
    _40,                     \
    _41,                     \
    _42,                     \
    _43,                     \
    _44,                     \
    _45,                     \
    _46,                     \
    _47,                     \
    _48,                     \
    _49,                     \
    _50,                     \
    _51,                     \
    _52,                     \
    _53,                     \
    _54,                     \
    _55,                     \
    _56,                     \
    _57,                     \
    _58,                     \
    _59,                     \
    _60,                     \
    _61,                     \
    _62,                     \
    _63,                     \
    N,                       \
    ...)                     \
  N

#define _FB_COUNT_VA_ARGS_(...) _FB_COUNT_VA_ARGS_N(__VA_ARGS__)

/// If argument is empty, its length equals 1 (because #__VA_ARGS__ == '\0')
#define FB_COUNT_VA_ARGS(...)                     \
  (sizeof(#__VA_ARGS__) - 1 ? _FB_COUNT_VA_ARGS_( \
                                  __VA_ARGS__,    \
                                  63,             \
                                  62,             \
                                  61,             \
                                  60,             \
                                  59,             \
                                  58,             \
                                  57,             \
                                  56,             \
                                  55,             \
                                  54,             \
                                  53,             \
                                  52,             \
                                  51,             \
                                  50,             \
                                  49,             \
                                  48,             \
                                  47,             \
                                  46,             \
                                  45,             \
                                  44,             \
                                  43,             \
                                  42,             \
                                  41,             \
                                  40,             \
                                  39,             \
                                  38,             \
                                  37,             \
                                  36,             \
                                  35,             \
                                  34,             \
                                  33,             \
                                  32,             \
                                  31,             \
                                  30,             \
                                  29,             \
                                  28,             \
                                  27,             \
                                  26,             \
                                  25,             \
                                  24,             \
                                  23,             \
                                  22,             \
                                  21,             \
                                  20,             \
                                  19,             \
                                  18,             \
                                  17,             \
                                  16,             \
                                  15,             \
                                  14,             \
                                  13,             \
                                  12,             \
                                  11,             \
                                  10,             \
                                  9,              \
                                  8,              \
                                  7,              \
                                  6,              \
                                  5,              \
                                  4,              \
                                  3,              \
                                  2,              \
                                  1,              \
                                  0)              \
                            : 0)
#endif

#ifndef META_FOR_EACH_VA_ARG
#define _META_FOR_EACH_VA_ARG_0(_META_ARG_MACRO)
#define _META_FOR_EACH_VA_ARG_1(_META_ARG_MACRO, X) _META_ARG_MACRO(X)
#define _META_FOR_EACH_VA_ARG_2(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_1(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_3(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_2(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_4(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_3(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_5(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_4(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_6(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_5(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_7(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_6(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_8(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_7(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_9(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_8(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_10(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_9(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_11(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_10(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_12(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_11(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_13(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_12(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_14(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_13(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_15(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_14(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_16(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_15(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_17(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_16(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_18(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_17(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_19(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_18(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_20(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_19(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_21(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_20(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_22(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_21(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_23(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_22(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_24(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_23(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_25(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_24(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_26(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_25(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_27(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_26(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_28(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_27(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_29(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_28(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_30(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_29(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_31(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_30(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_32(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_31(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_33(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_32(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_34(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_33(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_35(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_34(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_36(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_35(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_37(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_36(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_38(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_37(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_39(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_38(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_40(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_39(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_41(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_40(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_42(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_41(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_43(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_42(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_44(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_43(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_45(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_44(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_46(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_45(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_47(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_46(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_48(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_47(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_49(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_48(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_50(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_49(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_51(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_50(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_52(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_51(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_53(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_52(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_54(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_53(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_55(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_54(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_56(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_55(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_57(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_56(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_58(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_57(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_59(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_58(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_60(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_59(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_61(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_60(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_62(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_61(_META_ARG_MACRO, __VA_ARGS__)
#define _META_FOR_EACH_VA_ARG_63(_META_ARG_MACRO, X, ...) \
  _META_ARG_MACRO(X) _META_FOR_EACH_VA_ARG_62(_META_ARG_MACRO, __VA_ARGS__)

#define _META_EXPAND( \
    _0,               \
    _1,               \
    _2,               \
    _3,               \
    _4,               \
    _5,               \
    _6,               \
    _7,               \
    _8,               \
    _9,               \
    _10,              \
    _11,              \
    _12,              \
    _13,              \
    _14,              \
    _15,              \
    _16,              \
    _17,              \
    _18,              \
    _19,              \
    _20,              \
    _21,              \
    _22,              \
    _23,              \
    _24,              \
    _25,              \
    _26,              \
    _27,              \
    _28,              \
    _29,              \
    _30,              \
    _31,              \
    _32,              \
    _33,              \
    _34,              \
    _35,              \
    _36,              \
    _37,              \
    _38,              \
    _39,              \
    _40,              \
    _41,              \
    _42,              \
    _43,              \
    _44,              \
    _45,              \
    _46,              \
    _47,              \
    _48,              \
    _49,              \
    _50,              \
    _51,              \
    _52,              \
    _53,              \
    _54,              \
    _55,              \
    _56,              \
    _57,              \
    _58,              \
    _59,              \
    _60,              \
    _61,              \
    _62,              \
    _63,              \
    _EXPANSION,       \
    ...)              \
  _EXPANSION

#define META_FOR_EACH_VA_ARG(_META_ARG_MACRO, ...) \
  _META_EXPAND(                                    \
      _META_FOR_EACH_VA_ARG_0,                     \
      __VA_ARGS__,                                 \
      _META_FOR_EACH_VA_ARG_63,                    \
      _META_FOR_EACH_VA_ARG_62,                    \
      _META_FOR_EACH_VA_ARG_61,                    \
      _META_FOR_EACH_VA_ARG_60,                    \
      _META_FOR_EACH_VA_ARG_59,                    \
      _META_FOR_EACH_VA_ARG_58,                    \
      _META_FOR_EACH_VA_ARG_57,                    \
      _META_FOR_EACH_VA_ARG_56,                    \
      _META_FOR_EACH_VA_ARG_55,                    \
      _META_FOR_EACH_VA_ARG_54,                    \
      _META_FOR_EACH_VA_ARG_53,                    \
      _META_FOR_EACH_VA_ARG_52,                    \
      _META_FOR_EACH_VA_ARG_51,                    \
      _META_FOR_EACH_VA_ARG_50,                    \
      _META_FOR_EACH_VA_ARG_49,                    \
      _META_FOR_EACH_VA_ARG_48,                    \
      _META_FOR_EACH_VA_ARG_47,                    \
      _META_FOR_EACH_VA_ARG_46,                    \
      _META_FOR_EACH_VA_ARG_45,                    \
      _META_FOR_EACH_VA_ARG_44,                    \
      _META_FOR_EACH_VA_ARG_43,                    \
      _META_FOR_EACH_VA_ARG_42,                    \
      _META_FOR_EACH_VA_ARG_41,                    \
      _META_FOR_EACH_VA_ARG_40,                    \
      _META_FOR_EACH_VA_ARG_39,                    \
      _META_FOR_EACH_VA_ARG_38,                    \
      _META_FOR_EACH_VA_ARG_37,                    \
      _META_FOR_EACH_VA_ARG_36,                    \
      _META_FOR_EACH_VA_ARG_35,                    \
      _META_FOR_EACH_VA_ARG_34,                    \
      _META_FOR_EACH_VA_ARG_33,                    \
      _META_FOR_EACH_VA_ARG_32,                    \
      _META_FOR_EACH_VA_ARG_31,                    \
      _META_FOR_EACH_VA_ARG_30,                    \
      _META_FOR_EACH_VA_ARG_29,                    \
      _META_FOR_EACH_VA_ARG_28,                    \
      _META_FOR_EACH_VA_ARG_27,                    \
      _META_FOR_EACH_VA_ARG_26,                    \
      _META_FOR_EACH_VA_ARG_25,                    \
      _META_FOR_EACH_VA_ARG_24,                    \
      _META_FOR_EACH_VA_ARG_23,                    \
      _META_FOR_EACH_VA_ARG_22,                    \
      _META_FOR_EACH_VA_ARG_21,                    \
      _META_FOR_EACH_VA_ARG_20,                    \
      _META_FOR_EACH_VA_ARG_19,                    \
      _META_FOR_EACH_VA_ARG_18,                    \
      _META_FOR_EACH_VA_ARG_17,                    \
      _META_FOR_EACH_VA_ARG_16,                    \
      _META_FOR_EACH_VA_ARG_15,                    \
      _META_FOR_EACH_VA_ARG_14,                    \
      _META_FOR_EACH_VA_ARG_13,                    \
      _META_FOR_EACH_VA_ARG_12,                    \
      _META_FOR_EACH_VA_ARG_11,                    \
      _META_FOR_EACH_VA_ARG_10,                    \
      _META_FOR_EACH_VA_ARG_9,                     \
      _META_FOR_EACH_VA_ARG_8,                     \
      _META_FOR_EACH_VA_ARG_7,                     \
      _META_FOR_EACH_VA_ARG_6,                     \
      _META_FOR_EACH_VA_ARG_5,                     \
      _META_FOR_EACH_VA_ARG_4,                     \
      _META_FOR_EACH_VA_ARG_3,                     \
      _META_FOR_EACH_VA_ARG_2,                     \
      _META_FOR_EACH_VA_ARG_1,                     \
      _META_FOR_EACH_VA_ARG_0)                     \
  (_META_ARG_MACRO, __VA_ARGS__)

#endif
#ifndef META_COMMENT_FUNCTION_ARGUMENT_NAMES
#if defined(DEBUG) && DEBUG
#define META_COMMENT_FUNCTION_ARGUMENT_NAMES \
  __attribute__((annotate("meta_comment_function_argument_names")))
#else // DEBUG
#define META_COMMENT_FUNCTION_ARGUMENT_NAMES
#endif // DEBUG
#endif // META_COMMENT_FUNCTION_ARGUMENT_NAMES

#ifndef META_COMMENT_FUNCTION_ARGUMENT_NAMES_IGNORED_ARGUMENT
#if defined(DEBUG) && DEBUG
#define META_COMMENT_FUNCTION_ARGUMENT_NAMES_IGNORED_ARGUMENT \
  __attribute__((                                             \
      annotate("meta_comment_function_argument_names_ignored_argument")))
#else // DEBUG
#define META_COMMENT_FUNCTION_ARGUMENT_NAMES_IGNORED_ARGUMENT
#endif // DEBUG
#endif // META_COMMENT_FUNCTION_ARGUMENT_NAMES_IGNORED_ARGUMENT

#endif /* FBBASELITE_DEFINES_H */
