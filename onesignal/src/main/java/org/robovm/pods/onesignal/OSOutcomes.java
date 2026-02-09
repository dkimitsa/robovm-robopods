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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSOutcomes/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSSession/*</implements>*/ {

    /*<ptr>*/public static class OSOutcomesPtr extends Ptr<OSOutcomes, OSOutcomesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSOutcomes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSOutcomes() {}
    protected OSOutcomes(Handle h, long handle) { super(h, handle); }
    protected OSOutcomes(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "Session")
    public static native Class<?> Session();
    @Method(selector = "sharedController")
    public static native OneSignalOutcomeEventsController sharedController();
    @Method(selector = "start")
    public static native void start();
    @Method(selector = "clearStatics")
    public static native void clearStatics();
    @Method(selector = "migrate")
    public static native void migrate();
    @Method(selector = "addOutcome:")
    public static native void addOutcome(String name);
    @Method(selector = "addUniqueOutcome:")
    public static native void addUniqueOutcome(String name);
    @Method(selector = "addOutcomeWithValue:value:")
    public static native void addOutcome(String name, NSNumber value);
    /*</methods>*/
}
