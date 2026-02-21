// (c) Meta Platforms, Inc. and affiliates. Confidential and proprietary.

#import <Foundation/Foundation.h>

#import <FBBaseLite/FBBaseDefines.h>

#ifdef DEBUG
 #define FB_CMOCKS_ENABLED 1
#endif // DEBUG

#ifdef FB_CMOCKS_ENABLED
 #ifdef __cplusplus

  #define FB_CPP_MOCK_DEF(context, api)                                   \
          extern "C++" {                                                          \
                                                                          \
          namespace {                                                             \
            namespace mock_context {                                              \
                                                                          \
              template <typename Signature, Signature Function>                   \
              struct context;                                                     \
                                                                          \
              template <>                                                         \
              struct context<decltype(api), api> {                                \
                template <typename ... Args>                                      \
                decltype(auto) operator()(Args &&... args) noexcept {             \
                  return FB_CMOCK_USE(context, api)(std::forward<Args>(args)...); \
                }                                                                 \
              };                                                                  \
                                                                          \
            } /* namespace mock_context */                                        \
          } /* namespace              */                                          \
          } /* extern "C++"           */

 #else // __cplusplus
  #define FB_CPP_MOCK_DEF(context, api)
 #endif // __cplusplus

 #define FB_CMOCK_PTR(context, api) mockptr_ ## context ## _ ## api
 #define FB_CMOCK_DEF(context, api) \
         FB_EXTERN_C_BEGIN \
         __attribute__((visibility("default"))) __typeof(__typeof(api) *) mockptr_ ## context ## _ ## api = &api; \
         FB_EXTERN_C_END \
         FB_CPP_MOCK_DEF(context, api)
 #define FB_CMOCK_REF(context, api) \
         FB_EXTERN_C_BEGIN \
         extern __attribute__((visibility("default"))) __typeof(__typeof(api) *) mockptr_ ## context ## _ ## api; \
         FB_EXTERN_C_END
 #define FB_CMOCK_SET(context, api, mockapi) (mockptr_ ## context ## _ ## api = &mockapi)
 #define FB_CMOCK_RESET(context, api) (mockptr_ ## context ## _ ## api = &api)
 #define FB_CMOCK_USE(context, api) (*mockptr_ ## context ## _ ## api)
#else
 #define FB_CMOCK_DEF(context, api)
 #define FB_CMOCK_REF(context, api)
 #define FB_CMOCK_SET(context, api, mockapi)
 #define FB_CMOCK_RESET(context, api)
 #define FB_CMOCK_USE(context, api) api
#endif // FB_CMOCKS_ENABLED
