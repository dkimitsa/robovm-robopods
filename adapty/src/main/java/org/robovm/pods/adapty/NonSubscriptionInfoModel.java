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
package org.robovm.pods.adapty;

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
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty24NonSubscriptionInfoModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NonSubscriptionInfoModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NonSubscriptionInfoModelPtr extends Ptr<NonSubscriptionInfoModel, NonSubscriptionInfoModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NonSubscriptionInfoModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NonSubscriptionInfoModel() {}
    protected NonSubscriptionInfoModel(Handle h, long handle) { super(h, handle); }
    protected NonSubscriptionInfoModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "purchaseId")
    public native String getPurchaseId();
    @Property(selector = "setPurchaseId:")
    public native void setPurchaseId(String v);
    @Property(selector = "vendorProductId")
    public native String getVendorProductId();
    @Property(selector = "setVendorProductId:")
    public native void setVendorProductId(String v);
    @Property(selector = "store")
    public native String getStore();
    @Property(selector = "setStore:")
    public native void setStore(String v);
    @Property(selector = "purchasedAt")
    public native NSDate getPurchasedAt();
    @Property(selector = "setPurchasedAt:")
    public native void setPurchasedAt(NSDate v);
    @Property(selector = "isOneTime")
    public native boolean isOneTime();
    @Property(selector = "setIsOneTime:")
    public native void setIsOneTime(boolean v);
    @Property(selector = "isSandbox")
    public native boolean isSandbox();
    @Property(selector = "setIsSandbox:")
    public native void setIsSandbox(boolean v);
    @Property(selector = "vendorTransactionId")
    public native String getVendorTransactionId();
    @Property(selector = "setVendorTransactionId:")
    public native void setVendorTransactionId(String v);
    @Property(selector = "vendorOriginalTransactionId")
    public native String getVendorOriginalTransactionId();
    @Property(selector = "setVendorOriginalTransactionId:")
    public native void setVendorOriginalTransactionId(String v);
    @Property(selector = "isRefund")
    public native boolean isRefund();
    @Property(selector = "setIsRefund:")
    public native void setIsRefund(boolean v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
