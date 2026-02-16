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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SBNotificationHub/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SBNotificationHubPtr extends Ptr<SBNotificationHub, SBNotificationHubPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SBNotificationHub.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SBNotificationHub() {}
    protected SBNotificationHub(Handle h, long handle) { super(h, handle); }
    protected SBNotificationHub(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConnectionString:notificationHubPath:")
    public SBNotificationHub(String connectionString, String notificationHubPath) { super((SkipInit) null); initObject(init(connectionString, notificationHubPath)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConnectionString:notificationHubPath:")
    protected native @Pointer long init(String connectionString, String notificationHubPath);
    @Method(selector = "registerNativeWithDeviceToken:tags:completion:")
    public native void registerNative(NSData deviceToken, NSSet<?> tags, @Block VoidBlock1<NSError> completion);
    @Method(selector = "registerTemplateWithDeviceToken:name:jsonBodyTemplate:expiryTemplate:tags:completion:")
    public native void registerTemplate(NSData deviceToken, String name, String bodyTemplate, String expiryTemplate, NSSet<?> tags, @Block VoidBlock1<NSError> completion);
    @Method(selector = "registerTemplateWithDeviceToken:name:jsonBodyTemplate:expiryTemplate:priorityTemplate:tags:completion:")
    public native void registerTemplate(NSData deviceToken, String name, String bodyTemplate, String expiryTemplate, String priorityTemplate, NSSet<?> tags, @Block VoidBlock1<NSError> completion);
    @Method(selector = "unregisterNativeWithCompletion:")
    public native void unregisterNative(@Block VoidBlock1<NSError> completion);
    @Method(selector = "unregisterTemplateWithName:completion:")
    public native void unregisterTemplate(String name, @Block VoidBlock1<NSError> completion);
    @Method(selector = "unregisterAllWithDeviceToken:completion:")
    public native void unregisterAll(NSData deviceToken, @Block VoidBlock1<NSError> completion);
    @Method(selector = "registerNativeWithDeviceToken:tags:error:")
    public native boolean registerNative(NSData deviceToken, NSSet<?> tags, NSError.NSErrorPtr error);
    @Method(selector = "registerTemplateWithDeviceToken:name:jsonBodyTemplate:expiryTemplate:tags:error:")
    public native boolean registerTemplate(NSData deviceToken, String templateName, String bodyTemplate, String expiryTemplate, NSSet<?> tags, NSError.NSErrorPtr error);
    @Method(selector = "registerTemplateWithDeviceToken:name:jsonBodyTemplate:expiryTemplate:priorityTemplate:tags:error:")
    public native boolean registerTemplate(NSData deviceToken, String templateName, String bodyTemplate, String expiryTemplate, String priorityTemplate, NSSet<?> tags, NSError.NSErrorPtr error);
    @Method(selector = "unregisterNativeWithError:")
    public native boolean unregisterNative(NSError.NSErrorPtr error);
    @Method(selector = "unregisterTemplateWithName:error:")
    public native boolean unregisterTemplate(String name, NSError.NSErrorPtr error);
    @Method(selector = "unregisterAllWithDeviceToken:error:")
    public native boolean unregisterAll(NSData deviceToken, NSError.NSErrorPtr error);
    /*</methods>*/
}
