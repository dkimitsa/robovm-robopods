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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty12PaywallModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PaywallModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PaywallModelPtr extends Ptr<PaywallModel, PaywallModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PaywallModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PaywallModel() {}
    protected PaywallModel(Handle h, long handle) { super(h, handle); }
    protected PaywallModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "developerId")
    public native String getDeveloperId();
    @Property(selector = "setDeveloperId:")
    public native void setDeveloperId(String v);
    @Property(selector = "variationId")
    public native String getVariationId();
    @Property(selector = "setVariationId:")
    public native void setVariationId(String v);
    @Property(selector = "revision")
    public native @MachineSizedSInt long getRevision();
    @Property(selector = "setRevision:")
    public native void setRevision(@MachineSizedSInt long v);
    @Property(selector = "isPromo")
    public native boolean isPromo();
    @Property(selector = "setIsPromo:")
    public native void setIsPromo(boolean v);
    @Property(selector = "products")
    public native NSArray<ProductModel> getProducts();
    @Property(selector = "setProducts:")
    public native void setProducts(NSArray<ProductModel> v);
    @Property(selector = "visualPaywall")
    public native String getVisualPaywall();
    @Property(selector = "setVisualPaywall:")
    public native void setVisualPaywall(String v);
    @Property(selector = "customPayloadString")
    public native String getCustomPayloadString();
    @Property(selector = "setCustomPayloadString:")
    public native void setCustomPayloadString(String v);
    @Property(selector = "customPayload")
    public native NSDictionary<NSString, ?> getCustomPayload();
    @Property(selector = "setCustomPayload:")
    public native void setCustomPayload(NSDictionary<NSString, ?> v);
    @Property(selector = "abTestName")
    public native String getAbTestName();
    @Property(selector = "setAbTestName:")
    public native void setAbTestName(String v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
