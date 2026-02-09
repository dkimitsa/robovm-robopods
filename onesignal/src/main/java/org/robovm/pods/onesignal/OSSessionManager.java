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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSSessionManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSSessionManagerPtr extends Ptr<OSSessionManager, OSSessionManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSSessionManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSSessionManager() {}
    protected OSSessionManager(Handle h, long handle) { super(h, handle); }
    protected OSSessionManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "init:withTrackerFactory:")
    public OSSessionManager(Class<?> delegate, OSTrackerFactory trackerFactory) { super((SkipInit) null); initObject(init(delegate, trackerFactory)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SessionStatusDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(SessionStatusDelegate v);
    @Property(selector = "appEntryState")
    public native AppEntryAction getAppEntryState();
    @Property(selector = "setAppEntryState:")
    public native void setAppEntryState(AppEntryAction v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getTimeFocusedElapsed")
    public native double getTimeFocusedElapsed();
    @Method(selector = "setLastOpenedTime:")
    public native void setLastOpenedTime(double lastOpened);
    @Method(selector = "init:withTrackerFactory:")
    protected native @Pointer long init(Class<?> delegate, OSTrackerFactory trackerFactory);
    @Method(selector = "getInfluences")
    public native NSArray<OSInfluence> getInfluences();
    @Method(selector = "getSessionInfluences")
    public native NSArray<OSInfluence> getSessionInfluences();
    @Method(selector = "initSessionFromCache")
    public native void initSessionFromCache();
    @Method(selector = "restartSessionIfNeeded")
    public native void restartSessionIfNeeded();
    @Method(selector = "onInAppMessageReceived:")
    public native void onInAppMessageReceived(String messageId);
    @Method(selector = "onDirectInfluenceFromIAMClick:")
    public native void onDirectInfluenceFromIAMClick(String directIAMId);
    @Method(selector = "onDirectInfluenceFromIAMClickFinished")
    public native void onDirectInfluenceFromIAMClickFinished();
    @Method(selector = "onNotificationReceived:")
    public native void onNotificationReceived(String notificationId);
    @Method(selector = "onDirectInfluenceFromNotificationOpen:withNotificationId:")
    public native void onDirectInfluenceFromNotificationOpen(AppEntryAction entryAction, String directNotificationId);
    @Method(selector = "attemptSessionUpgrade")
    public native void attemptSessionUpgrade();
    @Method(selector = "sessionLaunchTime")
    public native NSDate sessionLaunchTime();
    @Method(selector = "sharedSessionManager")
    public static native OSSessionManager sharedSessionManager();
    @Method(selector = "resetSharedSessionManager")
    public static native void resetSharedSessionManager();
    /*</methods>*/
}
