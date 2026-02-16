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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.ImaiConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ImaiConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ImaiConfigPtr extends Ptr<ImaiConfig, ImaiConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ImaiConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ImaiConfig() {}
    protected ImaiConfig(Handle h, long handle) { super(h, handle); }
    protected ImaiConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pingTimeout")
    public native @MachineSizedSInt long getPingTimeout();
    @Property(selector = "setPingTimeout:")
    public native void setPingTimeout(@MachineSizedSInt long v);
    @Property(selector = "pingCacheExpiry")
    public native @MachineSizedSInt long getPingCacheExpiry();
    @Property(selector = "setPingCacheExpiry:")
    public native void setPingCacheExpiry(@MachineSizedSInt long v);
    @Property(selector = "maxDbEvents")
    public native @MachineSizedSInt long getMaxDbEvents();
    @Property(selector = "setMaxDbEvents:")
    public native void setMaxDbEvents(@MachineSizedSInt long v);
    @Property(selector = "maxEventBatch")
    public native @MachineSizedSInt long getMaxEventBatch();
    @Property(selector = "setMaxEventBatch:")
    public native void setMaxEventBatch(@MachineSizedSInt long v);
    @Property(selector = "pingInterval")
    public native @MachineSizedSInt long getPingInterval();
    @Property(selector = "setPingInterval:")
    public native void setPingInterval(@MachineSizedSInt long v);
    @Property(selector = "maxRetries")
    public native @MachineSizedSInt long getMaxRetries();
    @Property(selector = "setMaxRetries:")
    public native void setMaxRetries(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
