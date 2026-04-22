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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJAppStoreSubscription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADJAppStoreSubscriptionPtr extends Ptr<ADJAppStoreSubscription, ADJAppStoreSubscriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJAppStoreSubscription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJAppStoreSubscription() {}
    protected ADJAppStoreSubscription(Handle h, long handle) { super(h, handle); }
    protected ADJAppStoreSubscription(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPrice:currency:transactionId:")
    public ADJAppStoreSubscription(NSDecimalNumber price, String currency, String transactionId) { super((SkipInit) null); initObject(init(price, currency, transactionId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "transactionId")
    public native String getTransactionId();
    @Property(selector = "transactionDate")
    public native NSDate getTransactionDate();
    @Property(selector = "setTransactionDate:")
    public native void setTransactionDate(NSDate v);
    @Property(selector = "salesRegion")
    public native String getSalesRegion();
    @Property(selector = "setSalesRegion:")
    public native void setSalesRegion(String v);
    @Property(selector = "callbackParameters")
    public native NSDictionary<?, ?> getCallbackParameters();
    @Property(selector = "partnerParameters")
    public native NSDictionary<?, ?> getPartnerParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPrice:currency:transactionId:")
    protected native @Pointer long init(NSDecimalNumber price, String currency, String transactionId);
    @Method(selector = "addCallbackParameter:value:")
    public native void addCallbackParameter(String key, String value);
    @Method(selector = "addPartnerParameter:value:")
    public native void addPartnerParameter(String key, String value);
    /*</methods>*/
}
