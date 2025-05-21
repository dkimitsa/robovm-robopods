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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchStandardEvents/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BranchStandardEvents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BranchStandardEventAddToCart", optional=true)
    public static native String getAddToCart();
    @GlobalValue(symbol="BranchStandardEventAddToWishlist", optional=true)
    public static native String getAddToWishlist();
    @GlobalValue(symbol="BranchStandardEventViewCart", optional=true)
    public static native String getViewCart();
    @GlobalValue(symbol="BranchStandardEventInitiatePurchase", optional=true)
    public static native String getInitiatePurchase();
    @GlobalValue(symbol="BranchStandardEventAddPaymentInfo", optional=true)
    public static native String getAddPaymentInfo();
    @GlobalValue(symbol="BranchStandardEventPurchase", optional=true)
    public static native String getPurchase();
    @GlobalValue(symbol="BranchStandardEventSpendCredits", optional=true)
    public static native String getSpendCredits();
    @GlobalValue(symbol="BranchStandardEventSubscribe", optional=true)
    public static native String getSubscribe();
    @GlobalValue(symbol="BranchStandardEventStartTrial", optional=true)
    public static native String getStartTrial();
    @GlobalValue(symbol="BranchStandardEventClickAd", optional=true)
    public static native String getClickAd();
    @GlobalValue(symbol="BranchStandardEventViewAd", optional=true)
    public static native String getViewAd();
    @GlobalValue(symbol="BranchStandardEventSearch", optional=true)
    public static native String getSearch();
    @GlobalValue(symbol="BranchStandardEventViewItem", optional=true)
    public static native String getViewItem();
    @GlobalValue(symbol="BranchStandardEventViewItems", optional=true)
    public static native String getViewItems();
    @GlobalValue(symbol="BranchStandardEventRate", optional=true)
    public static native String getRate();
    @GlobalValue(symbol="BranchStandardEventShare", optional=true)
    public static native String getShare();
    @GlobalValue(symbol="BranchStandardEventInitiateStream", optional=true)
    public static native String getInitiateStream();
    @GlobalValue(symbol="BranchStandardEventCompleteStream", optional=true)
    public static native String getCompleteStream();
    @GlobalValue(symbol="BranchStandardEventCompleteRegistration", optional=true)
    public static native String getCompleteRegistration();
    @GlobalValue(symbol="BranchStandardEventCompleteTutorial", optional=true)
    public static native String getCompleteTutorial();
    @GlobalValue(symbol="BranchStandardEventAchieveLevel", optional=true)
    public static native String getAchieveLevel();
    @GlobalValue(symbol="BranchStandardEventUnlockAchievement", optional=true)
    public static native String getUnlockAchievement();
    @GlobalValue(symbol="BranchStandardEventInvite", optional=true)
    public static native String getInvite();
    @GlobalValue(symbol="BranchStandardEventLogin", optional=true)
    public static native String getLogin();
    @GlobalValue(symbol="BranchStandardEventReserve", optional=true)
    public static native String getReserve();
    @GlobalValue(symbol="BranchStandardEventOptIn", optional=true)
    public static native String getOptIn();
    @GlobalValue(symbol="BranchStandardEventOptOut", optional=true)
    public static native String getOptOut();
    /*</methods>*/
}
