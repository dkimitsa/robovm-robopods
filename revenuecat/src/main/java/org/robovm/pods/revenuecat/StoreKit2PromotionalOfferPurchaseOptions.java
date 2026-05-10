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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/StoreKit2PromotionalOfferPurchaseOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class StoreKit2PromotionalOfferPurchaseOptionsPtr extends Ptr<StoreKit2PromotionalOfferPurchaseOptions, StoreKit2PromotionalOfferPurchaseOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(StoreKit2PromotionalOfferPurchaseOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected StoreKit2PromotionalOfferPurchaseOptions() {}
    protected StoreKit2PromotionalOfferPurchaseOptions(Handle h, long handle) { super(h, handle); }
    protected StoreKit2PromotionalOfferPurchaseOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOfferID:compactJWS:")
    public StoreKit2PromotionalOfferPurchaseOptions(String offerID, String compactJWS) { super((SkipInit) null); initObject(init(offerID, compactJWS)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "offerID")
    public native String getOfferID();
    @Property(selector = "compactJWS")
    public native String getCompactJWS();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOfferID:compactJWS:")
    protected native @Pointer long init(String offerID, String compactJWS);
    /*</methods>*/
}
