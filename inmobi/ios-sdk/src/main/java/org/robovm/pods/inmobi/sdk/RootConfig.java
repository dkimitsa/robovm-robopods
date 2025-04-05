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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.RootConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RootConfig/*</name>*/ 
    extends /*<extends>*/IMConfigBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RootConfigPtr extends Ptr<RootConfig, RootConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RootConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RootConfig() {}
    protected RootConfig(Handle h, long handle) { super(h, handle); }
    protected RootConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "includeIds")
    public native IMIncludeIds getIncludeIds();
    @Property(selector = "setIncludeIds:")
    public native void setIncludeIds(IMIncludeIds v);
    @Property(selector = "monetizationDisabled")
    public native boolean isMonetizationDisabled();
    @Property(selector = "setMonetizationDisabled:")
    public native void setMonetizationDisabled(boolean v);
    @Property(selector = "maxRetries")
    public native @MachineSizedSInt long getMaxRetries();
    @Property(selector = "setMaxRetries:")
    public native void setMaxRetries(@MachineSizedSInt long v);
    @Property(selector = "retryInterval")
    public native @MachineSizedSInt long getRetryInterval();
    @Property(selector = "setRetryInterval:")
    public native void setRetryInterval(@MachineSizedSInt long v);
    @Property(selector = "waitTime")
    public native @MachineSizedSInt long getWaitTime();
    @Property(selector = "setWaitTime:")
    public native void setWaitTime(@MachineSizedSInt long v);
    @Property(selector = "latestSdkInfo")
    public native IMLatestSdkInfo getLatestSdkInfo();
    @Property(selector = "setLatestSdkInfo:")
    public native void setLatestSdkInfo(IMLatestSdkInfo v);
    @Property(selector = "components")
    public native NSArray<IMComponent> getComponents();
    @Property(selector = "setComponents:")
    public native void setComponents(NSArray<IMComponent> v);
    @Property(selector = "gdpr")
    public native IMGDPR getGdpr();
    @Property(selector = "setGdpr:")
    public native void setGdpr(IMGDPR v);
    @Property(selector = "ipAddrTPSupport")
    public native NSArray<NSString> getIpAddrTPSupport();
    @Property(selector = "setIpAddrTPSupport:")
    public native void setIpAddrTPSupport(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getType")
    public native String getType();
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    @Method(selector = "urlForProductType:")
    public native String urlForProductType(String type);
    @Method(selector = "expiryForProductType:")
    public native long expiryForProductType(String type);
    /*</methods>*/
}
