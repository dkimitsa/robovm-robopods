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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.CrashConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CrashConfig/*</name>*/ 
    extends /*<extends>*/IMConfigBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CrashConfigPtr extends Ptr<CrashConfig, CrashConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CrashConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CrashConfig() {}
    protected CrashConfig(Handle h, long handle) { super(h, handle); }
    protected CrashConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "maxRetryCount")
    public native @MachineSizedSInt long getMaxRetryCount();
    @Property(selector = "setMaxRetryCount:")
    public native void setMaxRetryCount(@MachineSizedSInt long v);
    @Property(selector = "eventTTL")
    public native @MachineSizedSInt long getEventTTL();
    @Property(selector = "setEventTTL:")
    public native void setEventTTL(@MachineSizedSInt long v);
    @Property(selector = "maxEventsToPersist")
    public native @MachineSizedSInt long getMaxEventsToPersist();
    @Property(selector = "setMaxEventsToPersist:")
    public native void setMaxEventsToPersist(@MachineSizedSInt long v);
    @Property(selector = "networkType")
    public native CrashNetworkTypeConfig getNetworkType();
    @Property(selector = "setNetworkType:")
    public native void setNetworkType(CrashNetworkTypeConfig v);
    @Property(selector = "crashConfig")
    public native CrashReportingConfig getCrashConfig();
    @Property(selector = "setCrashConfig:")
    public native void setCrashConfig(CrashReportingConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getType")
    public native String getType();
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    /*</methods>*/
}
