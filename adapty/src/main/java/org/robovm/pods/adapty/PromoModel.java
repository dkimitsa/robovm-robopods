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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty10PromoModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PromoModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PromoModelPtr extends Ptr<PromoModel, PromoModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PromoModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PromoModel() {}
    protected PromoModel(Handle h, long handle) { super(h, handle); }
    protected PromoModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "promoType")
    public native String getPromoType();
    @Property(selector = "setPromoType:")
    public native void setPromoType(String v);
    @Property(selector = "variationId")
    public native String getVariationId();
    @Property(selector = "setVariationId:")
    public native void setVariationId(String v);
    @Property(selector = "expiresAt")
    public native NSDate getExpiresAt();
    @Property(selector = "setExpiresAt:")
    public native void setExpiresAt(NSDate v);
    @Property(selector = "paywall")
    public native PaywallModel getPaywall();
    @Property(selector = "setPaywall:")
    public native void setPaywall(PaywallModel v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
