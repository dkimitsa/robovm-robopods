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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALEventTypes/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ALEventTypes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kALEventTypeUserLoggedIn", optional=true)
    public static native NSString UserLoggedIn();
    @GlobalValue(symbol="kALEventTypeUserCreatedAccount", optional=true)
    public static native NSString UserCreatedAccount();
    @GlobalValue(symbol="kALEventTypeUserViewedContent", optional=true)
    public static native NSString UserViewedContent();
    @GlobalValue(symbol="kALEventTypeUserExecutedSearch", optional=true)
    public static native NSString UserExecutedSearch();
    @GlobalValue(symbol="kALEventTypeUserCompletedTutorial", optional=true)
    public static native NSString UserCompletedTutorial();
    @GlobalValue(symbol="kALEventTypeUserCompletedLevel", optional=true)
    public static native NSString UserCompletedLevel();
    @GlobalValue(symbol="kALEventTypeUserCompletedAchievement", optional=true)
    public static native NSString UserCompletedAchievement();
    @GlobalValue(symbol="kALEventTypeUserSpentVirtualCurrency", optional=true)
    public static native NSString UserSpentVirtualCurrency();
    @GlobalValue(symbol="kALEventTypeUserViewedProduct", optional=true)
    public static native NSString UserViewedProduct();
    @GlobalValue(symbol="kALEventTypeUserAddedItemToCart", optional=true)
    public static native NSString UserAddedItemToCart();
    @GlobalValue(symbol="kALEventTypeUserAddedItemToWishlist", optional=true)
    public static native NSString UserAddedItemToWishlist();
    @GlobalValue(symbol="kALEventTypeUserProvidedPaymentInformation", optional=true)
    public static native NSString UserProvidedPaymentInformation();
    @GlobalValue(symbol="kALEventTypeUserBeganCheckOut", optional=true)
    public static native NSString UserBeganCheckOut();
    @GlobalValue(symbol="kALEventTypeUserCompletedCheckOut", optional=true)
    public static native NSString UserCompletedCheckOut();
    @GlobalValue(symbol="kALEventTypeUserCompletedInAppPurchase", optional=true)
    public static native NSString UserCompletedInAppPurchase();
    @GlobalValue(symbol="kALEventTypeUserCreatedReservation", optional=true)
    public static native NSString UserCreatedReservation();
    @GlobalValue(symbol="kALEventTypeUserSentInvitation", optional=true)
    public static native NSString UserSentInvitation();
    @GlobalValue(symbol="kALEventTypeUserSharedLink", optional=true)
    public static native NSString UserSharedLink();
    /*</methods>*/
}
