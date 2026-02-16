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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalOutcomeEventsController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalOutcomeEventsControllerPtr extends Ptr<OneSignalOutcomeEventsController, OneSignalOutcomeEventsControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalOutcomeEventsController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalOutcomeEventsController() {}
    protected OneSignalOutcomeEventsController(Handle h, long handle) { super(h, handle); }
    protected OneSignalOutcomeEventsController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSessionManager:outcomeEventsFactory:")
    public OneSignalOutcomeEventsController(OSSessionManager sessionManager, OSOutcomeEventsFactory outcomeEventsFactory) { super((SkipInit) null); initObject(init(sessionManager, outcomeEventsFactory)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSessionManager:outcomeEventsFactory:")
    protected native @Pointer long init(OSSessionManager sessionManager, OSOutcomeEventsFactory outcomeEventsFactory);
    @Method(selector = "clearOutcomes")
    public native void clearOutcomes();
    @Method(selector = "cleanUniqueOutcomeNotifications")
    public native void cleanUniqueOutcomeNotifications();
    @Method(selector = "addOutcome:")
    public native void addOutcome(String name);
    @Method(selector = "addUniqueOutcome:")
    public native void addUniqueOutcome(String name);
    @Method(selector = "addOutcomeWithValue:value:")
    public native void addOutcome(String name, NSNumber value);
    @Method(selector = "sendClickActionOutcomes:appId:deviceType:")
    public native void sendClickActionOutcomes(NSArray<OSInAppMessageOutcome> outcomes, String appId, NSNumber deviceType);
    @Method(selector = "sendSessionEndOutcomes:appId:pushSubscriptionId:onesignalId:influenceParams:onSuccess:onFailure:")
    public native void sendSessionEndOutcomes(NSNumber timeElapsed, String appId, String pushSubscriptionId, String onesignalId, NSArray<OSFocusInfluenceParam> influenceParams, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    /*</methods>*/
}
