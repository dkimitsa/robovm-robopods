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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdPtr extends Ptr<MAAd, MAAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAd() {}
    protected MAAd(Handle h, long handle) { super(h, handle); }
    protected MAAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "format")
    public native MAAdFormat getFormat();
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "adUnitIdentifier")
    public native String getAdUnitIdentifier();
    @Property(selector = "networkName")
    public native String getNetworkName();
    @Property(selector = "networkPlacement")
    public native String getNetworkPlacement();
    @Property(selector = "creativeIdentifier")
    public native String getCreativeIdentifier();
    @Property(selector = "revenue")
    public native double getRevenue();
    @Property(selector = "revenuePrecision")
    public native String getRevenuePrecision();
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "waterfall")
    public native MAAdWaterfallInfo getWaterfall();
    @Property(selector = "requestLatency")
    public native double getRequestLatency();
    @Property(selector = "nativeAd")
    public native MANativeAd getNativeAd();
    @Property(selector = "DSPName")
    public native String getDSPName();
    @Property(selector = "DSPIdentifier")
    public native String getDSPIdentifier();
    /**
     * @deprecated This API is deprecated because the ID may not immediately be available when the ad is displayed. Please use -[MAAdReviewDelegate didGenerateCreativeIdentifier:forAd:] instead.
     */
    @Deprecated
    @Property(selector = "adReviewCreativeIdentifier")
    public native String getAdReviewCreativeIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "adValueForKey:")
    public native String adValueForKey(String key);
    @Method(selector = "adValueForKey:defaultValue:")
    public native String getAdValue(String key, String defaultValue);
    /*</methods>*/
}
