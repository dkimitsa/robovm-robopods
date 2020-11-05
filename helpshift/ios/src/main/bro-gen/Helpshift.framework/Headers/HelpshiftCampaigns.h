/*
 *    HelpshiftCampaigns.h
 *    SDK Version 7.9.1-withCampaigns
 *
 *    Get the documentation at http://www.helpshift.com/docs
 *
 */

#import <Foundation/Foundation.h>
#import "HelpshiftCore.h"
#import "HelpshiftInbox.h"

@protocol HelpshiftCampaignsDelegate;

/**
 *  Campaigns API provider
 */
@interface HelpshiftCampaigns : NSObject <HsApiProvider> {
}

@property (nonatomic, weak) id<HelpshiftCampaignsDelegate> delegate;

/**
 *  Delegate for getting callbacks related to Campaigns inbox messages.
 */
@property (weak, nonatomic) id<HelpshiftInboxDelegate> inboxDelegate __deprecated_msg("This delegate is now deprecated. Please use HelpshiftInbox.delegate instead.");

/**
 *  Return the shared instance object of the HelpshiftCampaigns class
 *
 *  @return object of HelpshiftCampaigns class
 */
+ (HelpshiftCampaigns *) sharedInstance;

/**
 *  Add an integer property for current user
 *
 *  @param key   name of the key with which you want to associate data
 *  @param value integer value of the key
 *
 *  @return YES if property key is valid, NO otherwise
 */
+ (BOOL) addProperty:(NSString *)key withInteger:(NSInteger)value;

/**
 * Add an long long property for current user
 * @param key   name of the key with which you want to associate data
 * @param value long long value of the key
 *
 * @return YES if property key is valid, NO otherwise
 */
+ (BOOL) addProperty:(NSString *)key withLongLong:(long long)value;

/**
 *  Add a string property for current user
 *
 *  @param key   name of the key with which you want to associate data
 *  @param value string value of the key
 *
 *  @return YES if property key is valid, NO otherwise
 */
+ (BOOL) addProperty:(NSString *)key withString:(NSString *)value;

/**
 *  Add a boolean property for current user
 *
 *  @param key   name of the key with which you want to associate data
 *  @param value BOOL value of the key
 *
 *  @return YES if property key is valid, NO otherwise
 */
+ (BOOL) addProperty:(NSString *)key withBoolean:(BOOL)value;

/**
 *  Add a Date property for current user
 *
 *  @param key   name of the key with which you want to associate data
 *  @param value NSDate value of the key
 *
 *  @return YES if property key is valid, NO otherwise
 */
+ (BOOL) addProperty:(NSString *)key withDate:(NSDate *)value;

/**
 *  Add multiple properties at once for the current user
 *
 *  @param keyValues A dictionary of keys and values which represent properties to be added for the current user
 *
 *  @return Array of strings which represent valid keys.
 */
+ (NSArray *) addProperties:(NSDictionary *)keyValues;

/**
 *  Show the campaigns inbox UI screen
 *
 *  @param viewController    viewController on which the Inbox UI will be presented
 *  @param optionsDictionary config options which can customize and change the behaviour of the Helpshift SDK. Currently supported flags are :
 *  presentFullScreenOniPad : Show the Inbox UI in fullscreen mode on iPad.
 */
+ (void) showInboxOnViewController:(UIViewController *)viewController withOptions:(NSDictionary *)optionsDictionary;

/**
 *  Show the campaigns inbox UI screen
 *
 *  @param viewController    viewController on which the Inbox UI will be presented
 *  @param configObject      API  config object which can customize and change the behaviour of the Helpshift SDK. Currently supported flags are :
 *  presentFullScreenOniPad : Show the Inbox UI in fullscreen mode on iPad.
 */
+ (void) showInboxOnViewController:(UIViewController *)viewController withConfig:(HelpshiftAPIConfig *)configObject;

/**
 *  Show the campaign detail screen.
 *
 *  @param messageId        Campaign id which is received in the push packet
 *  @param viewController    viewController on which Detail UI will be shown
 *  @param optionsDictionary config options which can customize and change the behaviour of the Helpshift SDK. Currently supported flags are :
 *  presentFullScreenOniPad : Show the Inbox UI in fullscreen mode on iPad.
 */
+ (void) showMessageWithId:(NSString *)messageId onViewController:(UIViewController *)viewController withOptions:(NSDictionary *)optionsDictionary;

/**
 *  Show the campaign detail screen.
 *
 *  @param messageId        Campaign id which is received in the push packet
 *  @param viewController    viewController on which Detail UI will be shown
 *  @param configObject      API config object which can customize and change the behaviour of the Helpshift SDK. Currently supported flags are :
 *  presentFullScreenOniPad : Show the Inbox UI in fullscreen mode on iPad.
 */
+ (void) showMessageWithId:(NSString *)messageId onViewController:(UIViewController *)viewController withConfig:(HelpshiftAPIConfig *)configObject;

/**
 *  Refetch new campaigns and add them to the Inbox. This call will result in a network call being made. Applications should use this call sparingly and only when they absolutely need to.
 */
+ (void) refetchMessages;

/**
 *  Return the current count of unread campaign messages in the Inbox.
 *
 *  @return count of unread campaign messages.
 *  @deprecated Deprecated in SDK version 6.3.0
 */
+ (NSInteger) getCountOfUnreadMessages __deprecated_msg("Use requestUnreadMessagesCount instead.");

/** Get the count of unread campaign messages.
 *
 *
 * If you want to show your user notifications for unread campaigns, you can get the count of unread campaigns asynchronously by implementing the HelpshiftCampaignsDelegate in your respective .h and .m files.
 * Now you can call the method
 * @code
 * [HelpshiftCampaigns requestUnreadMessagesCount];
 * @endcode
 * This will return a notification count in the
 * - (void) didReceiveUnreadMessagesCount:(NSInteger)count
 * count delegate method.
 *
 * @available Available in SDK version 6.3.0 or later
 */

+ (void) requestUnreadMessagesCount;

+ (void) configureWithOptions:(NSDictionary *)configOptions;

@end

/**
 *  A delegate which defines the callbacks which are available in the SDK
 */
@protocol HelpshiftCampaignsDelegate <NSObject>

/** Delegate method call that should be implemented if you are calling requestUnreadMessagesCount:
 * @param count Returns the number of unread campaign messages
 *
 * Available in SDK version 6.3.0 or later
 */

- (void) didReceiveUnreadMessagesCount:(NSInteger)count;

/** Optional delegate method that is called when the Helpshift campaigns session begins.
 *
 *
 * Helpshift campaings session is any Helpshift campaings screen opened via showInbox:, showMessageWithId:onViewController:withConfig: or opening in-app campaigns through push notifications.
 * Whenever one of these APIs launches a view on screen, this method is invoked.
 *
 *  Available in SDK version 7.3.0 or later
 */
- (void) helpshiftCampaignsSessionHasBegun;

/** Optional delegate method that is called when the Helpshift campaigns session ends.
 *
 *
 * Helpshift campaings session is any Helpshift campaings screen opened via showInbox:, showMessageWithId:onViewController:withConfig: or opening in-app campaigns through push notifications.
 * This method is invoked whenever the user closes any campaings screen and returns back to the app .
 *
 *  Available in SDK version 7.3.0 or later
 */
- (void) helpshiftCampaignsSessionHasEnded;

@end
