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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MAAdDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didLoadAd:")
    void didLoadAd(MAAd ad);
    @Method(selector = "didFailToLoadAdForAdUnitIdentifier:withError:")
    void didFailToLoad(String adUnitIdentifier, MAError error);
    @Method(selector = "didDisplayAd:")
    void didDisplayAd(MAAd ad);
    @Method(selector = "didHideAd:")
    void didHideAd(MAAd ad);
    @Method(selector = "didClickAd:")
    void didClickAd(MAAd ad);
    @Method(selector = "didFailToDisplayAd:withError:")
    void didFailToDisplayAd(MAAd ad, MAError error);
    /**
     * @deprecated This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdRevenueDelegate didPayRevenueForAd:] instead.
     */
    @Deprecated
    @Method(selector = "didPayRevenueForAd:")
    void didPayRevenueForAd(MAAd ad);
    /**
     * @deprecated This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdDelegate didFailToLoadAdForAdUnitIdentifier:withError:] instead.
     */
    @Deprecated
    @Method(selector = "didFailToLoadAdForAdUnitIdentifier:withErrorCode:")
    void didFailToLoadAd(String adUnitIdentifier, @MachineSizedSInt long errorCode);
    /**
     * @deprecated This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdDelegate didFailToDisplayAd:withError:] instead.
     */
    @Deprecated
    @Method(selector = "didFailToDisplayAd:withErrorCode:")
    void didFailToDisplayAd(MAAd ad, @MachineSizedSInt long errorCode);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
