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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCPresentedOfferingContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCPresentedOfferingContextPtr extends Ptr<RCPresentedOfferingContext, RCPresentedOfferingContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCPresentedOfferingContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCPresentedOfferingContext() {}
    protected RCPresentedOfferingContext(Handle h, long handle) { super(h, handle); }
    protected RCPresentedOfferingContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOfferingIdentifier:placementIdentifier:targetingContext:")
    public RCPresentedOfferingContext(String offeringIdentifier, String placementIdentifier, RCTargetingContext targetingContext) { super((SkipInit) null); initObject(init(offeringIdentifier, placementIdentifier, targetingContext)); }
    @Method(selector = "initWithOfferingIdentifier:")
    public RCPresentedOfferingContext(String offeringIdentifier) { super((SkipInit) null); initObject(init(offeringIdentifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "offeringIdentifier")
    public native String getOfferingIdentifier();
    @Property(selector = "placementIdentifier")
    public native String getPlacementIdentifier();
    @Property(selector = "targetingContext")
    public native RCTargetingContext getTargetingContext();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOfferingIdentifier:placementIdentifier:targetingContext:")
    protected native @Pointer long init(String offeringIdentifier, String placementIdentifier, RCTargetingContext targetingContext);
    @Method(selector = "initWithOfferingIdentifier:")
    protected native @Pointer long init(String offeringIdentifier);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
