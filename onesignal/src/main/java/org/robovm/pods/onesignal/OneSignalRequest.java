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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalRequestPtr extends Ptr<OneSignalRequest, OneSignalRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalRequest() {}
    protected OneSignalRequest(Handle h, long handle) { super(h, handle); }
    protected OneSignalRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "disableLocalCaching")
    public native boolean isDisableLocalCaching();
    @Property(selector = "setDisableLocalCaching:")
    public native void setDisableLocalCaching(boolean v);
    @Property(selector = "method")
    public native HTTPMethod getMethod();
    @Property(selector = "setMethod:")
    public native void setMethod(HTTPMethod v);
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "setPath:")
    public native void setPath(String v);
    @Property(selector = "parameters")
    public native NSDictionary<?, ?> getParameters();
    @Property(selector = "setParameters:")
    public native void setParameters(NSDictionary<?, ?> v);
    @Property(selector = "additionalHeaders")
    public native NSDictionary<NSString, NSString> getAdditionalHeaders();
    @Property(selector = "setAdditionalHeaders:")
    public native void setAdditionalHeaders(NSDictionary<NSString, NSString> v);
    @Property(selector = "reattemptCount")
    public native int getReattemptCount();
    @Property(selector = "setReattemptCount:")
    public native void setReattemptCount(int v);
    @Property(selector = "dataRequest")
    public native boolean isDataRequest();
    @Property(selector = "setDataRequest:")
    public native void setDataRequest(boolean v);
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "missingAppId")
    public native boolean missingAppId();
    @Method(selector = "urlRequest")
    public native NSMutableURLRequest urlRequest();
    /*</methods>*/
}
