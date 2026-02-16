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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAImpressionData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAInterfaceAllocBlocker/*</implements>*/ {

    /*<ptr>*/public static class IAImpressionDataPtr extends Ptr<IAImpressionData, IAImpressionDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAImpressionData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAImpressionData() {}
    protected IAImpressionData(Handle h, long handle) { super(h, handle); }
    protected IAImpressionData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "demandSourceName")
    public native String getDemandSourceName();
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "sessionID")
    public native String getSessionID();
    @Property(selector = "advertiserDomain")
    public native String getAdvertiserDomain();
    @Property(selector = "creativeID")
    public native String getCreativeID();
    @Property(selector = "campaignID")
    public native String getCampaignID();
    @Property(selector = "pricingValue")
    public native NSNumber getPricingValue();
    @Property(selector = "pricingCurrency")
    public native String getPricingCurrency();
    @Property(selector = "duration")
    public native NSNumber getDuration();
    @Property(selector = "isSkippable")
    public native boolean isSkippable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "customDescription")
    public native String customDescription();
    /*</methods>*/
}
