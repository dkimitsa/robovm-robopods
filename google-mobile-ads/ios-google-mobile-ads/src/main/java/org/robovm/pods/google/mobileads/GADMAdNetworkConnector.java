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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GADMAdNetworkConnector/*</name>*/ 
    /*<implements>*/extends GADMediationAdRequest/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "viewControllerForPresentingModalView")
    UIViewController viewControllerForPresentingModalView();
    @Method(selector = "adVolume")
    float adVolume();
    @Method(selector = "adMuted")
    boolean adMuted();
    @Method(selector = "adapter:didFailAd:")
    void didFailAd(GADMAdNetworkAdapter adapter, NSError error);
    @Method(selector = "adapter:didReceiveAdView:")
    void didReceiveAdView(GADMAdNetworkAdapter adapter, UIView view);
    @Method(selector = "adapterDidReceiveInterstitial:")
    void didReceiveInterstitial(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapter:didReceiveMediatedUnifiedNativeAd:")
    void didReceiveMediatedUnifiedNativeAd(GADMAdNetworkAdapter adapter, GADMediatedUnifiedNativeAd mediatedUnifiedNativeAd);
    @Method(selector = "adapterDidGetAdClick:")
    void didGetAdClick(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapterWillPresentFullScreenModal:")
    void willPresentFullScreenModal(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapterWillDismissFullScreenModal:")
    void willDismissFullScreenModal(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapterDidDismissFullScreenModal:")
    void widDismissFullScreenModal(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapterWillPresentInterstitial:")
    void willPresentInterstitial(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapterWillDismissInterstitial:")
    void willDismissInterstitial(GADMAdNetworkAdapter adapter);
    @Method(selector = "adapterDidDismissInterstitial:")
    void didDismissInterstitial(GADMAdNetworkAdapter adapter);
    /**
     * @deprecated Use -adapterDidReceiveInterstitial:.
     */
    @Deprecated
    @Method(selector = "adapter:didReceiveInterstitial:")
    void didReceiveInterstitial(GADMAdNetworkAdapter adapter, NSObject interstitial);
    /**
     * @deprecated Use -adapterDidGetAdClick:.
     */
    @Deprecated
    @Method(selector = "adapter:clickDidOccurInBanner:")
    void clickDidOccurInBanner(GADMAdNetworkAdapter adapter, UIView view);
    /**
     * @deprecated Use -adapter:didFailAd:
     */
    @Deprecated
    @Method(selector = "adapter:didFailInterstitial:")
    void didFailInterstitial(GADMAdNetworkAdapter adapter, NSError error);
    /**
     * @deprecated Deprecated. No replacement.
     */
    @Deprecated
    @Method(selector = "adapterWillLeaveApplication:")
    void willLeaveApplication(GADMAdNetworkAdapter adapter);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
