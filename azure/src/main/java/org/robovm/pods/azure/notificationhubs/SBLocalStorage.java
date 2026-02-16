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
package org.robovm.pods.azure.notificationhubs;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SBLocalStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SBLocalStoragePtr extends Ptr<SBLocalStorage, SBLocalStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SBLocalStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SBLocalStorage() {}
    protected SBLocalStorage(Handle h, long handle) { super(h, handle); }
    protected SBLocalStorage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNotificationHubPath:")
    public SBLocalStorage(String notificationHubPath) { super((SkipInit) null); initObject(init(notificationHubPath)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "deviceToken")
    public native String getDeviceToken();
    @Property(selector = "setDeviceToken:")
    public native void setDeviceToken(String v);
    @Property(selector = "isRefreshNeeded")
    public native boolean isRefreshNeeded();
    @Property(selector = "setIsRefreshNeeded:")
    public native void setIsRefreshNeeded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNotificationHubPath:")
    protected native @Pointer long init(String notificationHubPath);
    @Method(selector = "refreshFinishedWithDeviceToken:")
    public native void refreshFinished(String newDeviceToken);
    @Method(selector = "getStoredRegistrationEntryWithRegistrationName:")
    public native StoredRegistrationEntry getStoredRegistrationEntry(String registrationName);
    @Method(selector = "updateWithRegistrationName:registration:")
    public native void update(String registrationName, SBRegistration registration);
    @Method(selector = "updateWithRegistrationName:registrationId:eTag:deviceToken:")
    public native void update(String registrationName, String registrationId, String eTag, String devToken);
    @Method(selector = "updateWithRegistration:")
    public native void update(SBRegistration registration);
    @Method(selector = "deleteWithRegistrationName:")
    public native void delete(String registrationName);
    @Method(selector = "deleteAllRegistrations")
    public native void deleteAllRegistrations();
    /*</methods>*/
}
