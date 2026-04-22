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
package org.robovm.pods.adjustsdk;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJAdRevenue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADJAdRevenuePtr extends Ptr<ADJAdRevenue, ADJAdRevenuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJAdRevenue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJAdRevenue() {}
    protected ADJAdRevenue(Handle h, long handle) { super(h, handle); }
    protected ADJAdRevenue(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:")
    public ADJAdRevenue(String source) { super((SkipInit) null); initObject(init(source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "source")
    public native String getSource();
    @Property(selector = "revenue")
    public native NSNumber getRevenue();
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "adImpressionsCount")
    public native NSNumber getAdImpressionsCount();
    @Property(selector = "setAdImpressionsCount:")
    public native void setAdImpressionsCount(NSNumber v);
    @Property(selector = "adRevenueNetwork")
    public native String getAdRevenueNetwork();
    @Property(selector = "setAdRevenueNetwork:")
    public native void setAdRevenueNetwork(String v);
    @Property(selector = "adRevenueUnit")
    public native String getAdRevenueUnit();
    @Property(selector = "setAdRevenueUnit:")
    public native void setAdRevenueUnit(String v);
    @Property(selector = "adRevenuePlacement")
    public native String getAdRevenuePlacement();
    @Property(selector = "setAdRevenuePlacement:")
    public native void setAdRevenuePlacement(String v);
    @Property(selector = "partnerParameters")
    public native NSDictionary<?, ?> getPartnerParameters();
    @Property(selector = "callbackParameters")
    public native NSDictionary<?, ?> getCallbackParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:")
    protected native @Pointer long init(String source);
    @Method(selector = "setRevenue:currency:")
    public native void setRevenue(double amount, String currency);
    @Method(selector = "addCallbackParameter:value:")
    public native void addCallbackParameter(String key, String value);
    @Method(selector = "addPartnerParameter:value:")
    public native void addPartnerParameter(String key, String value);
    @Method(selector = "isValid")
    public native boolean isValid();
    /*</methods>*/
}
