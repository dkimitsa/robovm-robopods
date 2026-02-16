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
package org.robovm.pods.unityads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityAnalyticsPtr extends Ptr<UnityAnalytics, UnityAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UnityAnalytics() {}
    protected UnityAnalytics(Handle h, long handle) { super(h, handle); }
    protected UnityAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "onItemAcquired:itemId:transactionContext:level:itemType:amount:balance:acquisitionType:")
    public static native void onItemAcquired(String transactionId, String itemId, String transactionContext, String level, String itemType, float amount, float balance, UnityAnalyticsAcquisitionType acquisitionType);
    @Method(selector = "onItemSpent:itemId:transactionContext:level:itemType:amount:balance:acquisitionType:")
    public static native void onItemSpent(String transactionId, String itemId, String transactionContext, String level, String itemType, float amount, float balance, UnityAnalyticsAcquisitionType acquisitionType);
    @Method(selector = "onLevelFail:")
    public static native void onLevelFail(String levelIndex);
    @Method(selector = "onLevelUp:")
    public static native void onLevelUp(String theNewLevelIndex);
    @Method(selector = "onAdComplete:network:rewarded:")
    public static native void onAdComplete(String placementId, String network, boolean rewarded);
    @Method(selector = "onIapTransaction:amount:currency:isPromo:receipt:")
    public static native void onIapTransaction(String productId, float amount, String currency, boolean isPromo, String receipt);
    @Method(selector = "onEvent:")
    public static native void onEvent(NSDictionary<NSString, ?> jsonObject);
    /*</methods>*/
}
