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
package org.robovm.pods.revenuecat;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCAdOpened/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCAdOpenedPtr extends Ptr<RCAdOpened, RCAdOpenedPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCAdOpened.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCAdOpened() {}
    protected RCAdOpened(Handle h, long handle) { super(h, handle); }
    protected RCAdOpened(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNetworkName:mediatorName:adFormat:placement:adUnitId:impressionId:")
    public RCAdOpened(String networkName, RCMediatorName mediatorName, RCAdFormat adFormat, String placement, String adUnitId, String impressionId) { super((SkipInit) null); initObject(init(networkName, mediatorName, adFormat, placement, adUnitId, impressionId)); }
    @Method(selector = "initWithNetworkName:mediatorName:adFormat:adUnitId:impressionId:")
    public RCAdOpened(String networkName, RCMediatorName mediatorName, RCAdFormat adFormat, String adUnitId, String impressionId) { super((SkipInit) null); initObject(init(networkName, mediatorName, adFormat, adUnitId, impressionId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "networkName")
    public native String getNetworkName();
    @Property(selector = "mediatorName")
    public native RCMediatorName getMediatorName();
    @Property(selector = "adFormat")
    public native RCAdFormat getAdFormat();
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "impressionId")
    public native String getImpressionId();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNetworkName:mediatorName:adFormat:placement:adUnitId:impressionId:")
    protected native @Pointer long init(String networkName, RCMediatorName mediatorName, RCAdFormat adFormat, String placement, String adUnitId, String impressionId);
    @Method(selector = "initWithNetworkName:mediatorName:adFormat:adUnitId:impressionId:")
    protected native @Pointer long init(String networkName, RCMediatorName mediatorName, RCAdFormat adFormat, String adUnitId, String impressionId);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
