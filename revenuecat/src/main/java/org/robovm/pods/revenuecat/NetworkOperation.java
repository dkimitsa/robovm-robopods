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
package org.robovm.pods.revenuecat;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("RevenueCat.NetworkOperation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NetworkOperation/*</name>*/ 
    extends /*<extends>*/NSOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NetworkOperationPtr extends Ptr<NetworkOperation, NetworkOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NetworkOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NetworkOperation() {}
    protected NetworkOperation(Handle h, long handle) { super(h, handle); }
    protected NetworkOperation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isExecuting")
    public native boolean isExecuting();
    @Property(selector = "isFinished")
    public native boolean isFinished();
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "isAsynchronous")
    public native boolean isAsynchronous();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "main")
    public native void main();
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
