//
//  Helpshift.h
//  HelpshiftX
//
//  Copyright © 2019 Helpshift. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "HelpshiftDelegate.h"
#import "HelpshiftProactiveAPIConfigCollectorDelegate.h"
#import "HelpshiftUserLoginFailureReason.h"

NS_ASSUME_NONNULL_BEGIN

/// Key to be used for providing username in the [Helpshift loginUser:] method
FOUNDATION_EXPORT NSString *const HelpshiftUserName;

/// Key to be used for providing user identifier in the loginUser: method
FOUNDATION_EXPORT NSString *const HelpshiftUserIdentifier;

/// Key to be used for providing user email in the loginUser: method
FOUNDATION_EXPORT NSString *const HelpshiftUserEmail;

/// Key to be used for providing user's authentication token in the loginUser: method
FOUNDATION_EXPORT NSString *const HelpshiftUserAuthToken;

/// Callback invoked on login success when using `loginWithIdentity:` method is used.
typedef void (^HelpshiftLoginSuccessCallback)(void);
/// Callback invoked on login failure when using `loginWithIdentity:` method is used.
/// `reason` indicates the failure reason. It can be one of `HelpshiftUserLoginFailureReason.h` values.
/// `errors` is a optional dictionary containing extra details about the failure reason.
typedef void (^HelpshiftLoginFailureCallback)(NSString *reason,
                                              NSDictionary<NSString *, NSString *> * _Nullable errors);

/// Classes which provides access to all Helpshift APIs
@interface Helpshift : NSObject

/// The delegate to be set to in order to receive events from Helpshift
@property (nonatomic, weak) id<HelpshiftDelegate> delegate;

/// The delegate to be set to in order to receive events from HelpshiftProactiveAPIConfigCollector
@property (nonatomic, weak) id<HelpshiftProactiveAPIConfigCollectorDelegate> proactiveAPIConfigCollectorDelegate;

/** Returns an instance of Helpshift
 *
 * When using Helpshift, use below method to get the singleton instance of this class.
 * You can set the delegate using `Helpshift.sharedInstance.delegate = yourDelegate;`
 *
 */
+ (Helpshift *) sharedInstance;

/** Initialize helpshift support
 *
 * When initializing Helpshift you must pass these two tokens. You initialize Helpshift by adding the following lines in the implementation file for your AppDelegate,
 * ideally at the top of `application:didFinishLaunchingWithOptions`.
 * This method can throw the `InstallException` asynchronously if the install keys are not in the correct format.
 * @param platformId This is your platform id API Key
 * @param domain This is your domain name
 * @param config This is the config dictionary represents the configuration parameters for the installation
 */
+ (void) installWithPlatformId:(NSString *)platformId
                        domain:(NSString *)domain
                        config:(nullable NSDictionary *)config;

/**
 *  This method pauses/restarts the display in-app notification.
 *
 *  @param shouldPauseInAppNotification the boolean value to pause/restart inapp nofitications
 */
+ (void) pauseDisplayOfInAppNotification:(BOOL)shouldPauseInAppNotification;

/**
 * Logs in a given user. This method accepts an `NSDictionary` whose keys are one of
 *  - `HelpshiftUserName`
 *  - `HelpshiftUserIdentifier`
 *  - `HelpshiftUserEmail`
 *  - `HelpshiftUserAuthToken`
 * These are string constants defined in `Helpshift.h` file.
 *
 * @param userDetails The `NSDictionary` representing the user details
 * @return BOOL value indicating whether login was successful or not
 */
+ (BOOL) loginUser:(NSDictionary<NSString *, NSString *> *)userDetails;

/**
 * Logs in a given user. This method accepts JSON Web Token (JWT) string for user identities, and an additional
 * `NSDictionary` for login config. The result is communicated via success and failure callbacks. For details on how
 * to create the JWT to be passed to this method, please refer https://developers.helpshift.com/sdkx_ios/identity-users/
 *
 * @param identityJWT `NSString` JSON Web Token representing user identity to be logged in.
 *
 * @param loginConfig `NSDictionary` representing additional config to be passed.
 *
 * @param successCallback callback block that is executed when the loginWithIdentity is successful.
 *
 * @param failureCallback callback block that is executed when the loginWithIdentity fails.
 *      * `reason` indicates the failure reason. It can be one of `HelpshiftUserLoginFailureReason.h` values.
 *      * `errors` is a optional dictionary containing extra details about the failure reason. Can be nil.
 */
+ (void) loginWithIdentity:(NSString *)identityJWT
                    config:(NSDictionary<NSString *, id> *)loginConfig
                   success:(HelpshiftLoginSuccessCallback)successCallback
                   failure:(HelpshiftLoginFailureCallback)failureCallback;

/**
 * Adds identities for the current logged in user. This method accepts JSON Web Token (JWT) string for user identities.
 * For details on how to create the JWT to be passed to this method, please refer
 * https://developers.helpshift.com/sdkx_ios/identity-users/. Only applicable if the user has been logged in using the
 * `loginWithIdentity:config:success:failure` method.
 *
 * @param identitiesJWT `NSString` JSON Web Token representing user identities to be logged in.
 */
+ (void) addUserIdentities:(NSString *)identitiesJWT;

/**
 * Updates the master attributes for logged in user with the given dictionary of key-value pairs. Only applicable if the
 * user has been logged in using the `loginWithIdentity:config:success:failure` method.
 *
 * @param attributes Dictionary containing the master attributes.
 */
+ (void) updateMasterAttributes:(NSDictionary<NSString *, id> *)attributes;

/**
 * Updates the app attributes for logged in user with the given dictionary of key-value pairs. Only applicable if the
 * user has been logged in using the `loginWithIdentity:config:success:failure` method.
 *
 * @param attributes Dictionary containing the app attributes.
 */
+ (void) updateAppAttributes:(NSDictionary<NSString *, id> *)attributes;

/**
 * Logs out the previously logged in user
 */
+ (void) logout;

/**
 * Call this API if you need to clear the anonymous user data on login.
 * Equivalent to calling clearAnonymousUserOnLogin:(BOOL)shouldClear API with true value for shouldClear parameter.
 */
+ (void) clearAnonymousUserOnLogin __attribute__((deprecated("Use clearAnonymousUserOnLogin:(BOOL)shouldClear instead.")));

/**
 * Call this API if you need to start clearing/stop clearing the anonymous user data on login
 *
 * @param shouldClear If true, anonymous user data will be cleared on login. If false, it won't be cleared.
 */
+ (void) clearAnonymousUserOnLogin:(BOOL)shouldClear;

/**
 * Shows the helpshift support conversation screen.
 *
 * @param viewController The `UIViewController` on which the conversation screen is to be shown
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the conversation
 */
+ (void) showConversationWith:(UIViewController *)viewController config:(nullable NSDictionary *)config
__attribute__((deprecated("Use showConversationWithConfig:(NSDictionary *)config instead.")));

/**
 * Shows the helpshift support conversation screen.
 *
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the conversation
 */
+ (void) showConversationWithConfig:(nullable NSDictionary *)config;

/**
 * Show the helpshift help center screen.
 *
 * @param viewController The `UIViewController` on which the help center screen is to be shown
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the help center
 */
+ (void) showFAQsWith:(UIViewController *)viewController config:(nullable NSDictionary *)config
__attribute__((deprecated("Use showFAQsWithConfig:(NSDictionary *)config instead.")));

/**
 * Show the helpshift help center screen.
 *
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the help center
 */
+ (void) showFAQsWithConfig:(nullable NSDictionary *)config;

/**
 * Show the helpshift help center screen with FAQs from a particular section
 *
 * @param faqSectionPublishID Publish ID of FAQ section which is shown in the FAQ page on the admin side
 * (__yourcompanyname__.helpshift.com/admin/faq/).
 * @param viewController The `UIViewController` on which the help center screen is to be shown
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the help center
 */
+ (void) showFAQSection:(NSString *)faqSectionPublishID
                   with:(UIViewController *)viewController
                 config:(nullable NSDictionary *)config
__attribute__((deprecated("Use showFAQSection:(NSString *)sectionId withConfig:(NSDictionary *)config instead.")));

/**
 * Show the helpshift help center screen with FAQs from a particular section
 *
 * @param faqSectionPublishID Publish ID of FAQ section which is shown in the FAQ page on the admin side
 * (__yourcompanyname__.helpshift.com/admin/faq/).
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the help center
 */
+ (void) showFAQSection:(NSString *)faqSectionPublishID withConfig:(nullable NSDictionary *)config;

/**
 * Show the helpshift help center screen with a single FAQ
 *
 * @param faqPublishID Publish ID of FAQ which is shown when you expand a single FAQ on admin side
 * (__yourcompanyname__.helpshift.com/admin/faq/)
 * @param viewController The `UIViewController` on which the help center screen is to be shown
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the help center
 */
+ (void) showSingleFAQ:(NSString *)faqPublishID
                  with:(UIViewController *)viewController
                config:(nullable NSDictionary *)config
__attribute__((deprecated("Use showSingleFAQ:(NSString *)faqId withConfig:(NSDictionary *)config instead.")));

/**
 * Show the helpshift help center screen with a single FAQ
 *
 * @param faqPublishID Publish ID of FAQ which is shown when you expand a single FAQ on admin side
 * (__yourcompanyname__.helpshift.com/admin/faq/)
 * @param config An `NSDictionary` which represents the configuration that needs to be set to the help center
 */
+ (void) showSingleFAQ:(NSString *)faqPublishID withConfig:(nullable NSDictionary *)config;

/** Change the SDK language. By default, the device's prefered language is used.
 * The call will fail in the following cases :
 * 1. If a Helpshift session is already active at the time of invocation
 * 2. Language code is incorrect
 * @param languageCode the string representing the language code. For example, use 'fr' for French.  Passing `nil` will unset any language set by previous invocation of this API.
 */
+ (void) setLanguage:(nullable NSString *)languageCode;

/** Register the deviceToken to enable push notifications
 * To enable push notifications in the Helpshift iOS SDK, set the Push Notifications’ deviceToken using this method inside your `application:didRegisterForRemoteNotificationsWithDeviceToken` in the AppDelegate.
 *  @param deviceToken The deviceToken received from the push notification servers.
 */
+ (void) registerDeviceToken:(NSData *)deviceToken;

/**
 *  Pass along the userInfo dictionary (received with a `UNNotification`) for the Helpshift SDK to handle
 *  @param userInfo   dictionary contained in the `UNNotification` object received in AppDelegate.
 *  @param viewController The `UIViewController` on which you want the Helpshift SDK stack to be shown
 *  @param isAppLaunch    A `BOOL` indicating whether the app was lanuched from a killed state. This parameter should ideally only be true in case when called from app's didFinishLaunchingWithOptions AppDelegate.
 *  @return BOOL value indicating whether Helpshift SDK handled this notification.
 */
+ (BOOL) handleNotificationWithUserInfoDictionary:(NSDictionary *)userInfo
                                      isAppLaunch:(BOOL)isAppLaunch
                                   withController:(UIViewController *)viewController
__attribute__((deprecated("Use handleNotificationWithUserInfoDictionary:(NSDictionary *)userInfo isAppLaunch:(BOOL)isAppLaunch instead.")));

/**
 *  Pass along the userInfo dictionary (received with a `UNNotification`) for the Helpshift SDK to handle
 *  @param userInfo   dictionary contained in the `UNNotification` object received in AppDelegate.
 *  @param isAppLaunch    A `BOOL` indicating whether the app was lanuched from a killed state. This parameter should ideally only be true in case when called from app's didFinishLaunchingWithOptions AppDelegate.
 *  @return BOOL value indicating whether Helpshift SDK handled this notification.
 */
+ (BOOL) handleNotificationWithUserInfoDictionary:(NSDictionary *)userInfo isAppLaunch:(BOOL)isAppLaunch;

/**
 * Add function to handle proactive link handling.
 *
 * @param proactiveLink This data will be decided by the customer and we will expect them to include the "helpshift_proactive_link" keyvalue and pass to stringUrl parameter.
 */

+ (void) handleProactiveLink:(NSString *) proactiveLink;

/**
 * Fetches the unread messages count from local or remote based on `shouldFetchFromServer` flag.
 * Invokes the `[HelpshiftDelegate handleHelpshiftEvent:withData:]` with appropriate data as response.
 *
 * @param shouldFetchFromServer Should fetch unread message count from server.
 */
+ (void) requestUnreadMessageCount:(BOOL)shouldFetchFromServer;

/**
 * Add additional debugging information regarding user actions.
 * Breadcrumbs can be used to add debugging statements that will be passed along with every new conversation.
 *
 * @param leaveBreadcrumb The string containing any relevant debugging information.
 */
+ (void) leaveBreadcrumb:(NSString *)leaveBreadcrumb;

/**
 * Clears Breadcrumbs list.
 * Breadcrumbs list stores upto 100 latest actions. You'll receive those in every issue.
 * This method can be used to clear previously stored breadcrumbs.
 */
+ (void) clearBreadcrumbs;

/**
 *  You may wish to send additional debug logs when an issue is filed. This is a wrapper over NSLog.
 *  Use this API as a replacement over NSLog for the logs that need to be attached to an issue filed by a user.
 *
 * @param message The string to be logged.
 */
+ (void) addLog:(NSString *)message;

/**
 * Adds an entry  to user trail. The full user trail is synced with Helpshift dashboard whenever a Helpshift SDK screen is presented.
 *
 * @param userTrail The user trail to add.
 */
+ (void) addUserTrail:(NSString *)userTrail;

/**
* Returns the SDK version as a string.
* Ex. 10.2.2
* @return SDK version
*/
+ (NSString *) sdkVersion;

/**
 *This API can be used to close an active Helpshift session and return to the app.
 *Any open Helpshift screen will be dismissed and control will return to the original screen that launched the Helpshift screen.
 */
+ (void) closeSession;

@end

NS_ASSUME_NONNULL_END
