/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.firebase.auth;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAuth/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UISceneDelegate, FIRAuthInterop, UIApplicationDelegate/*</implements>*/ {

    /*<ptr>*/public static class FIRAuthPtr extends Ptr<FIRAuth, FIRAuthPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAuth.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAuth() {}
    protected FIRAuth(Handle h, long handle) { super(h, handle); }
    protected FIRAuth(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "app")
    public native org.robovm.pods.firebase.core.FIRApp getApp();
    @Property(selector = "currentUser")
    public native FIRUser getCurrentUser();
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    @Property(selector = "settings")
    public native FIRAuthSettings getSettings();
    @Property(selector = "setSettings:")
    public native void setSettings(FIRAuthSettings v);
    @Property(selector = "userAccessGroup")
    public native String getUserAccessGroup();
    @Property(selector = "shareAuthStateAcrossDevices")
    public native boolean isShareAuthStateAcrossDevices();
    @Property(selector = "setShareAuthStateAcrossDevices:")
    public native void setShareAuthStateAcrossDevices(boolean v);
    @Property(selector = "tenantID")
    public native String getTenantID();
    @Property(selector = "setTenantID:")
    public native void setTenantID(String v);
    @Property(selector = "customAuthDomain")
    public native String getCustomAuthDomain();
    @Property(selector = "setCustomAuthDomain:")
    public native void setCustomAuthDomain(String v);
    @Property(selector = "APNSToken")
    public native NSData getAPNSToken();
    @Property(selector = "window")
    public native UIWindow getWindow();
    @Property(selector = "setWindow:")
    public native void setWindow(UIWindow v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="FIRAuthStateDidChangeNotification", optional=true)
        public static native NSString AuthStateDidChange();
    }
    
    @Method(selector = "updateCurrentUser:completion:")
    public native void updateCurrentUser(FIRUser user, @Block VoidBlock1<NSError> completion);
    /**
     * @deprecated `fetchSignInMethods` is deprecated and will be removed in a future release. This method returns an empty list when Email Enumeration Protection is enabled.
     */
    @Deprecated
    @Method(selector = "fetchSignInMethodsForEmail:completion:")
    public native void fetchSignInMethods(String email, @Block VoidBlock2<NSArray<NSString>, NSError> completion);
    @Method(selector = "signInWithEmail:password:completion:")
    public native void signInUsingEmailPassword(String email, String password, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithEmail:link:completion:")
    public native void signInUsingEmailLink(String email, String link, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithProvider:UIDelegate:completion:")
    public native void signInUsingProvider(FIRFederatedAuthProvider provider, FIRAuthUIDelegate uiDelegate, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithCredential:completion:")
    public native void signInUsingCredential(FIRAuthCredential credential, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInAnonymouslyWithCompletion:")
    public native void signInAnonymously(@Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithCustomToken:completion:")
    public native void signInUsingCustomToken(String token, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "createUserWithEmail:password:completion:")
    public native void createUser(String email, String password, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "confirmPasswordResetWithCode:newPassword:completion:")
    public native void confirmPasswordReset(String code, String newPassword, @Block VoidBlock1<NSError> completion);
    @Method(selector = "checkActionCode:completion:")
    public native void checkActionCode(String code, @Block VoidBlock2<FIRActionCodeInfo, NSError> completion);
    @Method(selector = "verifyPasswordResetCode:completion:")
    public native void verifyPasswordResetCode(String code, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "applyActionCode:completion:")
    public native void applyActionCode(String code, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendPasswordResetWithEmail:completion:")
    public native void sendPasswordReset(String email, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendPasswordResetWithEmail:actionCodeSettings:completion:")
    public native void sendPasswordReset(String email, FIRActionCodeSettings actionCodeSettings, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendSignInLinkToEmail:actionCodeSettings:completion:")
    public native void sendSignInLink(String email, FIRActionCodeSettings actionCodeSettings, @Block VoidBlock1<NSError> completion);
    @Method(selector = "signOut:")
    public native boolean signOut(NSError.NSErrorPtr error);
    @Method(selector = "isSignInWithEmailLink:")
    public native boolean isSignInWithEmailLink(String link);
    @Method(selector = "initializeRecaptchaConfigWithCompletion:")
    public native void initializeRecaptchaConfig(@Block VoidBlock1<NSError> completion);
    @Method(selector = "addAuthStateDidChangeListener:")
    public native NSObject addAuthStateDidChangeListener(@Block VoidBlock2<FIRAuth, FIRUser> listener);
    @Method(selector = "removeAuthStateDidChangeListener:")
    public native void removeAuthStateDidChangeListener(NSObject listenerHandle);
    @Method(selector = "addIDTokenDidChangeListener:")
    public native NSObject addIDTokenDidChangeListener(@Block VoidBlock2<FIRAuth, FIRUser> listener);
    @Method(selector = "removeIDTokenDidChangeListener:")
    public native void removeIDTokenDidChangeListener(NSObject listenerHandle);
    @Method(selector = "useAppLanguage")
    public native void useAppLanguage();
    @Method(selector = "useEmulatorWithHost:port:")
    public native void useEmulator(String host, @MachineSizedSInt long port);
    @Method(selector = "revokeTokenWithAuthorizationCode:completion:")
    public native void revokeToken(String authorizationCode, @Block VoidBlock1<NSError> completion);
    @Method(selector = "useUserAccessGroup:error:")
    public native boolean useUserAccessGroup(String accessGroup, NSError.NSErrorPtr error);
    @Method(selector = "getStoredUserForAccessGroup:error:")
    public native FIRUser getStoredUser(String accessGroup, NSError.NSErrorPtr outError);
    @Method(selector = "setAPNSToken:type:")
    public native void setAPNSToken(NSData token, FIRAuthAPNSTokenType type);
    @Method(selector = "canHandleNotification:")
    public native boolean canHandleNotification(NSDictionary<?, ?> userInfo);
    @Method(selector = "canHandleURL:")
    public native boolean canHandleURL(NSURL url);
    @Method(selector = "auth")
    public static native FIRAuth auth();
    @Method(selector = "authWithApp:")
    public static native FIRAuth auth(org.robovm.pods.firebase.core.FIRApp app);
    @Method(selector = "scene:openURLContexts:")
    public native void openURLContexts(UIScene scene, NSSet<UIOpenURLContext> URLContexts);
    @Method(selector = "getTokenForcingRefresh:withCallback:")
    public native void getTokenForcingRefresh(boolean forceRefresh, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getUserID")
    public native String getUserID();
    @Method(selector = "application:didRegisterForRemoteNotificationsWithDeviceToken:")
    public native void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken);
    @Method(selector = "application:didFailToRegisterForRemoteNotificationsWithError:")
    public native void didFailToRegisterForRemoteNotifications(UIApplication application, NSError error);
    @Method(selector = "application:didReceiveRemoteNotification:fetchCompletionHandler:")
    public native void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    @Method(selector = "application:openURL:options:")
    public native boolean openURL(UIApplication application, NSURL url, UIApplicationOpenURLOptions options);
    @Method(selector = "scene:willConnectToSession:options:")
    public native void willConnect(UIScene scene, UISceneSession session, UISceneConnectionOptions connectionOptions);
    @Method(selector = "sceneDidDisconnect:")
    public native void sceneDidDisconnect(UIScene scene);
    @Method(selector = "sceneDidBecomeActive:")
    public native void sceneDidBecomeActive(UIScene scene);
    @Method(selector = "sceneWillResignActive:")
    public native void sceneWillResignActive(UIScene scene);
    @Method(selector = "sceneWillEnterForeground:")
    public native void sceneWillEnterForeground(UIScene scene);
    @Method(selector = "sceneDidEnterBackground:")
    public native void sceneDidEnterBackground(UIScene scene);
    @Method(selector = "stateRestorationActivityForScene:")
    public native NSUserActivity stateRestorationActivityForScene(UIScene scene);
    @Method(selector = "scene:restoreInteractionStateWithUserActivity:")
    public native void restoreInteractionState(UIScene scene, NSUserActivity stateRestorationActivity);
    @Method(selector = "scene:willContinueUserActivityWithType:")
    public native void willContinueUserActivity(UIScene scene, String userActivityType);
    @Method(selector = "scene:continueUserActivity:")
    public native void continueUserActivity(UIScene scene, NSUserActivity userActivity);
    @Method(selector = "scene:didFailToContinueUserActivityWithType:error:")
    public native void didFailToContinueUserActivity(UIScene scene, String userActivityType, NSError error);
    @Method(selector = "scene:didUpdateUserActivity:")
    public native void didUpdateUserActivity(UIScene scene, NSUserActivity userActivity);
    @Method(selector = "applicationDidFinishLaunching:")
    public native void didFinishLaunching(UIApplication application);
    @Method(selector = "application:willFinishLaunchingWithOptions:")
    public native boolean willFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions);
    @Method(selector = "application:didFinishLaunchingWithOptions:")
    public native boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and sceneDidBecomeActive(_:) from UISceneDelegate or the UIApplication.didBecomeActiveNotification instead.
     */
    @Deprecated
    @Method(selector = "applicationDidBecomeActive:")
    public native void didBecomeActive(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and sceneWillResignActive(_:) from UISceneDelegate or the UIApplication.willResignActiveNotification instead.
     */
    @Deprecated
    @Method(selector = "applicationWillResignActive:")
    public native void willResignActive(UIApplication application);
    @Method(selector = "applicationDidEnterBackground:")
    public native void didEnterBackground(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and sceneWillEnterForeground(_:) from UISceneDelegate or the UIApplication.willEnterForegroundNotification instead.
     */
    @Deprecated
    @Method(selector = "applicationWillEnterForeground:")
    public native void willEnterForeground(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @Method(selector = "application:handleOpenURL:")
    public native boolean handleOpenURL(UIApplication application, NSURL url);
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSPropertyList annotation);
    @Method(selector = "applicationDidReceiveMemoryWarning:")
    public native void didReceiveMemoryWarning(UIApplication application);
    @Method(selector = "applicationWillTerminate:")
    public native void willTerminate(UIApplication application);
    @Method(selector = "applicationSignificantTimeChange:")
    public native void significantTimeChange(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:willChangeStatusBarOrientation:duration:")
    public native void willChangeStatusBarOrientation(UIApplication application, UIInterfaceOrientation newStatusBarOrientation, double duration);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:didChangeStatusBarOrientation:")
    public native void didChangStatusBarOrientation(UIApplication application, UIInterfaceOrientation oldStatusBarOrientation);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:willChangeStatusBarFrame:")
    public native void willChangeStatusBarFrame(UIApplication application, org.robovm.apple.coregraphics.CGRect newStatusBarFrame);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:didChangeStatusBarFrame:")
    public native void didChangStatusBarFrame(UIApplication application, org.robovm.apple.coregraphics.CGRect oldStatusBarFrame);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:]
     */
    @Deprecated
    @Method(selector = "application:didRegisterUserNotificationSettings:")
    public native void didRegisterUserNotificationSettings(UIApplication application, UIUserNotificationSettings notificationSettings);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:] for user visible notifications and -[UIApplicationDelegate application:didReceiveRemoteNotification:fetchCompletionHandler:] for silent remote notifications
     */
    @Deprecated
    @Method(selector = "application:didReceiveRemoteNotification:")
    public native void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:didReceiveLocalNotification:")
    public native void didReceiveLocalNotification(UIApplication application, UILocalNotification notification);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    public native void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    public native void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    public native void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    public native void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler);
    /**
     * @deprecated Deprecated in iOS 13.0. Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @Method(selector = "application:performFetchWithCompletionHandler:")
    public native void performFetch(UIApplication application, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and windowScene(_:performActionFor:completionHandler:) from UIWindowSceneDelegate instead.
     */
    @Deprecated
    @Method(selector = "application:performActionForShortcutItem:completionHandler:")
    public native void performAction(UIApplication application, UIApplicationShortcutItem shortcutItem, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "application:handleEventsForBackgroundURLSession:completionHandler:")
    public native void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "application:handleWatchKitExtensionRequest:reply:")
    public native void handleWatchKitExtensionRequest(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<NSDictionary<?, ?>> reply);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applicationShouldRequestHealthAuthorization:")
    public native void shouldRequestHealthAuthorization(UIApplication application);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "application:handlerForIntent:")
    public native NSObject getHandlerForIntent(UIApplication application, org.robovm.apple.intents.INIntent intent);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use application:handlerForIntent: instead
     */
    @Deprecated
    @Method(selector = "application:handleIntent:completionHandler:")
    public native void handleIntent(UIApplication application, org.robovm.apple.intents.INIntent intent, @Block VoidBlock1<org.robovm.apple.intents.INIntentResponse> completionHandler);
    @Method(selector = "applicationProtectedDataWillBecomeUnavailable:")
    public native void protectedDataWillBecomeUnavailable(UIApplication application);
    @Method(selector = "applicationProtectedDataDidBecomeAvailable:")
    public native void protectedDataDidBecomeAvailable(UIApplication application);
    @Method(selector = "application:supportedInterfaceOrientationsForWindow:")
    public native UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIApplication application, UIWindow window);
    @Method(selector = "application:shouldAllowExtensionPointIdentifier:")
    public native boolean shouldAllowExtensionPointIdentifier(UIApplication application, UIApplicationExtensionPointIdentifier extensionPointIdentifier);
    @Method(selector = "application:viewControllerWithRestorationIdentifierPath:coder:")
    public native UIViewController getViewController(UIApplication application, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> identifierComponents, NSCoder coder);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "application:shouldSaveSecureApplicationState:")
    public native boolean shouldSaveSecureApplicationState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "application:shouldRestoreSecureApplicationState:")
    public native boolean shouldRestoreSecureApplicationState(UIApplication application, NSCoder coder);
    @Method(selector = "application:willEncodeRestorableStateWithCoder:")
    public native void willEncodeRestorableState(UIApplication application, NSCoder coder);
    @Method(selector = "application:didDecodeRestorableStateWithCoder:")
    public native void didDecodeRestorableState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldSaveSecureApplicationState: instead
     */
    @Deprecated
    @Method(selector = "application:shouldSaveApplicationState:")
    public native boolean shouldSaveApplicationState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldRestoreSecureApplicationState: instead
     */
    @Deprecated
    @Method(selector = "application:shouldRestoreApplicationState:")
    public native boolean shouldRestoreApplicationState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and scene(_:willContinueUserActivityWithType:) from UISceneDelegate instead.
     */
    @Deprecated
    @Method(selector = "application:willContinueUserActivityWithType:")
    public native boolean willContinueUserActivity(UIApplication application, String userActivityType);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and scene(_:continue:) from UISceneDelegate instead.
     */
    @Deprecated
    @Method(selector = "application:continueUserActivity:restorationHandler:")
    public native boolean continueUserActivity(UIApplication application, NSUserActivity userActivity, @Block VoidBlock1<NSArray<UIResponder>> restorationHandler);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and scene(_:didFailToContinueUserActivityWithType:error:) from UISceneDelegate instead.
     */
    @Deprecated
    @Method(selector = "application:didFailToContinueUserActivityWithType:error:")
    public native void didFailToContinueUserActivity(UIApplication application, String userActivityType, NSError error);
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and scene(_:didUpdate) from UISceneDelegate instead.
     */
    @Deprecated
    @Method(selector = "application:didUpdateUserActivity:")
    public native void didUpdateUserActivity(UIApplication application, NSUserActivity userActivity);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and windowScene(_:userDidAcceptCloudKitShareWith:) from UIWindowSceneDelegate instead.
     */
    @Deprecated
    @Method(selector = "application:userDidAcceptCloudKitShareWithMetadata:")
    public native void didAcceptCloudKitShare(UIApplication application, org.robovm.apple.cloudkit.CKShareMetadata cloudKitShareMetadata);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "application:configurationForConnectingSceneSession:options:")
    public native UISceneConfiguration getConfigurationForConnectingSceneSession(UIApplication application, UISceneSession connectingSceneSession, UISceneConnectionOptions options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "application:didDiscardSceneSessions:")
    public native void didDiscardSceneSessions(UIApplication application, NSSet<UISceneSession> sceneSessions);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "applicationShouldAutomaticallyLocalizeKeyCommands:")
    public native boolean applicationShouldAutomaticallyLocalizeKeyCommands(UIApplication application);
    /*</methods>*/
}
