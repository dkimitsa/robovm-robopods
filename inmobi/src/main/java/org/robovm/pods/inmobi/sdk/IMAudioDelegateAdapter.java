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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMAudioDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IMAudioDelegate/*</implements>*/ {

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
    @NotImplemented("audioAdDidFinishLoading:")
    public void audioAdDidFinishLoading(IMAudio audioAd) {}
    @NotImplemented("audioAdDidBecomeVisible:")
    public void audioAdDidBecomeVisible(IMAudio audioAd) {}
    @NotImplemented("audioAd:didReceiveWithMetaInfo:")
    public void didReceive(IMAudio audioAd, IMAdMetaInfo info) {}
    @NotImplemented("audioAd:didFailToLoadWithError:")
    public void didFailToLoad(IMAudio audioAd, IMRequestStatus error) {}
    @NotImplemented("audioAd:didFailToShowWithError:")
    public void didFailToShow(IMAudio audioAd, IMRequestStatus error) {}
    @NotImplemented("audioAdImpressed:")
    public void audioAdImpressed(IMAudio audioAd) {}
    @NotImplemented("audioAd:didInteractWithParams:")
    public void didInteract(IMAudio audioAd, NSDictionary<NSString, ?> params) {}
    @NotImplemented("audioAdWillPresentScreen:")
    public void audioAdWillPresentScreen(IMAudio audioAd) {}
    @NotImplemented("audioAdDidPresentScreen:")
    public void audioAdDidPresentScreen(IMAudio audioAd) {}
    @NotImplemented("audioAdWillDismissScreen:")
    public void audioAdWillDismissScreen(IMAudio audioAd) {}
    @NotImplemented("audioAdDidDismissScreen:")
    public void audioAdDidDismissScreen(IMAudio audioAd) {}
    @NotImplemented("userWillLeaveApplicationFromAudioAd:")
    public void userWillLeaveApplicationFromAudioAd(IMAudio audioAd) {}
    @NotImplemented("audioAd:rewardActionCompletedWithRewards:")
    public void rewardActionCompleted(IMAudio audioAd, NSDictionary<NSString, ?> rewards) {}
    @NotImplemented("audioAd:audioStatusChanged:")
    public void audioStatusChanged(IMAudio audioAd, IMAudioStatus status) {}
    /*</methods>*/
}
