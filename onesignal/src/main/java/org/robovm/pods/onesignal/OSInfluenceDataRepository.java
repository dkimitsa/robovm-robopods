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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSInfluenceDataRepository/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSInfluenceDataRepositoryPtr extends Ptr<OSInfluenceDataRepository, OSInfluenceDataRepositoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSInfluenceDataRepository.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSInfluenceDataRepository() {}
    protected OSInfluenceDataRepository(Handle h, long handle) { super(h, handle); }
    protected OSInfluenceDataRepository(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cacheNotificationInfluenceType:")
    public native void cacheNotificationInfluenceType(OSInfluenceType influenceType);
    @Method(selector = "notificationCachedInfluenceType")
    public native OSInfluenceType notificationCachedInfluenceType();
    @Method(selector = "cacheIAMInfluenceType:")
    public native void cacheIAMInfluenceType(OSInfluenceType influenceType);
    @Method(selector = "iamCachedInfluenceType")
    public native OSInfluenceType iamCachedInfluenceType();
    @Method(selector = "cacheNotificationOpenId:")
    public native void cacheNotificationOpenId(String notificationId);
    @Method(selector = "cachedNotificationOpenId")
    public native String cachedNotificationOpenId();
    @Method(selector = "cacheIndirectNotifications:")
    public native void cacheIndirectNotifications(NSArray<?> notifications);
    @Method(selector = "cachedIndirectNotifications")
    public native NSArray<?> cachedIndirectNotifications();
    @Method(selector = "saveNotifications:")
    public native void saveNotifications(NSArray<?> notifications);
    @Method(selector = "lastNotificationsReceivedData")
    public native NSArray<?> lastNotificationsReceivedData();
    @Method(selector = "saveIAMs:")
    public native void saveIAMs(NSArray<?> iams);
    @Method(selector = "lastIAMsReceivedData")
    public native NSArray<?> lastIAMsReceivedData();
    @Method(selector = "notificationLimit")
    public native @MachineSizedSInt long notificationLimit();
    @Method(selector = "iamLimit")
    public native @MachineSizedSInt long iamLimit();
    @Method(selector = "notificationIndirectAttributionWindow")
    public native @MachineSizedSInt long notificationIndirectAttributionWindow();
    @Method(selector = "iamIndirectAttributionWindow")
    public native @MachineSizedSInt long iamIndirectAttributionWindow();
    @Method(selector = "isDirectInfluenceEnabled")
    public native boolean isDirectInfluenceEnabled();
    @Method(selector = "isIndirectInfluenceEnabled")
    public native boolean isIndirectInfluenceEnabled();
    @Method(selector = "isUnattributedInfluenceEnabled")
    public native boolean isUnattributedInfluenceEnabled();
    @Method(selector = "saveInfluenceParams:")
    public native void saveInfluenceParams(NSDictionary<?, ?> params);
    @Method(selector = "sharedInfluenceDataRepository")
    public static native OSInfluenceDataRepository sharedInfluenceDataRepository();
    /*</methods>*/
}
