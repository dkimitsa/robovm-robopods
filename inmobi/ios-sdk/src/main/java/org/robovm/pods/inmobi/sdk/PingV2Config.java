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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.PingV2Config")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PingV2Config/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PingV2ConfigPtr extends Ptr<PingV2Config, PingV2ConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PingV2Config.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PingV2Config() {}
    protected PingV2Config(Handle h, long handle) { super(h, handle); }
    protected PingV2Config(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "maxEntries")
    public native @MachineSizedSInt long getMaxEntries();
    @Property(selector = "setMaxEntries:")
    public native void setMaxEntries(@MachineSizedSInt long v);
    @Property(selector = "maxBatchSize")
    public native PingV2SubConfig getMaxBatchSize();
    @Property(selector = "setMaxBatchSize:")
    public native void setMaxBatchSize(PingV2SubConfig v);
    @Property(selector = "expiry")
    public native PingV2SubConfig getExpiry();
    @Property(selector = "setExpiry:")
    public native void setExpiry(PingV2SubConfig v);
    @Property(selector = "retryConfig")
    public native PingV2RetryConfig getRetryConfig();
    @Property(selector = "setRetryConfig:")
    public native void setRetryConfig(PingV2RetryConfig v);
    @Property(selector = "interval")
    public native PingV2SubConfig getInterval();
    @Property(selector = "setInterval:")
    public native void setInterval(PingV2SubConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
