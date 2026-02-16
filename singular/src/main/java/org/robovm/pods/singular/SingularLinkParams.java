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
package org.robovm.pods.singular;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SingularLinkParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SingularLinkParamsPtr extends Ptr<SingularLinkParams, SingularLinkParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SingularLinkParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SingularLinkParams() {}
    protected SingularLinkParams(Handle h, long handle) { super(h, handle); }
    protected SingularLinkParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDeeplink:passthrough:isDeferred:url:")
    public SingularLinkParams(String deeplink, String passthrough, boolean isDeferred, NSURL url) { super((SkipInit) null); initObject(init(deeplink, passthrough, isDeferred, url)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDeeplink:passthrough:isDeferred:url:")
    protected native @Pointer long init(String deeplink, String passthrough, boolean isDeferred, NSURL url);
    @Method(selector = "getDeepLink")
    public native String getDeepLink();
    @Method(selector = "getPassthrough")
    public native String getPassthrough();
    @Method(selector = "isDeferred")
    public native boolean isDeferred();
    @Method(selector = "getUrlParameters")
    public native NSDictionary<?, ?> getUrlParameters();
    /*</methods>*/
}
