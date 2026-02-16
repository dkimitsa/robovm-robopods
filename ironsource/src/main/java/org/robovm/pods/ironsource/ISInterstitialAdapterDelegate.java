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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISInterstitialAdapterDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adapterInterstitialInitSuccess")
    void adapterInterstitialInitSuccess();
    @Method(selector = "adapterInterstitialInitSuccessWithExtraData:")
    void adapterInterstitialInitSuccess(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialInitFailedWithError:")
    void adapterInterstitialInitFailed(NSError error);
    @Method(selector = "adapterInterstitialInitFailedWithError:extraData:")
    void adapterInterstitialInitFailed(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidLoad")
    void adapterInterstitialDidLoad();
    @Method(selector = "adapterInterstitialDidLoadWithExtraData:")
    void adapterInterstitialDidLoad(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidFailToLoadWithError:")
    void adapterInterstitialDidFailToLoad(NSError error);
    @Method(selector = "adapterInterstitialDidFailToLoadWithError:extraData:")
    void adapterInterstitialDidFailToLoad(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidOpen")
    void adapterInterstitialDidOpen();
    @Method(selector = "adapterInterstitialDidOpenWithExtraData:")
    void adapterInterstitialDidOpen(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidClose")
    void adapterInterstitialDidClose();
    @Method(selector = "adapterInterstitialDidCloseWithExtraData:")
    void adapterInterstitialDidClose(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidShow")
    void adapterInterstitialDidShow();
    @Method(selector = "adapterInterstitialDidShowWithExtraData:")
    void adapterInterstitialDidShow(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidFailToShowWithError:")
    void adapterInterstitialDidFailToShow(NSError error);
    @Method(selector = "adapterInterstitialDidFailToShowWithError:extraData:")
    void adapterInterstitialDidFailToShow(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidClick")
    void adapterInterstitialDidClick();
    @Method(selector = "adapterInterstitialDidClickWithExtraData:")
    void adapterInterstitialDidClick(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterInterstitialDidBecomeVisible")
    void adapterInterstitialDidBecomeVisible();
    @Method(selector = "adapterInterstitialDidBecomeVisibleWithExtraData:")
    void adapterInterstitialDidBecomeVisible(NSDictionary<NSString, ?> extraData);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
