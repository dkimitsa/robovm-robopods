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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBRewardedVideoAdDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBRewardedVideoAdDelegate/*</implements>*/ {

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
    @NotImplemented("rewardedVideoAdDidClick:")
    public void didClick(FBRewardedVideoAd rewardedVideoAd) {}
    @NotImplemented("rewardedVideoAdDidLoad:")
    public void didLoad(FBRewardedVideoAd rewardedVideoAd) {}
    @NotImplemented("rewardedVideoAdDidClose:")
    public void didClose(FBRewardedVideoAd rewardedVideoAd) {}
    @NotImplemented("rewardedVideoAdWillClose:")
    public void willClose(FBRewardedVideoAd rewardedVideoAd) {}
    @NotImplemented("rewardedVideoAd:didFailWithError:")
    public void didFail(FBRewardedVideoAd rewardedVideoAd, NSError error) {}
    @NotImplemented("rewardedVideoAdVideoComplete:")
    public void videoComplete(FBRewardedVideoAd rewardedVideoAd) {}
    @NotImplemented("rewardedVideoAdWillLogImpression:")
    public void willLogImpression(FBRewardedVideoAd rewardedVideoAd) {}
    /**
     * @deprecated Functionality has been deprecated. This delegate method will not be called.
     */
    @Deprecated
    @NotImplemented("rewardedVideoAdServerRewardDidSucceed:")
    public void serverRewardDidSucceed(FBRewardedVideoAd rewardedVideoAd) {}
    /**
     * @deprecated Functionality has been deprecated. This delegate method will not be called.
     */
    @Deprecated
    @NotImplemented("rewardedVideoAdServerRewardDidFail:")
    public void serverRewardDidFail(FBRewardedVideoAd rewardedVideoAd) {}
    @NotImplemented("rewardedVideoAdCompanionViewProvider:")
    public void companionViewProvider(@Block VoidBlock1<FBAdCompanionView> completion) {}
    /*</methods>*/
}
