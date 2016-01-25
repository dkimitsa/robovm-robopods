/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.mopub;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPBannerCustomEventDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "viewControllerForPresentingModalView")
    UIViewController getViewControllerForPresentingModalView();
    @Method(selector = "location")
    CLLocation getLocation();
    @Method(selector = "bannerCustomEvent:didLoadAd:")
    void didLoadAd(MPBannerCustomEvent event, UIView ad);
    @Method(selector = "bannerCustomEvent:didFailToLoadAdWithError:")
    void didFailToLoadAd(MPBannerCustomEvent event, NSError error);
    @Method(selector = "bannerCustomEventWillBeginAction:")
    void willBeginAction(MPBannerCustomEvent event);
    @Method(selector = "bannerCustomEventDidFinishAction:")
    void didFinishAction(MPBannerCustomEvent event);
    @Method(selector = "bannerCustomEventWillLeaveApplication:")
    void willLeaveApplication(MPBannerCustomEvent event);
    @Method(selector = "trackImpression")
    void trackImpression();
    @Method(selector = "trackClick")
    void trackClick();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
