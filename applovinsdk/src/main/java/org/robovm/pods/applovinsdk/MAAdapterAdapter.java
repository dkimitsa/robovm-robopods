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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdapterAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MAAdapter/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("SDKVersion")
    public String getSDKVersion() { return null; }
    @NotImplemented("adapterVersion")
    public String getAdapterVersion() { return null; }
    @NotImplemented("isBeta")
    public boolean isBeta() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("initializeWithParameters:withCompletionHandler:")
    public void initialize(MAAdapterInitializationParameters parameters, @Block Runnable completionHandler) {}
    @NotImplemented("shouldInitializeOnMainThread")
    public NSNumber shouldInitializeOnMainThread() { return null; }
    @NotImplemented("shouldCollectSignalsOnMainThread")
    public NSNumber shouldCollectSignalsOnMainThread() { return null; }
    @NotImplemented("shouldLoadAdsOnMainThreadForAdFormat:")
    public NSNumber shouldLoadAdsOnMainThreadForAdFormat(MAAdFormat adFormat) { return null; }
    @NotImplemented("shouldShowAdsOnMainThreadForAdFormat:")
    public NSNumber shouldShowAdsOnMainThreadForAdFormat(MAAdFormat adFormat) { return null; }
    @NotImplemented("shouldDestroyOnMainThread")
    public NSNumber shouldDestroyOnMainThread() { return null; }
    @NotImplemented("destroy")
    public void destroy() {}
    @NotImplemented("initializeWithParameters:completionHandler:")
    public void initialize(MAAdapterInitializationParameters parameters, @Block VoidBlock2<MAAdapterInitializationStatus, NSString> completionHandler) {}
    /*</methods>*/
}
