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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMBannerAdViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LPMBannerAdViewDelegate/*</implements>*/ {

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
    @NotImplemented("didLoadAdWithAdInfo:")
    public void didLoadAd(LPMAdInfo adInfo) {}
    @NotImplemented("didFailToLoadAdWithAdUnitId:error:")
    public void didFailToLoadAd(String adUnitId, NSError error) {}
    @NotImplemented("didClickAdWithAdInfo:")
    public void didClickAd(LPMAdInfo adInfo) {}
    @NotImplemented("didDisplayAdWithAdInfo:")
    public void didDisplayAd(LPMAdInfo adInfo) {}
    @NotImplemented("didFailToDisplayAdWithAdInfo:error:")
    public void didFailToDisplayAd(LPMAdInfo adInfo, NSError error) {}
    @NotImplemented("didLeaveAppWithAdInfo:")
    public void didLeaveApp(LPMAdInfo adInfo) {}
    @NotImplemented("didExpandAdWithAdInfo:")
    public void didExpandAd(LPMAdInfo adInfo) {}
    @NotImplemented("didCollapseAdWithAdInfo:")
    public void didCollapseAd(LPMAdInfo adInfo) {}
    /*</methods>*/
}
