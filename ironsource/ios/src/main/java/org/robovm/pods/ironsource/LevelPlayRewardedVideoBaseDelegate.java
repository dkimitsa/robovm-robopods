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
 * @deprecated This protocol is deprecated and will be removed in version 9.0.0.
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/LevelPlayRewardedVideoBaseDelegate/*</name>*/ 
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
     * @deprecated Use [LPMRewardedAdDelegate didRewardAdWithAdInfo:reward:] instead.
     */
    @Deprecated
    @Method(selector = "didReceiveRewardForPlacement:withAdInfo:")
    void didReceiveReward(ISPlacementInfo placementInfo, ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMRewardedAdDelegate didFailToDisplayAdWithAdInfo:error:] instead.
     */
    @Deprecated
    @Method(selector = "didFailToShowWithError:andAdInfo:")
    void didFailToShow(NSError error, ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMRewardedAdDelegate didDisplayAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didOpenWithAdInfo:")
    void didOpen(ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMRewardedAdDelegate didClickAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didClick:withAdInfo:")
    void didClick(ISPlacementInfo placementInfo, ISAdInfo adInfo);
    /**
     * @deprecated Use [LPMRewardedAdDelegate didCloseAdWithAdInfo:] instead.
     */
    @Deprecated
    @Method(selector = "didCloseWithAdInfo:")
    void didClose(ISAdInfo adInfo);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
