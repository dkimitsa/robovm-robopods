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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchContentMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchContentMetadataPtr extends Ptr<BranchContentMetadata, BranchContentMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchContentMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchContentMetadata() {}
    protected BranchContentMetadata(Handle h, long handle) { super(h, handle); }
    protected BranchContentMetadata(SkipInit skipInit) { super(skipInit); }
    public BranchContentMetadata(NSDictionary<?, ?> dictionary) { super((Handle) null, create(dictionary)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentSchema")
    public native String getContentSchema();
    @Property(selector = "setContentSchema:")
    public native void setContentSchema(String v);
    @Property(selector = "quantity")
    public native double getQuantity();
    @Property(selector = "setQuantity:")
    public native void setQuantity(double v);
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(NSDecimalNumber v);
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "setCurrency:")
    public native void setCurrency(String v);
    @Property(selector = "sku")
    public native String getSku();
    @Property(selector = "setSku:")
    public native void setSku(String v);
    @Property(selector = "productName")
    public native String getProductName();
    @Property(selector = "setProductName:")
    public native void setProductName(String v);
    @Property(selector = "productBrand")
    public native String getProductBrand();
    @Property(selector = "setProductBrand:")
    public native void setProductBrand(String v);
    @Property(selector = "productCategory")
    public native String getProductCategory();
    @Property(selector = "setProductCategory:")
    public native void setProductCategory(String v);
    @Property(selector = "productVariant")
    public native String getProductVariant();
    @Property(selector = "setProductVariant:")
    public native void setProductVariant(String v);
    @Property(selector = "condition")
    public native String getCondition();
    @Property(selector = "setCondition:")
    public native void setCondition(String v);
    @Property(selector = "ratingAverage")
    public native double getRatingAverage();
    @Property(selector = "setRatingAverage:")
    public native void setRatingAverage(double v);
    @Property(selector = "ratingCount")
    public native @MachineSizedSInt long getRatingCount();
    @Property(selector = "setRatingCount:")
    public native void setRatingCount(@MachineSizedSInt long v);
    @Property(selector = "ratingMax")
    public native double getRatingMax();
    @Property(selector = "setRatingMax:")
    public native void setRatingMax(double v);
    @Property(selector = "rating")
    public native double getRating();
    @Property(selector = "setRating:")
    public native void setRating(double v);
    @Property(selector = "addressStreet")
    public native String getAddressStreet();
    @Property(selector = "setAddressStreet:")
    public native void setAddressStreet(String v);
    @Property(selector = "addressCity")
    public native String getAddressCity();
    @Property(selector = "setAddressCity:")
    public native void setAddressCity(String v);
    @Property(selector = "addressRegion")
    public native String getAddressRegion();
    @Property(selector = "setAddressRegion:")
    public native void setAddressRegion(String v);
    @Property(selector = "addressCountry")
    public native String getAddressCountry();
    @Property(selector = "setAddressCountry:")
    public native void setAddressCountry(String v);
    @Property(selector = "addressPostalCode")
    public native String getAddressPostalCode();
    @Property(selector = "setAddressPostalCode:")
    public native void setAddressPostalCode(String v);
    @Property(selector = "latitude")
    public native double getLatitude();
    @Property(selector = "setLatitude:")
    public native void setLatitude(double v);
    @Property(selector = "longitude")
    public native double getLongitude();
    @Property(selector = "setLongitude:")
    public native void setLongitude(double v);
    @Property(selector = "imageCaptions")
    public native NSMutableArray<NSString> getImageCaptions();
    @Property(selector = "setImageCaptions:")
    public native void setImageCaptions(NSMutableArray<NSString> v);
    @Property(selector = "customMetadata")
    public native NSMutableDictionary<NSString, NSString> getCustomMetadata();
    @Property(selector = "setCustomMetadata:")
    public native void setCustomMetadata(NSMutableDictionary<NSString, NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dictionary")
    public native NSDictionary<?, ?> dictionary();
    @Method(selector = "contentMetadataWithDictionary:")
    protected static native @Pointer long create(NSDictionary<?, ?> dictionary);
    /*</methods>*/
}
