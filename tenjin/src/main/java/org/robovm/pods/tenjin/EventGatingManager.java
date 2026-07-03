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
package org.robovm.pods.tenjin;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.EventGatingManager")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EventGatingManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements EventGating/*</implements>*/ {

    /*<ptr>*/public static class EventGatingManagerPtr extends Ptr<EventGatingManager, EventGatingManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EventGatingManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected EventGatingManager() {}
    protected EventGatingManager(Handle h, long handle) { super(h, handle); }
    protected EventGatingManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "canSendEvents")
    public native boolean canSendEvents();
    @Property(selector = "connectInProgress")
    public native boolean isConnectInProgress();
    @Property(selector = "queuedEventCount")
    public native @MachineSizedSInt long getQueuedEventCount();
    @Property(selector = "connectInterval")
    public native double getConnectInterval();
    @Property(selector = "setConnectInterval:")
    public native void setConnectInterval(double v);
    @Property(selector = "maxQueueSize")
    public native @MachineSizedSInt long getMaxQueueSize();
    @Property(selector = "setMaxQueueSize:")
    public native void setMaxQueueSize(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "tryBeginConnectWithFlushHandler:")
    public native boolean tryBeginConnect(@Block VoidBlock1<NSDictionary<NSString, ?>> flushHandler);
    @Method(selector = "handleConnectCompletionWithSuccess:processHandler:")
    public native void handleConnectCompletion(boolean success, @Block VoidBlock1<NSDictionary<NSString, ?>> processHandler);
    @Method(selector = "queueEvent:sendHandler:")
    public native void sendHandler(NSDictionary<NSString, ?> eventData, @Block VoidBlock1<NSDictionary<NSString, ?>> sendHandler);
    @Method(selector = "ensureConnectedWithConnectHandler:")
    public native void ensureConnected(@Block Runnable connectHandler);
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "shared")
    public static native EventGatingManager shared();
    /*</methods>*/
}
