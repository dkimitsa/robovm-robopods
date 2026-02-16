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
package org.robovm.pods.appsflyer;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AFAdRevenueData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AFAdRevenueDataPtr extends Ptr<AFAdRevenueData, AFAdRevenueDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AFAdRevenueData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AFAdRevenueData() {}
    protected AFAdRevenueData(Handle h, long handle) { super(h, handle); }
    protected AFAdRevenueData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMonetizationNetwork:mediationNetwork:currencyIso4217Code:eventRevenue:")
    public AFAdRevenueData(String monetizationNetwork, AppsFlyerAdRevenueMediationNetworkType mediationNetwork, String currencyIso4217Code, NSNumber eventRevenue) { super((SkipInit) null); initObject(init(monetizationNetwork, mediationNetwork, currencyIso4217Code, eventRevenue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "monetizationNetwork")
    public native String getMonetizationNetwork();
    @Property(selector = "setMonetizationNetwork:")
    public native void setMonetizationNetwork(String v);
    @Property(selector = "mediationNetwork")
    public native AppsFlyerAdRevenueMediationNetworkType getMediationNetwork();
    @Property(selector = "setMediationNetwork:")
    public native void setMediationNetwork(AppsFlyerAdRevenueMediationNetworkType v);
    @Property(selector = "currencyIso4217Code")
    public native String getCurrencyIso4217Code();
    @Property(selector = "setCurrencyIso4217Code:")
    public native void setCurrencyIso4217Code(String v);
    @Property(selector = "eventRevenue")
    public native NSNumber getEventRevenue();
    @Property(selector = "setEventRevenue:")
    public native void setEventRevenue(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMonetizationNetwork:mediationNetwork:currencyIso4217Code:eventRevenue:")
    protected native @Pointer long init(String monetizationNetwork, AppsFlyerAdRevenueMediationNetworkType mediationNetwork, String currencyIso4217Code, NSNumber eventRevenue);
    /*</methods>*/
}
