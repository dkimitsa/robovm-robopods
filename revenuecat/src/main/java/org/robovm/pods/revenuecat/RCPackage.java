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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCPackage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCPackagePtr extends Ptr<RCPackage, RCPackagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCPackage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCPackage() {}
    protected RCPackage(Handle h, long handle) { super(h, handle); }
    protected RCPackage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:packageType:storeProduct:offeringIdentifier:webCheckoutUrl:")
    public RCPackage(String identifier, RCPackageType packageType, RCStoreProduct storeProduct, String offeringIdentifier, NSURL webCheckoutUrl) { super((SkipInit) null); initObject(init(identifier, packageType, storeProduct, offeringIdentifier, webCheckoutUrl)); }
    @Method(selector = "initWithIdentifier:packageType:storeProduct:presentedOfferingContext:webCheckoutUrl:")
    public RCPackage(String identifier, RCPackageType packageType, RCStoreProduct storeProduct, RCPresentedOfferingContext presentedOfferingContext, NSURL webCheckoutUrl) { super((SkipInit) null); initObject(init(identifier, packageType, storeProduct, presentedOfferingContext, webCheckoutUrl)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "packageType")
    public native RCPackageType getPackageType();
    @Property(selector = "storeProduct")
    public native RCStoreProduct getStoreProduct();
    @Property(selector = "presentedOfferingContext")
    public native RCPresentedOfferingContext getPresentedOfferingContext();
    @Property(selector = "localizedPriceString")
    public native String getLocalizedPriceString();
    @Property(selector = "localizedIntroductoryPriceString")
    public native String getLocalizedIntroductoryPriceString();
    @Property(selector = "webCheckoutUrl")
    public native NSURL getWebCheckoutUrl();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "product")
    public native SKProduct getProduct();
    @Property(selector = "offeringIdentifier")
    public native String getOfferingIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:packageType:storeProduct:offeringIdentifier:webCheckoutUrl:")
    protected native @Pointer long init(String identifier, RCPackageType packageType, RCStoreProduct storeProduct, String offeringIdentifier, NSURL webCheckoutUrl);
    @Method(selector = "initWithIdentifier:packageType:storeProduct:presentedOfferingContext:webCheckoutUrl:")
    protected native @Pointer long init(String identifier, RCPackageType packageType, RCStoreProduct storeProduct, RCPresentedOfferingContext presentedOfferingContext, NSURL webCheckoutUrl);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "stringFrom:")
    public static native String stringFrom(RCPackageType packageType);
    @Method(selector = "packageTypeFrom:")
    public static native RCPackageType packageTypeFrom(String string);
    /*</methods>*/
}
