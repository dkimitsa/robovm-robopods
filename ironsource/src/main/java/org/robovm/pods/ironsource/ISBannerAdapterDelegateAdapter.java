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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBannerAdapterDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISBannerAdapterDelegate/*</implements>*/ {

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
    @NotImplemented("adapterBannerInitSuccess")
    public void adapterBannerInitSuccess() {}
    @NotImplemented("adapterBannerInitSuccessWithExtraData:")
    public void adapterBannerInitSuccess(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerInitFailedWithError:")
    public void adapterBannerInitFailed(NSError error) {}
    @NotImplemented("adapterBannerInitFailedWithError:extraData:")
    public void adapterBannerInitFailed(NSError error, NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerDidLoad:")
    public void adapterBannerDidLoad(UIView bannerView) {}
    @NotImplemented("adapterBannerDidLoad:extraData:")
    public void adapterBannerDidLoad(UIView bannerView, NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerDidFailToLoadWithError:")
    public void adapterBannerDidFailToLoad(NSError error) {}
    @NotImplemented("adapterBannerDidFailToLoadWithError:extraData:")
    public void adapterBannerDidFailToLoad(NSError error, NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerDidClick")
    public void adapterBannerDidClick() {}
    @NotImplemented("adapterBannerDidClickWithExtraData:")
    public void adapterBannerDidClick(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerWillPresentScreen")
    public void adapterBannerWillPresentScreen() {}
    @NotImplemented("adapterBannerWillPresentScreenWithExtraData:")
    public void adapterBannerWillPresentScreen(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerDidDismissScreen")
    public void adapterBannerDidDismissScreen() {}
    @NotImplemented("adapterBannerDidDismissScreenWithExtraData:")
    public void adapterBannerDidDismissScreen(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerWillLeaveApplication")
    public void adapterBannerWillLeaveApplication() {}
    @NotImplemented("adapterBannerWillLeaveApplicationWithExtraData:")
    public void adapterBannerWillLeaveApplication(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerDidShow")
    public void adapterBannerDidShow() {}
    @NotImplemented("adapterBannerDidShowWithExtraData:")
    public void adapterBannerDidShow(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adapterBannerDidFailToShowWithError:")
    public void adapterBannerDidFailToShow(NSError error) {}
    @NotImplemented("adapterBannerDidFailToShowWithError:extraData:")
    public void adapterBannerDidFailToShow(NSError error, NSDictionary<NSString, ?> extraData) {}
    /*</methods>*/
}
