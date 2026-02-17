// (c) Meta Platforms, Inc. and affiliates. Confidential and proprietary.

#ifndef XPLAT_COMMON_LANG_SWITCH_H
#define XPLAT_COMMON_LANG_SWITCH_H

/**
  Macro for writing exhaustive `switch` statements.
  See `//xplat/common/lang/README.md` for more details.

  ```
  EXHAUSTIVE_SWITCH_BEGIN
  switch (c) {
    ...
  }
  EXHAUSTIVE_SWITCH_END
  ```

  This macro is unnecessary if the compiler defaults are already set to
  `-Wswitch-enum`, `-Wswitch-default`, and `-Wno-covered-switch-default`.
 */
#define EXHAUSTIVE_SWITCH_BEGIN _EXHAUSTIVE_SWITCH_BEGIN_IMP
#define EXHAUSTIVE_SWITCH_END _EXHAUSTIVE_SWITCH_END_IMP

/**
  Macro for writing non-exhaustive `switch` statements.
  See `//xplat/common/lang/README.md` for more details.

  ```
  NON_EXHAUSTIVE_SWITCH_BEGIN
  switch (c) {
    ...
  }
  NON_EXHAUSTIVE_SWITCH_END
  ```
 */
#define NON_EXHAUSTIVE_SWITCH_BEGIN _NON_EXHAUSTIVE_SWITCH_BEGIN_IMP
#define NON_EXHAUSTIVE_SWITCH_END _NON_EXHAUSTIVE_SWITCH_END_IMP

/**
  Macro to abort when encountering an unexpected enum value.
  ```
  switch (c) {
    ...
    default:
      SWITCH_UNEXPECTED_VALUE_ABORT();
  }
  ```
 */
#define SWITCH_UNEXPECTED_VALUE_ABORT() abort()

#define _SWITCH_CONCAT(a, b) a##b
#define SWITCH_CONCAT(a, b) _SWITCH_CONCAT(a, b)

/**
  Macro to abort when encountering an unexpected enum value.
  ```
  switch (c) {
    ...
    default:
      SWITCH_UNEXPECTED_VALUE_LOG_AND_ABORT(Color, c);
  }
  ```
 */
#define SWITCH_UNEXPECTED_VALUE_LOG_AND_ABORT(value_type, unexpected_value) \
  ({                                                                        \
    value_type SWITCH_CONCAT(unexpected_value__, __LINE__) =                \
        (unexpected_value);                                                 \
    fprintf(                                                                \
        stderr,                                                             \
        "Unexpected " #value_type " value: %ld\n",                          \
        (long)SWITCH_CONCAT(unexpected_value__, __LINE__));                 \
    abort();                                                                \
  })

/*
  SUPPORT MACROS, DO NOT USE DIRECTLY
*/

#if defined(__has_warning) && (defined(__GNUC__) || defined(__clang__))
#define _LANG_DIAGNOSTIC_PUSH _Pragma("GCC diagnostic push")
#define _LANG_DIAGNOSTIC_POP _Pragma("GCC diagnostic pop")
#if __has_warning("-Wcovered-switch-default")
#define _LANG_DIAGNOSTIC_IGNORED_WCOVERED_SWITCH_DEFAULT \
  _Pragma("GCC diagnostic ignored \"-Wcovered-switch-default\"")
#define _LANG_DIAGNOSTIC_ERROR_WCOVERED_SWITCH_DEFAULT \
  _Pragma("GCC diagnostic error \"-Wcovered-switch-default\"")
#else
#define _LANG_DIAGNOSTIC_IGNORED_WCOVERED_SWITCH_DEFAULT
#define _LANG_DIAGNOSTIC_ERROR_WCOVERED_SWITCH_DEFAULT
#endif
#if __has_warning("-Wswitch-enum")
#define _LANG_DIAGNOSTIC_IGNORED_WSWITCH_ENUM \
  _Pragma("GCC diagnostic ignored \"-Wswitch-enum\"")
#define _LANG_DIAGNOSTIC_ERROR_WSWITCH_ENUM \
  _Pragma("GCC diagnostic error \"-Wswitch-enum\"")
#else
#define _LANG_DIAGNOSTIC_IGNORED_WSWITCH_ENUM
#define _LANG_DIAGNOSTIC_ERROR_WSWITCH_ENUM
#endif
#if __has_warning("-Wswitch-default")
#define _LANG_DIAGNOSTIC_IGNORED_WSWITCH_DEFAULT \
  _Pragma("GCC diagnostic ignored \"-Wswitch-default\"")
#define _LANG_DIAGNOSTIC_ERROR_WSWITCH_DEFAULT \
  _Pragma("GCC diagnostic error \"-Wswitch-default\"")
#else
#define _LANG_DIAGNOSTIC_IGNORED_WSWITCH_DEFAULT
#define _LANG_DIAGNOSTIC_ERROR_WSWITCH_DEFAULT
#endif
#else
#define _LANG_DIAGNOSTIC_PUSH
#define _LANG_DIAGNOSTIC_POP
#define _LANG_DIAGNOSTIC_IGNORED_WCOVERED_SWITCH_DEFAULT
#define _LANG_DIAGNOSTIC_ERROR_WCOVERED_SWITCH_DEFAULT
#define _LANG_DIAGNOSTIC_IGNORED_WSWITCH_ENUM
#define _LANG_DIAGNOSTIC_ERROR_WSWITCH_ENUM
#define _LANG_DIAGNOSTIC_IGNORED_WSWITCH_DEFAULT
#define _LANG_DIAGNOSTIC_ERROR_WSWITCH_DEFAULT
#endif

#define _EXHAUSTIVE_SWITCH_BEGIN_IMP               \
  _LANG_DIAGNOSTIC_PUSH                            \
  _LANG_DIAGNOSTIC_IGNORED_WCOVERED_SWITCH_DEFAULT \
  _LANG_DIAGNOSTIC_ERROR_WSWITCH_DEFAULT           \
  _LANG_DIAGNOSTIC_ERROR_WSWITCH_ENUM

#define _EXHAUSTIVE_SWITCH_END_IMP _LANG_DIAGNOSTIC_POP

#define _NON_EXHAUSTIVE_SWITCH_BEGIN_IMP         \
  _LANG_DIAGNOSTIC_PUSH                          \
  _LANG_DIAGNOSTIC_ERROR_WCOVERED_SWITCH_DEFAULT \
  _LANG_DIAGNOSTIC_ERROR_WSWITCH_DEFAULT         \
  _LANG_DIAGNOSTIC_IGNORED_WSWITCH_ENUM

#define _NON_EXHAUSTIVE_SWITCH_END_IMP _LANG_DIAGNOSTIC_POP

#endif // XPLAT_COMMON_LANG_SWITCH_H
