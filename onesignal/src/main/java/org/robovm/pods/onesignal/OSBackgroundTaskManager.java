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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("OneSignalOSCore.OSBackgroundTaskManager")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSBackgroundTaskManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSBackgroundTaskManagerPtr extends Ptr<OSBackgroundTaskManager, OSBackgroundTaskManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSBackgroundTaskManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSBackgroundTaskManager() {}
    protected OSBackgroundTaskManager(Handle h, long handle) { super(h, handle); }
    protected OSBackgroundTaskManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "taskHandler")
    public static native OSBackgroundTaskHandler taskHandler();
    @Method(selector = "setTaskHandler:")
    public static native void setTaskHandler(OSBackgroundTaskHandler value);
    @Method(selector = "beginBackgroundTask:")
    public static native void beginBackgroundTask(String taskIdentifier);
    @Method(selector = "endBackgroundTask:")
    public static native void endBackgroundTask(String taskIdentifier);
    @Method(selector = "setTaskInvalid:")
    public static native void setTaskInvalid(String taskIdentifier);
    /*</methods>*/
}
