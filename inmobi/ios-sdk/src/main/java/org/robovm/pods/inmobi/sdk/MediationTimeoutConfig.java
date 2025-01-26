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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.MediationTimeoutConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MediationTimeoutConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MediationTimeoutConfigPtr extends Ptr<MediationTimeoutConfig, MediationTimeoutConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MediationTimeoutConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MediationTimeoutConfig() {}
    protected MediationTimeoutConfig(Handle h, long handle) { super(h, handle); }
    protected MediationTimeoutConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "loadRetryInterval")
    public native AnyDictionary getLoadRetryInterval();
    @Property(selector = "setLoadRetryInterval:")
    public native void setLoadRetryInterval(AnyDictionary v);
    @Property(selector = "loadTimeout")
    public native AnyDictionary getLoadTimeout();
    @Property(selector = "setLoadTimeout:")
    public native void setLoadTimeout(AnyDictionary v);
    @Property(selector = "maxLoadRetries")
    public native AnyDictionary getMaxLoadRetries();
    @Property(selector = "setMaxLoadRetries:")
    public native void setMaxLoadRetries(AnyDictionary v);
    @Property(selector = "muttTimeout")
    public native AnyDictionary getMuttTimeout();
    @Property(selector = "setMuttTimeout:")
    public native void setMuttTimeout(AnyDictionary v);
    @Property(selector = "preloadTimeout")
    public native AnyDictionary getPreloadTimeout();
    @Property(selector = "setPreloadTimeout:")
    public native void setPreloadTimeout(AnyDictionary v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
