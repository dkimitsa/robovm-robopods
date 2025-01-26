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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MAAdapter/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "SDKVersion")
    String getSDKVersion();
    @Property(selector = "adapterVersion")
    String getAdapterVersion();
    @Property(selector = "isBeta")
    boolean isBeta();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "initializeWithParameters:withCompletionHandler:")
    void initialize(MAAdapterInitializationParameters parameters, @Block Runnable completionHandler);
    @Method(selector = "shouldInitializeOnMainThread")
    NSNumber shouldInitializeOnMainThread();
    @Method(selector = "shouldCollectSignalsOnMainThread")
    NSNumber shouldCollectSignalsOnMainThread();
    @Method(selector = "shouldLoadAdsOnMainThreadForAdFormat:")
    NSNumber shouldLoadAdsOnMainThreadForAdFormat(MAAdFormat adFormat);
    @Method(selector = "shouldShowAdsOnMainThreadForAdFormat:")
    NSNumber shouldShowAdsOnMainThreadForAdFormat(MAAdFormat adFormat);
    @Method(selector = "shouldDestroyOnMainThread")
    NSNumber shouldDestroyOnMainThread();
    @Method(selector = "destroy")
    void destroy();
    @Method(selector = "initializeWithParameters:completionHandler:")
    void initialize(MAAdapterInitializationParameters parameters, @Block VoidBlock2<MAAdapterInitializationStatus, NSString> completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
