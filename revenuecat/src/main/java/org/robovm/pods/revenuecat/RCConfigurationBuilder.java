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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCConfigurationBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCConfigurationBuilderPtr extends Ptr<RCConfigurationBuilder, RCConfigurationBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCConfigurationBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCConfigurationBuilder() {}
    protected RCConfigurationBuilder(Handle h, long handle) { super(h, handle); }
    protected RCConfigurationBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAPIKey:")
    public RCConfigurationBuilder(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAPIKey:")
    protected native @Pointer long init(String apiKey);
    @Method(selector = "withApiKey:")
    public native RCConfigurationBuilder withApiKey(String apiKey);
    @Method(selector = "withAppUserID:")
    public native RCConfigurationBuilder withAppUserID(String appUserID);
    @Method(selector = "withPurchasesAreCompletedBy:storeKitVersion:")
    public native RCConfigurationBuilder with(RCPurchasesAreCompletedBy purchasesAreCompletedBy, RCStoreKitVersion storeKitVersion);
    @Method(selector = "withUserDefaults:")
    public native RCConfigurationBuilder withUserDefaults(NSUserDefaults userDefaults);
    @Method(selector = "withDangerousSettings:")
    public native RCConfigurationBuilder withDangerousSettings(RCDangerousSettings dangerousSettings);
    @Method(selector = "withNetworkTimeout:")
    public native RCConfigurationBuilder withNetworkTimeout(double networkTimeout);
    @Method(selector = "withStoreKit1Timeout:")
    public native RCConfigurationBuilder withStoreKit1Timeout(double storeKit1Timeout);
    @Method(selector = "withPlatformInfo:")
    public native RCConfigurationBuilder withPlatformInfo(RCPlatformInfo platformInfo);
    @Method(selector = "withShowStoreMessagesAutomatically:")
    public native RCConfigurationBuilder withShowStoreMessagesAutomatically(boolean showStoreMessagesAutomatically);
    @Method(selector = "withEntitlementVerificationMode:")
    public native RCConfigurationBuilder withEntitlementVerificationMode(RCEntitlementVerificationMode mode);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "withDiagnosticsEnabled:")
    public native RCConfigurationBuilder withDiagnosticsEnabled(boolean diagnosticsEnabled);
    @Method(selector = "withStoreKitVersion:")
    public native RCConfigurationBuilder withStoreKitVersion(RCStoreKitVersion version);
    @Method(selector = "withAutomaticDeviceIdentifierCollectionEnabled:")
    public native RCConfigurationBuilder withAutomaticDeviceIdentifierCollectionEnabled(boolean automaticDeviceIdentifierCollectionEnabled);
    @Method(selector = "build")
    public native RCConfiguration build();
    /**
     * @deprecated Use .with(storeKitVersion:) to enable StoreKit 2
     */
    @Deprecated
    @Method(selector = "withUsesStoreKit2IfAvailable:")
    public native RCConfigurationBuilder withUsesStoreKit2IfAvailable(boolean usesStoreKit2IfAvailable);
    @Method(selector = "withObserverMode:")
    public native RCConfigurationBuilder withObserverMode(boolean observerMode);
    /*</methods>*/
}
