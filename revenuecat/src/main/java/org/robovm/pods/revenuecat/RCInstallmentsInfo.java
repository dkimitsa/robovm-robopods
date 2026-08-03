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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCInstallmentsInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCInstallmentsInfoPtr extends Ptr<RCInstallmentsInfo, RCInstallmentsInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCInstallmentsInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCInstallmentsInfo() {}
    protected RCInstallmentsInfo(Handle h, long handle) { super(h, handle); }
    protected RCInstallmentsInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCommitmentInstallmentsCount:commitmentInstallmentPeriod:installmentBillingPrice:installmentBillingDisplayPrice:commitmentTotalPeriod:commitmentTotalPrice:commitmentTotalDisplayPrice:billingPlanType:")
    public RCInstallmentsInfo(@MachineSizedSInt long commitmentInstallmentsCount, RCSubscriptionPeriod commitmentInstallmentPeriod, @ByVal NSDecimal installmentBillingPrice, String installmentBillingDisplayPrice, RCSubscriptionPeriod commitmentTotalPeriod, @ByVal NSDecimal commitmentTotalPrice, String commitmentTotalDisplayPrice, RCBillingPlanType billingPlanType) { super((SkipInit) null); initObject(init(commitmentInstallmentsCount, commitmentInstallmentPeriod, installmentBillingPrice, installmentBillingDisplayPrice, commitmentTotalPeriod, commitmentTotalPrice, commitmentTotalDisplayPrice, billingPlanType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "commitmentInstallmentsCount")
    public native @MachineSizedSInt long getCommitmentInstallmentsCount();
    @Property(selector = "commitmentInstallmentPeriod")
    public native RCSubscriptionPeriod getCommitmentInstallmentPeriod();
    @Property(selector = "installmentBillingPrice")
    public native @ByVal NSDecimal getInstallmentBillingPrice();
    @Property(selector = "installmentBillingDisplayPrice")
    public native String getInstallmentBillingDisplayPrice();
    @Property(selector = "commitmentTotalPeriod")
    public native RCSubscriptionPeriod getCommitmentTotalPeriod();
    @Property(selector = "commitmentTotalPrice")
    public native @ByVal NSDecimal getCommitmentTotalPrice();
    @Property(selector = "commitmentTotalDisplayPrice")
    public native String getCommitmentTotalDisplayPrice();
    @Property(selector = "billingPlanType")
    public native RCBillingPlanType getBillingPlanType();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCommitmentInstallmentsCount:commitmentInstallmentPeriod:installmentBillingPrice:installmentBillingDisplayPrice:commitmentTotalPeriod:commitmentTotalPrice:commitmentTotalDisplayPrice:billingPlanType:")
    protected native @Pointer long init(@MachineSizedSInt long commitmentInstallmentsCount, RCSubscriptionPeriod commitmentInstallmentPeriod, @ByVal NSDecimal installmentBillingPrice, String installmentBillingDisplayPrice, RCSubscriptionPeriod commitmentTotalPeriod, @ByVal NSDecimal commitmentTotalPrice, String commitmentTotalDisplayPrice, RCBillingPlanType billingPlanType);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
