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
package org.robovm.pods.azure.notificationhubs;

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
import org.robovm.apple.usernotifications.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SBConnectionString/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SBConnectionStringPtr extends Ptr<SBConnectionString, SBConnectionStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SBConnectionString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SBConnectionString() {}
    protected SBConnectionString(Handle h, long handle) { super(h, handle); }
    protected SBConnectionString(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stringWithEndpoint:issuer:issuerSecret:")
    public static native String createByEndpointIssuerIssuerSecret(NSURL endpoint, String issuer, String secret);
    @Method(selector = "stringWithEndpoint:fullAccessSecret:")
    public static native String createByEndpointFullAccessSecret(NSURL endpoint, String fullAccessSecret);
    @Method(selector = "stringWithEndpoint:listenAccessSecret:")
    public static native String createByEndpointListenAccessSecret(NSURL endpoint, String listenAccessSecret);
    @Method(selector = "stringWithEndpoint:sharedAccessKeyName:accessSecret:")
    public static native String createByEndpointSharedAccessKeyNameAccessSecret(NSURL endpoint, String keyName, String secret);
    /*</methods>*/
}
