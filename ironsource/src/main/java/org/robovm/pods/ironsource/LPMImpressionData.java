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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMImpressionData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMImpressionDataPtr extends Ptr<LPMImpressionData, LPMImpressionDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMImpressionData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LPMImpressionData() {}
    protected LPMImpressionData(Handle h, long handle) { super(h, handle); }
    protected LPMImpressionData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDictionary:")
    public LPMImpressionData(NSDictionary<?, ?> dictionary) { super((SkipInit) null); initObject(init(dictionary)); }
    @Method(selector = "initWithImpressionData:")
    public LPMImpressionData(LPMImpressionData impressionData) { super((SkipInit) null); initObject(init(impressionData)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "auctionId")
    public native String getAuctionId();
    @Property(selector = "mediationAdUnitName")
    public native String getMediationAdUnitName();
    @Property(selector = "mediationAdUnitId")
    public native String getMediationAdUnitId();
    @Property(selector = "adFormat")
    public native String getAdFormat();
    @Property(selector = "adNetwork")
    public native String getAdNetwork();
    @Property(selector = "instanceName")
    public native String getInstanceName();
    @Property(selector = "instanceId")
    public native String getInstanceId();
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "revenue")
    public native NSNumber getRevenue();
    @Property(selector = "precision")
    public native String getPrecision();
    @Property(selector = "ab")
    public native String getAb();
    @Property(selector = "segmentName")
    public native String getSegmentName();
    @Property(selector = "encryptedCpm")
    public native String getEncryptedCpm();
    @Property(selector = "conversionValue")
    public native NSNumber getConversionValue();
    @Property(selector = "creativeId")
    public native String getCreativeId();
    @Property(selector = "allData")
    public native NSDictionary<?, ?> getAllData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> dictionary);
    @Method(selector = "initWithImpressionData:")
    protected native @Pointer long init(LPMImpressionData impressionData);
    @Method(selector = "replacePlacementMacro:value:")
    public native void replacePlacementMacro(String macro, String value);
    /*</methods>*/
}
