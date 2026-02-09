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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TJNRequestSenderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TJNRequestSender/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("defaultPostCompletionBlock")
    public @Block VoidBlock4<NSData, NSURLResponse, NSError, Boolean> getDefaultPostCompletionBlock() { return null; }
    @NotImplemented("setDefaultPostCompletionBlock:")
    public void setDefaultPostCompletionBlock(@Block VoidBlock4<NSData, NSURLResponse, NSError, Boolean> v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("postWithUrl:body:headers:")
    public void post(String url, String body, NSDictionary<?, ?> headers) {}
    @NotImplemented("method:url:body:")
    public void method(String method, String url, NSMutableString body) {}
    @NotImplemented("method:url:body:headers:")
    public void method(String method, String url, String body, NSDictionary<?, ?> headers) {}
    @NotImplemented("method:url:body:headers:completionBlock:")
    public void method(String method, String url, String body, NSDictionary<?, ?> headers, @Block VoidBlock4<NSData, NSURLResponse, NSError, Boolean> block) {}
    /*</methods>*/
}
