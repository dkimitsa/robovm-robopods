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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.NovatiqConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NovatiqConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NovatiqConfigPtr extends Ptr<NovatiqConfig, NovatiqConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NovatiqConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NovatiqConfig() {}
    protected NovatiqConfig(Handle h, long handle) { super(h, handle); }
    protected NovatiqConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "beaconUrl")
    public native String getBeaconUrl();
    @Property(selector = "setBeaconUrl:")
    public native void setBeaconUrl(String v);
    @Property(selector = "carrierNames")
    public native NSArray<NSString> getCarrierNames();
    @Property(selector = "setCarrierNames:")
    public native void setCarrierNames(NSArray<NSString> v);
    @Property(selector = "isNovatiqEnabled")
    public native boolean isNovatiqEnabled();
    @Property(selector = "setIsNovatiqEnabled:")
    public native void setIsNovatiqEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
