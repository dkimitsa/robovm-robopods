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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISRewardedVideoAdapterDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adapterRewardedVideoHasChangedAvailability:")
    void adapterRewardedVideoHasChangedAvailability(boolean available);
    @Method(selector = "adapterRewardedVideoHasChangedAvailability:extraData:")
    void adapterRewardedVideoHasChangedAvailability(boolean available, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidFailToLoadWithError:")
    void adapterRewardedVideoDidFailToLoad(NSError error);
    @Method(selector = "adapterRewardedVideoDidFailToLoadWithError:extraData:")
    void adapterRewardedVideoDidFailToLoad(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidReceiveReward")
    void adapterRewardedVideoDidReceiveReward();
    @Method(selector = "adapterRewardedVideoDidReceiveRewardWithExtraData:")
    void adapterRewardedVideoDidReceiveReward(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidFailToShowWithError:")
    void adapterRewardedVideoDidFailToShow(NSError error);
    @Method(selector = "adapterRewardedVideoDidFailToShowWithError:extraData:")
    void adapterRewardedVideoDidFailToShow(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidOpen")
    void adapterRewardedVideoDidOpen();
    @Method(selector = "adapterRewardedVideoDidOpenWithExtraData:")
    void adapterRewardedVideoDidOpen(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidClose")
    void adapterRewardedVideoDidClose();
    @Method(selector = "adapterRewardedVideoDidCloseWithExtraData:")
    void adapterRewardedVideoDidClose(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidLoad")
    void adapterRewardedVideoDidLoad();
    @Method(selector = "adapterRewardedVideoDidLoadWithExtraData:")
    void adapterRewardedVideoDidLoad(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidClick")
    void adapterRewardedVideoDidClick();
    @Method(selector = "adapterRewardedVideoDidClickWithExtraData:")
    void adapterRewardedVideoDidClick(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidStart")
    void adapterRewardedVideoDidStart();
    @Method(selector = "adapterRewardedVideoDidStartWithExtraData:")
    void adapterRewardedVideoDidStart(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidEnd")
    void adapterRewardedVideoDidEnd();
    @Method(selector = "adapterRewardedVideoDidEndWithExtraData:")
    void adapterRewardedVideoDidEnd(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoInitSuccess")
    void adapterRewardedVideoInitSuccess();
    @Method(selector = "adapterRewardedVideoInitSuccessWithExtraData:")
    void adapterRewardedVideoInitSuccess(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoInitFailed:")
    void adapterRewardedVideoInitFailed(NSError error);
    @Method(selector = "adapterRewardedVideoInitFailed:extraData:")
    void adapterRewardedVideoInitFailed(NSError error, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adapterRewardedVideoDidBecomeVisible")
    void adapterRewardedVideoDidBecomeVisible();
    @Method(selector = "adapterRewardedVideoDidBecomeVisibleWithExtraData:")
    void adapterRewardedVideoDidBecomeVisible(NSDictionary<NSString, ?> extraData);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
