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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCServerRequestQueue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCServerRequestQueuePtr extends Ptr<BNCServerRequestQueue, BNCServerRequestQueuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCServerRequestQueue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCServerRequestQueue() {}
    protected BNCServerRequestQueue(Handle h, long handle) { super(h, handle); }
    protected BNCServerRequestQueue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enqueue:")
    public native void enqueue(BNCServerRequest request);
    @Method(selector = "dequeue")
    public native BNCServerRequest dequeue();
    @Method(selector = "peek")
    public native BNCServerRequest peek();
    @Method(selector = "peekAt:")
    public native BNCServerRequest peekAt(@MachineSizedUInt long index);
    @Method(selector = "insert:at:")
    public native void insert(BNCServerRequest request, @MachineSizedUInt long index);
    @Method(selector = "removeAt:")
    public native BNCServerRequest removeAt(@MachineSizedUInt long index);
    @Method(selector = "remove:")
    public native void remove(BNCServerRequest request);
    @Method(selector = "clearQueue")
    public native void clearQueue();
    @Method(selector = "queueDepth")
    public native @MachineSizedSInt long queueDepth();
    @Method(selector = "containsInstallOrOpen")
    public native boolean containsInstallOrOpen();
    @Method(selector = "findExistingInstallOrOpen")
    public native NSObject findExistingInstallOrOpen();
    @Method(selector = "getInstance")
    public static native NSObject getInstance();
    /*</methods>*/
}
