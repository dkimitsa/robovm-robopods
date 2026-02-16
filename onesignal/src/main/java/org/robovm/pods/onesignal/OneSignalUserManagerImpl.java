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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("OneSignalUser.OneSignalUserManagerImpl")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalUserManagerImpl/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OneSignalNotificationsDelegate, OSUser/*</implements>*/ {

    /*<ptr>*/public static class OneSignalUserManagerImplPtr extends Ptr<OneSignalUserManagerImpl, OneSignalUserManagerImplPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalUserManagerImpl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected OneSignalUserManagerImpl() {}
    protected OneSignalUserManagerImpl(Handle h, long handle) { super(h, handle); }
    protected OneSignalUserManagerImpl(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pushSubscriptionId")
    public native String getPushSubscriptionId();
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "pushSubscriptionImpl")
    public native OSPushSubscriptionImpl getPushSubscriptionImpl();
    @Property(selector = "requiresUserAuth")
    public native boolean requiresUserAuth();
    @Property(selector = "setRequiresUserAuth:")
    public native void setRequiresUserAuth(boolean v);
    @Property(selector = "User")
    public native OSUser getUser();
    @Property(selector = "pushSubscription")
    public native OSPushSubscription getPushSubscription();
    @Property(selector = "externalId")
    public native String getExternalId();
    @Property(selector = "onesignalId")
    public native String getOnesignalId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "start")
    public native void start();
    @Method(selector = "loginWithExternalId:token:")
    public native void login(String externalId, String token);
    @Method(selector = "logout")
    public native void logout();
    @Method(selector = "clearAllModelsFromStores")
    public native void clearAllModelsFromStores();
    @Method(selector = "getTagsInternal")
    public native NSDictionary<NSString, NSString> getTagsInternal();
    @Method(selector = "setLocationWithLatitude:longitude:")
    public native void setLocation(float latitude, float longitude);
    @Method(selector = "sendPurchases:")
    public native void sendPurchases(NSArray<?> purchases);
    @Method(selector = "sharedInstance")
    public static native OneSignalUserManagerImpl sharedInstance();
    @Method(selector = "setNotificationTypes:")
    public native void setNotificationTypes(int notificationTypes);
    @Method(selector = "setPushToken:")
    public native void setPushToken(String pushToken);
    @Method(selector = "startNewSession")
    public native void startNewSession();
    @Method(selector = "sendSessionTime:")
    public native void sendSessionTime(NSNumber sessionTime);
    @Method(selector = "runBackgroundTasks")
    public native void runBackgroundTasks();
    @Method(selector = "onJwtExpiredWithExpiredHandler:")
    public native void onJwtExpired(@Block("(,@Block)") VoidBlock2<NSString, VoidBlock1<NSString>> expiredHandler);
    @Method(selector = "addObserver:")
    public native void addObserver(OSUserStateObserver observer);
    @Method(selector = "removeObserver:")
    public native void removeObserver(OSUserStateObserver observer);
    @Method(selector = "addAliasWithLabel:id:")
    public native void addAlias(String label, String id);
    @Method(selector = "addAliases:")
    public native void addAliases(NSDictionary<NSString, NSString> aliases);
    @Method(selector = "removeAlias:")
    public native void removeAlias(String label);
    @Method(selector = "removeAliases:")
    public native void removeAliases(NSArray<NSString> labels);
    @Method(selector = "addTagWithKey:value:")
    public native void addTag(String key, String value);
    @Method(selector = "addTags:")
    public native void addTags(NSDictionary<NSString, NSString> tags);
    @Method(selector = "removeTag:")
    public native void removeTag(String tag);
    @Method(selector = "removeTags:")
    public native void removeTags(NSArray<NSString> tags);
    @Method(selector = "getTags")
    public native NSDictionary<NSString, NSString> getTags();
    @Method(selector = "addEmail:")
    public native void addEmail(String email);
    @Method(selector = "removeEmail:")
    public native void removeEmail(String email);
    @Method(selector = "addSms:")
    public native void addSms(String number);
    @Method(selector = "removeSms:")
    public native void removeSms(String number);
    @Method(selector = "setLanguage:")
    public native void setLanguage(String language);
    /*</methods>*/
}
