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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMAdInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMAdInfoPtr extends Ptr<LPMAdInfo, LPMAdInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMAdInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LPMAdInfo() {}
    protected LPMAdInfo(Handle h, long handle) { super(h, handle); }
    protected LPMAdInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adId")
    public native String getAdId();
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "adUnitName")
    public native String getAdUnitName();
    @Property(selector = "placementName")
    public native String getPlacementName();
    @Property(selector = "adSize")
    public native LPMAdSize getAdSize();
    @Property(selector = "adFormat")
    public native String getAdFormat();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use auctionId parameter instead.
     */
    @Deprecated
    @Property(selector = "auction_id")
    public native String getAuction_id();
    @Property(selector = "auctionId")
    public native String getAuctionId();
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "ab")
    public native String getAb();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use segmentName parameter instead.
     */
    @Deprecated
    @Property(selector = "segment_name")
    public native String getSegment_name();
    @Property(selector = "segmentName")
    public native String getSegmentName();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use adNetwork parameter instead.
     */
    @Deprecated
    @Property(selector = "ad_network")
    public native String getAd_network();
    @Property(selector = "adNetwork")
    public native String getAdNetwork();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use instanceName parameter instead.
     */
    @Deprecated
    @Property(selector = "instance_name")
    public native String getInstance_name();
    @Property(selector = "instanceName")
    public native String getInstanceName();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use instanceId parameter instead.
     */
    @Deprecated
    @Property(selector = "instance_id")
    public native String getInstance_id();
    @Property(selector = "instanceId")
    public native String getInstanceId();
    @Property(selector = "revenue")
    public native NSNumber getRevenue();
    @Property(selector = "precision")
    public native String getPrecision();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use encryptedCPM parameter instead.
     */
    @Deprecated
    @Property(selector = "encrypted_cpm")
    public native String getEncrypted_cpm();
    @Property(selector = "encryptedCPM")
    public native String getEncryptedCPM();
    /**
     * @deprecated This parameter will be removed in version 9.0.0. Please use conversionValue parameter instead.
     */
    @Deprecated
    @Property(selector = "conversion_value")
    public native NSNumber getConversion_value();
    @Property(selector = "conversionValue")
    public native NSNumber getConversionValue();
    @Property(selector = "creativeId")
    public native String getCreativeId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
