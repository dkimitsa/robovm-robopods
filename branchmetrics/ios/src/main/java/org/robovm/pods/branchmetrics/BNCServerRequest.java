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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCServerRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BNCServerRequestPtr extends Ptr<BNCServerRequest, BNCServerRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCServerRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCServerRequest() {}
    protected BNCServerRequest(Handle h, long handle) { super(h, handle); }
    protected BNCServerRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public BNCServerRequest(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "requestUUID")
    public native String getRequestUUID();
    @Property(selector = "setRequestUUID:")
    public native void setRequestUUID(String v);
    @Property(selector = "requestCreationTimeStamp")
    public native NSNumber getRequestCreationTimeStamp();
    @Property(selector = "setRequestCreationTimeStamp:")
    public native void setRequestCreationTimeStamp(NSNumber v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "makeRequest:key:callback:")
    public native void makeRequest(BNCServerInterface serverInterface, String key, @Block VoidBlock2<BNCServerResponse, NSError> callback);
    @Method(selector = "processResponse:error:")
    public native void processResponse(BNCServerResponse response, NSError error);
    @Method(selector = "safeSetValue:forKey:onDict:")
    public native void safeSetValue(NSObject value, String key, NSMutableDictionary<?, ?> dict);
    @Method(selector = "generateRequestUUIDFromDate:")
    public static native String generateRequestUUIDFromDate(NSDate localDate);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
