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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.RequestHelper")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RequestHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RequestHelperPtr extends Ptr<RequestHelper, RequestHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RequestHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RequestHelper() {}
    protected RequestHelper(Handle h, long handle) { super(h, handle); }
    protected RequestHelper(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithApiKey:")
    public RequestHelper(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithApiKey:")
    protected native @Pointer long init(String apiKey);
    @Method(selector = "handlePostRequestWithEndpoint:params:")
    public native void handlePostRequest(String endpoint, NSDictionary<NSString, ?> params);
    /*</methods>*/
}
