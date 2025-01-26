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
/**
 * @deprecated Use LPMBannerAdViewDelegate instead.
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/LevelPlayBannerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @deprecated Use [LPMBannerAdViewDelegate didLoadAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didLoad:withAdInfo:")
    void didLoad(ISBannerView bannerView, ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMBannerAdViewDelegate didFailToLoadAdWithAdUnitId:errorId:] instead.
     */
    @Deprecated
    @Method(selector = "didFailToLoadWithError:")
    void didFailToLoad(NSError error);
    /**
     * @deprecated Use [LPMBannerAdViewDelegate didClickAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didClickWithAdInfo:")
    void didClick(ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMBannerAdViewDelegate didLeaveAppWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didLeaveApplicationWithAdInfo:")
    void didLeaveApplication(ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMBannerAdViewDelegate didExpandAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didPresentScreenWithAdInfo:")
    void didPresentScreen(ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMBannerAdViewDelegate didCollapseAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didDismissScreenWithAdInfo:")
    void didDismissScreen(ISAdInfo adInfo);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
