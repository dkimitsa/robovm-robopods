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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPInterstitialAdControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "interstitialDidLoadAd:")
    void didLoadAd(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialDidFailToLoadAd:")
    void didFailToLoadAd(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialWillAppear:")
    void willAppear(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialDidAppear:")
    void didAppear(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialWillDisappear:")
    void willDisappear(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialDidDisappear:")
    void didDisappear(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialDidExpire:")
    void didExpire(MPInterstitialAdController interstitial);
    @Method(selector = "interstitialDidReceiveTapEvent:")
    void didReceiveTapEvent(MPInterstitialAdController interstitial);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
