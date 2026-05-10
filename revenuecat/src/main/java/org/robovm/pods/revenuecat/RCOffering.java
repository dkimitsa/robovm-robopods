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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCOffering/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCOfferingPtr extends Ptr<RCOffering, RCOfferingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCOffering.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCOffering() {}
    protected RCOffering(Handle h, long handle) { super(h, handle); }
    protected RCOffering(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:serverDescription:metadata:availablePackages:webCheckoutUrl:")
    public RCOffering(String identifier, String serverDescription, NSDictionary<NSString, ?> metadata, NSArray<RCPackage> availablePackages, NSURL webCheckoutUrl) { super((SkipInit) null); initObject(init(identifier, serverDescription, metadata, availablePackages, webCheckoutUrl)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "serverDescription")
    public native String getServerDescription();
    @Property(selector = "metadata")
    public native NSDictionary<NSString, ?> getMetadata();
    @Property(selector = "availablePackages")
    public native NSArray<RCPackage> getAvailablePackages();
    @Property(selector = "lifetime")
    public native RCPackage getLifetime();
    @Property(selector = "annual")
    public native RCPackage getAnnual();
    @Property(selector = "sixMonth")
    public native RCPackage getSixMonth();
    @Property(selector = "threeMonth")
    public native RCPackage getThreeMonth();
    @Property(selector = "twoMonth")
    public native RCPackage getTwoMonth();
    @Property(selector = "monthly")
    public native RCPackage getMonthly();
    @Property(selector = "weekly")
    public native RCPackage getWeekly();
    @Property(selector = "webCheckoutUrl")
    public native NSURL getWebCheckoutUrl();
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "packageWithIdentifier:")
    public native RCPackage getPackage(String identifier);
    @Method(selector = "objectForKeyedSubscript:")
    public native RCPackage objectForKeyedSubscript(String key);
    @Method(selector = "initWithIdentifier:serverDescription:metadata:availablePackages:webCheckoutUrl:")
    protected native @Pointer long init(String identifier, String serverDescription, NSDictionary<NSString, ?> metadata, NSArray<RCPackage> availablePackages, NSURL webCheckoutUrl);
    /*</methods>*/
}
