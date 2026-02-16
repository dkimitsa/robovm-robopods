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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MAAdDelegate/*</implements>*/ {

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
    @NotImplemented("didLoadAd:")
    public void didLoadAd(MAAd ad) {}
    @NotImplemented("didFailToLoadAdForAdUnitIdentifier:withError:")
    public void didFailToLoad(String adUnitIdentifier, MAError error) {}
    @NotImplemented("didDisplayAd:")
    public void didDisplayAd(MAAd ad) {}
    @NotImplemented("didHideAd:")
    public void didHideAd(MAAd ad) {}
    @NotImplemented("didClickAd:")
    public void didClickAd(MAAd ad) {}
    @NotImplemented("didFailToDisplayAd:withError:")
    public void didFailToDisplayAd(MAAd ad, MAError error) {}
    /**
     * @deprecated This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdRevenueDelegate didPayRevenueForAd:] instead.
     */
    @Deprecated
    @NotImplemented("didPayRevenueForAd:")
    public void didPayRevenueForAd(MAAd ad) {}
    /**
     * @deprecated This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdDelegate didFailToLoadAdForAdUnitIdentifier:withError:] instead.
     */
    @Deprecated
    @NotImplemented("didFailToLoadAdForAdUnitIdentifier:withErrorCode:")
    public void didFailToLoadAd(String adUnitIdentifier, @MachineSizedSInt long errorCode) {}
    /**
     * @deprecated This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdDelegate didFailToDisplayAd:withError:] instead.
     */
    @Deprecated
    @NotImplemented("didFailToDisplayAd:withErrorCode:")
    public void didFailToDisplayAd(MAAd ad, @MachineSizedSInt long errorCode) {}
    /*</methods>*/
}
