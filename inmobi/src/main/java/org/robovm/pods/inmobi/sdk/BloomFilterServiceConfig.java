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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.BloomFilterServiceConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BloomFilterServiceConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BloomFilterServiceConfigPtr extends Ptr<BloomFilterServiceConfig, BloomFilterServiceConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BloomFilterServiceConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BloomFilterServiceConfig() {}
    protected BloomFilterServiceConfig(Handle h, long handle) { super(h, handle); }
    protected BloomFilterServiceConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxFetchPerDay")
    public native @MachineSizedSInt long getMaxFetchPerDay();
    @Property(selector = "setMaxFetchPerDay:")
    public native void setMaxFetchPerDay(@MachineSizedSInt long v);
    @Property(selector = "timeout")
    public native @MachineSizedSInt long getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(@MachineSizedSInt long v);
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "maxBloomFileSize")
    public native long getMaxBloomFileSize();
    @Property(selector = "setMaxBloomFileSize:")
    public native void setMaxBloomFileSize(long v);
    @Property(selector = "hashIdMaxAge")
    public native long getHashIdMaxAge();
    @Property(selector = "setHashIdMaxAge:")
    public native void setHashIdMaxAge(long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
