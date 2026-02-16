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
package org.robovm.pods.ironsource;

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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISBannerAdapterDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adapterBannerInitSuccess")
    void adapterBannerInitSuccess();
    @Method(selector = "adapterBannerInitSuccessWithExtraData:")
    void adapterBannerInitSuccess(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerInitFailedWithError:")
    void adapterBannerInitFailed(NSError error);
    @Method(selector = "adapterBannerInitFailedWithError:extraData:")
    void adapterBannerInitFailed(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerDidLoad:")
    void adapterBannerDidLoad(UIView bannerView);
    @Method(selector = "adapterBannerDidLoad:extraData:")
    void adapterBannerDidLoad(UIView bannerView, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerDidFailToLoadWithError:")
    void adapterBannerDidFailToLoad(NSError error);
    @Method(selector = "adapterBannerDidFailToLoadWithError:extraData:")
    void adapterBannerDidFailToLoad(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerDidClick")
    void adapterBannerDidClick();
    @Method(selector = "adapterBannerDidClickWithExtraData:")
    void adapterBannerDidClick(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerWillPresentScreen")
    void adapterBannerWillPresentScreen();
    @Method(selector = "adapterBannerWillPresentScreenWithExtraData:")
    void adapterBannerWillPresentScreen(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerDidDismissScreen")
    void adapterBannerDidDismissScreen();
    @Method(selector = "adapterBannerDidDismissScreenWithExtraData:")
    void adapterBannerDidDismissScreen(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerWillLeaveApplication")
    void adapterBannerWillLeaveApplication();
    @Method(selector = "adapterBannerWillLeaveApplicationWithExtraData:")
    void adapterBannerWillLeaveApplication(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerDidShow")
    void adapterBannerDidShow();
    @Method(selector = "adapterBannerDidShowWithExtraData:")
    void adapterBannerDidShow(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterBannerDidFailToShowWithError:")
    void adapterBannerDidFailToShow(NSError error);
    @Method(selector = "adapterBannerDidFailToShowWithError:extraData:")
    void adapterBannerDidFailToShow(NSError error, NSDictionary<NSString, ?> extraData);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
