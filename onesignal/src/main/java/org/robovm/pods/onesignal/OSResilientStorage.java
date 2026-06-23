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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSResilientStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSResilientStoragePtr extends Ptr<OSResilientStorage, OSResilientStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSResilientStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSResilientStorage() {}
    protected OSResilientStorage(Handle h, long handle) { super(h, handle); }
    protected OSResilientStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "keyAppId")
    public static native String keyAppId();
    @Method(selector = "keySubscriptionId")
    public static native String keySubscriptionId();
    @Method(selector = "keyReceiveReceiptsEnabled")
    public static native String keyReceiveReceiptsEnabled();
    @Method(selector = "keyHasPriorSession")
    public static native String keyHasPriorSession();
    @Method(selector = "snapshot")
    public static native NSDictionary<NSString, NSString> snapshot();
    @Method(selector = "stringForKey:")
    public static native String stringForKey(String key);
    @Method(selector = "setString:forKey:")
    public static native void setString(String value, String key);
    @Method(selector = "setStrings:")
    public static native void setStrings(NSDictionary<NSString, NSString> values);
    /*</methods>*/
}
