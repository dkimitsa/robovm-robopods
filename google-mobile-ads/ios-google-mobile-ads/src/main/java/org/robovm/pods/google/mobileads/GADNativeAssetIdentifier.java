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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/GADNativeAssetIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeAssetIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GADNativeAssetIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GADNativeAssetIdentifier toObject(Class<GADNativeAssetIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GADNativeAssetIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GADNativeAssetIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GADNativeAssetIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GADNativeAssetIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GADNativeAssetIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GADNativeAssetIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GADNativeAssetIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final GADNativeAssetIdentifier HeadlineAsset = new GADNativeAssetIdentifier("HeadlineAsset");
    public static final GADNativeAssetIdentifier CallToActionAsset = new GADNativeAssetIdentifier("CallToActionAsset");
    public static final GADNativeAssetIdentifier IconAsset = new GADNativeAssetIdentifier("IconAsset");
    public static final GADNativeAssetIdentifier BodyAsset = new GADNativeAssetIdentifier("BodyAsset");
    public static final GADNativeAssetIdentifier StoreAsset = new GADNativeAssetIdentifier("StoreAsset");
    public static final GADNativeAssetIdentifier PriceAsset = new GADNativeAssetIdentifier("PriceAsset");
    public static final GADNativeAssetIdentifier ImageAsset = new GADNativeAssetIdentifier("ImageAsset");
    public static final GADNativeAssetIdentifier StarRatingAsset = new GADNativeAssetIdentifier("StarRatingAsset");
    public static final GADNativeAssetIdentifier AdvertiserAsset = new GADNativeAssetIdentifier("AdvertiserAsset");
    public static final GADNativeAssetIdentifier MediaViewAsset = new GADNativeAssetIdentifier("MediaViewAsset");
    public static final GADNativeAssetIdentifier AdChoicesViewAsset = new GADNativeAssetIdentifier("AdChoicesViewAsset");
    /*</constants>*/
    
    private static /*<name>*/GADNativeAssetIdentifier/*</name>*/[] values = new /*<name>*/GADNativeAssetIdentifier/*</name>*/[] {/*<value_list>*/HeadlineAsset, CallToActionAsset, IconAsset, BodyAsset, StoreAsset, PriceAsset, ImageAsset, StarRatingAsset, AdvertiserAsset, MediaViewAsset, AdChoicesViewAsset/*</value_list>*/};
    
    /*<name>*/GADNativeAssetIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GADNativeAssetIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GADNativeAssetIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GADNativeAssetIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="GADNativeHeadlineAsset", optional=true)
        public static native NSString HeadlineAsset();
        @GlobalValue(symbol="GADNativeCallToActionAsset", optional=true)
        public static native NSString CallToActionAsset();
        @GlobalValue(symbol="GADNativeIconAsset", optional=true)
        public static native NSString IconAsset();
        @GlobalValue(symbol="GADNativeBodyAsset", optional=true)
        public static native NSString BodyAsset();
        @GlobalValue(symbol="GADNativeStoreAsset", optional=true)
        public static native NSString StoreAsset();
        @GlobalValue(symbol="GADNativePriceAsset", optional=true)
        public static native NSString PriceAsset();
        @GlobalValue(symbol="GADNativeImageAsset", optional=true)
        public static native NSString ImageAsset();
        @GlobalValue(symbol="GADNativeStarRatingAsset", optional=true)
        public static native NSString StarRatingAsset();
        @GlobalValue(symbol="GADNativeAdvertiserAsset", optional=true)
        public static native NSString AdvertiserAsset();
        @GlobalValue(symbol="GADNativeMediaViewAsset", optional=true)
        public static native NSString MediaViewAsset();
        @GlobalValue(symbol="GADNativeAdChoicesViewAsset", optional=true)
        public static native NSString AdChoicesViewAsset();
        /*</values>*/
    }
}
