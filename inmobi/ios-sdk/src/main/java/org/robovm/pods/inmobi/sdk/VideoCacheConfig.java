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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.VideoCacheConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VideoCacheConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VideoCacheConfigPtr extends Ptr<VideoCacheConfig, VideoCacheConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VideoCacheConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VideoCacheConfig() {}
    protected VideoCacheConfig(Handle h, long handle) { super(h, handle); }
    protected VideoCacheConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setIsEnabled:")
    public native void setIsEnabled(boolean v);
    @Property(selector = "maxSize")
    public native @MachineSizedSInt long getMaxSize();
    @Property(selector = "setMaxSize:")
    public native void setMaxSize(@MachineSizedSInt long v);
    @Property(selector = "expiryInSec")
    public native double getExpiryInSec();
    @Property(selector = "setExpiryInSec:")
    public native void setExpiryInSec(double v);
    @Property(selector = "videoFormats")
    public native NSArray<NSString> getVideoFormats();
    @Property(selector = "setVideoFormats:")
    public native void setVideoFormats(NSArray<NSString> v);
    @Property(selector = "cacheableFormats")
    public native NSArray<NSString> getCacheableFormats();
    @Property(selector = "setCacheableFormats:")
    public native void setCacheableFormats(NSArray<NSString> v);
    @Property(selector = "lateMoovThreshold")
    public native @MachineSizedSInt long getLateMoovThreshold();
    @Property(selector = "setLateMoovThreshold:")
    public native void setLateMoovThreshold(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
