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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCServerInterface/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCServerInterfacePtr extends Ptr<BNCServerInterface, BNCServerInterfacePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCServerInterface.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCServerInterface() {}
    protected BNCServerInterface(Handle h, long handle) { super(h, handle); }
    protected BNCServerInterface(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "preferenceHelper")
    public native BNCPreferenceHelper getPreferenceHelper();
    @Property(selector = "setPreferenceHelper:")
    public native void setPreferenceHelper(BNCPreferenceHelper v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getRequest:url:key:callback:")
    public native void getRequest(NSDictionary<?, ?> params, String url, String key, @Block VoidBlock2<BNCServerResponse, NSError> callback);
    @Method(selector = "postRequestSynchronous:url:key:")
    public native BNCServerResponse postRequestSynchronous(NSDictionary<?, ?> post, String url, String key);
    @Method(selector = "postRequest:url:key:callback:")
    public native void postRequest(NSDictionary<?, ?> post, String url, String key, @Block VoidBlock2<BNCServerResponse, NSError> callback);
    @Method(selector = "genericHTTPRequest:retryNumber:callback:retryHandler:")
    public native void genericHTTPRequest(NSURLRequest request, @MachineSizedSInt long retryNumber, @Block VoidBlock2<BNCServerResponse, NSError> callback, @Block("(@MachineSizedSInt)") Block1<Long, NSURLRequest> retryHandler);
    /*</methods>*/
}
