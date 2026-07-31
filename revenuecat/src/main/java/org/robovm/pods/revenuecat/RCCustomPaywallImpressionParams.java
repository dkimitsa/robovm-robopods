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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCCustomPaywallImpressionParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCCustomPaywallImpressionParamsPtr extends Ptr<RCCustomPaywallImpressionParams, RCCustomPaywallImpressionParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCCustomPaywallImpressionParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCCustomPaywallImpressionParams() {}
    protected RCCustomPaywallImpressionParams(Handle h, long handle) { super(h, handle); }
    protected RCCustomPaywallImpressionParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPaywallId:")
    public RCCustomPaywallImpressionParams(String paywallId) { super((SkipInit) null); initObject(init(paywallId)); }
    /**
     * @deprecated Pass an Offering object instead. Using an offering identifier string prevents the SDK from deriving placement and targeting context automatically.. Use initWithPaywallId:offering:
     */
    @Deprecated
    @Method(selector = "initWithPaywallId:offeringId:")
    public RCCustomPaywallImpressionParams(String paywallId, String offeringId) { super((SkipInit) null); initObject(init(paywallId, offeringId)); }
    @Method(selector = "initWithPaywallId:offering:")
    public RCCustomPaywallImpressionParams(String paywallId, RCOffering offering) { super((SkipInit) null); initObject(init(paywallId, offering)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "paywallId")
    public native String getPaywallId();
    @Property(selector = "offeringId")
    public native String getOfferingId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPaywallId:")
    protected native @Pointer long init(String paywallId);
    /**
     * @deprecated Pass an Offering object instead. Using an offering identifier string prevents the SDK from deriving placement and targeting context automatically.. Use initWithPaywallId:offering:
     */
    @Deprecated
    @Method(selector = "initWithPaywallId:offeringId:")
    protected native @Pointer long init(String paywallId, String offeringId);
    @Method(selector = "initWithPaywallId:offering:")
    protected native @Pointer long init(String paywallId, RCOffering offering);
    /*</methods>*/
}
