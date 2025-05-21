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
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchEventRequest/*</name>*/ 
    extends /*<extends>*/BNCServerRequest/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BranchEventRequestPtr extends Ptr<BranchEventRequest, BranchEventRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchEventRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchEventRequest() {}
    protected BranchEventRequest(Handle h, long handle) { super(h, handle); }
    protected BranchEventRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServerURL:eventDictionary:completion:")
    public BranchEventRequest(NSURL serverURL, NSDictionary<?, ?> eventDictionary, @Block VoidBlock2<NSDictionary<?, ?>, NSError> completion) { super((SkipInit) null); initObject(init(serverURL, eventDictionary, completion)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "eventDictionary")
    public native NSDictionary<?, ?> getEventDictionary();
    @Property(selector = "setEventDictionary:")
    public native void setEventDictionary(NSDictionary<?, ?> v);
    @Property(selector = "serverURL")
    public native NSURL getServerURL();
    @Property(selector = "setServerURL:")
    public native void setServerURL(NSURL v);
    @Property(selector = "completion")
    public native @Block VoidBlock2<NSDictionary<?, ?>, NSError> getCompletion();
    @Property(selector = "setCompletion:")
    public native void setCompletion(@Block VoidBlock2<NSDictionary<?, ?>, NSError> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServerURL:eventDictionary:completion:")
    protected native @Pointer long init(NSURL serverURL, NSDictionary<?, ?> eventDictionary, @Block VoidBlock2<NSDictionary<?, ?>, NSError> completion);
    @Method(selector = "generateRequestUUIDFromDate:")
    public static native String generateRequestUUIDFromDate(NSDate localDate);
    /*</methods>*/
}
