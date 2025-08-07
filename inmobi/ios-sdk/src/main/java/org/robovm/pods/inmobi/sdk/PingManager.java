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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.PingManager")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PingManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PingManagerPtr extends Ptr<PingManager, PingManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PingManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PingManager() {}
    protected PingManager(Handle h, long handle) { super(h, handle); }
    protected PingManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isTelemetryEnabled")
    public native boolean isTelemetryEnabled();
    @Property(selector = "setIsTelemetryEnabled:")
    public native void setIsTelemetryEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "removeRenderViewForUuid:")
    public native void removeRenderViewForUuid(NSUUID uuid);
    @Method(selector = "processWithPings:source:")
    public native void process(NSArray<Ping> pings, PingSource source);
    @Method(selector = "processPendingWithOnlyHighPriority:")
    public native void processPending(boolean onlyHighPriority);
    @Method(selector = "shared")
    public static native PingManager shared();
    /*</methods>*/
}
