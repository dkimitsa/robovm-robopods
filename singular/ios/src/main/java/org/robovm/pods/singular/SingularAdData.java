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
package org.robovm.pods.singular;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SingularAdData/*</name>*/ 
    extends /*<extends>*/NSMutableDictionary/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SingularAdDataPtr extends Ptr<SingularAdData, SingularAdDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SingularAdData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SingularAdData() {}
    protected SingularAdData(Handle h, long handle) { super(h, handle); }
    protected SingularAdData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdPlatform:withCurrency:withRevenue:")
    public SingularAdData(String adPlatform, String currency, NSNumber revenue) { super((SkipInit) null); initObject(init(adPlatform, currency, revenue)); }
    @Method(selector = "initWithCapacity:")
    public SingularAdData(@MachineSizedUInt long numItems) { super(numItems); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdPlatform:withCurrency:withRevenue:")
    protected native @Pointer long init(String adPlatform, String currency, NSNumber revenue);
    @Method(selector = "setNetworkName:")
    public native void setNetworkName(String networkName);
    @Method(selector = "setAdType:")
    public native void setAdType(String adType);
    @Method(selector = "setGroupType:")
    public native void setGroupType(String adGroupType);
    @Method(selector = "setImpressionId:")
    public native void setImpressionId(String impressionId);
    @Method(selector = "setAdPlacementName:")
    public native void setAdPlacementName(String adPlacementName);
    @Method(selector = "setAdUnitId:")
    public native void setAdUnitId(String adUnitId);
    @Method(selector = "setAdGroupId:")
    public native void setAdGroupId(String adGroupId);
    @Method(selector = "setAdGroupName:")
    public native void setAdGroupName(String adGroupName);
    @Method(selector = "setAdGroupPriority:")
    public native void setAdGroupPriority(String adGroupPriority);
    @Method(selector = "setPrecision:")
    public native void setPrecision(String precision);
    @Method(selector = "setPlacementId:")
    public native void setPlacementId(String placementId);
    @Method(selector = "setAdUnitName:")
    public native void setAdUnitName(String adUnitName);
    @Method(selector = "hasRequiredParams")
    public native boolean hasRequiredParams();
    /*</methods>*/
}
