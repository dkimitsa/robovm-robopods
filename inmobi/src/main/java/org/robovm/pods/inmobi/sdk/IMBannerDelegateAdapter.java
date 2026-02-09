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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMBannerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IMBannerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("bannerDidFinishLoading:")
    public void bannerDidFinishLoading(IMBanner banner) {}
    @NotImplemented("banner:didReceiveWithMetaInfo:")
    public void didReceive(IMBanner banner, IMAdMetaInfo info) {}
    @NotImplemented("banner:didFailToReceiveWithError:")
    public void didFailToReceive(IMBanner banner, IMRequestStatus error) {}
    @NotImplemented("banner:didFailToLoadWithError:")
    public void didFailToLoad(IMBanner banner, IMRequestStatus error) {}
    @NotImplemented("bannerAdImpressed:")
    public void bannerAdImpressed(IMBanner banner) {}
    @NotImplemented("banner:didInteractWithParams:")
    public void didInteract(IMBanner banner, NSDictionary<NSString, ?> params) {}
    @NotImplemented("userWillLeaveApplicationFromBanner:")
    public void userWillLeaveApplicationFromBanner(IMBanner banner) {}
    @NotImplemented("bannerWillPresentScreen:")
    public void bannerWillPresentScreen(IMBanner banner) {}
    @NotImplemented("bannerDidPresentScreen:")
    public void bannerDidPresentScreen(IMBanner banner) {}
    @NotImplemented("bannerWillDismissScreen:")
    public void bannerWillDismissScreen(IMBanner banner) {}
    @NotImplemented("bannerDidDismissScreen:")
    public void bannerDidDismissScreen(IMBanner banner) {}
    @NotImplemented("banner:rewardActionCompletedWithRewards:")
    public void rewardActionCompleted(IMBanner banner, NSDictionary<NSString, ?> rewards) {}
    /*</methods>*/
}
