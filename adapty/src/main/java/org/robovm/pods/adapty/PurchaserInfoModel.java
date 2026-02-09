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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty18PurchaserInfoModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PurchaserInfoModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PurchaserInfoModelPtr extends Ptr<PurchaserInfoModel, PurchaserInfoModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PurchaserInfoModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PurchaserInfoModel() {}
    protected PurchaserInfoModel(Handle h, long handle) { super(h, handle); }
    protected PurchaserInfoModel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "profileId")
    public native String getProfileId();
    @Property(selector = "setProfileId:")
    public native void setProfileId(String v);
    @Property(selector = "customerUserId")
    public native String getCustomerUserId();
    @Property(selector = "setCustomerUserId:")
    public native void setCustomerUserId(String v);
    @Property(selector = "accessLevels")
    public native NSDictionary<NSString, AccessLevelInfoModel> getAccessLevels();
    @Property(selector = "setAccessLevels:")
    public native void setAccessLevels(NSDictionary<NSString, AccessLevelInfoModel> v);
    @Property(selector = "subscriptions")
    public native NSDictionary<NSString, SubscriptionInfoModel> getSubscriptions();
    @Property(selector = "setSubscriptions:")
    public native void setSubscriptions(NSDictionary<NSString, SubscriptionInfoModel> v);
    @Property(selector = "nonSubscriptions")
    public native NSDictionary<?, ?> getNonSubscriptions();
    @Property(selector = "setNonSubscriptions:")
    public native void setNonSubscriptions(NSDictionary<?, ?> v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
