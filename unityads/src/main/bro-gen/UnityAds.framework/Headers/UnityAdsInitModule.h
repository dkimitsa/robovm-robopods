#ifndef UnityAdsInitModule_h
#define UnityAdsInitModule_h

/// Registers an Objective-C class as a Unity Ads init module.
///
/// `UnityAdsInitModuleListener` is declared in Swift, so an Objective-C file that implements it
/// needs `#import <UnityAds/UnityAds-Swift.h>` (Xcode's generated interface for this framework's
/// Swift API) in addition to `#import <UnityAds/UnityAds.h>` -- the umbrella header alone does not
/// make it visible; whether it appears to work without the second import depends on the consuming
/// target's own Clang modules setting, so don't rely on that.
///
/// Place the macro once at file scope in the module's own `.m` file, together with the
/// `@implementation` of the class that implements `UnityAdsInitModuleListener`:
///
///     UADS_INIT_MODULE(LPMInitModuleReceiver)
///
/// It stores the class symbol in the `__DATA,__uads_mods` Mach-O section. Unity Ads reads that
/// section from every loaded image during initialization, instantiates each class with its
/// no-argument initializer, and delivers the module's config slice to it. Nothing else is
/// required: no runtime registration call and no change to Unity Ads when a new module is added.
///
/// Lifecycle: Unity Ads creates each module instance once, lazily during the first initialization
/// that has `enable_modules_init` on, on a background thread, and reuses that instance for the rest of
/// the process. The no-argument initializer must be cheap and thread-safe, and must not require the
/// main thread.
///
/// A Swift-authored module cannot place this macro inside a `.swift` file (the compiler attribute
/// has no Swift equivalent), so it needs a small Objective-C file of its own. That file must define
/// real Objective-C metadata for the class -- an empty category is enough -- not just reference it:
///
///     // MyModule+UADSInitModule.m
///     @interface MyModule (UADSInitModule)
///     @end
///     @implementation MyModule (UADSInitModule)
///     @end
///
///     UADS_INIT_MODULE(MyModule)
///
/// The referenced class must be visible to Objective-C (`@objc(Name)` on a Swift class), so its
/// symbol is `OBJC_CLASS_$_Name`.
///
/// The class symbol is referenced, so dead-stripping never removes the class once its object file
/// is in the link. Getting the object file into the link in the first place is a separate problem:
/// a static library's object file enters the link only if it defines something the app references,
/// or the app force-loads it. `-ObjC` (which CocoaPods sets automatically for static pods) pulls in
/// every object file that defines an Objective-C class *or category* -- which is why the category
/// above matters. A `.m` file containing only this macro defines neither: it references the class's
/// symbol but does not define it, so `-ObjC` has nothing in that file to select and the module is
/// silently dropped. SPM and a manual xcframework drop do not set `-ObjC` at all, so a module whose
/// class is not already referenced by other linked code must document `-force_load` instead.
#define UADS_INIT_MODULE(cls) \
    extern char OBJC_CLASS_$_##cls; \
    __attribute__((used, section("__DATA,__uads_mods"))) \
    static void *const kUADSInitModule_##cls = &OBJC_CLASS_$_##cls;

#endif /* UnityAdsInitModule_h */
