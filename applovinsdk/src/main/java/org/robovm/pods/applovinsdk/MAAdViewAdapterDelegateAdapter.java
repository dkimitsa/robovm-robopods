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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdViewAdapterDelegateAdapter/*</name>*/ 
    extends /*<extends>*/MAAdapterDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements MAAdViewAdapterDelegate/*</implements>*/ {

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
    @NotImplemented("didLoadAdForAdView:")
    public void didLoadAdForAdView(UIView adView) {}
    @NotImplemented("didLoadAdForAdView:withExtraInfo:")
    public void didLoadAd(UIView adView, NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didFailToLoadAdViewAdWithError:")
    public void didFailToLoadAd(MAAdapterError adapterError) {}
    @NotImplemented("didDisplayAdViewAd")
    public void didDisplayAdViewAd() {}
    @NotImplemented("didDisplayAdViewAdWithExtraInfo:")
    public void didDisplayAdViewAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didFailToDisplayAdViewAdWithError:")
    public void didFailToDisplayAdViewAd(MAAdapterError adapterError) {}
    @NotImplemented("didFailToDisplayAdViewAdWithError:extraInfo:")
    public void didFailToDisplayAdViewAd(MAAdapterError adapterError, NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didClickAdViewAd")
    public void didClickAdViewAd() {}
    @NotImplemented("didClickAdViewAdWithExtraInfo:")
    public void didClickAdViewAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didHideAdViewAd")
    public void didHideAdViewAd() {}
    @NotImplemented("didHideAdViewAdWithExtraInfo:")
    public void didHideAdViewAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didExpandAdViewAd")
    public void didExpandAdViewAd() {}
    @NotImplemented("didExpandAdViewAdWithExtraInfo:")
    public void didExpandAdViewAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didCollapseAdViewAd")
    public void didCollapseAdViewAd() {}
    @NotImplemented("didCollapseAdViewAdWithExtraInfo:")
    public void didCollapseAdViewAd(NSDictionary<NSString, ?> extraInfo) {}
    /*</methods>*/
}
