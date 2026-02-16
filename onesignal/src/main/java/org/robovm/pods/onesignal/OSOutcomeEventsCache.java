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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSOutcomeEventsCache/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSOutcomeEventsCachePtr extends Ptr<OSOutcomeEventsCache, OSOutcomeEventsCachePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSOutcomeEventsCache.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSOutcomeEventsCache() {}
    protected OSOutcomeEventsCache(Handle h, long handle) { super(h, handle); }
    protected OSOutcomeEventsCache(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isOutcomesV2ServiceEnabled")
    public native boolean isOutcomesV2ServiceEnabled();
    @Method(selector = "saveOutcomesV2ServiceEnabled:")
    public native void saveOutcomesV2ServiceEnabled(boolean isEnabled);
    @Method(selector = "getUnattributedUniqueOutcomeEventsSent")
    public native NSSet<?> getUnattributedUniqueOutcomeEventsSent();
    @Method(selector = "saveUnattributedUniqueOutcomeEventsSent:")
    public native void saveUnattributedUniqueOutcomeEventsSent(NSSet<?> unattributedUniqueOutcomeEventsSentSet);
    @Method(selector = "getAttributedUniqueOutcomeEventSent")
    public native NSArray<?> getAttributedUniqueOutcomeEventSent();
    @Method(selector = "saveAttributedUniqueOutcomeEventNotificationIds:")
    public native void saveAttributedUniqueOutcomeEventNotificationIds(NSArray<?> attributedUniqueOutcomeEventNotificationIdsSent);
    @Method(selector = "sharedOutcomeEventsCache")
    public static native OSOutcomeEventsCache sharedOutcomeEventsCache();
    /*</methods>*/
}
