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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SKProductsRequestDelegate/*</implements>*/ {

    /*<ptr>*/public static class BranchEventPtr extends Ptr<BranchEvent, BranchEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BranchEvent() {}
    protected BranchEvent(Handle h, long handle) { super(h, handle); }
    protected BranchEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public BranchEvent(String name) { super((SkipInit) null); initObject(init(name)); }
    public BranchEvent(String standardEvent, BranchUniversalObject contentItem) { super((Handle) null, create(standardEvent, contentItem)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alias")
    public native String getAlias();
    @Property(selector = "setAlias:")
    public native void setAlias(String v);
    @Property(selector = "transactionID")
    public native String getTransactionID();
    @Property(selector = "setTransactionID:")
    public native void setTransactionID(String v);
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "setCurrency:")
    public native void setCurrency(String v);
    @Property(selector = "revenue")
    public native NSDecimalNumber getRevenue();
    @Property(selector = "setRevenue:")
    public native void setRevenue(NSDecimalNumber v);
    @Property(selector = "shipping")
    public native NSDecimalNumber getShipping();
    @Property(selector = "setShipping:")
    public native void setShipping(NSDecimalNumber v);
    @Property(selector = "tax")
    public native NSDecimalNumber getTax();
    @Property(selector = "setTax:")
    public native void setTax(NSDecimalNumber v);
    @Property(selector = "coupon")
    public native String getCoupon();
    @Property(selector = "setCoupon:")
    public native void setCoupon(String v);
    @Property(selector = "affiliation")
    public native String getAffiliation();
    @Property(selector = "setAffiliation:")
    public native void setAffiliation(String v);
    @Property(selector = "eventDescription")
    public native String getEventDescription();
    @Property(selector = "setEventDescription:")
    public native void setEventDescription(String v);
    @Property(selector = "searchQuery")
    public native String getSearchQuery();
    @Property(selector = "setSearchQuery:")
    public native void setSearchQuery(String v);
    @Property(selector = "adType")
    public native BranchEventAdType getAdType();
    @Property(selector = "setAdType:")
    public native void setAdType(BranchEventAdType v);
    @Property(selector = "contentItems")
    public native NSArray<BranchUniversalObject> getContentItems();
    @Property(selector = "setContentItems:")
    public native void setContentItems(NSArray<BranchUniversalObject> v);
    @Property(selector = "customData")
    public native NSDictionary<NSString, NSString> getCustomData();
    @Property(selector = "setCustomData:")
    public native void setCustomData(NSDictionary<NSString, NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "logEventWithCompletion:")
    public native void logEvent(@Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "logEvent")
    public native void logEvent();
    @Method(selector = "dictionary")
    public native NSDictionary<?, ?> dictionary();
    @Method(selector = "description")
    public native String description();
    @Method(selector = "logEventWithTransaction:")
    public native void logEvent(SKPaymentTransaction transaction);
    @Method(selector = "standardEvent:")
    public static native BranchEvent standardEvent(String standardEvent);
    @Method(selector = "standardEvent:withContentItem:")
    protected static native @Pointer long create(String standardEvent, BranchUniversalObject contentItem);
    @Method(selector = "customEventWithName:")
    public static native BranchEvent createCustomEvent(String name);
    @Method(selector = "customEventWithName:contentItem:")
    public static native BranchEvent createCustomEvent(String name, BranchUniversalObject contentItem);
    @Method(selector = "productsRequest:didReceiveResponse:")
    public native void didReceiveResponse(SKProductsRequest request, SKProductsResponse response);
    @Method(selector = "requestDidFinish:")
    public native void didFinish(SKRequest request);
    @Method(selector = "request:didFailWithError:")
    public native void didFail(SKRequest request, NSError error);
    /*</methods>*/
}
