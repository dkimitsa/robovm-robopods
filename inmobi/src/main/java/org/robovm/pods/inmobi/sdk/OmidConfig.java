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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.OmidConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OmidConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OmidConfigPtr extends Ptr<OmidConfig, OmidConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OmidConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OmidConfig() {}
    protected OmidConfig(Handle h, long handle) { super(h, handle); }
    protected OmidConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxRetries")
    public native @MachineSizedSInt long getMaxRetries();
    @Property(selector = "setMaxRetries:")
    public native void setMaxRetries(@MachineSizedSInt long v);
    @Property(selector = "expiry")
    public native @MachineSizedSInt long getExpiry();
    @Property(selector = "setExpiry:")
    public native void setExpiry(@MachineSizedSInt long v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "webViewRetainTime")
    public native long getWebViewRetainTime();
    @Property(selector = "setWebViewRetainTime:")
    public native void setWebViewRetainTime(long v);
    @Property(selector = "retryInterval")
    public native @MachineSizedSInt long getRetryInterval();
    @Property(selector = "setRetryInterval:")
    public native void setRetryInterval(@MachineSizedSInt long v);
    @Property(selector = "omidEnabled")
    public native boolean isOmidEnabled();
    @Property(selector = "setOmidEnabled:")
    public native void setOmidEnabled(boolean v);
    @Property(selector = "partnerKey")
    public native String getPartnerKey();
    @Property(selector = "setPartnerKey:")
    public native void setPartnerKey(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
