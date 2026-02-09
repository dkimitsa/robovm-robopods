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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/IMBannerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "bannerDidFinishLoading:")
    void bannerDidFinishLoading(IMBanner banner);
    @Method(selector = "banner:didReceiveWithMetaInfo:")
    void didReceive(IMBanner banner, IMAdMetaInfo info);
    @Method(selector = "banner:didFailToReceiveWithError:")
    void didFailToReceive(IMBanner banner, IMRequestStatus error);
    @Method(selector = "banner:didFailToLoadWithError:")
    void didFailToLoad(IMBanner banner, IMRequestStatus error);
    @Method(selector = "bannerAdImpressed:")
    void bannerAdImpressed(IMBanner banner);
    @Method(selector = "banner:didInteractWithParams:")
    void didInteract(IMBanner banner, NSDictionary<NSString, ?> params);
    @Method(selector = "userWillLeaveApplicationFromBanner:")
    void userWillLeaveApplicationFromBanner(IMBanner banner);
    @Method(selector = "bannerWillPresentScreen:")
    void bannerWillPresentScreen(IMBanner banner);
    @Method(selector = "bannerDidPresentScreen:")
    void bannerDidPresentScreen(IMBanner banner);
    @Method(selector = "bannerWillDismissScreen:")
    void bannerWillDismissScreen(IMBanner banner);
    @Method(selector = "bannerDidDismissScreen:")
    void bannerDidDismissScreen(IMBanner banner);
    @Method(selector = "banner:rewardActionCompletedWithRewards:")
    void rewardActionCompleted(IMBanner banner, NSDictionary<NSString, ?> rewards);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
