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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/IMAudioDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "audioAdDidFinishLoading:")
    void audioAdDidFinishLoading(IMAudio audioAd);
    @Method(selector = "audioAdDidBecomeVisible:")
    void audioAdDidBecomeVisible(IMAudio audioAd);
    @Method(selector = "audioAd:didReceiveWithMetaInfo:")
    void didReceive(IMAudio audioAd, IMAdMetaInfo info);
    @Method(selector = "audioAd:didFailToLoadWithError:")
    void didFailToLoad(IMAudio audioAd, IMRequestStatus error);
    @Method(selector = "audioAd:didFailToShowWithError:")
    void didFailToShow(IMAudio audioAd, IMRequestStatus error);
    @Method(selector = "audioAdImpressed:")
    void audioAdImpressed(IMAudio audioAd);
    @Method(selector = "audioAd:didInteractWithParams:")
    void didInteract(IMAudio audioAd, NSDictionary<NSString, ?> params);
    @Method(selector = "audioAdWillPresentScreen:")
    void audioAdWillPresentScreen(IMAudio audioAd);
    @Method(selector = "audioAdDidPresentScreen:")
    void audioAdDidPresentScreen(IMAudio audioAd);
    @Method(selector = "audioAdWillDismissScreen:")
    void audioAdWillDismissScreen(IMAudio audioAd);
    @Method(selector = "audioAdDidDismissScreen:")
    void audioAdDidDismissScreen(IMAudio audioAd);
    @Method(selector = "userWillLeaveApplicationFromAudioAd:")
    void userWillLeaveApplicationFromAudioAd(IMAudio audioAd);
    @Method(selector = "audioAd:rewardActionCompletedWithRewards:")
    void rewardActionCompleted(IMAudio audioAd, NSDictionary<NSString, ?> rewards);
    @Method(selector = "audioAd:audioStatusChanged:")
    void audioStatusChanged(IMAudio audioAd, IMAudioStatus status);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
