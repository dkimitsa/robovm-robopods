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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventName/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKAppEventName.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAppEventNameAdClick", optional=true)
    public static native NSString AdClick();
    @GlobalValue(symbol="FBSDKAppEventNameAdImpression", optional=true)
    public static native NSString AdImpression();
    @GlobalValue(symbol="FBSDKAppEventNameCompletedRegistration", optional=true)
    public static native NSString CompletedRegistration();
    @GlobalValue(symbol="FBSDKAppEventNameCompletedTutorial", optional=true)
    public static native NSString CompletedTutorial();
    @GlobalValue(symbol="FBSDKAppEventNameContact", optional=true)
    public static native NSString Contact();
    @GlobalValue(symbol="FBSDKAppEventNameCustomizeProduct", optional=true)
    public static native NSString CustomizeProduct();
    @GlobalValue(symbol="FBSDKAppEventNameDonate", optional=true)
    public static native NSString Donate();
    @GlobalValue(symbol="FBSDKAppEventNameFindLocation", optional=true)
    public static native NSString FindLocation();
    @GlobalValue(symbol="FBSDKAppEventNameRated", optional=true)
    public static native NSString Rated();
    @GlobalValue(symbol="FBSDKAppEventNameSchedule", optional=true)
    public static native NSString Schedule();
    @GlobalValue(symbol="FBSDKAppEventNameSearched", optional=true)
    public static native NSString Searched();
    @GlobalValue(symbol="FBSDKAppEventNameStartTrial", optional=true)
    public static native NSString StartTrial();
    @GlobalValue(symbol="FBSDKAppEventNameSubmitApplication", optional=true)
    public static native NSString SubmitApplication();
    @GlobalValue(symbol="FBSDKAppEventNameSubscribe", optional=true)
    public static native NSString Subscribe();
    @GlobalValue(symbol="FBSDKAppEventNameViewedContent", optional=true)
    public static native NSString ViewedContent();
    @GlobalValue(symbol="FBSDKAppEventNameAddedPaymentInfo", optional=true)
    public static native NSString AddedPaymentInfo();
    @GlobalValue(symbol="FBSDKAppEventNameAddedToCart", optional=true)
    public static native NSString AddedToCart();
    @GlobalValue(symbol="FBSDKAppEventNameAddedToWishlist", optional=true)
    public static native NSString AddedToWishlist();
    @GlobalValue(symbol="FBSDKAppEventNameInitiatedCheckout", optional=true)
    public static native NSString InitiatedCheckout();
    @GlobalValue(symbol="FBSDKAppEventNamePurchased", optional=true)
    public static native NSString Purchased();
    @GlobalValue(symbol="FBSDKAppEventNamePurchaseRestored", optional=true)
    public static native NSString PurchaseRestored();
    @GlobalValue(symbol="FBSDKAppEventNameSubscribeRestore", optional=true)
    public static native NSString SubscribeRestore();
    @GlobalValue(symbol="FBSDKAppEventNamePurchaseFailed", optional=true)
    public static native NSString PurchaseFailed();
    @GlobalValue(symbol="FBSDKAppEventNameSubscribeInitiatedCheckout", optional=true)
    public static native NSString SubscribeInitiatedCheckout();
    @GlobalValue(symbol="FBSDKAppEventNameSubscribeFailed", optional=true)
    public static native NSString SubscribeFailed();
    @GlobalValue(symbol="FBSDKAppEventNameAchievedLevel", optional=true)
    public static native NSString AchievedLevel();
    @GlobalValue(symbol="FBSDKAppEventNameUnlockedAchievement", optional=true)
    public static native NSString UnlockedAchievement();
    @GlobalValue(symbol="FBSDKAppEventNameSpentCredits", optional=true)
    public static native NSString SpentCredits();
    @GlobalValue(symbol="FBSDKAppEventNameBackgroundStatusAvailable", optional=true)
    public static native NSString BackgroundStatusAvailable();
    @GlobalValue(symbol="FBSDKAppEventNameBackgroundStatusDenied", optional=true)
    public static native NSString BackgroundStatusDenied();
    @GlobalValue(symbol="FBSDKAppEventNameBackgroundStatusRestricted", optional=true)
    public static native NSString BackgroundStatusRestricted();
    @GlobalValue(symbol="FBSDKAppEventNameSDKSettingsChanged", optional=true)
    public static native NSString SDKSettingsChanged();
    /*</methods>*/
}
