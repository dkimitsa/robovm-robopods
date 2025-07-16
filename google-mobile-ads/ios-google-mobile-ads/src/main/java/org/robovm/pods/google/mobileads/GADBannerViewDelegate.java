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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GADBannerViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "bannerViewDidReceiveAd:")
    void didReceiveAd(GADBannerView bannerView);
    @Method(selector = "bannerView:didFailToReceiveAdWithError:")
    void didFailToReceiveAd(GADBannerView bannerView, NSError error);
    @Method(selector = "bannerViewDidRecordImpression:")
    void didRecordImpression(GADBannerView bannerView);
    @Method(selector = "bannerViewDidRecordClick:")
    void didRecordClick(GADBannerView bannerView);
    @Method(selector = "bannerViewWillPresentScreen:")
    void willPresentScreen(GADBannerView bannerView);
    @Method(selector = "bannerViewWillDismissScreen:")
    void willDismissScreen(GADBannerView bannerView);
    @Method(selector = "bannerViewDidDismissScreen:")
    void didDismissScreen(GADBannerView bannerView);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
