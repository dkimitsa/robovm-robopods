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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MAAdViewAdapterDelegate/*</name>*/ 
    /*<implements>*/extends MAAdapterDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didLoadAdForAdView:")
    void didLoadAdForAdView(UIView adView);
    @Method(selector = "didLoadAdForAdView:withExtraInfo:")
    void didLoadAd(UIView adView, NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToLoadAdViewAdWithError:")
    void didFailToLoadAd(MAAdapterError adapterError);
    @Method(selector = "didDisplayAdViewAd")
    void didDisplayAdViewAd();
    @Method(selector = "didDisplayAdViewAdWithExtraInfo:")
    void didDisplayAdViewAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didFailToDisplayAdViewAdWithError:")
    void didFailToDisplayAdViewAd(MAAdapterError adapterError);
    @Method(selector = "didFailToDisplayAdViewAdWithError:extraInfo:")
    void didFailToDisplayAdViewAd(MAAdapterError adapterError, NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didClickAdViewAd")
    void didClickAdViewAd();
    @Method(selector = "didClickAdViewAdWithExtraInfo:")
    void didClickAdViewAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didHideAdViewAd")
    void didHideAdViewAd();
    @Method(selector = "didHideAdViewAdWithExtraInfo:")
    void didHideAdViewAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didExpandAdViewAd")
    void didExpandAdViewAd();
    @Method(selector = "didExpandAdViewAdWithExtraInfo:")
    void didExpandAdViewAd(NSDictionary<NSString, ?> extraInfo);
    @Method(selector = "didCollapseAdViewAd")
    void didCollapseAdViewAd();
    @Method(selector = "didCollapseAdViewAdWithExtraInfo:")
    void didCollapseAdViewAd(NSDictionary<NSString, ?> extraInfo);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
