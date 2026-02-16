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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
@Marshaler(/*<name>*/ALEventParameters/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALEventParameters/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ALEventParameters toObject(Class<ALEventParameters> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new ALEventParameters(o);
        }
        @MarshalsPointer
        public static long toNative(ALEventParameters o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<ALEventParameters> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ALEventParameters> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new ALEventParameters(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ALEventParameters> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (ALEventParameters i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    ALEventParameters(NSDictionary data) {
        super(data);
    }
    public ALEventParameters() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public ALEventParameters set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public NSString getUserAccountIdentifier() {
        if (has(Keys.UserAccountIdentifier())) {
            NSString val = (NSString) get(Keys.UserAccountIdentifier());
            return val;
        }
        return null;
    }
    public ALEventParameters setUserAccountIdentifier(NSString userAccountIdentifier) {
        set(Keys.UserAccountIdentifier(), userAccountIdentifier);
        return this;
    }
    public NSString getContentIdentifier() {
        if (has(Keys.ContentIdentifier())) {
            NSString val = (NSString) get(Keys.ContentIdentifier());
            return val;
        }
        return null;
    }
    public ALEventParameters setContentIdentifier(NSString contentIdentifier) {
        set(Keys.ContentIdentifier(), contentIdentifier);
        return this;
    }
    public NSString getSearchQuery() {
        if (has(Keys.SearchQuery())) {
            NSString val = (NSString) get(Keys.SearchQuery());
            return val;
        }
        return null;
    }
    public ALEventParameters setSearchQuery(NSString searchQuery) {
        set(Keys.SearchQuery(), searchQuery);
        return this;
    }
    public NSString getCompletedLevel() {
        if (has(Keys.CompletedLevel())) {
            NSString val = (NSString) get(Keys.CompletedLevel());
            return val;
        }
        return null;
    }
    public ALEventParameters setCompletedLevel(NSString completedLevel) {
        set(Keys.CompletedLevel(), completedLevel);
        return this;
    }
    public NSString getCompletedAchievement() {
        if (has(Keys.CompletedAchievement())) {
            NSString val = (NSString) get(Keys.CompletedAchievement());
            return val;
        }
        return null;
    }
    public ALEventParameters setCompletedAchievement(NSString completedAchievement) {
        set(Keys.CompletedAchievement(), completedAchievement);
        return this;
    }
    public NSNumber getVirtualCurrencyAmount() {
        if (has(Keys.VirtualCurrencyAmount())) {
            NSNumber val = (NSNumber) get(Keys.VirtualCurrencyAmount());
            return val;
        }
        return null;
    }
    public ALEventParameters setVirtualCurrencyAmount(NSNumber virtualCurrencyAmount) {
        set(Keys.VirtualCurrencyAmount(), virtualCurrencyAmount);
        return this;
    }
    public NSString getVirtualCurrencyName() {
        if (has(Keys.VirtualCurrencyName())) {
            NSString val = (NSString) get(Keys.VirtualCurrencyName());
            return val;
        }
        return null;
    }
    public ALEventParameters setVirtualCurrencyName(NSString virtualCurrencyName) {
        set(Keys.VirtualCurrencyName(), virtualCurrencyName);
        return this;
    }
    public NSString getProductIdentifier() {
        if (has(Keys.ProductIdentifier())) {
            NSString val = (NSString) get(Keys.ProductIdentifier());
            return val;
        }
        return null;
    }
    public ALEventParameters setProductIdentifier(NSString productIdentifier) {
        set(Keys.ProductIdentifier(), productIdentifier);
        return this;
    }
    public NSNumber getRevenueAmount() {
        if (has(Keys.RevenueAmount())) {
            NSNumber val = (NSNumber) get(Keys.RevenueAmount());
            return val;
        }
        return null;
    }
    public ALEventParameters setRevenueAmount(NSNumber revenueAmount) {
        set(Keys.RevenueAmount(), revenueAmount);
        return this;
    }
    public NSString getRevenueCurrency() {
        if (has(Keys.RevenueCurrency())) {
            NSString val = (NSString) get(Keys.RevenueCurrency());
            return val;
        }
        return null;
    }
    public ALEventParameters setRevenueCurrency(NSString revenueCurrency) {
        set(Keys.RevenueCurrency(), revenueCurrency);
        return this;
    }
    public NSString getCheckoutTransactionIdentifier() {
        if (has(Keys.CheckoutTransactionIdentifier())) {
            NSString val = (NSString) get(Keys.CheckoutTransactionIdentifier());
            return val;
        }
        return null;
    }
    public ALEventParameters setCheckoutTransactionIdentifier(NSString checkoutTransactionIdentifier) {
        set(Keys.CheckoutTransactionIdentifier(), checkoutTransactionIdentifier);
        return this;
    }
    public NSString getStoreKitTransactionIdentifier() {
        if (has(Keys.StoreKitTransactionIdentifier())) {
            NSString val = (NSString) get(Keys.StoreKitTransactionIdentifier());
            return val;
        }
        return null;
    }
    public ALEventParameters setStoreKitTransactionIdentifier(NSString storeKitTransactionIdentifier) {
        set(Keys.StoreKitTransactionIdentifier(), storeKitTransactionIdentifier);
        return this;
    }
    public NSData getStoreKitReceipt() {
        if (has(Keys.StoreKitReceipt())) {
            NSData val = (NSData) get(Keys.StoreKitReceipt());
            return val;
        }
        return null;
    }
    public ALEventParameters setStoreKitReceipt(NSData storeKitReceipt) {
        set(Keys.StoreKitReceipt(), storeKitReceipt);
        return this;
    }
    public NSDate getReservationStartDate() {
        if (has(Keys.ReservationStartDate())) {
            NSDate val = (NSDate) get(Keys.ReservationStartDate());
            return val;
        }
        return null;
    }
    public ALEventParameters setReservationStartDate(NSDate reservationStartDate) {
        set(Keys.ReservationStartDate(), reservationStartDate);
        return this;
    }
    public NSDate getReservationEndDate() {
        if (has(Keys.ReservationEndDate())) {
            NSDate val = (NSDate) get(Keys.ReservationEndDate());
            return val;
        }
        return null;
    }
    public ALEventParameters setReservationEndDate(NSDate reservationEndDate) {
        set(Keys.ReservationEndDate(), reservationEndDate);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kALEventParameterUserAccountIdentifierKey", optional=true)
        public static native NSString UserAccountIdentifier();
        @GlobalValue(symbol="kALEventParameterContentIdentifierKey", optional=true)
        public static native NSString ContentIdentifier();
        @GlobalValue(symbol="kALEventParameterSearchQueryKey", optional=true)
        public static native NSString SearchQuery();
        @GlobalValue(symbol="kALEventParameterCompletedLevelKey", optional=true)
        public static native NSString CompletedLevel();
        @GlobalValue(symbol="kALEventParameterCompletedAchievementKey", optional=true)
        public static native NSString CompletedAchievement();
        @GlobalValue(symbol="kALEventParameterVirtualCurrencyAmountKey", optional=true)
        public static native NSString VirtualCurrencyAmount();
        @GlobalValue(symbol="kALEventParameterVirtualCurrencyNameKey", optional=true)
        public static native NSString VirtualCurrencyName();
        @GlobalValue(symbol="kALEventParameterProductIdentifierKey", optional=true)
        public static native NSString ProductIdentifier();
        @GlobalValue(symbol="kALEventParameterRevenueAmountKey", optional=true)
        public static native NSString RevenueAmount();
        @GlobalValue(symbol="kALEventParameterRevenueCurrencyKey", optional=true)
        public static native NSString RevenueCurrency();
        @GlobalValue(symbol="kALEventParameterCheckoutTransactionIdentifierKey", optional=true)
        public static native NSString CheckoutTransactionIdentifier();
        @GlobalValue(symbol="kALEventParameterStoreKitTransactionIdentifierKey", optional=true)
        public static native NSString StoreKitTransactionIdentifier();
        @GlobalValue(symbol="kALEventParameterStoreKitReceiptKey", optional=true)
        public static native NSString StoreKitReceipt();
        @GlobalValue(symbol="kALEventParameterReservationStartDateKey", optional=true)
        public static native NSString ReservationStartDate();
        @GlobalValue(symbol="kALEventParameterReservationEndDateKey", optional=true)
        public static native NSString ReservationEndDate();
    }
    /*</keys>*/
}
